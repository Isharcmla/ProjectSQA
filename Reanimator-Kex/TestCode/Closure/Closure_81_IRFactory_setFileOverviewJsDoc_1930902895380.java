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
import java.lang.Object;

public class IRFactory_setFileOverviewJsDoc_1930902895380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44937;

    public IRFactory_setFileOverviewJsDoc_1930902895380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44937 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term45007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45103 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term45199 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term45269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45103, term45103.getClass(), "type", -30);
        setIntField(term45199, term45199.getClass(), "type", 29);
        setField(term45199, term45199.getClass(), "objectValue", term45269);
        setField(term45103, term45103.getClass(), "next", term45199);
        setField(term45007, term45007.getClass(), "propListHead", term45103);
        setField(term44937, term44937.getClass(), "rootNodeJsDocHolder", term45007);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term44937, args);
    }

};


