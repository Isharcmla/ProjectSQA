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

public class ReferenceCollectingCallback_shouldTraverse_42285568451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6190;
     Object term6260;
     Object term6287;
     Object term6288;

    public ReferenceCollectingCallback_shouldTraverse_42285568451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6190 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term6260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term6287 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term6287, term6287.getClass(), "referenceMap", null);
        setField(term6287, term6287.getClass(), "blockStack", null);
        setField(term6287, term6287.getClass(), "behavior", null);
        setField(term6287, term6287.getClass(), "compiler", null);
        setField(term6287, term6287.getClass(), "varFilter", null);
        term6288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6288, term6288.getClass(), "type", 0);
        setField(term6288, term6288.getClass(), "next", null);
        setField(term6288, term6288.getClass(), "first", null);
        setField(term6288, term6288.getClass(), "last", null);
        setField(term6288, term6288.getClass(), "propListHead", null);
        setIntField(term6288, term6288.getClass(), "sourcePosition", 0);
        setField(term6288, term6288.getClass(), "jsType", null);
        setField(term6288, term6288.getClass(), "parent", null);
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
        args[1] = term6260;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term6190, args);
        assertTrue(recursiveEquals(term6190, term6287));
        assertTrue(recursiveEquals(term6260, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


