package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TypeValidator_mismatch_1145070107251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71091;
     Object term71181;
     Object term71251;
     Object term71349;
     Object term71455;

    public TypeValidator_mismatch_1145070107251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71091 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term71181 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term71181, term71181.getClass(), "sourceName", null);
        term71251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term71349 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        term71455 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[5];
        args[0] = term71181;
        args[1] = term71251;
        args[2] = null;
        args[3] = term71349;
        args[4] = term71455;
        try {
            callMethod(klass, "mismatch", argTypes, term71091, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


