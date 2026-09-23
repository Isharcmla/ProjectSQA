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

public class AbstractCommandLineRunner_createExternInputs_76734007476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101580;
     Object term127222;
     Object term127177;

    public AbstractCommandLineRunner_createExternInputs_76734007476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101580 = new LinkedList();
        term127222 = new LinkedList();
        term127177 = newInstance(Class.forName("com.google.common.collect.SingletonImmutableList"));
        Object term127178 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        Object term127179 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term127179, term127179.getClass(), "fileName", "/dev/null");
        setField(term127179, term127179.getClass(), "originalPath", "/dev/null");
        setIntField(term127179, term127179.getClass(), "lastOffset", 0);
        setIntField(term127179, term127179.getClass(), "lastLine", 1);
        setField(term127179, term127179.getClass(), "code", "");
        setField(term127178, term127178.getClass(), "referenced", term127179);
        setField(term127178, term127178.getClass(), "fileName", "/dev/null");
        setField(term127178, term127178.getClass(), "originalPath", null);
        setIntField(term127178, term127178.getClass(), "lastOffset", 0);
        setIntField(term127178, term127178.getClass(), "lastLine", 1);
        setField(term127178, term127178.getClass(), "code", null);
        setField(term127177, term127177.getClass(), "element", term127178);
        setField(term127177, term127177.getClass(), "asList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term101580;
        Object retValue = callMethod(klass, "createExternInputs", argTypes, null, args);
        assertTrue(recursiveEquals(term101580, term127222));
        assertTrue(recursiveEquals(retValue, term127177));
    }

};


