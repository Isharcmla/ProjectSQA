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

public class PeepholeSubstituteAlternateSyntax_tryReplaceExitWithBreak_24256454759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330;
     Object term333;

    public PeepholeSubstituteAlternateSyntax_tryReplaceExitWithBreak_24256454759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term330 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term330, term330.getClass(), "late", true);
        setIntField(term330, term330.getClass(), "STRING_SPLIT_OVERHEAD", 1386130016);
        setField(term330, term330.getClass(), "compiler", null);
        term333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term333, term333.getClass(), "type", 1072005683);
        setIntField(term335, term335.getClass(), "type", 1861318859);
        setIntField(term337, term337.getClass(), "type", 1474524152);
        setIntField(term339, term339.getClass(), "type", 568954359);
        setIntField(term341, term341.getClass(), "type", 53410913);
        setField(term341, term341.getClass(), "next", null);
        setField(term341, term341.getClass(), "first", null);
        setField(term341, term341.getClass(), "last", null);
        setField(term341, term341.getClass(), "propListHead", null);
        setIntField(term341, term341.getClass(), "sourcePosition", 0);
        setField(term341, term341.getClass(), "jsType", null);
        setField(term341, term341.getClass(), "parent", null);
        setField(term339, term339.getClass(), "next", term341);
        setIntField(term344, term344.getClass(), "type", -375014958);
        setField(term344, term344.getClass(), "next", null);
        setField(term344, term344.getClass(), "first", null);
        setField(term344, term344.getClass(), "last", term341);
        setField(term344, term344.getClass(), "propListHead", null);
        setIntField(term344, term344.getClass(), "sourcePosition", 0);
        setField(term344, term344.getClass(), "jsType", null);
        setField(term344, term344.getClass(), "parent", null);
        setField(term339, term339.getClass(), "first", term344);
        setField(term339, term339.getClass(), "last", term337);
        setField(term339, term339.getClass(), "propListHead", null);
        setIntField(term339, term339.getClass(), "sourcePosition", 0);
        setField(term339, term339.getClass(), "jsType", null);
        setField(term339, term339.getClass(), "parent", null);
        setField(term337, term337.getClass(), "next", term339);
        setField(term337, term337.getClass(), "first", term341);
        setIntField(term348, term348.getClass(), "type", 480137250);
        setIntField(term350, term350.getClass(), "type", -341152642);
        setField(term350, term350.getClass(), "next", null);
        setField(term350, term350.getClass(), "first", term344);
        setField(term350, term350.getClass(), "last", term339);
        setField(term350, term350.getClass(), "propListHead", null);
        setIntField(term350, term350.getClass(), "sourcePosition", 0);
        setField(term350, term350.getClass(), "jsType", null);
        setField(term350, term350.getClass(), "parent", null);
        setField(term348, term348.getClass(), "next", term350);
        setField(term348, term348.getClass(), "first", term335);
        setField(term348, term348.getClass(), "last", term335);
        setField(term348, term348.getClass(), "propListHead", null);
        setIntField(term348, term348.getClass(), "sourcePosition", 0);
        setField(term348, term348.getClass(), "jsType", null);
        setField(term348, term348.getClass(), "parent", null);
        setField(term337, term337.getClass(), "last", term348);
        setField(term337, term337.getClass(), "propListHead", null);
        setIntField(term337, term337.getClass(), "sourcePosition", 0);
        setField(term337, term337.getClass(), "jsType", null);
        setField(term337, term337.getClass(), "parent", null);
        setField(term335, term335.getClass(), "next", term337);
        setIntField(term355, term355.getClass(), "type", -2015854073);
        setField(term355, term355.getClass(), "next", term348);
        setField(term355, term355.getClass(), "first", term350);
        setField(term355, term355.getClass(), "last", term333);
        setField(term355, term355.getClass(), "propListHead", null);
        setIntField(term355, term355.getClass(), "sourcePosition", 0);
        setField(term355, term355.getClass(), "jsType", null);
        setField(term355, term355.getClass(), "parent", null);
        setField(term335, term335.getClass(), "first", term355);
        setField(term335, term335.getClass(), "last", term355);
        setField(term335, term335.getClass(), "propListHead", null);
        setIntField(term335, term335.getClass(), "sourcePosition", 0);
        setField(term335, term335.getClass(), "jsType", null);
        setField(term335, term335.getClass(), "parent", null);
        setField(term333, term333.getClass(), "next", term335);
        setField(term333, term333.getClass(), "first", term339);
        setField(term333, term333.getClass(), "last", term341);
        setField(term333, term333.getClass(), "propListHead", null);
        setIntField(term333, term333.getClass(), "sourcePosition", 0);
        setField(term333, term333.getClass(), "jsType", null);
        setField(term333, term333.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term333;
        try {
            callMethod(klass, "tryReplaceExitWithBreak", argTypes, term330, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


