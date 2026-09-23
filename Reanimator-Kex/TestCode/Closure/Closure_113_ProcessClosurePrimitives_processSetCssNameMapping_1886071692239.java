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

public class ProcessClosurePrimitives_processSetCssNameMapping_1886071692239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69111;
     Object term69281;
     Object term69351;

    public ProcessClosurePrimitives_processSetCssNameMapping_1886071692239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69111 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term69191 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term69111, term69111.getClass(), "compiler", term69191);
        term69281 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term69351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term69421, term69421.getClass(), "next", term69421);
        setIntField(term69421, term69421.getClass(), "type", 0);
        setField(term69351, term69351.getClass(), "first", term69421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term69281;
        args[1] = term69351;
        args[2] = null;
        callMethod(klass, "processSetCssNameMapping", argTypes, term69111, args);
    }

};


