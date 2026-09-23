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
import java.lang.Boolean;

public class SourceMap_validate_163485975116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263;
     Object term284;

    public SourceMap_validate_163485975116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term266 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term266, term266.getClass(), "prefix", "");
        setField(term266, term266.getClass(), "replacement", "");
        Object term269 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term269, term269.getClass(), "prefix", "");
        setField(term269, term269.getClass(), "replacement", "");
        ArrayList term264 = new ArrayList();
        ((ArrayList) term264).add(term266);
        ((ArrayList) term264).add(term269);
        HashMap term274 = new HashMap();
        term263 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        setField(term263, term263.getClass(), "generator", null);
        setField(term263, term263.getClass(), "prefixMappings", term264);
        setField(term263, term263.getClass(), "sourceLocationFixupCache", term274);
        term284 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term284;
        try {
            callMethod(klass, "validate", argTypes, term263, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


