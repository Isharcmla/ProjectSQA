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
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.HashMap;

public class CodePrinter_toSource_19778363063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object enum2;
     Object term38;
     Object term40;
     Object term42;
     Object term44;
     Object enum3;
     Object term81;

    public CodePrinter_toSource_19778363063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1, term1.getClass(), "type", 568599855);
        setIntField(term3, term3.getClass(), "type", 1162663216);
        setIntField(term5, term5.getClass(), "type", 1484323161);
        setIntField(term7, term7.getClass(), "type", 391863371);
        setIntField(term9, term9.getClass(), "type", -1922583790);
        setField(term9, term9.getClass(), "next", null);
        setField(term9, term9.getClass(), "first", null);
        setField(term9, term9.getClass(), "last", null);
        setField(term9, term9.getClass(), "propListHead", null);
        setIntField(term9, term9.getClass(), "sourcePosition", 0);
        setField(term9, term9.getClass(), "jsType", null);
        setField(term9, term9.getClass(), "parent", null);
        setField(term7, term7.getClass(), "next", term9);
        setIntField(term12, term12.getClass(), "type", -616727354);
        setField(term12, term12.getClass(), "next", null);
        setField(term12, term12.getClass(), "first", null);
        setField(term12, term12.getClass(), "last", term9);
        setField(term12, term12.getClass(), "propListHead", null);
        setIntField(term12, term12.getClass(), "sourcePosition", 0);
        setField(term12, term12.getClass(), "jsType", null);
        setField(term12, term12.getClass(), "parent", null);
        setField(term7, term7.getClass(), "first", term12);
        setField(term7, term7.getClass(), "last", term5);
        setField(term7, term7.getClass(), "propListHead", null);
        setIntField(term7, term7.getClass(), "sourcePosition", 0);
        setField(term7, term7.getClass(), "jsType", null);
        setField(term7, term7.getClass(), "parent", null);
        setField(term5, term5.getClass(), "next", term7);
        setField(term5, term5.getClass(), "first", term9);
        setIntField(term16, term16.getClass(), "type", -2038273078);
        setIntField(term18, term18.getClass(), "type", 1227103734);
        setField(term18, term18.getClass(), "next", null);
        setField(term18, term18.getClass(), "first", term12);
        setField(term18, term18.getClass(), "last", term7);
        setField(term18, term18.getClass(), "propListHead", null);
        setIntField(term18, term18.getClass(), "sourcePosition", 0);
        setField(term18, term18.getClass(), "jsType", null);
        setField(term18, term18.getClass(), "parent", null);
        setField(term16, term16.getClass(), "next", term18);
        setField(term16, term16.getClass(), "first", term3);
        setField(term16, term16.getClass(), "last", term3);
        setField(term16, term16.getClass(), "propListHead", null);
        setIntField(term16, term16.getClass(), "sourcePosition", 0);
        setField(term16, term16.getClass(), "jsType", null);
        setField(term16, term16.getClass(), "parent", null);
        setField(term5, term5.getClass(), "last", term16);
        setField(term5, term5.getClass(), "propListHead", null);
        setIntField(term5, term5.getClass(), "sourcePosition", 0);
        setField(term5, term5.getClass(), "jsType", null);
        setField(term5, term5.getClass(), "parent", null);
        setField(term3, term3.getClass(), "next", term5);
        setIntField(term23, term23.getClass(), "type", -1339778481);
        setField(term23, term23.getClass(), "next", term16);
        setField(term23, term23.getClass(), "first", term18);
        setField(term23, term23.getClass(), "last", term1);
        setField(term23, term23.getClass(), "propListHead", null);
        setIntField(term23, term23.getClass(), "sourcePosition", 0);
        setField(term23, term23.getClass(), "jsType", null);
        setField(term23, term23.getClass(), "parent", null);
        setField(term3, term3.getClass(), "first", term23);
        setField(term3, term3.getClass(), "last", term23);
        setField(term3, term3.getClass(), "propListHead", null);
        setIntField(term3, term3.getClass(), "sourcePosition", 0);
        setField(term3, term3.getClass(), "jsType", null);
        setField(term3, term3.getClass(), "parent", null);
        setField(term1, term1.getClass(), "next", term3);
        setField(term1, term1.getClass(), "first", term7);
        setField(term1, term1.getClass(), "last", term9);
        setField(term1, term1.getClass(), "propListHead", null);
        setIntField(term1, term1.getClass(), "sourcePosition", 0);
        setField(term1, term1.getClass(), "jsType", null);
        setField(term1, term1.getClass(), "parent", null);
        Class<? extends Object> term4317 = Class.forName((String) "com.google.javascript.jscomp.CodePrinter$Format");
        Field term4316 = ((Class) term4317).getDeclaredField((String) "PRETTY");
        ((Field) term4316).setAccessible(true);
        enum2 = ((Field) term4316).get((Object) null);
        term38 = new Boolean(false);
        term40 = new Boolean(false);
        term42 = new Integer(1725571209);
        Object term47 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term47, term47.getClass(), "prefix", "");
        setField(term47, term47.getClass(), "replacement", "");
        Object term50 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term50, term50.getClass(), "prefix", "");
        setField(term50, term50.getClass(), "replacement", "");
        Object term53 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term53, term53.getClass(), "prefix", "");
        setField(term53, term53.getClass(), "replacement", "");
        Object term56 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term56, term56.getClass(), "prefix", "");
        setField(term56, term56.getClass(), "replacement", "");
        Object term59 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term59, term59.getClass(), "prefix", "");
        setField(term59, term59.getClass(), "replacement", "");
        ArrayList term45 = new ArrayList();
        ((ArrayList) term45).add(term47);
        ((ArrayList) term45).add(term50);
        ((ArrayList) term45).add(term53);
        ((ArrayList) term45).add(term56);
        ((ArrayList) term45).add(term59);
        HashMap term64 = new HashMap();
        term44 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        setField(term44, term44.getClass(), "generator", null);
        setField(term44, term44.getClass(), "prefixMappings", term45);
        setField(term44, term44.getClass(), "sourceLocationFixupCache", term64);
        Class<? extends Object> term4577 = Class.forName((String) "com.google.javascript.jscomp.SourceMap$DetailLevel");
        Field term4576 = ((Class) term4577).getDeclaredField((String) "ALL");
        ((Field) term4576).setAccessible(true);
        enum3 = ((Field) term4576).get((Object) null);
        term81 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("com.google.javascript.jscomp.SourceMap");
        argTypes[6] = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        argTypes[7] = Class.forName("java.nio.charset.Charset");
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term1;
        args[1] = enum2;
        args[2] = term38;
        args[3] = term40;
        args[4] = term42;
        args[5] = term44;
        args[6] = enum3;
        args[7] = null;
        args[8] = term81;
        try {
            callMethod(klass, "toSource", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


