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

public class NameAnalyzer_valueConsumedByParent_119684146157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17078;
     Object term17170;
     Object term17546;
     Object term17547;

    public NameAnalyzer_valueConsumedByParent_119684146157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17078 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        term17170 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term17546 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term17546, term17546.getClass(), "compiler", null);
        setField(term17546, term17546.getClass(), "allNames", null);
        setField(term17546, term17546.getClass(), "referenceGraph", null);
        setField(term17546, term17546.getClass(), "scopes", null);
        setBooleanField(term17546, term17546.getClass(), "removeUnreferenced", false);
        setField(term17546, term17546.getClass(), "globalNames", null);
        setField(term17546, term17546.getClass(), "changeProxy", null);
        setField(term17546, term17546.getClass(), "externalNames", null);
        setField(term17546, term17546.getClass(), "refNodes", null);
        setField(term17546, term17546.getClass(), "aliases", null);
        term17547 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term17547, term17547.getClass(), "number", 0.0);
        setIntField(term17547, term17547.getClass(), "type", 0);
        setField(term17547, term17547.getClass(), "next", null);
        setField(term17547, term17547.getClass(), "first", null);
        setField(term17547, term17547.getClass(), "last", null);
        setField(term17547, term17547.getClass(), "propListHead", null);
        setIntField(term17547, term17547.getClass(), "sourcePosition", 0);
        setField(term17547, term17547.getClass(), "jsType", null);
        setField(term17547, term17547.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term17170;
        Object retValue = callMethod(klass, "valueConsumedByParent", argTypes, term17078, args);
        assertTrue(recursiveEquals(term17078, term17546));
        assertTrue(recursiveEquals(term17170, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


