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
import java.util.ArrayList;

public class NameAnalyzer_getSideEffectNodes_100661409398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30658;
     Object term30728;
     Object term31604;
     Object term31605;
     Object term31598;

    public NameAnalyzer_getSideEffectNodes_100661409398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30658 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term30658, term30658.getClass(), "compiler", null);
        term30728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30728, term30728.getClass(), "type", 1045547089);
        setField(term30728, term30728.getClass(), "parent", null);
        setField(term30868, term30868.getClass(), "next", null);
        setIntField(term30868, term30868.getClass(), "type", -1111249833);
        setField(term30868, term30868.getClass(), "first", null);
        setField(term30798, term30798.getClass(), "next", term30868);
        setIntField(term30798, term30798.getClass(), "type", -1254072822);
        setField(term30938, term30938.getClass(), "next", null);
        setIntField(term30938, term30938.getClass(), "type", -1692331299);
        setField(term30938, term30938.getClass(), "first", null);
        setField(term30798, term30798.getClass(), "first", term30938);
        setField(term30728, term30728.getClass(), "first", term30798);
        term31604 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term31604, term31604.getClass(), "compiler", null);
        setField(term31604, term31604.getClass(), "allNames", null);
        setField(term31604, term31604.getClass(), "referenceGraph", null);
        setField(term31604, term31604.getClass(), "scopes", null);
        setBooleanField(term31604, term31604.getClass(), "removeUnreferenced", false);
        setField(term31604, term31604.getClass(), "globalNames", null);
        setField(term31604, term31604.getClass(), "changeProxy", null);
        setField(term31604, term31604.getClass(), "externalNames", null);
        setField(term31604, term31604.getClass(), "refNodes", null);
        setField(term31604, term31604.getClass(), "aliases", null);
        term31605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31605, term31605.getClass(), "type", 1045547089);
        setField(term31605, term31605.getClass(), "next", null);
        setIntField(term31606, term31606.getClass(), "type", -1254072822);
        setIntField(term31607, term31607.getClass(), "type", -1111249833);
        setField(term31607, term31607.getClass(), "next", null);
        setField(term31607, term31607.getClass(), "first", null);
        setField(term31607, term31607.getClass(), "last", null);
        setField(term31607, term31607.getClass(), "propListHead", null);
        setIntField(term31607, term31607.getClass(), "sourcePosition", 0);
        setField(term31607, term31607.getClass(), "jsType", null);
        setField(term31607, term31607.getClass(), "parent", null);
        setField(term31606, term31606.getClass(), "next", term31607);
        setIntField(term31608, term31608.getClass(), "type", -1692331299);
        setField(term31608, term31608.getClass(), "next", null);
        setField(term31608, term31608.getClass(), "first", null);
        setField(term31608, term31608.getClass(), "last", null);
        setField(term31608, term31608.getClass(), "propListHead", null);
        setIntField(term31608, term31608.getClass(), "sourcePosition", 0);
        setField(term31608, term31608.getClass(), "jsType", null);
        setField(term31608, term31608.getClass(), "parent", null);
        setField(term31606, term31606.getClass(), "first", term31608);
        setField(term31606, term31606.getClass(), "last", null);
        setField(term31606, term31606.getClass(), "propListHead", null);
        setIntField(term31606, term31606.getClass(), "sourcePosition", 0);
        setField(term31606, term31606.getClass(), "jsType", null);
        setField(term31606, term31606.getClass(), "parent", null);
        setField(term31605, term31605.getClass(), "first", term31606);
        setField(term31605, term31605.getClass(), "last", null);
        setField(term31605, term31605.getClass(), "propListHead", null);
        setIntField(term31605, term31605.getClass(), "sourcePosition", 0);
        setField(term31605, term31605.getClass(), "jsType", null);
        setField(term31605, term31605.getClass(), "parent", null);
        term31598 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term30728;
        Object retValue = callMethod(klass, "getSideEffectNodes", argTypes, term30658, args);
        assertTrue(recursiveEquals(term30658, term31604));
        assertTrue(recursiveEquals(term30728, term31605));
        assertTrue(recursiveEquals(retValue, term31598));
    }

};


