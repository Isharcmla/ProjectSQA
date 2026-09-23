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
import java.lang.Integer;

public class SimplexTableau_getBasicRowForSolution_102849282944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5240;
     Object term5252;

    public SimplexTableau_getBasicRowForSolution_102849282944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5243 = new ArrayList();
        term5240 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term5241 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term5241, term5241.getClass(), "coefficients", null);
        setDoubleField(term5241, term5241.getClass(), "constantTerm", 0.8823181080774973);
        setField(term5240, term5240.getClass(), "f", term5241);
        setField(term5240, term5240.getClass(), "constraints", term5243);
        setBooleanField(term5240, term5240.getClass(), "restrictToNonNegative", true);
        setField(term5240, term5240.getClass(), "tableau", null);
        setIntField(term5240, term5240.getClass(), "numDecisionVariables", -2068769794);
        setIntField(term5240, term5240.getClass(), "numSlackVariables", -117576464);
        setIntField(term5240, term5240.getClass(), "numArtificialVariables", -1007160944);
        setDoubleField(term5240, term5240.getClass(), "epsilon", 0.2192450926212024);
        term5252 = new Integer(1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5252;
        try {
            callMethod(klass, "getBasicRowForSolution", argTypes, term5240, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


