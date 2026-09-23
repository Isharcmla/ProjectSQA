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

public class ReferenceCollectingCallback_isBlockBoundary_68469872134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4960;
     Object term5178;

    public ReferenceCollectingCallback_isBlockBoundary_68469872134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4960, term4960.getClass(), "type", 114);
        term5178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5178, term5178.getClass(), "type", 114);
        setField(term5178, term5178.getClass(), "next", null);
        setField(term5178, term5178.getClass(), "first", null);
        setField(term5178, term5178.getClass(), "last", null);
        setField(term5178, term5178.getClass(), "propListHead", null);
        setIntField(term5178, term5178.getClass(), "sourcePosition", 0);
        setField(term5178, term5178.getClass(), "jsType", null);
        setField(term5178, term5178.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term4960;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term4960, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


