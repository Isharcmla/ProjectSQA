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

public class SourceMap_fixupSourceLocation_212137961926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2871;
     Object term3382;

    public SourceMap_fixupSourceLocation_212137961926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2923 = new ArrayList();
        term2871 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        setField(term2871, term2871.getClass(), "prefixMappings", term2923);
        ArrayList term3383 = new ArrayList();
        term3382 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        setField(term3382, term3382.getClass(), "generator", null);
        setField(term3382, term3382.getClass(), "prefixMappings", term3383);
        setField(term3382, term3382.getClass(), "sourceLocationFixupCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "fixupSourceLocation", argTypes, term2871, args);
        assertTrue(recursiveEquals(term2871, term3382));
        assertTrue(recursiveEquals(retValue, null));
    }

};


