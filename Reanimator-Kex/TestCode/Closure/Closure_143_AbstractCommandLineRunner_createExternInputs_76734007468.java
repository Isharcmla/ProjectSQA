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

public class AbstractCommandLineRunner_createExternInputs_76734007468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100230;
     Object term100454;
     Object term100409;

    public AbstractCommandLineRunner_createExternInputs_76734007468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100230 = new LinkedList();
        term100454 = new LinkedList();
        term100409 = newInstance(Class.forName("com.google.common.collect.SingletonImmutableList"));
        Object term100410 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        Object term100411 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term100411, term100411.getClass(), "fileName", "/dev/null");
        setField(term100411, term100411.getClass(), "originalPath", "/dev/null");
        setIntField(term100411, term100411.getClass(), "lastOffset", 0);
        setIntField(term100411, term100411.getClass(), "lastLine", 1);
        setField(term100411, term100411.getClass(), "code", "");
        setField(term100410, term100410.getClass(), "referenced", term100411);
        setField(term100410, term100410.getClass(), "fileName", "/dev/null");
        setField(term100410, term100410.getClass(), "originalPath", null);
        setIntField(term100410, term100410.getClass(), "lastOffset", 0);
        setIntField(term100410, term100410.getClass(), "lastLine", 1);
        setField(term100410, term100410.getClass(), "code", null);
        setField(term100409, term100409.getClass(), "element", term100410);
        setField(term100409, term100409.getClass(), "asList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term100230;
        Object retValue = callMethod(klass, "createExternInputs", argTypes, null, args);
        assertTrue(recursiveEquals(term100230, term100454));
        assertTrue(recursiveEquals(retValue, term100409));
    }

};


