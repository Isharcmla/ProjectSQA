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

public class FunctionTypeBuilder_inferThisType_1498645770236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90395;
     Object term90475;
     Object term90561;

    public FunctionTypeBuilder_inferThisType_1498645770236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90395 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term90475 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term90475, term90475.getClass(), "thisType", null);
        setIntField(term90475, term90475.getClass(), "bitset", -1073741824);
        term90561 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term90475;
        args[1] = term90561;
        try {
            callMethod(klass, "inferThisType", argTypes, term90395, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


