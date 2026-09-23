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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24706;
     Object term24776;
     Object term24801;
     Object term24802;
     Object term24780;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24706 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term24776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term24776, term24776.getClass(), "first", term24776);
        setField(term24776, term24776.getClass(), "next", term24776);
        setIntField(term24776, term24776.getClass(), "type", 9);
        term24801 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term24801, term24801.getClass(), "currentTraversal", null);
        term24802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24802, term24802.getClass(), "type", 9);
        setField(term24802, term24802.getClass(), "next", term24802);
        setField(term24802, term24802.getClass(), "first", term24802);
        setField(term24802, term24802.getClass(), "last", null);
        setField(term24802, term24802.getClass(), "propListHead", null);
        setIntField(term24802, term24802.getClass(), "sourcePosition", 0);
        setField(term24802, term24802.getClass(), "jsType", null);
        setField(term24802, term24802.getClass(), "parent", null);
        term24780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24780, term24780.getClass(), "type", 9);
        setField(term24780, term24780.getClass(), "next", term24780);
        setField(term24780, term24780.getClass(), "first", term24780);
        setField(term24780, term24780.getClass(), "last", null);
        setField(term24780, term24780.getClass(), "propListHead", null);
        setIntField(term24780, term24780.getClass(), "sourcePosition", 0);
        setField(term24780, term24780.getClass(), "jsType", null);
        setField(term24780, term24780.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term24776;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term24706, args);
        assertTrue(recursiveEquals(term24706, term24801));
        assertTrue(recursiveEquals(term24776, term24802));
        assertTrue(recursiveEquals(retValue, term24780));
    }

};


