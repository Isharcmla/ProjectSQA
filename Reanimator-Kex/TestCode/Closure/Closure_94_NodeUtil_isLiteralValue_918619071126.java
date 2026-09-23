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
import java.lang.Boolean;

public class NodeUtil_isLiteralValue_918619071126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163;
     Object term190;
     Object term5174;

    public NodeUtil_isLiteralValue_918619071126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term176 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term186 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term163, term163.getClass(), "type", 1551099402);
        setIntField(term165, term165.getClass(), "type", -478195677);
        setIntField(term167, term167.getClass(), "type", 0);
        setField(term167, term167.getClass(), "next", null);
        setField(term167, term167.getClass(), "first", null);
        setField(term167, term167.getClass(), "last", null);
        setField(term167, term167.getClass(), "propListHead", null);
        setIntField(term167, term167.getClass(), "sourcePosition", 0);
        setField(term167, term167.getClass(), "jsType", null);
        setField(term167, term167.getClass(), "parent", null);
        setField(term165, term165.getClass(), "next", term167);
        setIntField(term170, term170.getClass(), "type", 0);
        setField(term170, term170.getClass(), "next", null);
        setField(term170, term170.getClass(), "first", null);
        setField(term170, term170.getClass(), "last", null);
        setField(term170, term170.getClass(), "propListHead", null);
        setIntField(term170, term170.getClass(), "sourcePosition", 0);
        setField(term170, term170.getClass(), "jsType", null);
        setField(term170, term170.getClass(), "parent", null);
        setField(term165, term165.getClass(), "first", term170);
        setIntField(term173, term173.getClass(), "type", 0);
        setField(term173, term173.getClass(), "next", null);
        setField(term173, term173.getClass(), "first", null);
        setField(term173, term173.getClass(), "last", null);
        setField(term173, term173.getClass(), "propListHead", null);
        setIntField(term173, term173.getClass(), "sourcePosition", 0);
        setField(term173, term173.getClass(), "jsType", null);
        setField(term173, term173.getClass(), "parent", null);
        setField(term165, term165.getClass(), "last", term173);
        setField(term176, term176.getClass(), "next", null);
        setIntField(term176, term176.getClass(), "type", 0);
        setIntField(term176, term176.getClass(), "intValue", 0);
        setField(term176, term176.getClass(), "objectValue", null);
        setField(term165, term165.getClass(), "propListHead", term176);
        setIntField(term165, term165.getClass(), "sourcePosition", -481533957);
        setField(term165, term165.getClass(), "jsType", null);
        setField(term165, term165.getClass(), "parent", null);
        setField(term163, term163.getClass(), "next", term165);
        setIntField(term180, term180.getClass(), "type", 0);
        setField(term180, term180.getClass(), "next", null);
        setField(term180, term180.getClass(), "first", null);
        setField(term180, term180.getClass(), "last", null);
        setField(term180, term180.getClass(), "propListHead", null);
        setIntField(term180, term180.getClass(), "sourcePosition", 0);
        setField(term180, term180.getClass(), "jsType", null);
        setField(term180, term180.getClass(), "parent", null);
        setField(term163, term163.getClass(), "first", term180);
        setIntField(term183, term183.getClass(), "type", 0);
        setField(term183, term183.getClass(), "next", null);
        setField(term183, term183.getClass(), "first", null);
        setField(term183, term183.getClass(), "last", null);
        setField(term183, term183.getClass(), "propListHead", null);
        setIntField(term183, term183.getClass(), "sourcePosition", 0);
        setField(term183, term183.getClass(), "jsType", null);
        setField(term183, term183.getClass(), "parent", null);
        setField(term163, term163.getClass(), "last", term183);
        setField(term186, term186.getClass(), "next", null);
        setIntField(term186, term186.getClass(), "type", 0);
        setIntField(term186, term186.getClass(), "intValue", 0);
        setField(term186, term186.getClass(), "objectValue", null);
        setField(term163, term163.getClass(), "propListHead", term186);
        setIntField(term163, term163.getClass(), "sourcePosition", 1240914516);
        setField(term163, term163.getClass(), "jsType", null);
        setField(term163, term163.getClass(), "parent", null);
        term190 = new Boolean(false);
        term5174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5179 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5182 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term5174, term5174.getClass(), "type", 1551099402);
        setIntField(term5175, term5175.getClass(), "type", -478195677);
        setIntField(term5176, term5176.getClass(), "type", 0);
        setField(term5176, term5176.getClass(), "next", null);
        setField(term5176, term5176.getClass(), "first", null);
        setField(term5176, term5176.getClass(), "last", null);
        setField(term5176, term5176.getClass(), "propListHead", null);
        setIntField(term5176, term5176.getClass(), "sourcePosition", 0);
        setField(term5176, term5176.getClass(), "jsType", null);
        setField(term5176, term5176.getClass(), "parent", null);
        setField(term5175, term5175.getClass(), "next", term5176);
        setIntField(term5177, term5177.getClass(), "type", 0);
        setField(term5177, term5177.getClass(), "next", null);
        setField(term5177, term5177.getClass(), "first", null);
        setField(term5177, term5177.getClass(), "last", null);
        setField(term5177, term5177.getClass(), "propListHead", null);
        setIntField(term5177, term5177.getClass(), "sourcePosition", 0);
        setField(term5177, term5177.getClass(), "jsType", null);
        setField(term5177, term5177.getClass(), "parent", null);
        setField(term5175, term5175.getClass(), "first", term5177);
        setIntField(term5178, term5178.getClass(), "type", 0);
        setField(term5178, term5178.getClass(), "next", null);
        setField(term5178, term5178.getClass(), "first", null);
        setField(term5178, term5178.getClass(), "last", null);
        setField(term5178, term5178.getClass(), "propListHead", null);
        setIntField(term5178, term5178.getClass(), "sourcePosition", 0);
        setField(term5178, term5178.getClass(), "jsType", null);
        setField(term5178, term5178.getClass(), "parent", null);
        setField(term5175, term5175.getClass(), "last", term5178);
        setField(term5179, term5179.getClass(), "next", null);
        setIntField(term5179, term5179.getClass(), "type", 0);
        setIntField(term5179, term5179.getClass(), "intValue", 0);
        setField(term5179, term5179.getClass(), "objectValue", null);
        setField(term5175, term5175.getClass(), "propListHead", term5179);
        setIntField(term5175, term5175.getClass(), "sourcePosition", -481533957);
        setField(term5175, term5175.getClass(), "jsType", null);
        setField(term5175, term5175.getClass(), "parent", null);
        setField(term5174, term5174.getClass(), "next", term5175);
        setIntField(term5180, term5180.getClass(), "type", 0);
        setField(term5180, term5180.getClass(), "next", null);
        setField(term5180, term5180.getClass(), "first", null);
        setField(term5180, term5180.getClass(), "last", null);
        setField(term5180, term5180.getClass(), "propListHead", null);
        setIntField(term5180, term5180.getClass(), "sourcePosition", 0);
        setField(term5180, term5180.getClass(), "jsType", null);
        setField(term5180, term5180.getClass(), "parent", null);
        setField(term5174, term5174.getClass(), "first", term5180);
        setIntField(term5181, term5181.getClass(), "type", 0);
        setField(term5181, term5181.getClass(), "next", null);
        setField(term5181, term5181.getClass(), "first", null);
        setField(term5181, term5181.getClass(), "last", null);
        setField(term5181, term5181.getClass(), "propListHead", null);
        setIntField(term5181, term5181.getClass(), "sourcePosition", 0);
        setField(term5181, term5181.getClass(), "jsType", null);
        setField(term5181, term5181.getClass(), "parent", null);
        setField(term5174, term5174.getClass(), "last", term5181);
        setField(term5182, term5182.getClass(), "next", null);
        setIntField(term5182, term5182.getClass(), "type", 0);
        setIntField(term5182, term5182.getClass(), "intValue", 0);
        setField(term5182, term5182.getClass(), "objectValue", null);
        setField(term5174, term5174.getClass(), "propListHead", term5182);
        setIntField(term5174, term5174.getClass(), "sourcePosition", 1240914516);
        setField(term5174, term5174.getClass(), "jsType", null);
        setField(term5174, term5174.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term163;
        args[1] = term190;
        Object retValue = callMethod(klass, "isLiteralValue", argTypes, null, args);
        assertTrue(recursiveEquals(term163, term5174));
        assertTrue(recursiveEquals(term190, false));
        assertTrue(recursiveEquals(retValue, false));
    }

};


