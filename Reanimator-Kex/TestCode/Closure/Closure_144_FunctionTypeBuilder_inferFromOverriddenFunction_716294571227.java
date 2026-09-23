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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103442;
     Object term103646;
     Object term103986;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103442 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term103546 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term103442, term103442.getClass(), "returnType", null);
        setField(term103442, term103442.getClass(), "typeRegistry", term103546);
        term103646 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term103740 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term103846 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term103916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term103740, term103740.getClass(), "returnType", term103846);
        setField(term103916, term103916.getClass(), "first", null);
        setField(term103740, term103740.getClass(), "parameters", term103916);
        setField(term103646, term103646.getClass(), "call", term103740);
        term103986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term103986, term103986.getClass(), "first", term104056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term103646;
        args[1] = term103986;
        try {
            callMethod(klass, "inferFromOverriddenFunction", argTypes, term103442, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


