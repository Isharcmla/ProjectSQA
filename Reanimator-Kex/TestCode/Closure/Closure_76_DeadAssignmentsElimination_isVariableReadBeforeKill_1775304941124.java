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

public class DeadAssignmentsElimination_isVariableReadBeforeKill_1775304941124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term754519;
     Object term754589;

    public DeadAssignmentsElimination_isVariableReadBeforeKill_1775304941124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term754519 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        term754589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term754659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term754729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term754799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term754869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term754939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755515 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term755585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term756005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term756075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term756145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term756215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term756285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term756355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term754589, term754589.getClass(), "type", 101);
        setIntField(term754729, term754729.getClass(), "type", 101);
        setIntField(term754869, term754869.getClass(), "type", 101);
        setIntField(term755009, term755009.getClass(), "type", 101);
        setIntField(term755149, term755149.getClass(), "type", 101);
        setIntField(term755289, term755289.getClass(), "type", 101);
        setField(term755359, term755359.getClass(), "next", term755359);
        setIntField(term755359, term755359.getClass(), "type", 101);
        setIntField(term755515, term755515.getClass(), "type", 101);
        setIntField(term755655, term755655.getClass(), "type", 101);
        setField(term755655, term755655.getClass(), "first", term755289);
        setField(term755655, term755655.getClass(), "last", null);
        setField(term755585, term755585.getClass(), "next", term755655);
        setField(term755515, term755515.getClass(), "first", term755585);
        setField(term755515, term755515.getClass(), "last", null);
        setField(term755429, term755429.getClass(), "next", term755515);
        setIntField(term755429, term755429.getClass(), "type", 101);
        setField(term755429, term755429.getClass(), "first", term755429);
        setField(term755429, term755429.getClass(), "last", null);
        setField(term755359, term755359.getClass(), "first", term755429);
        setField(term755359, term755359.getClass(), "last", null);
        setField(term755289, term755289.getClass(), "first", term755359);
        setField(term755289, term755289.getClass(), "last", null);
        setIntField(term755725, term755725.getClass(), "type", 101);
        setField(term755725, term755725.getClass(), "first", term754869);
        setField(term755725, term755725.getClass(), "last", null);
        setField(term755289, term755289.getClass(), "next", term755725);
        setField(term755219, term755219.getClass(), "next", term755289);
        setField(term755149, term755149.getClass(), "first", term755219);
        setField(term755149, term755149.getClass(), "last", null);
        setField(term755079, term755079.getClass(), "next", term755149);
        setField(term755009, term755009.getClass(), "first", term755079);
        setField(term755009, term755009.getClass(), "last", null);
        setField(term754939, term754939.getClass(), "next", term755009);
        setField(term754869, term754869.getClass(), "first", term754939);
        setField(term754869, term754869.getClass(), "last", null);
        setIntField(term755795, term755795.getClass(), "type", 101);
        setField(term755795, term755795.getClass(), "first", term755795);
        setIntField(term755865, term755865.getClass(), "type", 101);
        setField(term755865, term755865.getClass(), "first", term755865);
        setIntField(term755935, term755935.getClass(), "type", 101);
        setField(term755935, term755935.getClass(), "first", term755935);
        setIntField(term756005, term756005.getClass(), "type", 101);
        setField(term756005, term756005.getClass(), "first", term756005);
        setIntField(term756075, term756075.getClass(), "type", 101);
        setField(term756075, term756075.getClass(), "first", term756075);
        setIntField(term756145, term756145.getClass(), "type", 101);
        setField(term756145, term756145.getClass(), "first", term756145);
        setIntField(term756215, term756215.getClass(), "type", 101);
        setField(term756215, term756215.getClass(), "first", term756215);
        setIntField(term756285, term756285.getClass(), "type", 101);
        setField(term756285, term756285.getClass(), "first", term756285);
        setIntField(term756355, term756355.getClass(), "type", 101);
        setField(term756355, term756355.getClass(), "first", term756355);
        setField(term756355, term756355.getClass(), "next", term755429);
        setField(term756355, term756355.getClass(), "last", null);
        setField(term756285, term756285.getClass(), "next", term756355);
        setField(term756285, term756285.getClass(), "last", null);
        setField(term756215, term756215.getClass(), "next", term756285);
        setField(term756215, term756215.getClass(), "last", null);
        setField(term756145, term756145.getClass(), "next", term756215);
        setField(term756145, term756145.getClass(), "last", null);
        setField(term756075, term756075.getClass(), "next", term756145);
        setField(term756075, term756075.getClass(), "last", null);
        setField(term756005, term756005.getClass(), "next", term756075);
        setField(term756005, term756005.getClass(), "last", null);
        setField(term755935, term755935.getClass(), "next", term756005);
        setField(term755935, term755935.getClass(), "last", null);
        setField(term755865, term755865.getClass(), "next", term755935);
        setField(term755865, term755865.getClass(), "last", null);
        setField(term755795, term755795.getClass(), "next", term755865);
        setField(term755795, term755795.getClass(), "last", null);
        setField(term754869, term754869.getClass(), "next", term755795);
        setField(term754799, term754799.getClass(), "next", term754869);
        setField(term754729, term754729.getClass(), "first", term754799);
        setField(term754729, term754729.getClass(), "last", null);
        setField(term754659, term754659.getClass(), "next", term754729);
        setField(term754589, term754589.getClass(), "first", term754659);
        setField(term754589, term754589.getClass(), "last", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term754589;
        args[1] = null;
        callMethod(klass, "isVariableReadBeforeKill", argTypes, term754519, args);
    }

};


