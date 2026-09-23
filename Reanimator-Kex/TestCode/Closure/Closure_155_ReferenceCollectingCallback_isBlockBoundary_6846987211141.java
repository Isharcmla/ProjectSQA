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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301464;
     Object term301978;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term301464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term301464, term301464.getClass(), "type", 111);
        term301978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term301978, term301978.getClass(), "type", 111);
        setField(term301978, term301978.getClass(), "next", null);
        setField(term301978, term301978.getClass(), "first", null);
        setField(term301978, term301978.getClass(), "last", null);
        setField(term301978, term301978.getClass(), "propListHead", null);
        setIntField(term301978, term301978.getClass(), "sourcePosition", 0);
        setField(term301978, term301978.getClass(), "jsType", null);
        setField(term301978, term301978.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term301464;
        args[1] = null;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term301464, term301978));
        assertTrue(recursiveEquals(retValue, true));
    }

};


