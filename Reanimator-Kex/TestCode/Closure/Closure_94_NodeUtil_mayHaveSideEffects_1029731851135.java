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

public class NodeUtil_mayHaveSideEffects_1029731851135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406;
     Object term5817;

    public NodeUtil_mayHaveSideEffects_1029731851135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term419 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term429 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term406, term406.getClass(), "type", 1041916673);
        setIntField(term408, term408.getClass(), "type", -2066804303);
        setIntField(term410, term410.getClass(), "type", 0);
        setField(term410, term410.getClass(), "next", null);
        setField(term410, term410.getClass(), "first", null);
        setField(term410, term410.getClass(), "last", null);
        setField(term410, term410.getClass(), "propListHead", null);
        setIntField(term410, term410.getClass(), "sourcePosition", 0);
        setField(term410, term410.getClass(), "jsType", null);
        setField(term410, term410.getClass(), "parent", null);
        setField(term408, term408.getClass(), "next", term410);
        setIntField(term413, term413.getClass(), "type", 0);
        setField(term413, term413.getClass(), "next", null);
        setField(term413, term413.getClass(), "first", null);
        setField(term413, term413.getClass(), "last", null);
        setField(term413, term413.getClass(), "propListHead", null);
        setIntField(term413, term413.getClass(), "sourcePosition", 0);
        setField(term413, term413.getClass(), "jsType", null);
        setField(term413, term413.getClass(), "parent", null);
        setField(term408, term408.getClass(), "first", term413);
        setIntField(term416, term416.getClass(), "type", 0);
        setField(term416, term416.getClass(), "next", null);
        setField(term416, term416.getClass(), "first", null);
        setField(term416, term416.getClass(), "last", null);
        setField(term416, term416.getClass(), "propListHead", null);
        setIntField(term416, term416.getClass(), "sourcePosition", 0);
        setField(term416, term416.getClass(), "jsType", null);
        setField(term416, term416.getClass(), "parent", null);
        setField(term408, term408.getClass(), "last", term416);
        setField(term419, term419.getClass(), "next", null);
        setIntField(term419, term419.getClass(), "type", 0);
        setIntField(term419, term419.getClass(), "intValue", 0);
        setField(term419, term419.getClass(), "objectValue", null);
        setField(term408, term408.getClass(), "propListHead", term419);
        setIntField(term408, term408.getClass(), "sourcePosition", -1239406390);
        setField(term408, term408.getClass(), "jsType", null);
        setField(term408, term408.getClass(), "parent", null);
        setField(term406, term406.getClass(), "next", term408);
        setIntField(term423, term423.getClass(), "type", 0);
        setField(term423, term423.getClass(), "next", null);
        setField(term423, term423.getClass(), "first", null);
        setField(term423, term423.getClass(), "last", null);
        setField(term423, term423.getClass(), "propListHead", null);
        setIntField(term423, term423.getClass(), "sourcePosition", 0);
        setField(term423, term423.getClass(), "jsType", null);
        setField(term423, term423.getClass(), "parent", null);
        setField(term406, term406.getClass(), "first", term423);
        setIntField(term426, term426.getClass(), "type", 0);
        setField(term426, term426.getClass(), "next", null);
        setField(term426, term426.getClass(), "first", null);
        setField(term426, term426.getClass(), "last", null);
        setField(term426, term426.getClass(), "propListHead", null);
        setIntField(term426, term426.getClass(), "sourcePosition", 0);
        setField(term426, term426.getClass(), "jsType", null);
        setField(term426, term426.getClass(), "parent", null);
        setField(term406, term406.getClass(), "last", term426);
        setField(term429, term429.getClass(), "next", null);
        setIntField(term429, term429.getClass(), "type", 0);
        setIntField(term429, term429.getClass(), "intValue", 0);
        setField(term429, term429.getClass(), "objectValue", null);
        setField(term406, term406.getClass(), "propListHead", term429);
        setIntField(term406, term406.getClass(), "sourcePosition", 1557431527);
        setField(term406, term406.getClass(), "jsType", null);
        setField(term406, term406.getClass(), "parent", null);
        term5817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5822 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5825 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term5817, term5817.getClass(), "type", 1041916673);
        setIntField(term5818, term5818.getClass(), "type", -2066804303);
        setIntField(term5819, term5819.getClass(), "type", 0);
        setField(term5819, term5819.getClass(), "next", null);
        setField(term5819, term5819.getClass(), "first", null);
        setField(term5819, term5819.getClass(), "last", null);
        setField(term5819, term5819.getClass(), "propListHead", null);
        setIntField(term5819, term5819.getClass(), "sourcePosition", 0);
        setField(term5819, term5819.getClass(), "jsType", null);
        setField(term5819, term5819.getClass(), "parent", null);
        setField(term5818, term5818.getClass(), "next", term5819);
        setIntField(term5820, term5820.getClass(), "type", 0);
        setField(term5820, term5820.getClass(), "next", null);
        setField(term5820, term5820.getClass(), "first", null);
        setField(term5820, term5820.getClass(), "last", null);
        setField(term5820, term5820.getClass(), "propListHead", null);
        setIntField(term5820, term5820.getClass(), "sourcePosition", 0);
        setField(term5820, term5820.getClass(), "jsType", null);
        setField(term5820, term5820.getClass(), "parent", null);
        setField(term5818, term5818.getClass(), "first", term5820);
        setIntField(term5821, term5821.getClass(), "type", 0);
        setField(term5821, term5821.getClass(), "next", null);
        setField(term5821, term5821.getClass(), "first", null);
        setField(term5821, term5821.getClass(), "last", null);
        setField(term5821, term5821.getClass(), "propListHead", null);
        setIntField(term5821, term5821.getClass(), "sourcePosition", 0);
        setField(term5821, term5821.getClass(), "jsType", null);
        setField(term5821, term5821.getClass(), "parent", null);
        setField(term5818, term5818.getClass(), "last", term5821);
        setField(term5822, term5822.getClass(), "next", null);
        setIntField(term5822, term5822.getClass(), "type", 0);
        setIntField(term5822, term5822.getClass(), "intValue", 0);
        setField(term5822, term5822.getClass(), "objectValue", null);
        setField(term5818, term5818.getClass(), "propListHead", term5822);
        setIntField(term5818, term5818.getClass(), "sourcePosition", -1239406390);
        setField(term5818, term5818.getClass(), "jsType", null);
        setField(term5818, term5818.getClass(), "parent", null);
        setField(term5817, term5817.getClass(), "next", term5818);
        setIntField(term5823, term5823.getClass(), "type", 0);
        setField(term5823, term5823.getClass(), "next", null);
        setField(term5823, term5823.getClass(), "first", null);
        setField(term5823, term5823.getClass(), "last", null);
        setField(term5823, term5823.getClass(), "propListHead", null);
        setIntField(term5823, term5823.getClass(), "sourcePosition", 0);
        setField(term5823, term5823.getClass(), "jsType", null);
        setField(term5823, term5823.getClass(), "parent", null);
        setField(term5817, term5817.getClass(), "first", term5823);
        setIntField(term5824, term5824.getClass(), "type", 0);
        setField(term5824, term5824.getClass(), "next", null);
        setField(term5824, term5824.getClass(), "first", null);
        setField(term5824, term5824.getClass(), "last", null);
        setField(term5824, term5824.getClass(), "propListHead", null);
        setIntField(term5824, term5824.getClass(), "sourcePosition", 0);
        setField(term5824, term5824.getClass(), "jsType", null);
        setField(term5824, term5824.getClass(), "parent", null);
        setField(term5817, term5817.getClass(), "last", term5824);
        setField(term5825, term5825.getClass(), "next", null);
        setIntField(term5825, term5825.getClass(), "type", 0);
        setIntField(term5825, term5825.getClass(), "intValue", 0);
        setField(term5825, term5825.getClass(), "objectValue", null);
        setField(term5817, term5817.getClass(), "propListHead", term5825);
        setIntField(term5817, term5817.getClass(), "sourcePosition", 1557431527);
        setField(term5817, term5817.getClass(), "jsType", null);
        setField(term5817, term5817.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term406;
        args[1] = null;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term406, term5817));
    }

};


