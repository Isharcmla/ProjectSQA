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

public class FunctionTypeBuilder_inferParameterTypes_212883572255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84604;
     Object term84848;

    public FunctionTypeBuilder_inferParameterTypes_212883572255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84604 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term84883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84778 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term84883, term84883.getClass(), "first", null);
        setIntField(term84883, term84883.getClass(), "type", 0);
        setField(term84883, term84883.getClass(), "parent", null);
        setIntField(term84883, term84883.getClass(), "sourcePosition", 0);
        setField(term84883, term84883.getClass(), "next", null);
        setField(term84604, term84604.getClass(), "parametersNode", term84883);
        setField(term84604, term84604.getClass(), "typeRegistry", term84778);
        term84848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term84848, term84848.getClass(), "first", term84883);
        setField(term84848, term84848.getClass(), "next", term84848);
        setIntField(term84848, term84848.getClass(), "type", 40);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term84848;
        args[1] = null;
        callMethod(klass, "inferParameterTypes", argTypes, term84604, args);
    }

};


