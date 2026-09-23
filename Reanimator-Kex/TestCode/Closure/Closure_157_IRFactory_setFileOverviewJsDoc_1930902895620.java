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

public class IRFactory_setFileOverviewJsDoc_1930902895620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132990;
     Object term133226;

    public IRFactory_setFileOverviewJsDoc_1930902895620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132990 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term133060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133274 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term133274, term133274.getClass(), "type", 29);
        setField(term133274, term133274.getClass(), "objectValue", null);
        setField(term133274, term133274.getClass(), "next", term133274);
        setField(term133060, term133060.getClass(), "propListHead", term133274);
        setField(term132990, term132990.getClass(), "rootNodeJsDocHolder", term133060);
        term133226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term133226, term133226.getClass(), "propListHead", term133274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term133226;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term132990, args);
    }

};


