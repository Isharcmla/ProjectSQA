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

public class TypeCheck_visitNew_25630207328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89126;
     Object term89216;
     Object term89286;

    public TypeCheck_visitNew_25630207328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89126 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term89126, term89126.getClass(), "noTypeCheckSection", 0);
        term89216 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term89286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89452 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setBooleanField(term89452, term89452.getClass(), "unknown", false);
        setField(term89356, term89356.getClass(), "jsType", term89452);
        setIntField(term89356, term89356.getClass(), "type", -34);
        setIntField(term89356, term89356.getClass(), "sourcePosition", 0);
        setField(term89286, term89286.getClass(), "first", term89356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term89216;
        args[1] = term89286;
        callMethod(klass, "visitNew", argTypes, term89126, args);
    }

};


