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

public class Normalize_removeDuplicateDeclarations_171911297823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term709;
     Object term711;

    public Normalize_removeDuplicateDeclarations_171911297823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term709 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term709, term709.getClass(), "compiler", null);
        setBooleanField(term709, term709.getClass(), "assertOnChange", true);
        term711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term734 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term711, term711.getClass(), "type", -860131894);
        setIntField(term713, term713.getClass(), "type", -542712742);
        setIntField(term715, term715.getClass(), "type", 0);
        setField(term715, term715.getClass(), "next", null);
        setField(term715, term715.getClass(), "first", null);
        setField(term715, term715.getClass(), "last", null);
        setField(term715, term715.getClass(), "propListHead", null);
        setIntField(term715, term715.getClass(), "sourcePosition", 0);
        setField(term715, term715.getClass(), "jsType", null);
        setField(term715, term715.getClass(), "parent", null);
        setField(term713, term713.getClass(), "next", term715);
        setIntField(term718, term718.getClass(), "type", 0);
        setField(term718, term718.getClass(), "next", null);
        setField(term718, term718.getClass(), "first", null);
        setField(term718, term718.getClass(), "last", null);
        setField(term718, term718.getClass(), "propListHead", null);
        setIntField(term718, term718.getClass(), "sourcePosition", 0);
        setField(term718, term718.getClass(), "jsType", null);
        setField(term718, term718.getClass(), "parent", null);
        setField(term713, term713.getClass(), "first", term718);
        setIntField(term721, term721.getClass(), "type", 0);
        setField(term721, term721.getClass(), "next", null);
        setField(term721, term721.getClass(), "first", null);
        setField(term721, term721.getClass(), "last", null);
        setField(term721, term721.getClass(), "propListHead", null);
        setIntField(term721, term721.getClass(), "sourcePosition", 0);
        setField(term721, term721.getClass(), "jsType", null);
        setField(term721, term721.getClass(), "parent", null);
        setField(term713, term713.getClass(), "last", term721);
        setField(term724, term724.getClass(), "next", null);
        setIntField(term724, term724.getClass(), "type", 0);
        setIntField(term724, term724.getClass(), "intValue", 0);
        setField(term724, term724.getClass(), "objectValue", null);
        setField(term713, term713.getClass(), "propListHead", term724);
        setIntField(term713, term713.getClass(), "sourcePosition", -1692331299);
        setField(term713, term713.getClass(), "jsType", null);
        setField(term713, term713.getClass(), "parent", null);
        setField(term711, term711.getClass(), "next", term713);
        setIntField(term728, term728.getClass(), "type", 0);
        setField(term728, term728.getClass(), "next", null);
        setField(term728, term728.getClass(), "first", null);
        setField(term728, term728.getClass(), "last", null);
        setField(term728, term728.getClass(), "propListHead", null);
        setIntField(term728, term728.getClass(), "sourcePosition", 0);
        setField(term728, term728.getClass(), "jsType", null);
        setField(term728, term728.getClass(), "parent", null);
        setField(term711, term711.getClass(), "first", term728);
        setIntField(term731, term731.getClass(), "type", 0);
        setField(term731, term731.getClass(), "next", null);
        setField(term731, term731.getClass(), "first", null);
        setField(term731, term731.getClass(), "last", null);
        setField(term731, term731.getClass(), "propListHead", null);
        setIntField(term731, term731.getClass(), "sourcePosition", 0);
        setField(term731, term731.getClass(), "jsType", null);
        setField(term731, term731.getClass(), "parent", null);
        setField(term711, term711.getClass(), "last", term731);
        setField(term734, term734.getClass(), "next", null);
        setIntField(term734, term734.getClass(), "type", 0);
        setIntField(term734, term734.getClass(), "intValue", 0);
        setField(term734, term734.getClass(), "objectValue", null);
        setField(term711, term711.getClass(), "propListHead", term734);
        setIntField(term711, term711.getClass(), "sourcePosition", 479531250);
        setField(term711, term711.getClass(), "jsType", null);
        setField(term711, term711.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term711;
        try {
            callMethod(klass, "removeDuplicateDeclarations", argTypes, term709, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


