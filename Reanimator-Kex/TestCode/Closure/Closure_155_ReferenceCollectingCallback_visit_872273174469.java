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

public class ReferenceCollectingCallback_visit_872273174469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116723;
     Object term116953;
     Object term116907;
     Object term117330;
     Object term117331;
     Object term117332;

    public ReferenceCollectingCallback_visit_872273174469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116723 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term116953 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term116953, term116953.getClass(), "type", 101);
        term116907 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term116907, term116907.getClass(), "type", 101);
        setField(term116907, term116907.getClass(), "first", term116953);
        term117330 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term117330, term117330.getClass(), "referenceMap", null);
        setField(term117330, term117330.getClass(), "blockStack", null);
        setField(term117330, term117330.getClass(), "behavior", null);
        setField(term117330, term117330.getClass(), "compiler", null);
        setField(term117330, term117330.getClass(), "varFilter", null);
        term117331 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term117331, term117331.getClass(), "number", 0.0);
        setIntField(term117331, term117331.getClass(), "type", 101);
        setField(term117331, term117331.getClass(), "next", null);
        setField(term117331, term117331.getClass(), "first", null);
        setField(term117331, term117331.getClass(), "last", null);
        setField(term117331, term117331.getClass(), "propListHead", null);
        setIntField(term117331, term117331.getClass(), "sourcePosition", 0);
        setField(term117331, term117331.getClass(), "jsType", null);
        setField(term117331, term117331.getClass(), "parent", null);
        term117332 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term117333 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term117332, term117332.getClass(), "number", 0.0);
        setIntField(term117332, term117332.getClass(), "type", 101);
        setField(term117332, term117332.getClass(), "next", null);
        setDoubleField(term117333, term117333.getClass(), "number", 0.0);
        setIntField(term117333, term117333.getClass(), "type", 101);
        setField(term117333, term117333.getClass(), "next", null);
        setField(term117333, term117333.getClass(), "first", null);
        setField(term117333, term117333.getClass(), "last", null);
        setField(term117333, term117333.getClass(), "propListHead", null);
        setIntField(term117333, term117333.getClass(), "sourcePosition", 0);
        setField(term117333, term117333.getClass(), "jsType", null);
        setField(term117333, term117333.getClass(), "parent", null);
        setField(term117332, term117332.getClass(), "first", term117333);
        setField(term117332, term117332.getClass(), "last", null);
        setField(term117332, term117332.getClass(), "propListHead", null);
        setIntField(term117332, term117332.getClass(), "sourcePosition", 0);
        setField(term117332, term117332.getClass(), "jsType", null);
        setField(term117332, term117332.getClass(), "parent", null);
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
        args[1] = term116953;
        args[2] = term116907;
        callMethod(klass, "visit", argTypes, term116723, args);
        assertTrue(recursiveEquals(term116723, term117330));
        assertTrue(recursiveEquals(term116953, term117332));
        assertTrue(recursiveEquals(term116907, null));
    }

};


