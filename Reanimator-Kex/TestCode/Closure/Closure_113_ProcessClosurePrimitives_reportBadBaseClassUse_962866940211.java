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

public class ProcessClosurePrimitives_reportBadBaseClassUse_962866940211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59467;
     Object term59747;

    public ProcessClosurePrimitives_reportBadBaseClassUse_962866940211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59467 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term59547 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term59657 = newInstance(Class.forName("com.google.javascript.jscomp.ShowByPathWarningsGuard"));
        setField(term59547, term59547.getClass(), "warningsGuard", term59657);
        setField(term59467, term59467.getClass(), "compiler", term59547);
        term59747 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term59747, term59747.getClass(), "sourceName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term59747;
        args[1] = null;
        args[2] = "OFF";
        try {
            callMethod(klass, "reportBadBaseClassUse", argTypes, term59467, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


