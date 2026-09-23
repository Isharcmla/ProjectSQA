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

public class IRFactory_setFileOverviewJsDoc_1930902895384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45422;
     Object term45754;

    public IRFactory_setFileOverviewJsDoc_1930902895384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45422 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term45492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45588 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term45684 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term45588, term45588.getClass(), "type", 0);
        setIntField(term45684, term45684.getClass(), "type", 0);
        setField(term45684, term45684.getClass(), "next", null);
        setField(term45588, term45588.getClass(), "next", term45684);
        setField(term45492, term45492.getClass(), "propListHead", term45588);
        setField(term45422, term45422.getClass(), "rootNodeJsDocHolder", term45492);
        term45754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term45754;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term45422, args);
    }

};


