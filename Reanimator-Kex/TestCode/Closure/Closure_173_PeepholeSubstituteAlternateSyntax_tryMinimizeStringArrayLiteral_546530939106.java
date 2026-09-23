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

public class PeepholeSubstituteAlternateSyntax_tryMinimizeStringArrayLiteral_546530939106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173412;
     Object term173482;

    public PeepholeSubstituteAlternateSyntax_tryMinimizeStringArrayLiteral_546530939106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173412 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term173412, term173412.getClass(), "late", true);
        term173482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term173552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term173622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term173622, term173622.getClass(), "next", term173622);
        setField(term173552, term173552.getClass(), "next", term173622);
        setField(term173482, term173482.getClass(), "first", term173552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term173482;
        callMethod(klass, "tryMinimizeStringArrayLiteral", argTypes, term173412, args);
    }

};


