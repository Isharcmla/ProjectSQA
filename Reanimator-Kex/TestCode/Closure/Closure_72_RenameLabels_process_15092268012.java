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

public class RenameLabels_process_15092268012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2925;
     Object term2995;
     Object term3528;
     Object term3529;

    public RenameLabels_process_15092268012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2925 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term2925, term2925.getClass(), "compiler", null);
        term2995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2995, term2995.getClass(), "type", 132);
        term3528 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term3528, term3528.getClass(), "compiler", null);
        setField(term3528, term3528.getClass(), "nameSupplier", null);
        setBooleanField(term3528, term3528.getClass(), "removeUnused", false);
        term3529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3529, term3529.getClass(), "type", 132);
        setField(term3529, term3529.getClass(), "next", null);
        setField(term3529, term3529.getClass(), "first", null);
        setField(term3529, term3529.getClass(), "last", null);
        setField(term3529, term3529.getClass(), "propListHead", null);
        setIntField(term3529, term3529.getClass(), "sourcePosition", 0);
        setField(term3529, term3529.getClass(), "jsType", null);
        setField(term3529, term3529.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameLabels");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2995;
        callMethod(klass, "process", argTypes, term2925, args);
        assertTrue(recursiveEquals(term2925, term3528));
        assertTrue(recursiveEquals(term2995, null));
    }

};


