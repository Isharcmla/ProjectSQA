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

public class Scope_getSlot_122114774039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term640;

    public Scope_getSlot_122114774039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term641 = new HashMap();
        term640 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term654 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term640, term640.getClass(), "vars", term641);
        setField(term654, term654.getClass(), "vars", null);
        setField(term654, term654.getClass(), "parent", null);
        setIntField(term654, term654.getClass(), "depth", 0);
        setField(term654, term654.getClass(), "rootNode", null);
        setField(term654, term654.getClass(), "thisType", null);
        setBooleanField(term654, term654.getClass(), "isBottom", false);
        setField(term654, term654.getClass(), "arguments", null);
        setField(term640, term640.getClass(), "parent", term654);
        setIntField(term640, term640.getClass(), "depth", -2066804303);
        setIntField(term658, term658.getClass(), "type", 0);
        setField(term658, term658.getClass(), "next", null);
        setField(term658, term658.getClass(), "first", null);
        setField(term658, term658.getClass(), "last", null);
        setField(term658, term658.getClass(), "propListHead", null);
        setIntField(term658, term658.getClass(), "sourcePosition", 0);
        setField(term658, term658.getClass(), "jsType", null);
        setField(term658, term658.getClass(), "parent", null);
        setField(term640, term640.getClass(), "rootNode", term658);
        setField(term640, term640.getClass(), "thisType", null);
        setBooleanField(term640, term640.getClass(), "isBottom", false);
        setField(term640, term640.getClass(), "arguments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JDaAnsVTGV";
        try {
            callMethod(klass, "getSlot", argTypes, term640, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


