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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3718817;
     Object term3718909;
     Object term3720220;
     Object term3720221;
     Object term3719964;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3718817 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3718909 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3719001 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3719093 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3719185 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3719315 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3719001, term3719001.getClass(), "type", 35);
        setIntField(term3719185, term3719185.getClass(), "type", 40);
        setField(term3719185, term3719185.getClass(), "str", "substr");
        setField(term3719093, term3719093.getClass(), "next", term3719185);
        setIntField(term3719093, term3719093.getClass(), "type", 40);
        setField(term3719001, term3719001.getClass(), "first", term3719093);
        setIntField(term3719315, term3719315.getClass(), "type", 41);
        setField(term3719001, term3719001.getClass(), "next", term3719315);
        setField(term3718909, term3718909.getClass(), "first", term3719001);
        setIntField(term3718909, term3718909.getClass(), "type", 37);
        term3720220 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3720220, term3720220.getClass(), "currentTraversal", null);
        term3720221 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3720222 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3720223 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3720224 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3720225 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3720221, term3720221.getClass(), "str", null);
        setIntField(term3720221, term3720221.getClass(), "type", 37);
        setField(term3720221, term3720221.getClass(), "next", null);
        setField(term3720222, term3720222.getClass(), "str", null);
        setIntField(term3720222, term3720222.getClass(), "type", 35);
        setField(term3720223, term3720223.getClass(), "str", null);
        setIntField(term3720223, term3720223.getClass(), "type", 41);
        setField(term3720223, term3720223.getClass(), "next", null);
        setField(term3720223, term3720223.getClass(), "first", null);
        setField(term3720223, term3720223.getClass(), "last", null);
        setField(term3720223, term3720223.getClass(), "propListHead", null);
        setIntField(term3720223, term3720223.getClass(), "sourcePosition", 0);
        setField(term3720223, term3720223.getClass(), "jsType", null);
        setField(term3720223, term3720223.getClass(), "parent", null);
        setField(term3720222, term3720222.getClass(), "next", term3720223);
        setField(term3720224, term3720224.getClass(), "str", null);
        setIntField(term3720224, term3720224.getClass(), "type", 40);
        setField(term3720225, term3720225.getClass(), "str", "");
        setIntField(term3720225, term3720225.getClass(), "type", 40);
        setField(term3720225, term3720225.getClass(), "next", null);
        setField(term3720225, term3720225.getClass(), "first", null);
        setField(term3720225, term3720225.getClass(), "last", null);
        setField(term3720225, term3720225.getClass(), "propListHead", null);
        setIntField(term3720225, term3720225.getClass(), "sourcePosition", 0);
        setField(term3720225, term3720225.getClass(), "jsType", null);
        setField(term3720225, term3720225.getClass(), "parent", null);
        setField(term3720224, term3720224.getClass(), "next", term3720225);
        setField(term3720224, term3720224.getClass(), "first", null);
        setField(term3720224, term3720224.getClass(), "last", null);
        setField(term3720224, term3720224.getClass(), "propListHead", null);
        setIntField(term3720224, term3720224.getClass(), "sourcePosition", 0);
        setField(term3720224, term3720224.getClass(), "jsType", null);
        setField(term3720224, term3720224.getClass(), "parent", null);
        setField(term3720222, term3720222.getClass(), "first", term3720224);
        setField(term3720222, term3720222.getClass(), "last", null);
        setField(term3720222, term3720222.getClass(), "propListHead", null);
        setIntField(term3720222, term3720222.getClass(), "sourcePosition", 0);
        setField(term3720222, term3720222.getClass(), "jsType", null);
        setField(term3720222, term3720222.getClass(), "parent", null);
        setField(term3720221, term3720221.getClass(), "first", term3720222);
        setField(term3720221, term3720221.getClass(), "last", null);
        setField(term3720221, term3720221.getClass(), "propListHead", null);
        setIntField(term3720221, term3720221.getClass(), "sourcePosition", 0);
        setField(term3720221, term3720221.getClass(), "jsType", null);
        setField(term3720221, term3720221.getClass(), "parent", null);
        term3719964 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3719966 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3719968 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3719971 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3719973 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3719964, term3719964.getClass(), "str", null);
        setIntField(term3719964, term3719964.getClass(), "type", 37);
        setField(term3719964, term3719964.getClass(), "next", null);
        setField(term3719966, term3719966.getClass(), "str", null);
        setIntField(term3719966, term3719966.getClass(), "type", 35);
        setField(term3719968, term3719968.getClass(), "str", null);
        setIntField(term3719968, term3719968.getClass(), "type", 41);
        setField(term3719968, term3719968.getClass(), "next", null);
        setField(term3719968, term3719968.getClass(), "first", null);
        setField(term3719968, term3719968.getClass(), "last", null);
        setField(term3719968, term3719968.getClass(), "propListHead", null);
        setIntField(term3719968, term3719968.getClass(), "sourcePosition", 0);
        setField(term3719968, term3719968.getClass(), "jsType", null);
        setField(term3719968, term3719968.getClass(), "parent", null);
        setField(term3719966, term3719966.getClass(), "next", term3719968);
        setField(term3719971, term3719971.getClass(), "str", null);
        setIntField(term3719971, term3719971.getClass(), "type", 40);
        setField(term3719973, term3719973.getClass(), "str", "");
        setIntField(term3719973, term3719973.getClass(), "type", 40);
        setField(term3719973, term3719973.getClass(), "next", null);
        setField(term3719973, term3719973.getClass(), "first", null);
        setField(term3719973, term3719973.getClass(), "last", null);
        setField(term3719973, term3719973.getClass(), "propListHead", null);
        setIntField(term3719973, term3719973.getClass(), "sourcePosition", 0);
        setField(term3719973, term3719973.getClass(), "jsType", null);
        setField(term3719973, term3719973.getClass(), "parent", null);
        setField(term3719971, term3719971.getClass(), "next", term3719973);
        setField(term3719971, term3719971.getClass(), "first", null);
        setField(term3719971, term3719971.getClass(), "last", null);
        setField(term3719971, term3719971.getClass(), "propListHead", null);
        setIntField(term3719971, term3719971.getClass(), "sourcePosition", 0);
        setField(term3719971, term3719971.getClass(), "jsType", null);
        setField(term3719971, term3719971.getClass(), "parent", null);
        setField(term3719966, term3719966.getClass(), "first", term3719971);
        setField(term3719966, term3719966.getClass(), "last", null);
        setField(term3719966, term3719966.getClass(), "propListHead", null);
        setIntField(term3719966, term3719966.getClass(), "sourcePosition", 0);
        setField(term3719966, term3719966.getClass(), "jsType", null);
        setField(term3719966, term3719966.getClass(), "parent", null);
        setField(term3719964, term3719964.getClass(), "first", term3719966);
        setField(term3719964, term3719964.getClass(), "last", null);
        setField(term3719964, term3719964.getClass(), "propListHead", null);
        setIntField(term3719964, term3719964.getClass(), "sourcePosition", 0);
        setField(term3719964, term3719964.getClass(), "jsType", null);
        setField(term3719964, term3719964.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3718909;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3718817, args);
        assertTrue(recursiveEquals(term3718817, term3720220));
        assertTrue(recursiveEquals(term3718909, term3720221));
        assertTrue(recursiveEquals(retValue, term3719964));
    }

};


