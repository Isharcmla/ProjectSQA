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

public class IRFactory_setFileOverviewJsDoc_1930902895347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38232;

    public IRFactory_setFileOverviewJsDoc_1930902895347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38232 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term38302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38398 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term38478 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term38398, term38398.getClass(), "type", 29);
        setField(term38398, term38398.getClass(), "objectValue", term38478);
        setField(term38302, term38302.getClass(), "propListHead", term38398);
        setField(term38232, term38232.getClass(), "rootNodeJsDocHolder", term38302);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setFileOverviewJsDoc", argTypes, term38232, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


