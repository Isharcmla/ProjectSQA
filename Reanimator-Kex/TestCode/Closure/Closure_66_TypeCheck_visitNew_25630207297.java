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

public class TypeCheck_visitNew_25630207297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79673;
     Object term79743;

    public TypeCheck_visitNew_25630207297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79673 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term79743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79839 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term79743, term79743.getClass(), "first", term79743);
        setBooleanField(term79839, term79839.getClass(), "unknown", false);
        setField(term79743, term79743.getClass(), "jsType", term79839);
        setIntField(term79743, term79743.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term79743;
        callMethod(klass, "visitNew", argTypes, term79673, args);
    }

};


