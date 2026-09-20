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
import java.lang.Object;

public class RemoveUnusedVars_process_26289943146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11858;
     Object term11928;

    public RemoveUnusedVars_process_26289943146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11858 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setBooleanField(term11858, term11858.getClass(), "modifyCallSites", false);
        setField(term11858, term11858.getClass(), "compiler", null);
        term11928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11928, term11928.getClass(), "type", 0);
        setIntField(term11998, term11998.getClass(), "type", 38);
        setField(term11928, term11928.getClass(), "first", term11998);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.SimpleDefinitionFinder");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term11928;
        args[2] = null;
        callMethod(klass, "process", argTypes, term11858, args);
    }

};
