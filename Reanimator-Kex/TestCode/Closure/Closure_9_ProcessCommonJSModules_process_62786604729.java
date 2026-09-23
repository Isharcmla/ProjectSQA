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

public class ProcessCommonJSModules_process_62786604729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5363;
     Object term5433;
     Object term5542;
     Object term5543;

    public ProcessCommonJSModules_process_62786604729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5363 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term5363, term5363.getClass(), "compiler", null);
        term5433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5433, term5433.getClass(), "type", 0);
        setField(term5433, term5433.getClass(), "parent", null);
        setField(term5433, term5433.getClass(), "first", null);
        term5542 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term5542, term5542.getClass(), "compiler", null);
        setField(term5542, term5542.getClass(), "filenamePrefix", null);
        setBooleanField(term5542, term5542.getClass(), "reportDependencies", false);
        setField(term5542, term5542.getClass(), "module", null);
        term5543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5543, term5543.getClass(), "type", 0);
        setField(term5543, term5543.getClass(), "next", null);
        setField(term5543, term5543.getClass(), "first", null);
        setField(term5543, term5543.getClass(), "last", null);
        setField(term5543, term5543.getClass(), "propListHead", null);
        setIntField(term5543, term5543.getClass(), "sourcePosition", 0);
        setField(term5543, term5543.getClass(), "jsType", null);
        setField(term5543, term5543.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term5433;
        callMethod(klass, "process", argTypes, term5363, args);
        assertTrue(recursiveEquals(term5363, term5542));
        assertTrue(recursiveEquals(term5433, null));
    }

};


