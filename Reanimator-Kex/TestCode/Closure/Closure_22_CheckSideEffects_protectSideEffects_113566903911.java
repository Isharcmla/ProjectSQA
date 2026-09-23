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

public class CheckSideEffects_protectSideEffects_113566903911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1248;

    public CheckSideEffects_protectSideEffects_113566903911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5480 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term5479 = ((Class) term5480).getDeclaredField((String) "ERROR");
        ((Field) term5479).setAccessible(true);
        Object enum13 = ((Field) term5479).get((Object) null);
        Object term1260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1260, term1260.getClass(), "type", 941650513);
        setIntField(term1262, term1262.getClass(), "type", 444029505);
        setField(term1262, term1262.getClass(), "next", null);
        setField(term1262, term1262.getClass(), "first", null);
        setField(term1262, term1262.getClass(), "last", null);
        setField(term1262, term1262.getClass(), "propListHead", null);
        setIntField(term1262, term1262.getClass(), "sourcePosition", 0);
        setField(term1262, term1262.getClass(), "jsType", null);
        setField(term1262, term1262.getClass(), "parent", null);
        setField(term1260, term1260.getClass(), "next", term1262);
        setIntField(term1265, term1265.getClass(), "type", -1888585309);
        setField(term1265, term1265.getClass(), "next", null);
        setField(term1265, term1265.getClass(), "first", term1260);
        setField(term1265, term1265.getClass(), "last", null);
        setField(term1265, term1265.getClass(), "propListHead", null);
        setIntField(term1265, term1265.getClass(), "sourcePosition", 0);
        setField(term1265, term1265.getClass(), "jsType", null);
        setField(term1265, term1265.getClass(), "parent", null);
        setField(term1260, term1260.getClass(), "first", term1265);
        setIntField(term1268, term1268.getClass(), "type", 0);
        setField(term1268, term1268.getClass(), "next", null);
        setField(term1268, term1268.getClass(), "first", null);
        setField(term1268, term1268.getClass(), "last", null);
        setField(term1268, term1268.getClass(), "propListHead", null);
        setIntField(term1268, term1268.getClass(), "sourcePosition", 0);
        setField(term1268, term1268.getClass(), "jsType", null);
        setField(term1268, term1268.getClass(), "parent", null);
        setField(term1260, term1260.getClass(), "last", term1268);
        setField(term1260, term1260.getClass(), "propListHead", null);
        setIntField(term1260, term1260.getClass(), "sourcePosition", 0);
        setField(term1260, term1260.getClass(), "jsType", null);
        setField(term1260, term1260.getClass(), "parent", null);
        ArrayList term1258 = new ArrayList();
        ((ArrayList) term1258).add(term1260);
        ((ArrayList) term1258).add(term1268);
        term1248 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term1248, term1248.getClass(), "level", enum13);
        setField(term1248, term1248.getClass(), "problemNodes", term1258);
        setField(term1248, term1248.getClass(), "compiler", null);
        setBooleanField(term1248, term1248.getClass(), "protectSideEffectFreeCode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "protectSideEffects", argTypes, term1248, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


