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

public class ReferenceCollectingCallback_shouldTraverse_42285568429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4452;
     Object term4522;
     Object term4796;
     Object term4797;

    public ReferenceCollectingCallback_shouldTraverse_42285568429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4452 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term4522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4522, term4522.getClass(), "type", 100);
        term4796 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term4796, term4796.getClass(), "referenceMap", null);
        setField(term4796, term4796.getClass(), "blockStack", null);
        setField(term4796, term4796.getClass(), "behavior", null);
        setField(term4796, term4796.getClass(), "compiler", null);
        setField(term4796, term4796.getClass(), "varFilter", null);
        term4797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4797, term4797.getClass(), "type", 100);
        setField(term4797, term4797.getClass(), "next", null);
        setField(term4797, term4797.getClass(), "first", null);
        setField(term4797, term4797.getClass(), "last", null);
        setField(term4797, term4797.getClass(), "propListHead", null);
        setIntField(term4797, term4797.getClass(), "sourcePosition", 0);
        setField(term4797, term4797.getClass(), "jsType", null);
        setField(term4797, term4797.getClass(), "parent", null);
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
        args[2] = term4522;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term4452, args);
        assertTrue(recursiveEquals(term4452, term4796));
        assertTrue(recursiveEquals(term4522, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


