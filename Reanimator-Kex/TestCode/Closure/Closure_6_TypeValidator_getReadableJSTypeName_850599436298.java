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

public class TypeValidator_getReadableJSTypeName_850599436298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91819;
     Object term91889;

    public TypeValidator_getReadableJSTypeName_850599436298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91819 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term91889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92083 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setIntField(term91889, term91889.getClass(), "type", 33);
        setField(term91959, term91959.getClass(), "jsType", term92083);
        setField(term91889, term91889.getClass(), "first", term91959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term91889;
        args[1] = false;
        callMethod(klass, "getReadableJSTypeName", argTypes, term91819, args);
    }

};


