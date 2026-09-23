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

public class LiveVariablesAnalysis_markAllParametersEscaped_89326452678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12561;

    public LiveVariablesAnalysis_markAllParametersEscaped_89326452678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12561 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        Object term12635 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term12705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term12705, term12705.getClass(), "first", term12775);
        setField(term12635, term12635.getClass(), "rootNode", term12705);
        setField(term12561, term12561.getClass(), "jsScope", term12635);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "markAllParametersEscaped", argTypes, term12561, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


