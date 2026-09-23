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

public class IRFactory_setFileOverviewJsDoc_1930902895311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35003;

    public IRFactory_setFileOverviewJsDoc_1930902895311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35003 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term35073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35169 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term35239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35169, term35169.getClass(), "type", 29);
        setField(term35169, term35169.getClass(), "objectValue", term35239);
        setField(term35073, term35073.getClass(), "propListHead", term35169);
        setField(term35003, term35003.getClass(), "rootNodeJsDocHolder", term35073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setFileOverviewJsDoc", argTypes, term35003, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


