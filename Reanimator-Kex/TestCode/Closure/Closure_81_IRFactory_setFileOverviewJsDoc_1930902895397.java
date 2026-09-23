package com.google.javascript.jscomp.parsing;

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
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IRFactory_setFileOverviewJsDoc_1930902895397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49046;
     Object term49226;

    public IRFactory_setFileOverviewJsDoc_1930902895397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49046 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term49136 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term49136, term49136.getClass(), "propListHead", null);
        setField(term49046, term49046.getClass(), "rootNodeJsDocHolder", term49136);
        term49226 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term49226;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term49046, args);
    }

};


