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

public class IRFactory_setFileOverviewJsDoc_1930902895367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41943;
     Object term42083;

    public IRFactory_setFileOverviewJsDoc_1930902895367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41943 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term42013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term42013, term42013.getClass(), "propListHead", null);
        setField(term41943, term41943.getClass(), "rootNodeJsDocHolder", term42013);
        term42083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42179 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term42083, term42083.getClass(), "propListHead", term42179);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term42083;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term41943, args);
    }

};


