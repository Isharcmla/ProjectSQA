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

public class FunctionTypeBuilder_inferParameterTypes_212883572271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102697;
     Object term103011;
     Object term103126;

    public FunctionTypeBuilder_inferParameterTypes_212883572271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102697 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term102767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term102767, term102767.getClass(), "first", term103046);
        setField(term102697, term102697.getClass(), "parametersNode", term102767);
        setField(term102697, term102697.getClass(), "typeRegistry", term102941);
        term103011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term103011, term103011.getClass(), "first", term103046);
        term103126 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term103126, term103126.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term103011;
        args[1] = term103126;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term102697, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


