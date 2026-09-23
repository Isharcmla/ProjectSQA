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

public class RenameLabels_process_15092268017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4490;
     Object term4560;
     Object term5021;
     Object term5022;

    public RenameLabels_process_15092268017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4490 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term4490, term4490.getClass(), "compiler", null);
        term4560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term5021 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term5021, term5021.getClass(), "compiler", null);
        setField(term5021, term5021.getClass(), "nameSupplier", null);
        setBooleanField(term5021, term5021.getClass(), "removeUnused", false);
        term5022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5022, term5022.getClass(), "type", 0);
        setField(term5022, term5022.getClass(), "next", null);
        setField(term5022, term5022.getClass(), "first", null);
        setField(term5022, term5022.getClass(), "last", null);
        setField(term5022, term5022.getClass(), "propListHead", null);
        setIntField(term5022, term5022.getClass(), "sourcePosition", 0);
        setField(term5022, term5022.getClass(), "jsType", null);
        setField(term5022, term5022.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameLabels");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term4560;
        callMethod(klass, "process", argTypes, term4490, args);
        assertTrue(recursiveEquals(term4490, term5021));
        assertTrue(recursiveEquals(term4560, null));
    }

};


