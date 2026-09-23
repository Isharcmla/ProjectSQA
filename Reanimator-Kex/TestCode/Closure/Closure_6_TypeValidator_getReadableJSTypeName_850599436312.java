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

public class TypeValidator_getReadableJSTypeName_850599436312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103792;
     Object term103862;

    public TypeValidator_getReadableJSTypeName_850599436312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103792 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term103862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103974 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        Object term104074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term104174 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setIntField(term103862, term103862.getClass(), "type", 0);
        setField(term103974, term103974.getClass(), "ownerFunction", term104074);
        setField(term103974, term103974.getClass(), "constructor", term104174);
        setField(term103862, term103862.getClass(), "jsType", term103974);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term103862;
        args[1] = true;
        callMethod(klass, "getReadableJSTypeName", argTypes, term103792, args);
    }

};


