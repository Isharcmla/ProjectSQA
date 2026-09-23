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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54317;
     Object term54387;
     Object term54732;
     Object term54733;
     Object term54666;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54317 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term54387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54477 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term54569 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term54477, term54477.getClass(), "next", term54569);
        setIntField(term54477, term54477.getClass(), "type", 0);
        setField(term54387, term54387.getClass(), "first", term54477);
        setIntField(term54387, term54387.getClass(), "type", 101);
        setField(term54387, term54387.getClass(), "parent", null);
        term54732 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term54732, term54732.getClass(), "currentTraversal", null);
        term54733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54734 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term54735 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term54733, term54733.getClass(), "type", 101);
        setField(term54733, term54733.getClass(), "next", null);
        setIntField(term54734, term54734.getClass(), "encodedSourceStart", 0);
        setIntField(term54734, term54734.getClass(), "encodedSourceEnd", 0);
        setField(term54734, term54734.getClass(), "sourceName", null);
        setIntField(term54734, term54734.getClass(), "baseLineno", 0);
        setIntField(term54734, term54734.getClass(), "endLineno", 0);
        setField(term54734, term54734.getClass(), "functions", null);
        setField(term54734, term54734.getClass(), "regexps", null);
        setField(term54734, term54734.getClass(), "itsVariables", null);
        setField(term54734, term54734.getClass(), "itsConst", null);
        setField(term54734, term54734.getClass(), "itsVariableNames", null);
        setIntField(term54734, term54734.getClass(), "varStart", 0);
        setField(term54734, term54734.getClass(), "compilerData", null);
        setIntField(term54734, term54734.getClass(), "type", 0);
        setDoubleField(term54735, term54735.getClass(), "number", 0.0);
        setIntField(term54735, term54735.getClass(), "type", 0);
        setField(term54735, term54735.getClass(), "next", null);
        setField(term54735, term54735.getClass(), "first", null);
        setField(term54735, term54735.getClass(), "last", null);
        setField(term54735, term54735.getClass(), "propListHead", null);
        setIntField(term54735, term54735.getClass(), "sourcePosition", 0);
        setField(term54735, term54735.getClass(), "jsType", null);
        setField(term54735, term54735.getClass(), "parent", null);
        setField(term54734, term54734.getClass(), "next", term54735);
        setField(term54734, term54734.getClass(), "first", null);
        setField(term54734, term54734.getClass(), "last", null);
        setField(term54734, term54734.getClass(), "propListHead", null);
        setIntField(term54734, term54734.getClass(), "sourcePosition", 0);
        setField(term54734, term54734.getClass(), "jsType", null);
        setField(term54734, term54734.getClass(), "parent", null);
        setField(term54733, term54733.getClass(), "first", term54734);
        setField(term54733, term54733.getClass(), "last", null);
        setField(term54733, term54733.getClass(), "propListHead", null);
        setIntField(term54733, term54733.getClass(), "sourcePosition", 0);
        setField(term54733, term54733.getClass(), "jsType", null);
        setField(term54733, term54733.getClass(), "parent", null);
        term54666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54668 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term54675 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term54666, term54666.getClass(), "type", 101);
        setField(term54666, term54666.getClass(), "next", null);
        setIntField(term54668, term54668.getClass(), "encodedSourceStart", 0);
        setIntField(term54668, term54668.getClass(), "encodedSourceEnd", 0);
        setField(term54668, term54668.getClass(), "sourceName", null);
        setIntField(term54668, term54668.getClass(), "baseLineno", 0);
        setIntField(term54668, term54668.getClass(), "endLineno", 0);
        setField(term54668, term54668.getClass(), "functions", null);
        setField(term54668, term54668.getClass(), "regexps", null);
        setField(term54668, term54668.getClass(), "itsVariables", null);
        setField(term54668, term54668.getClass(), "itsConst", null);
        setField(term54668, term54668.getClass(), "itsVariableNames", null);
        setIntField(term54668, term54668.getClass(), "varStart", 0);
        setField(term54668, term54668.getClass(), "compilerData", null);
        setIntField(term54668, term54668.getClass(), "type", 0);
        setDoubleField(term54675, term54675.getClass(), "number", 0.0);
        setIntField(term54675, term54675.getClass(), "type", 0);
        setField(term54675, term54675.getClass(), "next", null);
        setField(term54675, term54675.getClass(), "first", null);
        setField(term54675, term54675.getClass(), "last", null);
        setField(term54675, term54675.getClass(), "propListHead", null);
        setIntField(term54675, term54675.getClass(), "sourcePosition", 0);
        setField(term54675, term54675.getClass(), "jsType", null);
        setField(term54675, term54675.getClass(), "parent", null);
        setField(term54668, term54668.getClass(), "next", term54675);
        setField(term54668, term54668.getClass(), "first", null);
        setField(term54668, term54668.getClass(), "last", null);
        setField(term54668, term54668.getClass(), "propListHead", null);
        setIntField(term54668, term54668.getClass(), "sourcePosition", 0);
        setField(term54668, term54668.getClass(), "jsType", null);
        setField(term54668, term54668.getClass(), "parent", null);
        setField(term54666, term54666.getClass(), "first", term54668);
        setField(term54666, term54666.getClass(), "last", null);
        setField(term54666, term54666.getClass(), "propListHead", null);
        setIntField(term54666, term54666.getClass(), "sourcePosition", 0);
        setField(term54666, term54666.getClass(), "jsType", null);
        setField(term54666, term54666.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term54387;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term54317, args);
        assertTrue(recursiveEquals(term54317, term54732));
        assertTrue(recursiveEquals(term54387, term54733));
        assertTrue(recursiveEquals(retValue, term54666));
    }

};


