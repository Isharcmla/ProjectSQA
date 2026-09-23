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

public class IRFactory_transformNumberAsString_1706735028270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75675;
     Object term75851;

    public IRFactory_transformNumberAsString_1706735028270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75675 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term75745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term75745, term75745.getClass(), "propListHead", null);
        setField(term75675, term75675.getClass(), "templateNode", term75745);
        term75851 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        setDoubleField(term75851, term75851.getClass(), "number", 4.6071824188000174E18);
        setField(term75851, term75851.getClass(), "propListHead", null);
        setIntField(term75851, term75851.getClass(), "lineno", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term75851;
        callMethod(klass, "transformNumberAsString", argTypes, term75675, args);
    }

};


