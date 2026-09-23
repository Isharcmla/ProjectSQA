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

public class ProcessCommonJSModules_process_62786604779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30634;
     Object term30704;

    public ProcessCommonJSModules_process_62786604779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30634 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term30634, term30634.getClass(), "compiler", null);
        term30704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30796 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term30866 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30958 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term30704, term30704.getClass(), "type", 0);
        setField(term30704, term30704.getClass(), "parent", null);
        setField(term30866, term30866.getClass(), "next", null);
        setIntField(term30866, term30866.getClass(), "type", 33);
        setField(term30866, term30866.getClass(), "first", null);
        setField(term30796, term30796.getClass(), "next", term30866);
        setIntField(term30796, term30796.getClass(), "type", 37);
        setField(term30958, term30958.getClass(), "next", null);
        setIntField(term30958, term30958.getClass(), "type", 0);
        setField(term30958, term30958.getClass(), "first", null);
        setField(term30796, term30796.getClass(), "first", term30958);
        setField(term30704, term30704.getClass(), "first", term30796);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term30704;
        try {
            callMethod(klass, "process", argTypes, term30634, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


