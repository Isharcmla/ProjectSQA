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
     Object term24853;
     Object term24945;
     Object term28766;
     Object term28767;

    public NameAnalyzer_valueConsumedByParent_119684146191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24853 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        term24945 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term28766 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term28766, term28766.getClass(), "compiler", null);
        setField(term28766, term28766.getClass(), "allNames", null);
        setField(term28766, term28766.getClass(), "referenceGraph", null);
        setField(term28766, term28766.getClass(), "scopes", null);
        setBooleanField(term28766, term28766.getClass(), "removeUnreferenced", false);
        setField(term28766, term28766.getClass(), "globalNames", null);
        setField(term28766, term28766.getClass(), "changeProxy", null);
        setField(term28766, term28766.getClass(), "externalNames", null);
        setField(term28766, term28766.getClass(), "refNodes", null);
        setField(term28766, term28766.getClass(), "aliases", null);
        term28767 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term28767, term28767.getClass(), "str", null);
        setIntField(term28767, term28767.getClass(), "type", 0);
        setField(term28767, term28767.getClass(), "next", null);
        setField(term28767, term28767.getClass(), "first", null);
        setField(term28767, term28767.getClass(), "last", null);
        setField(term28767, term28767.getClass(), "propListHead", null);
        setIntField(term28767, term28767.getClass(), "sourcePosition", 0);
        setField(term28767, term28767.getClass(), "jsType", null);
        setField(term28767, term28767.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term24945;
        Object retValue = callMethod(klass, "valueConsumedByParent", argTypes, term24853, args);
        assertTrue(recursiveEquals(term24853, term28766));
        assertTrue(recursiveEquals(term24945, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


