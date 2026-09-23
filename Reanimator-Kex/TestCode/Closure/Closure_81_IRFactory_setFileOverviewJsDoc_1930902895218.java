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

public class IRFactory_setFileOverviewJsDoc_1930902895218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24266;
     Object term24582;
     Object term24635;
     Object term24639;

    public IRFactory_setFileOverviewJsDoc_1930902895218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24266 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term24336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24432 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term24512 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term24432, term24432.getClass(), "type", -30);
        setField(term24432, term24432.getClass(), "next", null);
        setField(term24336, term24336.getClass(), "propListHead", term24432);
        setField(term24266, term24266.getClass(), "rootNodeJsDocHolder", term24336);
        setField(term24266, term24266.getClass(), "fileOverviewInfo", term24512);
        term24582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term24582, term24582.getClass(), "propListHead", null);
        term24635 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term24636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24637 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term24638 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term24635, term24635.getClass(), "sourceString", null);
        setField(term24635, term24635.getClass(), "sourceName", null);
        setField(term24635, term24635.getClass(), "config", null);
        setField(term24635, term24635.getClass(), "errorReporter", null);
        setField(term24635, term24635.getClass(), "transformDispatcher", null);
        setField(term24635, term24635.getClass(), "ALLOWED_DIRECTIVES", null);
        setIntField(term24636, term24636.getClass(), "type", 0);
        setField(term24636, term24636.getClass(), "next", null);
        setField(term24636, term24636.getClass(), "first", null);
        setField(term24636, term24636.getClass(), "last", null);
        setField(term24637, term24637.getClass(), "next", null);
        setIntField(term24637, term24637.getClass(), "type", -30);
        setIntField(term24637, term24637.getClass(), "intValue", 0);
        setField(term24637, term24637.getClass(), "objectValue", null);
        setField(term24636, term24636.getClass(), "propListHead", term24637);
        setIntField(term24636, term24636.getClass(), "sourcePosition", 0);
        setField(term24636, term24636.getClass(), "jsType", null);
        setField(term24636, term24636.getClass(), "parent", null);
        setField(term24635, term24635.getClass(), "rootNodeJsDocHolder", term24636);
        setField(term24635, term24635.getClass(), "fileLevelJsDocBuilder", null);
        setField(term24638, term24638.getClass(), "info", null);
        setField(term24638, term24638.getClass(), "documentation", null);
        setField(term24638, term24638.getClass(), "sourceName", null);
        setField(term24638, term24638.getClass(), "visibility", null);
        setIntField(term24638, term24638.getClass(), "bitset", 0);
        setField(term24638, term24638.getClass(), "type", null);
        setField(term24638, term24638.getClass(), "thisType", null);
        setBooleanField(term24638, term24638.getClass(), "includeDocumentation", false);
        setField(term24635, term24635.getClass(), "fileOverviewInfo", term24638);
        setField(term24635, term24635.getClass(), "templateNode", null);
        term24639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24640 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term24641 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term24639, term24639.getClass(), "type", 0);
        setField(term24639, term24639.getClass(), "next", null);
        setField(term24639, term24639.getClass(), "first", null);
        setField(term24639, term24639.getClass(), "last", null);
        setField(term24640, term24640.getClass(), "next", null);
        setIntField(term24640, term24640.getClass(), "type", 29);
        setIntField(term24640, term24640.getClass(), "intValue", 0);
        setField(term24641, term24641.getClass(), "info", null);
        setField(term24641, term24641.getClass(), "documentation", null);
        setField(term24641, term24641.getClass(), "sourceName", null);
        setField(term24641, term24641.getClass(), "visibility", null);
        setIntField(term24641, term24641.getClass(), "bitset", 0);
        setField(term24641, term24641.getClass(), "type", null);
        setField(term24641, term24641.getClass(), "thisType", null);
        setBooleanField(term24641, term24641.getClass(), "includeDocumentation", false);
        setField(term24640, term24640.getClass(), "objectValue", term24641);
        setField(term24639, term24639.getClass(), "propListHead", term24640);
        setIntField(term24639, term24639.getClass(), "sourcePosition", 0);
        setField(term24639, term24639.getClass(), "jsType", null);
        setField(term24639, term24639.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term24582;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term24266, args);
        assertTrue(recursiveEquals(term24266, term24635));
        assertTrue(recursiveEquals(term24582, term24639));
    }

};


