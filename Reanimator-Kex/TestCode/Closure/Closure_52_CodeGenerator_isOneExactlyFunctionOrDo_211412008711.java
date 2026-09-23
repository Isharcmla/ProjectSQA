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
     Object term1009;
     Object term1020;

    public CodeGenerator_isOneExactlyFunctionOrDo_211412008711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1010 = new HashMap();
        term1009 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1009, term1009.getClass(), "ESCAPED_JS_STRINGS", term1010);
        setField(term1009, term1009.getClass(), "cc", null);
        setField(term1009, term1009.getClass(), "outputCharsetEncoder", null);
        term1020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1020, term1020.getClass(), "type", -157887805);
        setIntField(term1022, term1022.getClass(), "type", -1968847291);
        setIntField(term1024, term1024.getClass(), "type", 0);
        setField(term1024, term1024.getClass(), "next", null);
        setField(term1024, term1024.getClass(), "first", null);
        setField(term1024, term1024.getClass(), "last", null);
        setField(term1024, term1024.getClass(), "propListHead", null);
        setIntField(term1024, term1024.getClass(), "sourcePosition", 0);
        setField(term1024, term1024.getClass(), "jsType", null);
        setField(term1024, term1024.getClass(), "parent", null);
        setField(term1022, term1022.getClass(), "next", term1024);
        setIntField(term1027, term1027.getClass(), "type", 0);
        setField(term1027, term1027.getClass(), "next", null);
        setField(term1027, term1027.getClass(), "first", null);
        setField(term1027, term1027.getClass(), "last", null);
        setField(term1027, term1027.getClass(), "propListHead", null);
        setIntField(term1027, term1027.getClass(), "sourcePosition", 0);
        setField(term1027, term1027.getClass(), "jsType", null);
        setField(term1027, term1027.getClass(), "parent", null);
        setField(term1022, term1022.getClass(), "first", term1027);
        setIntField(term1030, term1030.getClass(), "type", 0);
        setField(term1030, term1030.getClass(), "next", null);
        setField(term1030, term1030.getClass(), "first", null);
        setField(term1030, term1030.getClass(), "last", null);
        setField(term1030, term1030.getClass(), "propListHead", null);
        setIntField(term1030, term1030.getClass(), "sourcePosition", 0);
        setField(term1030, term1030.getClass(), "jsType", null);
        setField(term1030, term1030.getClass(), "parent", null);
        setField(term1022, term1022.getClass(), "last", term1030);
        setField(term1022, term1022.getClass(), "propListHead", null);
        setIntField(term1022, term1022.getClass(), "sourcePosition", 0);
        setField(term1022, term1022.getClass(), "jsType", null);
        setField(term1022, term1022.getClass(), "parent", null);
        setField(term1020, term1020.getClass(), "next", term1022);
        setIntField(term1034, term1034.getClass(), "type", 0);
        setField(term1034, term1034.getClass(), "next", null);
        setField(term1034, term1034.getClass(), "first", null);
        setField(term1034, term1034.getClass(), "last", null);
        setField(term1034, term1034.getClass(), "propListHead", null);
        setIntField(term1034, term1034.getClass(), "sourcePosition", 0);
        setField(term1034, term1034.getClass(), "jsType", null);
        setField(term1034, term1034.getClass(), "parent", null);
        setField(term1020, term1020.getClass(), "first", term1034);
        setIntField(term1037, term1037.getClass(), "type", 0);
        setField(term1037, term1037.getClass(), "next", null);
        setField(term1037, term1037.getClass(), "first", null);
        setField(term1037, term1037.getClass(), "last", null);
        setField(term1037, term1037.getClass(), "propListHead", null);
        setIntField(term1037, term1037.getClass(), "sourcePosition", 0);
        setField(term1037, term1037.getClass(), "jsType", null);
        setField(term1037, term1037.getClass(), "parent", null);
        setField(term1020, term1020.getClass(), "last", term1037);
        setField(term1020, term1020.getClass(), "propListHead", null);
        setIntField(term1020, term1020.getClass(), "sourcePosition", 0);
        setField(term1020, term1020.getClass(), "jsType", null);
        setField(term1020, term1020.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1020;
        callMethod(klass, "isOneExactlyFunctionOrDo", argTypes, term1009, args);
    }

};


