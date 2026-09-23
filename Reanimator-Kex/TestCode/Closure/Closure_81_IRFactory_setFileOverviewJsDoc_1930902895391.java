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

public class IRFactory_setFileOverviewJsDoc_1930902895391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46831;
     Object term47111;

    public IRFactory_setFileOverviewJsDoc_1930902895391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46831 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term46923 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term47019 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term47019, term47019.getClass(), "type", 29);
        setField(term47019, term47019.getClass(), "objectValue", null);
        setField(term46923, term46923.getClass(), "propListHead", term47019);
        setField(term46831, term46831.getClass(), "rootNodeJsDocHolder", term46923);
        term47111 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term47111;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term46831, args);
    }

};


