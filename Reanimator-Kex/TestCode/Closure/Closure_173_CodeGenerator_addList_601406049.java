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

public class CodeGenerator_addList_601406049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10668;
     Object term10696;

    public CodeGenerator_addList_601406049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10669 = new HashMap();
        Class<? extends Object> term33366 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term33365 = ((Class) term33366).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term33365).setAccessible(true);
        Object enum89 = ((Field) term33365).get((Object) null);
        term10668 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term10668, term10668.getClass(), "escapedJsStrings", term10669);
        setField(term10668, term10668.getClass(), "cc", null);
        setField(term10668, term10668.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term10668, term10668.getClass(), "preferSingleQuotes", false);
        setBooleanField(term10668, term10668.getClass(), "trustedStrings", true);
        setField(term10668, term10668.getClass(), "languageMode", enum89);
        term10696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10696, term10696.getClass(), "type", 335112684);
        setIntField(term10698, term10698.getClass(), "type", 1551099402);
        setIntField(term10700, term10700.getClass(), "type", -2027534003);
        setIntField(term10702, term10702.getClass(), "type", 1063420942);
        setIntField(term10704, term10704.getClass(), "type", 1375330971);
        setField(term10704, term10704.getClass(), "next", null);
        setField(term10704, term10704.getClass(), "first", null);
        setField(term10704, term10704.getClass(), "last", null);
        setField(term10704, term10704.getClass(), "propListHead", null);
        setIntField(term10704, term10704.getClass(), "sourcePosition", 0);
        setField(term10704, term10704.getClass(), "jsType", null);
        setField(term10704, term10704.getClass(), "parent", null);
        setField(term10702, term10702.getClass(), "next", term10704);
        setIntField(term10707, term10707.getClass(), "type", -478195677);
        setField(term10707, term10707.getClass(), "next", null);
        setField(term10707, term10707.getClass(), "first", null);
        setField(term10707, term10707.getClass(), "last", term10704);
        setField(term10707, term10707.getClass(), "propListHead", null);
        setIntField(term10707, term10707.getClass(), "sourcePosition", 0);
        setField(term10707, term10707.getClass(), "jsType", null);
        setField(term10707, term10707.getClass(), "parent", null);
        setField(term10702, term10702.getClass(), "first", term10707);
        setField(term10702, term10702.getClass(), "last", term10700);
        setField(term10702, term10702.getClass(), "propListHead", null);
        setIntField(term10702, term10702.getClass(), "sourcePosition", 0);
        setField(term10702, term10702.getClass(), "jsType", null);
        setField(term10702, term10702.getClass(), "parent", null);
        setField(term10700, term10700.getClass(), "next", term10702);
        setField(term10700, term10700.getClass(), "first", term10704);
        setIntField(term10711, term10711.getClass(), "type", 1655935355);
        setIntField(term10713, term10713.getClass(), "type", -481533957);
        setField(term10713, term10713.getClass(), "next", null);
        setField(term10713, term10713.getClass(), "first", term10707);
        setField(term10713, term10713.getClass(), "last", term10702);
        setField(term10713, term10713.getClass(), "propListHead", null);
        setIntField(term10713, term10713.getClass(), "sourcePosition", 0);
        setField(term10713, term10713.getClass(), "jsType", null);
        setField(term10713, term10713.getClass(), "parent", null);
        setField(term10711, term10711.getClass(), "next", term10713);
        setField(term10711, term10711.getClass(), "first", term10698);
        setField(term10711, term10711.getClass(), "last", term10698);
        setField(term10711, term10711.getClass(), "propListHead", null);
        setIntField(term10711, term10711.getClass(), "sourcePosition", 0);
        setField(term10711, term10711.getClass(), "jsType", null);
        setField(term10711, term10711.getClass(), "parent", null);
        setField(term10700, term10700.getClass(), "last", term10711);
        setField(term10700, term10700.getClass(), "propListHead", null);
        setIntField(term10700, term10700.getClass(), "sourcePosition", 0);
        setField(term10700, term10700.getClass(), "jsType", null);
        setField(term10700, term10700.getClass(), "parent", null);
        setField(term10698, term10698.getClass(), "next", term10700);
        setIntField(term10718, term10718.getClass(), "type", 1240914516);
        setField(term10718, term10718.getClass(), "next", term10711);
        setField(term10718, term10718.getClass(), "first", term10713);
        setField(term10718, term10718.getClass(), "last", term10696);
        setField(term10718, term10718.getClass(), "propListHead", null);
        setIntField(term10718, term10718.getClass(), "sourcePosition", 0);
        setField(term10718, term10718.getClass(), "jsType", null);
        setField(term10718, term10718.getClass(), "parent", null);
        setField(term10698, term10698.getClass(), "first", term10718);
        setField(term10698, term10698.getClass(), "last", term10718);
        setField(term10698, term10698.getClass(), "propListHead", null);
        setIntField(term10698, term10698.getClass(), "sourcePosition", 0);
        setField(term10698, term10698.getClass(), "jsType", null);
        setField(term10698, term10698.getClass(), "parent", null);
        setField(term10696, term10696.getClass(), "next", term10698);
        setField(term10696, term10696.getClass(), "first", term10702);
        setField(term10696, term10696.getClass(), "last", term10704);
        setField(term10696, term10696.getClass(), "propListHead", null);
        setIntField(term10696, term10696.getClass(), "sourcePosition", 0);
        setField(term10696, term10696.getClass(), "jsType", null);
        setField(term10696, term10696.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term10696;
        try {
            callMethod(klass, "addList", argTypes, term10668, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


