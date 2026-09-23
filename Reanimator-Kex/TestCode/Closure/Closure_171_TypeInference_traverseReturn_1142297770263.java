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

public class TypeInference_traverseReturn_1142297770263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369687;
     Object term369757;

    public TypeInference_traverseReturn_1142297770263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369687 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term369757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term369827, term369827.getClass(), "type", 92);
        setIntField(term369897, term369897.getClass(), "type", 92);
        setIntField(term369967, term369967.getClass(), "type", 92);
        setIntField(term370037, term370037.getClass(), "type", 92);
        setIntField(term370107, term370107.getClass(), "type", 92);
        setIntField(term370177, term370177.getClass(), "type", 92);
        setIntField(term370247, term370247.getClass(), "type", 92);
        setIntField(term370317, term370317.getClass(), "type", 92);
        setIntField(term370387, term370387.getClass(), "type", 92);
        setIntField(term370457, term370457.getClass(), "type", 140);
        setField(term370387, term370387.getClass(), "first", term370457);
        setField(term370317, term370317.getClass(), "first", term370387);
        setField(term370247, term370247.getClass(), "first", term370317);
        setField(term370177, term370177.getClass(), "first", term370247);
        setField(term370107, term370107.getClass(), "first", term370177);
        setField(term370037, term370037.getClass(), "first", term370107);
        setField(term369967, term369967.getClass(), "first", term370037);
        setField(term369897, term369897.getClass(), "first", term369967);
        setField(term369827, term369827.getClass(), "first", term369897);
        setField(term369757, term369757.getClass(), "first", term369827);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term369757;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term369687, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


