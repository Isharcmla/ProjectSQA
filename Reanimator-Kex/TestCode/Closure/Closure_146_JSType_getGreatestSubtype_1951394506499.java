package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JSType_getGreatestSubtype_1951394506499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135151;
     Object term135367;

    public JSType_getGreatestSubtype_1951394506499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135151 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term135269 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setBooleanField(term135269, term135269.getClass(), "unknown", false);
        setField(term135269, term135269.getClass(), "implicitPrototype", null);
        setField(term135151, term135151.getClass(), "referencedType", term135269);
        term135367 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term135463 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term135367, term135367.getClass(), "referencedType", term135463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term135151;
        args[1] = term135367;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


