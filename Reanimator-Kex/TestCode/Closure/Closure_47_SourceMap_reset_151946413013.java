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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class SourceMap_reset_151946413013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159;

    public SourceMap_reset_151946413013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term162 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term162, term162.getClass(), "prefix", "");
        setField(term162, term162.getClass(), "replacement", "");
        Object term165 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term165, term165.getClass(), "prefix", "");
        setField(term165, term165.getClass(), "replacement", "");
        Object term168 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term168, term168.getClass(), "prefix", "");
        setField(term168, term168.getClass(), "replacement", "");
        Object term171 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term171, term171.getClass(), "prefix", "");
        setField(term171, term171.getClass(), "replacement", "");
        ArrayList term160 = new ArrayList();
        ((ArrayList) term160).add(term162);
        ((ArrayList) term160).add(term165);
        ((ArrayList) term160).add(term168);
        ((ArrayList) term160).add(term171);
        HashMap term176 = new HashMap();
        term159 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        setField(term159, term159.getClass(), "generator", null);
        setField(term159, term159.getClass(), "prefixMappings", term160);
        setField(term159, term159.getClass(), "sourceLocationFixupCache", term176);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "reset", argTypes, term159, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


