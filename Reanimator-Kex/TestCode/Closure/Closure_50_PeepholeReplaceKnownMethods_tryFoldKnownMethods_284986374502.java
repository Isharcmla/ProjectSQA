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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3483536;
     Object term3483628;
     Object term3484508;
     Object term3484509;
     Object term3484241;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3483536 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3483628 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3483720 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3483812 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3483904 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3484034 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3483720, term3483720.getClass(), "type", 35);
        setIntField(term3483904, term3483904.getClass(), "type", 40);
        setField(term3483904, term3483904.getClass(), "str", "charAt");
        setField(term3483812, term3483812.getClass(), "next", term3483904);
        setIntField(term3483812, term3483812.getClass(), "type", 40);
        setField(term3483720, term3483720.getClass(), "first", term3483812);
        setIntField(term3484034, term3484034.getClass(), "type", 41);
        setField(term3483720, term3483720.getClass(), "next", term3484034);
        setField(term3483628, term3483628.getClass(), "first", term3483720);
        setIntField(term3483628, term3483628.getClass(), "type", 37);
        term3484508 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3484508, term3484508.getClass(), "currentTraversal", null);
        term3484509 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3484510 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3484511 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3484512 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3484513 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3484509, term3484509.getClass(), "str", null);
        setIntField(term3484509, term3484509.getClass(), "type", 37);
        setField(term3484509, term3484509.getClass(), "next", null);
        setField(term3484510, term3484510.getClass(), "str", null);
        setIntField(term3484510, term3484510.getClass(), "type", 35);
        setDoubleField(term3484511, term3484511.getClass(), "number", 0.0);
        setIntField(term3484511, term3484511.getClass(), "type", 41);
        setField(term3484511, term3484511.getClass(), "next", null);
        setField(term3484511, term3484511.getClass(), "first", null);
        setField(term3484511, term3484511.getClass(), "last", null);
        setField(term3484511, term3484511.getClass(), "propListHead", null);
        setIntField(term3484511, term3484511.getClass(), "sourcePosition", 0);
        setField(term3484511, term3484511.getClass(), "jsType", null);
        setField(term3484511, term3484511.getClass(), "parent", null);
        setField(term3484510, term3484510.getClass(), "next", term3484511);
        setField(term3484512, term3484512.getClass(), "str", null);
        setIntField(term3484512, term3484512.getClass(), "type", 40);
        setField(term3484513, term3484513.getClass(), "str", "");
        setIntField(term3484513, term3484513.getClass(), "type", 40);
        setField(term3484513, term3484513.getClass(), "next", null);
        setField(term3484513, term3484513.getClass(), "first", null);
        setField(term3484513, term3484513.getClass(), "last", null);
        setField(term3484513, term3484513.getClass(), "propListHead", null);
        setIntField(term3484513, term3484513.getClass(), "sourcePosition", 0);
        setField(term3484513, term3484513.getClass(), "jsType", null);
        setField(term3484513, term3484513.getClass(), "parent", null);
        setField(term3484512, term3484512.getClass(), "next", term3484513);
        setField(term3484512, term3484512.getClass(), "first", null);
        setField(term3484512, term3484512.getClass(), "last", null);
        setField(term3484512, term3484512.getClass(), "propListHead", null);
        setIntField(term3484512, term3484512.getClass(), "sourcePosition", 0);
        setField(term3484512, term3484512.getClass(), "jsType", null);
        setField(term3484512, term3484512.getClass(), "parent", null);
        setField(term3484510, term3484510.getClass(), "first", term3484512);
        setField(term3484510, term3484510.getClass(), "last", null);
        setField(term3484510, term3484510.getClass(), "propListHead", null);
        setIntField(term3484510, term3484510.getClass(), "sourcePosition", 0);
        setField(term3484510, term3484510.getClass(), "jsType", null);
        setField(term3484510, term3484510.getClass(), "parent", null);
        setField(term3484509, term3484509.getClass(), "first", term3484510);
        setField(term3484509, term3484509.getClass(), "last", null);
        setField(term3484509, term3484509.getClass(), "propListHead", null);
        setIntField(term3484509, term3484509.getClass(), "sourcePosition", 0);
        setField(term3484509, term3484509.getClass(), "jsType", null);
        setField(term3484509, term3484509.getClass(), "parent", null);
        term3484241 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3484243 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3484245 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3484249 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3484251 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3484241, term3484241.getClass(), "str", null);
        setIntField(term3484241, term3484241.getClass(), "type", 37);
        setField(term3484241, term3484241.getClass(), "next", null);
        setField(term3484243, term3484243.getClass(), "str", null);
        setIntField(term3484243, term3484243.getClass(), "type", 35);
        setDoubleField(term3484245, term3484245.getClass(), "number", 0.0);
        setIntField(term3484245, term3484245.getClass(), "type", 41);
        setField(term3484245, term3484245.getClass(), "next", null);
        setField(term3484245, term3484245.getClass(), "first", null);
        setField(term3484245, term3484245.getClass(), "last", null);
        setField(term3484245, term3484245.getClass(), "propListHead", null);
        setIntField(term3484245, term3484245.getClass(), "sourcePosition", 0);
        setField(term3484245, term3484245.getClass(), "jsType", null);
        setField(term3484245, term3484245.getClass(), "parent", null);
        setField(term3484243, term3484243.getClass(), "next", term3484245);
        setField(term3484249, term3484249.getClass(), "str", null);
        setIntField(term3484249, term3484249.getClass(), "type", 40);
        setField(term3484251, term3484251.getClass(), "str", "");
        setIntField(term3484251, term3484251.getClass(), "type", 40);
        setField(term3484251, term3484251.getClass(), "next", null);
        setField(term3484251, term3484251.getClass(), "first", null);
        setField(term3484251, term3484251.getClass(), "last", null);
        setField(term3484251, term3484251.getClass(), "propListHead", null);
        setIntField(term3484251, term3484251.getClass(), "sourcePosition", 0);
        setField(term3484251, term3484251.getClass(), "jsType", null);
        setField(term3484251, term3484251.getClass(), "parent", null);
        setField(term3484249, term3484249.getClass(), "next", term3484251);
        setField(term3484249, term3484249.getClass(), "first", null);
        setField(term3484249, term3484249.getClass(), "last", null);
        setField(term3484249, term3484249.getClass(), "propListHead", null);
        setIntField(term3484249, term3484249.getClass(), "sourcePosition", 0);
        setField(term3484249, term3484249.getClass(), "jsType", null);
        setField(term3484249, term3484249.getClass(), "parent", null);
        setField(term3484243, term3484243.getClass(), "first", term3484249);
        setField(term3484243, term3484243.getClass(), "last", null);
        setField(term3484243, term3484243.getClass(), "propListHead", null);
        setIntField(term3484243, term3484243.getClass(), "sourcePosition", 0);
        setField(term3484243, term3484243.getClass(), "jsType", null);
        setField(term3484243, term3484243.getClass(), "parent", null);
        setField(term3484241, term3484241.getClass(), "first", term3484243);
        setField(term3484241, term3484241.getClass(), "last", null);
        setField(term3484241, term3484241.getClass(), "propListHead", null);
        setIntField(term3484241, term3484241.getClass(), "sourcePosition", 0);
        setField(term3484241, term3484241.getClass(), "jsType", null);
        setField(term3484241, term3484241.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3483628;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3483536, args);
        assertTrue(recursiveEquals(term3483536, term3484508));
        assertTrue(recursiveEquals(term3483628, term3484509));
        assertTrue(recursiveEquals(retValue, term3484241));
    }

};


