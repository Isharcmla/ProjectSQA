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

public class ReferenceCollectingCallback_isBlockBoundary_684698721925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236516;
     Object term236525;

    public ReferenceCollectingCallback_isBlockBoundary_684698721925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236516 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term236525 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term236525, term236525.getClass(), "number", 0.0);
        setIntField(term236525, term236525.getClass(), "type", 0);
        setField(term236525, term236525.getClass(), "next", null);
        setField(term236525, term236525.getClass(), "first", null);
        setField(term236525, term236525.getClass(), "last", null);
        setField(term236525, term236525.getClass(), "propListHead", null);
        setIntField(term236525, term236525.getClass(), "sourcePosition", 0);
        setField(term236525, term236525.getClass(), "jsType", null);
        setField(term236525, term236525.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term236516;
        args[1] = null;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term236516, term236525));
        assertTrue(recursiveEquals(retValue, false));
    }

};


