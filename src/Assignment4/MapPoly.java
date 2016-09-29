/*
 * MapPoly:  Liskov's Poly class, converted to a Map rep.
 * Notes:
 *   0) Engineered for Homework 4, 2016; hence not a model implementation
 */
import java.util.*;

public class MapPoly {

    // Polys are immutable polynomials with integer coefficients
    // A typical Poly is c0 + c1x + c2x^2 + ...
    // NOTE For Homework 4, 2016: There *is* an expected order to the terms of a polynomial.

    private Map<Integer, Integer> trms;   // WAS TreeMap IN THE IN-CLASS EXERCISES
    
    // Rep invariant 
    //	TreeMap assumption, i.e map entries are stored in increasing order of exponents
    //	For every Entry, the Value is >= 0. In an Abstract view, the exponent is >= 0.
    
    // Effects: Initializes this to be the zero polynomial
    public MapPoly() {
       this(0,0);
    }

    
    // Effects: If n < 0 throws IllegalArgumentException
    // else initializes this to be the polynomial c*x^n
    public MapPoly(int c, int n) throws IllegalArgumentException {
       if (n < 0) {
          throw new IllegalArgumentException("MapPoly(int, int) constructor");
       }
       //trms = new TreeMap<Integer, Integer> ();
       trms = new HashMap<Integer, Integer> ();
       if (c != 0) { trms.put(n, c); }
    }

    // Effects: returns the degree of this
    public int degree() {
    	   int degree  = 0;
    	   if (trms.size() > 0) {
    	     for (Map.Entry<Integer, Integer> entry : trms.entrySet())
    	    	 degree = entry.getKey();        	 
    	   }
    	   return degree;
    	}

    // Effects: returns the coefficent of the term of this whose exponent is d
    public int coeff(int d) {
       if (d < 0) throw new IllegalArgumentException("MapPoly.coeff");
       if (trms.containsKey(d)) return trms.get(d);
       return 0;
    }

    // Effects: If q is null throw NullPointerException
    // else return the MapPoly this - q
    public MapPoly sub(MapPoly q) {
       return add(q.minus());
    }

    // Effects: return the MapPoly -this
    public MapPoly minus() {
       MapPoly result = new MapPoly();
       for (Integer i : trms.keySet()) {
          result.trms.put (i, -trms.get(i));
       }
       return result;
    }

    // Effects: If q is null throw NullPointerException
    // else return the MapPoly this + q
    public MapPoly add(MapPoly q) {
       
       // find all the nonzero coefficients in either this or q
       Set<Integer> nonZero = new HashSet<Integer>(q.trms.keySet());
       nonZero.addAll(trms.keySet());

       // Add the coefficients together; store the nonzero results
       MapPoly result = new MapPoly();
       for (Integer i : nonZero) {
          int newCoeff = coeff(i) + q.coeff(i);
          if (newCoeff != 0) result.trms.put(i, newCoeff);
       }
       return result;
    }

    // Effects: If q is null throw NullPointerException
    // else return the MapPoly this * q
    public MapPoly mul(MapPoly q) {
       MapPoly result = new MapPoly();

       for (Integer i:  trms.keySet()) {
          for (Integer j:  q.trms.keySet()) {
              result = result.add(new MapPoly (coeff(i) * q.coeff(j), i*j));
          }
       }
       return result;
    }

    public String toString() {   
       String r = "MapPoly:";

       if (trms.size() == 0) {   // special case for empty Map
           r += " " + 0;
       }

       for (Integer i: trms.keySet()) {
          if (coeff(i) < 0) { r += " - " + -coeff(i) + "x^" + i; }
          else              { r += " + " +  coeff(i) + "x^" + i; }
       }
       return r;
    }
}
