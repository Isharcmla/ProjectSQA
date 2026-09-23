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
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.parsing.EqualityUtils.*;
import java.lang.Object;

public class IRFactory_setFileOverviewJsDoc_1930902895223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24769;
     Object term24970;
     Object term25046;
     Object term25048;

    public IRFactory_setFileOverviewJsDoc_1930902895223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24769 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term24970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25018 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term25018, term25018.getClass(), "type", 29);
        setField(term25018, term25018.getClass(), "objectValue", null);
        setField(term24970, term24970.getClass(), "propListHead", term25018);
        setField(term24769, term24769.getClass(), "rootNodeJsDocHolder", term24970);
        term25046 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term25047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term25046, term25046.getClass(), "sourceString", null);
        setField(term25046, term25046.getClass(), "sourceName", null);
        setField(term25046, term25046.getClass(), "config", null);
        setField(term25046, term25046.getClass(), "errorReporter", null);
        setField(term25046, term25046.getClass(), "transformDispatcher", null);
        setField(term25046, term25046.getClass(), "ALLOWED_DIRECTIVES", null);
        setIntField(term25047, term25047.getClass(), "type", 0);
        setField(term25047, term25047.getClass(), "next", null);
        setField(term25047, term25047.getClass(), "first", null);
        setField(term25047, term25047.getClass(), "last", null);
        setField(term25047, term25047.getClass(), "propListHead", null);
        setIntField(term25047, term25047.getClass(), "sourcePosition", 0);
        setField(term25047, term25047.getClass(), "jsType", null);
        setField(term25047, term25047.getClass(), "parent", null);
        setField(term25046, term25046.getClass(), "rootNodeJsDocHolder", term25047);
        setField(term25046, term25046.getClass(), "fileLevelJsDocBuilder", null);
        setField(term25046, term25046.getClass(), "fileOverviewInfo", null);
        setField(term25046, term25046.getClass(), "templateNode", null);
        term25048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25048, term25048.getClass(), "type", 0);
        setField(term25048, term25048.getClass(), "next", null);
        setField(term25048, term25048.getClass(), "first", null);
        setField(term25048, term25048.getClass(), "last", null);
        setField(term25048, term25048.getClass(), "propListHead", null);
        setIntField(term25048, term25048.getClass(), "sourcePosition", 0);
        setField(term25048, term25048.getClass(), "jsType", null);
        setField(term25048, term25048.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term24970;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term24769, args);
        assertTrue(recursiveEquals(term24769, term25046));
        assertTrue(recursiveEquals(term24970, term25048));
    }

};


