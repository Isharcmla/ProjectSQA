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

public class ReferenceCollectingCallback_isBlockBoundary_684698721992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270225;
     Object term270648;

    public ReferenceCollectingCallback_isBlockBoundary_684698721992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270225 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term270225, term270225.getClass(), "type", 115);
        term270648 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term270648, term270648.getClass(), "number", 0.0);
        setIntField(term270648, term270648.getClass(), "type", 115);
        setField(term270648, term270648.getClass(), "next", null);
        setField(term270648, term270648.getClass(), "first", null);
        setField(term270648, term270648.getClass(), "last", null);
        setField(term270648, term270648.getClass(), "propListHead", null);
        setIntField(term270648, term270648.getClass(), "sourcePosition", 0);
        setField(term270648, term270648.getClass(), "jsType", null);
        setField(term270648, term270648.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term270225;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term270225, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


