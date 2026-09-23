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

public class ProcessCommonJSModules_process_627866047171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85262;
     Object term85332;

    public ProcessCommonJSModules_process_627866047171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85262 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term85262, term85262.getClass(), "compiler", null);
        term85332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85424 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term85494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85586 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term85678 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term85770 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term85840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term85332, term85332.getClass(), "type", 0);
        setField(term85332, term85332.getClass(), "parent", null);
        setField(term85424, term85424.getClass(), "next", term85494);
        setIntField(term85424, term85424.getClass(), "type", 0);
        setField(term85770, term85770.getClass(), "next", term85840);
        setIntField(term85770, term85770.getClass(), "type", 37);
        setField(term85770, term85770.getClass(), "first", null);
        setField(term85678, term85678.getClass(), "next", term85770);
        setIntField(term85678, term85678.getClass(), "type", 37);
        setField(term85678, term85678.getClass(), "first", null);
        setField(term85586, term85586.getClass(), "next", term85678);
        setIntField(term85586, term85586.getClass(), "type", 37);
        setField(term85586, term85586.getClass(), "first", null);
        setField(term85424, term85424.getClass(), "first", term85586);
        setField(term85332, term85332.getClass(), "first", term85424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term85332;
        callMethod(klass, "process", argTypes, term85262, args);
    }

};


