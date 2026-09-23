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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term686255;
     Object term686347;
     Object term687221;
     Object term687222;
     Object term687146;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term686255 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term686347 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term686439 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term686531 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term686601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term686531, term686531.getClass(), "type", 47);
        setField(term686439, term686439.getClass(), "next", term686531);
        setIntField(term686439, term686439.getClass(), "type", 0);
        setField(term686347, term686347.getClass(), "first", term686439);
        setIntField(term686347, term686347.getClass(), "type", 101);
        setField(term686347, term686347.getClass(), "parent", term686601);
        term687221 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term687221, term687221.getClass(), "currentTraversal", null);
        term687222 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term687223 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term687224 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term687225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term687222, term687222.getClass(), "number", 0.0);
        setIntField(term687222, term687222.getClass(), "type", 101);
        setField(term687222, term687222.getClass(), "next", null);
        setDoubleField(term687223, term687223.getClass(), "number", 0.0);
        setIntField(term687223, term687223.getClass(), "type", 0);
        setDoubleField(term687224, term687224.getClass(), "number", 0.0);
        setIntField(term687224, term687224.getClass(), "type", 47);
        setField(term687224, term687224.getClass(), "next", null);
        setField(term687224, term687224.getClass(), "first", null);
        setField(term687224, term687224.getClass(), "last", null);
        setField(term687224, term687224.getClass(), "propListHead", null);
        setIntField(term687224, term687224.getClass(), "sourcePosition", 0);
        setField(term687224, term687224.getClass(), "jsType", null);
        setField(term687224, term687224.getClass(), "parent", null);
        setField(term687223, term687223.getClass(), "next", term687224);
        setField(term687223, term687223.getClass(), "first", null);
        setField(term687223, term687223.getClass(), "last", null);
        setField(term687223, term687223.getClass(), "propListHead", null);
        setIntField(term687223, term687223.getClass(), "sourcePosition", 0);
        setField(term687223, term687223.getClass(), "jsType", null);
        setField(term687223, term687223.getClass(), "parent", null);
        setField(term687222, term687222.getClass(), "first", term687223);
        setField(term687222, term687222.getClass(), "last", null);
        setField(term687222, term687222.getClass(), "propListHead", null);
        setIntField(term687222, term687222.getClass(), "sourcePosition", 0);
        setField(term687222, term687222.getClass(), "jsType", null);
        setIntField(term687225, term687225.getClass(), "type", 0);
        setField(term687225, term687225.getClass(), "next", null);
        setField(term687225, term687225.getClass(), "first", null);
        setField(term687225, term687225.getClass(), "last", null);
        setField(term687225, term687225.getClass(), "propListHead", null);
        setIntField(term687225, term687225.getClass(), "sourcePosition", 0);
        setField(term687225, term687225.getClass(), "jsType", null);
        setField(term687225, term687225.getClass(), "parent", null);
        setField(term687222, term687222.getClass(), "parent", term687225);
        term687146 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term687149 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term687152 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term687158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term687146, term687146.getClass(), "number", 0.0);
        setIntField(term687146, term687146.getClass(), "type", 101);
        setField(term687146, term687146.getClass(), "next", null);
        setDoubleField(term687149, term687149.getClass(), "number", 0.0);
        setIntField(term687149, term687149.getClass(), "type", 0);
        setDoubleField(term687152, term687152.getClass(), "number", 0.0);
        setIntField(term687152, term687152.getClass(), "type", 47);
        setField(term687152, term687152.getClass(), "next", null);
        setField(term687152, term687152.getClass(), "first", null);
        setField(term687152, term687152.getClass(), "last", null);
        setField(term687152, term687152.getClass(), "propListHead", null);
        setIntField(term687152, term687152.getClass(), "sourcePosition", 0);
        setField(term687152, term687152.getClass(), "jsType", null);
        setField(term687152, term687152.getClass(), "parent", null);
        setField(term687149, term687149.getClass(), "next", term687152);
        setField(term687149, term687149.getClass(), "first", null);
        setField(term687149, term687149.getClass(), "last", null);
        setField(term687149, term687149.getClass(), "propListHead", null);
        setIntField(term687149, term687149.getClass(), "sourcePosition", 0);
        setField(term687149, term687149.getClass(), "jsType", null);
        setField(term687149, term687149.getClass(), "parent", null);
        setField(term687146, term687146.getClass(), "first", term687149);
        setField(term687146, term687146.getClass(), "last", null);
        setField(term687146, term687146.getClass(), "propListHead", null);
        setIntField(term687146, term687146.getClass(), "sourcePosition", 0);
        setField(term687146, term687146.getClass(), "jsType", null);
        setIntField(term687158, term687158.getClass(), "type", 0);
        setField(term687158, term687158.getClass(), "next", null);
        setField(term687158, term687158.getClass(), "first", null);
        setField(term687158, term687158.getClass(), "last", null);
        setField(term687158, term687158.getClass(), "propListHead", null);
        setIntField(term687158, term687158.getClass(), "sourcePosition", 0);
        setField(term687158, term687158.getClass(), "jsType", null);
        setField(term687158, term687158.getClass(), "parent", null);
        setField(term687146, term687146.getClass(), "parent", term687158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term686347;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term686255, args);
        assertTrue(recursiveEquals(term686255, term687221));
        assertTrue(recursiveEquals(term686347, term687222));
        assertTrue(recursiveEquals(retValue, term687146));
    }

};


