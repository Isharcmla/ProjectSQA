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

public class CodeGenerator_addJsString_102891780855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13321;
     Object term13349;

    public CodeGenerator_addJsString_102891780855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13322 = new HashMap();
        Class<? extends Object> term37367 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term37366 = ((Class) term37367).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term37366).setAccessible(true);
        Object enum96 = ((Field) term37366).get((Object) null);
        term13321 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term13321, term13321.getClass(), "escapedJsStrings", term13322);
        setField(term13321, term13321.getClass(), "cc", null);
        setField(term13321, term13321.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term13321, term13321.getClass(), "preferSingleQuotes", false);
        setBooleanField(term13321, term13321.getClass(), "trustedStrings", false);
        setField(term13321, term13321.getClass(), "languageMode", enum96);
        term13349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13349, term13349.getClass(), "type", 107945604);
        setIntField(term13351, term13351.getClass(), "type", -1963464809);
        setIntField(term13353, term13353.getClass(), "type", 71190297);
        setIntField(term13355, term13355.getClass(), "type", 1202361360);
        setIntField(term13357, term13357.getClass(), "type", -2015048153);
        setField(term13357, term13357.getClass(), "next", null);
        setField(term13357, term13357.getClass(), "first", null);
        setField(term13357, term13357.getClass(), "last", null);
        setField(term13357, term13357.getClass(), "propListHead", null);
        setIntField(term13357, term13357.getClass(), "sourcePosition", 0);
        setField(term13357, term13357.getClass(), "jsType", null);
        setField(term13357, term13357.getClass(), "parent", null);
        setField(term13355, term13355.getClass(), "next", term13357);
        setIntField(term13360, term13360.getClass(), "type", -2063457669);
        setField(term13360, term13360.getClass(), "next", null);
        setField(term13360, term13360.getClass(), "first", null);
        setField(term13360, term13360.getClass(), "last", term13357);
        setField(term13360, term13360.getClass(), "propListHead", null);
        setIntField(term13360, term13360.getClass(), "sourcePosition", 0);
        setField(term13360, term13360.getClass(), "jsType", null);
        setField(term13360, term13360.getClass(), "parent", null);
        setField(term13355, term13355.getClass(), "first", term13360);
        setField(term13355, term13355.getClass(), "last", term13353);
        setField(term13355, term13355.getClass(), "propListHead", null);
        setIntField(term13355, term13355.getClass(), "sourcePosition", 0);
        setField(term13355, term13355.getClass(), "jsType", null);
        setField(term13355, term13355.getClass(), "parent", null);
        setField(term13353, term13353.getClass(), "next", term13355);
        setField(term13353, term13353.getClass(), "first", term13357);
        setIntField(term13364, term13364.getClass(), "type", 2095798786);
        setIntField(term13366, term13366.getClass(), "type", -1565502840);
        setField(term13366, term13366.getClass(), "next", null);
        setField(term13366, term13366.getClass(), "first", term13360);
        setField(term13366, term13366.getClass(), "last", term13355);
        setField(term13366, term13366.getClass(), "propListHead", null);
        setIntField(term13366, term13366.getClass(), "sourcePosition", 0);
        setField(term13366, term13366.getClass(), "jsType", null);
        setField(term13366, term13366.getClass(), "parent", null);
        setField(term13364, term13364.getClass(), "next", term13366);
        setField(term13364, term13364.getClass(), "first", term13351);
        setField(term13364, term13364.getClass(), "last", term13351);
        setField(term13364, term13364.getClass(), "propListHead", null);
        setIntField(term13364, term13364.getClass(), "sourcePosition", 0);
        setField(term13364, term13364.getClass(), "jsType", null);
        setField(term13364, term13364.getClass(), "parent", null);
        setField(term13353, term13353.getClass(), "last", term13364);
        setField(term13353, term13353.getClass(), "propListHead", null);
        setIntField(term13353, term13353.getClass(), "sourcePosition", 0);
        setField(term13353, term13353.getClass(), "jsType", null);
        setField(term13353, term13353.getClass(), "parent", null);
        setField(term13351, term13351.getClass(), "next", term13353);
        setIntField(term13371, term13371.getClass(), "type", 344323424);
        setField(term13371, term13371.getClass(), "next", term13364);
        setField(term13371, term13371.getClass(), "first", term13366);
        setField(term13371, term13371.getClass(), "last", term13349);
        setField(term13371, term13371.getClass(), "propListHead", null);
        setIntField(term13371, term13371.getClass(), "sourcePosition", 0);
        setField(term13371, term13371.getClass(), "jsType", null);
        setField(term13371, term13371.getClass(), "parent", null);
        setField(term13351, term13351.getClass(), "first", term13371);
        setField(term13351, term13351.getClass(), "last", term13371);
        setField(term13351, term13351.getClass(), "propListHead", null);
        setIntField(term13351, term13351.getClass(), "sourcePosition", 0);
        setField(term13351, term13351.getClass(), "jsType", null);
        setField(term13351, term13351.getClass(), "parent", null);
        setField(term13349, term13349.getClass(), "next", term13351);
        setField(term13349, term13349.getClass(), "first", term13355);
        setField(term13349, term13349.getClass(), "last", term13357);
        setField(term13349, term13349.getClass(), "propListHead", null);
        setIntField(term13349, term13349.getClass(), "sourcePosition", 0);
        setField(term13349, term13349.getClass(), "jsType", null);
        setField(term13349, term13349.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13349;
        try {
            callMethod(klass, "addJsString", argTypes, term13321, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


