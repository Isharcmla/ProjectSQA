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

public class IRFactory_transformNumberAsString_1706735028233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71850;
     Object term72156;

    public IRFactory_transformNumberAsString_1706735028233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71850 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term71942 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term72050 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term71942, term71942.getClass(), "propListHead", term72050);
        setField(term71850, term71850.getClass(), "templateNode", term71942);
        term72156 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term72262 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term72156, term72156.getClass(), "number", -4.3726076603111834E18);
        setIntField(term72262, term72262.getClass(), "type", 24);
        setField(term72262, term72262.getClass(), "objectValue", null);
        setField(term72156, term72156.getClass(), "propListHead", term72262);
        setIntField(term72156, term72156.getClass(), "lineno", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term72156;
        callMethod(klass, "transformNumberAsString", argTypes, term71850, args);
    }

};


