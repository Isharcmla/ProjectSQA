package com.google.javascript.rhino.jstype;

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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ArrowType_visit_114067698825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term484;

    public ArrowType_visit_114067698825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term484 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term485, term485.getClass(), "type", 1141317871);
        setIntField(term487, term487.getClass(), "type", 890669485);
        setIntField(term489, term489.getClass(), "type", 691577392);
        setIntField(term491, term491.getClass(), "type", -893623680);
        setField(term491, term491.getClass(), "next", null);
        setField(term491, term491.getClass(), "first", null);
        setField(term491, term491.getClass(), "last", null);
        setField(term491, term491.getClass(), "propListHead", null);
        setIntField(term491, term491.getClass(), "sourcePosition", 0);
        setField(term491, term491.getClass(), "jsType", null);
        setField(term491, term491.getClass(), "parent", null);
        setField(term489, term489.getClass(), "next", term491);
        setIntField(term494, term494.getClass(), "type", 1386130016);
        setField(term494, term494.getClass(), "next", null);
        setField(term494, term494.getClass(), "first", term485);
        setField(term494, term494.getClass(), "last", null);
        setField(term494, term494.getClass(), "propListHead", null);
        setIntField(term494, term494.getClass(), "sourcePosition", 0);
        setField(term494, term494.getClass(), "jsType", null);
        setField(term494, term494.getClass(), "parent", null);
        setField(term489, term489.getClass(), "first", term494);
        setIntField(term497, term497.getClass(), "type", 906181092);
        setField(term497, term497.getClass(), "next", null);
        setField(term497, term497.getClass(), "first", term487);
        setField(term497, term497.getClass(), "last", null);
        setField(term497, term497.getClass(), "propListHead", null);
        setIntField(term497, term497.getClass(), "sourcePosition", 0);
        setField(term497, term497.getClass(), "jsType", null);
        setField(term497, term497.getClass(), "parent", null);
        setField(term489, term489.getClass(), "last", term497);
        setField(term489, term489.getClass(), "propListHead", null);
        setIntField(term489, term489.getClass(), "sourcePosition", 0);
        setField(term489, term489.getClass(), "jsType", null);
        setField(term489, term489.getClass(), "parent", null);
        setField(term487, term487.getClass(), "next", term489);
        setField(term487, term487.getClass(), "first", term489);
        setIntField(term501, term501.getClass(), "type", -1963434938);
        setField(term501, term501.getClass(), "next", term497);
        setField(term501, term501.getClass(), "first", term494);
        setField(term501, term501.getClass(), "last", term494);
        setField(term501, term501.getClass(), "propListHead", null);
        setIntField(term501, term501.getClass(), "sourcePosition", 0);
        setField(term501, term501.getClass(), "jsType", null);
        setField(term501, term501.getClass(), "parent", null);
        setField(term487, term487.getClass(), "last", term501);
        setField(term487, term487.getClass(), "propListHead", null);
        setIntField(term487, term487.getClass(), "sourcePosition", 0);
        setField(term487, term487.getClass(), "jsType", null);
        setField(term487, term487.getClass(), "parent", null);
        setField(term485, term485.getClass(), "next", term487);
        setField(term485, term485.getClass(), "first", term494);
        setIntField(term505, term505.getClass(), "type", 0);
        setField(term505, term505.getClass(), "next", null);
        setField(term505, term505.getClass(), "first", null);
        setField(term505, term505.getClass(), "last", null);
        setField(term505, term505.getClass(), "propListHead", null);
        setIntField(term505, term505.getClass(), "sourcePosition", 0);
        setField(term505, term505.getClass(), "jsType", null);
        setField(term505, term505.getClass(), "parent", null);
        setField(term485, term485.getClass(), "last", term505);
        setField(term485, term485.getClass(), "propListHead", null);
        setIntField(term485, term485.getClass(), "sourcePosition", 0);
        setField(term485, term485.getClass(), "jsType", null);
        setField(term485, term485.getClass(), "parent", null);
        setField(term484, term484.getClass(), "parameters", term485);
        setField(term484, term484.getClass(), "returnType", null);
        setBooleanField(term484, term484.getClass(), "returnTypeInferred", false);
        setBooleanField(term484, term484.getClass(), "resolved", false);
        setField(term484, term484.getClass(), "resolveResult", null);
        setBooleanField(term484, term484.getClass(), "inTemplatedCheckVisit", false);
        setField(term484, term484.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "visit", argTypes, term484, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


