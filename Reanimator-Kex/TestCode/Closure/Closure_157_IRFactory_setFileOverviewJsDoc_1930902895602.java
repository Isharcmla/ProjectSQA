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

public class IRFactory_setFileOverviewJsDoc_1930902895602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126889;

    public IRFactory_setFileOverviewJsDoc_1930902895602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126889 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term126959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127055 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term127055, term127055.getClass(), "type", 0);
        setField(term127055, term127055.getClass(), "next", term127055);
        setField(term126959, term126959.getClass(), "propListHead", term127055);
        setField(term126889, term126889.getClass(), "rootNodeJsDocHolder", term126959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term126889, args);
    }

};


