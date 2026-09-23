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

public class CheckAccessControls_checkPropertyDeprecation_148944317657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11592;
     Object term11662;
     Object term12315;
     Object term12316;

    public CheckAccessControls_checkPropertyDeprecation_148944317657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11592 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term11662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11662, term11662.getClass(), "type", 30);
        term12315 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term12315, term12315.getClass(), "compiler", null);
        setField(term12315, term12315.getClass(), "validator", null);
        setIntField(term12315, term12315.getClass(), "deprecatedDepth", 0);
        setIntField(term12315, term12315.getClass(), "methodDepth", 0);
        setField(term12315, term12315.getClass(), "currentClass", null);
        setField(term12315, term12315.getClass(), "initializedConstantProperties", null);
        term12316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12316, term12316.getClass(), "type", 30);
        setField(term12316, term12316.getClass(), "next", null);
        setField(term12316, term12316.getClass(), "first", null);
        setField(term12316, term12316.getClass(), "last", null);
        setField(term12316, term12316.getClass(), "propListHead", null);
        setIntField(term12316, term12316.getClass(), "sourcePosition", 0);
        setField(term12316, term12316.getClass(), "jsType", null);
        setField(term12316, term12316.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term11662;
        callMethod(klass, "checkPropertyDeprecation", argTypes, term11592, args);
        assertTrue(recursiveEquals(term11592, term12315));
        assertTrue(recursiveEquals(term11662, null));
    }

};


