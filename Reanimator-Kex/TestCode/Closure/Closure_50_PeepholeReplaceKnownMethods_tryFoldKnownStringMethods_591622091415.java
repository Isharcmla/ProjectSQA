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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2664661;
     Object term2664753;
     Object term2666034;
     Object term2666035;
     Object term2665969;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2664661 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2664753 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2664845 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2664937 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2665007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2664753, term2664753.getClass(), "type", 37);
        setIntField(term2664845, term2664845.getClass(), "type", 35);
        setField(term2664937, term2664937.getClass(), "next", term2664937);
        setIntField(term2664937, term2664937.getClass(), "type", 40);
        setField(term2664937, term2664937.getClass(), "str", null);
        setField(term2664845, term2664845.getClass(), "first", term2664937);
        setField(term2664845, term2664845.getClass(), "next", term2665007);
        setField(term2664753, term2664753.getClass(), "first", term2664845);
        term2666034 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2666034, term2666034.getClass(), "currentTraversal", null);
        term2666035 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2666036 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2666037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2666038 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term2666035, term2666035.getClass(), "number", 0.0);
        setIntField(term2666035, term2666035.getClass(), "type", 37);
        setField(term2666035, term2666035.getClass(), "next", null);
        setField(term2666036, term2666036.getClass(), "str", null);
        setIntField(term2666036, term2666036.getClass(), "type", 35);
        setIntField(term2666037, term2666037.getClass(), "type", 0);
        setField(term2666037, term2666037.getClass(), "next", null);
        setField(term2666037, term2666037.getClass(), "first", null);
        setField(term2666037, term2666037.getClass(), "last", null);
        setField(term2666037, term2666037.getClass(), "propListHead", null);
        setIntField(term2666037, term2666037.getClass(), "sourcePosition", 0);
        setField(term2666037, term2666037.getClass(), "jsType", null);
        setField(term2666037, term2666037.getClass(), "parent", null);
        setField(term2666036, term2666036.getClass(), "next", term2666037);
        setField(term2666038, term2666038.getClass(), "str", null);
        setIntField(term2666038, term2666038.getClass(), "type", 40);
        setField(term2666038, term2666038.getClass(), "next", term2666038);
        setField(term2666038, term2666038.getClass(), "first", null);
        setField(term2666038, term2666038.getClass(), "last", null);
        setField(term2666038, term2666038.getClass(), "propListHead", null);
        setIntField(term2666038, term2666038.getClass(), "sourcePosition", 0);
        setField(term2666038, term2666038.getClass(), "jsType", null);
        setField(term2666038, term2666038.getClass(), "parent", null);
        setField(term2666036, term2666036.getClass(), "first", term2666038);
        setField(term2666036, term2666036.getClass(), "last", null);
        setField(term2666036, term2666036.getClass(), "propListHead", null);
        setIntField(term2666036, term2666036.getClass(), "sourcePosition", 0);
        setField(term2666036, term2666036.getClass(), "jsType", null);
        setField(term2666036, term2666036.getClass(), "parent", null);
        setField(term2666035, term2666035.getClass(), "first", term2666036);
        setField(term2666035, term2666035.getClass(), "last", null);
        setField(term2666035, term2666035.getClass(), "propListHead", null);
        setIntField(term2666035, term2666035.getClass(), "sourcePosition", 0);
        setField(term2666035, term2666035.getClass(), "jsType", null);
        setField(term2666035, term2666035.getClass(), "parent", null);
        term2665969 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2665972 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2665974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2665977 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term2665969, term2665969.getClass(), "number", 0.0);
        setIntField(term2665969, term2665969.getClass(), "type", 37);
        setField(term2665969, term2665969.getClass(), "next", null);
        setField(term2665972, term2665972.getClass(), "str", null);
        setIntField(term2665972, term2665972.getClass(), "type", 35);
        setIntField(term2665974, term2665974.getClass(), "type", 0);
        setField(term2665974, term2665974.getClass(), "next", null);
        setField(term2665974, term2665974.getClass(), "first", null);
        setField(term2665974, term2665974.getClass(), "last", null);
        setField(term2665974, term2665974.getClass(), "propListHead", null);
        setIntField(term2665974, term2665974.getClass(), "sourcePosition", 0);
        setField(term2665974, term2665974.getClass(), "jsType", null);
        setField(term2665974, term2665974.getClass(), "parent", null);
        setField(term2665972, term2665972.getClass(), "next", term2665974);
        setField(term2665977, term2665977.getClass(), "str", null);
        setIntField(term2665977, term2665977.getClass(), "type", 40);
        setField(term2665977, term2665977.getClass(), "next", term2665977);
        setField(term2665977, term2665977.getClass(), "first", null);
        setField(term2665977, term2665977.getClass(), "last", null);
        setField(term2665977, term2665977.getClass(), "propListHead", null);
        setIntField(term2665977, term2665977.getClass(), "sourcePosition", 0);
        setField(term2665977, term2665977.getClass(), "jsType", null);
        setField(term2665977, term2665977.getClass(), "parent", null);
        setField(term2665972, term2665972.getClass(), "first", term2665977);
        setField(term2665972, term2665972.getClass(), "last", null);
        setField(term2665972, term2665972.getClass(), "propListHead", null);
        setIntField(term2665972, term2665972.getClass(), "sourcePosition", 0);
        setField(term2665972, term2665972.getClass(), "jsType", null);
        setField(term2665972, term2665972.getClass(), "parent", null);
        setField(term2665969, term2665969.getClass(), "first", term2665972);
        setField(term2665969, term2665969.getClass(), "last", null);
        setField(term2665969, term2665969.getClass(), "propListHead", null);
        setIntField(term2665969, term2665969.getClass(), "sourcePosition", 0);
        setField(term2665969, term2665969.getClass(), "jsType", null);
        setField(term2665969, term2665969.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2664753;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2664661, args);
        assertTrue(recursiveEquals(term2664661, term2666034));
        assertTrue(recursiveEquals(term2664753, term2666035));
        assertTrue(recursiveEquals(retValue, term2665969));
    }

};


