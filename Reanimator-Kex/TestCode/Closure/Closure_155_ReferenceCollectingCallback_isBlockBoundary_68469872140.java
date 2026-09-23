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

public class ReferenceCollectingCallback_isBlockBoundary_68469872140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5729;
     Object term5799;
     Object term6026;
     Object term6027;

    public ReferenceCollectingCallback_isBlockBoundary_68469872140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5729, term5729.getClass(), "type", 111);
        term5799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5799, term5799.getClass(), "type", 12);
        term6026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6026, term6026.getClass(), "type", 12);
        setField(term6026, term6026.getClass(), "next", null);
        setField(term6026, term6026.getClass(), "first", null);
        setField(term6026, term6026.getClass(), "last", null);
        setField(term6026, term6026.getClass(), "propListHead", null);
        setIntField(term6026, term6026.getClass(), "sourcePosition", 0);
        setField(term6026, term6026.getClass(), "jsType", null);
        setField(term6026, term6026.getClass(), "parent", null);
        term6027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6027, term6027.getClass(), "type", 111);
        setField(term6027, term6027.getClass(), "next", null);
        setField(term6027, term6027.getClass(), "first", null);
        setField(term6027, term6027.getClass(), "last", null);
        setField(term6027, term6027.getClass(), "propListHead", null);
        setIntField(term6027, term6027.getClass(), "sourcePosition", 0);
        setField(term6027, term6027.getClass(), "jsType", null);
        setField(term6027, term6027.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term5729;
        args[1] = term5799;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term5729, term6026));
        assertTrue(recursiveEquals(term5799, term6027));
        assertTrue(recursiveEquals(retValue, true));
    }

};


