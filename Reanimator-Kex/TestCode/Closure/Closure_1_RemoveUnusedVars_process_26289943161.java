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

public class RemoveUnusedVars_process_26289943161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17041;
     Object term17111;

    public RemoveUnusedVars_process_26289943161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17041 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setBooleanField(term17041, term17041.getClass(), "modifyCallSites", false);
        setField(term17041, term17041.getClass(), "compiler", null);
        term17111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17273 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term17111, term17111.getClass(), "type", 0);
        setIntField(term17181, term17181.getClass(), "type", 0);
        setField(term17181, term17181.getClass(), "first", term17273);
        setField(term17111, term17111.getClass(), "first", term17181);
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
        args[1] = term17111;
        args[2] = null;
        callMethod(klass, "process", argTypes, term17041, args);
    }

};
