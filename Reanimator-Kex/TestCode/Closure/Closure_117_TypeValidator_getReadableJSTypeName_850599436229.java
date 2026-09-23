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

public class TypeValidator_getReadableJSTypeName_850599436229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83355;
     Object term83425;

    public TypeValidator_getReadableJSTypeName_850599436229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83355 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term83425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83525 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setIntField(term83425, term83425.getClass(), "type", -34);
        setField(term83425, term83425.getClass(), "jsType", term83525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term83425;
        args[1] = false;
        callMethod(klass, "getReadableJSTypeName", argTypes, term83355, args);
    }

};


