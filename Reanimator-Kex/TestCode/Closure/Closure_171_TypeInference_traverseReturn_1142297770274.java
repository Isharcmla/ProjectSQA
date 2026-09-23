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

public class TypeInference_traverseReturn_1142297770274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term477435;
     Object term477505;

    public TypeInference_traverseReturn_1142297770274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term477435 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term477505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term477575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term477645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term477715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term477785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term477855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term477575, term477575.getClass(), "type", 92);
        setIntField(term477645, term477645.getClass(), "type", 92);
        setIntField(term477715, term477715.getClass(), "type", 92);
        setIntField(term477785, term477785.getClass(), "type", 92);
        setIntField(term477855, term477855.getClass(), "type", 43);
        setField(term477785, term477785.getClass(), "first", term477855);
        setField(term477715, term477715.getClass(), "first", term477785);
        setField(term477645, term477645.getClass(), "first", term477715);
        setField(term477575, term477575.getClass(), "first", term477645);
        setField(term477505, term477505.getClass(), "first", term477575);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term477505;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term477435, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


