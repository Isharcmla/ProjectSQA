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

public class AnalyzePrototypeProperties_process_194761923634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30409;
     Object term30613;

    public AnalyzePrototypeProperties_process_194761923634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30409 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Object term30543 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        setBooleanField(term30409, term30409.getClass(), "canModifyExterns", true);
        setField(term30409, term30409.getClass(), "compiler", null);
        setField(term30409, term30409.getClass(), "globalNode", term30543);
        term30613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30613, term30613.getClass(), "type", 0);
        setIntField(term30683, term30683.getClass(), "type", 0);
        setField(term30683, term30683.getClass(), "parent", null);
        setField(term30613, term30613.getClass(), "parent", term30683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term30613;
        try {
            callMethod(klass, "process", argTypes, term30409, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


