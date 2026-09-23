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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3556715;
     Object term3556807;
     Object term3558010;
     Object term3558011;
     Object term3557719;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3556715 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3556807 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3556899 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3556991 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3557083 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3557251 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3556899, term3556899.getClass(), "type", 35);
        setIntField(term3557083, term3557083.getClass(), "type", 40);
        setField(term3557083, term3557083.getClass(), "str", "substr");
        setField(term3556991, term3556991.getClass(), "next", term3557083);
        setIntField(term3556991, term3556991.getClass(), "type", 40);
        setField(term3556991, term3556991.getClass(), "str", "");
        setField(term3556899, term3556899.getClass(), "first", term3556991);
        setIntField(term3557251, term3557251.getClass(), "type", 39);
        setDoubleField(term3557251, term3557251.getClass(), "number", -3.497785723977585E15);
        setField(term3557251, term3557251.getClass(), "next", null);
        setField(term3556899, term3556899.getClass(), "next", term3557251);
        setField(term3556807, term3556807.getClass(), "first", term3556899);
        setIntField(term3556807, term3556807.getClass(), "type", 37);
        term3558010 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3558010, term3558010.getClass(), "currentTraversal", null);
        term3558011 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3558012 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3558013 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3558014 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3558017 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3558011, term3558011.getClass(), "str", null);
        setIntField(term3558011, term3558011.getClass(), "type", 37);
        setField(term3558011, term3558011.getClass(), "next", null);
        setField(term3558012, term3558012.getClass(), "str", null);
        setIntField(term3558012, term3558012.getClass(), "type", 35);
        setDoubleField(term3558013, term3558013.getClass(), "number", -3.497785723977585E15);
        setIntField(term3558013, term3558013.getClass(), "type", 39);
        setField(term3558013, term3558013.getClass(), "next", null);
        setField(term3558013, term3558013.getClass(), "first", null);
        setField(term3558013, term3558013.getClass(), "last", null);
        setField(term3558013, term3558013.getClass(), "propListHead", null);
        setIntField(term3558013, term3558013.getClass(), "sourcePosition", 0);
        setField(term3558013, term3558013.getClass(), "jsType", null);
        setField(term3558013, term3558013.getClass(), "parent", null);
        setField(term3558012, term3558012.getClass(), "next", term3558013);
        setField(term3558014, term3558014.getClass(), "str", "");
        setIntField(term3558014, term3558014.getClass(), "type", 40);
        setField(term3558017, term3558017.getClass(), "str", "");
        setIntField(term3558017, term3558017.getClass(), "type", 40);
        setField(term3558017, term3558017.getClass(), "next", null);
        setField(term3558017, term3558017.getClass(), "first", null);
        setField(term3558017, term3558017.getClass(), "last", null);
        setField(term3558017, term3558017.getClass(), "propListHead", null);
        setIntField(term3558017, term3558017.getClass(), "sourcePosition", 0);
        setField(term3558017, term3558017.getClass(), "jsType", null);
        setField(term3558017, term3558017.getClass(), "parent", null);
        setField(term3558014, term3558014.getClass(), "next", term3558017);
        setField(term3558014, term3558014.getClass(), "first", null);
        setField(term3558014, term3558014.getClass(), "last", null);
        setField(term3558014, term3558014.getClass(), "propListHead", null);
        setIntField(term3558014, term3558014.getClass(), "sourcePosition", 0);
        setField(term3558014, term3558014.getClass(), "jsType", null);
        setField(term3558014, term3558014.getClass(), "parent", null);
        setField(term3558012, term3558012.getClass(), "first", term3558014);
        setField(term3558012, term3558012.getClass(), "last", null);
        setField(term3558012, term3558012.getClass(), "propListHead", null);
        setIntField(term3558012, term3558012.getClass(), "sourcePosition", 0);
        setField(term3558012, term3558012.getClass(), "jsType", null);
        setField(term3558012, term3558012.getClass(), "parent", null);
        setField(term3558011, term3558011.getClass(), "first", term3558012);
        setField(term3558011, term3558011.getClass(), "last", null);
        setField(term3558011, term3558011.getClass(), "propListHead", null);
        setIntField(term3558011, term3558011.getClass(), "sourcePosition", 0);
        setField(term3558011, term3558011.getClass(), "jsType", null);
        setField(term3558011, term3558011.getClass(), "parent", null);
        term3557719 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3557721 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3557723 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3557727 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3557731 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3557719, term3557719.getClass(), "str", null);
        setIntField(term3557719, term3557719.getClass(), "type", 37);
        setField(term3557719, term3557719.getClass(), "next", null);
        setField(term3557721, term3557721.getClass(), "str", null);
        setIntField(term3557721, term3557721.getClass(), "type", 35);
        setDoubleField(term3557723, term3557723.getClass(), "number", -3.497785723977585E15);
        setIntField(term3557723, term3557723.getClass(), "type", 39);
        setField(term3557723, term3557723.getClass(), "next", null);
        setField(term3557723, term3557723.getClass(), "first", null);
        setField(term3557723, term3557723.getClass(), "last", null);
        setField(term3557723, term3557723.getClass(), "propListHead", null);
        setIntField(term3557723, term3557723.getClass(), "sourcePosition", 0);
        setField(term3557723, term3557723.getClass(), "jsType", null);
        setField(term3557723, term3557723.getClass(), "parent", null);
        setField(term3557721, term3557721.getClass(), "next", term3557723);
        setField(term3557727, term3557727.getClass(), "str", "");
        setIntField(term3557727, term3557727.getClass(), "type", 40);
        setField(term3557731, term3557731.getClass(), "str", "");
        setIntField(term3557731, term3557731.getClass(), "type", 40);
        setField(term3557731, term3557731.getClass(), "next", null);
        setField(term3557731, term3557731.getClass(), "first", null);
        setField(term3557731, term3557731.getClass(), "last", null);
        setField(term3557731, term3557731.getClass(), "propListHead", null);
        setIntField(term3557731, term3557731.getClass(), "sourcePosition", 0);
        setField(term3557731, term3557731.getClass(), "jsType", null);
        setField(term3557731, term3557731.getClass(), "parent", null);
        setField(term3557727, term3557727.getClass(), "next", term3557731);
        setField(term3557727, term3557727.getClass(), "first", null);
        setField(term3557727, term3557727.getClass(), "last", null);
        setField(term3557727, term3557727.getClass(), "propListHead", null);
        setIntField(term3557727, term3557727.getClass(), "sourcePosition", 0);
        setField(term3557727, term3557727.getClass(), "jsType", null);
        setField(term3557727, term3557727.getClass(), "parent", null);
        setField(term3557721, term3557721.getClass(), "first", term3557727);
        setField(term3557721, term3557721.getClass(), "last", null);
        setField(term3557721, term3557721.getClass(), "propListHead", null);
        setIntField(term3557721, term3557721.getClass(), "sourcePosition", 0);
        setField(term3557721, term3557721.getClass(), "jsType", null);
        setField(term3557721, term3557721.getClass(), "parent", null);
        setField(term3557719, term3557719.getClass(), "first", term3557721);
        setField(term3557719, term3557719.getClass(), "last", null);
        setField(term3557719, term3557719.getClass(), "propListHead", null);
        setIntField(term3557719, term3557719.getClass(), "sourcePosition", 0);
        setField(term3557719, term3557719.getClass(), "jsType", null);
        setField(term3557719, term3557719.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3556807;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3556715, args);
        assertTrue(recursiveEquals(term3556715, term3558010));
        assertTrue(recursiveEquals(term3556807, term3558011));
        assertTrue(recursiveEquals(retValue, term3557719));
    }

};


