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

public class ReferenceCollectingCallback_isBlockBoundary_68469872144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6365;
     Object term6695;

    public ReferenceCollectingCallback_isBlockBoundary_68469872144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6365, term6365.getClass(), "type", 101);
        term6695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6695, term6695.getClass(), "type", 101);
        setField(term6695, term6695.getClass(), "next", null);
        setField(term6695, term6695.getClass(), "first", null);
        setField(term6695, term6695.getClass(), "last", null);
        setField(term6695, term6695.getClass(), "propListHead", null);
        setIntField(term6695, term6695.getClass(), "sourcePosition", 0);
        setField(term6695, term6695.getClass(), "jsType", null);
        setField(term6695, term6695.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term6365;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term6365, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


