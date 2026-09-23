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

public class TypeValidator_getReadableJSTypeName_850599436272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90635;
     Object term90705;

    public TypeValidator_getReadableJSTypeName_850599436272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90635 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term90705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90889 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term90959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term90705, term90705.getClass(), "type", 33);
        setField(term90775, term90775.getClass(), "jsType", term90889);
        setField(term90705, term90705.getClass(), "first", term90775);
        setField(term90705, term90705.getClass(), "last", term90959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term90705;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term90635, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


