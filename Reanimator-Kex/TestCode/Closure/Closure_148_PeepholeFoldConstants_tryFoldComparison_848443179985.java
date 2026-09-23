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

public class PeepholeFoldConstants_tryFoldComparison_848443179985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230124;
     Object term230216;
     Object term230308;
     Object term230400;
     Object term230820;
     Object term230821;
     Object term230822;
     Object term230823;
     Object term230802;

    public PeepholeFoldConstants_tryFoldComparison_848443179985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230124 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term230216 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term230216, term230216.getClass(), "type", 16);
        term230308 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term230308, term230308.getClass(), "type", 16);
        term230400 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term230820 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term230820, term230820.getClass(), "currentTraversal", null);
        term230821 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term230821, term230821.getClass(), "str", null);
        setIntField(term230821, term230821.getClass(), "type", 16);
        setField(term230821, term230821.getClass(), "next", null);
        setField(term230821, term230821.getClass(), "first", null);
        setField(term230821, term230821.getClass(), "last", null);
        setField(term230821, term230821.getClass(), "propListHead", null);
        setIntField(term230821, term230821.getClass(), "sourcePosition", 0);
        setField(term230821, term230821.getClass(), "jsType", null);
        setField(term230821, term230821.getClass(), "parent", null);
        term230822 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term230822, term230822.getClass(), "str", null);
        setIntField(term230822, term230822.getClass(), "type", 16);
        setField(term230822, term230822.getClass(), "next", null);
        setField(term230822, term230822.getClass(), "first", null);
        setField(term230822, term230822.getClass(), "last", null);
        setField(term230822, term230822.getClass(), "propListHead", null);
        setIntField(term230822, term230822.getClass(), "sourcePosition", 0);
        setField(term230822, term230822.getClass(), "jsType", null);
        setField(term230822, term230822.getClass(), "parent", null);
        term230823 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term230823, term230823.getClass(), "str", null);
        setIntField(term230823, term230823.getClass(), "type", 0);
        setField(term230823, term230823.getClass(), "next", null);
        setField(term230823, term230823.getClass(), "first", null);
        setField(term230823, term230823.getClass(), "last", null);
        setField(term230823, term230823.getClass(), "propListHead", null);
        setIntField(term230823, term230823.getClass(), "sourcePosition", 0);
        setField(term230823, term230823.getClass(), "jsType", null);
        setField(term230823, term230823.getClass(), "parent", null);
        term230802 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term230802, term230802.getClass(), "str", null);
        setIntField(term230802, term230802.getClass(), "type", 16);
        setField(term230802, term230802.getClass(), "next", null);
        setField(term230802, term230802.getClass(), "first", null);
        setField(term230802, term230802.getClass(), "last", null);
        setField(term230802, term230802.getClass(), "propListHead", null);
        setIntField(term230802, term230802.getClass(), "sourcePosition", 0);
        setField(term230802, term230802.getClass(), "jsType", null);
        setField(term230802, term230802.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term230216;
        args[1] = term230308;
        args[2] = term230400;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term230124, args);
        assertTrue(recursiveEquals(term230124, term230820));
        assertTrue(recursiveEquals(term230216, term230821));
        assertTrue(recursiveEquals(term230308, term230822));
        assertTrue(recursiveEquals(term230400, term230823));
        assertTrue(recursiveEquals(retValue, term230802));
    }

};


