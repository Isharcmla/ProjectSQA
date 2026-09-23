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

public class FunctionToBlockMutator_hasReturnAtExit_42329491224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term634;
     Object term3569;

    public FunctionToBlockMutator_hasReturnAtExit_42329491224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term647 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term657 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term634, term634.getClass(), "type", 991356662);
        setIntField(term636, term636.getClass(), "type", -1896376975);
        setIntField(term638, term638.getClass(), "type", 0);
        setField(term638, term638.getClass(), "next", null);
        setField(term638, term638.getClass(), "first", null);
        setField(term638, term638.getClass(), "last", null);
        setField(term638, term638.getClass(), "propListHead", null);
        setIntField(term638, term638.getClass(), "sourcePosition", 0);
        setField(term638, term638.getClass(), "jsType", null);
        setField(term638, term638.getClass(), "parent", null);
        setField(term636, term636.getClass(), "next", term638);
        setIntField(term641, term641.getClass(), "type", 0);
        setField(term641, term641.getClass(), "next", null);
        setField(term641, term641.getClass(), "first", null);
        setField(term641, term641.getClass(), "last", null);
        setField(term641, term641.getClass(), "propListHead", null);
        setIntField(term641, term641.getClass(), "sourcePosition", 0);
        setField(term641, term641.getClass(), "jsType", null);
        setField(term641, term641.getClass(), "parent", null);
        setField(term636, term636.getClass(), "first", term641);
        setIntField(term644, term644.getClass(), "type", 0);
        setField(term644, term644.getClass(), "next", null);
        setField(term644, term644.getClass(), "first", null);
        setField(term644, term644.getClass(), "last", null);
        setField(term644, term644.getClass(), "propListHead", null);
        setIntField(term644, term644.getClass(), "sourcePosition", 0);
        setField(term644, term644.getClass(), "jsType", null);
        setField(term644, term644.getClass(), "parent", null);
        setField(term636, term636.getClass(), "last", term644);
        setField(term647, term647.getClass(), "next", null);
        setIntField(term647, term647.getClass(), "type", 0);
        setIntField(term647, term647.getClass(), "intValue", 0);
        setField(term647, term647.getClass(), "objectValue", null);
        setField(term636, term636.getClass(), "propListHead", term647);
        setIntField(term636, term636.getClass(), "sourcePosition", 1687361082);
        setField(term636, term636.getClass(), "jsType", null);
        setField(term636, term636.getClass(), "parent", null);
        setField(term634, term634.getClass(), "next", term636);
        setIntField(term651, term651.getClass(), "type", 0);
        setField(term651, term651.getClass(), "next", null);
        setField(term651, term651.getClass(), "first", null);
        setField(term651, term651.getClass(), "last", null);
        setField(term651, term651.getClass(), "propListHead", null);
        setIntField(term651, term651.getClass(), "sourcePosition", 0);
        setField(term651, term651.getClass(), "jsType", null);
        setField(term651, term651.getClass(), "parent", null);
        setField(term634, term634.getClass(), "first", term651);
        setIntField(term654, term654.getClass(), "type", 0);
        setField(term654, term654.getClass(), "next", null);
        setField(term654, term654.getClass(), "first", null);
        setField(term654, term654.getClass(), "last", null);
        setField(term654, term654.getClass(), "propListHead", null);
        setIntField(term654, term654.getClass(), "sourcePosition", 0);
        setField(term654, term654.getClass(), "jsType", null);
        setField(term654, term654.getClass(), "parent", null);
        setField(term634, term634.getClass(), "last", term654);
        setField(term657, term657.getClass(), "next", null);
        setIntField(term657, term657.getClass(), "type", 0);
        setIntField(term657, term657.getClass(), "intValue", 0);
        setField(term657, term657.getClass(), "objectValue", null);
        setField(term634, term634.getClass(), "propListHead", term657);
        setIntField(term634, term634.getClass(), "sourcePosition", 584893196);
        setField(term634, term634.getClass(), "jsType", null);
        setField(term634, term634.getClass(), "parent", null);
        term3569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3574 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3577 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3569, term3569.getClass(), "type", 991356662);
        setIntField(term3570, term3570.getClass(), "type", -1896376975);
        setIntField(term3571, term3571.getClass(), "type", 0);
        setField(term3571, term3571.getClass(), "next", null);
        setField(term3571, term3571.getClass(), "first", null);
        setField(term3571, term3571.getClass(), "last", null);
        setField(term3571, term3571.getClass(), "propListHead", null);
        setIntField(term3571, term3571.getClass(), "sourcePosition", 0);
        setField(term3571, term3571.getClass(), "jsType", null);
        setField(term3571, term3571.getClass(), "parent", null);
        setField(term3570, term3570.getClass(), "next", term3571);
        setIntField(term3572, term3572.getClass(), "type", 0);
        setField(term3572, term3572.getClass(), "next", null);
        setField(term3572, term3572.getClass(), "first", null);
        setField(term3572, term3572.getClass(), "last", null);
        setField(term3572, term3572.getClass(), "propListHead", null);
        setIntField(term3572, term3572.getClass(), "sourcePosition", 0);
        setField(term3572, term3572.getClass(), "jsType", null);
        setField(term3572, term3572.getClass(), "parent", null);
        setField(term3570, term3570.getClass(), "first", term3572);
        setIntField(term3573, term3573.getClass(), "type", 0);
        setField(term3573, term3573.getClass(), "next", null);
        setField(term3573, term3573.getClass(), "first", null);
        setField(term3573, term3573.getClass(), "last", null);
        setField(term3573, term3573.getClass(), "propListHead", null);
        setIntField(term3573, term3573.getClass(), "sourcePosition", 0);
        setField(term3573, term3573.getClass(), "jsType", null);
        setField(term3573, term3573.getClass(), "parent", null);
        setField(term3570, term3570.getClass(), "last", term3573);
        setField(term3574, term3574.getClass(), "next", null);
        setIntField(term3574, term3574.getClass(), "type", 0);
        setIntField(term3574, term3574.getClass(), "intValue", 0);
        setField(term3574, term3574.getClass(), "objectValue", null);
        setField(term3570, term3570.getClass(), "propListHead", term3574);
        setIntField(term3570, term3570.getClass(), "sourcePosition", 1687361082);
        setField(term3570, term3570.getClass(), "jsType", null);
        setField(term3570, term3570.getClass(), "parent", null);
        setField(term3569, term3569.getClass(), "next", term3570);
        setIntField(term3575, term3575.getClass(), "type", 0);
        setField(term3575, term3575.getClass(), "next", null);
        setField(term3575, term3575.getClass(), "first", null);
        setField(term3575, term3575.getClass(), "last", null);
        setField(term3575, term3575.getClass(), "propListHead", null);
        setIntField(term3575, term3575.getClass(), "sourcePosition", 0);
        setField(term3575, term3575.getClass(), "jsType", null);
        setField(term3575, term3575.getClass(), "parent", null);
        setField(term3569, term3569.getClass(), "first", term3575);
        setIntField(term3576, term3576.getClass(), "type", 0);
        setField(term3576, term3576.getClass(), "next", null);
        setField(term3576, term3576.getClass(), "first", null);
        setField(term3576, term3576.getClass(), "last", null);
        setField(term3576, term3576.getClass(), "propListHead", null);
        setIntField(term3576, term3576.getClass(), "sourcePosition", 0);
        setField(term3576, term3576.getClass(), "jsType", null);
        setField(term3576, term3576.getClass(), "parent", null);
        setField(term3569, term3569.getClass(), "last", term3576);
        setField(term3577, term3577.getClass(), "next", null);
        setIntField(term3577, term3577.getClass(), "type", 0);
        setIntField(term3577, term3577.getClass(), "intValue", 0);
        setField(term3577, term3577.getClass(), "objectValue", null);
        setField(term3569, term3569.getClass(), "propListHead", term3577);
        setIntField(term3569, term3569.getClass(), "sourcePosition", 584893196);
        setField(term3569, term3569.getClass(), "jsType", null);
        setField(term3569, term3569.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term634;
        Object retValue = callMethod(klass, "hasReturnAtExit", argTypes, null, args);
        assertTrue(recursiveEquals(term634, term3569));
        assertTrue(recursiveEquals(retValue, false));
    }

};


