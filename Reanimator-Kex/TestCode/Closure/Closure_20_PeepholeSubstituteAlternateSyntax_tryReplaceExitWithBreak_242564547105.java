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

public class PeepholeSubstituteAlternateSyntax_tryReplaceExitWithBreak_242564547105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12952;
     Object term13022;

    public PeepholeSubstituteAlternateSyntax_tryReplaceExitWithBreak_242564547105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12952 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term13022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term13022, term13022.getClass(), "first", null);
        setIntField(term13022, term13022.getClass(), "type", 13);
        setField(term13022, term13022.getClass(), "parent", term13092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13022;
        try {
            callMethod(klass, "tryReplaceExitWithBreak", argTypes, term12952, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


