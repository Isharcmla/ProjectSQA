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
import java.lang.Boolean;

public class CodeGenerator_addList_71041459250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11045;
     Object term11073;
     Object term11100;

    public CodeGenerator_addList_71041459250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11046 = new HashMap();
        Class<? extends Object> term33971 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term33970 = ((Class) term33971).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term33970).setAccessible(true);
        Object enum90 = ((Field) term33970).get((Object) null);
        term11045 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term11045, term11045.getClass(), "escapedJsStrings", term11046);
        setField(term11045, term11045.getClass(), "cc", null);
        setField(term11045, term11045.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term11045, term11045.getClass(), "preferSingleQuotes", false);
        setBooleanField(term11045, term11045.getClass(), "trustedStrings", true);
        setField(term11045, term11045.getClass(), "languageMode", enum90);
        term11073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11073, term11073.getClass(), "type", -1465035361);
        setIntField(term11075, term11075.getClass(), "type", 1090617576);
        setIntField(term11077, term11077.getClass(), "type", -1547384488);
        setIntField(term11079, term11079.getClass(), "type", 1442160736);
        setIntField(term11081, term11081.getClass(), "type", 1114000454);
        setField(term11081, term11081.getClass(), "next", null);
        setField(term11081, term11081.getClass(), "first", null);
        setField(term11081, term11081.getClass(), "last", null);
        setField(term11081, term11081.getClass(), "propListHead", null);
        setIntField(term11081, term11081.getClass(), "sourcePosition", 0);
        setField(term11081, term11081.getClass(), "jsType", null);
        setField(term11081, term11081.getClass(), "parent", null);
        setField(term11079, term11079.getClass(), "next", term11081);
        setIntField(term11084, term11084.getClass(), "type", -556405712);
        setField(term11084, term11084.getClass(), "next", null);
        setField(term11084, term11084.getClass(), "first", null);
        setField(term11084, term11084.getClass(), "last", term11081);
        setField(term11084, term11084.getClass(), "propListHead", null);
        setIntField(term11084, term11084.getClass(), "sourcePosition", 0);
        setField(term11084, term11084.getClass(), "jsType", null);
        setField(term11084, term11084.getClass(), "parent", null);
        setField(term11079, term11079.getClass(), "first", term11084);
        setField(term11079, term11079.getClass(), "last", term11077);
        setField(term11079, term11079.getClass(), "propListHead", null);
        setIntField(term11079, term11079.getClass(), "sourcePosition", 0);
        setField(term11079, term11079.getClass(), "jsType", null);
        setField(term11079, term11079.getClass(), "parent", null);
        setField(term11077, term11077.getClass(), "next", term11079);
        setField(term11077, term11077.getClass(), "first", term11081);
        setIntField(term11088, term11088.getClass(), "type", -1845499264);
        setIntField(term11090, term11090.getClass(), "type", -505439934);
        setField(term11090, term11090.getClass(), "next", null);
        setField(term11090, term11090.getClass(), "first", term11084);
        setField(term11090, term11090.getClass(), "last", term11079);
        setField(term11090, term11090.getClass(), "propListHead", null);
        setIntField(term11090, term11090.getClass(), "sourcePosition", 0);
        setField(term11090, term11090.getClass(), "jsType", null);
        setField(term11090, term11090.getClass(), "parent", null);
        setField(term11088, term11088.getClass(), "next", term11090);
        setField(term11088, term11088.getClass(), "first", term11075);
        setField(term11088, term11088.getClass(), "last", term11075);
        setField(term11088, term11088.getClass(), "propListHead", null);
        setIntField(term11088, term11088.getClass(), "sourcePosition", 0);
        setField(term11088, term11088.getClass(), "jsType", null);
        setField(term11088, term11088.getClass(), "parent", null);
        setField(term11077, term11077.getClass(), "last", term11088);
        setField(term11077, term11077.getClass(), "propListHead", null);
        setIntField(term11077, term11077.getClass(), "sourcePosition", 0);
        setField(term11077, term11077.getClass(), "jsType", null);
        setField(term11077, term11077.getClass(), "parent", null);
        setField(term11075, term11075.getClass(), "next", term11077);
        setIntField(term11095, term11095.getClass(), "type", -344842608);
        setField(term11095, term11095.getClass(), "next", term11088);
        setField(term11095, term11095.getClass(), "first", term11090);
        setField(term11095, term11095.getClass(), "last", term11073);
        setField(term11095, term11095.getClass(), "propListHead", null);
        setIntField(term11095, term11095.getClass(), "sourcePosition", 0);
        setField(term11095, term11095.getClass(), "jsType", null);
        setField(term11095, term11095.getClass(), "parent", null);
        setField(term11075, term11075.getClass(), "first", term11095);
        setField(term11075, term11075.getClass(), "last", term11095);
        setField(term11075, term11075.getClass(), "propListHead", null);
        setIntField(term11075, term11075.getClass(), "sourcePosition", 0);
        setField(term11075, term11075.getClass(), "jsType", null);
        setField(term11075, term11075.getClass(), "parent", null);
        setField(term11073, term11073.getClass(), "next", term11075);
        setField(term11073, term11073.getClass(), "first", term11079);
        setField(term11073, term11073.getClass(), "last", term11081);
        setField(term11073, term11073.getClass(), "propListHead", null);
        setIntField(term11073, term11073.getClass(), "sourcePosition", 0);
        setField(term11073, term11073.getClass(), "jsType", null);
        setField(term11073, term11073.getClass(), "parent", null);
        term11100 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term11073;
        args[1] = term11100;
        try {
            callMethod(klass, "addList", argTypes, term11045, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


