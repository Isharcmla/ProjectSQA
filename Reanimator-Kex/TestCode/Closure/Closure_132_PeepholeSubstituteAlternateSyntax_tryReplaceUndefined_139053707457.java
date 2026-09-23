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
import java.lang.Object;

public class PeepholeSubstituteAlternateSyntax_tryReplaceUndefined_139053707457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270;
     Object term273;

    public PeepholeSubstituteAlternateSyntax_tryReplaceUndefined_139053707457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term270, term270.getClass(), "late", true);
        setIntField(term270, term270.getClass(), "STRING_SPLIT_OVERHEAD", -894662986);
        setField(term270, term270.getClass(), "compiler", null);
        term273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term273, term273.getClass(), "type", 304775596);
        setIntField(term275, term275.getClass(), "type", -1347665717);
        setIntField(term277, term277.getClass(), "type", -1888585309);
        setIntField(term279, term279.getClass(), "type", 683666002);
        setIntField(term281, term281.getClass(), "type", 1596213415);
        setField(term281, term281.getClass(), "next", null);
        setField(term281, term281.getClass(), "first", null);
        setField(term281, term281.getClass(), "last", null);
        setField(term281, term281.getClass(), "propListHead", null);
        setIntField(term281, term281.getClass(), "sourcePosition", 0);
        setField(term281, term281.getClass(), "jsType", null);
        setField(term281, term281.getClass(), "parent", null);
        setField(term279, term279.getClass(), "next", term281);
        setIntField(term284, term284.getClass(), "type", -268815336);
        setField(term284, term284.getClass(), "next", null);
        setField(term284, term284.getClass(), "first", null);
        setField(term284, term284.getClass(), "last", term281);
        setField(term284, term284.getClass(), "propListHead", null);
        setIntField(term284, term284.getClass(), "sourcePosition", 0);
        setField(term284, term284.getClass(), "jsType", null);
        setField(term284, term284.getClass(), "parent", null);
        setField(term279, term279.getClass(), "first", term284);
        setField(term279, term279.getClass(), "last", term277);
        setField(term279, term279.getClass(), "propListHead", null);
        setIntField(term279, term279.getClass(), "sourcePosition", 0);
        setField(term279, term279.getClass(), "jsType", null);
        setField(term279, term279.getClass(), "parent", null);
        setField(term277, term277.getClass(), "next", term279);
        setField(term277, term277.getClass(), "first", term281);
        setIntField(term288, term288.getClass(), "type", -663691365);
        setIntField(term290, term290.getClass(), "type", 339854490);
        setField(term290, term290.getClass(), "next", null);
        setField(term290, term290.getClass(), "first", term284);
        setField(term290, term290.getClass(), "last", term279);
        setField(term290, term290.getClass(), "propListHead", null);
        setIntField(term290, term290.getClass(), "sourcePosition", 0);
        setField(term290, term290.getClass(), "jsType", null);
        setField(term290, term290.getClass(), "parent", null);
        setField(term288, term288.getClass(), "next", term290);
        setField(term288, term288.getClass(), "first", term275);
        setField(term288, term288.getClass(), "last", term275);
        setField(term288, term288.getClass(), "propListHead", null);
        setIntField(term288, term288.getClass(), "sourcePosition", 0);
        setField(term288, term288.getClass(), "jsType", null);
        setField(term288, term288.getClass(), "parent", null);
        setField(term277, term277.getClass(), "last", term288);
        setField(term277, term277.getClass(), "propListHead", null);
        setIntField(term277, term277.getClass(), "sourcePosition", 0);
        setField(term277, term277.getClass(), "jsType", null);
        setField(term277, term277.getClass(), "parent", null);
        setField(term275, term275.getClass(), "next", term277);
        setIntField(term295, term295.getClass(), "type", -615654495);
        setField(term295, term295.getClass(), "next", term288);
        setField(term295, term295.getClass(), "first", term290);
        setField(term295, term295.getClass(), "last", term273);
        setField(term295, term295.getClass(), "propListHead", null);
        setIntField(term295, term295.getClass(), "sourcePosition", 0);
        setField(term295, term295.getClass(), "jsType", null);
        setField(term295, term295.getClass(), "parent", null);
        setField(term275, term275.getClass(), "first", term295);
        setField(term275, term275.getClass(), "last", term295);
        setField(term275, term275.getClass(), "propListHead", null);
        setIntField(term275, term275.getClass(), "sourcePosition", 0);
        setField(term275, term275.getClass(), "jsType", null);
        setField(term275, term275.getClass(), "parent", null);
        setField(term273, term273.getClass(), "next", term275);
        setField(term273, term273.getClass(), "first", term279);
        setField(term273, term273.getClass(), "last", term281);
        setField(term273, term273.getClass(), "propListHead", null);
        setIntField(term273, term273.getClass(), "sourcePosition", 0);
        setField(term273, term273.getClass(), "jsType", null);
        setField(term273, term273.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term273;
        try {
            callMethod(klass, "tryReplaceUndefined", argTypes, term270, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


