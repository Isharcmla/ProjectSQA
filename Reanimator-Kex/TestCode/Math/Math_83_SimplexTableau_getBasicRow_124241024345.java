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
import java.lang.Integer;
import java.lang.Boolean;

public class SimplexTableau_getBasicRow_124241024345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5254;
     Object term5274;
     Object term5276;

    public SimplexTableau_getBasicRow_124241024345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40082 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term40081 = ((Class) term40082).getDeclaredField((String) "EQ");
        ((Field) term40081).setAccessible(true);
        Object enum98 = ((Field) term40081).get((Object) null);
        Object term5259 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term5259, term5259.getClass(), "coefficients", null);
        setField(term5259, term5259.getClass(), "relationship", enum98);
        setDoubleField(term5259, term5259.getClass(), "value", 0.791695029600875);
        Class<? extends Object> term40375 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term40374 = ((Class) term40375).getDeclaredField((String) "LEQ");
        ((Field) term40374).setAccessible(true);
        Object enum99 = ((Field) term40374).get((Object) null);
        Object term5263 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term5263, term5263.getClass(), "coefficients", null);
        setField(term5263, term5263.getClass(), "relationship", enum99);
        setDoubleField(term5263, term5263.getClass(), "value", 0.6862221294683138);
        ArrayList term5257 = new ArrayList();
        ((ArrayList) term5257).add(term5259);
        ((ArrayList) term5257).add(term5263);
        term5254 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term5255 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term5255, term5255.getClass(), "coefficients", null);
        setDoubleField(term5255, term5255.getClass(), "constantTerm", 0.7591353014991907);
        setField(term5254, term5254.getClass(), "f", term5255);
        setField(term5254, term5254.getClass(), "constraints", term5257);
        setBooleanField(term5254, term5254.getClass(), "restrictToNonNegative", false);
        setField(term5254, term5254.getClass(), "tableau", null);
        setIntField(term5254, term5254.getClass(), "numDecisionVariables", 590364439);
        setIntField(term5254, term5254.getClass(), "numSlackVariables", 865208305);
        setIntField(term5254, term5254.getClass(), "numArtificialVariables", -1275173084);
        setDoubleField(term5254, term5254.getClass(), "epsilon", 0.15917839663695388);
        term5274 = new Integer(-244121226);
        term5276 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term5274;
        args[1] = term5276;
        try {
            callMethod(klass, "getBasicRow", argTypes, term5254, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


