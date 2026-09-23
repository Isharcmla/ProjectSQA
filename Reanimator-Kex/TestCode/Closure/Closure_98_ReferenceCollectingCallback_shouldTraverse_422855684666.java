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

public class ReferenceCollectingCallback_shouldTraverse_422855684666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179409;
     Object term179501;
     Object term179593;
     Object term180048;
     Object term180049;
     Object term180050;

    public ReferenceCollectingCallback_shouldTraverse_422855684666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179409 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term179501 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term179593 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term179593, term179593.getClass(), "type", 4);
        term180048 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term180048, term180048.getClass(), "referenceMap", null);
        setField(term180048, term180048.getClass(), "blockStack", null);
        setField(term180048, term180048.getClass(), "behavior", null);
        setField(term180048, term180048.getClass(), "compiler", null);
        setField(term180048, term180048.getClass(), "varFilter", null);
        term180049 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term180049, term180049.getClass(), "number", 0.0);
        setIntField(term180049, term180049.getClass(), "type", 4);
        setField(term180049, term180049.getClass(), "next", null);
        setField(term180049, term180049.getClass(), "first", null);
        setField(term180049, term180049.getClass(), "last", null);
        setField(term180049, term180049.getClass(), "propListHead", null);
        setIntField(term180049, term180049.getClass(), "sourcePosition", 0);
        setField(term180049, term180049.getClass(), "jsType", null);
        setField(term180049, term180049.getClass(), "parent", null);
        term180050 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term180050, term180050.getClass(), "number", 0.0);
        setIntField(term180050, term180050.getClass(), "type", 0);
        setField(term180050, term180050.getClass(), "next", null);
        setField(term180050, term180050.getClass(), "first", null);
        setField(term180050, term180050.getClass(), "last", null);
        setField(term180050, term180050.getClass(), "propListHead", null);
        setIntField(term180050, term180050.getClass(), "sourcePosition", 0);
        setField(term180050, term180050.getClass(), "jsType", null);
        setField(term180050, term180050.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term179501;
        args[2] = term179593;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term179409, args);
        assertTrue(recursiveEquals(term179409, term180048));
        assertTrue(recursiveEquals(term179501, term180050));
        assertTrue(recursiveEquals(term179593, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


