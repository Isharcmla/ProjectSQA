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

public class FoldConstants_tryFoldBlock_1167048042393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112278;
     Object term112348;
     Object term112614;
     Object term112615;

    public FoldConstants_tryFoldBlock_1167048042393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112278 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term112348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term112418, term112418.getClass(), "next", term112348);
        setIntField(term112418, term112418.getClass(), "type", 48);
        setField(term112348, term112348.getClass(), "first", term112418);
        setField(term112348, term112348.getClass(), "next", term112488);
        setIntField(term112348, term112348.getClass(), "type", 45);
        term112614 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term112614, term112614.getClass(), "compiler", null);
        term112615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term112615, term112615.getClass(), "type", 45);
        setIntField(term112616, term112616.getClass(), "type", 0);
        setField(term112616, term112616.getClass(), "next", null);
        setField(term112616, term112616.getClass(), "first", null);
        setField(term112616, term112616.getClass(), "last", null);
        setField(term112616, term112616.getClass(), "propListHead", null);
        setIntField(term112616, term112616.getClass(), "sourcePosition", 0);
        setField(term112616, term112616.getClass(), "jsType", null);
        setField(term112616, term112616.getClass(), "parent", null);
        setField(term112615, term112615.getClass(), "next", term112616);
        setIntField(term112617, term112617.getClass(), "type", 48);
        setField(term112617, term112617.getClass(), "next", term112615);
        setField(term112617, term112617.getClass(), "first", null);
        setField(term112617, term112617.getClass(), "last", null);
        setField(term112617, term112617.getClass(), "propListHead", null);
        setIntField(term112617, term112617.getClass(), "sourcePosition", 0);
        setField(term112617, term112617.getClass(), "jsType", null);
        setField(term112617, term112617.getClass(), "parent", null);
        setField(term112615, term112615.getClass(), "first", term112617);
        setField(term112615, term112615.getClass(), "last", null);
        setField(term112615, term112615.getClass(), "propListHead", null);
        setIntField(term112615, term112615.getClass(), "sourcePosition", 0);
        setField(term112615, term112615.getClass(), "jsType", null);
        setField(term112615, term112615.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term112348;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term112278, args);
        assertTrue(recursiveEquals(term112278, term112614));
        assertTrue(recursiveEquals(term112348, null));
    }

};


