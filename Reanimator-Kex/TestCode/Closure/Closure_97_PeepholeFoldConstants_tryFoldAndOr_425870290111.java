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

public class PeepholeFoldConstants_tryFoldAndOr_425870290111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20433;
     Object term20525;
     Object term20617;
     Object term20709;
     Object term21199;
     Object term21200;
     Object term21201;
     Object term21202;
     Object term21160;

    public PeepholeFoldConstants_tryFoldAndOr_425870290111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20433 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term20525 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term20525, term20525.getClass(), "parent", null);
        setIntField(term20525, term20525.getClass(), "type", 0);
        term20617 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term20617, term20617.getClass(), "type", 0);
        term20709 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term21199 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term21199, term21199.getClass(), "currentTraversal", null);
        term21200 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term21200, term21200.getClass(), "str", null);
        setIntField(term21200, term21200.getClass(), "type", 0);
        setField(term21200, term21200.getClass(), "next", null);
        setField(term21200, term21200.getClass(), "first", null);
        setField(term21200, term21200.getClass(), "last", null);
        setField(term21200, term21200.getClass(), "propListHead", null);
        setIntField(term21200, term21200.getClass(), "sourcePosition", 0);
        setField(term21200, term21200.getClass(), "jsType", null);
        setField(term21200, term21200.getClass(), "parent", null);
        term21201 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term21201, term21201.getClass(), "str", null);
        setIntField(term21201, term21201.getClass(), "type", 0);
        setField(term21201, term21201.getClass(), "next", null);
        setField(term21201, term21201.getClass(), "first", null);
        setField(term21201, term21201.getClass(), "last", null);
        setField(term21201, term21201.getClass(), "propListHead", null);
        setIntField(term21201, term21201.getClass(), "sourcePosition", 0);
        setField(term21201, term21201.getClass(), "jsType", null);
        setField(term21201, term21201.getClass(), "parent", null);
        term21202 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term21202, term21202.getClass(), "number", 0.0);
        setIntField(term21202, term21202.getClass(), "type", 0);
        setField(term21202, term21202.getClass(), "next", null);
        setField(term21202, term21202.getClass(), "first", null);
        setField(term21202, term21202.getClass(), "last", null);
        setField(term21202, term21202.getClass(), "propListHead", null);
        setIntField(term21202, term21202.getClass(), "sourcePosition", 0);
        setField(term21202, term21202.getClass(), "jsType", null);
        setField(term21202, term21202.getClass(), "parent", null);
        term21160 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term21160, term21160.getClass(), "str", null);
        setIntField(term21160, term21160.getClass(), "type", 0);
        setField(term21160, term21160.getClass(), "next", null);
        setField(term21160, term21160.getClass(), "first", null);
        setField(term21160, term21160.getClass(), "last", null);
        setField(term21160, term21160.getClass(), "propListHead", null);
        setIntField(term21160, term21160.getClass(), "sourcePosition", 0);
        setField(term21160, term21160.getClass(), "jsType", null);
        setField(term21160, term21160.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term20525;
        args[1] = term20617;
        args[2] = term20709;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term20433, args);
        assertTrue(recursiveEquals(term20433, term21199));
        assertTrue(recursiveEquals(term20525, term21200));
        assertTrue(recursiveEquals(term20617, term21201));
        assertTrue(recursiveEquals(term20709, term21202));
        assertTrue(recursiveEquals(retValue, term21160));
    }

};


