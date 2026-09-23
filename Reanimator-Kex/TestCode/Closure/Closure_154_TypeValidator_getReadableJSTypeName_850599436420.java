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

public class TypeValidator_getReadableJSTypeName_850599436420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197822;
     Object term197908;

    public TypeValidator_getReadableJSTypeName_850599436420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197822 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term197908 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term197994 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term198108 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term198200 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term197908, term197908.getClass(), "type", 33);
        setField(term197994, term197994.getClass(), "jsType", term198108);
        setField(term197908, term197908.getClass(), "first", term197994);
        setField(term197908, term197908.getClass(), "last", term198200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term197908;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term197822, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


