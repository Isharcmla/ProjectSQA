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
     Object term6216;
     Object term6244;

    public CodeGenerator_add_29631458240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6217 = new HashMap();
        Class<? extends Object> term27971 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term27970 = ((Class) term27971).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term27970).setAccessible(true);
        Object enum77 = ((Field) term27970).get((Object) null);
        term6216 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term6216, term6216.getClass(), "escapedJsStrings", term6217);
        setField(term6216, term6216.getClass(), "cc", null);
        setField(term6216, term6216.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term6216, term6216.getClass(), "preferSingleQuotes", true);
        setBooleanField(term6216, term6216.getClass(), "trustedStrings", true);
        setField(term6216, term6216.getClass(), "languageMode", enum77);
        term6244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6244, term6244.getClass(), "type", 568599855);
        setIntField(term6246, term6246.getClass(), "type", 1162663216);
        setIntField(term6248, term6248.getClass(), "type", 1484323161);
        setIntField(term6250, term6250.getClass(), "type", 391863371);
        setIntField(term6252, term6252.getClass(), "type", -1922583790);
        setField(term6252, term6252.getClass(), "next", null);
        setField(term6252, term6252.getClass(), "first", null);
        setField(term6252, term6252.getClass(), "last", null);
        setField(term6252, term6252.getClass(), "propListHead", null);
        setIntField(term6252, term6252.getClass(), "sourcePosition", 0);
        setField(term6252, term6252.getClass(), "jsType", null);
        setField(term6252, term6252.getClass(), "parent", null);
        setField(term6250, term6250.getClass(), "next", term6252);
        setIntField(term6255, term6255.getClass(), "type", -616727354);
        setField(term6255, term6255.getClass(), "next", null);
        setField(term6255, term6255.getClass(), "first", null);
        setField(term6255, term6255.getClass(), "last", term6252);
        setField(term6255, term6255.getClass(), "propListHead", null);
        setIntField(term6255, term6255.getClass(), "sourcePosition", 0);
        setField(term6255, term6255.getClass(), "jsType", null);
        setField(term6255, term6255.getClass(), "parent", null);
        setField(term6250, term6250.getClass(), "first", term6255);
        setField(term6250, term6250.getClass(), "last", term6248);
        setField(term6250, term6250.getClass(), "propListHead", null);
        setIntField(term6250, term6250.getClass(), "sourcePosition", 0);
        setField(term6250, term6250.getClass(), "jsType", null);
        setField(term6250, term6250.getClass(), "parent", null);
        setField(term6248, term6248.getClass(), "next", term6250);
        setField(term6248, term6248.getClass(), "first", term6252);
        setIntField(term6259, term6259.getClass(), "type", -2038273078);
        setIntField(term6261, term6261.getClass(), "type", 1227103734);
        setField(term6261, term6261.getClass(), "next", null);
        setField(term6261, term6261.getClass(), "first", term6255);
        setField(term6261, term6261.getClass(), "last", term6250);
        setField(term6261, term6261.getClass(), "propListHead", null);
        setIntField(term6261, term6261.getClass(), "sourcePosition", 0);
        setField(term6261, term6261.getClass(), "jsType", null);
        setField(term6261, term6261.getClass(), "parent", null);
        setField(term6259, term6259.getClass(), "next", term6261);
        setField(term6259, term6259.getClass(), "first", term6246);
        setField(term6259, term6259.getClass(), "last", term6246);
        setField(term6259, term6259.getClass(), "propListHead", null);
        setIntField(term6259, term6259.getClass(), "sourcePosition", 0);
        setField(term6259, term6259.getClass(), "jsType", null);
        setField(term6259, term6259.getClass(), "parent", null);
        setField(term6248, term6248.getClass(), "last", term6259);
        setField(term6248, term6248.getClass(), "propListHead", null);
        setIntField(term6248, term6248.getClass(), "sourcePosition", 0);
        setField(term6248, term6248.getClass(), "jsType", null);
        setField(term6248, term6248.getClass(), "parent", null);
        setField(term6246, term6246.getClass(), "next", term6248);
        setIntField(term6266, term6266.getClass(), "type", -1339778481);
        setField(term6266, term6266.getClass(), "next", term6259);
        setField(term6266, term6266.getClass(), "first", term6261);
        setField(term6266, term6266.getClass(), "last", term6244);
        setField(term6266, term6266.getClass(), "propListHead", null);
        setIntField(term6266, term6266.getClass(), "sourcePosition", 0);
        setField(term6266, term6266.getClass(), "jsType", null);
        setField(term6266, term6266.getClass(), "parent", null);
        setField(term6246, term6246.getClass(), "first", term6266);
        setField(term6246, term6246.getClass(), "last", term6266);
        setField(term6246, term6246.getClass(), "propListHead", null);
        setIntField(term6246, term6246.getClass(), "sourcePosition", 0);
        setField(term6246, term6246.getClass(), "jsType", null);
        setField(term6246, term6246.getClass(), "parent", null);
        setField(term6244, term6244.getClass(), "next", term6246);
        setField(term6244, term6244.getClass(), "first", term6250);
        setField(term6244, term6244.getClass(), "last", term6252);
        setField(term6244, term6244.getClass(), "propListHead", null);
        setIntField(term6244, term6244.getClass(), "sourcePosition", 0);
        setField(term6244, term6244.getClass(), "jsType", null);
        setField(term6244, term6244.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term6244;
        try {
            callMethod(klass, "add", argTypes, term6216, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


