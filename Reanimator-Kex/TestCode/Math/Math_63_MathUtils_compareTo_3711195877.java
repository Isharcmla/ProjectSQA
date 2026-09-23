package org.apache.commons.math.util;

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
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.util.EqualityUtils.*;
import java.lang.Double;

public class MathUtils_compareTo_3711195877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29;
     Object term31;
     Object term33;

    public MathUtils_compareTo_3711195877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29 = new Double(0.13238746331190498);
        term31 = new Double(0.3455959125047594);
        term33 = new Double(0.5523635872663106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term29;
        args[1] = term31;
        args[2] = term33;
        Object retValue = callMethod(klass, "compareTo", argTypes, null, args);
        assertTrue(recursiveEquals(term29, 0.13238746331190498));
        assertTrue(recursiveEquals(term31, 0.3455959125047594));
        assertTrue(recursiveEquals(term33, 0.5523635872663106));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


