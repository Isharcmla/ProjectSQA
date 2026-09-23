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

public class NodeUtil_isControlStructureCodeBlock_763580606538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1110639;
     Object term1163027;

    public NodeUtil_isControlStructureCodeBlock_763580606538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1110639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1110639, term1110639.getClass(), "type", 119);
        term1163027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1163027, term1163027.getClass(), "type", 119);
        setField(term1163027, term1163027.getClass(), "next", null);
        setField(term1163027, term1163027.getClass(), "first", null);
        setField(term1163027, term1163027.getClass(), "last", null);
        setField(term1163027, term1163027.getClass(), "propListHead", null);
        setIntField(term1163027, term1163027.getClass(), "sourcePosition", 0);
        setField(term1163027, term1163027.getClass(), "jsType", null);
        setField(term1163027, term1163027.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1110639;
        args[1] = null;
        Object retValue = callMethod(klass, "isControlStructureCodeBlock", argTypes, null, args);
        assertTrue(recursiveEquals(term1110639, term1163027));
        assertTrue(recursiveEquals(retValue, true));
    }

};


