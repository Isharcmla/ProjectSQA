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

public class IRFactory_setFileOverviewJsDoc_1930902895353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38882;

    public IRFactory_setFileOverviewJsDoc_1930902895353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38882 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term38952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39048 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term39144 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term39048, term39048.getClass(), "type", -30);
        setIntField(term39144, term39144.getClass(), "type", 29);
        setField(term39048, term39048.getClass(), "next", term39144);
        setField(term38952, term38952.getClass(), "propListHead", term39048);
        setField(term38882, term38882.getClass(), "rootNodeJsDocHolder", term38952);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setFileOverviewJsDoc", argTypes, term38882, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


