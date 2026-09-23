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
import java.util.HashMap;
import java.lang.Object;

public class CodeGenerator_isOneExactlyFunctionOrDo_211412008711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1033;
     Object term1044;

    public CodeGenerator_isOneExactlyFunctionOrDo_211412008711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1034 = new HashMap();
        term1033 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1033, term1033.getClass(), "ESCAPED_JS_STRINGS", term1034);
        setField(term1033, term1033.getClass(), "cc", null);
        setField(term1033, term1033.getClass(), "outputCharsetEncoder", null);
        term1044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1057 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1067 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1044, term1044.getClass(), "type", 454281060);
        setIntField(term1046, term1046.getClass(), "type", 292681826);
        setIntField(term1048, term1048.getClass(), "type", 0);
        setField(term1048, term1048.getClass(), "next", null);
        setField(term1048, term1048.getClass(), "first", null);
        setField(term1048, term1048.getClass(), "last", null);
        setField(term1048, term1048.getClass(), "propListHead", null);
        setIntField(term1048, term1048.getClass(), "sourcePosition", 0);
        setField(term1048, term1048.getClass(), "jsType", null);
        setField(term1048, term1048.getClass(), "parent", null);
        setField(term1046, term1046.getClass(), "next", term1048);
        setIntField(term1051, term1051.getClass(), "type", 0);
        setField(term1051, term1051.getClass(), "next", null);
        setField(term1051, term1051.getClass(), "first", null);
        setField(term1051, term1051.getClass(), "last", null);
        setField(term1051, term1051.getClass(), "propListHead", null);
        setIntField(term1051, term1051.getClass(), "sourcePosition", 0);
        setField(term1051, term1051.getClass(), "jsType", null);
        setField(term1051, term1051.getClass(), "parent", null);
        setField(term1046, term1046.getClass(), "first", term1051);
        setIntField(term1054, term1054.getClass(), "type", 0);
        setField(term1054, term1054.getClass(), "next", null);
        setField(term1054, term1054.getClass(), "first", null);
        setField(term1054, term1054.getClass(), "last", null);
        setField(term1054, term1054.getClass(), "propListHead", null);
        setIntField(term1054, term1054.getClass(), "sourcePosition", 0);
        setField(term1054, term1054.getClass(), "jsType", null);
        setField(term1054, term1054.getClass(), "parent", null);
        setField(term1046, term1046.getClass(), "last", term1054);
        setField(term1057, term1057.getClass(), "next", null);
        setIntField(term1057, term1057.getClass(), "type", 0);
        setIntField(term1057, term1057.getClass(), "intValue", 0);
        setField(term1057, term1057.getClass(), "objectValue", null);
        setField(term1046, term1046.getClass(), "propListHead", term1057);
        setIntField(term1046, term1046.getClass(), "sourcePosition", 493620644);
        setField(term1046, term1046.getClass(), "jsType", null);
        setField(term1046, term1046.getClass(), "parent", null);
        setField(term1044, term1044.getClass(), "next", term1046);
        setIntField(term1061, term1061.getClass(), "type", 0);
        setField(term1061, term1061.getClass(), "next", null);
        setField(term1061, term1061.getClass(), "first", null);
        setField(term1061, term1061.getClass(), "last", null);
        setField(term1061, term1061.getClass(), "propListHead", null);
        setIntField(term1061, term1061.getClass(), "sourcePosition", 0);
        setField(term1061, term1061.getClass(), "jsType", null);
        setField(term1061, term1061.getClass(), "parent", null);
        setField(term1044, term1044.getClass(), "first", term1061);
        setIntField(term1064, term1064.getClass(), "type", 0);
        setField(term1064, term1064.getClass(), "next", null);
        setField(term1064, term1064.getClass(), "first", null);
        setField(term1064, term1064.getClass(), "last", null);
        setField(term1064, term1064.getClass(), "propListHead", null);
        setIntField(term1064, term1064.getClass(), "sourcePosition", 0);
        setField(term1064, term1064.getClass(), "jsType", null);
        setField(term1064, term1064.getClass(), "parent", null);
        setField(term1044, term1044.getClass(), "last", term1064);
        setField(term1067, term1067.getClass(), "next", null);
        setIntField(term1067, term1067.getClass(), "type", 0);
        setIntField(term1067, term1067.getClass(), "intValue", 0);
        setField(term1067, term1067.getClass(), "objectValue", null);
        setField(term1044, term1044.getClass(), "propListHead", term1067);
        setIntField(term1044, term1044.getClass(), "sourcePosition", 1328271830);
        setField(term1044, term1044.getClass(), "jsType", null);
        setField(term1044, term1044.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1044;
        callMethod(klass, "isOneExactlyFunctionOrDo", argTypes, term1033, args);
    }

};


