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

public class IRFactory_setFileOverviewJsDoc_1930902895282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26238;

    public IRFactory_setFileOverviewJsDoc_1930902895282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26238 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term26308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26404 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term26500 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term26404, term26404.getClass(), "type", -30);
        setField(term26404, term26404.getClass(), "next", term26500);
        setField(term26308, term26308.getClass(), "propListHead", term26404);
        setField(term26238, term26238.getClass(), "rootNodeJsDocHolder", term26308);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setFileOverviewJsDoc", argTypes, term26238, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


