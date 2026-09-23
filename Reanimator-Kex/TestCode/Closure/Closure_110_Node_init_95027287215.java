package com.google.javascript.rhino;

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
import java.lang.IllegalArgumentException;
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Node_init_95027287215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289;
     Object term291;
     Object term318;
     Object term320;

    public Node_init_95027287215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289 = new Integer(-1476117762);
        term291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term291, term291.getClass(), "type", -341962980);
        setIntField(term293, term293.getClass(), "type", 1532716628);
        setIntField(term295, term295.getClass(), "type", -1801760683);
        setIntField(term297, term297.getClass(), "type", 1141317871);
        setIntField(term299, term299.getClass(), "type", 890669485);
        setField(term299, term299.getClass(), "next", null);
        setField(term299, term299.getClass(), "first", null);
        setField(term299, term299.getClass(), "last", null);
        setField(term299, term299.getClass(), "propListHead", null);
        setIntField(term299, term299.getClass(), "sourcePosition", 0);
        setField(term299, term299.getClass(), "jsType", null);
        setField(term299, term299.getClass(), "parent", null);
        setField(term297, term297.getClass(), "next", term299);
        setIntField(term302, term302.getClass(), "type", 691577392);
        setField(term302, term302.getClass(), "next", null);
        setField(term302, term302.getClass(), "first", null);
        setField(term302, term302.getClass(), "last", term299);
        setField(term302, term302.getClass(), "propListHead", null);
        setIntField(term302, term302.getClass(), "sourcePosition", 0);
        setField(term302, term302.getClass(), "jsType", null);
        setField(term302, term302.getClass(), "parent", null);
        setField(term297, term297.getClass(), "first", term302);
        setField(term297, term297.getClass(), "last", term295);
        setField(term297, term297.getClass(), "propListHead", null);
        setIntField(term297, term297.getClass(), "sourcePosition", 0);
        setField(term297, term297.getClass(), "jsType", null);
        setField(term297, term297.getClass(), "parent", null);
        setField(term295, term295.getClass(), "next", term297);
        setField(term295, term295.getClass(), "first", term299);
        setIntField(term306, term306.getClass(), "type", -1963434938);
        setIntField(term308, term308.getClass(), "type", 906181092);
        setField(term308, term308.getClass(), "next", null);
        setField(term308, term308.getClass(), "first", term302);
        setField(term308, term308.getClass(), "last", term297);
        setField(term308, term308.getClass(), "propListHead", null);
        setIntField(term308, term308.getClass(), "sourcePosition", 0);
        setField(term308, term308.getClass(), "jsType", null);
        setField(term308, term308.getClass(), "parent", null);
        setField(term306, term306.getClass(), "next", term308);
        setField(term306, term306.getClass(), "first", term293);
        setField(term306, term306.getClass(), "last", term293);
        setField(term306, term306.getClass(), "propListHead", null);
        setIntField(term306, term306.getClass(), "sourcePosition", 0);
        setField(term306, term306.getClass(), "jsType", null);
        setField(term306, term306.getClass(), "parent", null);
        setField(term295, term295.getClass(), "last", term306);
        setField(term295, term295.getClass(), "propListHead", null);
        setIntField(term295, term295.getClass(), "sourcePosition", 0);
        setField(term295, term295.getClass(), "jsType", null);
        setField(term295, term295.getClass(), "parent", null);
        setField(term293, term293.getClass(), "next", term295);
        setIntField(term313, term313.getClass(), "type", 1045657203);
        setField(term313, term313.getClass(), "next", term306);
        setField(term313, term313.getClass(), "first", term308);
        setField(term313, term313.getClass(), "last", term291);
        setField(term313, term313.getClass(), "propListHead", null);
        setIntField(term313, term313.getClass(), "sourcePosition", 0);
        setField(term313, term313.getClass(), "jsType", null);
        setField(term313, term313.getClass(), "parent", null);
        setField(term293, term293.getClass(), "first", term313);
        setField(term293, term293.getClass(), "last", term313);
        setField(term293, term293.getClass(), "propListHead", null);
        setIntField(term293, term293.getClass(), "sourcePosition", 0);
        setField(term293, term293.getClass(), "jsType", null);
        setField(term293, term293.getClass(), "parent", null);
        setField(term291, term291.getClass(), "next", term293);
        setField(term291, term291.getClass(), "first", term297);
        setField(term291, term291.getClass(), "last", term299);
        setField(term291, term291.getClass(), "propListHead", null);
        setIntField(term291, term291.getClass(), "sourcePosition", 0);
        setField(term291, term291.getClass(), "jsType", null);
        setField(term291, term291.getClass(), "parent", null);
        term318 = new Integer(1386130016);
        term320 = new Integer(1072005683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term289;
        args[1] = term291;
        args[2] = term318;
        args[3] = term320;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


