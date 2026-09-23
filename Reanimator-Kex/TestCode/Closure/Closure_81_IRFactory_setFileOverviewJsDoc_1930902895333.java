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

public class IRFactory_setFileOverviewJsDoc_1930902895333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37758;
     Object term37994;
     Object term38076;
     Object term38079;

    public IRFactory_setFileOverviewJsDoc_1930902895333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37758 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term37828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38042 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term38042, term38042.getClass(), "type", 29);
        setField(term38042, term38042.getClass(), "objectValue", null);
        setField(term38042, term38042.getClass(), "next", term38042);
        setField(term37828, term37828.getClass(), "propListHead", term38042);
        setField(term37758, term37758.getClass(), "rootNodeJsDocHolder", term37828);
        term37994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term37994, term37994.getClass(), "propListHead", term38042);
        term38076 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term38077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38078 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term38076, term38076.getClass(), "sourceString", null);
        setField(term38076, term38076.getClass(), "sourceName", null);
        setField(term38076, term38076.getClass(), "config", null);
        setField(term38076, term38076.getClass(), "errorReporter", null);
        setField(term38076, term38076.getClass(), "transformDispatcher", null);
        setField(term38076, term38076.getClass(), "ALLOWED_DIRECTIVES", null);
        setIntField(term38077, term38077.getClass(), "type", 0);
        setField(term38077, term38077.getClass(), "next", null);
        setField(term38077, term38077.getClass(), "first", null);
        setField(term38077, term38077.getClass(), "last", null);
        setField(term38078, term38078.getClass(), "next", term38078);
        setIntField(term38078, term38078.getClass(), "type", 29);
        setIntField(term38078, term38078.getClass(), "intValue", 0);
        setField(term38078, term38078.getClass(), "objectValue", null);
        setField(term38077, term38077.getClass(), "propListHead", term38078);
        setIntField(term38077, term38077.getClass(), "sourcePosition", 0);
        setField(term38077, term38077.getClass(), "jsType", null);
        setField(term38077, term38077.getClass(), "parent", null);
        setField(term38076, term38076.getClass(), "rootNodeJsDocHolder", term38077);
        setField(term38076, term38076.getClass(), "fileLevelJsDocBuilder", null);
        setField(term38076, term38076.getClass(), "fileOverviewInfo", null);
        setField(term38076, term38076.getClass(), "templateNode", null);
        term38079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38080 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term38079, term38079.getClass(), "type", 0);
        setField(term38079, term38079.getClass(), "next", null);
        setField(term38079, term38079.getClass(), "first", null);
        setField(term38079, term38079.getClass(), "last", null);
        setField(term38080, term38080.getClass(), "next", term38080);
        setIntField(term38080, term38080.getClass(), "type", 29);
        setIntField(term38080, term38080.getClass(), "intValue", 0);
        setField(term38080, term38080.getClass(), "objectValue", null);
        setField(term38079, term38079.getClass(), "propListHead", term38080);
        setIntField(term38079, term38079.getClass(), "sourcePosition", 0);
        setField(term38079, term38079.getClass(), "jsType", null);
        setField(term38079, term38079.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term37994;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term37758, args);
        assertTrue(recursiveEquals(term37758, term38076));
        assertTrue(recursiveEquals(term37994, term38079));
    }

};


