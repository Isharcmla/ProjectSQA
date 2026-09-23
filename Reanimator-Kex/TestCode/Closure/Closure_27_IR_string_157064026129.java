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

public class IR_string_157064026129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16396;

    public IR_string_157064026129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16396 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term16396, term16396.getClass(), "str", "MuLcgQHgqz");
        setIntField(term16396, term16396.getClass(), "type", 40);
        setField(term16396, term16396.getClass(), "next", null);
        setField(term16396, term16396.getClass(), "first", null);
        setField(term16396, term16396.getClass(), "last", null);
        setField(term16396, term16396.getClass(), "propListHead", null);
        setIntField(term16396, term16396.getClass(), "sourcePosition", -1);
        setField(term16396, term16396.getClass(), "jsType", null);
        setField(term16396, term16396.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MuLcgQHgqz";
        Object retValue = callMethod(klass, "string", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term16396));
    }

};


