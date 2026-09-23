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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145600;
     Object term145670;
     Object term146099;
     Object term146100;
     Object term146080;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145600 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term145670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term145670, term145670.getClass(), "first", term145670);
        setField(term145670, term145670.getClass(), "next", term145670);
        setIntField(term145670, term145670.getClass(), "type", 11);
        term146099 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term146099, term146099.getClass(), "currentTraversal", null);
        term146100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term146100, term146100.getClass(), "type", 11);
        setField(term146100, term146100.getClass(), "next", term146100);
        setField(term146100, term146100.getClass(), "first", term146100);
        setField(term146100, term146100.getClass(), "last", null);
        setField(term146100, term146100.getClass(), "propListHead", null);
        setIntField(term146100, term146100.getClass(), "sourcePosition", 0);
        setField(term146100, term146100.getClass(), "jsType", null);
        setField(term146100, term146100.getClass(), "parent", null);
        term146080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term146080, term146080.getClass(), "type", 11);
        setField(term146080, term146080.getClass(), "next", term146080);
        setField(term146080, term146080.getClass(), "first", term146080);
        setField(term146080, term146080.getClass(), "last", null);
        setField(term146080, term146080.getClass(), "propListHead", null);
        setIntField(term146080, term146080.getClass(), "sourcePosition", 0);
        setField(term146080, term146080.getClass(), "jsType", null);
        setField(term146080, term146080.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term145670;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term145600, args);
        assertTrue(recursiveEquals(term145600, term146099));
        assertTrue(recursiveEquals(term145670, term146100));
        assertTrue(recursiveEquals(retValue, term146080));
    }

};


