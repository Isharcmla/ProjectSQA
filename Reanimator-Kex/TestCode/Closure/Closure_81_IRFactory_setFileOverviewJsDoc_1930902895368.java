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

public class IRFactory_setFileOverviewJsDoc_1930902895368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42305;
     Object term42541;

    public IRFactory_setFileOverviewJsDoc_1930902895368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42305 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term42375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42471 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term42471, term42471.getClass(), "type", 29);
        setField(term42471, term42471.getClass(), "objectValue", null);
        setField(term42375, term42375.getClass(), "propListHead", term42471);
        setField(term42305, term42305.getClass(), "rootNodeJsDocHolder", term42375);
        term42541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term42541, term42541.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term42541;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term42305, args);
    }

};


