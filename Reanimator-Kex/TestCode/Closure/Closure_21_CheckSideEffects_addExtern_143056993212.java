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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class CheckSideEffects_addExtern_143056993212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1492;

    public CheckSideEffects_addExtern_143056993212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6567 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term6566 = ((Class) term6567).getDeclaredField((String) "WARNING");
        ((Field) term6566).setAccessible(true);
        Object enum14 = ((Field) term6566).get((Object) null);
        Object term1506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1506, term1506.getClass(), "type", 1596213415);
        setIntField(term1508, term1508.getClass(), "type", -268815336);
        setField(term1508, term1508.getClass(), "next", null);
        setField(term1508, term1508.getClass(), "first", null);
        setField(term1508, term1508.getClass(), "last", null);
        setField(term1508, term1508.getClass(), "propListHead", null);
        setIntField(term1508, term1508.getClass(), "sourcePosition", 0);
        setField(term1508, term1508.getClass(), "jsType", null);
        setField(term1508, term1508.getClass(), "parent", null);
        setField(term1506, term1506.getClass(), "next", term1508);
        setIntField(term1511, term1511.getClass(), "type", -341962980);
        setField(term1511, term1511.getClass(), "next", null);
        setField(term1511, term1511.getClass(), "first", term1506);
        setField(term1511, term1511.getClass(), "last", null);
        setField(term1511, term1511.getClass(), "propListHead", null);
        setIntField(term1511, term1511.getClass(), "sourcePosition", 0);
        setField(term1511, term1511.getClass(), "jsType", null);
        setField(term1511, term1511.getClass(), "parent", null);
        setField(term1506, term1506.getClass(), "first", term1511);
        setIntField(term1514, term1514.getClass(), "type", 0);
        setField(term1514, term1514.getClass(), "next", null);
        setField(term1514, term1514.getClass(), "first", null);
        setField(term1514, term1514.getClass(), "last", null);
        setField(term1514, term1514.getClass(), "propListHead", null);
        setIntField(term1514, term1514.getClass(), "sourcePosition", 0);
        setField(term1514, term1514.getClass(), "jsType", null);
        setField(term1514, term1514.getClass(), "parent", null);
        setField(term1506, term1506.getClass(), "last", term1514);
        setField(term1506, term1506.getClass(), "propListHead", null);
        setIntField(term1506, term1506.getClass(), "sourcePosition", 0);
        setField(term1506, term1506.getClass(), "jsType", null);
        setField(term1506, term1506.getClass(), "parent", null);
        Object term1518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1518, term1518.getClass(), "type", -663691365);
        setIntField(term1520, term1520.getClass(), "type", 339854490);
        setField(term1520, term1520.getClass(), "next", null);
        setField(term1520, term1520.getClass(), "first", term1511);
        setField(term1520, term1520.getClass(), "last", term1511);
        setField(term1520, term1520.getClass(), "propListHead", null);
        setIntField(term1520, term1520.getClass(), "sourcePosition", 0);
        setField(term1520, term1520.getClass(), "jsType", null);
        setField(term1520, term1520.getClass(), "parent", null);
        setField(term1518, term1518.getClass(), "next", term1520);
        setField(term1518, term1518.getClass(), "first", term1520);
        setField(term1518, term1518.getClass(), "last", term1514);
        setField(term1518, term1518.getClass(), "propListHead", null);
        setIntField(term1518, term1518.getClass(), "sourcePosition", 0);
        setField(term1518, term1518.getClass(), "jsType", null);
        setField(term1518, term1518.getClass(), "parent", null);
        ArrayList term1504 = new ArrayList();
        ((ArrayList) term1504).add(term1506);
        ((ArrayList) term1504).add(term1514);
        ((ArrayList) term1504).add(term1518);
        ((ArrayList) term1504).add(term1520);
        ((ArrayList) term1504).add(term1520);
        ((ArrayList) term1504).add(term1508);
        term1492 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term1492, term1492.getClass(), "level", enum14);
        setField(term1492, term1492.getClass(), "problemNodes", term1504);
        setField(term1492, term1492.getClass(), "compiler", null);
        setBooleanField(term1492, term1492.getClass(), "protectSideEffectFreeCode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "addExtern", argTypes, term1492, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


