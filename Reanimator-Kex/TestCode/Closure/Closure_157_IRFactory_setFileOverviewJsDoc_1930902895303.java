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
import java.lang.ClassCastException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IRFactory_setFileOverviewJsDoc_1930902895303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51293;

    public IRFactory_setFileOverviewJsDoc_1930902895303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51293 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term51363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51459 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term51555 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term51625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51459, term51459.getClass(), "type", -30);
        setIntField(term51555, term51555.getClass(), "type", 29);
        setField(term51555, term51555.getClass(), "objectValue", term51625);
        setField(term51459, term51459.getClass(), "next", term51555);
        setField(term51363, term51363.getClass(), "propListHead", term51459);
        setField(term51293, term51293.getClass(), "rootNodeJsDocHolder", term51363);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setFileOverviewJsDoc", argTypes, term51293, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


