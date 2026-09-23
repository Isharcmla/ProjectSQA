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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeSubstituteAlternateSyntax_tryMinimizeNot_1707946379155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19434;
     Object term19504;

    public PeepholeSubstituteAlternateSyntax_tryMinimizeNot_1707946379155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19434 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term19504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term19504, term19504.getClass(), "parent", term19574);
        setField(term19504, term19504.getClass(), "first", term19504);
        setIntField(term19504, term19504.getClass(), "type", 46);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term19504;
        try {
            callMethod(klass, "tryMinimizeNot", argTypes, term19434, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


