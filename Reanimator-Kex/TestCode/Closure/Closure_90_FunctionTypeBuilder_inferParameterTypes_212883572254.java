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

public class FunctionTypeBuilder_inferParameterTypes_212883572254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97593;
     Object term97837;
     Object term97917;

    public FunctionTypeBuilder_inferParameterTypes_212883572254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97593 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term97663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97767 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term97663, term97663.getClass(), "first", null);
        setField(term97593, term97593.getClass(), "parametersNode", term97663);
        setField(term97593, term97593.getClass(), "typeRegistry", term97767);
        term97837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term97837, term97837.getClass(), "first", term97837);
        term97917 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term97917, term97917.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term97837;
        args[1] = term97917;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term97593, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


