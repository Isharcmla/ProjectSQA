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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeValidator_getReadableJSTypeName_850599436362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137569;
     Object term137655;

    public TypeValidator_getReadableJSTypeName_850599436362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137569 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term137655 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term137745 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term137841 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term137927 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term137655, term137655.getClass(), "type", 33);
        setField(term137745, term137745.getClass(), "jsType", term137841);
        setField(term137655, term137655.getClass(), "first", term137745);
        setField(term137655, term137655.getClass(), "last", term137927);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term137655;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term137569, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


