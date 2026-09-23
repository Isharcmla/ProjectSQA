package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Double;

public class IR_number_1841289582131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2309;
     Object term16525;

    public IR_number_1841289582131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2309 = new Double(0.13238746331190498);
        term16525 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term16525, term16525.getClass(), "number", 0.13238746331190498);
        setIntField(term16525, term16525.getClass(), "type", 39);
        setField(term16525, term16525.getClass(), "next", null);
        setField(term16525, term16525.getClass(), "first", null);
        setField(term16525, term16525.getClass(), "last", null);
        setField(term16525, term16525.getClass(), "propListHead", null);
        setIntField(term16525, term16525.getClass(), "sourcePosition", -1);
        setField(term16525, term16525.getClass(), "jsType", null);
        setField(term16525, term16525.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term2309;
        Object retValue = callMethod(klass, "number", argTypes, null, args);
        assertTrue(recursiveEquals(term2309, 0.13238746331190498));
        assertTrue(recursiveEquals(retValue, term16525));
    }

};


