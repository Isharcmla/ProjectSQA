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
import java.lang.Object;

public class NodeUtil_nodeTypeMayHaveSideEffects_1759651727186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term625;
     Object term8683;

    public NodeUtil_nodeTypeMayHaveSideEffects_1759651727186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term635 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term625, term625.getClass(), "type", -945116798);
        setIntField(term627, term627.getClass(), "type", -129547140);
        setIntField(term629, term629.getClass(), "type", 0);
        setField(term629, term629.getClass(), "next", null);
        setField(term629, term629.getClass(), "first", null);
        setField(term629, term629.getClass(), "last", null);
        setField(term629, term629.getClass(), "propListHead", null);
        setIntField(term629, term629.getClass(), "sourcePosition", 0);
        setField(term629, term629.getClass(), "jsType", null);
        setField(term629, term629.getClass(), "parent", null);
        setField(term627, term627.getClass(), "next", term629);
        setIntField(term632, term632.getClass(), "type", 0);
        setField(term632, term632.getClass(), "next", null);
        setField(term632, term632.getClass(), "first", null);
        setField(term632, term632.getClass(), "last", null);
        setField(term632, term632.getClass(), "propListHead", null);
        setIntField(term632, term632.getClass(), "sourcePosition", 0);
        setField(term632, term632.getClass(), "jsType", null);
        setField(term632, term632.getClass(), "parent", null);
        setField(term627, term627.getClass(), "first", term632);
        setIntField(term635, term635.getClass(), "type", 0);
        setField(term635, term635.getClass(), "next", null);
        setField(term635, term635.getClass(), "first", null);
        setField(term635, term635.getClass(), "last", null);
        setField(term635, term635.getClass(), "propListHead", null);
        setIntField(term635, term635.getClass(), "sourcePosition", 0);
        setField(term635, term635.getClass(), "jsType", null);
        setField(term635, term635.getClass(), "parent", null);
        setField(term627, term627.getClass(), "last", term635);
        setField(term627, term627.getClass(), "propListHead", null);
        setIntField(term627, term627.getClass(), "sourcePosition", 0);
        setField(term627, term627.getClass(), "jsType", null);
        setField(term627, term627.getClass(), "parent", null);
        setField(term625, term625.getClass(), "next", term627);
        setIntField(term639, term639.getClass(), "type", 0);
        setField(term639, term639.getClass(), "next", null);
        setField(term639, term639.getClass(), "first", null);
        setField(term639, term639.getClass(), "last", null);
        setField(term639, term639.getClass(), "propListHead", null);
        setIntField(term639, term639.getClass(), "sourcePosition", 0);
        setField(term639, term639.getClass(), "jsType", null);
        setField(term639, term639.getClass(), "parent", null);
        setField(term625, term625.getClass(), "first", term639);
        setIntField(term642, term642.getClass(), "type", 0);
        setField(term642, term642.getClass(), "next", null);
        setField(term642, term642.getClass(), "first", null);
        setField(term642, term642.getClass(), "last", null);
        setField(term642, term642.getClass(), "propListHead", null);
        setIntField(term642, term642.getClass(), "sourcePosition", 0);
        setField(term642, term642.getClass(), "jsType", null);
        setField(term642, term642.getClass(), "parent", null);
        setField(term625, term625.getClass(), "last", term642);
        setField(term625, term625.getClass(), "propListHead", null);
        setIntField(term625, term625.getClass(), "sourcePosition", 0);
        setField(term625, term625.getClass(), "jsType", null);
        setField(term625, term625.getClass(), "parent", null);
        term8683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8683, term8683.getClass(), "type", -945116798);
        setIntField(term8684, term8684.getClass(), "type", -129547140);
        setIntField(term8685, term8685.getClass(), "type", 0);
        setField(term8685, term8685.getClass(), "next", null);
        setField(term8685, term8685.getClass(), "first", null);
        setField(term8685, term8685.getClass(), "last", null);
        setField(term8685, term8685.getClass(), "propListHead", null);
        setIntField(term8685, term8685.getClass(), "sourcePosition", 0);
        setField(term8685, term8685.getClass(), "jsType", null);
        setField(term8685, term8685.getClass(), "parent", null);
        setField(term8684, term8684.getClass(), "next", term8685);
        setIntField(term8686, term8686.getClass(), "type", 0);
        setField(term8686, term8686.getClass(), "next", null);
        setField(term8686, term8686.getClass(), "first", null);
        setField(term8686, term8686.getClass(), "last", null);
        setField(term8686, term8686.getClass(), "propListHead", null);
        setIntField(term8686, term8686.getClass(), "sourcePosition", 0);
        setField(term8686, term8686.getClass(), "jsType", null);
        setField(term8686, term8686.getClass(), "parent", null);
        setField(term8684, term8684.getClass(), "first", term8686);
        setIntField(term8687, term8687.getClass(), "type", 0);
        setField(term8687, term8687.getClass(), "next", null);
        setField(term8687, term8687.getClass(), "first", null);
        setField(term8687, term8687.getClass(), "last", null);
        setField(term8687, term8687.getClass(), "propListHead", null);
        setIntField(term8687, term8687.getClass(), "sourcePosition", 0);
        setField(term8687, term8687.getClass(), "jsType", null);
        setField(term8687, term8687.getClass(), "parent", null);
        setField(term8684, term8684.getClass(), "last", term8687);
        setField(term8684, term8684.getClass(), "propListHead", null);
        setIntField(term8684, term8684.getClass(), "sourcePosition", 0);
        setField(term8684, term8684.getClass(), "jsType", null);
        setField(term8684, term8684.getClass(), "parent", null);
        setField(term8683, term8683.getClass(), "next", term8684);
        setIntField(term8688, term8688.getClass(), "type", 0);
        setField(term8688, term8688.getClass(), "next", null);
        setField(term8688, term8688.getClass(), "first", null);
        setField(term8688, term8688.getClass(), "last", null);
        setField(term8688, term8688.getClass(), "propListHead", null);
        setIntField(term8688, term8688.getClass(), "sourcePosition", 0);
        setField(term8688, term8688.getClass(), "jsType", null);
        setField(term8688, term8688.getClass(), "parent", null);
        setField(term8683, term8683.getClass(), "first", term8688);
        setIntField(term8689, term8689.getClass(), "type", 0);
        setField(term8689, term8689.getClass(), "next", null);
        setField(term8689, term8689.getClass(), "first", null);
        setField(term8689, term8689.getClass(), "last", null);
        setField(term8689, term8689.getClass(), "propListHead", null);
        setIntField(term8689, term8689.getClass(), "sourcePosition", 0);
        setField(term8689, term8689.getClass(), "jsType", null);
        setField(term8689, term8689.getClass(), "parent", null);
        setField(term8683, term8683.getClass(), "last", term8689);
        setField(term8683, term8683.getClass(), "propListHead", null);
        setIntField(term8683, term8683.getClass(), "sourcePosition", 0);
        setField(term8683, term8683.getClass(), "jsType", null);
        setField(term8683, term8683.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term625;
        args[1] = null;
        Object retValue = callMethod(klass, "nodeTypeMayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term625, term8683));
        assertTrue(recursiveEquals(retValue, false));
    }

};


