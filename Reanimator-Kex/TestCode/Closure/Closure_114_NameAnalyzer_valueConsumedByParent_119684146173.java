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

public class NameAnalyzer_valueConsumedByParent_119684146173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17905;
     Object term17997;
     Object term18009;
     Object term18010;

    public NameAnalyzer_valueConsumedByParent_119684146173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17905 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        term17997 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term18009 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term18009, term18009.getClass(), "compiler", null);
        setField(term18009, term18009.getClass(), "allNames", null);
        setField(term18009, term18009.getClass(), "referenceGraph", null);
        setField(term18009, term18009.getClass(), "scopes", null);
        setBooleanField(term18009, term18009.getClass(), "removeUnreferenced", false);
        setField(term18009, term18009.getClass(), "globalNames", null);
        setField(term18009, term18009.getClass(), "changeProxy", null);
        setField(term18009, term18009.getClass(), "externalNames", null);
        setField(term18009, term18009.getClass(), "refNodes", null);
        setField(term18009, term18009.getClass(), "aliases", null);
        term18010 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term18010, term18010.getClass(), "number", 0.0);
        setIntField(term18010, term18010.getClass(), "type", 0);
        setField(term18010, term18010.getClass(), "next", null);
        setField(term18010, term18010.getClass(), "first", null);
        setField(term18010, term18010.getClass(), "last", null);
        setField(term18010, term18010.getClass(), "propListHead", null);
        setIntField(term18010, term18010.getClass(), "sourcePosition", 0);
        setField(term18010, term18010.getClass(), "jsType", null);
        setField(term18010, term18010.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term17997;
        Object retValue = callMethod(klass, "valueConsumedByParent", argTypes, term17905, args);
        assertTrue(recursiveEquals(term17905, term18009));
        assertTrue(recursiveEquals(term17997, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


