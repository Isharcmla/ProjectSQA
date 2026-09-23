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

public class SourceMap_setWrapperPrefix_80753460915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208;

    public SourceMap_setWrapperPrefix_80753460915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term211 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term211, term211.getClass(), "prefix", "");
        setField(term211, term211.getClass(), "replacement", "");
        Object term214 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term214, term214.getClass(), "prefix", "");
        setField(term214, term214.getClass(), "replacement", "");
        Object term217 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term217, term217.getClass(), "prefix", "");
        setField(term217, term217.getClass(), "replacement", "");
        Object term220 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term220, term220.getClass(), "prefix", "");
        setField(term220, term220.getClass(), "replacement", "");
        Object term223 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term223, term223.getClass(), "prefix", "");
        setField(term223, term223.getClass(), "replacement", "");
        Object term226 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term226, term226.getClass(), "prefix", "");
        setField(term226, term226.getClass(), "replacement", "");
        ArrayList term209 = new ArrayList();
        ((ArrayList) term209).add(term211);
        ((ArrayList) term209).add(term214);
        ((ArrayList) term209).add(term217);
        ((ArrayList) term209).add(term220);
        ((ArrayList) term209).add(term223);
        ((ArrayList) term209).add(term226);
        HashMap term231 = new HashMap();
        term208 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        setField(term208, term208.getClass(), "generator", null);
        setField(term208, term208.getClass(), "prefixMappings", term209);
        setField(term208, term208.getClass(), "sourceLocationFixupCache", term231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ieCtQFdkii";
        try {
            callMethod(klass, "setWrapperPrefix", argTypes, term208, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


