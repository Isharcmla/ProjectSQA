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

public class Node_init_1252989168216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322;
     Object term324;
     Object term351;
     Object term378;
     Object term380;

    public Node_init_1252989168216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term322 = new Integer(1861318859);
        term324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term324, term324.getClass(), "type", 1474524152);
        setIntField(term326, term326.getClass(), "type", 568954359);
        setIntField(term328, term328.getClass(), "type", 53410913);
        setIntField(term330, term330.getClass(), "type", -375014958);
        setIntField(term332, term332.getClass(), "type", 1107176718);
        setField(term332, term332.getClass(), "next", null);
        setField(term332, term332.getClass(), "first", null);
        setField(term332, term332.getClass(), "last", null);
        setField(term332, term332.getClass(), "propListHead", null);
        setIntField(term332, term332.getClass(), "sourcePosition", 0);
        setField(term332, term332.getClass(), "jsType", null);
        setField(term332, term332.getClass(), "parent", null);
        setField(term330, term330.getClass(), "next", term332);
        setIntField(term335, term335.getClass(), "type", 480137250);
        setField(term335, term335.getClass(), "next", null);
        setField(term335, term335.getClass(), "first", null);
        setField(term335, term335.getClass(), "last", term332);
        setField(term335, term335.getClass(), "propListHead", null);
        setIntField(term335, term335.getClass(), "sourcePosition", 0);
        setField(term335, term335.getClass(), "jsType", null);
        setField(term335, term335.getClass(), "parent", null);
        setField(term330, term330.getClass(), "first", term335);
        setField(term330, term330.getClass(), "last", term328);
        setField(term330, term330.getClass(), "propListHead", null);
        setIntField(term330, term330.getClass(), "sourcePosition", 0);
        setField(term330, term330.getClass(), "jsType", null);
        setField(term330, term330.getClass(), "parent", null);
        setField(term328, term328.getClass(), "next", term330);
        setField(term328, term328.getClass(), "first", term332);
        setIntField(term339, term339.getClass(), "type", -2015854073);
        setIntField(term341, term341.getClass(), "type", 538259104);
        setField(term341, term341.getClass(), "next", null);
        setField(term341, term341.getClass(), "first", term335);
        setField(term341, term341.getClass(), "last", term330);
        setField(term341, term341.getClass(), "propListHead", null);
        setIntField(term341, term341.getClass(), "sourcePosition", 0);
        setField(term341, term341.getClass(), "jsType", null);
        setField(term341, term341.getClass(), "parent", null);
        setField(term339, term339.getClass(), "next", term341);
        setField(term339, term339.getClass(), "first", term326);
        setField(term339, term339.getClass(), "last", term326);
        setField(term339, term339.getClass(), "propListHead", null);
        setIntField(term339, term339.getClass(), "sourcePosition", 0);
        setField(term339, term339.getClass(), "jsType", null);
        setField(term339, term339.getClass(), "parent", null);
        setField(term328, term328.getClass(), "last", term339);
        setField(term328, term328.getClass(), "propListHead", null);
        setIntField(term328, term328.getClass(), "sourcePosition", 0);
        setField(term328, term328.getClass(), "jsType", null);
        setField(term328, term328.getClass(), "parent", null);
        setField(term326, term326.getClass(), "next", term328);
        setIntField(term346, term346.getClass(), "type", 96566506);
        setField(term346, term346.getClass(), "next", term339);
        setField(term346, term346.getClass(), "first", term341);
        setField(term346, term346.getClass(), "last", term324);
        setField(term346, term346.getClass(), "propListHead", null);
        setIntField(term346, term346.getClass(), "sourcePosition", 0);
        setField(term346, term346.getClass(), "jsType", null);
        setField(term346, term346.getClass(), "parent", null);
        setField(term326, term326.getClass(), "first", term346);
        setField(term326, term326.getClass(), "last", term346);
        setField(term326, term326.getClass(), "propListHead", null);
        setIntField(term326, term326.getClass(), "sourcePosition", 0);
        setField(term326, term326.getClass(), "jsType", null);
        setField(term326, term326.getClass(), "parent", null);
        setField(term324, term324.getClass(), "next", term326);
        setField(term324, term324.getClass(), "first", term330);
        setField(term324, term324.getClass(), "last", term332);
        setField(term324, term324.getClass(), "propListHead", null);
        setIntField(term324, term324.getClass(), "sourcePosition", 0);
        setField(term324, term324.getClass(), "jsType", null);
        setField(term324, term324.getClass(), "parent", null);
        term351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term351, term351.getClass(), "type", -343325701);
        setIntField(term353, term353.getClass(), "type", 107945604);
        setIntField(term355, term355.getClass(), "type", -1963464809);
        setIntField(term357, term357.getClass(), "type", 71190297);
        setIntField(term359, term359.getClass(), "type", 1202361360);
        setField(term359, term359.getClass(), "next", null);
        setField(term359, term359.getClass(), "first", null);
        setField(term359, term359.getClass(), "last", null);
        setField(term359, term359.getClass(), "propListHead", null);
        setIntField(term359, term359.getClass(), "sourcePosition", 0);
        setField(term359, term359.getClass(), "jsType", null);
        setField(term359, term359.getClass(), "parent", null);
        setField(term357, term357.getClass(), "next", term359);
        setIntField(term362, term362.getClass(), "type", -2015048153);
        setField(term362, term362.getClass(), "next", null);
        setField(term362, term362.getClass(), "first", null);
        setField(term362, term362.getClass(), "last", term359);
        setField(term362, term362.getClass(), "propListHead", null);
        setIntField(term362, term362.getClass(), "sourcePosition", 0);
        setField(term362, term362.getClass(), "jsType", null);
        setField(term362, term362.getClass(), "parent", null);
        setField(term357, term357.getClass(), "first", term362);
        setField(term357, term357.getClass(), "last", term355);
        setField(term357, term357.getClass(), "propListHead", null);
        setIntField(term357, term357.getClass(), "sourcePosition", 0);
        setField(term357, term357.getClass(), "jsType", null);
        setField(term357, term357.getClass(), "parent", null);
        setField(term355, term355.getClass(), "next", term357);
        setField(term355, term355.getClass(), "first", term359);
        setIntField(term366, term366.getClass(), "type", -1222006000);
        setIntField(term368, term368.getClass(), "type", 2095798786);
        setField(term368, term368.getClass(), "next", null);
        setField(term368, term368.getClass(), "first", term362);
        setField(term368, term368.getClass(), "last", term357);
        setField(term368, term368.getClass(), "propListHead", null);
        setIntField(term368, term368.getClass(), "sourcePosition", 0);
        setField(term368, term368.getClass(), "jsType", null);
        setField(term368, term368.getClass(), "parent", null);
        setField(term366, term366.getClass(), "next", term368);
        setField(term366, term366.getClass(), "first", term353);
        setField(term366, term366.getClass(), "last", term353);
        setField(term366, term366.getClass(), "propListHead", null);
        setIntField(term366, term366.getClass(), "sourcePosition", 0);
        setField(term366, term366.getClass(), "jsType", null);
        setField(term366, term366.getClass(), "parent", null);
        setField(term355, term355.getClass(), "last", term366);
        setField(term355, term355.getClass(), "propListHead", null);
        setIntField(term355, term355.getClass(), "sourcePosition", 0);
        setField(term355, term355.getClass(), "jsType", null);
        setField(term355, term355.getClass(), "parent", null);
        setField(term353, term353.getClass(), "next", term355);
        setIntField(term373, term373.getClass(), "type", -1565502840);
        setField(term373, term373.getClass(), "next", term366);
        setField(term373, term373.getClass(), "first", term368);
        setField(term373, term373.getClass(), "last", term351);
        setField(term373, term373.getClass(), "propListHead", null);
        setIntField(term373, term373.getClass(), "sourcePosition", 0);
        setField(term373, term373.getClass(), "jsType", null);
        setField(term373, term373.getClass(), "parent", null);
        setField(term353, term353.getClass(), "first", term373);
        setField(term353, term353.getClass(), "last", term373);
        setField(term353, term353.getClass(), "propListHead", null);
        setIntField(term353, term353.getClass(), "sourcePosition", 0);
        setField(term353, term353.getClass(), "jsType", null);
        setField(term353, term353.getClass(), "parent", null);
        setField(term351, term351.getClass(), "next", term353);
        setField(term351, term351.getClass(), "first", term357);
        setField(term351, term351.getClass(), "last", term359);
        setField(term351, term351.getClass(), "propListHead", null);
        setIntField(term351, term351.getClass(), "sourcePosition", 0);
        setField(term351, term351.getClass(), "jsType", null);
        setField(term351, term351.getClass(), "parent", null);
        term378 = new Integer(344323424);
        term380 = new Integer(9726679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term322;
        args[1] = term324;
        args[2] = term351;
        args[3] = term378;
        args[4] = term380;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


