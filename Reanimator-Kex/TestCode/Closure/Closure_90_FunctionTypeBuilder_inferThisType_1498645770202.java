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

public class FunctionTypeBuilder_inferThisType_1498645770202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80209;
     Object term80505;
     Object term80575;

    public FunctionTypeBuilder_inferThisType_1498645770202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80209 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term80313 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term80387 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term80209, term80209.getClass(), "typeRegistry", term80313);
        setField(term80209, term80209.getClass(), "scope", term80387);
        setField(term80209, term80209.getClass(), "sourceName", "");
        term80505 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term80505, term80505.getClass(), "thisType", null);
        setIntField(term80505, term80505.getClass(), "bitset", -1073741824);
        term80575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term80575, term80575.getClass(), "type", 0);
        setIntField(term80575, term80575.getClass(), "sourcePosition", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term80505;
        args[1] = term80575;
        try {
            callMethod(klass, "inferThisType", argTypes, term80209, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


