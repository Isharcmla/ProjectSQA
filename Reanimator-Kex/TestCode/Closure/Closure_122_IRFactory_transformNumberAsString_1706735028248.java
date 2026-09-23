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

public class IRFactory_transformNumberAsString_1706735028248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99940;
     Object term100116;

    public IRFactory_transformNumberAsString_1706735028248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99940 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term100010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term100010, term100010.getClass(), "propListHead", null);
        setField(term99940, term99940.getClass(), "templateNode", term100010);
        term100116 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term100222 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        Object term100316 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.Comment"));
        setDoubleField(term100116, term100116.getClass(), "number", 0.0);
        setIntField(term100222, term100222.getClass(), "type", 24);
        setField(term100222, term100222.getClass(), "objectValue", term100316);
        setField(term100116, term100116.getClass(), "propListHead", term100222);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term100116;
        callMethod(klass, "transformNumberAsString", argTypes, term99940, args);
    }

};


