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
     Object term9969;
     Object term9997;
     Object term10024;
     Object enum88;

    public CodeGenerator_addExpr_50800799148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9970 = new HashMap();
        Class<? extends Object> term32439 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term32438 = ((Class) term32439).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term32438).setAccessible(true);
        Object enum87 = ((Field) term32438).get((Object) null);
        term9969 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term9969, term9969.getClass(), "escapedJsStrings", term9970);
        setField(term9969, term9969.getClass(), "cc", null);
        setField(term9969, term9969.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term9969, term9969.getClass(), "preferSingleQuotes", true);
        setBooleanField(term9969, term9969.getClass(), "trustedStrings", true);
        setField(term9969, term9969.getClass(), "languageMode", enum87);
        term9997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9997, term9997.getClass(), "type", -2095575670);
        setIntField(term9999, term9999.getClass(), "type", 1225272962);
        setIntField(term10001, term10001.getClass(), "type", 1324040357);
        setIntField(term10003, term10003.getClass(), "type", -1588772968);
        setIntField(term10005, term10005.getClass(), "type", -93135961);
        setField(term10005, term10005.getClass(), "next", null);
        setField(term10005, term10005.getClass(), "first", null);
        setField(term10005, term10005.getClass(), "last", null);
        setField(term10005, term10005.getClass(), "propListHead", null);
        setIntField(term10005, term10005.getClass(), "sourcePosition", 0);
        setField(term10005, term10005.getClass(), "jsType", null);
        setField(term10005, term10005.getClass(), "parent", null);
        setField(term10003, term10003.getClass(), "next", term10005);
        setIntField(term10008, term10008.getClass(), "type", -112921587);
        setField(term10008, term10008.getClass(), "next", null);
        setField(term10008, term10008.getClass(), "first", null);
        setField(term10008, term10008.getClass(), "last", term10005);
        setField(term10008, term10008.getClass(), "propListHead", null);
        setIntField(term10008, term10008.getClass(), "sourcePosition", 0);
        setField(term10008, term10008.getClass(), "jsType", null);
        setField(term10008, term10008.getClass(), "parent", null);
        setField(term10003, term10003.getClass(), "first", term10008);
        setField(term10003, term10003.getClass(), "last", term10001);
        setField(term10003, term10003.getClass(), "propListHead", null);
        setIntField(term10003, term10003.getClass(), "sourcePosition", 0);
        setField(term10003, term10003.getClass(), "jsType", null);
        setField(term10003, term10003.getClass(), "parent", null);
        setField(term10001, term10001.getClass(), "next", term10003);
        setField(term10001, term10001.getClass(), "first", term10005);
        setIntField(term10012, term10012.getClass(), "type", 287287233);
        setIntField(term10014, term10014.getClass(), "type", 962840079);
        setField(term10014, term10014.getClass(), "next", null);
        setField(term10014, term10014.getClass(), "first", term10008);
        setField(term10014, term10014.getClass(), "last", term10003);
        setField(term10014, term10014.getClass(), "propListHead", null);
        setIntField(term10014, term10014.getClass(), "sourcePosition", 0);
        setField(term10014, term10014.getClass(), "jsType", null);
        setField(term10014, term10014.getClass(), "parent", null);
        setField(term10012, term10012.getClass(), "next", term10014);
        setField(term10012, term10012.getClass(), "first", term9999);
        setField(term10012, term10012.getClass(), "last", term9999);
        setField(term10012, term10012.getClass(), "propListHead", null);
        setIntField(term10012, term10012.getClass(), "sourcePosition", 0);
        setField(term10012, term10012.getClass(), "jsType", null);
        setField(term10012, term10012.getClass(), "parent", null);
        setField(term10001, term10001.getClass(), "last", term10012);
        setField(term10001, term10001.getClass(), "propListHead", null);
        setIntField(term10001, term10001.getClass(), "sourcePosition", 0);
        setField(term10001, term10001.getClass(), "jsType", null);
        setField(term10001, term10001.getClass(), "parent", null);
        setField(term9999, term9999.getClass(), "next", term10001);
        setIntField(term10019, term10019.getClass(), "type", 1540719661);
        setField(term10019, term10019.getClass(), "next", term10012);
        setField(term10019, term10019.getClass(), "first", term10014);
        setField(term10019, term10019.getClass(), "last", term9997);
        setField(term10019, term10019.getClass(), "propListHead", null);
        setIntField(term10019, term10019.getClass(), "sourcePosition", 0);
        setField(term10019, term10019.getClass(), "jsType", null);
        setField(term10019, term10019.getClass(), "parent", null);
        setField(term9999, term9999.getClass(), "first", term10019);
        setField(term9999, term9999.getClass(), "last", term10019);
        setField(term9999, term9999.getClass(), "propListHead", null);
        setIntField(term9999, term9999.getClass(), "sourcePosition", 0);
        setField(term9999, term9999.getClass(), "jsType", null);
        setField(term9999, term9999.getClass(), "parent", null);
        setField(term9997, term9997.getClass(), "next", term9999);
        setField(term9997, term9997.getClass(), "first", term10003);
        setField(term9997, term9997.getClass(), "last", term10005);
        setField(term9997, term9997.getClass(), "propListHead", null);
        setIntField(term9997, term9997.getClass(), "sourcePosition", 0);
        setField(term9997, term9997.getClass(), "jsType", null);
        setField(term9997, term9997.getClass(), "parent", null);
        term10024 = new Integer(1265463001);
        Class<? extends Object> term32764 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term32763 = ((Class) term32764).getDeclaredField((String) "PRESERVE_BLOCK");
        ((Field) term32763).setAccessible(true);
        enum88 = ((Field) term32763).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[3];
        args[0] = term9997;
        args[1] = term10024;
        args[2] = enum88;
        try {
            callMethod(klass, "addExpr", argTypes, term9969, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


