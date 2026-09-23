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

public class ReferenceCollectingCallback_shouldTraverse_422855684568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153958;
     Object term154050;
     Object term154325;
     Object term154326;

    public ReferenceCollectingCallback_shouldTraverse_422855684568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153958 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term154050 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term154050, term154050.getClass(), "type", 108);
        term154325 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term154325, term154325.getClass(), "referenceMap", null);
        setField(term154325, term154325.getClass(), "blockStack", null);
        setField(term154325, term154325.getClass(), "behavior", null);
        setField(term154325, term154325.getClass(), "compiler", null);
        setField(term154325, term154325.getClass(), "varFilter", null);
        term154326 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term154326, term154326.getClass(), "str", null);
        setIntField(term154326, term154326.getClass(), "type", 108);
        setField(term154326, term154326.getClass(), "next", null);
        setField(term154326, term154326.getClass(), "first", null);
        setField(term154326, term154326.getClass(), "last", null);
        setField(term154326, term154326.getClass(), "propListHead", null);
        setIntField(term154326, term154326.getClass(), "sourcePosition", 0);
        setField(term154326, term154326.getClass(), "jsType", null);
        setField(term154326, term154326.getClass(), "parent", null);
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
        args[1] = null;
        args[2] = term154050;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term153958, args);
        assertTrue(recursiveEquals(term153958, term154325));
        assertTrue(recursiveEquals(term154050, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


