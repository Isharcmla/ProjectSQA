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

public class PeepholeFoldConstants_tryFoldAndOr_425870290830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188671;
     Object term188763;
     Object term188849;
     Object term188941;
     Object term189102;
     Object term189103;
     Object term189104;
     Object term189105;
     Object term189055;

    public PeepholeFoldConstants_tryFoldAndOr_425870290830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188671 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term188763 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term188763, term188763.getClass(), "parent", null);
        setIntField(term188763, term188763.getClass(), "type", 0);
        term188849 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term188849, term188849.getClass(), "type", 0);
        term188941 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term189102 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term189102, term189102.getClass(), "currentTraversal", null);
        term189103 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term189103, term189103.getClass(), "number", 0.0);
        setIntField(term189103, term189103.getClass(), "type", 0);
        setField(term189103, term189103.getClass(), "next", null);
        setField(term189103, term189103.getClass(), "first", null);
        setField(term189103, term189103.getClass(), "last", null);
        setField(term189103, term189103.getClass(), "propListHead", null);
        setIntField(term189103, term189103.getClass(), "sourcePosition", 0);
        setField(term189103, term189103.getClass(), "jsType", null);
        setField(term189103, term189103.getClass(), "parent", null);
        term189104 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term189104, term189104.getClass(), "functionName", null);
        setBooleanField(term189104, term189104.getClass(), "itsNeedsActivation", false);
        setIntField(term189104, term189104.getClass(), "itsFunctionType", 0);
        setBooleanField(term189104, term189104.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term189104, term189104.getClass(), "encodedSourceStart", 0);
        setIntField(term189104, term189104.getClass(), "encodedSourceEnd", 0);
        setField(term189104, term189104.getClass(), "sourceName", null);
        setIntField(term189104, term189104.getClass(), "baseLineno", 0);
        setIntField(term189104, term189104.getClass(), "endLineno", 0);
        setField(term189104, term189104.getClass(), "functions", null);
        setField(term189104, term189104.getClass(), "regexps", null);
        setField(term189104, term189104.getClass(), "itsVariables", null);
        setField(term189104, term189104.getClass(), "itsConst", null);
        setField(term189104, term189104.getClass(), "itsVariableNames", null);
        setIntField(term189104, term189104.getClass(), "varStart", 0);
        setField(term189104, term189104.getClass(), "compilerData", null);
        setIntField(term189104, term189104.getClass(), "type", 0);
        setField(term189104, term189104.getClass(), "next", null);
        setField(term189104, term189104.getClass(), "first", null);
        setField(term189104, term189104.getClass(), "last", null);
        setField(term189104, term189104.getClass(), "propListHead", null);
        setIntField(term189104, term189104.getClass(), "sourcePosition", 0);
        setField(term189104, term189104.getClass(), "jsType", null);
        setField(term189104, term189104.getClass(), "parent", null);
        term189105 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term189105, term189105.getClass(), "str", null);
        setIntField(term189105, term189105.getClass(), "type", 0);
        setField(term189105, term189105.getClass(), "next", null);
        setField(term189105, term189105.getClass(), "first", null);
        setField(term189105, term189105.getClass(), "last", null);
        setField(term189105, term189105.getClass(), "propListHead", null);
        setIntField(term189105, term189105.getClass(), "sourcePosition", 0);
        setField(term189105, term189105.getClass(), "jsType", null);
        setField(term189105, term189105.getClass(), "parent", null);
        term189055 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term189055, term189055.getClass(), "number", 0.0);
        setIntField(term189055, term189055.getClass(), "type", 0);
        setField(term189055, term189055.getClass(), "next", null);
        setField(term189055, term189055.getClass(), "first", null);
        setField(term189055, term189055.getClass(), "last", null);
        setField(term189055, term189055.getClass(), "propListHead", null);
        setIntField(term189055, term189055.getClass(), "sourcePosition", 0);
        setField(term189055, term189055.getClass(), "jsType", null);
        setField(term189055, term189055.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term188763;
        args[1] = term188849;
        args[2] = term188941;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term188671, args);
        assertTrue(recursiveEquals(term188671, term189102));
        assertTrue(recursiveEquals(term188763, term189103));
        assertTrue(recursiveEquals(term188849, term189104));
        assertTrue(recursiveEquals(term188941, term189105));
        assertTrue(recursiveEquals(retValue, term189055));
    }

};


