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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3586368;
     Object term3586454;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3586368 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3586454 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3586546 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3586638 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3586730 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3586816 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3586454, term3586454.getClass(), "type", 37);
        setIntField(term3586546, term3586546.getClass(), "type", 35);
        setIntField(term3586730, term3586730.getClass(), "type", 40);
        setField(term3586730, term3586730.getClass(), "str", null);
        setField(term3586638, term3586638.getClass(), "next", term3586730);
        setIntField(term3586638, term3586638.getClass(), "type", 40);
        setField(term3586546, term3586546.getClass(), "first", term3586638);
        setIntField(term3586816, term3586816.getClass(), "type", 39);
        setField(term3586546, term3586546.getClass(), "next", term3586816);
        setField(term3586454, term3586454.getClass(), "first", term3586546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3586454;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3586368, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


