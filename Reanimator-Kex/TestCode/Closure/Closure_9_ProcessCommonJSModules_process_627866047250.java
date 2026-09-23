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

public class ProcessCommonJSModules_process_627866047250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129583;
     Object term129675;

    public ProcessCommonJSModules_process_627866047250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129583 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term129583, term129583.getClass(), "compiler", null);
        term129675 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term129767 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term129837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129929 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term130021 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term129675, term129675.getClass(), "type", 37);
        setField(term129675, term129675.getClass(), "parent", null);
        setField(term129837, term129837.getClass(), "next", null);
        setIntField(term129837, term129837.getClass(), "type", 0);
        setField(term129837, term129837.getClass(), "first", null);
        setField(term129767, term129767.getClass(), "next", term129837);
        setIntField(term129767, term129767.getClass(), "type", 37);
        setField(term130021, term130021.getClass(), "next", null);
        setIntField(term130021, term130021.getClass(), "type", 0);
        setField(term130021, term130021.getClass(), "first", null);
        setField(term129929, term129929.getClass(), "next", term130021);
        setIntField(term129929, term129929.getClass(), "type", 37);
        setField(term129929, term129929.getClass(), "first", null);
        setField(term129767, term129767.getClass(), "first", term129929);
        setField(term129675, term129675.getClass(), "first", term129767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term129675;
        callMethod(klass, "process", argTypes, term129583, args);
    }

};


