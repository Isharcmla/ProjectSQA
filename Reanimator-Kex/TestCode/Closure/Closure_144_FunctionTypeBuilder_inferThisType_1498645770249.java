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

public class FunctionTypeBuilder_inferThisType_1498645770249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114435;
     Object term114705;

    public FunctionTypeBuilder_inferThisType_1498645770249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114435 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term114539 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term114613 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term114435, term114435.getClass(), "typeRegistry", term114539);
        setField(term114435, term114435.getClass(), "scope", term114613);
        setField(term114435, term114435.getClass(), "sourceName", null);
        term114705 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term114705, term114705.getClass(), "type", 0);
        setIntField(term114705, term114705.getClass(), "sourcePosition", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term114705;
        callMethod(klass, "inferThisType", argTypes, term114435, args);
    }

};


