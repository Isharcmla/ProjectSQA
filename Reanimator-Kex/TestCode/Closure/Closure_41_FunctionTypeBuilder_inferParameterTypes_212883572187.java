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

public class FunctionTypeBuilder_inferParameterTypes_212883572187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57840;
     Object term58084;

    public FunctionTypeBuilder_inferParameterTypes_212883572187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57840 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term57910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58014 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term57910, term57910.getClass(), "first", null);
        setIntField(term57910, term57910.getClass(), "type", 0);
        setField(term57910, term57910.getClass(), "parent", null);
        setIntField(term57910, term57910.getClass(), "sourcePosition", 0);
        setField(term57840, term57840.getClass(), "parametersNode", term57910);
        setField(term57840, term57840.getClass(), "typeRegistry", term58014);
        term58084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term58084, term58084.getClass(), "first", term58154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term58084;
        args[1] = null;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term57840, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


