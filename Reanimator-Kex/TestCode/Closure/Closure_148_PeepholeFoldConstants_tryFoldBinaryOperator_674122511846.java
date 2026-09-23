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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194672;
     Object term194764;
     Object term195339;
     Object term195340;
     Object term195291;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194672 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term194764 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term194856 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term194948 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term195018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term194948, term194948.getClass(), "type", 39);
        setDoubleField(term194948, term194948.getClass(), "number", -5.9897748600860846E18);
        setField(term194856, term194856.getClass(), "next", term194948);
        setIntField(term194856, term194856.getClass(), "type", 39);
        setDoubleField(term194856, term194856.getClass(), "number", 3.2604744508139054E18);
        setField(term194764, term194764.getClass(), "first", term194856);
        setIntField(term194764, term194764.getClass(), "type", 22);
        setField(term194764, term194764.getClass(), "parent", term195018);
        term195339 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term195339, term195339.getClass(), "currentTraversal", null);
        term195340 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term195341 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term195342 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term195343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term195340, term195340.getClass(), "number", 0.0);
        setIntField(term195340, term195340.getClass(), "type", 22);
        setField(term195340, term195340.getClass(), "next", null);
        setDoubleField(term195341, term195341.getClass(), "number", 3.2604744508139054E18);
        setIntField(term195341, term195341.getClass(), "type", 39);
        setDoubleField(term195342, term195342.getClass(), "number", -5.9897748600860846E18);
        setIntField(term195342, term195342.getClass(), "type", 39);
        setField(term195342, term195342.getClass(), "next", null);
        setField(term195342, term195342.getClass(), "first", null);
        setField(term195342, term195342.getClass(), "last", null);
        setField(term195342, term195342.getClass(), "propListHead", null);
        setIntField(term195342, term195342.getClass(), "sourcePosition", 0);
        setField(term195342, term195342.getClass(), "jsType", null);
        setField(term195342, term195342.getClass(), "parent", null);
        setField(term195341, term195341.getClass(), "next", term195342);
        setField(term195341, term195341.getClass(), "first", null);
        setField(term195341, term195341.getClass(), "last", null);
        setField(term195341, term195341.getClass(), "propListHead", null);
        setIntField(term195341, term195341.getClass(), "sourcePosition", 0);
        setField(term195341, term195341.getClass(), "jsType", null);
        setField(term195341, term195341.getClass(), "parent", null);
        setField(term195340, term195340.getClass(), "first", term195341);
        setField(term195340, term195340.getClass(), "last", null);
        setField(term195340, term195340.getClass(), "propListHead", null);
        setIntField(term195340, term195340.getClass(), "sourcePosition", 0);
        setField(term195340, term195340.getClass(), "jsType", null);
        setIntField(term195343, term195343.getClass(), "type", 0);
        setField(term195343, term195343.getClass(), "next", null);
        setField(term195343, term195343.getClass(), "first", null);
        setField(term195343, term195343.getClass(), "last", null);
        setField(term195343, term195343.getClass(), "propListHead", null);
        setIntField(term195343, term195343.getClass(), "sourcePosition", 0);
        setField(term195343, term195343.getClass(), "jsType", null);
        setField(term195343, term195343.getClass(), "parent", null);
        setField(term195340, term195340.getClass(), "parent", term195343);
        term195291 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term195294 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term195297 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term195303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term195291, term195291.getClass(), "number", 0.0);
        setIntField(term195291, term195291.getClass(), "type", 22);
        setField(term195291, term195291.getClass(), "next", null);
        setDoubleField(term195294, term195294.getClass(), "number", 3.2604744508139054E18);
        setIntField(term195294, term195294.getClass(), "type", 39);
        setDoubleField(term195297, term195297.getClass(), "number", -5.9897748600860846E18);
        setIntField(term195297, term195297.getClass(), "type", 39);
        setField(term195297, term195297.getClass(), "next", null);
        setField(term195297, term195297.getClass(), "first", null);
        setField(term195297, term195297.getClass(), "last", null);
        setField(term195297, term195297.getClass(), "propListHead", null);
        setIntField(term195297, term195297.getClass(), "sourcePosition", 0);
        setField(term195297, term195297.getClass(), "jsType", null);
        setField(term195297, term195297.getClass(), "parent", null);
        setField(term195294, term195294.getClass(), "next", term195297);
        setField(term195294, term195294.getClass(), "first", null);
        setField(term195294, term195294.getClass(), "last", null);
        setField(term195294, term195294.getClass(), "propListHead", null);
        setIntField(term195294, term195294.getClass(), "sourcePosition", 0);
        setField(term195294, term195294.getClass(), "jsType", null);
        setField(term195294, term195294.getClass(), "parent", null);
        setField(term195291, term195291.getClass(), "first", term195294);
        setField(term195291, term195291.getClass(), "last", null);
        setField(term195291, term195291.getClass(), "propListHead", null);
        setIntField(term195291, term195291.getClass(), "sourcePosition", 0);
        setField(term195291, term195291.getClass(), "jsType", null);
        setIntField(term195303, term195303.getClass(), "type", 0);
        setField(term195303, term195303.getClass(), "next", null);
        setField(term195303, term195303.getClass(), "first", null);
        setField(term195303, term195303.getClass(), "last", null);
        setField(term195303, term195303.getClass(), "propListHead", null);
        setIntField(term195303, term195303.getClass(), "sourcePosition", 0);
        setField(term195303, term195303.getClass(), "jsType", null);
        setField(term195303, term195303.getClass(), "parent", null);
        setField(term195291, term195291.getClass(), "parent", term195303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term194764;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term194672, args);
        assertTrue(recursiveEquals(term194672, term195339));
        assertTrue(recursiveEquals(term194764, term195340));
        assertTrue(recursiveEquals(retValue, term195291));
    }

};


