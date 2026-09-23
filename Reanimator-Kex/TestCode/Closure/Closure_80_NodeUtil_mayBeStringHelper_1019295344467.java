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

public class NodeUtil_mayBeStringHelper_1019295344467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50278;
     Object term50307;

    public NodeUtil_mayBeStringHelper_1019295344467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50278, term50278.getClass(), "type", 44);
        term50307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50307, term50307.getClass(), "type", 44);
        setField(term50307, term50307.getClass(), "next", null);
        setField(term50307, term50307.getClass(), "first", null);
        setField(term50307, term50307.getClass(), "last", null);
        setField(term50307, term50307.getClass(), "propListHead", null);
        setIntField(term50307, term50307.getClass(), "sourcePosition", 0);
        setField(term50307, term50307.getClass(), "jsType", null);
        setField(term50307, term50307.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term50278;
        Object retValue = callMethod(klass, "mayBeStringHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term50278, term50307));
        assertTrue(recursiveEquals(retValue, false));
    }

};


