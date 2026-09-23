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

public class TypeValidator_getReadableJSTypeName_850599436300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92552;
     Object term92644;

    public TypeValidator_getReadableJSTypeName_850599436300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92552 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term92644 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term92758 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setIntField(term92644, term92644.getClass(), "type", 0);
        setField(term92758, term92758.getClass(), "ownerFunction", null);
        setField(term92758, term92758.getClass(), "className", null);
        setBooleanField(term92758, term92758.getClass(), "prettyPrint", true);
        setField(term92644, term92644.getClass(), "jsType", term92758);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term92644;
        args[1] = true;
        callMethod(klass, "getReadableJSTypeName", argTypes, term92552, args);
    }

};


