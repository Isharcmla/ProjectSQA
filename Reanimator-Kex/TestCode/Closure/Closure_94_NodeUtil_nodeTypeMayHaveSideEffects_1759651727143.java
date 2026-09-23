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

public class NodeUtil_nodeTypeMayHaveSideEffects_1759651727143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term624;
     Object term7438;

    public NodeUtil_nodeTypeMayHaveSideEffects_1759651727143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term637 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term647 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term624, term624.getClass(), "type", -936895502);
        setIntField(term626, term626.getClass(), "type", -376422566);
        setIntField(term628, term628.getClass(), "type", 0);
        setField(term628, term628.getClass(), "next", null);
        setField(term628, term628.getClass(), "first", null);
        setField(term628, term628.getClass(), "last", null);
        setField(term628, term628.getClass(), "propListHead", null);
        setIntField(term628, term628.getClass(), "sourcePosition", 0);
        setField(term628, term628.getClass(), "jsType", null);
        setField(term628, term628.getClass(), "parent", null);
        setField(term626, term626.getClass(), "next", term628);
        setIntField(term631, term631.getClass(), "type", 0);
        setField(term631, term631.getClass(), "next", null);
        setField(term631, term631.getClass(), "first", null);
        setField(term631, term631.getClass(), "last", null);
        setField(term631, term631.getClass(), "propListHead", null);
        setIntField(term631, term631.getClass(), "sourcePosition", 0);
        setField(term631, term631.getClass(), "jsType", null);
        setField(term631, term631.getClass(), "parent", null);
        setField(term626, term626.getClass(), "first", term631);
        setIntField(term634, term634.getClass(), "type", 0);
        setField(term634, term634.getClass(), "next", null);
        setField(term634, term634.getClass(), "first", null);
        setField(term634, term634.getClass(), "last", null);
        setField(term634, term634.getClass(), "propListHead", null);
        setIntField(term634, term634.getClass(), "sourcePosition", 0);
        setField(term634, term634.getClass(), "jsType", null);
        setField(term634, term634.getClass(), "parent", null);
        setField(term626, term626.getClass(), "last", term634);
        setField(term637, term637.getClass(), "next", null);
        setIntField(term637, term637.getClass(), "type", 0);
        setIntField(term637, term637.getClass(), "intValue", 0);
        setField(term637, term637.getClass(), "objectValue", null);
        setField(term626, term626.getClass(), "propListHead", term637);
        setIntField(term626, term626.getClass(), "sourcePosition", 2009020256);
        setField(term626, term626.getClass(), "jsType", null);
        setField(term626, term626.getClass(), "parent", null);
        setField(term624, term624.getClass(), "next", term626);
        setIntField(term641, term641.getClass(), "type", 0);
        setField(term641, term641.getClass(), "next", null);
        setField(term641, term641.getClass(), "first", null);
        setField(term641, term641.getClass(), "last", null);
        setField(term641, term641.getClass(), "propListHead", null);
        setIntField(term641, term641.getClass(), "sourcePosition", 0);
        setField(term641, term641.getClass(), "jsType", null);
        setField(term641, term641.getClass(), "parent", null);
        setField(term624, term624.getClass(), "first", term641);
        setIntField(term644, term644.getClass(), "type", 0);
        setField(term644, term644.getClass(), "next", null);
        setField(term644, term644.getClass(), "first", null);
        setField(term644, term644.getClass(), "last", null);
        setField(term644, term644.getClass(), "propListHead", null);
        setIntField(term644, term644.getClass(), "sourcePosition", 0);
        setField(term644, term644.getClass(), "jsType", null);
        setField(term644, term644.getClass(), "parent", null);
        setField(term624, term624.getClass(), "last", term644);
        setField(term647, term647.getClass(), "next", null);
        setIntField(term647, term647.getClass(), "type", 0);
        setIntField(term647, term647.getClass(), "intValue", 0);
        setField(term647, term647.getClass(), "objectValue", null);
        setField(term624, term624.getClass(), "propListHead", term647);
        setIntField(term624, term624.getClass(), "sourcePosition", 2049577015);
        setField(term624, term624.getClass(), "jsType", null);
        setField(term624, term624.getClass(), "parent", null);
        term7438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7443 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7446 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7438, term7438.getClass(), "type", -936895502);
        setIntField(term7439, term7439.getClass(), "type", -376422566);
        setIntField(term7440, term7440.getClass(), "type", 0);
        setField(term7440, term7440.getClass(), "next", null);
        setField(term7440, term7440.getClass(), "first", null);
        setField(term7440, term7440.getClass(), "last", null);
        setField(term7440, term7440.getClass(), "propListHead", null);
        setIntField(term7440, term7440.getClass(), "sourcePosition", 0);
        setField(term7440, term7440.getClass(), "jsType", null);
        setField(term7440, term7440.getClass(), "parent", null);
        setField(term7439, term7439.getClass(), "next", term7440);
        setIntField(term7441, term7441.getClass(), "type", 0);
        setField(term7441, term7441.getClass(), "next", null);
        setField(term7441, term7441.getClass(), "first", null);
        setField(term7441, term7441.getClass(), "last", null);
        setField(term7441, term7441.getClass(), "propListHead", null);
        setIntField(term7441, term7441.getClass(), "sourcePosition", 0);
        setField(term7441, term7441.getClass(), "jsType", null);
        setField(term7441, term7441.getClass(), "parent", null);
        setField(term7439, term7439.getClass(), "first", term7441);
        setIntField(term7442, term7442.getClass(), "type", 0);
        setField(term7442, term7442.getClass(), "next", null);
        setField(term7442, term7442.getClass(), "first", null);
        setField(term7442, term7442.getClass(), "last", null);
        setField(term7442, term7442.getClass(), "propListHead", null);
        setIntField(term7442, term7442.getClass(), "sourcePosition", 0);
        setField(term7442, term7442.getClass(), "jsType", null);
        setField(term7442, term7442.getClass(), "parent", null);
        setField(term7439, term7439.getClass(), "last", term7442);
        setField(term7443, term7443.getClass(), "next", null);
        setIntField(term7443, term7443.getClass(), "type", 0);
        setIntField(term7443, term7443.getClass(), "intValue", 0);
        setField(term7443, term7443.getClass(), "objectValue", null);
        setField(term7439, term7439.getClass(), "propListHead", term7443);
        setIntField(term7439, term7439.getClass(), "sourcePosition", 2009020256);
        setField(term7439, term7439.getClass(), "jsType", null);
        setField(term7439, term7439.getClass(), "parent", null);
        setField(term7438, term7438.getClass(), "next", term7439);
        setIntField(term7444, term7444.getClass(), "type", 0);
        setField(term7444, term7444.getClass(), "next", null);
        setField(term7444, term7444.getClass(), "first", null);
        setField(term7444, term7444.getClass(), "last", null);
        setField(term7444, term7444.getClass(), "propListHead", null);
        setIntField(term7444, term7444.getClass(), "sourcePosition", 0);
        setField(term7444, term7444.getClass(), "jsType", null);
        setField(term7444, term7444.getClass(), "parent", null);
        setField(term7438, term7438.getClass(), "first", term7444);
        setIntField(term7445, term7445.getClass(), "type", 0);
        setField(term7445, term7445.getClass(), "next", null);
        setField(term7445, term7445.getClass(), "first", null);
        setField(term7445, term7445.getClass(), "last", null);
        setField(term7445, term7445.getClass(), "propListHead", null);
        setIntField(term7445, term7445.getClass(), "sourcePosition", 0);
        setField(term7445, term7445.getClass(), "jsType", null);
        setField(term7445, term7445.getClass(), "parent", null);
        setField(term7438, term7438.getClass(), "last", term7445);
        setField(term7446, term7446.getClass(), "next", null);
        setIntField(term7446, term7446.getClass(), "type", 0);
        setIntField(term7446, term7446.getClass(), "intValue", 0);
        setField(term7446, term7446.getClass(), "objectValue", null);
        setField(term7438, term7438.getClass(), "propListHead", term7446);
        setIntField(term7438, term7438.getClass(), "sourcePosition", 2049577015);
        setField(term7438, term7438.getClass(), "jsType", null);
        setField(term7438, term7438.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term624;
        args[1] = null;
        Object retValue = callMethod(klass, "nodeTypeMayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term624, term7438));
        assertTrue(recursiveEquals(retValue, false));
    }

};


