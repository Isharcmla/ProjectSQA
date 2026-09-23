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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26699;
     Object term26785;
     Object term27733;
     Object term27734;
     Object term27670;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26699 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term26785 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term26871 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term26941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term26871, term26871.getClass(), "next", term26941);
        setField(term26785, term26785.getClass(), "first", term26871);
        setIntField(term26785, term26785.getClass(), "type", 33);
        term27733 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term27733, term27733.getClass(), "currentTraversal", null);
        term27734 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term27735 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term27736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term27734, term27734.getClass(), "functionName", null);
        setBooleanField(term27734, term27734.getClass(), "itsNeedsActivation", false);
        setIntField(term27734, term27734.getClass(), "itsFunctionType", 0);
        setBooleanField(term27734, term27734.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term27734, term27734.getClass(), "encodedSourceStart", 0);
        setIntField(term27734, term27734.getClass(), "encodedSourceEnd", 0);
        setField(term27734, term27734.getClass(), "sourceName", null);
        setIntField(term27734, term27734.getClass(), "baseLineno", 0);
        setIntField(term27734, term27734.getClass(), "endLineno", 0);
        setField(term27734, term27734.getClass(), "functions", null);
        setField(term27734, term27734.getClass(), "regexps", null);
        setField(term27734, term27734.getClass(), "itsVariables", null);
        setField(term27734, term27734.getClass(), "itsConst", null);
        setField(term27734, term27734.getClass(), "itsVariableNames", null);
        setIntField(term27734, term27734.getClass(), "varStart", 0);
        setField(term27734, term27734.getClass(), "compilerData", null);
        setIntField(term27734, term27734.getClass(), "type", 33);
        setField(term27734, term27734.getClass(), "next", null);
        setField(term27735, term27735.getClass(), "functionName", null);
        setBooleanField(term27735, term27735.getClass(), "itsNeedsActivation", false);
        setIntField(term27735, term27735.getClass(), "itsFunctionType", 0);
        setBooleanField(term27735, term27735.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term27735, term27735.getClass(), "encodedSourceStart", 0);
        setIntField(term27735, term27735.getClass(), "encodedSourceEnd", 0);
        setField(term27735, term27735.getClass(), "sourceName", null);
        setIntField(term27735, term27735.getClass(), "baseLineno", 0);
        setIntField(term27735, term27735.getClass(), "endLineno", 0);
        setField(term27735, term27735.getClass(), "functions", null);
        setField(term27735, term27735.getClass(), "regexps", null);
        setField(term27735, term27735.getClass(), "itsVariables", null);
        setField(term27735, term27735.getClass(), "itsConst", null);
        setField(term27735, term27735.getClass(), "itsVariableNames", null);
        setIntField(term27735, term27735.getClass(), "varStart", 0);
        setField(term27735, term27735.getClass(), "compilerData", null);
        setIntField(term27735, term27735.getClass(), "type", 0);
        setIntField(term27736, term27736.getClass(), "type", 0);
        setField(term27736, term27736.getClass(), "next", null);
        setField(term27736, term27736.getClass(), "first", null);
        setField(term27736, term27736.getClass(), "last", null);
        setField(term27736, term27736.getClass(), "propListHead", null);
        setIntField(term27736, term27736.getClass(), "sourcePosition", 0);
        setField(term27736, term27736.getClass(), "jsType", null);
        setField(term27736, term27736.getClass(), "parent", null);
        setField(term27735, term27735.getClass(), "next", term27736);
        setField(term27735, term27735.getClass(), "first", null);
        setField(term27735, term27735.getClass(), "last", null);
        setField(term27735, term27735.getClass(), "propListHead", null);
        setIntField(term27735, term27735.getClass(), "sourcePosition", 0);
        setField(term27735, term27735.getClass(), "jsType", null);
        setField(term27735, term27735.getClass(), "parent", null);
        setField(term27734, term27734.getClass(), "first", term27735);
        setField(term27734, term27734.getClass(), "last", null);
        setField(term27734, term27734.getClass(), "propListHead", null);
        setIntField(term27734, term27734.getClass(), "sourcePosition", 0);
        setField(term27734, term27734.getClass(), "jsType", null);
        setField(term27734, term27734.getClass(), "parent", null);
        term27670 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term27680 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term27690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term27670, term27670.getClass(), "functionName", null);
        setBooleanField(term27670, term27670.getClass(), "itsNeedsActivation", false);
        setIntField(term27670, term27670.getClass(), "itsFunctionType", 0);
        setBooleanField(term27670, term27670.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term27670, term27670.getClass(), "encodedSourceStart", 0);
        setIntField(term27670, term27670.getClass(), "encodedSourceEnd", 0);
        setField(term27670, term27670.getClass(), "sourceName", null);
        setIntField(term27670, term27670.getClass(), "baseLineno", 0);
        setIntField(term27670, term27670.getClass(), "endLineno", 0);
        setField(term27670, term27670.getClass(), "functions", null);
        setField(term27670, term27670.getClass(), "regexps", null);
        setField(term27670, term27670.getClass(), "itsVariables", null);
        setField(term27670, term27670.getClass(), "itsConst", null);
        setField(term27670, term27670.getClass(), "itsVariableNames", null);
        setIntField(term27670, term27670.getClass(), "varStart", 0);
        setField(term27670, term27670.getClass(), "compilerData", null);
        setIntField(term27670, term27670.getClass(), "type", 33);
        setField(term27670, term27670.getClass(), "next", null);
        setField(term27680, term27680.getClass(), "functionName", null);
        setBooleanField(term27680, term27680.getClass(), "itsNeedsActivation", false);
        setIntField(term27680, term27680.getClass(), "itsFunctionType", 0);
        setBooleanField(term27680, term27680.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term27680, term27680.getClass(), "encodedSourceStart", 0);
        setIntField(term27680, term27680.getClass(), "encodedSourceEnd", 0);
        setField(term27680, term27680.getClass(), "sourceName", null);
        setIntField(term27680, term27680.getClass(), "baseLineno", 0);
        setIntField(term27680, term27680.getClass(), "endLineno", 0);
        setField(term27680, term27680.getClass(), "functions", null);
        setField(term27680, term27680.getClass(), "regexps", null);
        setField(term27680, term27680.getClass(), "itsVariables", null);
        setField(term27680, term27680.getClass(), "itsConst", null);
        setField(term27680, term27680.getClass(), "itsVariableNames", null);
        setIntField(term27680, term27680.getClass(), "varStart", 0);
        setField(term27680, term27680.getClass(), "compilerData", null);
        setIntField(term27680, term27680.getClass(), "type", 0);
        setIntField(term27690, term27690.getClass(), "type", 0);
        setField(term27690, term27690.getClass(), "next", null);
        setField(term27690, term27690.getClass(), "first", null);
        setField(term27690, term27690.getClass(), "last", null);
        setField(term27690, term27690.getClass(), "propListHead", null);
        setIntField(term27690, term27690.getClass(), "sourcePosition", 0);
        setField(term27690, term27690.getClass(), "jsType", null);
        setField(term27690, term27690.getClass(), "parent", null);
        setField(term27680, term27680.getClass(), "next", term27690);
        setField(term27680, term27680.getClass(), "first", null);
        setField(term27680, term27680.getClass(), "last", null);
        setField(term27680, term27680.getClass(), "propListHead", null);
        setIntField(term27680, term27680.getClass(), "sourcePosition", 0);
        setField(term27680, term27680.getClass(), "jsType", null);
        setField(term27680, term27680.getClass(), "parent", null);
        setField(term27670, term27670.getClass(), "first", term27680);
        setField(term27670, term27670.getClass(), "last", null);
        setField(term27670, term27670.getClass(), "propListHead", null);
        setIntField(term27670, term27670.getClass(), "sourcePosition", 0);
        setField(term27670, term27670.getClass(), "jsType", null);
        setField(term27670, term27670.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term26785;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term26699, args);
        assertTrue(recursiveEquals(term26699, term27733));
        assertTrue(recursiveEquals(term26785, term27734));
        assertTrue(recursiveEquals(retValue, term27670));
    }

};


