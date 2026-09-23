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

public class NameAnalyzer_createNameInformation_197965210041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1789;

    public NameAnalyzer_createNameInformation_197965210041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1789 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term1789, term1789.getClass(), "compiler", null);
        setField(term1789, term1789.getClass(), "allNames", null);
        setField(term1789, term1789.getClass(), "referenceGraph", null);
        setField(term1789, term1789.getClass(), "scopes", null);
        setBooleanField(term1789, term1789.getClass(), "removeUnreferenced", false);
        setField(term1789, term1789.getClass(), "globalNames", null);
        setField(term1789, term1789.getClass(), "changeProxy", null);
        setField(term1789, term1789.getClass(), "externalNames", null);
        setField(term1789, term1789.getClass(), "refNodes", null);
        setField(term1789, term1789.getClass(), "aliases", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "createNameInformation", argTypes, term1789, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


