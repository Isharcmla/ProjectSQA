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

public class IRFactory_setFileOverviewJsDoc_1930902895331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56418;
     Object term56830;
     Object term56886;
     Object term56891;

    public IRFactory_setFileOverviewJsDoc_1930902895331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56418 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term56488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56584 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term56680 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term56760 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term56584, term56584.getClass(), "type", 0);
        setIntField(term56680, term56680.getClass(), "type", 0);
        setField(term56680, term56680.getClass(), "next", null);
        setField(term56584, term56584.getClass(), "next", term56680);
        setField(term56488, term56488.getClass(), "propListHead", term56584);
        setField(term56418, term56418.getClass(), "rootNodeJsDocHolder", term56488);
        setField(term56418, term56418.getClass(), "fileOverviewInfo", term56760);
        term56830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term56830, term56830.getClass(), "propListHead", null);
        term56886 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term56887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56888 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term56889 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term56890 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term56886, term56886.getClass(), "sourceString", null);
        setField(term56886, term56886.getClass(), "sourceName", null);
        setField(term56886, term56886.getClass(), "config", null);
        setField(term56886, term56886.getClass(), "errorReporter", null);
        setField(term56886, term56886.getClass(), "transformDispatcher", null);
        setField(term56886, term56886.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term56886, term56886.getClass(), "reservedKeywords", null);
        setIntField(term56887, term56887.getClass(), "type", 0);
        setField(term56887, term56887.getClass(), "next", null);
        setField(term56887, term56887.getClass(), "first", null);
        setField(term56887, term56887.getClass(), "last", null);
        setField(term56889, term56889.getClass(), "next", null);
        setIntField(term56889, term56889.getClass(), "type", 0);
        setIntField(term56889, term56889.getClass(), "intValue", 0);
        setField(term56889, term56889.getClass(), "objectValue", null);
        setField(term56888, term56888.getClass(), "next", term56889);
        setIntField(term56888, term56888.getClass(), "type", 0);
        setIntField(term56888, term56888.getClass(), "intValue", 0);
        setField(term56888, term56888.getClass(), "objectValue", null);
        setField(term56887, term56887.getClass(), "propListHead", term56888);
        setIntField(term56887, term56887.getClass(), "sourcePosition", 0);
        setField(term56887, term56887.getClass(), "jsType", null);
        setField(term56887, term56887.getClass(), "parent", null);
        setField(term56886, term56886.getClass(), "rootNodeJsDocHolder", term56887);
        setField(term56886, term56886.getClass(), "fileLevelJsDocBuilder", null);
        setField(term56890, term56890.getClass(), "info", null);
        setField(term56890, term56890.getClass(), "documentation", null);
        setField(term56890, term56890.getClass(), "sourceName", null);
        setField(term56890, term56890.getClass(), "visibility", null);
        setIntField(term56890, term56890.getClass(), "bitset", 0);
        setField(term56890, term56890.getClass(), "type", null);
        setField(term56890, term56890.getClass(), "thisType", null);
        setBooleanField(term56890, term56890.getClass(), "includeDocumentation", false);
        setField(term56886, term56886.getClass(), "fileOverviewInfo", term56890);
        setField(term56886, term56886.getClass(), "templateNode", null);
        term56891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56892 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term56893 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term56891, term56891.getClass(), "type", 0);
        setField(term56891, term56891.getClass(), "next", null);
        setField(term56891, term56891.getClass(), "first", null);
        setField(term56891, term56891.getClass(), "last", null);
        setField(term56892, term56892.getClass(), "next", null);
        setIntField(term56892, term56892.getClass(), "type", 29);
        setIntField(term56892, term56892.getClass(), "intValue", 0);
        setField(term56893, term56893.getClass(), "info", null);
        setField(term56893, term56893.getClass(), "documentation", null);
        setField(term56893, term56893.getClass(), "sourceName", null);
        setField(term56893, term56893.getClass(), "visibility", null);
        setIntField(term56893, term56893.getClass(), "bitset", 0);
        setField(term56893, term56893.getClass(), "type", null);
        setField(term56893, term56893.getClass(), "thisType", null);
        setBooleanField(term56893, term56893.getClass(), "includeDocumentation", false);
        setField(term56892, term56892.getClass(), "objectValue", term56893);
        setField(term56891, term56891.getClass(), "propListHead", term56892);
        setIntField(term56891, term56891.getClass(), "sourcePosition", 0);
        setField(term56891, term56891.getClass(), "jsType", null);
        setField(term56891, term56891.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term56830;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term56418, args);
        assertTrue(recursiveEquals(term56418, term56886));
        assertTrue(recursiveEquals(term56830, term56891));
    }

};


