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

public class NodeUtil_isNameReferenced_1518412862199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2856;
     Object term15126;

    public NodeUtil_isNameReferenced_1518412862199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2856 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2866 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2869 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2876 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2879 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2856, term2856.getClass(), "type", -600102466);
        setIntField(term2858, term2858.getClass(), "type", -37129068);
        setIntField(term2860, term2860.getClass(), "type", 0);
        setField(term2860, term2860.getClass(), "next", null);
        setField(term2860, term2860.getClass(), "first", null);
        setField(term2860, term2860.getClass(), "last", null);
        setField(term2860, term2860.getClass(), "propListHead", null);
        setIntField(term2860, term2860.getClass(), "sourcePosition", 0);
        setField(term2860, term2860.getClass(), "jsType", null);
        setField(term2860, term2860.getClass(), "parent", null);
        setField(term2858, term2858.getClass(), "next", term2860);
        setIntField(term2863, term2863.getClass(), "type", 0);
        setField(term2863, term2863.getClass(), "next", null);
        setField(term2863, term2863.getClass(), "first", null);
        setField(term2863, term2863.getClass(), "last", null);
        setField(term2863, term2863.getClass(), "propListHead", null);
        setIntField(term2863, term2863.getClass(), "sourcePosition", 0);
        setField(term2863, term2863.getClass(), "jsType", null);
        setField(term2863, term2863.getClass(), "parent", null);
        setField(term2858, term2858.getClass(), "first", term2863);
        setIntField(term2866, term2866.getClass(), "type", 0);
        setField(term2866, term2866.getClass(), "next", null);
        setField(term2866, term2866.getClass(), "first", null);
        setField(term2866, term2866.getClass(), "last", null);
        setField(term2866, term2866.getClass(), "propListHead", null);
        setIntField(term2866, term2866.getClass(), "sourcePosition", 0);
        setField(term2866, term2866.getClass(), "jsType", null);
        setField(term2866, term2866.getClass(), "parent", null);
        setField(term2858, term2858.getClass(), "last", term2866);
        setField(term2869, term2869.getClass(), "next", null);
        setIntField(term2869, term2869.getClass(), "type", 0);
        setIntField(term2869, term2869.getClass(), "intValue", 0);
        setField(term2869, term2869.getClass(), "objectValue", null);
        setField(term2858, term2858.getClass(), "propListHead", term2869);
        setIntField(term2858, term2858.getClass(), "sourcePosition", -1261824381);
        setField(term2858, term2858.getClass(), "jsType", null);
        setField(term2858, term2858.getClass(), "parent", null);
        setField(term2856, term2856.getClass(), "next", term2858);
        setIntField(term2873, term2873.getClass(), "type", 0);
        setField(term2873, term2873.getClass(), "next", null);
        setField(term2873, term2873.getClass(), "first", null);
        setField(term2873, term2873.getClass(), "last", null);
        setField(term2873, term2873.getClass(), "propListHead", null);
        setIntField(term2873, term2873.getClass(), "sourcePosition", 0);
        setField(term2873, term2873.getClass(), "jsType", null);
        setField(term2873, term2873.getClass(), "parent", null);
        setField(term2856, term2856.getClass(), "first", term2873);
        setIntField(term2876, term2876.getClass(), "type", 0);
        setField(term2876, term2876.getClass(), "next", null);
        setField(term2876, term2876.getClass(), "first", null);
        setField(term2876, term2876.getClass(), "last", null);
        setField(term2876, term2876.getClass(), "propListHead", null);
        setIntField(term2876, term2876.getClass(), "sourcePosition", 0);
        setField(term2876, term2876.getClass(), "jsType", null);
        setField(term2876, term2876.getClass(), "parent", null);
        setField(term2856, term2856.getClass(), "last", term2876);
        setField(term2879, term2879.getClass(), "next", null);
        setIntField(term2879, term2879.getClass(), "type", 0);
        setIntField(term2879, term2879.getClass(), "intValue", 0);
        setField(term2879, term2879.getClass(), "objectValue", null);
        setField(term2856, term2856.getClass(), "propListHead", term2879);
        setIntField(term2856, term2856.getClass(), "sourcePosition", 1594426218);
        setField(term2856, term2856.getClass(), "jsType", null);
        setField(term2856, term2856.getClass(), "parent", null);
        term15126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15131 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15134 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15126, term15126.getClass(), "type", -600102466);
        setIntField(term15127, term15127.getClass(), "type", -37129068);
        setIntField(term15128, term15128.getClass(), "type", 0);
        setField(term15128, term15128.getClass(), "next", null);
        setField(term15128, term15128.getClass(), "first", null);
        setField(term15128, term15128.getClass(), "last", null);
        setField(term15128, term15128.getClass(), "propListHead", null);
        setIntField(term15128, term15128.getClass(), "sourcePosition", 0);
        setField(term15128, term15128.getClass(), "jsType", null);
        setField(term15128, term15128.getClass(), "parent", null);
        setField(term15127, term15127.getClass(), "next", term15128);
        setIntField(term15129, term15129.getClass(), "type", 0);
        setField(term15129, term15129.getClass(), "next", null);
        setField(term15129, term15129.getClass(), "first", null);
        setField(term15129, term15129.getClass(), "last", null);
        setField(term15129, term15129.getClass(), "propListHead", null);
        setIntField(term15129, term15129.getClass(), "sourcePosition", 0);
        setField(term15129, term15129.getClass(), "jsType", null);
        setField(term15129, term15129.getClass(), "parent", null);
        setField(term15127, term15127.getClass(), "first", term15129);
        setIntField(term15130, term15130.getClass(), "type", 0);
        setField(term15130, term15130.getClass(), "next", null);
        setField(term15130, term15130.getClass(), "first", null);
        setField(term15130, term15130.getClass(), "last", null);
        setField(term15130, term15130.getClass(), "propListHead", null);
        setIntField(term15130, term15130.getClass(), "sourcePosition", 0);
        setField(term15130, term15130.getClass(), "jsType", null);
        setField(term15130, term15130.getClass(), "parent", null);
        setField(term15127, term15127.getClass(), "last", term15130);
        setField(term15131, term15131.getClass(), "next", null);
        setIntField(term15131, term15131.getClass(), "type", 0);
        setIntField(term15131, term15131.getClass(), "intValue", 0);
        setField(term15131, term15131.getClass(), "objectValue", null);
        setField(term15127, term15127.getClass(), "propListHead", term15131);
        setIntField(term15127, term15127.getClass(), "sourcePosition", -1261824381);
        setField(term15127, term15127.getClass(), "jsType", null);
        setField(term15127, term15127.getClass(), "parent", null);
        setField(term15126, term15126.getClass(), "next", term15127);
        setIntField(term15132, term15132.getClass(), "type", 0);
        setField(term15132, term15132.getClass(), "next", null);
        setField(term15132, term15132.getClass(), "first", null);
        setField(term15132, term15132.getClass(), "last", null);
        setField(term15132, term15132.getClass(), "propListHead", null);
        setIntField(term15132, term15132.getClass(), "sourcePosition", 0);
        setField(term15132, term15132.getClass(), "jsType", null);
        setField(term15132, term15132.getClass(), "parent", null);
        setField(term15126, term15126.getClass(), "first", term15132);
        setIntField(term15133, term15133.getClass(), "type", 0);
        setField(term15133, term15133.getClass(), "next", null);
        setField(term15133, term15133.getClass(), "first", null);
        setField(term15133, term15133.getClass(), "last", null);
        setField(term15133, term15133.getClass(), "propListHead", null);
        setIntField(term15133, term15133.getClass(), "sourcePosition", 0);
        setField(term15133, term15133.getClass(), "jsType", null);
        setField(term15133, term15133.getClass(), "parent", null);
        setField(term15126, term15126.getClass(), "last", term15133);
        setField(term15134, term15134.getClass(), "next", null);
        setIntField(term15134, term15134.getClass(), "type", 0);
        setIntField(term15134, term15134.getClass(), "intValue", 0);
        setField(term15134, term15134.getClass(), "objectValue", null);
        setField(term15126, term15126.getClass(), "propListHead", term15134);
        setIntField(term15126, term15126.getClass(), "sourcePosition", 1594426218);
        setField(term15126, term15126.getClass(), "jsType", null);
        setField(term15126, term15126.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term2856;
        args[1] = "BYqFIqCKAV";
        callMethod(klass, "isNameReferenced", argTypes, null, args);
        assertTrue(recursiveEquals(term2856, "BYqFIqCKAV"));
    }

};


