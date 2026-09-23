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

public class PeepholeFoldConstants_tryFoldComparison_848443179289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57418;
     Object term57510;
     Object term57602;
     Object term57688;
     Object term58039;
     Object term58040;
     Object term58041;
     Object term58042;
     Object term58010;

    public PeepholeFoldConstants_tryFoldComparison_848443179289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57418 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term57510 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term57510, term57510.getClass(), "type", 14);
        term57602 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term57602, term57602.getClass(), "type", 14);
        term57688 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term58039 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term58039, term58039.getClass(), "currentTraversal", null);
        term58040 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term58040, term58040.getClass(), "number", 0.0);
        setIntField(term58040, term58040.getClass(), "type", 14);
        setField(term58040, term58040.getClass(), "next", null);
        setField(term58040, term58040.getClass(), "first", null);
        setField(term58040, term58040.getClass(), "last", null);
        setField(term58040, term58040.getClass(), "propListHead", null);
        setIntField(term58040, term58040.getClass(), "sourcePosition", 0);
        setField(term58040, term58040.getClass(), "jsType", null);
        setField(term58040, term58040.getClass(), "parent", null);
        term58041 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term58041, term58041.getClass(), "number", 0.0);
        setIntField(term58041, term58041.getClass(), "type", 14);
        setField(term58041, term58041.getClass(), "next", null);
        setField(term58041, term58041.getClass(), "first", null);
        setField(term58041, term58041.getClass(), "last", null);
        setField(term58041, term58041.getClass(), "propListHead", null);
        setIntField(term58041, term58041.getClass(), "sourcePosition", 0);
        setField(term58041, term58041.getClass(), "jsType", null);
        setField(term58041, term58041.getClass(), "parent", null);
        term58042 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term58042, term58042.getClass(), "functionName", null);
        setBooleanField(term58042, term58042.getClass(), "itsNeedsActivation", false);
        setIntField(term58042, term58042.getClass(), "itsFunctionType", 0);
        setBooleanField(term58042, term58042.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term58042, term58042.getClass(), "encodedSourceStart", 0);
        setIntField(term58042, term58042.getClass(), "encodedSourceEnd", 0);
        setField(term58042, term58042.getClass(), "sourceName", null);
        setIntField(term58042, term58042.getClass(), "baseLineno", 0);
        setIntField(term58042, term58042.getClass(), "endLineno", 0);
        setField(term58042, term58042.getClass(), "functions", null);
        setField(term58042, term58042.getClass(), "regexps", null);
        setField(term58042, term58042.getClass(), "itsVariables", null);
        setField(term58042, term58042.getClass(), "itsConst", null);
        setField(term58042, term58042.getClass(), "itsVariableNames", null);
        setIntField(term58042, term58042.getClass(), "varStart", 0);
        setField(term58042, term58042.getClass(), "compilerData", null);
        setIntField(term58042, term58042.getClass(), "type", 0);
        setField(term58042, term58042.getClass(), "next", null);
        setField(term58042, term58042.getClass(), "first", null);
        setField(term58042, term58042.getClass(), "last", null);
        setField(term58042, term58042.getClass(), "propListHead", null);
        setIntField(term58042, term58042.getClass(), "sourcePosition", 0);
        setField(term58042, term58042.getClass(), "jsType", null);
        setField(term58042, term58042.getClass(), "parent", null);
        term58010 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term58010, term58010.getClass(), "number", 0.0);
        setIntField(term58010, term58010.getClass(), "type", 14);
        setField(term58010, term58010.getClass(), "next", null);
        setField(term58010, term58010.getClass(), "first", null);
        setField(term58010, term58010.getClass(), "last", null);
        setField(term58010, term58010.getClass(), "propListHead", null);
        setIntField(term58010, term58010.getClass(), "sourcePosition", 0);
        setField(term58010, term58010.getClass(), "jsType", null);
        setField(term58010, term58010.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term57510;
        args[1] = term57602;
        args[2] = term57688;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term57418, args);
        assertTrue(recursiveEquals(term57418, term58039));
        assertTrue(recursiveEquals(term57510, term58040));
        assertTrue(recursiveEquals(term57602, term58041));
        assertTrue(recursiveEquals(term57688, term58042));
        assertTrue(recursiveEquals(retValue, term58010));
    }

};


