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
import java.util.LinkedList;
import java.lang.Object;

public class AbstractCommandLineRunner_createExternInputs_76734007445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9310;
     Object term46427;
     Object term46382;

    public AbstractCommandLineRunner_createExternInputs_76734007445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9310 = new LinkedList();
        term46427 = new LinkedList();
        term46382 = newInstance(Class.forName("com.google.common.collect.SingletonImmutableList"));
        Object term46383 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        Object term46384 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term46384, term46384.getClass(), "fileName", "/dev/null");
        setField(term46384, term46384.getClass(), "originalPath", "/dev/null");
        setIntField(term46384, term46384.getClass(), "lastOffset", 0);
        setIntField(term46384, term46384.getClass(), "lastLine", 1);
        setField(term46384, term46384.getClass(), "code", "");
        setField(term46383, term46383.getClass(), "referenced", term46384);
        setField(term46383, term46383.getClass(), "fileName", "/dev/null");
        setField(term46383, term46383.getClass(), "originalPath", null);
        setIntField(term46383, term46383.getClass(), "lastOffset", 0);
        setIntField(term46383, term46383.getClass(), "lastLine", 1);
        setField(term46383, term46383.getClass(), "code", null);
        setField(term46382, term46382.getClass(), "element", term46383);
        setField(term46382, term46382.getClass(), "asList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term9310;
        Object retValue = callMethod(klass, "createExternInputs", argTypes, null, args);
        assertTrue(recursiveEquals(term9310, term46427));
        assertTrue(recursiveEquals(retValue, term46382));
    }

};


