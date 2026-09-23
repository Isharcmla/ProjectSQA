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

public class IR_throwNode_94030653986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326;

    public IR_throwNode_94030653986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term326, term326.getClass(), "type", 1386130016);
        setIntField(term328, term328.getClass(), "type", 1072005683);
        setIntField(term330, term330.getClass(), "type", 1861318859);
        setIntField(term332, term332.getClass(), "type", 1474524152);
        setIntField(term334, term334.getClass(), "type", 568954359);
        setField(term334, term334.getClass(), "next", null);
        setField(term334, term334.getClass(), "first", null);
        setField(term334, term334.getClass(), "last", null);
        setField(term334, term334.getClass(), "propListHead", null);
        setIntField(term334, term334.getClass(), "sourcePosition", 0);
        setField(term334, term334.getClass(), "jsType", null);
        setField(term334, term334.getClass(), "parent", null);
        setField(term332, term332.getClass(), "next", term334);
        setIntField(term337, term337.getClass(), "type", 53410913);
        setField(term337, term337.getClass(), "next", null);
        setField(term337, term337.getClass(), "first", null);
        setField(term337, term337.getClass(), "last", term334);
        setField(term337, term337.getClass(), "propListHead", null);
        setIntField(term337, term337.getClass(), "sourcePosition", 0);
        setField(term337, term337.getClass(), "jsType", null);
        setField(term337, term337.getClass(), "parent", null);
        setField(term332, term332.getClass(), "first", term337);
        setField(term332, term332.getClass(), "last", term330);
        setField(term332, term332.getClass(), "propListHead", null);
        setIntField(term332, term332.getClass(), "sourcePosition", 0);
        setField(term332, term332.getClass(), "jsType", null);
        setField(term332, term332.getClass(), "parent", null);
        setField(term330, term330.getClass(), "next", term332);
        setField(term330, term330.getClass(), "first", term334);
        setIntField(term341, term341.getClass(), "type", 1107176718);
        setIntField(term343, term343.getClass(), "type", 480137250);
        setField(term343, term343.getClass(), "next", null);
        setField(term343, term343.getClass(), "first", term337);
        setField(term343, term343.getClass(), "last", term332);
        setField(term343, term343.getClass(), "propListHead", null);
        setIntField(term343, term343.getClass(), "sourcePosition", 0);
        setField(term343, term343.getClass(), "jsType", null);
        setField(term343, term343.getClass(), "parent", null);
        setField(term341, term341.getClass(), "next", term343);
        setField(term341, term341.getClass(), "first", term328);
        setField(term341, term341.getClass(), "last", term328);
        setField(term341, term341.getClass(), "propListHead", null);
        setIntField(term341, term341.getClass(), "sourcePosition", 0);
        setField(term341, term341.getClass(), "jsType", null);
        setField(term341, term341.getClass(), "parent", null);
        setField(term330, term330.getClass(), "last", term341);
        setField(term330, term330.getClass(), "propListHead", null);
        setIntField(term330, term330.getClass(), "sourcePosition", 0);
        setField(term330, term330.getClass(), "jsType", null);
        setField(term330, term330.getClass(), "parent", null);
        setField(term328, term328.getClass(), "next", term330);
        setIntField(term348, term348.getClass(), "type", -341152642);
        setField(term348, term348.getClass(), "next", term341);
        setField(term348, term348.getClass(), "first", term343);
        setField(term348, term348.getClass(), "last", term326);
        setField(term348, term348.getClass(), "propListHead", null);
        setIntField(term348, term348.getClass(), "sourcePosition", 0);
        setField(term348, term348.getClass(), "jsType", null);
        setField(term348, term348.getClass(), "parent", null);
        setField(term328, term328.getClass(), "first", term348);
        setField(term328, term328.getClass(), "last", term348);
        setField(term328, term328.getClass(), "propListHead", null);
        setIntField(term328, term328.getClass(), "sourcePosition", 0);
        setField(term328, term328.getClass(), "jsType", null);
        setField(term328, term328.getClass(), "parent", null);
        setField(term326, term326.getClass(), "next", term328);
        setField(term326, term326.getClass(), "first", term332);
        setField(term326, term326.getClass(), "last", term334);
        setField(term326, term326.getClass(), "propListHead", null);
        setIntField(term326, term326.getClass(), "sourcePosition", 0);
        setField(term326, term326.getClass(), "jsType", null);
        setField(term326, term326.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term326;
        try {
            callMethod(klass, "throwNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


