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

public class IRFactory_setFileOverviewJsDoc_1930902895217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42063;

    public IRFactory_setFileOverviewJsDoc_1930902895217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42063 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term42133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42229 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term42325 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term42229, term42229.getClass(), "type", -30);
        setIntField(term42325, term42325.getClass(), "type", 29);
        setField(term42229, term42229.getClass(), "next", term42325);
        setField(term42133, term42133.getClass(), "propListHead", term42229);
        setField(term42063, term42063.getClass(), "rootNodeJsDocHolder", term42133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setFileOverviewJsDoc", argTypes, term42063, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


