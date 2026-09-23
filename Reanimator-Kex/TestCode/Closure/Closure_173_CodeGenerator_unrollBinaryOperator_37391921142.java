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
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class CodeGenerator_unrollBinaryOperator_37391921142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7420;
     Object term7455;
     Object term7482;
     Object enum81;
     Object enum82;
     Object term7535;
     Object term7537;

    public CodeGenerator_unrollBinaryOperator_37391921142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7421 = new HashMap();
        Class<? extends Object> term29511 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term29510 = ((Class) term29511).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term29510).setAccessible(true);
        Object enum80 = ((Field) term29510).get((Object) null);
        term7420 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term7420, term7420.getClass(), "escapedJsStrings", term7421);
        setField(term7420, term7420.getClass(), "cc", null);
        setField(term7420, term7420.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term7420, term7420.getClass(), "preferSingleQuotes", true);
        setBooleanField(term7420, term7420.getClass(), "trustedStrings", true);
        setField(term7420, term7420.getClass(), "languageMode", enum80);
        term7455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7455, term7455.getClass(), "type", -655067527);
        setIntField(term7457, term7457.getClass(), "type", -6029667);
        setIntField(term7459, term7459.getClass(), "type", -2068769794);
        setIntField(term7461, term7461.getClass(), "type", -117576464);
        setIntField(term7463, term7463.getClass(), "type", -1007160944);
        setField(term7463, term7463.getClass(), "next", null);
        setField(term7463, term7463.getClass(), "first", null);
        setField(term7463, term7463.getClass(), "last", null);
        setField(term7463, term7463.getClass(), "propListHead", null);
        setIntField(term7463, term7463.getClass(), "sourcePosition", 0);
        setField(term7463, term7463.getClass(), "jsType", null);
        setField(term7463, term7463.getClass(), "parent", null);
        setField(term7461, term7461.getClass(), "next", term7463);
        setIntField(term7466, term7466.getClass(), "type", 1135664017);
        setField(term7466, term7466.getClass(), "next", null);
        setField(term7466, term7466.getClass(), "first", null);
        setField(term7466, term7466.getClass(), "last", term7463);
        setField(term7466, term7466.getClass(), "propListHead", null);
        setIntField(term7466, term7466.getClass(), "sourcePosition", 0);
        setField(term7466, term7466.getClass(), "jsType", null);
        setField(term7466, term7466.getClass(), "parent", null);
        setField(term7461, term7461.getClass(), "first", term7466);
        setField(term7461, term7461.getClass(), "last", term7459);
        setField(term7461, term7461.getClass(), "propListHead", null);
        setIntField(term7461, term7461.getClass(), "sourcePosition", 0);
        setField(term7461, term7461.getClass(), "jsType", null);
        setField(term7461, term7461.getClass(), "parent", null);
        setField(term7459, term7459.getClass(), "next", term7461);
        setField(term7459, term7459.getClass(), "first", term7463);
        setIntField(term7470, term7470.getClass(), "type", 865208305);
        setIntField(term7472, term7472.getClass(), "type", -1275173084);
        setField(term7472, term7472.getClass(), "next", null);
        setField(term7472, term7472.getClass(), "first", term7466);
        setField(term7472, term7472.getClass(), "last", term7461);
        setField(term7472, term7472.getClass(), "propListHead", null);
        setIntField(term7472, term7472.getClass(), "sourcePosition", 0);
        setField(term7472, term7472.getClass(), "jsType", null);
        setField(term7472, term7472.getClass(), "parent", null);
        setField(term7470, term7470.getClass(), "next", term7472);
        setField(term7470, term7470.getClass(), "first", term7457);
        setField(term7470, term7470.getClass(), "last", term7457);
        setField(term7470, term7470.getClass(), "propListHead", null);
        setIntField(term7470, term7470.getClass(), "sourcePosition", 0);
        setField(term7470, term7470.getClass(), "jsType", null);
        setField(term7470, term7470.getClass(), "parent", null);
        setField(term7459, term7459.getClass(), "last", term7470);
        setField(term7459, term7459.getClass(), "propListHead", null);
        setIntField(term7459, term7459.getClass(), "sourcePosition", 0);
        setField(term7459, term7459.getClass(), "jsType", null);
        setField(term7459, term7459.getClass(), "parent", null);
        setField(term7457, term7457.getClass(), "next", term7459);
        setIntField(term7477, term7477.getClass(), "type", -244121226);
        setField(term7477, term7477.getClass(), "next", term7470);
        setField(term7477, term7477.getClass(), "first", term7472);
        setField(term7477, term7477.getClass(), "last", term7455);
        setField(term7477, term7477.getClass(), "propListHead", null);
        setIntField(term7477, term7477.getClass(), "sourcePosition", 0);
        setField(term7477, term7477.getClass(), "jsType", null);
        setField(term7477, term7477.getClass(), "parent", null);
        setField(term7457, term7457.getClass(), "first", term7477);
        setField(term7457, term7457.getClass(), "last", term7477);
        setField(term7457, term7457.getClass(), "propListHead", null);
        setIntField(term7457, term7457.getClass(), "sourcePosition", 0);
        setField(term7457, term7457.getClass(), "jsType", null);
        setField(term7457, term7457.getClass(), "parent", null);
        setField(term7455, term7455.getClass(), "next", term7457);
        setField(term7455, term7455.getClass(), "first", term7461);
        setField(term7455, term7455.getClass(), "last", term7463);
        setField(term7455, term7455.getClass(), "propListHead", null);
        setIntField(term7455, term7455.getClass(), "sourcePosition", 0);
        setField(term7455, term7455.getClass(), "jsType", null);
        setField(term7455, term7455.getClass(), "parent", null);
        term7482 = new Integer(-203030934);
        Class<? extends Object> term29867 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term29866 = ((Class) term29867).getDeclaredField((String) "START_OF_EXPR");
        ((Field) term29866).setAccessible(true);
        enum81 = ((Field) term29866).get((Object) null);
        Class<? extends Object> term30163 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term30162 = ((Class) term30163).getDeclaredField((String) "IN_FOR_INIT_CLAUSE");
        ((Field) term30162).setAccessible(true);
        enum82 = ((Field) term30162).get((Object) null);
        term7535 = new Integer(-1179120542);
        term7537 = new Integer(-73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        argTypes[4] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        Object[] args = new Object[7];
        args[0] = term7455;
        args[1] = term7482;
        args[2] = "dWRymuLBtr";
        args[3] = enum81;
        args[4] = enum82;
        args[5] = term7535;
        args[6] = term7537;
        try {
            callMethod(klass, "unrollBinaryOperator", argTypes, term7420, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


