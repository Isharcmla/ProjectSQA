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

public class PeepholeFoldConstants_tryFoldAndOr_425870290343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68238;
     Object term68330;
     Object term68422;
     Object term68514;
     Object term68747;
     Object term68748;
     Object term68749;
     Object term68750;
     Object term68707;

    public PeepholeFoldConstants_tryFoldAndOr_425870290343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68238 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term68330 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term68330, term68330.getClass(), "parent", null);
        setIntField(term68330, term68330.getClass(), "type", 0);
        term68422 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term68422, term68422.getClass(), "type", 0);
        term68514 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term68747 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term68747, term68747.getClass(), "currentTraversal", null);
        term68748 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term68748, term68748.getClass(), "number", 0.0);
        setIntField(term68748, term68748.getClass(), "type", 0);
        setField(term68748, term68748.getClass(), "next", null);
        setField(term68748, term68748.getClass(), "first", null);
        setField(term68748, term68748.getClass(), "last", null);
        setField(term68748, term68748.getClass(), "propListHead", null);
        setIntField(term68748, term68748.getClass(), "sourcePosition", 0);
        setField(term68748, term68748.getClass(), "jsType", null);
        setField(term68748, term68748.getClass(), "parent", null);
        term68749 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term68749, term68749.getClass(), "str", null);
        setIntField(term68749, term68749.getClass(), "type", 0);
        setField(term68749, term68749.getClass(), "next", null);
        setField(term68749, term68749.getClass(), "first", null);
        setField(term68749, term68749.getClass(), "last", null);
        setField(term68749, term68749.getClass(), "propListHead", null);
        setIntField(term68749, term68749.getClass(), "sourcePosition", 0);
        setField(term68749, term68749.getClass(), "jsType", null);
        setField(term68749, term68749.getClass(), "parent", null);
        term68750 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term68750, term68750.getClass(), "number", 0.0);
        setIntField(term68750, term68750.getClass(), "type", 0);
        setField(term68750, term68750.getClass(), "next", null);
        setField(term68750, term68750.getClass(), "first", null);
        setField(term68750, term68750.getClass(), "last", null);
        setField(term68750, term68750.getClass(), "propListHead", null);
        setIntField(term68750, term68750.getClass(), "sourcePosition", 0);
        setField(term68750, term68750.getClass(), "jsType", null);
        setField(term68750, term68750.getClass(), "parent", null);
        term68707 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term68707, term68707.getClass(), "number", 0.0);
        setIntField(term68707, term68707.getClass(), "type", 0);
        setField(term68707, term68707.getClass(), "next", null);
        setField(term68707, term68707.getClass(), "first", null);
        setField(term68707, term68707.getClass(), "last", null);
        setField(term68707, term68707.getClass(), "propListHead", null);
        setIntField(term68707, term68707.getClass(), "sourcePosition", 0);
        setField(term68707, term68707.getClass(), "jsType", null);
        setField(term68707, term68707.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term68330;
        args[1] = term68422;
        args[2] = term68514;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term68238, args);
        assertTrue(recursiveEquals(term68238, term68747));
        assertTrue(recursiveEquals(term68330, term68748));
        assertTrue(recursiveEquals(term68422, term68749));
        assertTrue(recursiveEquals(term68514, term68750));
        assertTrue(recursiveEquals(retValue, term68707));
    }

};


