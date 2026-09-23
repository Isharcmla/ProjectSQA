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

public class TypeValidator_getReadableJSTypeName_850599436380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155145;
     Object term155231;

    public TypeValidator_getReadableJSTypeName_850599436380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155145 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term155231 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term155317 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term155431 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term155517 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term155231, term155231.getClass(), "type", 33);
        setField(term155317, term155317.getClass(), "jsType", term155431);
        setField(term155231, term155231.getClass(), "first", term155317);
        setField(term155231, term155231.getClass(), "last", term155517);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term155231;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term155145, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


