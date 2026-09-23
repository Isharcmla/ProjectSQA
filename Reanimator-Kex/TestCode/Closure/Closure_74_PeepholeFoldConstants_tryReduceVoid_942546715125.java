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

public class PeepholeFoldConstants_tryReduceVoid_942546715125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22066;
     Object term22226;
     Object term22972;
     Object term22974;
     Object term22945;

    public PeepholeFoldConstants_tryReduceVoid_942546715125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22066 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term22156 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term22156, term22156.getClass(), "compiler", null);
        setField(term22066, term22066.getClass(), "currentTraversal", term22156);
        term22226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22296 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22296, term22296.getClass(), "type", 72);
        setField(term22226, term22226.getClass(), "first", term22296);
        setIntField(term22226, term22226.getClass(), "type", 72);
        term22972 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term22973 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term22973, term22973.getClass(), "compiler", null);
        setField(term22973, term22973.getClass(), "callback", null);
        setField(term22973, term22973.getClass(), "curNode", null);
        setField(term22973, term22973.getClass(), "scopes", null);
        setField(term22973, term22973.getClass(), "scopeRoots", null);
        setField(term22973, term22973.getClass(), "cfgs", null);
        setField(term22973, term22973.getClass(), "sourceName", null);
        setField(term22973, term22973.getClass(), "scopeCreator", null);
        setField(term22973, term22973.getClass(), "scopeCallback", null);
        setField(term22972, term22972.getClass(), "currentTraversal", term22973);
        term22974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22974, term22974.getClass(), "type", 72);
        setField(term22974, term22974.getClass(), "next", null);
        setIntField(term22975, term22975.getClass(), "type", 72);
        setField(term22975, term22975.getClass(), "next", null);
        setField(term22975, term22975.getClass(), "first", null);
        setField(term22975, term22975.getClass(), "last", null);
        setField(term22975, term22975.getClass(), "propListHead", null);
        setIntField(term22975, term22975.getClass(), "sourcePosition", 0);
        setField(term22975, term22975.getClass(), "jsType", null);
        setField(term22975, term22975.getClass(), "parent", null);
        setField(term22974, term22974.getClass(), "first", term22975);
        setField(term22974, term22974.getClass(), "last", null);
        setField(term22974, term22974.getClass(), "propListHead", null);
        setIntField(term22974, term22974.getClass(), "sourcePosition", 0);
        setField(term22974, term22974.getClass(), "jsType", null);
        setField(term22974, term22974.getClass(), "parent", null);
        term22945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22945, term22945.getClass(), "type", 72);
        setField(term22945, term22945.getClass(), "next", null);
        setIntField(term22947, term22947.getClass(), "type", 72);
        setField(term22947, term22947.getClass(), "next", null);
        setField(term22947, term22947.getClass(), "first", null);
        setField(term22947, term22947.getClass(), "last", null);
        setField(term22947, term22947.getClass(), "propListHead", null);
        setIntField(term22947, term22947.getClass(), "sourcePosition", 0);
        setField(term22947, term22947.getClass(), "jsType", null);
        setField(term22947, term22947.getClass(), "parent", null);
        setField(term22945, term22945.getClass(), "first", term22947);
        setField(term22945, term22945.getClass(), "last", null);
        setField(term22945, term22945.getClass(), "propListHead", null);
        setIntField(term22945, term22945.getClass(), "sourcePosition", 0);
        setField(term22945, term22945.getClass(), "jsType", null);
        setField(term22945, term22945.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term22226;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term22066, args);
        assertTrue(recursiveEquals(term22066, term22972));
        assertTrue(recursiveEquals(term22226, term22974));
        assertTrue(recursiveEquals(retValue, term22945));
    }

};


