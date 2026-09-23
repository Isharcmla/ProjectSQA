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

public class IRFactory_setFileOverviewJsDoc_1930902895392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47239;
     Object term47507;

    public IRFactory_setFileOverviewJsDoc_1930902895392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47239 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term47325 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term47421 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term47421, term47421.getClass(), "type", -30);
        setField(term47421, term47421.getClass(), "next", null);
        setField(term47325, term47325.getClass(), "propListHead", term47421);
        setField(term47239, term47239.getClass(), "rootNodeJsDocHolder", term47325);
        term47507 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term47507;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term47239, args);
    }

};


