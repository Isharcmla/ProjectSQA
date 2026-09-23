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

public class IRFactory_setFileOverviewJsDoc_1930902895370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43140;
     Object term43472;

    public IRFactory_setFileOverviewJsDoc_1930902895370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43140 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term43210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43306 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term43402 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term43306, term43306.getClass(), "type", -30);
        setIntField(term43402, term43402.getClass(), "type", 29);
        setField(term43402, term43402.getClass(), "objectValue", null);
        setField(term43306, term43306.getClass(), "next", term43402);
        setField(term43210, term43210.getClass(), "propListHead", term43306);
        setField(term43140, term43140.getClass(), "rootNodeJsDocHolder", term43210);
        term43472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term43472;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term43140, args);
    }

};


