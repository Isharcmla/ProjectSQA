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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IRFactory_setFileOverviewJsDoc_1930902895365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63028;

    public IRFactory_setFileOverviewJsDoc_1930902895365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63028 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term63098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63194 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term63194, term63194.getClass(), "type", 29);
        setField(term63098, term63098.getClass(), "propListHead", term63194);
        setField(term63028, term63028.getClass(), "rootNodeJsDocHolder", term63098);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setFileOverviewJsDoc", argTypes, term63028, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


