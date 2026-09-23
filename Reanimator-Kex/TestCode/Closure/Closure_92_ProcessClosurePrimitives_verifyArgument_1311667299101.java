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

public class ProcessClosurePrimitives_verifyArgument_1311667299101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42721;
     Object term42891;
     Object term42999;
     Object term43069;

    public ProcessClosurePrimitives_verifyArgument_1311667299101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42721 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term42801 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term42721, term42721.getClass(), "compiler", term42801);
        term42891 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term42891, term42891.getClass(), "sourceName", "");
        term42999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42999, term42999.getClass(), "type", 0);
        setIntField(term42999, term42999.getClass(), "sourcePosition", 0);
        term43069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43069, term43069.getClass(), "type", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term42891;
        args[1] = term42999;
        args[2] = term43069;
        callMethod(klass, "verifyArgument", argTypes, term42721, args);
    }

};


