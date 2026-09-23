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

public class ProcessClosurePrimitives_reportBadBaseClassUse_96286694075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33682;
     Object term33852;
     Object term33922;

    public ProcessClosurePrimitives_reportBadBaseClassUse_96286694075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33682 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term33762 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term33682, term33682.getClass(), "compiler", term33762);
        term33852 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term33852, term33852.getClass(), "sourceName", null);
        term33922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33922, term33922.getClass(), "sourcePosition", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term33852;
        args[1] = term33922;
        args[2] = "OFF";
        try {
            callMethod(klass, "reportBadBaseClassUse", argTypes, term33682, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


