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

public class ReferenceCollectingCallback_isBlockBoundary_684698721215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40913;
     Object term40937;

    public ReferenceCollectingCallback_isBlockBoundary_684698721215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40913 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term40913, term40913.getClass(), "type", 77);
        term40937 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term40937, term40937.getClass(), "number", 0.0);
        setIntField(term40937, term40937.getClass(), "type", 77);
        setField(term40937, term40937.getClass(), "next", null);
        setField(term40937, term40937.getClass(), "first", null);
        setField(term40937, term40937.getClass(), "last", null);
        setField(term40937, term40937.getClass(), "propListHead", null);
        setIntField(term40937, term40937.getClass(), "sourcePosition", 0);
        setField(term40937, term40937.getClass(), "jsType", null);
        setField(term40937, term40937.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term40913;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term40913, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


