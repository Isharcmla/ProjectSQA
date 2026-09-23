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

public class ProcessCommonJSModules_process_627866047259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133195;
     Object term133287;
     Object term133848;
     Object term133849;

    public ProcessCommonJSModules_process_627866047259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133195 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term133195, term133195.getClass(), "compiler", null);
        term133287 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term133379 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term133471 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term133287, term133287.getClass(), "type", 0);
        setField(term133287, term133287.getClass(), "parent", null);
        setField(term133379, term133379.getClass(), "next", null);
        setIntField(term133379, term133379.getClass(), "type", 37);
        setField(term133471, term133471.getClass(), "next", null);
        setIntField(term133471, term133471.getClass(), "type", 37);
        setField(term133471, term133471.getClass(), "first", null);
        setField(term133379, term133379.getClass(), "first", term133471);
        setField(term133287, term133287.getClass(), "first", term133379);
        term133848 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term133848, term133848.getClass(), "compiler", null);
        setField(term133848, term133848.getClass(), "filenamePrefix", null);
        setBooleanField(term133848, term133848.getClass(), "reportDependencies", false);
        setField(term133848, term133848.getClass(), "module", null);
        term133849 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term133850 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term133851 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term133849, term133849.getClass(), "number", 0.0);
        setIntField(term133849, term133849.getClass(), "type", 0);
        setField(term133849, term133849.getClass(), "next", null);
        setDoubleField(term133850, term133850.getClass(), "number", 0.0);
        setIntField(term133850, term133850.getClass(), "type", 37);
        setField(term133850, term133850.getClass(), "next", null);
        setDoubleField(term133851, term133851.getClass(), "number", 0.0);
        setIntField(term133851, term133851.getClass(), "type", 37);
        setField(term133851, term133851.getClass(), "next", null);
        setField(term133851, term133851.getClass(), "first", null);
        setField(term133851, term133851.getClass(), "last", null);
        setField(term133851, term133851.getClass(), "propListHead", null);
        setIntField(term133851, term133851.getClass(), "sourcePosition", 0);
        setField(term133851, term133851.getClass(), "jsType", null);
        setField(term133851, term133851.getClass(), "parent", null);
        setField(term133850, term133850.getClass(), "first", term133851);
        setField(term133850, term133850.getClass(), "last", null);
        setField(term133850, term133850.getClass(), "propListHead", null);
        setIntField(term133850, term133850.getClass(), "sourcePosition", 0);
        setField(term133850, term133850.getClass(), "jsType", null);
        setField(term133850, term133850.getClass(), "parent", null);
        setField(term133849, term133849.getClass(), "first", term133850);
        setField(term133849, term133849.getClass(), "last", null);
        setField(term133849, term133849.getClass(), "propListHead", null);
        setIntField(term133849, term133849.getClass(), "sourcePosition", 0);
        setField(term133849, term133849.getClass(), "jsType", null);
        setField(term133849, term133849.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term133287;
        callMethod(klass, "process", argTypes, term133195, args);
        assertTrue(recursiveEquals(term133195, term133848));
        assertTrue(recursiveEquals(term133287, null));
    }

};


