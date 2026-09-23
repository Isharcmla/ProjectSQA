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

public class AnalyzePrototypeProperties_process_194761923624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23064;
     Object term23268;

    public AnalyzePrototypeProperties_process_194761923624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23064 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Object term23198 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        setBooleanField(term23064, term23064.getClass(), "canModifyExterns", true);
        setField(term23064, term23064.getClass(), "compiler", null);
        setField(term23064, term23064.getClass(), "globalNode", term23198);
        term23268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23268, term23268.getClass(), "type", -133);
        setField(term23268, term23268.getClass(), "parent", term23338);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term23268;
        try {
            callMethod(klass, "process", argTypes, term23064, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


