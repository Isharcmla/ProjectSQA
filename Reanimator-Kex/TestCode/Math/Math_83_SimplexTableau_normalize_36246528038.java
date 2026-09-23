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

public class SimplexTableau_normalize_36246528038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2771;
     Object term2805;
     Object term34196;
     Object term34214;
     Object term34164;

    public SimplexTableau_normalize_36246528038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34221 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term34220 = ((Class) term34221).getDeclaredField((String) "LEQ");
        ((Field) term34220).setAccessible(true);
        Object enum82 = ((Field) term34220).get((Object) null);
        Object term2776 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2776, term2776.getClass(), "coefficients", null);
        setField(term2776, term2776.getClass(), "relationship", enum82);
        setDoubleField(term2776, term2776.getClass(), "value", 0.7633268466829064);
        Object term2780 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2780, term2780.getClass(), "coefficients", null);
        setField(term2780, term2780.getClass(), "relationship", enum82);
        setDoubleField(term2780, term2780.getClass(), "value", 0.13481025392611334);
        Class<? extends Object> term34517 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term34516 = ((Class) term34517).getDeclaredField((String) "LEQ");
        ((Field) term34516).setAccessible(true);
        Object enum83 = ((Field) term34516).get((Object) null);
        Object term2782 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2782, term2782.getClass(), "coefficients", null);
        setField(term2782, term2782.getClass(), "relationship", enum83);
        setDoubleField(term2782, term2782.getClass(), "value", 0.3800088629986428);
        Object term2786 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2786, term2786.getClass(), "coefficients", null);
        setField(term2786, term2786.getClass(), "relationship", enum83);
        setDoubleField(term2786, term2786.getClass(), "value", 0.5840714198152577);
        Object term2788 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2788, term2788.getClass(), "coefficients", null);
        setField(term2788, term2788.getClass(), "relationship", enum82);
        setDoubleField(term2788, term2788.getClass(), "value", 0.7559240768573477);
        Object term2790 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2790, term2790.getClass(), "coefficients", null);
        setField(term2790, term2790.getClass(), "relationship", enum82);
        setDoubleField(term2790, term2790.getClass(), "value", 0.10667076642995188);
        Object term2792 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2792, term2792.getClass(), "coefficients", null);
        setField(term2792, term2792.getClass(), "relationship", enum83);
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
        setField(term2805, term2805.getClass(), "relationship", enum83);
        setDoubleField(term2805, term2805.getClass(), "value", 0.37161417339133307);
        Class<? extends Object> term34815 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term34814 = ((Class) term34815).getDeclaredField((String) "EQ");
        ((Field) term34814).setAccessible(true);
        Object enum84 = ((Field) term34814).get((Object) null);
        Object term34200 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term34200, term34200.getClass(), "coefficients", null);
        setField(term34200, term34200.getClass(), "relationship", enum84);
        setDoubleField(term34200, term34200.getClass(), "value", 0.7633268466829064);
        Object term34206 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term34206, term34206.getClass(), "coefficients", null);
        setField(term34206, term34206.getClass(), "relationship", enum84);
        setDoubleField(term34206, term34206.getClass(), "value", 0.13481025392611334);
        Object term34207 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term34207, term34207.getClass(), "coefficients", null);
        setField(term34207, term34207.getClass(), "relationship", enum84);
        setDoubleField(term34207, term34207.getClass(), "value", 0.3800088629986428);
        Object term34208 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term34208, term34208.getClass(), "coefficients", null);
        setField(term34208, term34208.getClass(), "relationship", enum84);
        setDoubleField(term34208, term34208.getClass(), "value", 0.5840714198152577);
        Object term34209 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term34209, term34209.getClass(), "coefficients", null);
        setField(term34209, term34209.getClass(), "relationship", enum84);
        setDoubleField(term34209, term34209.getClass(), "value", 0.7559240768573477);
        Object term34210 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term34210, term34210.getClass(), "coefficients", null);
        setField(term34210, term34210.getClass(), "relationship", enum84);
        setDoubleField(term34210, term34210.getClass(), "value", 0.10667076642995188);
        Object term34211 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term34211, term34211.getClass(), "coefficients", null);
        setField(term34211, term34211.getClass(), "relationship", enum84);
        setDoubleField(term34211, term34211.getClass(), "value", 0.11493000848982304);
        Object term34212 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term34212, term34212.getClass(), "coefficients", null);
        setField(term34212, term34212.getClass(), "relationship", null);
        setDoubleField(term34212, term34212.getClass(), "value", 0.0);
        Object term34213 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term34213, term34213.getClass(), "coefficients", null);
        setField(term34213, term34213.getClass(), "relationship", null);
        setDoubleField(term34213, term34213.getClass(), "value", 0.0);
        ArrayList term34198 = new ArrayList();
        ((ArrayList) term34198).add(term34200);
        ((ArrayList) term34198).add(term34206);
        ((ArrayList) term34198).add(term34207);
        ((ArrayList) term34198).add(term34208);
        ((ArrayList) term34198).add(term34209);
        ((ArrayList) term34198).add(term34210);
        ((ArrayList) term34198).add(term34211);
        ((ArrayList) term34198).add(term34212);
        ((ArrayList) term34198).add(term34213);
        term34196 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term34197 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term34197, term34197.getClass(), "coefficients", null);
        setDoubleField(term34197, term34197.getClass(), "constantTerm", 0.43692187681405226);
        setField(term34196, term34196.getClass(), "f", term34197);
        setField(term34196, term34196.getClass(), "constraints", term34198);
        setBooleanField(term34196, term34196.getClass(), "restrictToNonNegative", true);
        setField(term34196, term34196.getClass(), "tableau", null);
        setIntField(term34196, term34196.getClass(), "numDecisionVariables", 0);
        setIntField(term34196, term34196.getClass(), "numSlackVariables", 0);
        setIntField(term34196, term34196.getClass(), "numArtificialVariables", 0);
        setDoubleField(term34196, term34196.getClass(), "epsilon", 0.0);
        Class<? extends Object> term35128 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term35127 = ((Class) term35128).getDeclaredField((String) "EQ");
        ((Field) term35127).setAccessible(true);
        Object enum85 = ((Field) term35127).get((Object) null);
        term34214 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term34214, term34214.getClass(), "coefficients", null);
        setField(term34214, term34214.getClass(), "relationship", enum85);
        setDoubleField(term34214, term34214.getClass(), "value", 0.37161417339133307);
        Class<? extends Object> term35421 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term35420 = ((Class) term35421).getDeclaredField((String) "EQ");
        ((Field) term35420).setAccessible(true);
        Object enum86 = ((Field) term35420).get((Object) null);
        term34164 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term34164, term34164.getClass(), "coefficients", null);
        setField(term34164, term34164.getClass(), "relationship", enum86);
        setDoubleField(term34164, term34164.getClass(), "value", 0.37161417339133307);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint");
        Object[] args = new Object[1];
        args[0] = term2805;
        Object retValue = callMethod(klass, "normalize", argTypes, term2771, args);
        assertTrue(recursiveEquals(term2771, term34196));
        assertTrue(recursiveEquals(term2805, term34214));
        assertTrue(recursiveEquals(retValue, term34164));
    }

};


