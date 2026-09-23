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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeValidator_getReadableJSTypeName_850599436296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91218;
     Object term91310;

    public TypeValidator_getReadableJSTypeName_850599436296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91218 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term91310 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term91402 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term91510 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setIntField(term91310, term91310.getClass(), "type", 0);
        setField(term91402, term91402.getClass(), "ownerFunction", term91510);
        setField(term91402, term91402.getClass(), "className", null);
        setField(term91310, term91310.getClass(), "jsType", term91402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term91310;
        args[1] = true;
        callMethod(klass, "getReadableJSTypeName", argTypes, term91218, args);
    }

};


