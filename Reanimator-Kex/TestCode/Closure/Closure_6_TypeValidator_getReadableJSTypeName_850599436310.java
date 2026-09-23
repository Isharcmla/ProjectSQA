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

public class TypeValidator_getReadableJSTypeName_850599436310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102687;
     Object term102757;

    public TypeValidator_getReadableJSTypeName_850599436310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102687 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term102757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102869 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        Object term102979 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term102757, term102757.getClass(), "type", 0);
        setField(term102869, term102869.getClass(), "ownerFunction", null);
        setField(term102869, term102869.getClass(), "constructor", term102979);
        setField(term102757, term102757.getClass(), "jsType", term102869);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term102757;
        args[1] = true;
        callMethod(klass, "getReadableJSTypeName", argTypes, term102687, args);
    }

};


