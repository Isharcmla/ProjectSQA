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

public class TypeValidator_getReadableJSTypeName_850599436394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171302;
     Object term171388;

    public TypeValidator_getReadableJSTypeName_850599436394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171302 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term171388 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term171474 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term171588 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term171674 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term171388, term171388.getClass(), "type", 33);
        setField(term171474, term171474.getClass(), "jsType", term171588);
        setField(term171388, term171388.getClass(), "first", term171474);
        setField(term171388, term171388.getClass(), "last", term171674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term171388;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term171302, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


