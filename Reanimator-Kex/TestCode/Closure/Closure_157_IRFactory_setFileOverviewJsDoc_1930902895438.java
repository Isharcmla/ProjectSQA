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

public class IRFactory_setFileOverviewJsDoc_1930902895438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76725;
     Object term77057;
     Object term77865;
     Object term77869;

    public IRFactory_setFileOverviewJsDoc_1930902895438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76725 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term76795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77105 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term77153 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term77105, term77105.getClass(), "type", -30);
        setIntField(term77153, term77153.getClass(), "type", 29);
        setField(term77153, term77153.getClass(), "objectValue", null);
        setField(term77105, term77105.getClass(), "next", term77153);
        setField(term76795, term76795.getClass(), "propListHead", term77105);
        setField(term76725, term76725.getClass(), "rootNodeJsDocHolder", term76795);
        term77057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term77057, term77057.getClass(), "propListHead", term77105);
        term77865 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term77866 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77867 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term77868 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term77865, term77865.getClass(), "sourceString", null);
        setField(term77865, term77865.getClass(), "sourceName", null);
        setField(term77865, term77865.getClass(), "config", null);
        setField(term77865, term77865.getClass(), "errorReporter", null);
        setField(term77865, term77865.getClass(), "transformDispatcher", null);
        setField(term77865, term77865.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term77865, term77865.getClass(), "reservedKeywords", null);
        setIntField(term77866, term77866.getClass(), "type", 0);
        setField(term77866, term77866.getClass(), "next", null);
        setField(term77866, term77866.getClass(), "first", null);
        setField(term77866, term77866.getClass(), "last", null);
        setField(term77868, term77868.getClass(), "next", null);
        setIntField(term77868, term77868.getClass(), "type", 29);
        setIntField(term77868, term77868.getClass(), "intValue", 0);
        setField(term77868, term77868.getClass(), "objectValue", null);
        setField(term77867, term77867.getClass(), "next", term77868);
        setIntField(term77867, term77867.getClass(), "type", -30);
        setIntField(term77867, term77867.getClass(), "intValue", 0);
        setField(term77867, term77867.getClass(), "objectValue", null);
        setField(term77866, term77866.getClass(), "propListHead", term77867);
        setIntField(term77866, term77866.getClass(), "sourcePosition", 0);
        setField(term77866, term77866.getClass(), "jsType", null);
        setField(term77866, term77866.getClass(), "parent", null);
        setField(term77865, term77865.getClass(), "rootNodeJsDocHolder", term77866);
        setField(term77865, term77865.getClass(), "fileLevelJsDocBuilder", null);
        setField(term77865, term77865.getClass(), "fileOverviewInfo", null);
        setField(term77865, term77865.getClass(), "templateNode", null);
        term77869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77870 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term77869, term77869.getClass(), "type", 0);
        setField(term77869, term77869.getClass(), "next", null);
        setField(term77869, term77869.getClass(), "first", null);
        setField(term77869, term77869.getClass(), "last", null);
        setField(term77870, term77870.getClass(), "next", null);
        setIntField(term77870, term77870.getClass(), "type", -30);
        setIntField(term77870, term77870.getClass(), "intValue", 0);
        setField(term77870, term77870.getClass(), "objectValue", null);
        setField(term77869, term77869.getClass(), "propListHead", term77870);
        setIntField(term77869, term77869.getClass(), "sourcePosition", 0);
        setField(term77869, term77869.getClass(), "jsType", null);
        setField(term77869, term77869.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term77057;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term76725, args);
        assertTrue(recursiveEquals(term76725, term77865));
        assertTrue(recursiveEquals(term77057, term77869));
    }

};


