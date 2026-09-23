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

public class NodeUtil_getPrototypeClassName_998940311191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2617;
     Object term13709;

    public NodeUtil_getPrototypeClassName_998940311191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2630 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2640 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2617, term2617.getClass(), "type", 2052244839);
        setIntField(term2619, term2619.getClass(), "type", -1954937310);
        setIntField(term2621, term2621.getClass(), "type", 0);
        setField(term2621, term2621.getClass(), "next", null);
        setField(term2621, term2621.getClass(), "first", null);
        setField(term2621, term2621.getClass(), "last", null);
        setField(term2621, term2621.getClass(), "propListHead", null);
        setIntField(term2621, term2621.getClass(), "sourcePosition", 0);
        setField(term2621, term2621.getClass(), "jsType", null);
        setField(term2621, term2621.getClass(), "parent", null);
        setField(term2619, term2619.getClass(), "next", term2621);
        setIntField(term2624, term2624.getClass(), "type", 0);
        setField(term2624, term2624.getClass(), "next", null);
        setField(term2624, term2624.getClass(), "first", null);
        setField(term2624, term2624.getClass(), "last", null);
        setField(term2624, term2624.getClass(), "propListHead", null);
        setIntField(term2624, term2624.getClass(), "sourcePosition", 0);
        setField(term2624, term2624.getClass(), "jsType", null);
        setField(term2624, term2624.getClass(), "parent", null);
        setField(term2619, term2619.getClass(), "first", term2624);
        setIntField(term2627, term2627.getClass(), "type", 0);
        setField(term2627, term2627.getClass(), "next", null);
        setField(term2627, term2627.getClass(), "first", null);
        setField(term2627, term2627.getClass(), "last", null);
        setField(term2627, term2627.getClass(), "propListHead", null);
        setIntField(term2627, term2627.getClass(), "sourcePosition", 0);
        setField(term2627, term2627.getClass(), "jsType", null);
        setField(term2627, term2627.getClass(), "parent", null);
        setField(term2619, term2619.getClass(), "last", term2627);
        setField(term2630, term2630.getClass(), "next", null);
        setIntField(term2630, term2630.getClass(), "type", 0);
        setIntField(term2630, term2630.getClass(), "intValue", 0);
        setField(term2630, term2630.getClass(), "objectValue", null);
        setField(term2619, term2619.getClass(), "propListHead", term2630);
        setIntField(term2619, term2619.getClass(), "sourcePosition", -1825624890);
        setField(term2619, term2619.getClass(), "jsType", null);
        setField(term2619, term2619.getClass(), "parent", null);
        setField(term2617, term2617.getClass(), "next", term2619);
        setIntField(term2634, term2634.getClass(), "type", 0);
        setField(term2634, term2634.getClass(), "next", null);
        setField(term2634, term2634.getClass(), "first", null);
        setField(term2634, term2634.getClass(), "last", null);
        setField(term2634, term2634.getClass(), "propListHead", null);
        setIntField(term2634, term2634.getClass(), "sourcePosition", 0);
        setField(term2634, term2634.getClass(), "jsType", null);
        setField(term2634, term2634.getClass(), "parent", null);
        setField(term2617, term2617.getClass(), "first", term2634);
        setIntField(term2637, term2637.getClass(), "type", 0);
        setField(term2637, term2637.getClass(), "next", null);
        setField(term2637, term2637.getClass(), "first", null);
        setField(term2637, term2637.getClass(), "last", null);
        setField(term2637, term2637.getClass(), "propListHead", null);
        setIntField(term2637, term2637.getClass(), "sourcePosition", 0);
        setField(term2637, term2637.getClass(), "jsType", null);
        setField(term2637, term2637.getClass(), "parent", null);
        setField(term2617, term2617.getClass(), "last", term2637);
        setField(term2640, term2640.getClass(), "next", null);
        setIntField(term2640, term2640.getClass(), "type", 0);
        setIntField(term2640, term2640.getClass(), "intValue", 0);
        setField(term2640, term2640.getClass(), "objectValue", null);
        setField(term2617, term2617.getClass(), "propListHead", term2640);
        setIntField(term2617, term2617.getClass(), "sourcePosition", 413214164);
        setField(term2617, term2617.getClass(), "jsType", null);
        setField(term2617, term2617.getClass(), "parent", null);
        term13709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13714 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term13715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13717 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term13709, term13709.getClass(), "type", 2052244839);
        setIntField(term13710, term13710.getClass(), "type", -1954937310);
        setIntField(term13711, term13711.getClass(), "type", 0);
        setField(term13711, term13711.getClass(), "next", null);
        setField(term13711, term13711.getClass(), "first", null);
        setField(term13711, term13711.getClass(), "last", null);
        setField(term13711, term13711.getClass(), "propListHead", null);
        setIntField(term13711, term13711.getClass(), "sourcePosition", 0);
        setField(term13711, term13711.getClass(), "jsType", null);
        setField(term13711, term13711.getClass(), "parent", null);
        setField(term13710, term13710.getClass(), "next", term13711);
        setIntField(term13712, term13712.getClass(), "type", 0);
        setField(term13712, term13712.getClass(), "next", null);
        setField(term13712, term13712.getClass(), "first", null);
        setField(term13712, term13712.getClass(), "last", null);
        setField(term13712, term13712.getClass(), "propListHead", null);
        setIntField(term13712, term13712.getClass(), "sourcePosition", 0);
        setField(term13712, term13712.getClass(), "jsType", null);
        setField(term13712, term13712.getClass(), "parent", null);
        setField(term13710, term13710.getClass(), "first", term13712);
        setIntField(term13713, term13713.getClass(), "type", 0);
        setField(term13713, term13713.getClass(), "next", null);
        setField(term13713, term13713.getClass(), "first", null);
        setField(term13713, term13713.getClass(), "last", null);
        setField(term13713, term13713.getClass(), "propListHead", null);
        setIntField(term13713, term13713.getClass(), "sourcePosition", 0);
        setField(term13713, term13713.getClass(), "jsType", null);
        setField(term13713, term13713.getClass(), "parent", null);
        setField(term13710, term13710.getClass(), "last", term13713);
        setField(term13714, term13714.getClass(), "next", null);
        setIntField(term13714, term13714.getClass(), "type", 0);
        setIntField(term13714, term13714.getClass(), "intValue", 0);
        setField(term13714, term13714.getClass(), "objectValue", null);
        setField(term13710, term13710.getClass(), "propListHead", term13714);
        setIntField(term13710, term13710.getClass(), "sourcePosition", -1825624890);
        setField(term13710, term13710.getClass(), "jsType", null);
        setField(term13710, term13710.getClass(), "parent", null);
        setField(term13709, term13709.getClass(), "next", term13710);
        setIntField(term13715, term13715.getClass(), "type", 0);
        setField(term13715, term13715.getClass(), "next", null);
        setField(term13715, term13715.getClass(), "first", null);
        setField(term13715, term13715.getClass(), "last", null);
        setField(term13715, term13715.getClass(), "propListHead", null);
        setIntField(term13715, term13715.getClass(), "sourcePosition", 0);
        setField(term13715, term13715.getClass(), "jsType", null);
        setField(term13715, term13715.getClass(), "parent", null);
        setField(term13709, term13709.getClass(), "first", term13715);
        setIntField(term13716, term13716.getClass(), "type", 0);
        setField(term13716, term13716.getClass(), "next", null);
        setField(term13716, term13716.getClass(), "first", null);
        setField(term13716, term13716.getClass(), "last", null);
        setField(term13716, term13716.getClass(), "propListHead", null);
        setIntField(term13716, term13716.getClass(), "sourcePosition", 0);
        setField(term13716, term13716.getClass(), "jsType", null);
        setField(term13716, term13716.getClass(), "parent", null);
        setField(term13709, term13709.getClass(), "last", term13716);
        setField(term13717, term13717.getClass(), "next", null);
        setIntField(term13717, term13717.getClass(), "type", 0);
        setIntField(term13717, term13717.getClass(), "intValue", 0);
        setField(term13717, term13717.getClass(), "objectValue", null);
        setField(term13709, term13709.getClass(), "propListHead", term13717);
        setIntField(term13709, term13709.getClass(), "sourcePosition", 413214164);
        setField(term13709, term13709.getClass(), "jsType", null);
        setField(term13709, term13709.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2617;
        Object retValue = callMethod(klass, "getPrototypeClassName", argTypes, null, args);
        assertTrue(recursiveEquals(term2617, term13709));
        assertTrue(recursiveEquals(retValue, null));
    }

};


