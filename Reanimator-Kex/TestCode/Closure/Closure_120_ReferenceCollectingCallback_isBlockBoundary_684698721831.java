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

public class ReferenceCollectingCallback_isBlockBoundary_684698721831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329955;
     Object term329964;

    public ReferenceCollectingCallback_isBlockBoundary_684698721831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term329955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term329955, term329955.getClass(), "type", 111);
        term329964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term329964, term329964.getClass(), "type", 111);
        setField(term329964, term329964.getClass(), "next", null);
        setField(term329964, term329964.getClass(), "first", null);
        setField(term329964, term329964.getClass(), "last", null);
        setField(term329964, term329964.getClass(), "propListHead", null);
        setIntField(term329964, term329964.getClass(), "sourcePosition", 0);
        setField(term329964, term329964.getClass(), "jsType", null);
        setField(term329964, term329964.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term329955;
        args[1] = null;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term329955, term329964));
        assertTrue(recursiveEquals(retValue, true));
    }

};


