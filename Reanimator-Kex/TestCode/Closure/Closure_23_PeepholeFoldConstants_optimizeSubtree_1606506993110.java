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

public class PeepholeFoldConstants_optimizeSubtree_1606506993110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14306;
     Object term14376;
     Object term14619;
     Object term14620;
     Object term14609;

    public PeepholeFoldConstants_optimizeSubtree_1606506993110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14306 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term14376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14376, term14376.getClass(), "type", 42);
        term14619 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setBooleanField(term14619, term14619.getClass(), "late", false);
        setField(term14619, term14619.getClass(), "compiler", null);
        term14620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14620, term14620.getClass(), "type", 42);
        setField(term14620, term14620.getClass(), "next", null);
        setField(term14620, term14620.getClass(), "first", null);
        setField(term14620, term14620.getClass(), "last", null);
        setField(term14620, term14620.getClass(), "propListHead", null);
        setIntField(term14620, term14620.getClass(), "sourcePosition", 0);
        setField(term14620, term14620.getClass(), "jsType", null);
        setField(term14620, term14620.getClass(), "parent", null);
        term14609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14609, term14609.getClass(), "type", 42);
        setField(term14609, term14609.getClass(), "next", null);
        setField(term14609, term14609.getClass(), "first", null);
        setField(term14609, term14609.getClass(), "last", null);
        setField(term14609, term14609.getClass(), "propListHead", null);
        setIntField(term14609, term14609.getClass(), "sourcePosition", 0);
        setField(term14609, term14609.getClass(), "jsType", null);
        setField(term14609, term14609.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term14376;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term14306, args);
        assertTrue(recursiveEquals(term14306, term14619));
        assertTrue(recursiveEquals(term14376, term14620));
        assertTrue(recursiveEquals(retValue, term14609));
    }

};


