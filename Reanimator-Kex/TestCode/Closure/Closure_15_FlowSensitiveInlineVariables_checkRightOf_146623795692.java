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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FlowSensitiveInlineVariables_checkRightOf_146623795692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23903;
     Object term24087;
     Object term24225;

    public FlowSensitiveInlineVariables_checkRightOf_146623795692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23903 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term23995 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term23903, term23903.getClass(), "next", term23995);
        term24087 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term24225 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder$ThisTypeValidator"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term23903;
        args[1] = term24087;
        args[2] = term24225;
        callMethod(klass, "checkRightOf", argTypes, null, args);
    }

};


