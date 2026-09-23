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
     Object term6327;

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
        term6327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6327, term6327.getClass(), "type", 890669485);
        setIntField(term6328, term6328.getClass(), "type", 906181092);
        setIntField(term6329, term6329.getClass(), "type", 0);
        setField(term6329, term6329.getClass(), "next", null);
        setField(term6329, term6329.getClass(), "first", null);
        setField(term6329, term6329.getClass(), "last", null);
        setField(term6329, term6329.getClass(), "propListHead", null);
        setIntField(term6329, term6329.getClass(), "sourcePosition", 0);
        setField(term6329, term6329.getClass(), "jsType", null);
        setField(term6329, term6329.getClass(), "parent", null);
        setField(term6328, term6328.getClass(), "next", term6329);
        setIntField(term6330, term6330.getClass(), "type", 0);
        setField(term6330, term6330.getClass(), "next", null);
        setField(term6330, term6330.getClass(), "first", null);
        setField(term6330, term6330.getClass(), "last", null);
        setField(term6330, term6330.getClass(), "propListHead", null);
        setIntField(term6330, term6330.getClass(), "sourcePosition", 0);
        setField(term6330, term6330.getClass(), "jsType", null);
        setField(term6330, term6330.getClass(), "parent", null);
        setField(term6328, term6328.getClass(), "first", term6330);
        setIntField(term6331, term6331.getClass(), "type", 0);
        setField(term6331, term6331.getClass(), "next", null);
        setField(term6331, term6331.getClass(), "first", null);
        setField(term6331, term6331.getClass(), "last", null);
        setField(term6331, term6331.getClass(), "propListHead", null);
        setIntField(term6331, term6331.getClass(), "sourcePosition", 0);
        setField(term6331, term6331.getClass(), "jsType", null);
        setField(term6331, term6331.getClass(), "parent", null);
        setField(term6328, term6328.getClass(), "last", term6331);
        setField(term6328, term6328.getClass(), "propListHead", null);
        setIntField(term6328, term6328.getClass(), "sourcePosition", 0);
        setField(term6328, term6328.getClass(), "jsType", null);
        setField(term6328, term6328.getClass(), "parent", null);
        setField(term6327, term6327.getClass(), "next", term6328);
        setIntField(term6332, term6332.getClass(), "type", 0);
        setField(term6332, term6332.getClass(), "next", null);
        setField(term6332, term6332.getClass(), "first", null);
        setField(term6332, term6332.getClass(), "last", null);
        setField(term6332, term6332.getClass(), "propListHead", null);
        setIntField(term6332, term6332.getClass(), "sourcePosition", 0);
        setField(term6332, term6332.getClass(), "jsType", null);
        setField(term6332, term6332.getClass(), "parent", null);
        setField(term6327, term6327.getClass(), "first", term6332);
        setIntField(term6333, term6333.getClass(), "type", 0);
        setField(term6333, term6333.getClass(), "next", null);
        setField(term6333, term6333.getClass(), "first", null);
        setField(term6333, term6333.getClass(), "last", null);
        setField(term6333, term6333.getClass(), "propListHead", null);
        setIntField(term6333, term6333.getClass(), "sourcePosition", 0);
        setField(term6333, term6333.getClass(), "jsType", null);
        setField(term6333, term6333.getClass(), "parent", null);
        setField(term6327, term6327.getClass(), "last", term6333);
        setField(term6327, term6327.getClass(), "propListHead", null);
        setIntField(term6327, term6327.getClass(), "sourcePosition", 0);
        setField(term6327, term6327.getClass(), "jsType", null);
        setField(term6327, term6327.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term306;
        Object retValue = callMethod(klass, "isEmptyBlock", argTypes, null, args);
        assertTrue(recursiveEquals(term306, term6327));
        assertTrue(recursiveEquals(retValue, false));
    }

};


