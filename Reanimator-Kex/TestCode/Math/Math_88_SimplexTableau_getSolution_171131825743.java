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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_getSolution_171131825743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5896;

    public SimplexTableau_getSolution_171131825743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38177 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term38176 = ((Class) term38177).getDeclaredField((String) "GEQ");
        ((Field) term38176).setAccessible(true);
        Object enum95 = ((Field) term38176).get((Object) null);
        Object term5901 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term5901, term5901.getClass(), "coefficients", null);
        setField(term5901, term5901.getClass(), "relationship", enum95);
        setDoubleField(term5901, term5901.getClass(), "value", 0.025133051616627267);
        ArrayList term5899 = new ArrayList();
        ((ArrayList) term5899).add(term5901);
        term5896 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term5897 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term5897, term5897.getClass(), "coefficients", null);
        setDoubleField(term5897, term5897.getClass(), "constantTerm", 0.022483645678509023);
        setField(term5896, term5896.getClass(), "f", term5897);
        setField(term5896, term5896.getClass(), "constraints", term5899);
        setBooleanField(term5896, term5896.getClass(), "restrictToNonNegative", true);
        setField(term5896, term5896.getClass(), "tableau", null);
        setIntField(term5896, term5896.getClass(), "numDecisionVariables", -244121226);
        setIntField(term5896, term5896.getClass(), "numSlackVariables", -203030934);
        setIntField(term5896, term5896.getClass(), "numArtificialVariables", -1179120542);
        setDoubleField(term5896, term5896.getClass(), "epsilon", 0.016575281023182953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getSolution", argTypes, term5896, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


