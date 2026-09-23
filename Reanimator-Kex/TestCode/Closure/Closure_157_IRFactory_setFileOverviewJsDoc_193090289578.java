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

public class IRFactory_setFileOverviewJsDoc_193090289578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40480;

    public IRFactory_setFileOverviewJsDoc_193090289578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40480 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term40550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40646 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term40742 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term40646, term40646.getClass(), "type", -30);
        setField(term40646, term40646.getClass(), "next", term40742);
        setField(term40550, term40550.getClass(), "propListHead", term40646);
        setField(term40480, term40480.getClass(), "rootNodeJsDocHolder", term40550);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setFileOverviewJsDoc", argTypes, term40480, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


