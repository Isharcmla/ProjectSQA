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
import java.util.ArrayList;
import java.lang.Object;

public class SimplexTableau_createTableau_1476437226193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103092;

    public SimplexTableau_createTableau_1476437226193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term103182 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term103144 = new ArrayList();
        ((ArrayList) term103144).add(term103182);
        term103092 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setIntField(term103092, term103092.getClass(), "numDecisionVariables", 0);
        setIntField(term103092, term103092.getClass(), "numSlackVariables", 0);
        setIntField(term103092, term103092.getClass(), "numArtificialVariables", 1);
        setField(term103092, term103092.getClass(), "constraints", term103144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "createTableau", argTypes, term103092, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


