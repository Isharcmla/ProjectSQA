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

public class IRFactory_setFileOverviewJsDoc_1930902895396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48500;
     Object term48736;

    public IRFactory_setFileOverviewJsDoc_1930902895396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48500 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term48570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48666 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term48666, term48666.getClass(), "type", -30);
        setField(term48666, term48666.getClass(), "next", null);
        setField(term48570, term48570.getClass(), "propListHead", term48666);
        setField(term48500, term48500.getClass(), "rootNodeJsDocHolder", term48570);
        term48736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48832 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term48928 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term48832, term48832.getClass(), "type", -30);
        setField(term48832, term48832.getClass(), "next", term48928);
        setField(term48736, term48736.getClass(), "propListHead", term48832);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term48736;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term48500, args);
    }

};


