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

public class TypeValidator_getReadableJSTypeName_850599436336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121867;
     Object term121953;

    public TypeValidator_getReadableJSTypeName_850599436336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121867 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term121953 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term122039 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term122163 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term122255 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term121953, term121953.getClass(), "type", 33);
        setField(term122039, term122039.getClass(), "jsType", term122163);
        setField(term121953, term121953.getClass(), "first", term122039);
        setField(term121953, term121953.getClass(), "last", term122255);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term121953;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term121867, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


