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
     Object term10665;
     Object term10693;

    public CodeGenerator_addList_601406049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10666 = new HashMap();
        Class<? extends Object> term33341 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term33340 = ((Class) term33341).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term33340).setAccessible(true);
        Object enum89 = ((Field) term33340).get((Object) null);
        term10665 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term10665, term10665.getClass(), "escapedJsStrings", term10666);
        setField(term10665, term10665.getClass(), "cc", null);
        setField(term10665, term10665.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term10665, term10665.getClass(), "preferSingleQuotes", true);
        setBooleanField(term10665, term10665.getClass(), "trustedStrings", true);
        setField(term10665, term10665.getClass(), "languageMode", enum89);
        term10693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10693, term10693.getClass(), "type", 335112684);
        setIntField(term10695, term10695.getClass(), "type", 1551099402);
        setIntField(term10697, term10697.getClass(), "type", -2027534003);
        setIntField(term10699, term10699.getClass(), "type", 1063420942);
        setIntField(term10701, term10701.getClass(), "type", 1375330971);
        setField(term10701, term10701.getClass(), "next", null);
        setField(term10701, term10701.getClass(), "first", null);
        setField(term10701, term10701.getClass(), "last", null);
        setField(term10701, term10701.getClass(), "propListHead", null);
        setIntField(term10701, term10701.getClass(), "sourcePosition", 0);
        setField(term10701, term10701.getClass(), "jsType", null);
        setField(term10701, term10701.getClass(), "parent", null);
        setField(term10699, term10699.getClass(), "next", term10701);
        setIntField(term10704, term10704.getClass(), "type", -478195677);
        setField(term10704, term10704.getClass(), "next", null);
        setField(term10704, term10704.getClass(), "first", null);
        setField(term10704, term10704.getClass(), "last", term10701);
        setField(term10704, term10704.getClass(), "propListHead", null);
        setIntField(term10704, term10704.getClass(), "sourcePosition", 0);
        setField(term10704, term10704.getClass(), "jsType", null);
        setField(term10704, term10704.getClass(), "parent", null);
        setField(term10699, term10699.getClass(), "first", term10704);
        setField(term10699, term10699.getClass(), "last", term10697);
        setField(term10699, term10699.getClass(), "propListHead", null);
        setIntField(term10699, term10699.getClass(), "sourcePosition", 0);
        setField(term10699, term10699.getClass(), "jsType", null);
        setField(term10699, term10699.getClass(), "parent", null);
        setField(term10697, term10697.getClass(), "next", term10699);
        setField(term10697, term10697.getClass(), "first", term10701);
        setIntField(term10708, term10708.getClass(), "type", 1655935355);
        setIntField(term10710, term10710.getClass(), "type", -481533957);
        setField(term10710, term10710.getClass(), "next", null);
        setField(term10710, term10710.getClass(), "first", term10704);
        setField(term10710, term10710.getClass(), "last", term10699);
        setField(term10710, term10710.getClass(), "propListHead", null);
        setIntField(term10710, term10710.getClass(), "sourcePosition", 0);
        setField(term10710, term10710.getClass(), "jsType", null);
        setField(term10710, term10710.getClass(), "parent", null);
        setField(term10708, term10708.getClass(), "next", term10710);
        setField(term10708, term10708.getClass(), "first", term10695);
        setField(term10708, term10708.getClass(), "last", term10695);
        setField(term10708, term10708.getClass(), "propListHead", null);
        setIntField(term10708, term10708.getClass(), "sourcePosition", 0);
        setField(term10708, term10708.getClass(), "jsType", null);
        setField(term10708, term10708.getClass(), "parent", null);
        setField(term10697, term10697.getClass(), "last", term10708);
        setField(term10697, term10697.getClass(), "propListHead", null);
        setIntField(term10697, term10697.getClass(), "sourcePosition", 0);
        setField(term10697, term10697.getClass(), "jsType", null);
        setField(term10697, term10697.getClass(), "parent", null);
        setField(term10695, term10695.getClass(), "next", term10697);
        setIntField(term10715, term10715.getClass(), "type", 1240914516);
        setField(term10715, term10715.getClass(), "next", term10708);
        setField(term10715, term10715.getClass(), "first", term10710);
        setField(term10715, term10715.getClass(), "last", term10693);
        setField(term10715, term10715.getClass(), "propListHead", null);
        setIntField(term10715, term10715.getClass(), "sourcePosition", 0);
        setField(term10715, term10715.getClass(), "jsType", null);
        setField(term10715, term10715.getClass(), "parent", null);
        setField(term10695, term10695.getClass(), "first", term10715);
        setField(term10695, term10695.getClass(), "last", term10715);
        setField(term10695, term10695.getClass(), "propListHead", null);
        setIntField(term10695, term10695.getClass(), "sourcePosition", 0);
        setField(term10695, term10695.getClass(), "jsType", null);
        setField(term10695, term10695.getClass(), "parent", null);
        setField(term10693, term10693.getClass(), "next", term10695);
        setField(term10693, term10693.getClass(), "first", term10699);
        setField(term10693, term10693.getClass(), "last", term10701);
        setField(term10693, term10693.getClass(), "propListHead", null);
        setIntField(term10693, term10693.getClass(), "sourcePosition", 0);
        setField(term10693, term10693.getClass(), "jsType", null);
        setField(term10693, term10693.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term10693;
        try {
            callMethod(klass, "addList", argTypes, term10665, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


