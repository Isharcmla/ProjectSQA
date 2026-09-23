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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3508077;
     Object term3508169;
     Object term3509943;
     Object term3509944;
     Object term3509611;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3508077 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3508169 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3508261 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3508353 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3508445 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3508575 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3508667 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3508261, term3508261.getClass(), "type", 35);
        setIntField(term3508445, term3508445.getClass(), "type", 40);
        setField(term3508445, term3508445.getClass(), "str", "indexOf");
        setField(term3508353, term3508353.getClass(), "next", term3508445);
        setIntField(term3508353, term3508353.getClass(), "type", 40);
        setField(term3508353, term3508353.getClass(), "str", null);
        setField(term3508261, term3508261.getClass(), "first", term3508353);
        setIntField(term3508575, term3508575.getClass(), "type", 40);
        setField(term3508667, term3508667.getClass(), "next", null);
        setField(term3508575, term3508575.getClass(), "next", term3508667);
        setField(term3508575, term3508575.getClass(), "str", "");
        setField(term3508261, term3508261.getClass(), "next", term3508575);
        setField(term3508169, term3508169.getClass(), "first", term3508261);
        setIntField(term3508169, term3508169.getClass(), "type", 37);
        term3509943 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3509943, term3509943.getClass(), "currentTraversal", null);
        term3509944 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3509945 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3509946 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3509949 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3509950 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3509951 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3509944, term3509944.getClass(), "str", null);
        setIntField(term3509944, term3509944.getClass(), "type", 37);
        setField(term3509944, term3509944.getClass(), "next", null);
        setField(term3509945, term3509945.getClass(), "str", null);
        setIntField(term3509945, term3509945.getClass(), "type", 35);
        setField(term3509946, term3509946.getClass(), "str", "");
        setIntField(term3509946, term3509946.getClass(), "type", 40);
        setField(term3509949, term3509949.getClass(), "str", null);
        setIntField(term3509949, term3509949.getClass(), "type", 0);
        setField(term3509949, term3509949.getClass(), "next", null);
        setField(term3509949, term3509949.getClass(), "first", null);
        setField(term3509949, term3509949.getClass(), "last", null);
        setField(term3509949, term3509949.getClass(), "propListHead", null);
        setIntField(term3509949, term3509949.getClass(), "sourcePosition", 0);
        setField(term3509949, term3509949.getClass(), "jsType", null);
        setField(term3509949, term3509949.getClass(), "parent", null);
        setField(term3509946, term3509946.getClass(), "next", term3509949);
        setField(term3509946, term3509946.getClass(), "first", null);
        setField(term3509946, term3509946.getClass(), "last", null);
        setField(term3509946, term3509946.getClass(), "propListHead", null);
        setIntField(term3509946, term3509946.getClass(), "sourcePosition", 0);
        setField(term3509946, term3509946.getClass(), "jsType", null);
        setField(term3509946, term3509946.getClass(), "parent", null);
        setField(term3509945, term3509945.getClass(), "next", term3509946);
        setField(term3509950, term3509950.getClass(), "str", null);
        setIntField(term3509950, term3509950.getClass(), "type", 40);
        setField(term3509951, term3509951.getClass(), "str", "");
        setIntField(term3509951, term3509951.getClass(), "type", 40);
        setField(term3509951, term3509951.getClass(), "next", null);
        setField(term3509951, term3509951.getClass(), "first", null);
        setField(term3509951, term3509951.getClass(), "last", null);
        setField(term3509951, term3509951.getClass(), "propListHead", null);
        setIntField(term3509951, term3509951.getClass(), "sourcePosition", 0);
        setField(term3509951, term3509951.getClass(), "jsType", null);
        setField(term3509951, term3509951.getClass(), "parent", null);
        setField(term3509950, term3509950.getClass(), "next", term3509951);
        setField(term3509950, term3509950.getClass(), "first", null);
        setField(term3509950, term3509950.getClass(), "last", null);
        setField(term3509950, term3509950.getClass(), "propListHead", null);
        setIntField(term3509950, term3509950.getClass(), "sourcePosition", 0);
        setField(term3509950, term3509950.getClass(), "jsType", null);
        setField(term3509950, term3509950.getClass(), "parent", null);
        setField(term3509945, term3509945.getClass(), "first", term3509950);
        setField(term3509945, term3509945.getClass(), "last", null);
        setField(term3509945, term3509945.getClass(), "propListHead", null);
        setIntField(term3509945, term3509945.getClass(), "sourcePosition", 0);
        setField(term3509945, term3509945.getClass(), "jsType", null);
        setField(term3509945, term3509945.getClass(), "parent", null);
        setField(term3509944, term3509944.getClass(), "first", term3509945);
        setField(term3509944, term3509944.getClass(), "last", null);
        setField(term3509944, term3509944.getClass(), "propListHead", null);
        setIntField(term3509944, term3509944.getClass(), "sourcePosition", 0);
        setField(term3509944, term3509944.getClass(), "jsType", null);
        setField(term3509944, term3509944.getClass(), "parent", null);
        term3509611 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3509613 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3509615 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3509619 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3509623 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3509625 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3509611, term3509611.getClass(), "str", null);
        setIntField(term3509611, term3509611.getClass(), "type", 37);
        setField(term3509611, term3509611.getClass(), "next", null);
        setField(term3509613, term3509613.getClass(), "str", null);
        setIntField(term3509613, term3509613.getClass(), "type", 35);
        setField(term3509615, term3509615.getClass(), "str", "");
        setIntField(term3509615, term3509615.getClass(), "type", 40);
        setField(term3509619, term3509619.getClass(), "str", null);
        setIntField(term3509619, term3509619.getClass(), "type", 0);
        setField(term3509619, term3509619.getClass(), "next", null);
        setField(term3509619, term3509619.getClass(), "first", null);
        setField(term3509619, term3509619.getClass(), "last", null);
        setField(term3509619, term3509619.getClass(), "propListHead", null);
        setIntField(term3509619, term3509619.getClass(), "sourcePosition", 0);
        setField(term3509619, term3509619.getClass(), "jsType", null);
        setField(term3509619, term3509619.getClass(), "parent", null);
        setField(term3509615, term3509615.getClass(), "next", term3509619);
        setField(term3509615, term3509615.getClass(), "first", null);
        setField(term3509615, term3509615.getClass(), "last", null);
        setField(term3509615, term3509615.getClass(), "propListHead", null);
        setIntField(term3509615, term3509615.getClass(), "sourcePosition", 0);
        setField(term3509615, term3509615.getClass(), "jsType", null);
        setField(term3509615, term3509615.getClass(), "parent", null);
        setField(term3509613, term3509613.getClass(), "next", term3509615);
        setField(term3509623, term3509623.getClass(), "str", null);
        setIntField(term3509623, term3509623.getClass(), "type", 40);
        setField(term3509625, term3509625.getClass(), "str", "");
        setIntField(term3509625, term3509625.getClass(), "type", 40);
        setField(term3509625, term3509625.getClass(), "next", null);
        setField(term3509625, term3509625.getClass(), "first", null);
        setField(term3509625, term3509625.getClass(), "last", null);
        setField(term3509625, term3509625.getClass(), "propListHead", null);
        setIntField(term3509625, term3509625.getClass(), "sourcePosition", 0);
        setField(term3509625, term3509625.getClass(), "jsType", null);
        setField(term3509625, term3509625.getClass(), "parent", null);
        setField(term3509623, term3509623.getClass(), "next", term3509625);
        setField(term3509623, term3509623.getClass(), "first", null);
        setField(term3509623, term3509623.getClass(), "last", null);
        setField(term3509623, term3509623.getClass(), "propListHead", null);
        setIntField(term3509623, term3509623.getClass(), "sourcePosition", 0);
        setField(term3509623, term3509623.getClass(), "jsType", null);
        setField(term3509623, term3509623.getClass(), "parent", null);
        setField(term3509613, term3509613.getClass(), "first", term3509623);
        setField(term3509613, term3509613.getClass(), "last", null);
        setField(term3509613, term3509613.getClass(), "propListHead", null);
        setIntField(term3509613, term3509613.getClass(), "sourcePosition", 0);
        setField(term3509613, term3509613.getClass(), "jsType", null);
        setField(term3509613, term3509613.getClass(), "parent", null);
        setField(term3509611, term3509611.getClass(), "first", term3509613);
        setField(term3509611, term3509611.getClass(), "last", null);
        setField(term3509611, term3509611.getClass(), "propListHead", null);
        setIntField(term3509611, term3509611.getClass(), "sourcePosition", 0);
        setField(term3509611, term3509611.getClass(), "jsType", null);
        setField(term3509611, term3509611.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3508169;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3508077, args);
        assertTrue(recursiveEquals(term3508077, term3509943));
        assertTrue(recursiveEquals(term3508169, term3509944));
        assertTrue(recursiveEquals(retValue, term3509611));
    }

};


