package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Node_detachFromParent_571402714312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3852;

    public Node_detachFromParent_571402714312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3856 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3852, term3852.getClass(), "type", -1791371074);
        setIntField(term3854, term3854.getClass(), "type", -1151122332);
        setIntField(term3856, term3856.getClass(), "type", 953387911);
        setIntField(term3858, term3858.getClass(), "type", -1550025613);
        setIntField(term3860, term3860.getClass(), "type", 814617314);
        setField(term3860, term3860.getClass(), "next", null);
        setField(term3860, term3860.getClass(), "first", null);
        setField(term3860, term3860.getClass(), "last", null);
        setField(term3860, term3860.getClass(), "propListHead", null);
        setIntField(term3860, term3860.getClass(), "sourcePosition", 0);
        setField(term3860, term3860.getClass(), "jsType", null);
        setField(term3860, term3860.getClass(), "parent", null);
        setField(term3858, term3858.getClass(), "next", term3860);
        setIntField(term3863, term3863.getClass(), "type", -159489307);
        setField(term3863, term3863.getClass(), "next", null);
        setField(term3863, term3863.getClass(), "first", null);
        setField(term3863, term3863.getClass(), "last", term3860);
        setField(term3863, term3863.getClass(), "propListHead", null);
        setIntField(term3863, term3863.getClass(), "sourcePosition", 0);
        setField(term3863, term3863.getClass(), "jsType", null);
        setField(term3863, term3863.getClass(), "parent", null);
        setField(term3858, term3858.getClass(), "first", term3863);
        setField(term3858, term3858.getClass(), "last", term3856);
        setField(term3858, term3858.getClass(), "propListHead", null);
        setIntField(term3858, term3858.getClass(), "sourcePosition", 0);
        setField(term3858, term3858.getClass(), "jsType", null);
        setField(term3858, term3858.getClass(), "parent", null);
        setField(term3856, term3856.getClass(), "next", term3858);
        setField(term3856, term3856.getClass(), "first", term3860);
        setIntField(term3867, term3867.getClass(), "type", -742710703);
        setIntField(term3869, term3869.getClass(), "type", -355505521);
        setField(term3869, term3869.getClass(), "next", null);
        setField(term3869, term3869.getClass(), "first", term3863);
        setField(term3869, term3869.getClass(), "last", term3858);
        setField(term3869, term3869.getClass(), "propListHead", null);
        setIntField(term3869, term3869.getClass(), "sourcePosition", 0);
        setField(term3869, term3869.getClass(), "jsType", null);
        setField(term3869, term3869.getClass(), "parent", null);
        setField(term3867, term3867.getClass(), "next", term3869);
        setField(term3867, term3867.getClass(), "first", term3854);
        setField(term3867, term3867.getClass(), "last", term3854);
        setField(term3867, term3867.getClass(), "propListHead", null);
        setIntField(term3867, term3867.getClass(), "sourcePosition", 0);
        setField(term3867, term3867.getClass(), "jsType", null);
        setField(term3867, term3867.getClass(), "parent", null);
        setField(term3856, term3856.getClass(), "last", term3867);
        setField(term3856, term3856.getClass(), "propListHead", null);
        setIntField(term3856, term3856.getClass(), "sourcePosition", 0);
        setField(term3856, term3856.getClass(), "jsType", null);
        setField(term3856, term3856.getClass(), "parent", null);
        setField(term3854, term3854.getClass(), "next", term3856);
        setIntField(term3874, term3874.getClass(), "type", 1227316523);
        setField(term3874, term3874.getClass(), "next", term3867);
        setField(term3874, term3874.getClass(), "first", term3869);
        setField(term3874, term3874.getClass(), "last", term3852);
        setField(term3874, term3874.getClass(), "propListHead", null);
        setIntField(term3874, term3874.getClass(), "sourcePosition", 0);
        setField(term3874, term3874.getClass(), "jsType", null);
        setField(term3874, term3874.getClass(), "parent", null);
        setField(term3854, term3854.getClass(), "first", term3874);
        setField(term3854, term3854.getClass(), "last", term3874);
        setField(term3854, term3854.getClass(), "propListHead", null);
        setIntField(term3854, term3854.getClass(), "sourcePosition", 0);
        setField(term3854, term3854.getClass(), "jsType", null);
        setField(term3854, term3854.getClass(), "parent", null);
        setField(term3852, term3852.getClass(), "next", term3854);
        setField(term3852, term3852.getClass(), "first", term3858);
        setField(term3852, term3852.getClass(), "last", term3860);
        setField(term3852, term3852.getClass(), "propListHead", null);
        setIntField(term3852, term3852.getClass(), "sourcePosition", 0);
        setField(term3852, term3852.getClass(), "jsType", null);
        setField(term3852, term3852.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "detachFromParent", argTypes, term3852, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


