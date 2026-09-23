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

public class PeepholeFoldConstants_tryFoldComparison_8484431791570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term573658;
     Object term573750;
     Object term573842;
     Object term573934;
     Object term574016;
     Object term574017;
     Object term574018;
     Object term574019;
     Object term573992;

    public PeepholeFoldConstants_tryFoldComparison_8484431791570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term573658 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term573750 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term573750, term573750.getClass(), "type", 16);
        term573842 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term573842, term573842.getClass(), "type", 42);
        term573934 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term573934, term573934.getClass(), "type", 16);
        term574016 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term574016, term574016.getClass(), "currentTraversal", null);
        term574017 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term574017, term574017.getClass(), "str", null);
        setIntField(term574017, term574017.getClass(), "type", 42);
        setField(term574017, term574017.getClass(), "next", null);
        setField(term574017, term574017.getClass(), "first", null);
        setField(term574017, term574017.getClass(), "last", null);
        setField(term574017, term574017.getClass(), "propListHead", null);
        setIntField(term574017, term574017.getClass(), "sourcePosition", 0);
        setField(term574017, term574017.getClass(), "jsType", null);
        setField(term574017, term574017.getClass(), "parent", null);
        term574018 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term574018, term574018.getClass(), "str", null);
        setIntField(term574018, term574018.getClass(), "type", 16);
        setField(term574018, term574018.getClass(), "next", null);
        setField(term574018, term574018.getClass(), "first", null);
        setField(term574018, term574018.getClass(), "last", null);
        setField(term574018, term574018.getClass(), "propListHead", null);
        setIntField(term574018, term574018.getClass(), "sourcePosition", 0);
        setField(term574018, term574018.getClass(), "jsType", null);
        setField(term574018, term574018.getClass(), "parent", null);
        term574019 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term574019, term574019.getClass(), "number", 0.0);
        setIntField(term574019, term574019.getClass(), "type", 16);
        setField(term574019, term574019.getClass(), "next", null);
        setField(term574019, term574019.getClass(), "first", null);
        setField(term574019, term574019.getClass(), "last", null);
        setField(term574019, term574019.getClass(), "propListHead", null);
        setIntField(term574019, term574019.getClass(), "sourcePosition", 0);
        setField(term574019, term574019.getClass(), "jsType", null);
        setField(term574019, term574019.getClass(), "parent", null);
        term573992 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term573992, term573992.getClass(), "str", null);
        setIntField(term573992, term573992.getClass(), "type", 16);
        setField(term573992, term573992.getClass(), "next", null);
        setField(term573992, term573992.getClass(), "first", null);
        setField(term573992, term573992.getClass(), "last", null);
        setField(term573992, term573992.getClass(), "propListHead", null);
        setIntField(term573992, term573992.getClass(), "sourcePosition", 0);
        setField(term573992, term573992.getClass(), "jsType", null);
        setField(term573992, term573992.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term573750;
        args[1] = term573842;
        args[2] = term573934;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term573658, args);
        assertTrue(recursiveEquals(term573658, term574016));
        assertTrue(recursiveEquals(term573750, term574017));
        assertTrue(recursiveEquals(term573842, term574018));
        assertTrue(recursiveEquals(term573934, term574019));
        assertTrue(recursiveEquals(retValue, term573992));
    }

};


