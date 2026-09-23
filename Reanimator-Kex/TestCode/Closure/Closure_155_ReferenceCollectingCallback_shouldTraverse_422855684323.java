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

public class ReferenceCollectingCallback_shouldTraverse_422855684323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75112;
     Object term75182;
     Object term75193;
     Object term75194;

    public ReferenceCollectingCallback_shouldTraverse_422855684323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75112 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term75182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term75182, term75182.getClass(), "type", 101);
        term75193 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term75193, term75193.getClass(), "referenceMap", null);
        setField(term75193, term75193.getClass(), "blockStack", null);
        setField(term75193, term75193.getClass(), "behavior", null);
        setField(term75193, term75193.getClass(), "compiler", null);
        setField(term75193, term75193.getClass(), "varFilter", null);
        term75194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term75194, term75194.getClass(), "type", 101);
        setField(term75194, term75194.getClass(), "next", null);
        setField(term75194, term75194.getClass(), "first", null);
        setField(term75194, term75194.getClass(), "last", null);
        setField(term75194, term75194.getClass(), "propListHead", null);
        setIntField(term75194, term75194.getClass(), "sourcePosition", 0);
        setField(term75194, term75194.getClass(), "jsType", null);
        setField(term75194, term75194.getClass(), "parent", null);
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
        args[2] = term75182;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term75112, args);
        assertTrue(recursiveEquals(term75112, term75193));
        assertTrue(recursiveEquals(term75182, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


