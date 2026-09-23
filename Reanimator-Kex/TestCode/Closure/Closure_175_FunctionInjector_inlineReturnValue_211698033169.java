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

public class FunctionInjector_inlineReturnValue_211698033169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15455;
     Object term15525;
     Object term15849;

    public FunctionInjector_inlineReturnValue_211698033169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15455 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term15455, term15455.getClass(), "safeNameIdSupplier", null);
        term15525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15687 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term15779 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term15525, term15525.getClass(), "parent", term15595);
        setField(term15687, term15687.getClass(), "next", term15779);
        setField(term15525, term15525.getClass(), "first", term15687);
        setIntField(term15525, term15525.getClass(), "type", 0);
        setField(term15525, term15525.getClass(), "propListHead", null);
        setIntField(term15525, term15525.getClass(), "sourcePosition", 16);
        term15849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term15849, term15849.getClass(), "last", term15919);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term15525;
        args[1] = term15849;
        callMethod(klass, "inlineReturnValue", argTypes, term15455, args);
    }

};


