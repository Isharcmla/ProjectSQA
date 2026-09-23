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

public class FunctionTypeBuilder_inferParameterTypes_212883572211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95677;
     Object term95851;

    public FunctionTypeBuilder_inferParameterTypes_212883572211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95677 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term95781 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term95677, term95677.getClass(), "typeRegistry", term95781);
        term95851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term95851, term95851.getClass(), "first", term95921);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term95851;
        args[1] = null;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term95677, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


