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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3463552;
     Object term3463644;
     Object term3467549;
     Object term3467550;
     Object term3467236;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3463552 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3463644 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3463736 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3463828 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3463920 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3464050 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3463736, term3463736.getClass(), "type", 35);
        setIntField(term3463920, term3463920.getClass(), "type", 40);
        setField(term3463920, term3463920.getClass(), "str", "lastIndexOf");
        setField(term3463828, term3463828.getClass(), "next", term3463920);
        setIntField(term3463828, term3463828.getClass(), "type", 40);
        setField(term3463736, term3463736.getClass(), "first", term3463828);
        setIntField(term3464050, term3464050.getClass(), "type", 40);
        setField(term3463736, term3463736.getClass(), "next", term3464050);
        setField(term3463644, term3463644.getClass(), "first", term3463736);
        setIntField(term3463644, term3463644.getClass(), "type", 37);
        term3467549 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3467549, term3467549.getClass(), "currentTraversal", null);
        term3467550 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3467551 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3467552 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3467553 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3467554 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3467550, term3467550.getClass(), "str", null);
        setIntField(term3467550, term3467550.getClass(), "type", 37);
        setField(term3467550, term3467550.getClass(), "next", null);
        setField(term3467551, term3467551.getClass(), "str", null);
        setIntField(term3467551, term3467551.getClass(), "type", 35);
        setField(term3467552, term3467552.getClass(), "str", null);
        setIntField(term3467552, term3467552.getClass(), "type", 40);
        setField(term3467552, term3467552.getClass(), "next", null);
        setField(term3467552, term3467552.getClass(), "first", null);
        setField(term3467552, term3467552.getClass(), "last", null);
        setField(term3467552, term3467552.getClass(), "propListHead", null);
        setIntField(term3467552, term3467552.getClass(), "sourcePosition", 0);
        setField(term3467552, term3467552.getClass(), "jsType", null);
        setField(term3467552, term3467552.getClass(), "parent", null);
        setField(term3467551, term3467551.getClass(), "next", term3467552);
        setField(term3467553, term3467553.getClass(), "str", null);
        setIntField(term3467553, term3467553.getClass(), "type", 40);
        setField(term3467554, term3467554.getClass(), "str", "");
        setIntField(term3467554, term3467554.getClass(), "type", 40);
        setField(term3467554, term3467554.getClass(), "next", null);
        setField(term3467554, term3467554.getClass(), "first", null);
        setField(term3467554, term3467554.getClass(), "last", null);
        setField(term3467554, term3467554.getClass(), "propListHead", null);
        setIntField(term3467554, term3467554.getClass(), "sourcePosition", 0);
        setField(term3467554, term3467554.getClass(), "jsType", null);
        setField(term3467554, term3467554.getClass(), "parent", null);
        setField(term3467553, term3467553.getClass(), "next", term3467554);
        setField(term3467553, term3467553.getClass(), "first", null);
        setField(term3467553, term3467553.getClass(), "last", null);
        setField(term3467553, term3467553.getClass(), "propListHead", null);
        setIntField(term3467553, term3467553.getClass(), "sourcePosition", 0);
        setField(term3467553, term3467553.getClass(), "jsType", null);
        setField(term3467553, term3467553.getClass(), "parent", null);
        setField(term3467551, term3467551.getClass(), "first", term3467553);
        setField(term3467551, term3467551.getClass(), "last", null);
        setField(term3467551, term3467551.getClass(), "propListHead", null);
        setIntField(term3467551, term3467551.getClass(), "sourcePosition", 0);
        setField(term3467551, term3467551.getClass(), "jsType", null);
        setField(term3467551, term3467551.getClass(), "parent", null);
        setField(term3467550, term3467550.getClass(), "first", term3467551);
        setField(term3467550, term3467550.getClass(), "last", null);
        setField(term3467550, term3467550.getClass(), "propListHead", null);
        setIntField(term3467550, term3467550.getClass(), "sourcePosition", 0);
        setField(term3467550, term3467550.getClass(), "jsType", null);
        setField(term3467550, term3467550.getClass(), "parent", null);
        term3467236 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3467238 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3467240 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3467243 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3467245 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3467236, term3467236.getClass(), "str", null);
        setIntField(term3467236, term3467236.getClass(), "type", 37);
        setField(term3467236, term3467236.getClass(), "next", null);
        setField(term3467238, term3467238.getClass(), "str", null);
        setIntField(term3467238, term3467238.getClass(), "type", 35);
        setField(term3467240, term3467240.getClass(), "str", null);
        setIntField(term3467240, term3467240.getClass(), "type", 40);
        setField(term3467240, term3467240.getClass(), "next", null);
        setField(term3467240, term3467240.getClass(), "first", null);
        setField(term3467240, term3467240.getClass(), "last", null);
        setField(term3467240, term3467240.getClass(), "propListHead", null);
        setIntField(term3467240, term3467240.getClass(), "sourcePosition", 0);
        setField(term3467240, term3467240.getClass(), "jsType", null);
        setField(term3467240, term3467240.getClass(), "parent", null);
        setField(term3467238, term3467238.getClass(), "next", term3467240);
        setField(term3467243, term3467243.getClass(), "str", null);
        setIntField(term3467243, term3467243.getClass(), "type", 40);
        setField(term3467245, term3467245.getClass(), "str", "");
        setIntField(term3467245, term3467245.getClass(), "type", 40);
        setField(term3467245, term3467245.getClass(), "next", null);
        setField(term3467245, term3467245.getClass(), "first", null);
        setField(term3467245, term3467245.getClass(), "last", null);
        setField(term3467245, term3467245.getClass(), "propListHead", null);
        setIntField(term3467245, term3467245.getClass(), "sourcePosition", 0);
        setField(term3467245, term3467245.getClass(), "jsType", null);
        setField(term3467245, term3467245.getClass(), "parent", null);
        setField(term3467243, term3467243.getClass(), "next", term3467245);
        setField(term3467243, term3467243.getClass(), "first", null);
        setField(term3467243, term3467243.getClass(), "last", null);
        setField(term3467243, term3467243.getClass(), "propListHead", null);
        setIntField(term3467243, term3467243.getClass(), "sourcePosition", 0);
        setField(term3467243, term3467243.getClass(), "jsType", null);
        setField(term3467243, term3467243.getClass(), "parent", null);
        setField(term3467238, term3467238.getClass(), "first", term3467243);
        setField(term3467238, term3467238.getClass(), "last", null);
        setField(term3467238, term3467238.getClass(), "propListHead", null);
        setIntField(term3467238, term3467238.getClass(), "sourcePosition", 0);
        setField(term3467238, term3467238.getClass(), "jsType", null);
        setField(term3467238, term3467238.getClass(), "parent", null);
        setField(term3467236, term3467236.getClass(), "first", term3467238);
        setField(term3467236, term3467236.getClass(), "last", null);
        setField(term3467236, term3467236.getClass(), "propListHead", null);
        setIntField(term3467236, term3467236.getClass(), "sourcePosition", 0);
        setField(term3467236, term3467236.getClass(), "jsType", null);
        setField(term3467236, term3467236.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3463644;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3463552, args);
        assertTrue(recursiveEquals(term3463552, term3467549));
        assertTrue(recursiveEquals(term3463644, term3467550));
        assertTrue(recursiveEquals(retValue, term3467236));
    }

};


