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

public class AbstractCommandLineRunner_createExternInputs_76734007491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112295;
     Object term112515;
     Object term112470;

    public AbstractCommandLineRunner_createExternInputs_76734007491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112295 = new LinkedList();
        term112515 = new LinkedList();
        term112470 = newInstance(Class.forName("com.google.common.collect.SingletonImmutableList"));
        Object term112471 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        Object term112472 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term112472, term112472.getClass(), "fileName", "/dev/null");
        setField(term112472, term112472.getClass(), "originalPath", "/dev/null");
        setIntField(term112472, term112472.getClass(), "lastOffset", 0);
        setIntField(term112472, term112472.getClass(), "lastLine", 1);
        setField(term112472, term112472.getClass(), "code", "");
        setField(term112471, term112471.getClass(), "referenced", term112472);
        setField(term112471, term112471.getClass(), "fileName", "/dev/null");
        setField(term112471, term112471.getClass(), "originalPath", null);
        setIntField(term112471, term112471.getClass(), "lastOffset", 0);
        setIntField(term112471, term112471.getClass(), "lastLine", 1);
        setField(term112471, term112471.getClass(), "code", null);
        setField(term112470, term112470.getClass(), "element", term112471);
        setField(term112470, term112470.getClass(), "asList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term112295;
        Object retValue = callMethod(klass, "createExternInputs", argTypes, null, args);
        assertTrue(recursiveEquals(term112295, term112515));
        assertTrue(recursiveEquals(retValue, term112470));
    }

};


