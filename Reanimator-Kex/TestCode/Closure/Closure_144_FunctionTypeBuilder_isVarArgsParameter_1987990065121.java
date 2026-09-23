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

public class FunctionTypeBuilder_isVarArgsParameter_1987990065121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64149;
     Object term64327;

    public FunctionTypeBuilder_isVarArgsParameter_1987990065121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64149 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term64257 = newInstance(Class.forName("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(term64149, term64149.getClass(), "codingConvention", term64257);
        term64327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term64327;
        args[1] = null;
        try {
            callMethod(klass, "isVarArgsParameter", argTypes, term64149, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


