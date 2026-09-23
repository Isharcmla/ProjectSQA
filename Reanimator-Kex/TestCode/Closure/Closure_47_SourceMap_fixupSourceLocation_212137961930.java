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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class SourceMap_fixupSourceLocation_212137961930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4141;
     Object term6519;

    public SourceMap_fixupSourceLocation_212137961930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4307 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term4307, term4307.getClass(), "prefix", "\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004");
        ArrayList term4193 = new ArrayList();
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        ((ArrayList) term4193).add(term4307);
        HashMap term4393 = new HashMap();
        ((HashMap) term4393).put(term4307, term4307);
        ((HashMap) term4393).put(term4307, term4307);
        term4141 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        setField(term4141, term4141.getClass(), "prefixMappings", term4193);
        setField(term4141, term4141.getClass(), "sourceLocationFixupCache", term4393);
        Object term6522 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term6522, term6522.getClass(), "prefix", "");
        setField(term6522, term6522.getClass(), "replacement", null);
        ArrayList term6520 = new ArrayList();
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        ((ArrayList) term6520).add(term6522);
        HashMap term6524 = new HashMap();
        term6519 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        setField(term6519, term6519.getClass(), "generator", null);
        setField(term6519, term6519.getClass(), "prefixMappings", term6520);
        setField(term6519, term6519.getClass(), "sourceLocationFixupCache", term6524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                ";
        Object retValue = callMethod(klass, "fixupSourceLocation", argTypes, term4141, args);
        assertTrue(recursiveEquals(term4141, term6519));
        assertTrue(recursiveEquals(retValue, "                                                "));
    }

};


