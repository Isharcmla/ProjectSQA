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
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optimization.linear.EqualityUtils.*;
import java.lang.Object;

public class SimplexTableau_divideRow_363104382201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118081;
     Object term118210;

    public SimplexTableau_divideRow_363104382201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118081 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term118191 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        Object[] term117944 = (Object[]) newArray("[D", 498);
        setField(term118191, term118191.getClass(), "data", term117944);
        setField(term118081, term118081.getClass(), "tableau", term118191);
        term118210 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term118211 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        Object[] term118212 = (Object[]) newArray("[D", 498);
        setField(term118210, term118210.getClass(), "f", null);
        setField(term118210, term118210.getClass(), "constraints", null);
        setBooleanField(term118210, term118210.getClass(), "restrictToNonNegative", false);
        setField(term118210, term118210.getClass(), "columnLabels", null);
        setField(term118211, term118211.getClass(), "data", term118212);
        setField(term118210, term118210.getClass(), "tableau", term118211);
        setIntField(term118210, term118210.getClass(), "numDecisionVariables", 0);
        setIntField(term118210, term118210.getClass(), "numSlackVariables", 0);
        setIntField(term118210, term118210.getClass(), "numArtificialVariables", 0);
        setDoubleField(term118210, term118210.getClass(), "epsilon", 0.0);
        setIntField(term118210, term118210.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = 0.0;
        callMethod(klass, "divideRow", argTypes, term118081, args);
        assertTrue(recursiveEquals(term118081, term118210));
    }

};


