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
import java.util.HashMap;

public class NameAnalyzer_recordAlias_126809846895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21609;
     Object term21780;

    public NameAnalyzer_recordAlias_126809846895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term21657 = new HashMap();
        term21609 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term21609, term21609.getClass(), "aliases", term21657);
        HashMap term21781 = new HashMap();
        term21780 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term21780, term21780.getClass(), "compiler", null);
        setField(term21780, term21780.getClass(), "allNames", null);
        setField(term21780, term21780.getClass(), "referenceGraph", null);
        setField(term21780, term21780.getClass(), "scopes", null);
        setBooleanField(term21780, term21780.getClass(), "removeUnreferenced", false);
        setField(term21780, term21780.getClass(), "globalNames", null);
        setField(term21780, term21780.getClass(), "changeProxy", null);
        setField(term21780, term21780.getClass(), "externalNames", null);
        setField(term21780, term21780.getClass(), "refNodes", null);
        setField(term21780, term21780.getClass(), "aliases", term21781);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = "";
        callMethod(klass, "recordAlias", argTypes, term21609, args);
        assertTrue(recursiveEquals(term21609, term21780));
    }

};


