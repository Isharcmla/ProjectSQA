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

public class ProcessClosurePrimitives_verifySetCssNameMapping_905984150177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50817;
     Object term50987;
     Object term51057;

    public ProcessClosurePrimitives_verifySetCssNameMapping_905984150177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50817 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term50897 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term50817, term50817.getClass(), "compiler", term50897);
        term50987 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term51057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51057, term51057.getClass(), "type", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term50987;
        args[1] = term51057;
        args[2] = null;
        try {
            callMethod(klass, "verifySetCssNameMapping", argTypes, term50817, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


