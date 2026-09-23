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

public class NodeUtil_newVarNode_930235028279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3677;

    public NodeUtil_newVarNode_930235028279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3690 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3700 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3677, term3677.getClass(), "type", 694989162);
        setIntField(term3679, term3679.getClass(), "type", -288126597);
        setIntField(term3681, term3681.getClass(), "type", 0);
        setField(term3681, term3681.getClass(), "next", null);
        setField(term3681, term3681.getClass(), "first", null);
        setField(term3681, term3681.getClass(), "last", null);
        setField(term3681, term3681.getClass(), "propListHead", null);
        setIntField(term3681, term3681.getClass(), "sourcePosition", 0);
        setField(term3681, term3681.getClass(), "jsType", null);
        setField(term3681, term3681.getClass(), "parent", null);
        setField(term3679, term3679.getClass(), "next", term3681);
        setIntField(term3684, term3684.getClass(), "type", 0);
        setField(term3684, term3684.getClass(), "next", null);
        setField(term3684, term3684.getClass(), "first", null);
        setField(term3684, term3684.getClass(), "last", null);
        setField(term3684, term3684.getClass(), "propListHead", null);
        setIntField(term3684, term3684.getClass(), "sourcePosition", 0);
        setField(term3684, term3684.getClass(), "jsType", null);
        setField(term3684, term3684.getClass(), "parent", null);
        setField(term3679, term3679.getClass(), "first", term3684);
        setIntField(term3687, term3687.getClass(), "type", 0);
        setField(term3687, term3687.getClass(), "next", null);
        setField(term3687, term3687.getClass(), "first", null);
        setField(term3687, term3687.getClass(), "last", null);
        setField(term3687, term3687.getClass(), "propListHead", null);
        setIntField(term3687, term3687.getClass(), "sourcePosition", 0);
        setField(term3687, term3687.getClass(), "jsType", null);
        setField(term3687, term3687.getClass(), "parent", null);
        setField(term3679, term3679.getClass(), "last", term3687);
        setField(term3690, term3690.getClass(), "next", null);
        setIntField(term3690, term3690.getClass(), "type", 0);
        setIntField(term3690, term3690.getClass(), "intValue", 0);
        setField(term3690, term3690.getClass(), "objectValue", null);
        setField(term3679, term3679.getClass(), "propListHead", term3690);
        setIntField(term3679, term3679.getClass(), "sourcePosition", 1358117317);
        setField(term3679, term3679.getClass(), "jsType", null);
        setField(term3679, term3679.getClass(), "parent", null);
        setField(term3677, term3677.getClass(), "next", term3679);
        setIntField(term3694, term3694.getClass(), "type", 0);
        setField(term3694, term3694.getClass(), "next", null);
        setField(term3694, term3694.getClass(), "first", null);
        setField(term3694, term3694.getClass(), "last", null);
        setField(term3694, term3694.getClass(), "propListHead", null);
        setIntField(term3694, term3694.getClass(), "sourcePosition", 0);
        setField(term3694, term3694.getClass(), "jsType", null);
        setField(term3694, term3694.getClass(), "parent", null);
        setField(term3677, term3677.getClass(), "first", term3694);
        setIntField(term3697, term3697.getClass(), "type", 0);
        setField(term3697, term3697.getClass(), "next", null);
        setField(term3697, term3697.getClass(), "first", null);
        setField(term3697, term3697.getClass(), "last", null);
        setField(term3697, term3697.getClass(), "propListHead", null);
        setIntField(term3697, term3697.getClass(), "sourcePosition", 0);
        setField(term3697, term3697.getClass(), "jsType", null);
        setField(term3697, term3697.getClass(), "parent", null);
        setField(term3677, term3677.getClass(), "last", term3697);
        setField(term3700, term3700.getClass(), "next", null);
        setIntField(term3700, term3700.getClass(), "type", 0);
        setIntField(term3700, term3700.getClass(), "intValue", 0);
        setField(term3700, term3700.getClass(), "objectValue", null);
        setField(term3677, term3677.getClass(), "propListHead", term3700);
        setIntField(term3677, term3677.getClass(), "sourcePosition", 229989439);
        setField(term3677, term3677.getClass(), "jsType", null);
        setField(term3677, term3677.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = "vrQLuWIDJX";
        args[1] = term3677;
        try {
            callMethod(klass, "newVarNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


