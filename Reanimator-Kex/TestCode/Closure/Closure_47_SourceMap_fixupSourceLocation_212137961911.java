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

public class SourceMap_fixupSourceLocation_212137961911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64;
     Object term488;

    public SourceMap_fixupSourceLocation_212137961911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term67 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term67, term67.getClass(), "prefix", "");
        setField(term67, term67.getClass(), "replacement", "");
        Object term70 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term70, term70.getClass(), "prefix", "");
        setField(term70, term70.getClass(), "replacement", "");
        Object term73 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term73, term73.getClass(), "prefix", "");
        setField(term73, term73.getClass(), "replacement", "");
        Object term76 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term76, term76.getClass(), "prefix", "");
        setField(term76, term76.getClass(), "replacement", "");
        ArrayList term65 = new ArrayList();
        ((ArrayList) term65).add(term67);
        ((ArrayList) term65).add(term70);
        ((ArrayList) term65).add(term73);
        ((ArrayList) term65).add(term76);
        HashMap term81 = new HashMap();
        term64 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        setField(term64, term64.getClass(), "generator", null);
        setField(term64, term64.getClass(), "prefixMappings", term65);
        setField(term64, term64.getClass(), "sourceLocationFixupCache", term81);
        Object term491 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term491, term491.getClass(), "prefix", "");
        setField(term491, term491.getClass(), "replacement", "");
        Object term494 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term494, term494.getClass(), "prefix", "");
        setField(term494, term494.getClass(), "replacement", "");
        Object term497 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term497, term497.getClass(), "prefix", "");
        setField(term497, term497.getClass(), "replacement", "");
        Object term500 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term500, term500.getClass(), "prefix", "");
        setField(term500, term500.getClass(), "replacement", "");
        ArrayList term489 = new ArrayList();
        ((ArrayList) term489).add(term491);
        ((ArrayList) term489).add(term494);
        ((ArrayList) term489).add(term497);
        ((ArrayList) term489).add(term500);
        HashMap term503 = new HashMap();
        term488 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        setField(term488, term488.getClass(), "generator", null);
        setField(term488, term488.getClass(), "prefixMappings", term489);
        setField(term488, term488.getClass(), "sourceLocationFixupCache", term503);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOEqzGAmDU";
        Object retValue = callMethod(klass, "fixupSourceLocation", argTypes, term64, args);
        assertTrue(recursiveEquals(term64, term488));
        assertTrue(recursiveEquals(retValue, "xOEqzGAmDU"));
    }

};


