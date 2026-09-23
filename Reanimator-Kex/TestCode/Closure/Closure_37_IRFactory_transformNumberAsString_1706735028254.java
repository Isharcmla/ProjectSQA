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

public class IRFactory_transformNumberAsString_1706735028254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69129;
     Object term69305;

    public IRFactory_transformNumberAsString_1706735028254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69129 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term69199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term69199, term69199.getClass(), "propListHead", null);
        setField(term69129, term69129.getClass(), "templateNode", term69199);
        term69305 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term69411 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        Object term69505 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.Comment"));
        setDoubleField(term69305, term69305.getClass(), "number", 0.0);
        setIntField(term69411, term69411.getClass(), "type", 24);
        setField(term69411, term69411.getClass(), "objectValue", term69505);
        setField(term69305, term69305.getClass(), "propListHead", term69411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term69305;
        callMethod(klass, "transformNumberAsString", argTypes, term69129, args);
    }

};


