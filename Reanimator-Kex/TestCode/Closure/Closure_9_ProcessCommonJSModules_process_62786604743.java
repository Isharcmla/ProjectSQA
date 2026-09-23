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

public class ProcessCommonJSModules_process_62786604743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11980;
     Object term12050;
     Object term13111;
     Object term13112;

    public ProcessCommonJSModules_process_62786604743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11980 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term11980, term11980.getClass(), "compiler", null);
        term12050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12050, term12050.getClass(), "type", 37);
        setField(term12050, term12050.getClass(), "parent", null);
        setField(term12050, term12050.getClass(), "first", null);
        term13111 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term13111, term13111.getClass(), "compiler", null);
        setField(term13111, term13111.getClass(), "filenamePrefix", null);
        setBooleanField(term13111, term13111.getClass(), "reportDependencies", false);
        setField(term13111, term13111.getClass(), "module", null);
        term13112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13112, term13112.getClass(), "type", 37);
        setField(term13112, term13112.getClass(), "next", null);
        setField(term13112, term13112.getClass(), "first", null);
        setField(term13112, term13112.getClass(), "last", null);
        setField(term13112, term13112.getClass(), "propListHead", null);
        setIntField(term13112, term13112.getClass(), "sourcePosition", 0);
        setField(term13112, term13112.getClass(), "jsType", null);
        setField(term13112, term13112.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term12050;
        callMethod(klass, "process", argTypes, term11980, args);
        assertTrue(recursiveEquals(term11980, term13111));
        assertTrue(recursiveEquals(term12050, null));
    }

};


