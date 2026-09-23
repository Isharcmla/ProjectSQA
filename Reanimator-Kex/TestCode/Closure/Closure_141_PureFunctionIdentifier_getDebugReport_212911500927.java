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
import java.lang.Object;

public class PureFunctionIdentifier_getDebugReport_212911500927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15819;

    public PureFunctionIdentifier_getDebugReport_212911500927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15819 = newInstance(Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier"));
        Object term15889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15889, term15889.getClass(), "type", 132);
        setField(term15819, term15819.getClass(), "externs", term15889);
        setField(term15819, term15819.getClass(), "root", term15959);
        setField(term15819, term15819.getClass(), "compiler", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getDebugReport", argTypes, term15819, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


