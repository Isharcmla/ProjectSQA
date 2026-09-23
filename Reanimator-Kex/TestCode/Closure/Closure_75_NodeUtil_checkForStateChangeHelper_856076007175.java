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
import java.lang.Boolean;

public class NodeUtil_checkForStateChangeHelper_856076007175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561;
     Object term588;
     Object term7836;

    public NodeUtil_checkForStateChangeHelper_856076007175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term574 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term584 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term561, term561.getClass(), "type", 982388293);
        setIntField(term563, term563.getClass(), "type", -1747406163);
        setIntField(term565, term565.getClass(), "type", 0);
        setField(term565, term565.getClass(), "next", null);
        setField(term565, term565.getClass(), "first", null);
        setField(term565, term565.getClass(), "last", null);
        setField(term565, term565.getClass(), "propListHead", null);
        setIntField(term565, term565.getClass(), "sourcePosition", 0);
        setField(term565, term565.getClass(), "jsType", null);
        setField(term565, term565.getClass(), "parent", null);
        setField(term563, term563.getClass(), "next", term565);
        setIntField(term568, term568.getClass(), "type", 0);
        setField(term568, term568.getClass(), "next", null);
        setField(term568, term568.getClass(), "first", null);
        setField(term568, term568.getClass(), "last", null);
        setField(term568, term568.getClass(), "propListHead", null);
        setIntField(term568, term568.getClass(), "sourcePosition", 0);
        setField(term568, term568.getClass(), "jsType", null);
        setField(term568, term568.getClass(), "parent", null);
        setField(term563, term563.getClass(), "first", term568);
        setIntField(term571, term571.getClass(), "type", 0);
        setField(term571, term571.getClass(), "next", null);
        setField(term571, term571.getClass(), "first", null);
        setField(term571, term571.getClass(), "last", null);
        setField(term571, term571.getClass(), "propListHead", null);
        setIntField(term571, term571.getClass(), "sourcePosition", 0);
        setField(term571, term571.getClass(), "jsType", null);
        setField(term571, term571.getClass(), "parent", null);
        setField(term563, term563.getClass(), "last", term571);
        setField(term574, term574.getClass(), "next", null);
        setIntField(term574, term574.getClass(), "type", 0);
        setIntField(term574, term574.getClass(), "intValue", 0);
        setField(term574, term574.getClass(), "objectValue", null);
        setField(term563, term563.getClass(), "propListHead", term574);
        setIntField(term563, term563.getClass(), "sourcePosition", -1476644457);
        setField(term563, term563.getClass(), "jsType", null);
        setField(term563, term563.getClass(), "parent", null);
        setField(term561, term561.getClass(), "next", term563);
        setIntField(term578, term578.getClass(), "type", 0);
        setField(term578, term578.getClass(), "next", null);
        setField(term578, term578.getClass(), "first", null);
        setField(term578, term578.getClass(), "last", null);
        setField(term578, term578.getClass(), "propListHead", null);
        setIntField(term578, term578.getClass(), "sourcePosition", 0);
        setField(term578, term578.getClass(), "jsType", null);
        setField(term578, term578.getClass(), "parent", null);
        setField(term561, term561.getClass(), "first", term578);
        setIntField(term581, term581.getClass(), "type", 0);
        setField(term581, term581.getClass(), "next", null);
        setField(term581, term581.getClass(), "first", null);
        setField(term581, term581.getClass(), "last", null);
        setField(term581, term581.getClass(), "propListHead", null);
        setIntField(term581, term581.getClass(), "sourcePosition", 0);
        setField(term581, term581.getClass(), "jsType", null);
        setField(term581, term581.getClass(), "parent", null);
        setField(term561, term561.getClass(), "last", term581);
        setField(term584, term584.getClass(), "next", null);
        setIntField(term584, term584.getClass(), "type", 0);
        setIntField(term584, term584.getClass(), "intValue", 0);
        setField(term584, term584.getClass(), "objectValue", null);
        setField(term561, term561.getClass(), "propListHead", term584);
        setIntField(term561, term561.getClass(), "sourcePosition", 1270666529);
        setField(term561, term561.getClass(), "jsType", null);
        setField(term561, term561.getClass(), "parent", null);
        term588 = new Boolean(false);
        term7836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7841 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7844 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7836, term7836.getClass(), "type", 982388293);
        setIntField(term7837, term7837.getClass(), "type", -1747406163);
        setIntField(term7838, term7838.getClass(), "type", 0);
        setField(term7838, term7838.getClass(), "next", null);
        setField(term7838, term7838.getClass(), "first", null);
        setField(term7838, term7838.getClass(), "last", null);
        setField(term7838, term7838.getClass(), "propListHead", null);
        setIntField(term7838, term7838.getClass(), "sourcePosition", 0);
        setField(term7838, term7838.getClass(), "jsType", null);
        setField(term7838, term7838.getClass(), "parent", null);
        setField(term7837, term7837.getClass(), "next", term7838);
        setIntField(term7839, term7839.getClass(), "type", 0);
        setField(term7839, term7839.getClass(), "next", null);
        setField(term7839, term7839.getClass(), "first", null);
        setField(term7839, term7839.getClass(), "last", null);
        setField(term7839, term7839.getClass(), "propListHead", null);
        setIntField(term7839, term7839.getClass(), "sourcePosition", 0);
        setField(term7839, term7839.getClass(), "jsType", null);
        setField(term7839, term7839.getClass(), "parent", null);
        setField(term7837, term7837.getClass(), "first", term7839);
        setIntField(term7840, term7840.getClass(), "type", 0);
        setField(term7840, term7840.getClass(), "next", null);
        setField(term7840, term7840.getClass(), "first", null);
        setField(term7840, term7840.getClass(), "last", null);
        setField(term7840, term7840.getClass(), "propListHead", null);
        setIntField(term7840, term7840.getClass(), "sourcePosition", 0);
        setField(term7840, term7840.getClass(), "jsType", null);
        setField(term7840, term7840.getClass(), "parent", null);
        setField(term7837, term7837.getClass(), "last", term7840);
        setField(term7841, term7841.getClass(), "next", null);
        setIntField(term7841, term7841.getClass(), "type", 0);
        setIntField(term7841, term7841.getClass(), "intValue", 0);
        setField(term7841, term7841.getClass(), "objectValue", null);
        setField(term7837, term7837.getClass(), "propListHead", term7841);
        setIntField(term7837, term7837.getClass(), "sourcePosition", -1476644457);
        setField(term7837, term7837.getClass(), "jsType", null);
        setField(term7837, term7837.getClass(), "parent", null);
        setField(term7836, term7836.getClass(), "next", term7837);
        setIntField(term7842, term7842.getClass(), "type", 0);
        setField(term7842, term7842.getClass(), "next", null);
        setField(term7842, term7842.getClass(), "first", null);
        setField(term7842, term7842.getClass(), "last", null);
        setField(term7842, term7842.getClass(), "propListHead", null);
        setIntField(term7842, term7842.getClass(), "sourcePosition", 0);
        setField(term7842, term7842.getClass(), "jsType", null);
        setField(term7842, term7842.getClass(), "parent", null);
        setField(term7836, term7836.getClass(), "first", term7842);
        setIntField(term7843, term7843.getClass(), "type", 0);
        setField(term7843, term7843.getClass(), "next", null);
        setField(term7843, term7843.getClass(), "first", null);
        setField(term7843, term7843.getClass(), "last", null);
        setField(term7843, term7843.getClass(), "propListHead", null);
        setIntField(term7843, term7843.getClass(), "sourcePosition", 0);
        setField(term7843, term7843.getClass(), "jsType", null);
        setField(term7843, term7843.getClass(), "parent", null);
        setField(term7836, term7836.getClass(), "last", term7843);
        setField(term7844, term7844.getClass(), "next", null);
        setIntField(term7844, term7844.getClass(), "type", 0);
        setIntField(term7844, term7844.getClass(), "intValue", 0);
        setField(term7844, term7844.getClass(), "objectValue", null);
        setField(term7836, term7836.getClass(), "propListHead", term7844);
        setIntField(term7836, term7836.getClass(), "sourcePosition", 1270666529);
        setField(term7836, term7836.getClass(), "jsType", null);
        setField(term7836, term7836.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[3];
        args[0] = term561;
        args[1] = term588;
        args[2] = null;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term561, term7836));
        assertTrue(recursiveEquals(term588, false));
        assertTrue(recursiveEquals(retValue, true));
    }

};


