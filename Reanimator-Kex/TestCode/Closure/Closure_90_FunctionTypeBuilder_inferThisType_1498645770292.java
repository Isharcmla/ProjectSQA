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

public class FunctionTypeBuilder_inferThisType_1498645770292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110969;
     Object term111265;
     Object term111351;

    public FunctionTypeBuilder_inferThisType_1498645770292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110969 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term111073 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term111147 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term110969, term110969.getClass(), "typeRegistry", term111073);
        setField(term110969, term110969.getClass(), "scope", term111147);
        setField(term110969, term110969.getClass(), "sourceName", "");
        term111265 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term111265, term111265.getClass(), "thisType", null);
        setIntField(term111265, term111265.getClass(), "bitset", -1073741824);
        term111351 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term111351, term111351.getClass(), "type", 0);
        setIntField(term111351, term111351.getClass(), "sourcePosition", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term111265;
        args[1] = term111351;
        callMethod(klass, "inferThisType", argTypes, term110969, args);
    }

};


