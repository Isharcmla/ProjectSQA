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

public class PeepholeSubstituteAlternateSyntax_tryMinimizeCondition_448184963200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43290;
     Object term43360;

    public PeepholeSubstituteAlternateSyntax_tryMinimizeCondition_448184963200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43290 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term43360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term43360, term43360.getClass(), "parent", term43430);
        setIntField(term43360, term43360.getClass(), "type", 101);
        setField(term43360, term43360.getClass(), "first", term43500);
        setField(term43360, term43360.getClass(), "last", term43570);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term43360;
        callMethod(klass, "tryMinimizeCondition", argTypes, term43290, args);
    }

};


