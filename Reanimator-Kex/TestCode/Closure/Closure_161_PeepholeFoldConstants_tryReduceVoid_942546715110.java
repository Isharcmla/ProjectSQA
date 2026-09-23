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

public class PeepholeFoldConstants_tryReduceVoid_942546715110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17147;
     Object term17307;
     Object term18220;
     Object term18222;
     Object term18193;

    public PeepholeFoldConstants_tryReduceVoid_942546715110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17147 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term17237 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term17237, term17237.getClass(), "compiler", null);
        setField(term17147, term17147.getClass(), "currentTraversal", term17237);
        term17307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17377, term17377.getClass(), "type", 123);
        setField(term17307, term17307.getClass(), "first", term17377);
        setIntField(term17307, term17307.getClass(), "type", 123);
        term18220 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term18221 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term18221, term18221.getClass(), "compiler", null);
        setField(term18221, term18221.getClass(), "callback", null);
        setField(term18221, term18221.getClass(), "curNode", null);
        setField(term18221, term18221.getClass(), "scopes", null);
        setField(term18221, term18221.getClass(), "scopeRoots", null);
        setField(term18221, term18221.getClass(), "cfgs", null);
        setField(term18221, term18221.getClass(), "sourceName", null);
        setField(term18221, term18221.getClass(), "scopeCreator", null);
        setField(term18221, term18221.getClass(), "scopeCallback", null);
        setField(term18220, term18220.getClass(), "currentTraversal", term18221);
        term18222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18222, term18222.getClass(), "type", 123);
        setField(term18222, term18222.getClass(), "next", null);
        setIntField(term18223, term18223.getClass(), "type", 123);
        setField(term18223, term18223.getClass(), "next", null);
        setField(term18223, term18223.getClass(), "first", null);
        setField(term18223, term18223.getClass(), "last", null);
        setField(term18223, term18223.getClass(), "propListHead", null);
        setIntField(term18223, term18223.getClass(), "sourcePosition", 0);
        setField(term18223, term18223.getClass(), "jsType", null);
        setField(term18223, term18223.getClass(), "parent", null);
        setField(term18222, term18222.getClass(), "first", term18223);
        setField(term18222, term18222.getClass(), "last", null);
        setField(term18222, term18222.getClass(), "propListHead", null);
        setIntField(term18222, term18222.getClass(), "sourcePosition", 0);
        setField(term18222, term18222.getClass(), "jsType", null);
        setField(term18222, term18222.getClass(), "parent", null);
        term18193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18193, term18193.getClass(), "type", 123);
        setField(term18193, term18193.getClass(), "next", null);
        setIntField(term18195, term18195.getClass(), "type", 123);
        setField(term18195, term18195.getClass(), "next", null);
        setField(term18195, term18195.getClass(), "first", null);
        setField(term18195, term18195.getClass(), "last", null);
        setField(term18195, term18195.getClass(), "propListHead", null);
        setIntField(term18195, term18195.getClass(), "sourcePosition", 0);
        setField(term18195, term18195.getClass(), "jsType", null);
        setField(term18195, term18195.getClass(), "parent", null);
        setField(term18193, term18193.getClass(), "first", term18195);
        setField(term18193, term18193.getClass(), "last", null);
        setField(term18193, term18193.getClass(), "propListHead", null);
        setIntField(term18193, term18193.getClass(), "sourcePosition", 0);
        setField(term18193, term18193.getClass(), "jsType", null);
        setField(term18193, term18193.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term17307;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term17147, args);
        assertTrue(recursiveEquals(term17147, term18220));
        assertTrue(recursiveEquals(term17307, term18222));
        assertTrue(recursiveEquals(retValue, term18193));
    }

};


