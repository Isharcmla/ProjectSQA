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
import java.util.ArrayList;
import java.lang.Object;

public class SimplexTableau_initializeColumnLabels_1346305290179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99114;

    public SimplexTableau_initializeColumnLabels_1346305290179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term99166 = new ArrayList();
        term99114 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term99306 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        Object term99398 = newInstance(Class.forName("org.apache.commons.math.linear.RealVector$2"));
        Object term99490 = newInstance(Class.forName("org.apache.commons.math.linear.RealVector$2"));
        Object term99582 = newInstance(Class.forName("org.apache.commons.math.linear.RealVector$2"));
        setIntField(term99114, term99114.getClass(), "numArtificialVariables", 1);
        setField(term99114, term99114.getClass(), "columnLabels", term99166);
        setField(term99490, term99490.getClass(), "val$v", term99582);
        setField(term99398, term99398.getClass(), "val$v", term99490);
        setField(term99306, term99306.getClass(), "coefficients", term99398);
        setField(term99114, term99114.getClass(), "f", term99306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "initializeColumnLabels", argTypes, term99114, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


