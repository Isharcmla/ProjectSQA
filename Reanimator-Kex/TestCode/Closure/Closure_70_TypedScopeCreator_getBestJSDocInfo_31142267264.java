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

public class TypedScopeCreator_getBestJSDocInfo_31142267264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18389;

    public TypedScopeCreator_getBestJSDocInfo_31142267264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18389 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term18485 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term18571 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term18485, term18485.getClass(), "type", -30);
        setField(term18485, term18485.getClass(), "next", null);
        setField(term18389, term18389.getClass(), "propListHead", term18485);
        setField(term18389, term18389.getClass(), "parent", term18571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term18389;
        callMethod(klass, "getBestJSDocInfo", argTypes, null, args);
    }

};


