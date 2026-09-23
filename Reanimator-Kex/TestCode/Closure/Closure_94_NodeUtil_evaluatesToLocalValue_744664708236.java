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
import java.lang.Object;

public class NodeUtil_evaluatesToLocalValue_744664708236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3572;

    public NodeUtil_evaluatesToLocalValue_744664708236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3585 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3595 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3572, term3572.getClass(), "type", 1641377218);
        setIntField(term3574, term3574.getClass(), "type", -91068927);
        setIntField(term3576, term3576.getClass(), "type", 0);
        setField(term3576, term3576.getClass(), "next", null);
        setField(term3576, term3576.getClass(), "first", null);
        setField(term3576, term3576.getClass(), "last", null);
        setField(term3576, term3576.getClass(), "propListHead", null);
        setIntField(term3576, term3576.getClass(), "sourcePosition", 0);
        setField(term3576, term3576.getClass(), "jsType", null);
        setField(term3576, term3576.getClass(), "parent", null);
        setField(term3574, term3574.getClass(), "next", term3576);
        setIntField(term3579, term3579.getClass(), "type", 0);
        setField(term3579, term3579.getClass(), "next", null);
        setField(term3579, term3579.getClass(), "first", null);
        setField(term3579, term3579.getClass(), "last", null);
        setField(term3579, term3579.getClass(), "propListHead", null);
        setIntField(term3579, term3579.getClass(), "sourcePosition", 0);
        setField(term3579, term3579.getClass(), "jsType", null);
        setField(term3579, term3579.getClass(), "parent", null);
        setField(term3574, term3574.getClass(), "first", term3579);
        setIntField(term3582, term3582.getClass(), "type", 0);
        setField(term3582, term3582.getClass(), "next", null);
        setField(term3582, term3582.getClass(), "first", null);
        setField(term3582, term3582.getClass(), "last", null);
        setField(term3582, term3582.getClass(), "propListHead", null);
        setIntField(term3582, term3582.getClass(), "sourcePosition", 0);
        setField(term3582, term3582.getClass(), "jsType", null);
        setField(term3582, term3582.getClass(), "parent", null);
        setField(term3574, term3574.getClass(), "last", term3582);
        setField(term3585, term3585.getClass(), "next", null);
        setIntField(term3585, term3585.getClass(), "type", 0);
        setIntField(term3585, term3585.getClass(), "intValue", 0);
        setField(term3585, term3585.getClass(), "objectValue", null);
        setField(term3574, term3574.getClass(), "propListHead", term3585);
        setIntField(term3574, term3574.getClass(), "sourcePosition", -134092543);
        setField(term3574, term3574.getClass(), "jsType", null);
        setField(term3574, term3574.getClass(), "parent", null);
        setField(term3572, term3572.getClass(), "next", term3574);
        setIntField(term3589, term3589.getClass(), "type", 0);
        setField(term3589, term3589.getClass(), "next", null);
        setField(term3589, term3589.getClass(), "first", null);
        setField(term3589, term3589.getClass(), "last", null);
        setField(term3589, term3589.getClass(), "propListHead", null);
        setIntField(term3589, term3589.getClass(), "sourcePosition", 0);
        setField(term3589, term3589.getClass(), "jsType", null);
        setField(term3589, term3589.getClass(), "parent", null);
        setField(term3572, term3572.getClass(), "first", term3589);
        setIntField(term3592, term3592.getClass(), "type", 0);
        setField(term3592, term3592.getClass(), "next", null);
        setField(term3592, term3592.getClass(), "first", null);
        setField(term3592, term3592.getClass(), "last", null);
        setField(term3592, term3592.getClass(), "propListHead", null);
        setIntField(term3592, term3592.getClass(), "sourcePosition", 0);
        setField(term3592, term3592.getClass(), "jsType", null);
        setField(term3592, term3592.getClass(), "parent", null);
        setField(term3572, term3572.getClass(), "last", term3592);
        setField(term3595, term3595.getClass(), "next", null);
        setIntField(term3595, term3595.getClass(), "type", 0);
        setIntField(term3595, term3595.getClass(), "intValue", 0);
        setField(term3595, term3595.getClass(), "objectValue", null);
        setField(term3572, term3572.getClass(), "propListHead", term3595);
        setIntField(term3572, term3572.getClass(), "sourcePosition", -1703642288);
        setField(term3572, term3572.getClass(), "jsType", null);
        setField(term3572, term3572.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3572;
        try {
            callMethod(klass, "evaluatesToLocalValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


