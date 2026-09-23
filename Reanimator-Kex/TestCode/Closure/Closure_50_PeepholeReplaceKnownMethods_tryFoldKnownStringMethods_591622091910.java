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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3757482;
     Object term3757574;
     Object term3762087;
     Object term3762088;
     Object term3758503;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3757482 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3757574 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3757666 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3757758 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3757850 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3757980 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3757574, term3757574.getClass(), "type", 37);
        setIntField(term3757666, term3757666.getClass(), "type", 35);
        setIntField(term3757850, term3757850.getClass(), "type", 40);
        setField(term3757850, term3757850.getClass(), "str", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        setField(term3757758, term3757758.getClass(), "next", term3757850);
        setIntField(term3757758, term3757758.getClass(), "type", 40);
        setField(term3757666, term3757666.getClass(), "first", term3757758);
        setIntField(term3757980, term3757980.getClass(), "type", 40);
        setField(term3757666, term3757666.getClass(), "next", term3757980);
        setField(term3757574, term3757574.getClass(), "first", term3757666);
        term3762087 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3762087, term3762087.getClass(), "currentTraversal", null);
        term3762088 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3762089 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3762090 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3762091 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3762092 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term3762088, term3762088.getClass(), "number", 0.0);
        setIntField(term3762088, term3762088.getClass(), "type", 37);
        setField(term3762088, term3762088.getClass(), "next", null);
        setField(term3762089, term3762089.getClass(), "str", null);
        setIntField(term3762089, term3762089.getClass(), "type", 35);
        setDoubleField(term3762090, term3762090.getClass(), "number", 0.0);
        setIntField(term3762090, term3762090.getClass(), "type", 40);
        setField(term3762090, term3762090.getClass(), "next", null);
        setField(term3762090, term3762090.getClass(), "first", null);
        setField(term3762090, term3762090.getClass(), "last", null);
        setField(term3762090, term3762090.getClass(), "propListHead", null);
        setIntField(term3762090, term3762090.getClass(), "sourcePosition", 0);
        setField(term3762090, term3762090.getClass(), "jsType", null);
        setField(term3762090, term3762090.getClass(), "parent", null);
        setField(term3762089, term3762089.getClass(), "next", term3762090);
        setField(term3762091, term3762091.getClass(), "str", null);
        setIntField(term3762091, term3762091.getClass(), "type", 40);
        setField(term3762092, term3762092.getClass(), "str", "");
        setIntField(term3762092, term3762092.getClass(), "type", 40);
        setField(term3762092, term3762092.getClass(), "next", null);
        setField(term3762092, term3762092.getClass(), "first", null);
        setField(term3762092, term3762092.getClass(), "last", null);
        setField(term3762092, term3762092.getClass(), "propListHead", null);
        setIntField(term3762092, term3762092.getClass(), "sourcePosition", 0);
        setField(term3762092, term3762092.getClass(), "jsType", null);
        setField(term3762092, term3762092.getClass(), "parent", null);
        setField(term3762091, term3762091.getClass(), "next", term3762092);
        setField(term3762091, term3762091.getClass(), "first", null);
        setField(term3762091, term3762091.getClass(), "last", null);
        setField(term3762091, term3762091.getClass(), "propListHead", null);
        setIntField(term3762091, term3762091.getClass(), "sourcePosition", 0);
        setField(term3762091, term3762091.getClass(), "jsType", null);
        setField(term3762091, term3762091.getClass(), "parent", null);
        setField(term3762089, term3762089.getClass(), "first", term3762091);
        setField(term3762089, term3762089.getClass(), "last", null);
        setField(term3762089, term3762089.getClass(), "propListHead", null);
        setIntField(term3762089, term3762089.getClass(), "sourcePosition", 0);
        setField(term3762089, term3762089.getClass(), "jsType", null);
        setField(term3762089, term3762089.getClass(), "parent", null);
        setField(term3762088, term3762088.getClass(), "first", term3762089);
        setField(term3762088, term3762088.getClass(), "last", null);
        setField(term3762088, term3762088.getClass(), "propListHead", null);
        setIntField(term3762088, term3762088.getClass(), "sourcePosition", 0);
        setField(term3762088, term3762088.getClass(), "jsType", null);
        setField(term3762088, term3762088.getClass(), "parent", null);
        term3758503 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3758506 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3758508 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3758512 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3758514 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term3758503, term3758503.getClass(), "number", 0.0);
        setIntField(term3758503, term3758503.getClass(), "type", 37);
        setField(term3758503, term3758503.getClass(), "next", null);
        setField(term3758506, term3758506.getClass(), "str", null);
        setIntField(term3758506, term3758506.getClass(), "type", 35);
        setDoubleField(term3758508, term3758508.getClass(), "number", 0.0);
        setIntField(term3758508, term3758508.getClass(), "type", 40);
        setField(term3758508, term3758508.getClass(), "next", null);
        setField(term3758508, term3758508.getClass(), "first", null);
        setField(term3758508, term3758508.getClass(), "last", null);
        setField(term3758508, term3758508.getClass(), "propListHead", null);
        setIntField(term3758508, term3758508.getClass(), "sourcePosition", 0);
        setField(term3758508, term3758508.getClass(), "jsType", null);
        setField(term3758508, term3758508.getClass(), "parent", null);
        setField(term3758506, term3758506.getClass(), "next", term3758508);
        setField(term3758512, term3758512.getClass(), "str", null);
        setIntField(term3758512, term3758512.getClass(), "type", 40);
        setField(term3758514, term3758514.getClass(), "str", "");
        setIntField(term3758514, term3758514.getClass(), "type", 40);
        setField(term3758514, term3758514.getClass(), "next", null);
        setField(term3758514, term3758514.getClass(), "first", null);
        setField(term3758514, term3758514.getClass(), "last", null);
        setField(term3758514, term3758514.getClass(), "propListHead", null);
        setIntField(term3758514, term3758514.getClass(), "sourcePosition", 0);
        setField(term3758514, term3758514.getClass(), "jsType", null);
        setField(term3758514, term3758514.getClass(), "parent", null);
        setField(term3758512, term3758512.getClass(), "next", term3758514);
        setField(term3758512, term3758512.getClass(), "first", null);
        setField(term3758512, term3758512.getClass(), "last", null);
        setField(term3758512, term3758512.getClass(), "propListHead", null);
        setIntField(term3758512, term3758512.getClass(), "sourcePosition", 0);
        setField(term3758512, term3758512.getClass(), "jsType", null);
        setField(term3758512, term3758512.getClass(), "parent", null);
        setField(term3758506, term3758506.getClass(), "first", term3758512);
        setField(term3758506, term3758506.getClass(), "last", null);
        setField(term3758506, term3758506.getClass(), "propListHead", null);
        setIntField(term3758506, term3758506.getClass(), "sourcePosition", 0);
        setField(term3758506, term3758506.getClass(), "jsType", null);
        setField(term3758506, term3758506.getClass(), "parent", null);
        setField(term3758503, term3758503.getClass(), "first", term3758506);
        setField(term3758503, term3758503.getClass(), "last", null);
        setField(term3758503, term3758503.getClass(), "propListHead", null);
        setIntField(term3758503, term3758503.getClass(), "sourcePosition", 0);
        setField(term3758503, term3758503.getClass(), "jsType", null);
        setField(term3758503, term3758503.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3757574;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3757482, args);
        assertTrue(recursiveEquals(term3757482, term3762087));
        assertTrue(recursiveEquals(term3757574, term3762088));
        assertTrue(recursiveEquals(retValue, term3758503));
    }

};


