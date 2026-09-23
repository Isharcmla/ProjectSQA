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
import java.lang.Object;

public class NodeUtil_isEmptyBlock_2055709421170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306;
     Object term6352;

    public NodeUtil_isEmptyBlock_2055709421170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term306, term306.getClass(), "type", 890669485);
        setIntField(term308, term308.getClass(), "type", 906181092);
        setIntField(term310, term310.getClass(), "type", 0);
        setField(term310, term310.getClass(), "next", null);
        setField(term310, term310.getClass(), "first", null);
        setField(term310, term310.getClass(), "last", null);
        setField(term310, term310.getClass(), "propListHead", null);
        setIntField(term310, term310.getClass(), "sourcePosition", 0);
        setField(term310, term310.getClass(), "jsType", null);
        setField(term310, term310.getClass(), "parent", null);
        setField(term308, term308.getClass(), "next", term310);
        setIntField(term313, term313.getClass(), "type", 0);
        setField(term313, term313.getClass(), "next", null);
        setField(term313, term313.getClass(), "first", null);
        setField(term313, term313.getClass(), "last", null);
        setField(term313, term313.getClass(), "propListHead", null);
        setIntField(term313, term313.getClass(), "sourcePosition", 0);
        setField(term313, term313.getClass(), "jsType", null);
        setField(term313, term313.getClass(), "parent", null);
        setField(term308, term308.getClass(), "first", term313);
        setIntField(term316, term316.getClass(), "type", 0);
        setField(term316, term316.getClass(), "next", null);
        setField(term316, term316.getClass(), "first", null);
        setField(term316, term316.getClass(), "last", null);
        setField(term316, term316.getClass(), "propListHead", null);
        setIntField(term316, term316.getClass(), "sourcePosition", 0);
        setField(term316, term316.getClass(), "jsType", null);
        setField(term316, term316.getClass(), "parent", null);
        setField(term308, term308.getClass(), "last", term316);
        setField(term308, term308.getClass(), "propListHead", null);
        setIntField(term308, term308.getClass(), "sourcePosition", 0);
        setField(term308, term308.getClass(), "jsType", null);
        setField(term308, term308.getClass(), "parent", null);
        setField(term306, term306.getClass(), "next", term308);
        setIntField(term320, term320.getClass(), "type", 0);
        setField(term320, term320.getClass(), "next", null);
        setField(term320, term320.getClass(), "first", null);
        setField(term320, term320.getClass(), "last", null);
        setField(term320, term320.getClass(), "propListHead", null);
        setIntField(term320, term320.getClass(), "sourcePosition", 0);
        setField(term320, term320.getClass(), "jsType", null);
        setField(term320, term320.getClass(), "parent", null);
        setField(term306, term306.getClass(), "first", term320);
        setIntField(term323, term323.getClass(), "type", 0);
        setField(term323, term323.getClass(), "next", null);
        setField(term323, term323.getClass(), "first", null);
        setField(term323, term323.getClass(), "last", null);
        setField(term323, term323.getClass(), "propListHead", null);
        setIntField(term323, term323.getClass(), "sourcePosition", 0);
        setField(term323, term323.getClass(), "jsType", null);
        setField(term323, term323.getClass(), "parent", null);
        setField(term306, term306.getClass(), "last", term323);
        setField(term306, term306.getClass(), "propListHead", null);
        setIntField(term306, term306.getClass(), "sourcePosition", 0);
        setField(term306, term306.getClass(), "jsType", null);
        setField(term306, term306.getClass(), "parent", null);
        term6352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6352, term6352.getClass(), "type", 890669485);
        setIntField(term6353, term6353.getClass(), "type", 906181092);
        setIntField(term6354, term6354.getClass(), "type", 0);
        setField(term6354, term6354.getClass(), "next", null);
        setField(term6354, term6354.getClass(), "first", null);
        setField(term6354, term6354.getClass(), "last", null);
        setField(term6354, term6354.getClass(), "propListHead", null);
        setIntField(term6354, term6354.getClass(), "sourcePosition", 0);
        setField(term6354, term6354.getClass(), "jsType", null);
        setField(term6354, term6354.getClass(), "parent", null);
        setField(term6353, term6353.getClass(), "next", term6354);
        setIntField(term6355, term6355.getClass(), "type", 0);
        setField(term6355, term6355.getClass(), "next", null);
        setField(term6355, term6355.getClass(), "first", null);
        setField(term6355, term6355.getClass(), "last", null);
        setField(term6355, term6355.getClass(), "propListHead", null);
        setIntField(term6355, term6355.getClass(), "sourcePosition", 0);
        setField(term6355, term6355.getClass(), "jsType", null);
        setField(term6355, term6355.getClass(), "parent", null);
        setField(term6353, term6353.getClass(), "first", term6355);
        setIntField(term6356, term6356.getClass(), "type", 0);
        setField(term6356, term6356.getClass(), "next", null);
        setField(term6356, term6356.getClass(), "first", null);
        setField(term6356, term6356.getClass(), "last", null);
        setField(term6356, term6356.getClass(), "propListHead", null);
        setIntField(term6356, term6356.getClass(), "sourcePosition", 0);
        setField(term6356, term6356.getClass(), "jsType", null);
        setField(term6356, term6356.getClass(), "parent", null);
        setField(term6353, term6353.getClass(), "last", term6356);
        setField(term6353, term6353.getClass(), "propListHead", null);
        setIntField(term6353, term6353.getClass(), "sourcePosition", 0);
        setField(term6353, term6353.getClass(), "jsType", null);
        setField(term6353, term6353.getClass(), "parent", null);
        setField(term6352, term6352.getClass(), "next", term6353);
        setIntField(term6357, term6357.getClass(), "type", 0);
        setField(term6357, term6357.getClass(), "next", null);
        setField(term6357, term6357.getClass(), "first", null);
        setField(term6357, term6357.getClass(), "last", null);
        setField(term6357, term6357.getClass(), "propListHead", null);
        setIntField(term6357, term6357.getClass(), "sourcePosition", 0);
        setField(term6357, term6357.getClass(), "jsType", null);
        setField(term6357, term6357.getClass(), "parent", null);
        setField(term6352, term6352.getClass(), "first", term6357);
        setIntField(term6358, term6358.getClass(), "type", 0);
        setField(term6358, term6358.getClass(), "next", null);
        setField(term6358, term6358.getClass(), "first", null);
        setField(term6358, term6358.getClass(), "last", null);
        setField(term6358, term6358.getClass(), "propListHead", null);
        setIntField(term6358, term6358.getClass(), "sourcePosition", 0);
        setField(term6358, term6358.getClass(), "jsType", null);
        setField(term6358, term6358.getClass(), "parent", null);
        setField(term6352, term6352.getClass(), "last", term6358);
        setField(term6352, term6352.getClass(), "propListHead", null);
        setIntField(term6352, term6352.getClass(), "sourcePosition", 0);
        setField(term6352, term6352.getClass(), "jsType", null);
        setField(term6352, term6352.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term306;
        Object retValue = callMethod(klass, "isEmptyBlock", argTypes, null, args);
        assertTrue(recursiveEquals(term306, term6352));
        assertTrue(recursiveEquals(retValue, false));
    }

};


