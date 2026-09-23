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

public class CodeGenerator_add_29631458240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6213;
     Object term6241;

    public CodeGenerator_add_29631458240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6214 = new HashMap();
        Class<? extends Object> term27965 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term27964 = ((Class) term27965).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term27964).setAccessible(true);
        Object enum77 = ((Field) term27964).get((Object) null);
        term6213 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term6213, term6213.getClass(), "escapedJsStrings", term6214);
        setField(term6213, term6213.getClass(), "cc", null);
        setField(term6213, term6213.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term6213, term6213.getClass(), "preferSingleQuotes", true);
        setBooleanField(term6213, term6213.getClass(), "trustedStrings", true);
        setField(term6213, term6213.getClass(), "languageMode", enum77);
        term6241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6241, term6241.getClass(), "type", 568599855);
        setIntField(term6243, term6243.getClass(), "type", 1162663216);
        setIntField(term6245, term6245.getClass(), "type", 1484323161);
        setIntField(term6247, term6247.getClass(), "type", 391863371);
        setIntField(term6249, term6249.getClass(), "type", -1922583790);
        setField(term6249, term6249.getClass(), "next", null);
        setField(term6249, term6249.getClass(), "first", null);
        setField(term6249, term6249.getClass(), "last", null);
        setField(term6249, term6249.getClass(), "propListHead", null);
        setIntField(term6249, term6249.getClass(), "sourcePosition", 0);
        setField(term6249, term6249.getClass(), "jsType", null);
        setField(term6249, term6249.getClass(), "parent", null);
        setField(term6247, term6247.getClass(), "next", term6249);
        setIntField(term6252, term6252.getClass(), "type", -616727354);
        setField(term6252, term6252.getClass(), "next", null);
        setField(term6252, term6252.getClass(), "first", null);
        setField(term6252, term6252.getClass(), "last", term6249);
        setField(term6252, term6252.getClass(), "propListHead", null);
        setIntField(term6252, term6252.getClass(), "sourcePosition", 0);
        setField(term6252, term6252.getClass(), "jsType", null);
        setField(term6252, term6252.getClass(), "parent", null);
        setField(term6247, term6247.getClass(), "first", term6252);
        setField(term6247, term6247.getClass(), "last", term6245);
        setField(term6247, term6247.getClass(), "propListHead", null);
        setIntField(term6247, term6247.getClass(), "sourcePosition", 0);
        setField(term6247, term6247.getClass(), "jsType", null);
        setField(term6247, term6247.getClass(), "parent", null);
        setField(term6245, term6245.getClass(), "next", term6247);
        setField(term6245, term6245.getClass(), "first", term6249);
        setIntField(term6256, term6256.getClass(), "type", -2038273078);
        setIntField(term6258, term6258.getClass(), "type", 1227103734);
        setField(term6258, term6258.getClass(), "next", null);
        setField(term6258, term6258.getClass(), "first", term6252);
        setField(term6258, term6258.getClass(), "last", term6247);
        setField(term6258, term6258.getClass(), "propListHead", null);
        setIntField(term6258, term6258.getClass(), "sourcePosition", 0);
        setField(term6258, term6258.getClass(), "jsType", null);
        setField(term6258, term6258.getClass(), "parent", null);
        setField(term6256, term6256.getClass(), "next", term6258);
        setField(term6256, term6256.getClass(), "first", term6243);
        setField(term6256, term6256.getClass(), "last", term6243);
        setField(term6256, term6256.getClass(), "propListHead", null);
        setIntField(term6256, term6256.getClass(), "sourcePosition", 0);
        setField(term6256, term6256.getClass(), "jsType", null);
        setField(term6256, term6256.getClass(), "parent", null);
        setField(term6245, term6245.getClass(), "last", term6256);
        setField(term6245, term6245.getClass(), "propListHead", null);
        setIntField(term6245, term6245.getClass(), "sourcePosition", 0);
        setField(term6245, term6245.getClass(), "jsType", null);
        setField(term6245, term6245.getClass(), "parent", null);
        setField(term6243, term6243.getClass(), "next", term6245);
        setIntField(term6263, term6263.getClass(), "type", -1339778481);
        setField(term6263, term6263.getClass(), "next", term6256);
        setField(term6263, term6263.getClass(), "first", term6258);
        setField(term6263, term6263.getClass(), "last", term6241);
        setField(term6263, term6263.getClass(), "propListHead", null);
        setIntField(term6263, term6263.getClass(), "sourcePosition", 0);
        setField(term6263, term6263.getClass(), "jsType", null);
        setField(term6263, term6263.getClass(), "parent", null);
        setField(term6243, term6243.getClass(), "first", term6263);
        setField(term6243, term6243.getClass(), "last", term6263);
        setField(term6243, term6243.getClass(), "propListHead", null);
        setIntField(term6243, term6243.getClass(), "sourcePosition", 0);
        setField(term6243, term6243.getClass(), "jsType", null);
        setField(term6243, term6243.getClass(), "parent", null);
        setField(term6241, term6241.getClass(), "next", term6243);
        setField(term6241, term6241.getClass(), "first", term6247);
        setField(term6241, term6241.getClass(), "last", term6249);
        setField(term6241, term6241.getClass(), "propListHead", null);
        setIntField(term6241, term6241.getClass(), "sourcePosition", 0);
        setField(term6241, term6241.getClass(), "jsType", null);
        setField(term6241, term6241.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term6241;
        try {
            callMethod(klass, "add", argTypes, term6213, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


