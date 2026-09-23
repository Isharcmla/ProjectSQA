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

public class IRFactory_setFileOverviewJsDoc_1930902895394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47870;
     Object term48138;

    public IRFactory_setFileOverviewJsDoc_1930902895394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47870 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term47956 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term48052 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term48052, term48052.getClass(), "type", 29);
        setField(term48052, term48052.getClass(), "objectValue", null);
        setField(term47956, term47956.getClass(), "propListHead", term48052);
        setField(term47870, term47870.getClass(), "rootNodeJsDocHolder", term47956);
        term48138 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term48138;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term47870, args);
    }

};


