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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IR_doNode_29216489190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term515;
     Object term542;

    public IR_doNode_29216489190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term515, term515.getClass(), "type", 1687361082);
        setIntField(term517, term517.getClass(), "type", 584893196);
        setIntField(term519, term519.getClass(), "type", 497269071);
        setIntField(term521, term521.getClass(), "type", -1899301124);
        setIntField(term523, term523.getClass(), "type", -1882480155);
        setField(term523, term523.getClass(), "next", null);
        setField(term523, term523.getClass(), "first", null);
        setField(term523, term523.getClass(), "last", null);
        setField(term523, term523.getClass(), "propListHead", null);
        setIntField(term523, term523.getClass(), "sourcePosition", 0);
        setField(term523, term523.getClass(), "jsType", null);
        setField(term523, term523.getClass(), "parent", null);
        setField(term521, term521.getClass(), "next", term523);
        setIntField(term526, term526.getClass(), "type", -1410220680);
        setField(term526, term526.getClass(), "next", null);
        setField(term526, term526.getClass(), "first", null);
        setField(term526, term526.getClass(), "last", term523);
        setField(term526, term526.getClass(), "propListHead", null);
        setIntField(term526, term526.getClass(), "sourcePosition", 0);
        setField(term526, term526.getClass(), "jsType", null);
        setField(term526, term526.getClass(), "parent", null);
        setField(term521, term521.getClass(), "first", term526);
        setField(term521, term521.getClass(), "last", term519);
        setField(term521, term521.getClass(), "propListHead", null);
        setIntField(term521, term521.getClass(), "sourcePosition", 0);
        setField(term521, term521.getClass(), "jsType", null);
        setField(term521, term521.getClass(), "parent", null);
        setField(term519, term519.getClass(), "next", term521);
        setField(term519, term519.getClass(), "first", term523);
        setIntField(term530, term530.getClass(), "type", -1945706126);
        setIntField(term532, term532.getClass(), "type", 1152356969);
        setField(term532, term532.getClass(), "next", null);
        setField(term532, term532.getClass(), "first", term526);
        setField(term532, term532.getClass(), "last", term521);
        setField(term532, term532.getClass(), "propListHead", null);
        setIntField(term532, term532.getClass(), "sourcePosition", 0);
        setField(term532, term532.getClass(), "jsType", null);
        setField(term532, term532.getClass(), "parent", null);
        setField(term530, term530.getClass(), "next", term532);
        setField(term530, term530.getClass(), "first", term517);
        setField(term530, term530.getClass(), "last", term517);
        setField(term530, term530.getClass(), "propListHead", null);
        setIntField(term530, term530.getClass(), "sourcePosition", 0);
        setField(term530, term530.getClass(), "jsType", null);
        setField(term530, term530.getClass(), "parent", null);
        setField(term519, term519.getClass(), "last", term530);
        setField(term519, term519.getClass(), "propListHead", null);
        setIntField(term519, term519.getClass(), "sourcePosition", 0);
        setField(term519, term519.getClass(), "jsType", null);
        setField(term519, term519.getClass(), "parent", null);
        setField(term517, term517.getClass(), "next", term519);
        setIntField(term537, term537.getClass(), "type", -1667990367);
        setField(term537, term537.getClass(), "next", term530);
        setField(term537, term537.getClass(), "first", term532);
        setField(term537, term537.getClass(), "last", term515);
        setField(term537, term537.getClass(), "propListHead", null);
        setIntField(term537, term537.getClass(), "sourcePosition", 0);
        setField(term537, term537.getClass(), "jsType", null);
        setField(term537, term537.getClass(), "parent", null);
        setField(term517, term517.getClass(), "first", term537);
        setField(term517, term517.getClass(), "last", term537);
        setField(term517, term517.getClass(), "propListHead", null);
        setIntField(term517, term517.getClass(), "sourcePosition", 0);
        setField(term517, term517.getClass(), "jsType", null);
        setField(term517, term517.getClass(), "parent", null);
        setField(term515, term515.getClass(), "next", term517);
        setField(term515, term515.getClass(), "first", term521);
        setField(term515, term515.getClass(), "last", term523);
        setField(term515, term515.getClass(), "propListHead", null);
        setIntField(term515, term515.getClass(), "sourcePosition", 0);
        setField(term515, term515.getClass(), "jsType", null);
        setField(term515, term515.getClass(), "parent", null);
        term542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term542, term542.getClass(), "type", -1214628358);
        setIntField(term544, term544.getClass(), "type", 1102721075);
        setIntField(term546, term546.getClass(), "type", -426764678);
        setIntField(term548, term548.getClass(), "type", -1222614956);
        setIntField(term550, term550.getClass(), "type", -1870495012);
        setField(term550, term550.getClass(), "next", null);
        setField(term550, term550.getClass(), "first", null);
        setField(term550, term550.getClass(), "last", null);
        setField(term550, term550.getClass(), "propListHead", null);
        setIntField(term550, term550.getClass(), "sourcePosition", 0);
        setField(term550, term550.getClass(), "jsType", null);
        setField(term550, term550.getClass(), "parent", null);
        setField(term548, term548.getClass(), "next", term550);
        setIntField(term553, term553.getClass(), "type", -1310015129);
        setField(term553, term553.getClass(), "next", null);
        setField(term553, term553.getClass(), "first", null);
        setField(term553, term553.getClass(), "last", term550);
        setField(term553, term553.getClass(), "propListHead", null);
        setIntField(term553, term553.getClass(), "sourcePosition", 0);
        setField(term553, term553.getClass(), "jsType", null);
        setField(term553, term553.getClass(), "parent", null);
        setField(term548, term548.getClass(), "first", term553);
        setField(term548, term548.getClass(), "last", term546);
        setField(term548, term548.getClass(), "propListHead", null);
        setIntField(term548, term548.getClass(), "sourcePosition", 0);
        setField(term548, term548.getClass(), "jsType", null);
        setField(term548, term548.getClass(), "parent", null);
        setField(term546, term546.getClass(), "next", term548);
        setField(term546, term546.getClass(), "first", term550);
        setIntField(term557, term557.getClass(), "type", -571169753);
        setIntField(term559, term559.getClass(), "type", 318591690);
        setField(term559, term559.getClass(), "next", null);
        setField(term559, term559.getClass(), "first", term553);
        setField(term559, term559.getClass(), "last", term548);
        setField(term559, term559.getClass(), "propListHead", null);
        setIntField(term559, term559.getClass(), "sourcePosition", 0);
        setField(term559, term559.getClass(), "jsType", null);
        setField(term559, term559.getClass(), "parent", null);
        setField(term557, term557.getClass(), "next", term559);
        setField(term557, term557.getClass(), "first", term544);
        setField(term557, term557.getClass(), "last", term544);
        setField(term557, term557.getClass(), "propListHead", null);
        setIntField(term557, term557.getClass(), "sourcePosition", 0);
        setField(term557, term557.getClass(), "jsType", null);
        setField(term557, term557.getClass(), "parent", null);
        setField(term546, term546.getClass(), "last", term557);
        setField(term546, term546.getClass(), "propListHead", null);
        setIntField(term546, term546.getClass(), "sourcePosition", 0);
        setField(term546, term546.getClass(), "jsType", null);
        setField(term546, term546.getClass(), "parent", null);
        setField(term544, term544.getClass(), "next", term546);
        setIntField(term564, term564.getClass(), "type", -165587447);
        setField(term564, term564.getClass(), "next", term557);
        setField(term564, term564.getClass(), "first", term559);
        setField(term564, term564.getClass(), "last", term542);
        setField(term564, term564.getClass(), "propListHead", null);
        setIntField(term564, term564.getClass(), "sourcePosition", 0);
        setField(term564, term564.getClass(), "jsType", null);
        setField(term564, term564.getClass(), "parent", null);
        setField(term544, term544.getClass(), "first", term564);
        setField(term544, term544.getClass(), "last", term564);
        setField(term544, term544.getClass(), "propListHead", null);
        setIntField(term544, term544.getClass(), "sourcePosition", 0);
        setField(term544, term544.getClass(), "jsType", null);
        setField(term544, term544.getClass(), "parent", null);
        setField(term542, term542.getClass(), "next", term544);
        setField(term542, term542.getClass(), "first", term548);
        setField(term542, term542.getClass(), "last", term550);
        setField(term542, term542.getClass(), "propListHead", null);
        setIntField(term542, term542.getClass(), "sourcePosition", 0);
        setField(term542, term542.getClass(), "jsType", null);
        setField(term542, term542.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term515;
        args[1] = term542;
        try {
            callMethod(klass, "doNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


