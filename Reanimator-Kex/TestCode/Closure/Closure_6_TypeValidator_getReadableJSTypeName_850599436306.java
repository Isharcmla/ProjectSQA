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

public class TypeValidator_getReadableJSTypeName_850599436306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99181;
     Object term99377;

    public TypeValidator_getReadableJSTypeName_850599436306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99181 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term99285 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term99181, term99181.getClass(), "typeRegistry", term99285);
        term99377 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term99469 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term99377, term99377.getClass(), "type", 33);
        setField(term99469, term99469.getClass(), "jsType", null);
        setField(term99377, term99377.getClass(), "first", term99469);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term99377;
        args[1] = false;
        callMethod(klass, "getReadableJSTypeName", argTypes, term99181, args);
    }

};


