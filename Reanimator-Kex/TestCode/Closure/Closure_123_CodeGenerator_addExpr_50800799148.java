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

public class CodeGenerator_addExpr_50800799148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9966;
     Object term9994;
     Object term10021;
     Object enum88;

    public CodeGenerator_addExpr_50800799148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9967 = new HashMap();
        Class<? extends Object> term32414 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term32413 = ((Class) term32414).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term32413).setAccessible(true);
        Object enum87 = ((Field) term32413).get((Object) null);
        term9966 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term9966, term9966.getClass(), "escapedJsStrings", term9967);
        setField(term9966, term9966.getClass(), "cc", null);
        setField(term9966, term9966.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term9966, term9966.getClass(), "preferSingleQuotes", false);
        setBooleanField(term9966, term9966.getClass(), "trustedStrings", true);
        setField(term9966, term9966.getClass(), "languageMode", enum87);
        term9994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10016 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9994, term9994.getClass(), "type", -2095575670);
        setIntField(term9996, term9996.getClass(), "type", 1225272962);
        setIntField(term9998, term9998.getClass(), "type", 1324040357);
        setIntField(term10000, term10000.getClass(), "type", -1588772968);
        setIntField(term10002, term10002.getClass(), "type", -93135961);
        setField(term10002, term10002.getClass(), "next", null);
        setField(term10002, term10002.getClass(), "first", null);
        setField(term10002, term10002.getClass(), "last", null);
        setField(term10002, term10002.getClass(), "propListHead", null);
        setIntField(term10002, term10002.getClass(), "sourcePosition", 0);
        setField(term10002, term10002.getClass(), "jsType", null);
        setField(term10002, term10002.getClass(), "parent", null);
        setField(term10000, term10000.getClass(), "next", term10002);
        setIntField(term10005, term10005.getClass(), "type", -112921587);
        setField(term10005, term10005.getClass(), "next", null);
        setField(term10005, term10005.getClass(), "first", null);
        setField(term10005, term10005.getClass(), "last", term10002);
        setField(term10005, term10005.getClass(), "propListHead", null);
        setIntField(term10005, term10005.getClass(), "sourcePosition", 0);
        setField(term10005, term10005.getClass(), "jsType", null);
        setField(term10005, term10005.getClass(), "parent", null);
        setField(term10000, term10000.getClass(), "first", term10005);
        setField(term10000, term10000.getClass(), "last", term9998);
        setField(term10000, term10000.getClass(), "propListHead", null);
        setIntField(term10000, term10000.getClass(), "sourcePosition", 0);
        setField(term10000, term10000.getClass(), "jsType", null);
        setField(term10000, term10000.getClass(), "parent", null);
        setField(term9998, term9998.getClass(), "next", term10000);
        setField(term9998, term9998.getClass(), "first", term10002);
        setIntField(term10009, term10009.getClass(), "type", 287287233);
        setIntField(term10011, term10011.getClass(), "type", 962840079);
        setField(term10011, term10011.getClass(), "next", null);
        setField(term10011, term10011.getClass(), "first", term10005);
        setField(term10011, term10011.getClass(), "last", term10000);
        setField(term10011, term10011.getClass(), "propListHead", null);
        setIntField(term10011, term10011.getClass(), "sourcePosition", 0);
        setField(term10011, term10011.getClass(), "jsType", null);
        setField(term10011, term10011.getClass(), "parent", null);
        setField(term10009, term10009.getClass(), "next", term10011);
        setField(term10009, term10009.getClass(), "first", term9996);
        setField(term10009, term10009.getClass(), "last", term9996);
        setField(term10009, term10009.getClass(), "propListHead", null);
        setIntField(term10009, term10009.getClass(), "sourcePosition", 0);
        setField(term10009, term10009.getClass(), "jsType", null);
        setField(term10009, term10009.getClass(), "parent", null);
        setField(term9998, term9998.getClass(), "last", term10009);
        setField(term9998, term9998.getClass(), "propListHead", null);
        setIntField(term9998, term9998.getClass(), "sourcePosition", 0);
        setField(term9998, term9998.getClass(), "jsType", null);
        setField(term9998, term9998.getClass(), "parent", null);
        setField(term9996, term9996.getClass(), "next", term9998);
        setIntField(term10016, term10016.getClass(), "type", 1540719661);
        setField(term10016, term10016.getClass(), "next", term10009);
        setField(term10016, term10016.getClass(), "first", term10011);
        setField(term10016, term10016.getClass(), "last", term9994);
        setField(term10016, term10016.getClass(), "propListHead", null);
        setIntField(term10016, term10016.getClass(), "sourcePosition", 0);
        setField(term10016, term10016.getClass(), "jsType", null);
        setField(term10016, term10016.getClass(), "parent", null);
        setField(term9996, term9996.getClass(), "first", term10016);
        setField(term9996, term9996.getClass(), "last", term10016);
        setField(term9996, term9996.getClass(), "propListHead", null);
        setIntField(term9996, term9996.getClass(), "sourcePosition", 0);
        setField(term9996, term9996.getClass(), "jsType", null);
        setField(term9996, term9996.getClass(), "parent", null);
        setField(term9994, term9994.getClass(), "next", term9996);
        setField(term9994, term9994.getClass(), "first", term10000);
        setField(term9994, term9994.getClass(), "last", term10002);
        setField(term9994, term9994.getClass(), "propListHead", null);
        setIntField(term9994, term9994.getClass(), "sourcePosition", 0);
        setField(term9994, term9994.getClass(), "jsType", null);
        setField(term9994, term9994.getClass(), "parent", null);
        term10021 = new Integer(1265463001);
        Class<? extends Object> term32739 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term32738 = ((Class) term32739).getDeclaredField((String) "PRESERVE_BLOCK");
        ((Field) term32738).setAccessible(true);
        enum88 = ((Field) term32738).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[3];
        args[0] = term9994;
        args[1] = term10021;
        args[2] = enum88;
        try {
            callMethod(klass, "addExpr", argTypes, term9966, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


