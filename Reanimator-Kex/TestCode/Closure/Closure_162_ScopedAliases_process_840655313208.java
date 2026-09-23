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

public class ScopedAliases_process_840655313208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116799;
     Object term116885;

    public ScopedAliases_process_840655313208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116799 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term116799, term116799.getClass(), "compiler", null);
        term116885 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term116971 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term117041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term116885, term116885.getClass(), "type", 0);
        setIntField(term116971, term116971.getClass(), "type", 0);
        setField(term116971, term116971.getClass(), "parent", null);
        setField(term116885, term116885.getClass(), "parent", term116971);
        setField(term116885, term116885.getClass(), "first", term117041);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term116885;
        callMethod(klass, "process", argTypes, term116799, args);
    }

};


