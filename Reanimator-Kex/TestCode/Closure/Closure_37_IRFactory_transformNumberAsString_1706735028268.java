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

public class IRFactory_transformNumberAsString_1706735028268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75223;
     Object term75399;

    public IRFactory_transformNumberAsString_1706735028268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75223 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term75293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term75293, term75293.getClass(), "propListHead", null);
        setField(term75223, term75223.getClass(), "templateNode", term75293);
        term75399 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term75505 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term75399, term75399.getClass(), "number", 4.7276538462711316E18);
        setIntField(term75505, term75505.getClass(), "type", -25);
        setField(term75505, term75505.getClass(), "next", null);
        setField(term75399, term75399.getClass(), "propListHead", term75505);
        setIntField(term75399, term75399.getClass(), "lineno", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term75399;
        callMethod(klass, "transformNumberAsString", argTypes, term75223, args);
    }

};


