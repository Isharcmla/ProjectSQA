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

public class CrossModuleMethodMotion_process_15999878126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term945;
     Object term1196;

    public CrossModuleMethodMotion_process_15999878126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term945 = newInstance(Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        setField(term945, term945.getClass(), "compiler", null);
        setField(term945, term945.getClass(), "idGenerator", null);
        setField(term945, term945.getClass(), "analyzer", null);
        setField(term945, term945.getClass(), "moduleGraph", null);
        term1196 = newInstance(Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion"));
        setField(term1196, term1196.getClass(), "compiler", null);
        setField(term1196, term1196.getClass(), "idGenerator", null);
        setField(term1196, term1196.getClass(), "analyzer", null);
        setField(term1196, term1196.getClass(), "moduleGraph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CrossModuleMethodMotion");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "process", argTypes, term945, args);
        assertTrue(recursiveEquals(term945, term1196));
    }

};


