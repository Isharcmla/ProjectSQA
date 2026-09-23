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
import java.util.ArrayDeque;

public class ReferenceCollectingCallback_shouldTraverse_422855684440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112461;
     Object term112607;
     Object term112699;
     Object term112740;
     Object term112744;
     Object term112745;

    public ReferenceCollectingCallback_shouldTraverse_422855684440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term112515 = new ArrayDeque();
        term112461 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term112461, term112461.getClass(), "blockStack", term112515);
        term112607 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term112607, term112607.getClass(), "type", 111);
        term112699 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term112699, term112699.getClass(), "type", 111);
        ArrayDeque term112741 = new ArrayDeque();
        term112740 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term112740, term112740.getClass(), "referenceMap", null);
        setField(term112740, term112740.getClass(), "blockStack", term112741);
        setField(term112740, term112740.getClass(), "behavior", null);
        setField(term112740, term112740.getClass(), "compiler", null);
        setField(term112740, term112740.getClass(), "varFilter", null);
        term112744 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term112744, term112744.getClass(), "number", 0.0);
        setIntField(term112744, term112744.getClass(), "type", 111);
        setField(term112744, term112744.getClass(), "next", null);
        setField(term112744, term112744.getClass(), "first", null);
        setField(term112744, term112744.getClass(), "last", null);
        setField(term112744, term112744.getClass(), "propListHead", null);
        setIntField(term112744, term112744.getClass(), "sourcePosition", 0);
        setField(term112744, term112744.getClass(), "jsType", null);
        setField(term112744, term112744.getClass(), "parent", null);
        term112745 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term112745, term112745.getClass(), "number", 0.0);
        setIntField(term112745, term112745.getClass(), "type", 111);
        setField(term112745, term112745.getClass(), "next", null);
        setField(term112745, term112745.getClass(), "first", null);
        setField(term112745, term112745.getClass(), "last", null);
        setField(term112745, term112745.getClass(), "propListHead", null);
        setIntField(term112745, term112745.getClass(), "sourcePosition", 0);
        setField(term112745, term112745.getClass(), "jsType", null);
        setField(term112745, term112745.getClass(), "parent", null);
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
        args[1] = term112607;
        args[2] = term112699;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term112461, args);
        assertTrue(recursiveEquals(term112461, term112740));
        assertTrue(recursiveEquals(term112607, term112745));
        assertTrue(recursiveEquals(term112699, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


