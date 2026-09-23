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

public class NodeUtil_newName_29866120275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3623;

    public NodeUtil_newName_29866120275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3640 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3623, term3623.getClass(), "type", -460657407);
        setIntField(term3625, term3625.getClass(), "type", 941003590);
        setIntField(term3627, term3627.getClass(), "type", -1825624890);
        setIntField(term3629, term3629.getClass(), "type", 413214164);
        setIntField(term3631, term3631.getClass(), "type", 355911655);
        setField(term3631, term3631.getClass(), "next", null);
        setField(term3631, term3631.getClass(), "first", null);
        setField(term3631, term3631.getClass(), "last", null);
        setField(term3631, term3631.getClass(), "propListHead", null);
        setIntField(term3631, term3631.getClass(), "sourcePosition", 0);
        setField(term3631, term3631.getClass(), "jsType", null);
        setField(term3631, term3631.getClass(), "parent", null);
        setField(term3629, term3629.getClass(), "next", term3631);
        setIntField(term3634, term3634.getClass(), "type", 1811833766);
        setField(term3634, term3634.getClass(), "next", null);
        setField(term3634, term3634.getClass(), "first", null);
        setField(term3634, term3634.getClass(), "last", term3631);
        setField(term3634, term3634.getClass(), "propListHead", null);
        setIntField(term3634, term3634.getClass(), "sourcePosition", 0);
        setField(term3634, term3634.getClass(), "jsType", null);
        setField(term3634, term3634.getClass(), "parent", null);
        setField(term3629, term3629.getClass(), "first", term3634);
        setField(term3629, term3629.getClass(), "last", term3627);
        setField(term3629, term3629.getClass(), "propListHead", null);
        setIntField(term3629, term3629.getClass(), "sourcePosition", 0);
        setField(term3629, term3629.getClass(), "jsType", null);
        setField(term3629, term3629.getClass(), "parent", null);
        setField(term3627, term3627.getClass(), "next", term3629);
        setField(term3627, term3627.getClass(), "first", term3631);
        setIntField(term3638, term3638.getClass(), "type", -1784072578);
        setIntField(term3640, term3640.getClass(), "type", 2011764585);
        setField(term3640, term3640.getClass(), "next", null);
        setField(term3640, term3640.getClass(), "first", term3634);
        setField(term3640, term3640.getClass(), "last", term3629);
        setField(term3640, term3640.getClass(), "propListHead", null);
        setIntField(term3640, term3640.getClass(), "sourcePosition", 0);
        setField(term3640, term3640.getClass(), "jsType", null);
        setField(term3640, term3640.getClass(), "parent", null);
        setField(term3638, term3638.getClass(), "next", term3640);
        setField(term3638, term3638.getClass(), "first", term3625);
        setField(term3638, term3638.getClass(), "last", term3625);
        setField(term3638, term3638.getClass(), "propListHead", null);
        setIntField(term3638, term3638.getClass(), "sourcePosition", 0);
        setField(term3638, term3638.getClass(), "jsType", null);
        setField(term3638, term3638.getClass(), "parent", null);
        setField(term3627, term3627.getClass(), "last", term3638);
        setField(term3627, term3627.getClass(), "propListHead", null);
        setIntField(term3627, term3627.getClass(), "sourcePosition", 0);
        setField(term3627, term3627.getClass(), "jsType", null);
        setField(term3627, term3627.getClass(), "parent", null);
        setField(term3625, term3625.getClass(), "next", term3627);
        setIntField(term3645, term3645.getClass(), "type", -860680764);
        setField(term3645, term3645.getClass(), "next", term3638);
        setField(term3645, term3645.getClass(), "first", term3640);
        setField(term3645, term3645.getClass(), "last", term3623);
        setField(term3645, term3645.getClass(), "propListHead", null);
        setIntField(term3645, term3645.getClass(), "sourcePosition", 0);
        setField(term3645, term3645.getClass(), "jsType", null);
        setField(term3645, term3645.getClass(), "parent", null);
        setField(term3625, term3625.getClass(), "first", term3645);
        setField(term3625, term3625.getClass(), "last", term3645);
        setField(term3625, term3625.getClass(), "propListHead", null);
        setIntField(term3625, term3625.getClass(), "sourcePosition", 0);
        setField(term3625, term3625.getClass(), "jsType", null);
        setField(term3625, term3625.getClass(), "parent", null);
        setField(term3623, term3623.getClass(), "next", term3625);
        setField(term3623, term3623.getClass(), "first", term3629);
        setField(term3623, term3623.getClass(), "last", term3631);
        setField(term3623, term3623.getClass(), "propListHead", null);
        setIntField(term3623, term3623.getClass(), "sourcePosition", 0);
        setField(term3623, term3623.getClass(), "jsType", null);
        setField(term3623, term3623.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodingConvention");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "onpbIeEKoi";
        args[2] = term3623;
        try {
            callMethod(klass, "newName", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


