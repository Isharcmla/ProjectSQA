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

public class NodeUtil_mayBeStringHelper_1019295344536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41651;
     Object term80719;

    public NodeUtil_mayBeStringHelper_1019295344536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41651, term41651.getClass(), "type", 51);
        term80719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term80719, term80719.getClass(), "type", 51);
        setField(term80719, term80719.getClass(), "next", null);
        setField(term80719, term80719.getClass(), "first", null);
        setField(term80719, term80719.getClass(), "last", null);
        setField(term80719, term80719.getClass(), "propListHead", null);
        setIntField(term80719, term80719.getClass(), "sourcePosition", 0);
        setField(term80719, term80719.getClass(), "jsType", null);
        setField(term80719, term80719.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term41651;
        Object retValue = callMethod(klass, "mayBeStringHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term41651, term80719));
        assertTrue(recursiveEquals(retValue, false));
    }

};


