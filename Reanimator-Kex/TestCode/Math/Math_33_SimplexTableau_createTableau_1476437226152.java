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

public class SimplexTableau_createTableau_1476437226152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82846;

    public SimplexTableau_createTableau_1476437226152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term82898 = new ArrayList();
        term82846 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setIntField(term82846, term82846.getClass(), "numDecisionVariables", 0);
        setIntField(term82846, term82846.getClass(), "numSlackVariables", 0);
        setIntField(term82846, term82846.getClass(), "numArtificialVariables", 1);
        setField(term82846, term82846.getClass(), "constraints", term82898);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "createTableau", argTypes, term82846, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


