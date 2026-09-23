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

public class TypeValidator_getJSType_363974082236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88604;
     Object term88778;

    public TypeValidator_getJSType_363974082236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88604 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term88708 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term88153 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term88708, term88708.getClass(), "nativeTypes", term88153);
        setField(term88604, term88604.getClass(), "typeRegistry", term88708);
        term88778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term88778, term88778.getClass(), "jsType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term88778;
        callMethod(klass, "getJSType", argTypes, term88604, args);
    }

};


