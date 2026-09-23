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
import java.lang.NullPointerException;
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexSolver_doIteration_51255937413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2154;
     Object term2177;

    public SimplexSolver_doIteration_51255937413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2160 = new ArrayList();
        Class<? extends Object> term10509 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term10508 = ((Class) term10509).getDeclaredField((String) "MAXIMIZE");
        ((Field) term10508).setAccessible(true);
        Object enum31 = ((Field) term10508).get((Object) null);
        term2154 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        Object term2158 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setDoubleField(term2154, term2154.getClass(), "epsilon", 1.0E-6);
        setIntField(term2154, term2154.getClass(), "maxIterations", 100);
        setIntField(term2154, term2154.getClass(), "iterations", -1339778481);
        setField(term2158, term2158.getClass(), "coefficients", null);
        setDoubleField(term2158, term2158.getClass(), "constantTerm", 0.8598297828918529);
        setField(term2154, term2154.getClass(), "f", term2158);
        setField(term2154, term2154.getClass(), "constraints", term2160);
        setField(term2154, term2154.getClass(), "goalType", enum31);
        setBooleanField(term2154, term2154.getClass(), "restrictToNonNegative", true);
        Class<? extends Object> term10765 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term10764 = ((Class) term10765).getDeclaredField((String) "LEQ");
        ((Field) term10764).setAccessible(true);
        Object enum32 = ((Field) term10764).get((Object) null);
        Object term2182 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2182, term2182.getClass(), "coefficients", null);
        setField(term2182, term2182.getClass(), "relationship", enum32);
        setDoubleField(term2182, term2182.getClass(), "value", 0.7633268466829064);
        Class<? extends Object> term11061 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term11060 = ((Class) term11061).getDeclaredField((String) "EQ");
        ((Field) term11060).setAccessible(true);
        Object enum33 = ((Field) term11060).get((Object) null);
        Object term2186 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2186, term2186.getClass(), "coefficients", null);
        setField(term2186, term2186.getClass(), "relationship", enum33);
        setDoubleField(term2186, term2186.getClass(), "value", 0.13481025392611334);
        Object term2190 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2190, term2190.getClass(), "coefficients", null);
        setField(term2190, term2190.getClass(), "relationship", enum33);
        setDoubleField(term2190, term2190.getClass(), "value", 0.3800088629986428);
        Class<? extends Object> term11354 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term11353 = ((Class) term11354).getDeclaredField((String) "GEQ");
        ((Field) term11353).setAccessible(true);
        Object enum34 = ((Field) term11353).get((Object) null);
        Object term2192 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2192, term2192.getClass(), "coefficients", null);
        setField(term2192, term2192.getClass(), "relationship", enum34);
        setDoubleField(term2192, term2192.getClass(), "value", 0.5840714198152577);
        Object term2196 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2196, term2196.getClass(), "coefficients", null);
        setField(term2196, term2196.getClass(), "relationship", enum34);
        setDoubleField(term2196, term2196.getClass(), "value", 0.7559240768573477);
        Object term2198 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2198, term2198.getClass(), "coefficients", null);
        setField(term2198, term2198.getClass(), "relationship", enum33);
        setDoubleField(term2198, term2198.getClass(), "value", 0.10667076642995188);
        Object term2200 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2200, term2200.getClass(), "coefficients", null);
        setField(term2200, term2200.getClass(), "relationship", enum33);
        setDoubleField(term2200, term2200.getClass(), "value", 0.11493000848982304);
        Object term2202 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2202, term2202.getClass(), "coefficients", null);
        setField(term2202, term2202.getClass(), "relationship", null);
        setDoubleField(term2202, term2202.getClass(), "value", 0.0);
        Object term2204 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term2204, term2204.getClass(), "coefficients", null);
        setField(term2204, term2204.getClass(), "relationship", null);
        setDoubleField(term2204, term2204.getClass(), "value", 0.0);
        ArrayList term2180 = new ArrayList();
        ((ArrayList) term2180).add(term2182);
        ((ArrayList) term2180).add(term2186);
        ((ArrayList) term2180).add(term2190);
        ((ArrayList) term2180).add(term2192);
        ((ArrayList) term2180).add(term2196);
        ((ArrayList) term2180).add(term2198);
        ((ArrayList) term2180).add(term2200);
        ((ArrayList) term2180).add(term2202);
        ((ArrayList) term2180).add(term2204);
        term2177 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term2178 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term2178, term2178.getClass(), "coefficients", null);
        setDoubleField(term2178, term2178.getClass(), "constantTerm", 0.43692187681405226);
        setField(term2177, term2177.getClass(), "f", term2178);
        setField(term2177, term2177.getClass(), "constraints", term2180);
        setBooleanField(term2177, term2177.getClass(), "restrictToNonNegative", true);
        setField(term2177, term2177.getClass(), "tableau", null);
        setIntField(term2177, term2177.getClass(), "numDecisionVariables", 0);
        setIntField(term2177, term2177.getClass(), "numSlackVariables", 0);
        setIntField(term2177, term2177.getClass(), "numArtificialVariables", 0);
        setDoubleField(term2177, term2177.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term2177;
        try {
            callMethod(klass, "doIteration", argTypes, term2154, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


