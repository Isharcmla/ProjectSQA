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

public class IRFactory_setFileOverviewJsDoc_1930902895409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71441;
     Object term71677;
     Object term71703;
     Object term71706;

    public IRFactory_setFileOverviewJsDoc_1930902895409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71441 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term71511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71607 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term71607, term71607.getClass(), "type", -30);
        setField(term71607, term71607.getClass(), "next", null);
        setField(term71511, term71511.getClass(), "propListHead", term71607);
        setField(term71441, term71441.getClass(), "rootNodeJsDocHolder", term71511);
        term71677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term71677, term71677.getClass(), "propListHead", null);
        term71703 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term71704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71705 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term71703, term71703.getClass(), "sourceString", null);
        setField(term71703, term71703.getClass(), "sourceName", null);
        setField(term71703, term71703.getClass(), "config", null);
        setField(term71703, term71703.getClass(), "errorReporter", null);
        setField(term71703, term71703.getClass(), "transformDispatcher", null);
        setField(term71703, term71703.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term71703, term71703.getClass(), "reservedKeywords", null);
        setIntField(term71704, term71704.getClass(), "type", 0);
        setField(term71704, term71704.getClass(), "next", null);
        setField(term71704, term71704.getClass(), "first", null);
        setField(term71704, term71704.getClass(), "last", null);
        setField(term71705, term71705.getClass(), "next", null);
        setIntField(term71705, term71705.getClass(), "type", -30);
        setIntField(term71705, term71705.getClass(), "intValue", 0);
        setField(term71705, term71705.getClass(), "objectValue", null);
        setField(term71704, term71704.getClass(), "propListHead", term71705);
        setIntField(term71704, term71704.getClass(), "sourcePosition", 0);
        setField(term71704, term71704.getClass(), "jsType", null);
        setField(term71704, term71704.getClass(), "parent", null);
        setField(term71703, term71703.getClass(), "rootNodeJsDocHolder", term71704);
        setField(term71703, term71703.getClass(), "fileLevelJsDocBuilder", null);
        setField(term71703, term71703.getClass(), "fileOverviewInfo", null);
        setField(term71703, term71703.getClass(), "templateNode", null);
        term71706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term71706, term71706.getClass(), "type", 0);
        setField(term71706, term71706.getClass(), "next", null);
        setField(term71706, term71706.getClass(), "first", null);
        setField(term71706, term71706.getClass(), "last", null);
        setField(term71706, term71706.getClass(), "propListHead", null);
        setIntField(term71706, term71706.getClass(), "sourcePosition", 0);
        setField(term71706, term71706.getClass(), "jsType", null);
        setField(term71706, term71706.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term71677;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term71441, args);
        assertTrue(recursiveEquals(term71441, term71703));
        assertTrue(recursiveEquals(term71677, term71706));
    }

};


