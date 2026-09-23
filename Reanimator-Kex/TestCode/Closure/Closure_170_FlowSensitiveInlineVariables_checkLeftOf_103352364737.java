package com.google.javascript.jscomp;

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
import java.lang.ClassCastException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FlowSensitiveInlineVariables_checkLeftOf_103352364737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4742;
     Object term4952;
     Object term5098;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term4812, term4812.getClass(), "first", term4882);
        setField(term4742, term4742.getClass(), "parent", term4812);
        term4952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term5098 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder$ExtendedTypeValidator"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term4742;
        args[1] = term4952;
        args[2] = term5098;
        try {
            callMethod(klass, "checkLeftOf", argTypes, null, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


