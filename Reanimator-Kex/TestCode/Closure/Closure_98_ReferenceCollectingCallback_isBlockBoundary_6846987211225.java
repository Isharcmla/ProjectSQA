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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368077;
     Object term369303;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term368077 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term368077, term368077.getClass(), "type", 101);
        term369303 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term369303, term369303.getClass(), "str", null);
        setIntField(term369303, term369303.getClass(), "type", 101);
        setField(term369303, term369303.getClass(), "next", null);
        setField(term369303, term369303.getClass(), "first", null);
        setField(term369303, term369303.getClass(), "last", null);
        setField(term369303, term369303.getClass(), "propListHead", null);
        setIntField(term369303, term369303.getClass(), "sourcePosition", 0);
        setField(term369303, term369303.getClass(), "jsType", null);
        setField(term369303, term369303.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term368077;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term368077, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


