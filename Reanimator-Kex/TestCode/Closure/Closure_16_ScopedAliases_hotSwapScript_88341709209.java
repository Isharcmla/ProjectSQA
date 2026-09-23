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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class ScopedAliases_hotSwapScript_88341709209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128240;
     Object term128310;
     Object term129408;
     Object term129409;

    public ScopedAliases_hotSwapScript_88341709209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128240 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term128240, term128240.getClass(), "compiler", null);
        term128310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term128310, term128310.getClass(), "type", 0);
        setField(term128310, term128310.getClass(), "parent", null);
        setField(term128450, term128450.getClass(), "next", null);
        setIntField(term128450, term128450.getClass(), "type", 0);
        setField(term128450, term128450.getClass(), "first", null);
        setField(term128380, term128380.getClass(), "next", term128450);
        setIntField(term128380, term128380.getClass(), "type", 0);
        setField(term128660, term128660.getClass(), "next", null);
        setIntField(term128660, term128660.getClass(), "type", 0);
        setField(term128660, term128660.getClass(), "first", null);
        setField(term128590, term128590.getClass(), "next", term128660);
        setIntField(term128590, term128590.getClass(), "type", 105);
        setField(term128520, term128520.getClass(), "next", term128590);
        setIntField(term128520, term128520.getClass(), "type", 105);
        setField(term128380, term128380.getClass(), "first", term128520);
        setField(term128310, term128310.getClass(), "first", term128380);
        term129408 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term129408, term129408.getClass(), "compiler", null);
        setField(term129408, term129408.getClass(), "preprocessorSymbolTable", null);
        setField(term129408, term129408.getClass(), "transformationHandler", null);
        term129409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term129409, term129409.getClass(), "type", 0);
        setField(term129409, term129409.getClass(), "next", null);
        setIntField(term129410, term129410.getClass(), "type", 0);
        setIntField(term129411, term129411.getClass(), "type", 0);
        setField(term129411, term129411.getClass(), "next", null);
        setField(term129411, term129411.getClass(), "first", null);
        setField(term129411, term129411.getClass(), "last", null);
        setField(term129411, term129411.getClass(), "propListHead", null);
        setIntField(term129411, term129411.getClass(), "sourcePosition", 0);
        setField(term129411, term129411.getClass(), "jsType", null);
        setField(term129411, term129411.getClass(), "parent", null);
        setField(term129410, term129410.getClass(), "next", term129411);
        setIntField(term129412, term129412.getClass(), "type", 105);
        setIntField(term129413, term129413.getClass(), "type", 105);
        setIntField(term129414, term129414.getClass(), "type", 0);
        setField(term129414, term129414.getClass(), "next", null);
        setField(term129414, term129414.getClass(), "first", null);
        setField(term129414, term129414.getClass(), "last", null);
        setField(term129414, term129414.getClass(), "propListHead", null);
        setIntField(term129414, term129414.getClass(), "sourcePosition", 0);
        setField(term129414, term129414.getClass(), "jsType", null);
        setField(term129414, term129414.getClass(), "parent", null);
        setField(term129413, term129413.getClass(), "next", term129414);
        setField(term129413, term129413.getClass(), "first", null);
        setField(term129413, term129413.getClass(), "last", null);
        setField(term129413, term129413.getClass(), "propListHead", null);
        setIntField(term129413, term129413.getClass(), "sourcePosition", 0);
        setField(term129413, term129413.getClass(), "jsType", null);
        setField(term129413, term129413.getClass(), "parent", null);
        setField(term129412, term129412.getClass(), "next", term129413);
        setField(term129412, term129412.getClass(), "first", null);
        setField(term129412, term129412.getClass(), "last", null);
        setField(term129412, term129412.getClass(), "propListHead", null);
        setIntField(term129412, term129412.getClass(), "sourcePosition", 0);
        setField(term129412, term129412.getClass(), "jsType", null);
        setField(term129412, term129412.getClass(), "parent", null);
        setField(term129410, term129410.getClass(), "first", term129412);
        setField(term129410, term129410.getClass(), "last", null);
        setField(term129410, term129410.getClass(), "propListHead", null);
        setIntField(term129410, term129410.getClass(), "sourcePosition", 0);
        setField(term129410, term129410.getClass(), "jsType", null);
        setField(term129410, term129410.getClass(), "parent", null);
        setField(term129409, term129409.getClass(), "first", term129410);
        setField(term129409, term129409.getClass(), "last", null);
        setField(term129409, term129409.getClass(), "propListHead", null);
        setIntField(term129409, term129409.getClass(), "sourcePosition", 0);
        setField(term129409, term129409.getClass(), "jsType", null);
        setField(term129409, term129409.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term128310;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term128240, args);
        assertTrue(recursiveEquals(term128240, term129408));
        assertTrue(recursiveEquals(term128310, term129409));
    }

};


