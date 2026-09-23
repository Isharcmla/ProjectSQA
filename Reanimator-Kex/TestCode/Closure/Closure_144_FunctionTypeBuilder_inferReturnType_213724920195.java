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

public class FunctionTypeBuilder_inferReturnType_213724920195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55646;
     Object term55800;

    public FunctionTypeBuilder_inferReturnType_213724920195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55646 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term55720 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term55646, term55646.getClass(), "scope", term55720);
        setField(term55646, term55646.getClass(), "typeRegistry", null);
        term55800 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term55894 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term55800, term55800.getClass(), "bitset", 1073741824);
        setField(term55800, term55800.getClass(), "type", term55894);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term55800;
        try {
            callMethod(klass, "inferReturnType", argTypes, term55646, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


