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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeSubstituteAlternateSyntax_tryFoldLiteralConstructor_207034934229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262;
     Object term264;

    public PeepholeSubstituteAlternateSyntax_tryFoldLiteralConstructor_207034934229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term262 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term262, term262.getClass(), "late", true);
        setField(term262, term262.getClass(), "compiler", null);
        term264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term264, term264.getClass(), "type", -1772434990);
        setIntField(term266, term266.getClass(), "type", -1845499264);
        setIntField(term268, term268.getClass(), "type", -505439934);
        setIntField(term270, term270.getClass(), "type", -344842608);
        setIntField(term272, term272.getClass(), "type", 941650513);
        setField(term272, term272.getClass(), "next", null);
        setField(term272, term272.getClass(), "first", null);
        setField(term272, term272.getClass(), "last", null);
        setField(term272, term272.getClass(), "propListHead", null);
        setIntField(term272, term272.getClass(), "sourcePosition", 0);
        setField(term272, term272.getClass(), "jsType", null);
        setField(term272, term272.getClass(), "parent", null);
        setField(term270, term270.getClass(), "next", term272);
        setIntField(term275, term275.getClass(), "type", 444029505);
        setField(term275, term275.getClass(), "next", null);
        setField(term275, term275.getClass(), "first", null);
        setField(term275, term275.getClass(), "last", term272);
        setField(term275, term275.getClass(), "propListHead", null);
        setIntField(term275, term275.getClass(), "sourcePosition", 0);
        setField(term275, term275.getClass(), "jsType", null);
        setField(term275, term275.getClass(), "parent", null);
        setField(term270, term270.getClass(), "first", term275);
        setField(term270, term270.getClass(), "last", term268);
        setField(term270, term270.getClass(), "propListHead", null);
        setIntField(term270, term270.getClass(), "sourcePosition", 0);
        setField(term270, term270.getClass(), "jsType", null);
        setField(term270, term270.getClass(), "parent", null);
        setField(term268, term268.getClass(), "next", term270);
        setField(term268, term268.getClass(), "first", term272);
        setIntField(term279, term279.getClass(), "type", -1263114719);
        setIntField(term281, term281.getClass(), "type", -894662986);
        setField(term281, term281.getClass(), "next", null);
        setField(term281, term281.getClass(), "first", term275);
        setField(term281, term281.getClass(), "last", term270);
        setField(term281, term281.getClass(), "propListHead", null);
        setIntField(term281, term281.getClass(), "sourcePosition", 0);
        setField(term281, term281.getClass(), "jsType", null);
        setField(term281, term281.getClass(), "parent", null);
        setField(term279, term279.getClass(), "next", term281);
        setField(term279, term279.getClass(), "first", term266);
        setField(term279, term279.getClass(), "last", term266);
        setField(term279, term279.getClass(), "propListHead", null);
        setIntField(term279, term279.getClass(), "sourcePosition", 0);
        setField(term279, term279.getClass(), "jsType", null);
        setField(term279, term279.getClass(), "parent", null);
        setField(term268, term268.getClass(), "last", term279);
        setField(term268, term268.getClass(), "propListHead", null);
        setIntField(term268, term268.getClass(), "sourcePosition", 0);
        setField(term268, term268.getClass(), "jsType", null);
        setField(term268, term268.getClass(), "parent", null);
        setField(term266, term266.getClass(), "next", term268);
        setIntField(term286, term286.getClass(), "type", 304775596);
        setField(term286, term286.getClass(), "next", term279);
        setField(term286, term286.getClass(), "first", term281);
        setField(term286, term286.getClass(), "last", term264);
        setField(term286, term286.getClass(), "propListHead", null);
        setIntField(term286, term286.getClass(), "sourcePosition", 0);
        setField(term286, term286.getClass(), "jsType", null);
        setField(term286, term286.getClass(), "parent", null);
        setField(term266, term266.getClass(), "first", term286);
        setField(term266, term266.getClass(), "last", term286);
        setField(term266, term266.getClass(), "propListHead", null);
        setIntField(term266, term266.getClass(), "sourcePosition", 0);
        setField(term266, term266.getClass(), "jsType", null);
        setField(term266, term266.getClass(), "parent", null);
        setField(term264, term264.getClass(), "next", term266);
        setField(term264, term264.getClass(), "first", term270);
        setField(term264, term264.getClass(), "last", term272);
        setField(term264, term264.getClass(), "propListHead", null);
        setIntField(term264, term264.getClass(), "sourcePosition", 0);
        setField(term264, term264.getClass(), "jsType", null);
        setField(term264, term264.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term264;
        try {
            callMethod(klass, "tryFoldLiteralConstructor", argTypes, term262, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


