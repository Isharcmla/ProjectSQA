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

public class TypeValidator_getReadableJSTypeName_850599436301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94432;
     Object term94606;

    public TypeValidator_getReadableJSTypeName_850599436301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94432 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term94536 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term94432, term94432.getClass(), "typeRegistry", term94536);
        term94606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term94606, term94606.getClass(), "type", 33);
        setField(term94676, term94676.getClass(), "jsType", null);
        setField(term94606, term94606.getClass(), "first", term94676);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term94606;
        args[1] = false;
        callMethod(klass, "getReadableJSTypeName", argTypes, term94432, args);
    }

};


