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

public class NameAnalyzer_valueConsumedByParent_119684146191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21151;
     Object term21243;
     Object term21254;
     Object term21255;

    public NameAnalyzer_valueConsumedByParent_119684146191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21151 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        term21243 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term21254 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term21254, term21254.getClass(), "compiler", null);
        setField(term21254, term21254.getClass(), "allNames", null);
        setField(term21254, term21254.getClass(), "referenceGraph", null);
        setField(term21254, term21254.getClass(), "scopes", null);
        setBooleanField(term21254, term21254.getClass(), "removeUnreferenced", false);
        setField(term21254, term21254.getClass(), "globalNames", null);
        setField(term21254, term21254.getClass(), "changeProxy", null);
        setField(term21254, term21254.getClass(), "externalNames", null);
        setField(term21254, term21254.getClass(), "refNodes", null);
        setField(term21254, term21254.getClass(), "aliases", null);
        term21255 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term21255, term21255.getClass(), "str", null);
        setIntField(term21255, term21255.getClass(), "type", 0);
        setField(term21255, term21255.getClass(), "next", null);
        setField(term21255, term21255.getClass(), "first", null);
        setField(term21255, term21255.getClass(), "last", null);
        setField(term21255, term21255.getClass(), "propListHead", null);
        setIntField(term21255, term21255.getClass(), "sourcePosition", 0);
        setField(term21255, term21255.getClass(), "jsType", null);
        setField(term21255, term21255.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term21243;
        Object retValue = callMethod(klass, "valueConsumedByParent", argTypes, term21151, args);
        assertTrue(recursiveEquals(term21151, term21254));
        assertTrue(recursiveEquals(term21243, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


