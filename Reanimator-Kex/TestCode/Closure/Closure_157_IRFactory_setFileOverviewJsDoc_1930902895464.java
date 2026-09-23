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

public class IRFactory_setFileOverviewJsDoc_1930902895464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85093;
     Object term85329;
     Object term85750;
     Object term85753;

    public IRFactory_setFileOverviewJsDoc_1930902895464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85093 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term85163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85259 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term85259, term85259.getClass(), "type", 29);
        setField(term85259, term85259.getClass(), "objectValue", null);
        setField(term85163, term85163.getClass(), "propListHead", term85259);
        setField(term85093, term85093.getClass(), "rootNodeJsDocHolder", term85163);
        term85329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term85329, term85329.getClass(), "propListHead", null);
        term85750 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term85751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85752 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term85750, term85750.getClass(), "sourceString", null);
        setField(term85750, term85750.getClass(), "sourceName", null);
        setField(term85750, term85750.getClass(), "config", null);
        setField(term85750, term85750.getClass(), "errorReporter", null);
        setField(term85750, term85750.getClass(), "transformDispatcher", null);
        setField(term85750, term85750.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term85750, term85750.getClass(), "reservedKeywords", null);
        setIntField(term85751, term85751.getClass(), "type", 0);
        setField(term85751, term85751.getClass(), "next", null);
        setField(term85751, term85751.getClass(), "first", null);
        setField(term85751, term85751.getClass(), "last", null);
        setField(term85752, term85752.getClass(), "next", null);
        setIntField(term85752, term85752.getClass(), "type", 29);
        setIntField(term85752, term85752.getClass(), "intValue", 0);
        setField(term85752, term85752.getClass(), "objectValue", null);
        setField(term85751, term85751.getClass(), "propListHead", term85752);
        setIntField(term85751, term85751.getClass(), "sourcePosition", 0);
        setField(term85751, term85751.getClass(), "jsType", null);
        setField(term85751, term85751.getClass(), "parent", null);
        setField(term85750, term85750.getClass(), "rootNodeJsDocHolder", term85751);
        setField(term85750, term85750.getClass(), "fileLevelJsDocBuilder", null);
        setField(term85750, term85750.getClass(), "fileOverviewInfo", null);
        setField(term85750, term85750.getClass(), "templateNode", null);
        term85753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term85753, term85753.getClass(), "type", 0);
        setField(term85753, term85753.getClass(), "next", null);
        setField(term85753, term85753.getClass(), "first", null);
        setField(term85753, term85753.getClass(), "last", null);
        setField(term85753, term85753.getClass(), "propListHead", null);
        setIntField(term85753, term85753.getClass(), "sourcePosition", 0);
        setField(term85753, term85753.getClass(), "jsType", null);
        setField(term85753, term85753.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term85329;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term85093, args);
        assertTrue(recursiveEquals(term85093, term85750));
        assertTrue(recursiveEquals(term85329, term85753));
    }

};


