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
import java.lang.Object;

public class CodeGenerator_getFirstNonEmptyChild_162111751029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7655;

    public CodeGenerator_getFirstNonEmptyChild_162111751029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7655, term7655.getClass(), "type", 1598895173);
        setIntField(term7657, term7657.getClass(), "type", 1830648570);
        setIntField(term7659, term7659.getClass(), "type", -227365013);
        setIntField(term7661, term7661.getClass(), "type", 11724947);
        setIntField(term7663, term7663.getClass(), "type", 1953277050);
        setField(term7663, term7663.getClass(), "next", null);
        setField(term7663, term7663.getClass(), "first", null);
        setField(term7663, term7663.getClass(), "last", null);
        setField(term7663, term7663.getClass(), "propListHead", null);
        setIntField(term7663, term7663.getClass(), "sourcePosition", 0);
        setField(term7663, term7663.getClass(), "jsType", null);
        setField(term7663, term7663.getClass(), "parent", null);
        setField(term7661, term7661.getClass(), "next", term7663);
        setIntField(term7666, term7666.getClass(), "type", 1283079251);
        setField(term7666, term7666.getClass(), "next", null);
        setField(term7666, term7666.getClass(), "first", null);
        setField(term7666, term7666.getClass(), "last", term7663);
        setField(term7666, term7666.getClass(), "propListHead", null);
        setIntField(term7666, term7666.getClass(), "sourcePosition", 0);
        setField(term7666, term7666.getClass(), "jsType", null);
        setField(term7666, term7666.getClass(), "parent", null);
        setField(term7661, term7661.getClass(), "first", term7666);
        setField(term7661, term7661.getClass(), "last", term7659);
        setField(term7661, term7661.getClass(), "propListHead", null);
        setIntField(term7661, term7661.getClass(), "sourcePosition", 0);
        setField(term7661, term7661.getClass(), "jsType", null);
        setField(term7661, term7661.getClass(), "parent", null);
        setField(term7659, term7659.getClass(), "next", term7661);
        setField(term7659, term7659.getClass(), "first", term7663);
        setIntField(term7670, term7670.getClass(), "type", 1398204340);
        setIntField(term7672, term7672.getClass(), "type", 229204365);
        setField(term7672, term7672.getClass(), "next", null);
        setField(term7672, term7672.getClass(), "first", term7666);
        setField(term7672, term7672.getClass(), "last", term7661);
        setField(term7672, term7672.getClass(), "propListHead", null);
        setIntField(term7672, term7672.getClass(), "sourcePosition", 0);
        setField(term7672, term7672.getClass(), "jsType", null);
        setField(term7672, term7672.getClass(), "parent", null);
        setField(term7670, term7670.getClass(), "next", term7672);
        setField(term7670, term7670.getClass(), "first", term7657);
        setField(term7670, term7670.getClass(), "last", term7657);
        setField(term7670, term7670.getClass(), "propListHead", null);
        setIntField(term7670, term7670.getClass(), "sourcePosition", 0);
        setField(term7670, term7670.getClass(), "jsType", null);
        setField(term7670, term7670.getClass(), "parent", null);
        setField(term7659, term7659.getClass(), "last", term7670);
        setField(term7659, term7659.getClass(), "propListHead", null);
        setIntField(term7659, term7659.getClass(), "sourcePosition", 0);
        setField(term7659, term7659.getClass(), "jsType", null);
        setField(term7659, term7659.getClass(), "parent", null);
        setField(term7657, term7657.getClass(), "next", term7659);
        setIntField(term7677, term7677.getClass(), "type", -461771056);
        setField(term7677, term7677.getClass(), "next", term7670);
        setField(term7677, term7677.getClass(), "first", term7672);
        setField(term7677, term7677.getClass(), "last", term7655);
        setField(term7677, term7677.getClass(), "propListHead", null);
        setIntField(term7677, term7677.getClass(), "sourcePosition", 0);
        setField(term7677, term7677.getClass(), "jsType", null);
        setField(term7677, term7677.getClass(), "parent", null);
        setField(term7657, term7657.getClass(), "first", term7677);
        setField(term7657, term7657.getClass(), "last", term7677);
        setField(term7657, term7657.getClass(), "propListHead", null);
        setIntField(term7657, term7657.getClass(), "sourcePosition", 0);
        setField(term7657, term7657.getClass(), "jsType", null);
        setField(term7657, term7657.getClass(), "parent", null);
        setField(term7655, term7655.getClass(), "next", term7657);
        setField(term7655, term7655.getClass(), "first", term7661);
        setField(term7655, term7655.getClass(), "last", term7663);
        setField(term7655, term7655.getClass(), "propListHead", null);
        setIntField(term7655, term7655.getClass(), "sourcePosition", 0);
        setField(term7655, term7655.getClass(), "jsType", null);
        setField(term7655, term7655.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term7655;
        callMethod(klass, "getFirstNonEmptyChild", argTypes, null, args);
    }

};


