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

public class IRFactory_setFileOverviewJsDoc_1930902895358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40124;

    public IRFactory_setFileOverviewJsDoc_1930902895358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40124 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term40194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40290 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term40290, term40290.getClass(), "type", 0);
        setField(term40290, term40290.getClass(), "next", term40290);
        setField(term40194, term40194.getClass(), "propListHead", term40290);
        setField(term40124, term40124.getClass(), "rootNodeJsDocHolder", term40194);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term40124, args);
    }

};


