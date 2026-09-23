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

public class IRFactory_setFileOverviewJsDoc_1930902895445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78656;

    public IRFactory_setFileOverviewJsDoc_1930902895445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78656 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term78726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78822 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term78892 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78822, term78822.getClass(), "type", 29);
        setField(term78822, term78822.getClass(), "objectValue", term78892);
        setField(term78726, term78726.getClass(), "propListHead", term78822);
        setField(term78656, term78656.getClass(), "rootNodeJsDocHolder", term78726);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setFileOverviewJsDoc", argTypes, term78656, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


