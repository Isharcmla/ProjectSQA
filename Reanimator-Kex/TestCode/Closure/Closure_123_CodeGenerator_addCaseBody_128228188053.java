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

public class CodeGenerator_addCaseBody_128228188053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12558;
     Object term12586;

    public CodeGenerator_addCaseBody_128228188053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12559 = new HashMap();
        Class<? extends Object> term36139 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term36138 = ((Class) term36139).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term36138).setAccessible(true);
        Object enum94 = ((Field) term36138).get((Object) null);
        term12558 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term12558, term12558.getClass(), "escapedJsStrings", term12559);
        setField(term12558, term12558.getClass(), "cc", null);
        setField(term12558, term12558.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term12558, term12558.getClass(), "preferSingleQuotes", false);
        setBooleanField(term12558, term12558.getClass(), "trustedStrings", true);
        setField(term12558, term12558.getClass(), "languageMode", enum94);
        term12586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12586, term12586.getClass(), "type", 890669485);
        setIntField(term12588, term12588.getClass(), "type", 691577392);
        setIntField(term12590, term12590.getClass(), "type", -893623680);
        setIntField(term12592, term12592.getClass(), "type", -1963434938);
        setIntField(term12594, term12594.getClass(), "type", 906181092);
        setField(term12594, term12594.getClass(), "next", null);
        setField(term12594, term12594.getClass(), "first", null);
        setField(term12594, term12594.getClass(), "last", null);
        setField(term12594, term12594.getClass(), "propListHead", null);
        setIntField(term12594, term12594.getClass(), "sourcePosition", 0);
        setField(term12594, term12594.getClass(), "jsType", null);
        setField(term12594, term12594.getClass(), "parent", null);
        setField(term12592, term12592.getClass(), "next", term12594);
        setIntField(term12597, term12597.getClass(), "type", 1045657203);
        setField(term12597, term12597.getClass(), "next", null);
        setField(term12597, term12597.getClass(), "first", null);
        setField(term12597, term12597.getClass(), "last", term12594);
        setField(term12597, term12597.getClass(), "propListHead", null);
        setIntField(term12597, term12597.getClass(), "sourcePosition", 0);
        setField(term12597, term12597.getClass(), "jsType", null);
        setField(term12597, term12597.getClass(), "parent", null);
        setField(term12592, term12592.getClass(), "first", term12597);
        setField(term12592, term12592.getClass(), "last", term12590);
        setField(term12592, term12592.getClass(), "propListHead", null);
        setIntField(term12592, term12592.getClass(), "sourcePosition", 0);
        setField(term12592, term12592.getClass(), "jsType", null);
        setField(term12592, term12592.getClass(), "parent", null);
        setField(term12590, term12590.getClass(), "next", term12592);
        setField(term12590, term12590.getClass(), "first", term12594);
        setIntField(term12601, term12601.getClass(), "type", 1072005683);
        setIntField(term12603, term12603.getClass(), "type", 1861318859);
        setField(term12603, term12603.getClass(), "next", null);
        setField(term12603, term12603.getClass(), "first", term12597);
        setField(term12603, term12603.getClass(), "last", term12592);
        setField(term12603, term12603.getClass(), "propListHead", null);
        setIntField(term12603, term12603.getClass(), "sourcePosition", 0);
        setField(term12603, term12603.getClass(), "jsType", null);
        setField(term12603, term12603.getClass(), "parent", null);
        setField(term12601, term12601.getClass(), "next", term12603);
        setField(term12601, term12601.getClass(), "first", term12588);
        setField(term12601, term12601.getClass(), "last", term12588);
        setField(term12601, term12601.getClass(), "propListHead", null);
        setIntField(term12601, term12601.getClass(), "sourcePosition", 0);
        setField(term12601, term12601.getClass(), "jsType", null);
        setField(term12601, term12601.getClass(), "parent", null);
        setField(term12590, term12590.getClass(), "last", term12601);
        setField(term12590, term12590.getClass(), "propListHead", null);
        setIntField(term12590, term12590.getClass(), "sourcePosition", 0);
        setField(term12590, term12590.getClass(), "jsType", null);
        setField(term12590, term12590.getClass(), "parent", null);
        setField(term12588, term12588.getClass(), "next", term12590);
        setIntField(term12608, term12608.getClass(), "type", 1474524152);
        setField(term12608, term12608.getClass(), "next", term12601);
        setField(term12608, term12608.getClass(), "first", term12603);
        setField(term12608, term12608.getClass(), "last", term12586);
        setField(term12608, term12608.getClass(), "propListHead", null);
        setIntField(term12608, term12608.getClass(), "sourcePosition", 0);
        setField(term12608, term12608.getClass(), "jsType", null);
        setField(term12608, term12608.getClass(), "parent", null);
        setField(term12588, term12588.getClass(), "first", term12608);
        setField(term12588, term12588.getClass(), "last", term12608);
        setField(term12588, term12588.getClass(), "propListHead", null);
        setIntField(term12588, term12588.getClass(), "sourcePosition", 0);
        setField(term12588, term12588.getClass(), "jsType", null);
        setField(term12588, term12588.getClass(), "parent", null);
        setField(term12586, term12586.getClass(), "next", term12588);
        setField(term12586, term12586.getClass(), "first", term12592);
        setField(term12586, term12586.getClass(), "last", term12594);
        setField(term12586, term12586.getClass(), "propListHead", null);
        setIntField(term12586, term12586.getClass(), "sourcePosition", 0);
        setField(term12586, term12586.getClass(), "jsType", null);
        setField(term12586, term12586.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term12586;
        try {
            callMethod(klass, "addCaseBody", argTypes, term12558, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


