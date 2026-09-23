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

public class IRFactory_setFileOverviewJsDoc_1930902895427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74256;

    public IRFactory_setFileOverviewJsDoc_1930902895427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74256 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term74326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74422 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term74518 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term74598 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term74422, term74422.getClass(), "type", -30);
        setIntField(term74518, term74518.getClass(), "type", 29);
        setField(term74518, term74518.getClass(), "objectValue", term74598);
        setField(term74422, term74422.getClass(), "next", term74518);
        setField(term74326, term74326.getClass(), "propListHead", term74422);
        setField(term74256, term74256.getClass(), "rootNodeJsDocHolder", term74326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setFileOverviewJsDoc", argTypes, term74256, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


