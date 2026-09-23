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

public class NameAnalyzer_recordReference_175844602682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18922;
     Object term19424;

    public NameAnalyzer_recordReference_175844602682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18922 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        term19424 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term19424, term19424.getClass(), "compiler", null);
        setField(term19424, term19424.getClass(), "allNames", null);
        setField(term19424, term19424.getClass(), "referenceGraph", null);
        setField(term19424, term19424.getClass(), "scopes", null);
        setBooleanField(term19424, term19424.getClass(), "removeUnreferenced", false);
        setField(term19424, term19424.getClass(), "globalNames", null);
        setField(term19424, term19424.getClass(), "changeProxy", null);
        setField(term19424, term19424.getClass(), "externalNames", null);
        setField(term19424, term19424.getClass(), "refNodes", null);
        setField(term19424, term19424.getClass(), "aliases", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.NameAnalyzer$RefType");
        Object[] args = new Object[3];
        args[0] = "";
        args[1] = "";
        args[2] = null;
        callMethod(klass, "recordReference", argTypes, term18922, args);
        assertTrue(recursiveEquals(term18922, term19424));
    }

};


