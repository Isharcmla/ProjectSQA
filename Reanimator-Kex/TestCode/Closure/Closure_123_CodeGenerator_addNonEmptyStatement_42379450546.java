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
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class CodeGenerator_addNonEmptyStatement_42379450546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8923;
     Object term8951;
     Object enum85;
     Object term8987;

    public CodeGenerator_addNonEmptyStatement_42379450546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8924 = new HashMap();
        Class<? extends Object> term31142 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term31141 = ((Class) term31142).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term31141).setAccessible(true);
        Object enum84 = ((Field) term31141).get((Object) null);
        term8923 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term8923, term8923.getClass(), "escapedJsStrings", term8924);
        setField(term8923, term8923.getClass(), "cc", null);
        setField(term8923, term8923.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term8923, term8923.getClass(), "preferSingleQuotes", true);
        setBooleanField(term8923, term8923.getClass(), "trustedStrings", false);
        setField(term8923, term8923.getClass(), "languageMode", enum84);
        term8951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8951, term8951.getClass(), "type", -157887805);
        setIntField(term8953, term8953.getClass(), "type", 1876565163);
        setIntField(term8955, term8955.getClass(), "type", -817164822);
        setIntField(term8957, term8957.getClass(), "type", -1016503459);
        setIntField(term8959, term8959.getClass(), "type", -1968847291);
        setField(term8959, term8959.getClass(), "next", null);
        setField(term8959, term8959.getClass(), "first", null);
        setField(term8959, term8959.getClass(), "last", null);
        setField(term8959, term8959.getClass(), "propListHead", null);
        setIntField(term8959, term8959.getClass(), "sourcePosition", 0);
        setField(term8959, term8959.getClass(), "jsType", null);
        setField(term8959, term8959.getClass(), "parent", null);
        setField(term8957, term8957.getClass(), "next", term8959);
        setIntField(term8962, term8962.getClass(), "type", 579005622);
        setField(term8962, term8962.getClass(), "next", null);
        setField(term8962, term8962.getClass(), "first", null);
        setField(term8962, term8962.getClass(), "last", term8959);
        setField(term8962, term8962.getClass(), "propListHead", null);
        setIntField(term8962, term8962.getClass(), "sourcePosition", 0);
        setField(term8962, term8962.getClass(), "jsType", null);
        setField(term8962, term8962.getClass(), "parent", null);
        setField(term8957, term8957.getClass(), "first", term8962);
        setField(term8957, term8957.getClass(), "last", term8955);
        setField(term8957, term8957.getClass(), "propListHead", null);
        setIntField(term8957, term8957.getClass(), "sourcePosition", 0);
        setField(term8957, term8957.getClass(), "jsType", null);
        setField(term8957, term8957.getClass(), "parent", null);
        setField(term8955, term8955.getClass(), "next", term8957);
        setField(term8955, term8955.getClass(), "first", term8959);
        setIntField(term8966, term8966.getClass(), "type", 1632125673);
        setIntField(term8968, term8968.getClass(), "type", 454281060);
        setField(term8968, term8968.getClass(), "next", null);
        setField(term8968, term8968.getClass(), "first", term8962);
        setField(term8968, term8968.getClass(), "last", term8957);
        setField(term8968, term8968.getClass(), "propListHead", null);
        setIntField(term8968, term8968.getClass(), "sourcePosition", 0);
        setField(term8968, term8968.getClass(), "jsType", null);
        setField(term8968, term8968.getClass(), "parent", null);
        setField(term8966, term8966.getClass(), "next", term8968);
        setField(term8966, term8966.getClass(), "first", term8953);
        setField(term8966, term8966.getClass(), "last", term8953);
        setField(term8966, term8966.getClass(), "propListHead", null);
        setIntField(term8966, term8966.getClass(), "sourcePosition", 0);
        setField(term8966, term8966.getClass(), "jsType", null);
        setField(term8966, term8966.getClass(), "parent", null);
        setField(term8955, term8955.getClass(), "last", term8966);
        setField(term8955, term8955.getClass(), "propListHead", null);
        setIntField(term8955, term8955.getClass(), "sourcePosition", 0);
        setField(term8955, term8955.getClass(), "jsType", null);
        setField(term8955, term8955.getClass(), "parent", null);
        setField(term8953, term8953.getClass(), "next", term8955);
        setIntField(term8973, term8973.getClass(), "type", -1786399638);
        setField(term8973, term8973.getClass(), "next", term8966);
        setField(term8973, term8973.getClass(), "first", term8968);
        setField(term8973, term8973.getClass(), "last", term8951);
        setField(term8973, term8973.getClass(), "propListHead", null);
        setIntField(term8973, term8973.getClass(), "sourcePosition", 0);
        setField(term8973, term8973.getClass(), "jsType", null);
        setField(term8973, term8973.getClass(), "parent", null);
        setField(term8953, term8953.getClass(), "first", term8973);
        setField(term8953, term8953.getClass(), "last", term8973);
        setField(term8953, term8953.getClass(), "propListHead", null);
        setIntField(term8953, term8953.getClass(), "sourcePosition", 0);
        setField(term8953, term8953.getClass(), "jsType", null);
        setField(term8953, term8953.getClass(), "parent", null);
        setField(term8951, term8951.getClass(), "next", term8953);
        setField(term8951, term8951.getClass(), "first", term8957);
        setField(term8951, term8951.getClass(), "last", term8959);
        setField(term8951, term8951.getClass(), "propListHead", null);
        setIntField(term8951, term8951.getClass(), "sourcePosition", 0);
        setField(term8951, term8951.getClass(), "jsType", null);
        setField(term8951, term8951.getClass(), "parent", null);
        Class<? extends Object> term31467 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term31466 = ((Class) term31467).getDeclaredField((String) "OTHER");
        ((Field) term31466).setAccessible(true);
        enum85 = ((Field) term31466).get((Object) null);
        term8987 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term8951;
        args[1] = enum85;
        args[2] = term8987;
        try {
            callMethod(klass, "addNonEmptyStatement", argTypes, term8923, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


