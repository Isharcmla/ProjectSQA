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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5465593;
     Object term5465685;
     Object term5469342;
     Object term5469343;
     Object term5468706;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5465593 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term5465685 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5465777 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5465869 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5465961 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5466129 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term5465777, term5465777.getClass(), "type", 35);
        setIntField(term5465961, term5465961.getClass(), "type", 40);
        setField(term5465961, term5465961.getClass(), "str", "lastIndexOf");
        setField(term5465869, term5465869.getClass(), "next", term5465961);
        setIntField(term5465869, term5465869.getClass(), "type", 40);
        setField(term5465869, term5465869.getClass(), "str", "                    ");
        setField(term5465777, term5465777.getClass(), "first", term5465869);
        setIntField(term5466129, term5466129.getClass(), "type", 40);
        setField(term5466129, term5466129.getClass(), "next", term5465961);
        setField(term5466129, term5466129.getClass(), "str", "");
        setField(term5465777, term5465777.getClass(), "next", term5466129);
        setField(term5465685, term5465685.getClass(), "first", term5465777);
        setIntField(term5465685, term5465685.getClass(), "type", 37);
        term5469342 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term5469342, term5469342.getClass(), "currentTraversal", null);
        term5469343 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5469344 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5469345 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5469348 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5469350 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term5469343, term5469343.getClass(), "str", null);
        setIntField(term5469343, term5469343.getClass(), "type", 37);
        setField(term5469343, term5469343.getClass(), "next", null);
        setField(term5469344, term5469344.getClass(), "str", null);
        setIntField(term5469344, term5469344.getClass(), "type", 35);
        setField(term5469345, term5469345.getClass(), "str", "");
        setIntField(term5469345, term5469345.getClass(), "type", 40);
        setField(term5469348, term5469348.getClass(), "str", "");
        setIntField(term5469348, term5469348.getClass(), "type", 40);
        setField(term5469348, term5469348.getClass(), "next", null);
        setField(term5469348, term5469348.getClass(), "first", null);
        setField(term5469348, term5469348.getClass(), "last", null);
        setField(term5469348, term5469348.getClass(), "propListHead", null);
        setIntField(term5469348, term5469348.getClass(), "sourcePosition", 0);
        setField(term5469348, term5469348.getClass(), "jsType", null);
        setField(term5469348, term5469348.getClass(), "parent", null);
        setField(term5469345, term5469345.getClass(), "next", term5469348);
        setField(term5469345, term5469345.getClass(), "first", null);
        setField(term5469345, term5469345.getClass(), "last", null);
        setField(term5469345, term5469345.getClass(), "propListHead", null);
        setIntField(term5469345, term5469345.getClass(), "sourcePosition", 0);
        setField(term5469345, term5469345.getClass(), "jsType", null);
        setField(term5469345, term5469345.getClass(), "parent", null);
        setField(term5469344, term5469344.getClass(), "next", term5469345);
        setField(term5469350, term5469350.getClass(), "str", "                    ");
        setIntField(term5469350, term5469350.getClass(), "type", 40);
        setField(term5469350, term5469350.getClass(), "next", term5469348);
        setField(term5469350, term5469350.getClass(), "first", null);
        setField(term5469350, term5469350.getClass(), "last", null);
        setField(term5469350, term5469350.getClass(), "propListHead", null);
        setIntField(term5469350, term5469350.getClass(), "sourcePosition", 0);
        setField(term5469350, term5469350.getClass(), "jsType", null);
        setField(term5469350, term5469350.getClass(), "parent", null);
        setField(term5469344, term5469344.getClass(), "first", term5469350);
        setField(term5469344, term5469344.getClass(), "last", null);
        setField(term5469344, term5469344.getClass(), "propListHead", null);
        setIntField(term5469344, term5469344.getClass(), "sourcePosition", 0);
        setField(term5469344, term5469344.getClass(), "jsType", null);
        setField(term5469344, term5469344.getClass(), "parent", null);
        setField(term5469343, term5469343.getClass(), "first", term5469344);
        setField(term5469343, term5469343.getClass(), "last", null);
        setField(term5469343, term5469343.getClass(), "propListHead", null);
        setIntField(term5469343, term5469343.getClass(), "sourcePosition", 0);
        setField(term5469343, term5469343.getClass(), "jsType", null);
        setField(term5469343, term5469343.getClass(), "parent", null);
        term5468706 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5468708 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5468710 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5468714 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5468719 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term5468706, term5468706.getClass(), "str", null);
        setIntField(term5468706, term5468706.getClass(), "type", 37);
        setField(term5468706, term5468706.getClass(), "next", null);
        setField(term5468708, term5468708.getClass(), "str", null);
        setIntField(term5468708, term5468708.getClass(), "type", 35);
        setField(term5468710, term5468710.getClass(), "str", "");
        setIntField(term5468710, term5468710.getClass(), "type", 40);
        setField(term5468714, term5468714.getClass(), "str", "");
        setIntField(term5468714, term5468714.getClass(), "type", 40);
        setField(term5468714, term5468714.getClass(), "next", null);
        setField(term5468714, term5468714.getClass(), "first", null);
        setField(term5468714, term5468714.getClass(), "last", null);
        setField(term5468714, term5468714.getClass(), "propListHead", null);
        setIntField(term5468714, term5468714.getClass(), "sourcePosition", 0);
        setField(term5468714, term5468714.getClass(), "jsType", null);
        setField(term5468714, term5468714.getClass(), "parent", null);
        setField(term5468710, term5468710.getClass(), "next", term5468714);
        setField(term5468710, term5468710.getClass(), "first", null);
        setField(term5468710, term5468710.getClass(), "last", null);
        setField(term5468710, term5468710.getClass(), "propListHead", null);
        setIntField(term5468710, term5468710.getClass(), "sourcePosition", 0);
        setField(term5468710, term5468710.getClass(), "jsType", null);
        setField(term5468710, term5468710.getClass(), "parent", null);
        setField(term5468708, term5468708.getClass(), "next", term5468710);
        setField(term5468719, term5468719.getClass(), "str", "                    ");
        setIntField(term5468719, term5468719.getClass(), "type", 40);
        setField(term5468719, term5468719.getClass(), "next", term5468714);
        setField(term5468719, term5468719.getClass(), "first", null);
        setField(term5468719, term5468719.getClass(), "last", null);
        setField(term5468719, term5468719.getClass(), "propListHead", null);
        setIntField(term5468719, term5468719.getClass(), "sourcePosition", 0);
        setField(term5468719, term5468719.getClass(), "jsType", null);
        setField(term5468719, term5468719.getClass(), "parent", null);
        setField(term5468708, term5468708.getClass(), "first", term5468719);
        setField(term5468708, term5468708.getClass(), "last", null);
        setField(term5468708, term5468708.getClass(), "propListHead", null);
        setIntField(term5468708, term5468708.getClass(), "sourcePosition", 0);
        setField(term5468708, term5468708.getClass(), "jsType", null);
        setField(term5468708, term5468708.getClass(), "parent", null);
        setField(term5468706, term5468706.getClass(), "first", term5468708);
        setField(term5468706, term5468706.getClass(), "last", null);
        setField(term5468706, term5468706.getClass(), "propListHead", null);
        setIntField(term5468706, term5468706.getClass(), "sourcePosition", 0);
        setField(term5468706, term5468706.getClass(), "jsType", null);
        setField(term5468706, term5468706.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term5465685;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term5465593, args);
        assertTrue(recursiveEquals(term5465593, term5469342));
        assertTrue(recursiveEquals(term5465685, term5469343));
        assertTrue(recursiveEquals(retValue, term5468706));
    }

};


