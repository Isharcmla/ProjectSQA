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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276546;
     Object term276996;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276546 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term276996 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term276996, term276996.getClass(), "str", null);
        setIntField(term276996, term276996.getClass(), "type", 0);
        setField(term276996, term276996.getClass(), "next", null);
        setField(term276996, term276996.getClass(), "first", null);
        setField(term276996, term276996.getClass(), "last", null);
        setField(term276996, term276996.getClass(), "propListHead", null);
        setIntField(term276996, term276996.getClass(), "sourcePosition", 0);
        setField(term276996, term276996.getClass(), "jsType", null);
        setField(term276996, term276996.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term276546;
        args[1] = null;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term276546, term276996));
        assertTrue(recursiveEquals(retValue, false));
    }

};


