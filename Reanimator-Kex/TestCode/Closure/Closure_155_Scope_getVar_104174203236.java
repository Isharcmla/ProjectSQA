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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class Scope_getVar_104174203236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term769;

    public Scope_getVar_104174203236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term770 = new HashMap();
        term769 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term783 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term769, term769.getClass(), "vars", term770);
        setField(term783, term783.getClass(), "vars", null);
        setField(term783, term783.getClass(), "parent", null);
        setIntField(term783, term783.getClass(), "depth", 0);
        setField(term783, term783.getClass(), "rootNode", null);
        setField(term783, term783.getClass(), "thisType", null);
        setBooleanField(term783, term783.getClass(), "isBottom", false);
        setField(term769, term769.getClass(), "parent", term783);
        setIntField(term769, term769.getClass(), "depth", -1122880881);
        setIntField(term787, term787.getClass(), "type", 0);
        setField(term787, term787.getClass(), "next", null);
        setField(term787, term787.getClass(), "first", null);
        setField(term787, term787.getClass(), "last", null);
        setField(term787, term787.getClass(), "propListHead", null);
        setIntField(term787, term787.getClass(), "sourcePosition", 0);
        setField(term787, term787.getClass(), "jsType", null);
        setField(term787, term787.getClass(), "parent", null);
        setField(term769, term769.getClass(), "rootNode", term787);
        setField(term769, term769.getClass(), "thisType", null);
        setBooleanField(term769, term769.getClass(), "isBottom", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xJgPlLxpgC";
        try {
            callMethod(klass, "getVar", argTypes, term769, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


