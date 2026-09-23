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

public class FlowSensitiveInlineVariables_process_55946046565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15423;
     Object term15515;
     Object term17134;
     Object term17135;

    public FlowSensitiveInlineVariables_process_55946046565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15423 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        setField(term15423, term15423.getClass(), "compiler", null);
        term15515 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term17134 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        setField(term17134, term17134.getClass(), "compiler", null);
        setField(term17134, term17134.getClass(), "cfg", null);
        setField(term17134, term17134.getClass(), "candidates", null);
        setField(term17134, term17134.getClass(), "reachingDef", null);
        setField(term17134, term17134.getClass(), "reachingUses", null);
        term17135 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term17135, term17135.getClass(), "str", null);
        setIntField(term17135, term17135.getClass(), "type", 0);
        setField(term17135, term17135.getClass(), "next", null);
        setField(term17135, term17135.getClass(), "first", null);
        setField(term17135, term17135.getClass(), "last", null);
        setField(term17135, term17135.getClass(), "propListHead", null);
        setIntField(term17135, term17135.getClass(), "sourcePosition", 0);
        setField(term17135, term17135.getClass(), "jsType", null);
        setField(term17135, term17135.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term15515;
        callMethod(klass, "process", argTypes, term15423, args);
        assertTrue(recursiveEquals(term15423, term17134));
        assertTrue(recursiveEquals(term15515, null));
    }

};


