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

public class FunctionTypeBuilder_inferParameterTypes_212883572183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85005;
     Object term85179;

    public FunctionTypeBuilder_inferParameterTypes_212883572183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85005 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term85109 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term85005, term85005.getClass(), "typeRegistry", term85109);
        term85179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term85249, term85249.getClass(), "type", 0);
        setField(term85249, term85249.getClass(), "parent", null);
        setIntField(term85249, term85249.getClass(), "sourcePosition", 0);
        setField(term85249, term85249.getClass(), "first", null);
        setField(term85179, term85179.getClass(), "first", term85249);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term85179;
        args[1] = null;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term85005, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


