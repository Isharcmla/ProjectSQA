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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96262;
     Object term96354;
     Object term96587;
     Object term96588;
     Object term96547;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96262 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term96354 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term96446 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term96538 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term96446, term96446.getClass(), "next", term96538);
        setField(term96354, term96354.getClass(), "first", term96446);
        setIntField(term96354, term96354.getClass(), "type", 9);
        term96587 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term96587, term96587.getClass(), "currentTraversal", null);
        term96588 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term96589 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term96590 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term96588, term96588.getClass(), "number", 0.0);
        setIntField(term96588, term96588.getClass(), "type", 9);
        setField(term96588, term96588.getClass(), "next", null);
        setDoubleField(term96589, term96589.getClass(), "number", 0.0);
        setIntField(term96589, term96589.getClass(), "type", 0);
        setDoubleField(term96590, term96590.getClass(), "number", 0.0);
        setIntField(term96590, term96590.getClass(), "type", 0);
        setField(term96590, term96590.getClass(), "next", null);
        setField(term96590, term96590.getClass(), "first", null);
        setField(term96590, term96590.getClass(), "last", null);
        setField(term96590, term96590.getClass(), "propListHead", null);
        setIntField(term96590, term96590.getClass(), "sourcePosition", 0);
        setField(term96590, term96590.getClass(), "jsType", null);
        setField(term96590, term96590.getClass(), "parent", null);
        setField(term96589, term96589.getClass(), "next", term96590);
        setField(term96589, term96589.getClass(), "first", null);
        setField(term96589, term96589.getClass(), "last", null);
        setField(term96589, term96589.getClass(), "propListHead", null);
        setIntField(term96589, term96589.getClass(), "sourcePosition", 0);
        setField(term96589, term96589.getClass(), "jsType", null);
        setField(term96589, term96589.getClass(), "parent", null);
        setField(term96588, term96588.getClass(), "first", term96589);
        setField(term96588, term96588.getClass(), "last", null);
        setField(term96588, term96588.getClass(), "propListHead", null);
        setIntField(term96588, term96588.getClass(), "sourcePosition", 0);
        setField(term96588, term96588.getClass(), "jsType", null);
        setField(term96588, term96588.getClass(), "parent", null);
        term96547 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term96550 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term96553 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term96547, term96547.getClass(), "number", 0.0);
        setIntField(term96547, term96547.getClass(), "type", 9);
        setField(term96547, term96547.getClass(), "next", null);
        setDoubleField(term96550, term96550.getClass(), "number", 0.0);
        setIntField(term96550, term96550.getClass(), "type", 0);
        setDoubleField(term96553, term96553.getClass(), "number", 0.0);
        setIntField(term96553, term96553.getClass(), "type", 0);
        setField(term96553, term96553.getClass(), "next", null);
        setField(term96553, term96553.getClass(), "first", null);
        setField(term96553, term96553.getClass(), "last", null);
        setField(term96553, term96553.getClass(), "propListHead", null);
        setIntField(term96553, term96553.getClass(), "sourcePosition", 0);
        setField(term96553, term96553.getClass(), "jsType", null);
        setField(term96553, term96553.getClass(), "parent", null);
        setField(term96550, term96550.getClass(), "next", term96553);
        setField(term96550, term96550.getClass(), "first", null);
        setField(term96550, term96550.getClass(), "last", null);
        setField(term96550, term96550.getClass(), "propListHead", null);
        setIntField(term96550, term96550.getClass(), "sourcePosition", 0);
        setField(term96550, term96550.getClass(), "jsType", null);
        setField(term96550, term96550.getClass(), "parent", null);
        setField(term96547, term96547.getClass(), "first", term96550);
        setField(term96547, term96547.getClass(), "last", null);
        setField(term96547, term96547.getClass(), "propListHead", null);
        setIntField(term96547, term96547.getClass(), "sourcePosition", 0);
        setField(term96547, term96547.getClass(), "jsType", null);
        setField(term96547, term96547.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term96354;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term96262, args);
        assertTrue(recursiveEquals(term96262, term96587));
        assertTrue(recursiveEquals(term96354, term96588));
        assertTrue(recursiveEquals(retValue, term96547));
    }

};


