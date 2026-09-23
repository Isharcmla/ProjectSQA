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

public class IRFactory_setFileOverviewJsDoc_1930902895289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48174;

    public IRFactory_setFileOverviewJsDoc_1930902895289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48174 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term48244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term48244, term48244.getClass(), "propListHead", null);
        setField(term48174, term48174.getClass(), "rootNodeJsDocHolder", term48244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setFileOverviewJsDoc", argTypes, term48174, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


