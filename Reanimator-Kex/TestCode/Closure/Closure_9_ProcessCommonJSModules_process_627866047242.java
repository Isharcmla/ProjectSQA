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

public class ProcessCommonJSModules_process_627866047242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125693;
     Object term125763;

    public ProcessCommonJSModules_process_627866047242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125693 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term125693, term125693.getClass(), "compiler", null);
        term125763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125855 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term125947 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term126039 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term126131 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term126201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term125763, term125763.getClass(), "type", 0);
        setField(term125763, term125763.getClass(), "parent", null);
        setField(term125855, term125855.getClass(), "next", term125947);
        setIntField(term125855, term125855.getClass(), "type", 0);
        setField(term126131, term126131.getClass(), "next", term126201);
        setIntField(term126131, term126131.getClass(), "type", 37);
        setField(term126131, term126131.getClass(), "first", null);
        setField(term126039, term126039.getClass(), "next", term126131);
        setIntField(term126039, term126039.getClass(), "type", 0);
        setField(term126039, term126039.getClass(), "first", null);
        setField(term125855, term125855.getClass(), "first", term126039);
        setField(term125763, term125763.getClass(), "first", term125855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term125763;
        callMethod(klass, "process", argTypes, term125693, args);
    }

};


