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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3722210;
     Object term3722302;
     Object term3723550;
     Object term3723551;
     Object term3723185;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3722210 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3722302 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3722394 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3722486 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3722578 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3722708 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3722800 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3722394, term3722394.getClass(), "type", 35);
        setIntField(term3722578, term3722578.getClass(), "type", 40);
        setField(term3722578, term3722578.getClass(), "str", "indexOf");
        setField(term3722486, term3722486.getClass(), "next", term3722578);
        setIntField(term3722486, term3722486.getClass(), "type", 40);
        setField(term3722486, term3722486.getClass(), "str", null);
        setField(term3722394, term3722394.getClass(), "first", term3722486);
        setIntField(term3722708, term3722708.getClass(), "type", 39);
        setField(term3722708, term3722708.getClass(), "next", term3722800);
        setDoubleField(term3722708, term3722708.getClass(), "number", 4.6116860184273879E18);
        setField(term3722394, term3722394.getClass(), "next", term3722708);
        setField(term3722302, term3722302.getClass(), "first", term3722394);
        setIntField(term3722302, term3722302.getClass(), "type", 37);
        term3723550 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3723550, term3723550.getClass(), "currentTraversal", null);
        term3723551 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3723552 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3723553 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3723554 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3723555 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3723556 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3723551, term3723551.getClass(), "str", null);
        setIntField(term3723551, term3723551.getClass(), "type", 37);
        setField(term3723551, term3723551.getClass(), "next", null);
        setField(term3723552, term3723552.getClass(), "str", null);
        setIntField(term3723552, term3723552.getClass(), "type", 35);
        setDoubleField(term3723553, term3723553.getClass(), "number", 4.6116860184273879E18);
        setIntField(term3723553, term3723553.getClass(), "type", 39);
        setField(term3723554, term3723554.getClass(), "str", null);
        setIntField(term3723554, term3723554.getClass(), "type", 0);
        setField(term3723554, term3723554.getClass(), "next", null);
        setField(term3723554, term3723554.getClass(), "first", null);
        setField(term3723554, term3723554.getClass(), "last", null);
        setField(term3723554, term3723554.getClass(), "propListHead", null);
        setIntField(term3723554, term3723554.getClass(), "sourcePosition", 0);
        setField(term3723554, term3723554.getClass(), "jsType", null);
        setField(term3723554, term3723554.getClass(), "parent", null);
        setField(term3723553, term3723553.getClass(), "next", term3723554);
        setField(term3723553, term3723553.getClass(), "first", null);
        setField(term3723553, term3723553.getClass(), "last", null);
        setField(term3723553, term3723553.getClass(), "propListHead", null);
        setIntField(term3723553, term3723553.getClass(), "sourcePosition", 0);
        setField(term3723553, term3723553.getClass(), "jsType", null);
        setField(term3723553, term3723553.getClass(), "parent", null);
        setField(term3723552, term3723552.getClass(), "next", term3723553);
        setField(term3723555, term3723555.getClass(), "str", null);
        setIntField(term3723555, term3723555.getClass(), "type", 40);
        setField(term3723556, term3723556.getClass(), "str", "");
        setIntField(term3723556, term3723556.getClass(), "type", 40);
        setField(term3723556, term3723556.getClass(), "next", null);
        setField(term3723556, term3723556.getClass(), "first", null);
        setField(term3723556, term3723556.getClass(), "last", null);
        setField(term3723556, term3723556.getClass(), "propListHead", null);
        setIntField(term3723556, term3723556.getClass(), "sourcePosition", 0);
        setField(term3723556, term3723556.getClass(), "jsType", null);
        setField(term3723556, term3723556.getClass(), "parent", null);
        setField(term3723555, term3723555.getClass(), "next", term3723556);
        setField(term3723555, term3723555.getClass(), "first", null);
        setField(term3723555, term3723555.getClass(), "last", null);
        setField(term3723555, term3723555.getClass(), "propListHead", null);
        setIntField(term3723555, term3723555.getClass(), "sourcePosition", 0);
        setField(term3723555, term3723555.getClass(), "jsType", null);
        setField(term3723555, term3723555.getClass(), "parent", null);
        setField(term3723552, term3723552.getClass(), "first", term3723555);
        setField(term3723552, term3723552.getClass(), "last", null);
        setField(term3723552, term3723552.getClass(), "propListHead", null);
        setIntField(term3723552, term3723552.getClass(), "sourcePosition", 0);
        setField(term3723552, term3723552.getClass(), "jsType", null);
        setField(term3723552, term3723552.getClass(), "parent", null);
        setField(term3723551, term3723551.getClass(), "first", term3723552);
        setField(term3723551, term3723551.getClass(), "last", null);
        setField(term3723551, term3723551.getClass(), "propListHead", null);
        setIntField(term3723551, term3723551.getClass(), "sourcePosition", 0);
        setField(term3723551, term3723551.getClass(), "jsType", null);
        setField(term3723551, term3723551.getClass(), "parent", null);
        term3723185 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3723187 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3723189 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3723192 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3723196 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3723198 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3723185, term3723185.getClass(), "str", null);
        setIntField(term3723185, term3723185.getClass(), "type", 37);
        setField(term3723185, term3723185.getClass(), "next", null);
        setField(term3723187, term3723187.getClass(), "str", null);
        setIntField(term3723187, term3723187.getClass(), "type", 35);
        setDoubleField(term3723189, term3723189.getClass(), "number", 4.6116860184273879E18);
        setIntField(term3723189, term3723189.getClass(), "type", 39);
        setField(term3723192, term3723192.getClass(), "str", null);
        setIntField(term3723192, term3723192.getClass(), "type", 0);
        setField(term3723192, term3723192.getClass(), "next", null);
        setField(term3723192, term3723192.getClass(), "first", null);
        setField(term3723192, term3723192.getClass(), "last", null);
        setField(term3723192, term3723192.getClass(), "propListHead", null);
        setIntField(term3723192, term3723192.getClass(), "sourcePosition", 0);
        setField(term3723192, term3723192.getClass(), "jsType", null);
        setField(term3723192, term3723192.getClass(), "parent", null);
        setField(term3723189, term3723189.getClass(), "next", term3723192);
        setField(term3723189, term3723189.getClass(), "first", null);
        setField(term3723189, term3723189.getClass(), "last", null);
        setField(term3723189, term3723189.getClass(), "propListHead", null);
        setIntField(term3723189, term3723189.getClass(), "sourcePosition", 0);
        setField(term3723189, term3723189.getClass(), "jsType", null);
        setField(term3723189, term3723189.getClass(), "parent", null);
        setField(term3723187, term3723187.getClass(), "next", term3723189);
        setField(term3723196, term3723196.getClass(), "str", null);
        setIntField(term3723196, term3723196.getClass(), "type", 40);
        setField(term3723198, term3723198.getClass(), "str", "");
        setIntField(term3723198, term3723198.getClass(), "type", 40);
        setField(term3723198, term3723198.getClass(), "next", null);
        setField(term3723198, term3723198.getClass(), "first", null);
        setField(term3723198, term3723198.getClass(), "last", null);
        setField(term3723198, term3723198.getClass(), "propListHead", null);
        setIntField(term3723198, term3723198.getClass(), "sourcePosition", 0);
        setField(term3723198, term3723198.getClass(), "jsType", null);
        setField(term3723198, term3723198.getClass(), "parent", null);
        setField(term3723196, term3723196.getClass(), "next", term3723198);
        setField(term3723196, term3723196.getClass(), "first", null);
        setField(term3723196, term3723196.getClass(), "last", null);
        setField(term3723196, term3723196.getClass(), "propListHead", null);
        setIntField(term3723196, term3723196.getClass(), "sourcePosition", 0);
        setField(term3723196, term3723196.getClass(), "jsType", null);
        setField(term3723196, term3723196.getClass(), "parent", null);
        setField(term3723187, term3723187.getClass(), "first", term3723196);
        setField(term3723187, term3723187.getClass(), "last", null);
        setField(term3723187, term3723187.getClass(), "propListHead", null);
        setIntField(term3723187, term3723187.getClass(), "sourcePosition", 0);
        setField(term3723187, term3723187.getClass(), "jsType", null);
        setField(term3723187, term3723187.getClass(), "parent", null);
        setField(term3723185, term3723185.getClass(), "first", term3723187);
        setField(term3723185, term3723185.getClass(), "last", null);
        setField(term3723185, term3723185.getClass(), "propListHead", null);
        setIntField(term3723185, term3723185.getClass(), "sourcePosition", 0);
        setField(term3723185, term3723185.getClass(), "jsType", null);
        setField(term3723185, term3723185.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3722302;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3722210, args);
        assertTrue(recursiveEquals(term3722210, term3723550));
        assertTrue(recursiveEquals(term3722302, term3723551));
        assertTrue(recursiveEquals(retValue, term3723185));
    }

};


