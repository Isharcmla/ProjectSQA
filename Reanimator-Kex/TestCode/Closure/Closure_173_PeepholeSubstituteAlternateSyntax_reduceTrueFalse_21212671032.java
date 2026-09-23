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

public class PeepholeSubstituteAlternateSyntax_reduceTrueFalse_21212671032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347;
     Object term349;

    public PeepholeSubstituteAlternateSyntax_reduceTrueFalse_21212671032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term347 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term347, term347.getClass(), "late", true);
        setField(term347, term347.getClass(), "compiler", null);
        term349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term349, term349.getClass(), "type", 1386130016);
        setIntField(term351, term351.getClass(), "type", 1072005683);
        setIntField(term353, term353.getClass(), "type", 1861318859);
        setIntField(term355, term355.getClass(), "type", 1474524152);
        setIntField(term357, term357.getClass(), "type", 568954359);
        setField(term357, term357.getClass(), "next", null);
        setField(term357, term357.getClass(), "first", null);
        setField(term357, term357.getClass(), "last", null);
        setField(term357, term357.getClass(), "propListHead", null);
        setIntField(term357, term357.getClass(), "sourcePosition", 0);
        setField(term357, term357.getClass(), "jsType", null);
        setField(term357, term357.getClass(), "parent", null);
        setField(term355, term355.getClass(), "next", term357);
        setIntField(term360, term360.getClass(), "type", 53410913);
        setField(term360, term360.getClass(), "next", null);
        setField(term360, term360.getClass(), "first", null);
        setField(term360, term360.getClass(), "last", term357);
        setField(term360, term360.getClass(), "propListHead", null);
        setIntField(term360, term360.getClass(), "sourcePosition", 0);
        setField(term360, term360.getClass(), "jsType", null);
        setField(term360, term360.getClass(), "parent", null);
        setField(term355, term355.getClass(), "first", term360);
        setField(term355, term355.getClass(), "last", term353);
        setField(term355, term355.getClass(), "propListHead", null);
        setIntField(term355, term355.getClass(), "sourcePosition", 0);
        setField(term355, term355.getClass(), "jsType", null);
        setField(term355, term355.getClass(), "parent", null);
        setField(term353, term353.getClass(), "next", term355);
        setField(term353, term353.getClass(), "first", term357);
        setIntField(term364, term364.getClass(), "type", 1107176718);
        setIntField(term366, term366.getClass(), "type", 480137250);
        setField(term366, term366.getClass(), "next", null);
        setField(term366, term366.getClass(), "first", term360);
        setField(term366, term366.getClass(), "last", term355);
        setField(term366, term366.getClass(), "propListHead", null);
        setIntField(term366, term366.getClass(), "sourcePosition", 0);
        setField(term366, term366.getClass(), "jsType", null);
        setField(term366, term366.getClass(), "parent", null);
        setField(term364, term364.getClass(), "next", term366);
        setField(term364, term364.getClass(), "first", term351);
        setField(term364, term364.getClass(), "last", term351);
        setField(term364, term364.getClass(), "propListHead", null);
        setIntField(term364, term364.getClass(), "sourcePosition", 0);
        setField(term364, term364.getClass(), "jsType", null);
        setField(term364, term364.getClass(), "parent", null);
        setField(term353, term353.getClass(), "last", term364);
        setField(term353, term353.getClass(), "propListHead", null);
        setIntField(term353, term353.getClass(), "sourcePosition", 0);
        setField(term353, term353.getClass(), "jsType", null);
        setField(term353, term353.getClass(), "parent", null);
        setField(term351, term351.getClass(), "next", term353);
        setIntField(term371, term371.getClass(), "type", -341152642);
        setField(term371, term371.getClass(), "next", term364);
        setField(term371, term371.getClass(), "first", term366);
        setField(term371, term371.getClass(), "last", term349);
        setField(term371, term371.getClass(), "propListHead", null);
        setIntField(term371, term371.getClass(), "sourcePosition", 0);
        setField(term371, term371.getClass(), "jsType", null);
        setField(term371, term371.getClass(), "parent", null);
        setField(term351, term351.getClass(), "first", term371);
        setField(term351, term351.getClass(), "last", term371);
        setField(term351, term351.getClass(), "propListHead", null);
        setIntField(term351, term351.getClass(), "sourcePosition", 0);
        setField(term351, term351.getClass(), "jsType", null);
        setField(term351, term351.getClass(), "parent", null);
        setField(term349, term349.getClass(), "next", term351);
        setField(term349, term349.getClass(), "first", term355);
        setField(term349, term349.getClass(), "last", term357);
        setField(term349, term349.getClass(), "propListHead", null);
        setIntField(term349, term349.getClass(), "sourcePosition", 0);
        setField(term349, term349.getClass(), "jsType", null);
        setField(term349, term349.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term349;
        try {
            callMethod(klass, "reduceTrueFalse", argTypes, term347, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


