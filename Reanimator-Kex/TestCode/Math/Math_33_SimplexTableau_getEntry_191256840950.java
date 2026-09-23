package org.apache.commons.math3.optimization.linear;

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
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class SimplexTableau_getEntry_191256840950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10204;
     Object term10305;
     Object term10307;

    public SimplexTableau_getEntry_191256840950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10207 = new ArrayList();
        ArrayList term10212 = new ArrayList();
        ((ArrayList) term10212).add("UoYtihxVaS");
        ((ArrayList) term10212).add("JDswTTCZHV");
        ((ArrayList) term10212).add("onpbIeEKoi");
        ((ArrayList) term10212).add("YRHGsAkhxb");
        ((ArrayList) term10212).add("ffYhPOzlUs");
        ((ArrayList) term10212).add("MLqYREekMl");
        ((ArrayList) term10212).add("ytSBIKXogI");
        term10204 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term10205 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term10205, term10205.getClass(), "coefficients", null);
        setDoubleField(term10205, term10205.getClass(), "constantTerm", 0.39446728256884744);
        setField(term10204, term10204.getClass(), "f", term10205);
        setField(term10204, term10204.getClass(), "constraints", term10207);
        setBooleanField(term10204, term10204.getClass(), "restrictToNonNegative", true);
        setField(term10204, term10204.getClass(), "columnLabels", term10212);
        setField(term10204, term10204.getClass(), "tableau", null);
        setIntField(term10204, term10204.getClass(), "numDecisionVariables", 458147407);
        setIntField(term10204, term10204.getClass(), "numSlackVariables", -184153539);
        setIntField(term10204, term10204.getClass(), "numArtificialVariables", 493620644);
        setDoubleField(term10204, term10204.getClass(), "epsilon", 0.7865909711092062);
        setIntField(term10204, term10204.getClass(), "maxUlps", 1328271830);
        term10305 = new Integer(1596070772);
        term10307 = new Integer(97029295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term10305;
        args[1] = term10307;
        try {
            callMethod(klass, "getEntry", argTypes, term10204, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


