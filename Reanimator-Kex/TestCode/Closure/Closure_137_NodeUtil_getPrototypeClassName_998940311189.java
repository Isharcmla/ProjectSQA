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

public class NodeUtil_getPrototypeClassName_998940311189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2590;
     Object term13365;

    public NodeUtil_getPrototypeClassName_998940311189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2603 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2613 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2590, term2590.getClass(), "type", -1023366103);
        setIntField(term2592, term2592.getClass(), "type", -2137419728);
        setIntField(term2594, term2594.getClass(), "type", 0);
        setField(term2594, term2594.getClass(), "next", null);
        setField(term2594, term2594.getClass(), "first", null);
        setField(term2594, term2594.getClass(), "last", null);
        setField(term2594, term2594.getClass(), "propListHead", null);
        setIntField(term2594, term2594.getClass(), "sourcePosition", 0);
        setField(term2594, term2594.getClass(), "jsType", null);
        setField(term2594, term2594.getClass(), "parent", null);
        setField(term2592, term2592.getClass(), "next", term2594);
        setIntField(term2597, term2597.getClass(), "type", 0);
        setField(term2597, term2597.getClass(), "next", null);
        setField(term2597, term2597.getClass(), "first", null);
        setField(term2597, term2597.getClass(), "last", null);
        setField(term2597, term2597.getClass(), "propListHead", null);
        setIntField(term2597, term2597.getClass(), "sourcePosition", 0);
        setField(term2597, term2597.getClass(), "jsType", null);
        setField(term2597, term2597.getClass(), "parent", null);
        setField(term2592, term2592.getClass(), "first", term2597);
        setIntField(term2600, term2600.getClass(), "type", 0);
        setField(term2600, term2600.getClass(), "next", null);
        setField(term2600, term2600.getClass(), "first", null);
        setField(term2600, term2600.getClass(), "last", null);
        setField(term2600, term2600.getClass(), "propListHead", null);
        setIntField(term2600, term2600.getClass(), "sourcePosition", 0);
        setField(term2600, term2600.getClass(), "jsType", null);
        setField(term2600, term2600.getClass(), "parent", null);
        setField(term2592, term2592.getClass(), "last", term2600);
        setField(term2603, term2603.getClass(), "next", null);
        setIntField(term2603, term2603.getClass(), "type", 0);
        setIntField(term2603, term2603.getClass(), "intValue", 0);
        setField(term2603, term2603.getClass(), "objectValue", null);
        setField(term2592, term2592.getClass(), "propListHead", term2603);
        setIntField(term2592, term2592.getClass(), "sourcePosition", -2126539433);
        setField(term2592, term2592.getClass(), "jsType", null);
        setField(term2592, term2592.getClass(), "parent", null);
        setField(term2590, term2590.getClass(), "next", term2592);
        setIntField(term2607, term2607.getClass(), "type", 0);
        setField(term2607, term2607.getClass(), "next", null);
        setField(term2607, term2607.getClass(), "first", null);
        setField(term2607, term2607.getClass(), "last", null);
        setField(term2607, term2607.getClass(), "propListHead", null);
        setIntField(term2607, term2607.getClass(), "sourcePosition", 0);
        setField(term2607, term2607.getClass(), "jsType", null);
        setField(term2607, term2607.getClass(), "parent", null);
        setField(term2590, term2590.getClass(), "first", term2607);
        setIntField(term2610, term2610.getClass(), "type", 0);
        setField(term2610, term2610.getClass(), "next", null);
        setField(term2610, term2610.getClass(), "first", null);
        setField(term2610, term2610.getClass(), "last", null);
        setField(term2610, term2610.getClass(), "propListHead", null);
        setIntField(term2610, term2610.getClass(), "sourcePosition", 0);
        setField(term2610, term2610.getClass(), "jsType", null);
        setField(term2610, term2610.getClass(), "parent", null);
        setField(term2590, term2590.getClass(), "last", term2610);
        setField(term2613, term2613.getClass(), "next", null);
        setIntField(term2613, term2613.getClass(), "type", 0);
        setIntField(term2613, term2613.getClass(), "intValue", 0);
        setField(term2613, term2613.getClass(), "objectValue", null);
        setField(term2590, term2590.getClass(), "propListHead", term2613);
        setIntField(term2590, term2590.getClass(), "sourcePosition", 196952878);
        setField(term2590, term2590.getClass(), "jsType", null);
        setField(term2590, term2590.getClass(), "parent", null);
        term13365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13370 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term13371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13373 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term13365, term13365.getClass(), "type", -1023366103);
        setIntField(term13366, term13366.getClass(), "type", -2137419728);
        setIntField(term13367, term13367.getClass(), "type", 0);
        setField(term13367, term13367.getClass(), "next", null);
        setField(term13367, term13367.getClass(), "first", null);
        setField(term13367, term13367.getClass(), "last", null);
        setField(term13367, term13367.getClass(), "propListHead", null);
        setIntField(term13367, term13367.getClass(), "sourcePosition", 0);
        setField(term13367, term13367.getClass(), "jsType", null);
        setField(term13367, term13367.getClass(), "parent", null);
        setField(term13366, term13366.getClass(), "next", term13367);
        setIntField(term13368, term13368.getClass(), "type", 0);
        setField(term13368, term13368.getClass(), "next", null);
        setField(term13368, term13368.getClass(), "first", null);
        setField(term13368, term13368.getClass(), "last", null);
        setField(term13368, term13368.getClass(), "propListHead", null);
        setIntField(term13368, term13368.getClass(), "sourcePosition", 0);
        setField(term13368, term13368.getClass(), "jsType", null);
        setField(term13368, term13368.getClass(), "parent", null);
        setField(term13366, term13366.getClass(), "first", term13368);
        setIntField(term13369, term13369.getClass(), "type", 0);
        setField(term13369, term13369.getClass(), "next", null);
        setField(term13369, term13369.getClass(), "first", null);
        setField(term13369, term13369.getClass(), "last", null);
        setField(term13369, term13369.getClass(), "propListHead", null);
        setIntField(term13369, term13369.getClass(), "sourcePosition", 0);
        setField(term13369, term13369.getClass(), "jsType", null);
        setField(term13369, term13369.getClass(), "parent", null);
        setField(term13366, term13366.getClass(), "last", term13369);
        setField(term13370, term13370.getClass(), "next", null);
        setIntField(term13370, term13370.getClass(), "type", 0);
        setIntField(term13370, term13370.getClass(), "intValue", 0);
        setField(term13370, term13370.getClass(), "objectValue", null);
        setField(term13366, term13366.getClass(), "propListHead", term13370);
        setIntField(term13366, term13366.getClass(), "sourcePosition", -2126539433);
        setField(term13366, term13366.getClass(), "jsType", null);
        setField(term13366, term13366.getClass(), "parent", null);
        setField(term13365, term13365.getClass(), "next", term13366);
        setIntField(term13371, term13371.getClass(), "type", 0);
        setField(term13371, term13371.getClass(), "next", null);
        setField(term13371, term13371.getClass(), "first", null);
        setField(term13371, term13371.getClass(), "last", null);
        setField(term13371, term13371.getClass(), "propListHead", null);
        setIntField(term13371, term13371.getClass(), "sourcePosition", 0);
        setField(term13371, term13371.getClass(), "jsType", null);
        setField(term13371, term13371.getClass(), "parent", null);
        setField(term13365, term13365.getClass(), "first", term13371);
        setIntField(term13372, term13372.getClass(), "type", 0);
        setField(term13372, term13372.getClass(), "next", null);
        setField(term13372, term13372.getClass(), "first", null);
        setField(term13372, term13372.getClass(), "last", null);
        setField(term13372, term13372.getClass(), "propListHead", null);
        setIntField(term13372, term13372.getClass(), "sourcePosition", 0);
        setField(term13372, term13372.getClass(), "jsType", null);
        setField(term13372, term13372.getClass(), "parent", null);
        setField(term13365, term13365.getClass(), "last", term13372);
        setField(term13373, term13373.getClass(), "next", null);
        setIntField(term13373, term13373.getClass(), "type", 0);
        setIntField(term13373, term13373.getClass(), "intValue", 0);
        setField(term13373, term13373.getClass(), "objectValue", null);
        setField(term13365, term13365.getClass(), "propListHead", term13373);
        setIntField(term13365, term13365.getClass(), "sourcePosition", 196952878);
        setField(term13365, term13365.getClass(), "jsType", null);
        setField(term13365, term13365.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2590;
        Object retValue = callMethod(klass, "getPrototypeClassName", argTypes, null, args);
        assertTrue(recursiveEquals(term2590, term13365));
        assertTrue(recursiveEquals(retValue, null));
    }

};


