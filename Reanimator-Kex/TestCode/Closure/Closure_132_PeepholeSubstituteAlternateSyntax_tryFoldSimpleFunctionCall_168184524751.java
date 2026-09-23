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
import java.lang.Object;

public class PeepholeSubstituteAlternateSyntax_tryFoldSimpleFunctionCall_168184524751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63;
     Object term66;

    public PeepholeSubstituteAlternateSyntax_tryFoldSimpleFunctionCall_168184524751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term63, term63.getClass(), "late", false);
        setIntField(term63, term63.getClass(), "STRING_SPLIT_OVERHEAD", -2068769794);
        setField(term63, term63.getClass(), "compiler", null);
        term66 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66, term66.getClass(), "type", -117576464);
        setIntField(term68, term68.getClass(), "type", -1007160944);
        setIntField(term70, term70.getClass(), "type", 1135664017);
        setIntField(term72, term72.getClass(), "type", 590364439);
        setIntField(term74, term74.getClass(), "type", 865208305);
        setField(term74, term74.getClass(), "next", null);
        setField(term74, term74.getClass(), "first", null);
        setField(term74, term74.getClass(), "last", null);
        setField(term74, term74.getClass(), "propListHead", null);
        setIntField(term74, term74.getClass(), "sourcePosition", 0);
        setField(term74, term74.getClass(), "jsType", null);
        setField(term74, term74.getClass(), "parent", null);
        setField(term72, term72.getClass(), "next", term74);
        setIntField(term77, term77.getClass(), "type", -1275173084);
        setField(term77, term77.getClass(), "next", null);
        setField(term77, term77.getClass(), "first", null);
        setField(term77, term77.getClass(), "last", term74);
        setField(term77, term77.getClass(), "propListHead", null);
        setIntField(term77, term77.getClass(), "sourcePosition", 0);
        setField(term77, term77.getClass(), "jsType", null);
        setField(term77, term77.getClass(), "parent", null);
        setField(term72, term72.getClass(), "first", term77);
        setField(term72, term72.getClass(), "last", term70);
        setField(term72, term72.getClass(), "propListHead", null);
        setIntField(term72, term72.getClass(), "sourcePosition", 0);
        setField(term72, term72.getClass(), "jsType", null);
        setField(term72, term72.getClass(), "parent", null);
        setField(term70, term70.getClass(), "next", term72);
        setField(term70, term70.getClass(), "first", term74);
        setIntField(term81, term81.getClass(), "type", -203030934);
        setIntField(term83, term83.getClass(), "type", -1179120542);
        setField(term83, term83.getClass(), "next", null);
        setField(term83, term83.getClass(), "first", term77);
        setField(term83, term83.getClass(), "last", term72);
        setField(term83, term83.getClass(), "propListHead", null);
        setIntField(term83, term83.getClass(), "sourcePosition", 0);
        setField(term83, term83.getClass(), "jsType", null);
        setField(term83, term83.getClass(), "parent", null);
        setField(term81, term81.getClass(), "next", term83);
        setField(term81, term81.getClass(), "first", term68);
        setField(term81, term81.getClass(), "last", term68);
        setField(term81, term81.getClass(), "propListHead", null);
        setIntField(term81, term81.getClass(), "sourcePosition", 0);
        setField(term81, term81.getClass(), "jsType", null);
        setField(term81, term81.getClass(), "parent", null);
        setField(term70, term70.getClass(), "last", term81);
        setField(term70, term70.getClass(), "propListHead", null);
        setIntField(term70, term70.getClass(), "sourcePosition", 0);
        setField(term70, term70.getClass(), "jsType", null);
        setField(term70, term70.getClass(), "parent", null);
        setField(term68, term68.getClass(), "next", term70);
        setIntField(term88, term88.getClass(), "type", -73683645);
        setField(term88, term88.getClass(), "next", term81);
        setField(term88, term88.getClass(), "first", term83);
        setField(term88, term88.getClass(), "last", term66);
        setField(term88, term88.getClass(), "propListHead", null);
        setIntField(term88, term88.getClass(), "sourcePosition", 0);
        setField(term88, term88.getClass(), "jsType", null);
        setField(term88, term88.getClass(), "parent", null);
        setField(term68, term68.getClass(), "first", term88);
        setField(term68, term68.getClass(), "last", term88);
        setField(term68, term68.getClass(), "propListHead", null);
        setIntField(term68, term68.getClass(), "sourcePosition", 0);
        setField(term68, term68.getClass(), "jsType", null);
        setField(term68, term68.getClass(), "parent", null);
        setField(term66, term66.getClass(), "next", term68);
        setField(term66, term66.getClass(), "first", term72);
        setField(term66, term66.getClass(), "last", term74);
        setField(term66, term66.getClass(), "propListHead", null);
        setIntField(term66, term66.getClass(), "sourcePosition", 0);
        setField(term66, term66.getClass(), "jsType", null);
        setField(term66, term66.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term66;
        try {
            callMethod(klass, "tryFoldSimpleFunctionCall", argTypes, term63, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


