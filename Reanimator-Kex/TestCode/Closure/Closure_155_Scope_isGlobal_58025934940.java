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
import java.util.HashMap;
import java.lang.Object;

public class Scope_isGlobal_58025934940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term903;
     Object term3437;

    public Scope_isGlobal_58025934940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term904 = new HashMap();
        term903 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term917 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term903, term903.getClass(), "vars", term904);
        setField(term917, term917.getClass(), "vars", null);
        setField(term917, term917.getClass(), "parent", null);
        setIntField(term917, term917.getClass(), "depth", 0);
        setField(term917, term917.getClass(), "rootNode", null);
        setField(term917, term917.getClass(), "thisType", null);
        setBooleanField(term917, term917.getClass(), "isBottom", false);
        setField(term903, term903.getClass(), "parent", term917);
        setIntField(term903, term903.getClass(), "depth", 1050765721);
        setIntField(term921, term921.getClass(), "type", 0);
        setField(term921, term921.getClass(), "next", null);
        setField(term921, term921.getClass(), "first", null);
        setField(term921, term921.getClass(), "last", null);
        setField(term921, term921.getClass(), "propListHead", null);
        setIntField(term921, term921.getClass(), "sourcePosition", 0);
        setField(term921, term921.getClass(), "jsType", null);
        setField(term921, term921.getClass(), "parent", null);
        setField(term903, term903.getClass(), "rootNode", term921);
        setField(term903, term903.getClass(), "thisType", null);
        setBooleanField(term903, term903.getClass(), "isBottom", false);
        HashMap term3438 = new HashMap();
        term3437 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3439 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3437, term3437.getClass(), "vars", term3438);
        setField(term3439, term3439.getClass(), "vars", null);
        setField(term3439, term3439.getClass(), "parent", null);
        setIntField(term3439, term3439.getClass(), "depth", 0);
        setField(term3439, term3439.getClass(), "rootNode", null);
        setField(term3439, term3439.getClass(), "thisType", null);
        setBooleanField(term3439, term3439.getClass(), "isBottom", false);
        setField(term3437, term3437.getClass(), "parent", term3439);
        setIntField(term3437, term3437.getClass(), "depth", 1050765721);
        setIntField(term3440, term3440.getClass(), "type", 0);
        setField(term3440, term3440.getClass(), "next", null);
        setField(term3440, term3440.getClass(), "first", null);
        setField(term3440, term3440.getClass(), "last", null);
        setField(term3440, term3440.getClass(), "propListHead", null);
        setIntField(term3440, term3440.getClass(), "sourcePosition", 0);
        setField(term3440, term3440.getClass(), "jsType", null);
        setField(term3440, term3440.getClass(), "parent", null);
        setField(term3437, term3437.getClass(), "rootNode", term3440);
        setField(term3437, term3437.getClass(), "thisType", null);
        setBooleanField(term3437, term3437.getClass(), "isBottom", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isGlobal", argTypes, term903, args);
        assertTrue(recursiveEquals(term903, term3437));
        assertTrue(recursiveEquals(retValue, false));
    }

};


