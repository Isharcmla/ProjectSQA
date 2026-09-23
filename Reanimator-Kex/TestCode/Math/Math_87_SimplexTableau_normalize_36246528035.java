package org.apache.commons.math.optimization.linear;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.optimization.linear.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_normalize_36246528035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2771;
     Object term2805;
     Object term30750;
     Object term30768;
     Object term30718;

    public SimplexTableau_normalize_36246528035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30775 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term30774 = ((Class) term30775).getDeclaredField((String) "LEQ");
        ((Field) term30774).setAccessible(true);
        Object enum75 = ((Field) term30774).get((Object) null);
        Object term2776 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2776, term2776.getClass(), "coefficients", null);
        setField(term2776, term2776.getClass(), "relationship", enum75);
        setDoubleField(term2776, term2776.getClass(), "value", 0.7633268466829064);
        Object term2780 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2780, term2780.getClass(), "coefficients", null);
        setField(term2780, term2780.getClass(), "relationship", enum75);
        setDoubleField(term2780, term2780.getClass(), "value", 0.13481025392611334);
        Class<? extends Object> term31071 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term31070 = ((Class) term31071).getDeclaredField((String) "LEQ");
        ((Field) term31070).setAccessible(true);
        Object enum76 = ((Field) term31070).get((Object) null);
        Object term2782 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2782, term2782.getClass(), "coefficients", null);
        setField(term2782, term2782.getClass(), "relationship", enum76);
        setDoubleField(term2782, term2782.getClass(), "value", 0.3800088629986428);
        Object term2786 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2786, term2786.getClass(), "coefficients", null);
        setField(term2786, term2786.getClass(), "relationship", enum76);
        setDoubleField(term2786, term2786.getClass(), "value", 0.5840714198152577);
        Object term2788 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2788, term2788.getClass(), "coefficients", null);
        setField(term2788, term2788.getClass(), "relationship", enum75);
        setDoubleField(term2788, term2788.getClass(), "value", 0.7559240768573477);
        Object term2790 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2790, term2790.getClass(), "coefficients", null);
        setField(term2790, term2790.getClass(), "relationship", enum75);
        setDoubleField(term2790, term2790.getClass(), "value", 0.10667076642995188);
        Object term2792 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2792, term2792.getClass(), "coefficients", null);
        setField(term2792, term2792.getClass(), "relationship", enum76);
        setDoubleField(term2792, term2792.getClass(), "value", 0.11493000848982304);
        Object term2794 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2794, term2794.getClass(), "coefficients", null);
        setField(term2794, term2794.getClass(), "relationship", null);
        setDoubleField(term2794, term2794.getClass(), "value", 0.0);
        Object term2796 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2796, term2796.getClass(), "coefficients", null);
        setField(term2796, term2796.getClass(), "relationship", null);
        setDoubleField(term2796, term2796.getClass(), "value", 0.0);
        ArrayList term2774 = new ArrayList();
        ((ArrayList) term2774).add(term2776);
        ((ArrayList) term2774).add(term2780);
        ((ArrayList) term2774).add(term2782);
        ((ArrayList) term2774).add(term2786);
        ((ArrayList) term2774).add(term2788);
        ((ArrayList) term2774).add(term2790);
        ((ArrayList) term2774).add(term2792);
        ((ArrayList) term2774).add(term2794);
        ((ArrayList) term2774).add(term2796);
        term2771 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term2772 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term2772, term2772.getClass(), "coefficients", null);
        setDoubleField(term2772, term2772.getClass(), "constantTerm", 0.43692187681405226);
        setField(term2771, term2771.getClass(), "f", term2772);
        setField(term2771, term2771.getClass(), "constraints", term2774);
        setBooleanField(term2771, term2771.getClass(), "restrictToNonNegative", true);
        setField(term2771, term2771.getClass(), "tableau", null);
        setIntField(term2771, term2771.getClass(), "numDecisionVariables", 0);
        setIntField(term2771, term2771.getClass(), "numSlackVariables", 0);
        setIntField(term2771, term2771.getClass(), "numArtificialVariables", 0);
        setDoubleField(term2771, term2771.getClass(), "epsilon", 0.0);
        term2805 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2805, term2805.getClass(), "coefficients", null);
        setField(term2805, term2805.getClass(), "relationship", enum76);
        setDoubleField(term2805, term2805.getClass(), "value", 0.37161417339133307);
        Class<? extends Object> term31367 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term31366 = ((Class) term31367).getDeclaredField((String) "EQ");
        ((Field) term31366).setAccessible(true);
        Object enum77 = ((Field) term31366).get((Object) null);
        Object term30754 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term30754, term30754.getClass(), "coefficients", null);
        setField(term30754, term30754.getClass(), "relationship", enum77);
        setDoubleField(term30754, term30754.getClass(), "value", 0.7633268466829064);
        Object term30760 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term30760, term30760.getClass(), "coefficients", null);
        setField(term30760, term30760.getClass(), "relationship", enum77);
        setDoubleField(term30760, term30760.getClass(), "value", 0.13481025392611334);
        Object term30761 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term30761, term30761.getClass(), "coefficients", null);
        setField(term30761, term30761.getClass(), "relationship", enum77);
        setDoubleField(term30761, term30761.getClass(), "value", 0.3800088629986428);
        Object term30762 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term30762, term30762.getClass(), "coefficients", null);
        setField(term30762, term30762.getClass(), "relationship", enum77);
        setDoubleField(term30762, term30762.getClass(), "value", 0.5840714198152577);
        Object term30763 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term30763, term30763.getClass(), "coefficients", null);
        setField(term30763, term30763.getClass(), "relationship", enum77);
        setDoubleField(term30763, term30763.getClass(), "value", 0.7559240768573477);
        Object term30764 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term30764, term30764.getClass(), "coefficients", null);
        setField(term30764, term30764.getClass(), "relationship", enum77);
        setDoubleField(term30764, term30764.getClass(), "value", 0.10667076642995188);
        Object term30765 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term30765, term30765.getClass(), "coefficients", null);
        setField(term30765, term30765.getClass(), "relationship", enum77);
        setDoubleField(term30765, term30765.getClass(), "value", 0.11493000848982304);
        Object term30766 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term30766, term30766.getClass(), "coefficients", null);
        setField(term30766, term30766.getClass(), "relationship", null);
        setDoubleField(term30766, term30766.getClass(), "value", 0.0);
        Object term30767 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term30767, term30767.getClass(), "coefficients", null);
        setField(term30767, term30767.getClass(), "relationship", null);
        setDoubleField(term30767, term30767.getClass(), "value", 0.0);
        ArrayList term30752 = new ArrayList();
        ((ArrayList) term30752).add(term30754);
        ((ArrayList) term30752).add(term30760);
        ((ArrayList) term30752).add(term30761);
        ((ArrayList) term30752).add(term30762);
        ((ArrayList) term30752).add(term30763);
        ((ArrayList) term30752).add(term30764);
        ((ArrayList) term30752).add(term30765);
        ((ArrayList) term30752).add(term30766);
        ((ArrayList) term30752).add(term30767);
        term30750 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term30751 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term30751, term30751.getClass(), "coefficients", null);
        setDoubleField(term30751, term30751.getClass(), "constantTerm", 0.43692187681405226);
        setField(term30750, term30750.getClass(), "f", term30751);
        setField(term30750, term30750.getClass(), "constraints", term30752);
        setBooleanField(term30750, term30750.getClass(), "restrictToNonNegative", true);
        setField(term30750, term30750.getClass(), "tableau", null);
        setIntField(term30750, term30750.getClass(), "numDecisionVariables", 0);
        setIntField(term30750, term30750.getClass(), "numSlackVariables", 0);
        setIntField(term30750, term30750.getClass(), "numArtificialVariables", 0);
        setDoubleField(term30750, term30750.getClass(), "epsilon", 0.0);
        Class<? extends Object> term31660 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term31659 = ((Class) term31660).getDeclaredField((String) "EQ");
        ((Field) term31659).setAccessible(true);
        Object enum78 = ((Field) term31659).get((Object) null);
        term30768 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term30768, term30768.getClass(), "coefficients", null);
        setField(term30768, term30768.getClass(), "relationship", enum78);
        setDoubleField(term30768, term30768.getClass(), "value", 0.37161417339133307);
        Class<? extends Object> term31953 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term31952 = ((Class) term31953).getDeclaredField((String) "EQ");
        ((Field) term31952).setAccessible(true);
        Object enum79 = ((Field) term31952).get((Object) null);
        term30718 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term30718, term30718.getClass(), "coefficients", null);
        setField(term30718, term30718.getClass(), "relationship", enum79);
        setDoubleField(term30718, term30718.getClass(), "value", 0.37161417339133307);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint");
        Object[] args = new Object[1];
        args[0] = term2805;
        Object retValue = callMethod(klass, "normalize", argTypes, term2771, args);
        assertTrue(recursiveEquals(term2771, term30750));
        assertTrue(recursiveEquals(term2805, term30768));
        assertTrue(recursiveEquals(retValue, term30718));
    }

};


