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

public class ReferenceCollectingCallback_isBlockBoundary_68469872147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6777;
     Object term6805;

    public ReferenceCollectingCallback_isBlockBoundary_68469872147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6777, term6777.getClass(), "type", 108);
        term6805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6805, term6805.getClass(), "type", 108);
        setField(term6805, term6805.getClass(), "next", null);
        setField(term6805, term6805.getClass(), "first", null);
        setField(term6805, term6805.getClass(), "last", null);
        setField(term6805, term6805.getClass(), "propListHead", null);
        setIntField(term6805, term6805.getClass(), "sourcePosition", 0);
        setField(term6805, term6805.getClass(), "jsType", null);
        setField(term6805, term6805.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term6777;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term6777, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


