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

public class IRFactory_setFileOverviewJsDoc_1930902895377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44292;
     Object term44704;

    public IRFactory_setFileOverviewJsDoc_1930902895377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44292 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term44362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44752 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term44800 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term44634 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term44752, term44752.getClass(), "type", 29);
        setField(term44752, term44752.getClass(), "objectValue", null);
        setField(term44752, term44752.getClass(), "next", term44800);
        setField(term44362, term44362.getClass(), "propListHead", term44752);
        setField(term44292, term44292.getClass(), "rootNodeJsDocHolder", term44362);
        setField(term44292, term44292.getClass(), "fileOverviewInfo", term44634);
        term44704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term44704, term44704.getClass(), "propListHead", term44752);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term44704;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term44292, args);
    }

};


