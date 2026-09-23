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

public class CodeGenerator_addAllSiblings_124279642254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12941;
     Object term12969;

    public CodeGenerator_addAllSiblings_124279642254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12942 = new HashMap();
        Class<? extends Object> term36737 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term36736 = ((Class) term36737).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term36736).setAccessible(true);
        Object enum95 = ((Field) term36736).get((Object) null);
        term12941 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term12941, term12941.getClass(), "escapedJsStrings", term12942);
        setField(term12941, term12941.getClass(), "cc", null);
        setField(term12941, term12941.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term12941, term12941.getClass(), "preferSingleQuotes", false);
        setBooleanField(term12941, term12941.getClass(), "trustedStrings", false);
        setField(term12941, term12941.getClass(), "languageMode", enum95);
        term12969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12969, term12969.getClass(), "type", 568954359);
        setIntField(term12971, term12971.getClass(), "type", 53410913);
        setIntField(term12973, term12973.getClass(), "type", -375014958);
        setIntField(term12975, term12975.getClass(), "type", 1107176718);
        setIntField(term12977, term12977.getClass(), "type", 480137250);
        setField(term12977, term12977.getClass(), "next", null);
        setField(term12977, term12977.getClass(), "first", null);
        setField(term12977, term12977.getClass(), "last", null);
        setField(term12977, term12977.getClass(), "propListHead", null);
        setIntField(term12977, term12977.getClass(), "sourcePosition", 0);
        setField(term12977, term12977.getClass(), "jsType", null);
        setField(term12977, term12977.getClass(), "parent", null);
        setField(term12975, term12975.getClass(), "next", term12977);
        setIntField(term12980, term12980.getClass(), "type", -341152642);
        setField(term12980, term12980.getClass(), "next", null);
        setField(term12980, term12980.getClass(), "first", null);
        setField(term12980, term12980.getClass(), "last", term12977);
        setField(term12980, term12980.getClass(), "propListHead", null);
        setIntField(term12980, term12980.getClass(), "sourcePosition", 0);
        setField(term12980, term12980.getClass(), "jsType", null);
        setField(term12980, term12980.getClass(), "parent", null);
        setField(term12975, term12975.getClass(), "first", term12980);
        setField(term12975, term12975.getClass(), "last", term12973);
        setField(term12975, term12975.getClass(), "propListHead", null);
        setIntField(term12975, term12975.getClass(), "sourcePosition", 0);
        setField(term12975, term12975.getClass(), "jsType", null);
        setField(term12975, term12975.getClass(), "parent", null);
        setField(term12973, term12973.getClass(), "next", term12975);
        setField(term12973, term12973.getClass(), "first", term12977);
        setIntField(term12984, term12984.getClass(), "type", 538259104);
        setIntField(term12986, term12986.getClass(), "type", 96566506);
        setField(term12986, term12986.getClass(), "next", null);
        setField(term12986, term12986.getClass(), "first", term12980);
        setField(term12986, term12986.getClass(), "last", term12975);
        setField(term12986, term12986.getClass(), "propListHead", null);
        setIntField(term12986, term12986.getClass(), "sourcePosition", 0);
        setField(term12986, term12986.getClass(), "jsType", null);
        setField(term12986, term12986.getClass(), "parent", null);
        setField(term12984, term12984.getClass(), "next", term12986);
        setField(term12984, term12984.getClass(), "first", term12971);
        setField(term12984, term12984.getClass(), "last", term12971);
        setField(term12984, term12984.getClass(), "propListHead", null);
        setIntField(term12984, term12984.getClass(), "sourcePosition", 0);
        setField(term12984, term12984.getClass(), "jsType", null);
        setField(term12984, term12984.getClass(), "parent", null);
        setField(term12973, term12973.getClass(), "last", term12984);
        setField(term12973, term12973.getClass(), "propListHead", null);
        setIntField(term12973, term12973.getClass(), "sourcePosition", 0);
        setField(term12973, term12973.getClass(), "jsType", null);
        setField(term12973, term12973.getClass(), "parent", null);
        setField(term12971, term12971.getClass(), "next", term12973);
        setIntField(term12991, term12991.getClass(), "type", -343325701);
        setField(term12991, term12991.getClass(), "next", term12984);
        setField(term12991, term12991.getClass(), "first", term12986);
        setField(term12991, term12991.getClass(), "last", term12969);
        setField(term12991, term12991.getClass(), "propListHead", null);
        setIntField(term12991, term12991.getClass(), "sourcePosition", 0);
        setField(term12991, term12991.getClass(), "jsType", null);
        setField(term12991, term12991.getClass(), "parent", null);
        setField(term12971, term12971.getClass(), "first", term12991);
        setField(term12971, term12971.getClass(), "last", term12991);
        setField(term12971, term12971.getClass(), "propListHead", null);
        setIntField(term12971, term12971.getClass(), "sourcePosition", 0);
        setField(term12971, term12971.getClass(), "jsType", null);
        setField(term12971, term12971.getClass(), "parent", null);
        setField(term12969, term12969.getClass(), "next", term12971);
        setField(term12969, term12969.getClass(), "first", term12975);
        setField(term12969, term12969.getClass(), "last", term12977);
        setField(term12969, term12969.getClass(), "propListHead", null);
        setIntField(term12969, term12969.getClass(), "sourcePosition", 0);
        setField(term12969, term12969.getClass(), "jsType", null);
        setField(term12969, term12969.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term12969;
        try {
            callMethod(klass, "addAllSiblings", argTypes, term12941, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


