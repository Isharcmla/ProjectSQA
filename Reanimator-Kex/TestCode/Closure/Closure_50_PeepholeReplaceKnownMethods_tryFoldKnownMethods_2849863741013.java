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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4214421;
     Object term4214513;
     Object term4216078;
     Object term4216079;
     Object term4215820;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4214421 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4214513 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4214605 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4214697 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4214789 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4214919 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term4214605, term4214605.getClass(), "type", 35);
        setIntField(term4214789, term4214789.getClass(), "type", 40);
        setField(term4214789, term4214789.getClass(), "str", "charAt");
        setField(term4214697, term4214697.getClass(), "next", term4214789);
        setIntField(term4214697, term4214697.getClass(), "type", 40);
        setField(term4214605, term4214605.getClass(), "first", term4214697);
        setIntField(term4214919, term4214919.getClass(), "type", 41);
        setField(term4214605, term4214605.getClass(), "next", term4214919);
        setField(term4214513, term4214513.getClass(), "first", term4214605);
        setIntField(term4214513, term4214513.getClass(), "type", 37);
        term4216078 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term4216078, term4216078.getClass(), "currentTraversal", null);
        term4216079 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4216080 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4216081 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4216082 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4216083 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4216079, term4216079.getClass(), "str", null);
        setIntField(term4216079, term4216079.getClass(), "type", 37);
        setField(term4216079, term4216079.getClass(), "next", null);
        setField(term4216080, term4216080.getClass(), "str", null);
        setIntField(term4216080, term4216080.getClass(), "type", 35);
        setField(term4216081, term4216081.getClass(), "str", null);
        setIntField(term4216081, term4216081.getClass(), "type", 41);
        setField(term4216081, term4216081.getClass(), "next", null);
        setField(term4216081, term4216081.getClass(), "first", null);
        setField(term4216081, term4216081.getClass(), "last", null);
        setField(term4216081, term4216081.getClass(), "propListHead", null);
        setIntField(term4216081, term4216081.getClass(), "sourcePosition", 0);
        setField(term4216081, term4216081.getClass(), "jsType", null);
        setField(term4216081, term4216081.getClass(), "parent", null);
        setField(term4216080, term4216080.getClass(), "next", term4216081);
        setField(term4216082, term4216082.getClass(), "str", null);
        setIntField(term4216082, term4216082.getClass(), "type", 40);
        setField(term4216083, term4216083.getClass(), "str", "");
        setIntField(term4216083, term4216083.getClass(), "type", 40);
        setField(term4216083, term4216083.getClass(), "next", null);
        setField(term4216083, term4216083.getClass(), "first", null);
        setField(term4216083, term4216083.getClass(), "last", null);
        setField(term4216083, term4216083.getClass(), "propListHead", null);
        setIntField(term4216083, term4216083.getClass(), "sourcePosition", 0);
        setField(term4216083, term4216083.getClass(), "jsType", null);
        setField(term4216083, term4216083.getClass(), "parent", null);
        setField(term4216082, term4216082.getClass(), "next", term4216083);
        setField(term4216082, term4216082.getClass(), "first", null);
        setField(term4216082, term4216082.getClass(), "last", null);
        setField(term4216082, term4216082.getClass(), "propListHead", null);
        setIntField(term4216082, term4216082.getClass(), "sourcePosition", 0);
        setField(term4216082, term4216082.getClass(), "jsType", null);
        setField(term4216082, term4216082.getClass(), "parent", null);
        setField(term4216080, term4216080.getClass(), "first", term4216082);
        setField(term4216080, term4216080.getClass(), "last", null);
        setField(term4216080, term4216080.getClass(), "propListHead", null);
        setIntField(term4216080, term4216080.getClass(), "sourcePosition", 0);
        setField(term4216080, term4216080.getClass(), "jsType", null);
        setField(term4216080, term4216080.getClass(), "parent", null);
        setField(term4216079, term4216079.getClass(), "first", term4216080);
        setField(term4216079, term4216079.getClass(), "last", null);
        setField(term4216079, term4216079.getClass(), "propListHead", null);
        setIntField(term4216079, term4216079.getClass(), "sourcePosition", 0);
        setField(term4216079, term4216079.getClass(), "jsType", null);
        setField(term4216079, term4216079.getClass(), "parent", null);
        term4215820 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4215822 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4215824 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4215827 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4215829 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4215820, term4215820.getClass(), "str", null);
        setIntField(term4215820, term4215820.getClass(), "type", 37);
        setField(term4215820, term4215820.getClass(), "next", null);
        setField(term4215822, term4215822.getClass(), "str", null);
        setIntField(term4215822, term4215822.getClass(), "type", 35);
        setField(term4215824, term4215824.getClass(), "str", null);
        setIntField(term4215824, term4215824.getClass(), "type", 41);
        setField(term4215824, term4215824.getClass(), "next", null);
        setField(term4215824, term4215824.getClass(), "first", null);
        setField(term4215824, term4215824.getClass(), "last", null);
        setField(term4215824, term4215824.getClass(), "propListHead", null);
        setIntField(term4215824, term4215824.getClass(), "sourcePosition", 0);
        setField(term4215824, term4215824.getClass(), "jsType", null);
        setField(term4215824, term4215824.getClass(), "parent", null);
        setField(term4215822, term4215822.getClass(), "next", term4215824);
        setField(term4215827, term4215827.getClass(), "str", null);
        setIntField(term4215827, term4215827.getClass(), "type", 40);
        setField(term4215829, term4215829.getClass(), "str", "");
        setIntField(term4215829, term4215829.getClass(), "type", 40);
        setField(term4215829, term4215829.getClass(), "next", null);
        setField(term4215829, term4215829.getClass(), "first", null);
        setField(term4215829, term4215829.getClass(), "last", null);
        setField(term4215829, term4215829.getClass(), "propListHead", null);
        setIntField(term4215829, term4215829.getClass(), "sourcePosition", 0);
        setField(term4215829, term4215829.getClass(), "jsType", null);
        setField(term4215829, term4215829.getClass(), "parent", null);
        setField(term4215827, term4215827.getClass(), "next", term4215829);
        setField(term4215827, term4215827.getClass(), "first", null);
        setField(term4215827, term4215827.getClass(), "last", null);
        setField(term4215827, term4215827.getClass(), "propListHead", null);
        setIntField(term4215827, term4215827.getClass(), "sourcePosition", 0);
        setField(term4215827, term4215827.getClass(), "jsType", null);
        setField(term4215827, term4215827.getClass(), "parent", null);
        setField(term4215822, term4215822.getClass(), "first", term4215827);
        setField(term4215822, term4215822.getClass(), "last", null);
        setField(term4215822, term4215822.getClass(), "propListHead", null);
        setIntField(term4215822, term4215822.getClass(), "sourcePosition", 0);
        setField(term4215822, term4215822.getClass(), "jsType", null);
        setField(term4215822, term4215822.getClass(), "parent", null);
        setField(term4215820, term4215820.getClass(), "first", term4215822);
        setField(term4215820, term4215820.getClass(), "last", null);
        setField(term4215820, term4215820.getClass(), "propListHead", null);
        setIntField(term4215820, term4215820.getClass(), "sourcePosition", 0);
        setField(term4215820, term4215820.getClass(), "jsType", null);
        setField(term4215820, term4215820.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4214513;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term4214421, args);
        assertTrue(recursiveEquals(term4214421, term4216078));
        assertTrue(recursiveEquals(term4214513, term4216079));
        assertTrue(recursiveEquals(retValue, term4215820));
    }

};


