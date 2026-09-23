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

public class SimplexTableau_writeObject_58171007162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53075;

    public SimplexTableau_writeObject_58171007162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53075 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term53075, term53075.getClass(), "f", null);
        setField(term53075, term53075.getClass(), "constraints", null);
        setBooleanField(term53075, term53075.getClass(), "restrictToNonNegative", false);
        setField(term53075, term53075.getClass(), "tableau", null);
        setIntField(term53075, term53075.getClass(), "numDecisionVariables", 0);
        setIntField(term53075, term53075.getClass(), "numSlackVariables", 0);
        setIntField(term53075, term53075.getClass(), "numArtificialVariables", 0);
        setDoubleField(term53075, term53075.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.ObjectOutputStream");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "writeObject", argTypes, term53075, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


