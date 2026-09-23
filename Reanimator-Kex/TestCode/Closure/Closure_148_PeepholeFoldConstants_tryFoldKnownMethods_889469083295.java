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

public class PeepholeFoldConstants_tryFoldKnownMethods_889469083295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57018;
     Object term57088;
     Object term57649;
     Object term57650;
     Object term57579;

    public PeepholeFoldConstants_tryFoldKnownMethods_889469083295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57018 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term57088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term57158, term57158.getClass(), "next", term57228);
        setIntField(term57158, term57158.getClass(), "type", 0);
        setField(term57088, term57088.getClass(), "first", term57158);
        setIntField(term57088, term57088.getClass(), "type", 37);
        term57649 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term57649, term57649.getClass(), "currentTraversal", null);
        term57650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57650, term57650.getClass(), "type", 37);
        setField(term57650, term57650.getClass(), "next", null);
        setIntField(term57651, term57651.getClass(), "type", 0);
        setIntField(term57652, term57652.getClass(), "type", 0);
        setField(term57652, term57652.getClass(), "next", null);
        setField(term57652, term57652.getClass(), "first", null);
        setField(term57652, term57652.getClass(), "last", null);
        setField(term57652, term57652.getClass(), "propListHead", null);
        setIntField(term57652, term57652.getClass(), "sourcePosition", 0);
        setField(term57652, term57652.getClass(), "jsType", null);
        setField(term57652, term57652.getClass(), "parent", null);
        setField(term57651, term57651.getClass(), "next", term57652);
        setField(term57651, term57651.getClass(), "first", null);
        setField(term57651, term57651.getClass(), "last", null);
        setField(term57651, term57651.getClass(), "propListHead", null);
        setIntField(term57651, term57651.getClass(), "sourcePosition", 0);
        setField(term57651, term57651.getClass(), "jsType", null);
        setField(term57651, term57651.getClass(), "parent", null);
        setField(term57650, term57650.getClass(), "first", term57651);
        setField(term57650, term57650.getClass(), "last", null);
        setField(term57650, term57650.getClass(), "propListHead", null);
        setIntField(term57650, term57650.getClass(), "sourcePosition", 0);
        setField(term57650, term57650.getClass(), "jsType", null);
        setField(term57650, term57650.getClass(), "parent", null);
        term57579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57579, term57579.getClass(), "type", 37);
        setField(term57579, term57579.getClass(), "next", null);
        setIntField(term57581, term57581.getClass(), "type", 0);
        setIntField(term57583, term57583.getClass(), "type", 0);
        setField(term57583, term57583.getClass(), "next", null);
        setField(term57583, term57583.getClass(), "first", null);
        setField(term57583, term57583.getClass(), "last", null);
        setField(term57583, term57583.getClass(), "propListHead", null);
        setIntField(term57583, term57583.getClass(), "sourcePosition", 0);
        setField(term57583, term57583.getClass(), "jsType", null);
        setField(term57583, term57583.getClass(), "parent", null);
        setField(term57581, term57581.getClass(), "next", term57583);
        setField(term57581, term57581.getClass(), "first", null);
        setField(term57581, term57581.getClass(), "last", null);
        setField(term57581, term57581.getClass(), "propListHead", null);
        setIntField(term57581, term57581.getClass(), "sourcePosition", 0);
        setField(term57581, term57581.getClass(), "jsType", null);
        setField(term57581, term57581.getClass(), "parent", null);
        setField(term57579, term57579.getClass(), "first", term57581);
        setField(term57579, term57579.getClass(), "last", null);
        setField(term57579, term57579.getClass(), "propListHead", null);
        setIntField(term57579, term57579.getClass(), "sourcePosition", 0);
        setField(term57579, term57579.getClass(), "jsType", null);
        setField(term57579, term57579.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term57088;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term57018, args);
        assertTrue(recursiveEquals(term57018, term57649));
        assertTrue(recursiveEquals(term57088, term57650));
        assertTrue(recursiveEquals(retValue, term57579));
    }

};


