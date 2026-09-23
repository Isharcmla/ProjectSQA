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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class ProcessCommonJSModules_process_627866047111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49325;
     Object term49417;
     Object term50588;
     Object term50589;

    public ProcessCommonJSModules_process_627866047111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49325 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term49325, term49325.getClass(), "compiler", null);
        term49417 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term49509 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term49601 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term49671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49763 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term49417, term49417.getClass(), "type", 37);
        setField(term49417, term49417.getClass(), "parent", null);
        setField(term49671, term49671.getClass(), "next", null);
        setIntField(term49671, term49671.getClass(), "type", 0);
        setField(term49671, term49671.getClass(), "first", null);
        setField(term49601, term49601.getClass(), "next", term49671);
        setIntField(term49601, term49601.getClass(), "type", 37);
        setField(term49601, term49601.getClass(), "first", null);
        setField(term49509, term49509.getClass(), "next", term49601);
        setIntField(term49509, term49509.getClass(), "type", 37);
        setField(term49763, term49763.getClass(), "next", null);
        setIntField(term49763, term49763.getClass(), "type", 0);
        setField(term49763, term49763.getClass(), "first", null);
        setField(term49509, term49509.getClass(), "first", term49763);
        setField(term49417, term49417.getClass(), "first", term49509);
        term50588 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term50588, term50588.getClass(), "compiler", null);
        setField(term50588, term50588.getClass(), "filenamePrefix", null);
        setBooleanField(term50588, term50588.getClass(), "reportDependencies", false);
        setField(term50588, term50588.getClass(), "module", null);
        term50589 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term50590 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term50591 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term50592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50593 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term50589, term50589.getClass(), "number", 0.0);
        setIntField(term50589, term50589.getClass(), "type", 37);
        setField(term50589, term50589.getClass(), "next", null);
        setDoubleField(term50590, term50590.getClass(), "number", 0.0);
        setIntField(term50590, term50590.getClass(), "type", 37);
        setDoubleField(term50591, term50591.getClass(), "number", 0.0);
        setIntField(term50591, term50591.getClass(), "type", 37);
        setIntField(term50592, term50592.getClass(), "type", 0);
        setField(term50592, term50592.getClass(), "next", null);
        setField(term50592, term50592.getClass(), "first", null);
        setField(term50592, term50592.getClass(), "last", null);
        setField(term50592, term50592.getClass(), "propListHead", null);
        setIntField(term50592, term50592.getClass(), "sourcePosition", 0);
        setField(term50592, term50592.getClass(), "jsType", null);
        setField(term50592, term50592.getClass(), "parent", null);
        setField(term50591, term50591.getClass(), "next", term50592);
        setField(term50591, term50591.getClass(), "first", null);
        setField(term50591, term50591.getClass(), "last", null);
        setField(term50591, term50591.getClass(), "propListHead", null);
        setIntField(term50591, term50591.getClass(), "sourcePosition", 0);
        setField(term50591, term50591.getClass(), "jsType", null);
        setField(term50591, term50591.getClass(), "parent", null);
        setField(term50590, term50590.getClass(), "next", term50591);
        setDoubleField(term50593, term50593.getClass(), "number", 0.0);
        setIntField(term50593, term50593.getClass(), "type", 0);
        setField(term50593, term50593.getClass(), "next", null);
        setField(term50593, term50593.getClass(), "first", null);
        setField(term50593, term50593.getClass(), "last", null);
        setField(term50593, term50593.getClass(), "propListHead", null);
        setIntField(term50593, term50593.getClass(), "sourcePosition", 0);
        setField(term50593, term50593.getClass(), "jsType", null);
        setField(term50593, term50593.getClass(), "parent", null);
        setField(term50590, term50590.getClass(), "first", term50593);
        setField(term50590, term50590.getClass(), "last", null);
        setField(term50590, term50590.getClass(), "propListHead", null);
        setIntField(term50590, term50590.getClass(), "sourcePosition", 0);
        setField(term50590, term50590.getClass(), "jsType", null);
        setField(term50590, term50590.getClass(), "parent", null);
        setField(term50589, term50589.getClass(), "first", term50590);
        setField(term50589, term50589.getClass(), "last", null);
        setField(term50589, term50589.getClass(), "propListHead", null);
        setIntField(term50589, term50589.getClass(), "sourcePosition", 0);
        setField(term50589, term50589.getClass(), "jsType", null);
        setField(term50589, term50589.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term49417;
        callMethod(klass, "process", argTypes, term49325, args);
        assertTrue(recursiveEquals(term49325, term50588));
        assertTrue(recursiveEquals(term49417, null));
    }

};


