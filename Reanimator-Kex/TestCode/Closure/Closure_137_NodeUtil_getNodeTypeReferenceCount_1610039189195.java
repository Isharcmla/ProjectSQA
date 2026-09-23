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
import java.lang.Integer;

public class NodeUtil_getNodeTypeReferenceCount_1610039189195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2751;
     Object term2778;
     Object term14553;

    public NodeUtil_getNodeTypeReferenceCount_1610039189195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2764 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2774 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2751, term2751.getClass(), "type", -1186882318);
        setIntField(term2753, term2753.getClass(), "type", 303007547);
        setIntField(term2755, term2755.getClass(), "type", 0);
        setField(term2755, term2755.getClass(), "next", null);
        setField(term2755, term2755.getClass(), "first", null);
        setField(term2755, term2755.getClass(), "last", null);
        setField(term2755, term2755.getClass(), "propListHead", null);
        setIntField(term2755, term2755.getClass(), "sourcePosition", 0);
        setField(term2755, term2755.getClass(), "jsType", null);
        setField(term2755, term2755.getClass(), "parent", null);
        setField(term2753, term2753.getClass(), "next", term2755);
        setIntField(term2758, term2758.getClass(), "type", 0);
        setField(term2758, term2758.getClass(), "next", null);
        setField(term2758, term2758.getClass(), "first", null);
        setField(term2758, term2758.getClass(), "last", null);
        setField(term2758, term2758.getClass(), "propListHead", null);
        setIntField(term2758, term2758.getClass(), "sourcePosition", 0);
        setField(term2758, term2758.getClass(), "jsType", null);
        setField(term2758, term2758.getClass(), "parent", null);
        setField(term2753, term2753.getClass(), "first", term2758);
        setIntField(term2761, term2761.getClass(), "type", 0);
        setField(term2761, term2761.getClass(), "next", null);
        setField(term2761, term2761.getClass(), "first", null);
        setField(term2761, term2761.getClass(), "last", null);
        setField(term2761, term2761.getClass(), "propListHead", null);
        setIntField(term2761, term2761.getClass(), "sourcePosition", 0);
        setField(term2761, term2761.getClass(), "jsType", null);
        setField(term2761, term2761.getClass(), "parent", null);
        setField(term2753, term2753.getClass(), "last", term2761);
        setField(term2764, term2764.getClass(), "next", null);
        setIntField(term2764, term2764.getClass(), "type", 0);
        setIntField(term2764, term2764.getClass(), "intValue", 0);
        setField(term2764, term2764.getClass(), "objectValue", null);
        setField(term2753, term2753.getClass(), "propListHead", term2764);
        setIntField(term2753, term2753.getClass(), "sourcePosition", 1407309162);
        setField(term2753, term2753.getClass(), "jsType", null);
        setField(term2753, term2753.getClass(), "parent", null);
        setField(term2751, term2751.getClass(), "next", term2753);
        setIntField(term2768, term2768.getClass(), "type", 0);
        setField(term2768, term2768.getClass(), "next", null);
        setField(term2768, term2768.getClass(), "first", null);
        setField(term2768, term2768.getClass(), "last", null);
        setField(term2768, term2768.getClass(), "propListHead", null);
        setIntField(term2768, term2768.getClass(), "sourcePosition", 0);
        setField(term2768, term2768.getClass(), "jsType", null);
        setField(term2768, term2768.getClass(), "parent", null);
        setField(term2751, term2751.getClass(), "first", term2768);
        setIntField(term2771, term2771.getClass(), "type", 0);
        setField(term2771, term2771.getClass(), "next", null);
        setField(term2771, term2771.getClass(), "first", null);
        setField(term2771, term2771.getClass(), "last", null);
        setField(term2771, term2771.getClass(), "propListHead", null);
        setIntField(term2771, term2771.getClass(), "sourcePosition", 0);
        setField(term2771, term2771.getClass(), "jsType", null);
        setField(term2771, term2771.getClass(), "parent", null);
        setField(term2751, term2751.getClass(), "last", term2771);
        setField(term2774, term2774.getClass(), "next", null);
        setIntField(term2774, term2774.getClass(), "type", 0);
        setIntField(term2774, term2774.getClass(), "intValue", 0);
        setField(term2774, term2774.getClass(), "objectValue", null);
        setField(term2751, term2751.getClass(), "propListHead", term2774);
        setIntField(term2751, term2751.getClass(), "sourcePosition", -534033672);
        setField(term2751, term2751.getClass(), "jsType", null);
        setField(term2751, term2751.getClass(), "parent", null);
        term2778 = new Integer(-1162790806);
        term14553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14558 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term14559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14561 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term14553, term14553.getClass(), "type", -1186882318);
        setIntField(term14554, term14554.getClass(), "type", 303007547);
        setIntField(term14555, term14555.getClass(), "type", 0);
        setField(term14555, term14555.getClass(), "next", null);
        setField(term14555, term14555.getClass(), "first", null);
        setField(term14555, term14555.getClass(), "last", null);
        setField(term14555, term14555.getClass(), "propListHead", null);
        setIntField(term14555, term14555.getClass(), "sourcePosition", 0);
        setField(term14555, term14555.getClass(), "jsType", null);
        setField(term14555, term14555.getClass(), "parent", null);
        setField(term14554, term14554.getClass(), "next", term14555);
        setIntField(term14556, term14556.getClass(), "type", 0);
        setField(term14556, term14556.getClass(), "next", null);
        setField(term14556, term14556.getClass(), "first", null);
        setField(term14556, term14556.getClass(), "last", null);
        setField(term14556, term14556.getClass(), "propListHead", null);
        setIntField(term14556, term14556.getClass(), "sourcePosition", 0);
        setField(term14556, term14556.getClass(), "jsType", null);
        setField(term14556, term14556.getClass(), "parent", null);
        setField(term14554, term14554.getClass(), "first", term14556);
        setIntField(term14557, term14557.getClass(), "type", 0);
        setField(term14557, term14557.getClass(), "next", null);
        setField(term14557, term14557.getClass(), "first", null);
        setField(term14557, term14557.getClass(), "last", null);
        setField(term14557, term14557.getClass(), "propListHead", null);
        setIntField(term14557, term14557.getClass(), "sourcePosition", 0);
        setField(term14557, term14557.getClass(), "jsType", null);
        setField(term14557, term14557.getClass(), "parent", null);
        setField(term14554, term14554.getClass(), "last", term14557);
        setField(term14558, term14558.getClass(), "next", null);
        setIntField(term14558, term14558.getClass(), "type", 0);
        setIntField(term14558, term14558.getClass(), "intValue", 0);
        setField(term14558, term14558.getClass(), "objectValue", null);
        setField(term14554, term14554.getClass(), "propListHead", term14558);
        setIntField(term14554, term14554.getClass(), "sourcePosition", 1407309162);
        setField(term14554, term14554.getClass(), "jsType", null);
        setField(term14554, term14554.getClass(), "parent", null);
        setField(term14553, term14553.getClass(), "next", term14554);
        setIntField(term14559, term14559.getClass(), "type", 0);
        setField(term14559, term14559.getClass(), "next", null);
        setField(term14559, term14559.getClass(), "first", null);
        setField(term14559, term14559.getClass(), "last", null);
        setField(term14559, term14559.getClass(), "propListHead", null);
        setIntField(term14559, term14559.getClass(), "sourcePosition", 0);
        setField(term14559, term14559.getClass(), "jsType", null);
        setField(term14559, term14559.getClass(), "parent", null);
        setField(term14553, term14553.getClass(), "first", term14559);
        setIntField(term14560, term14560.getClass(), "type", 0);
        setField(term14560, term14560.getClass(), "next", null);
        setField(term14560, term14560.getClass(), "first", null);
        setField(term14560, term14560.getClass(), "last", null);
        setField(term14560, term14560.getClass(), "propListHead", null);
        setIntField(term14560, term14560.getClass(), "sourcePosition", 0);
        setField(term14560, term14560.getClass(), "jsType", null);
        setField(term14560, term14560.getClass(), "parent", null);
        setField(term14553, term14553.getClass(), "last", term14560);
        setField(term14561, term14561.getClass(), "next", null);
        setIntField(term14561, term14561.getClass(), "type", 0);
        setIntField(term14561, term14561.getClass(), "intValue", 0);
        setField(term14561, term14561.getClass(), "objectValue", null);
        setField(term14553, term14553.getClass(), "propListHead", term14561);
        setIntField(term14553, term14553.getClass(), "sourcePosition", -534033672);
        setField(term14553, term14553.getClass(), "jsType", null);
        setField(term14553, term14553.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2751;
        args[1] = term2778;
        Object retValue = callMethod(klass, "getNodeTypeReferenceCount", argTypes, null, args);
        assertTrue(recursiveEquals(term2751, -1162790806));
        assertTrue(recursiveEquals(term2778, term14553));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


