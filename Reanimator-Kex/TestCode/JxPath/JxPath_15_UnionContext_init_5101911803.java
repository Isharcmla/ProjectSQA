package org.apache.commons.jxpath.ri.axes;

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
import static org.apache.commons.jxpath.ri.axes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.axes.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class UnionContext_init_5101911803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term85;
     Object term90;

    public UnionContext_init_5101911803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 5);
        ArrayList term88 = new ArrayList();
        term85 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term86 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 5);
        Object term87 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        setField(term85, term85.getClass(), "contexts", term86);
        setBooleanField(term85, term85.getClass(), "prepared", false);
        setBooleanField(term85, term85.getClass(), "startedSet", false);
        setField(term87, term87.getClass(), "pointers", term88);
        setField(term87, term87.getClass(), "readOnlyPointers", null);
        setField(term87, term87.getClass(), "nodes", null);
        setField(term87, term87.getClass(), "values", null);
        setField(term85, term85.getClass(), "nodeSet", term87);
        setField(term85, term85.getClass(), "parentContext", null);
        setField(term85, term85.getClass(), "rootContext", null);
        setIntField(term85, term85.getClass(), "position", 0);
        setBooleanField(term85, term85.getClass(), "startedSetIteration", false);
        setBooleanField(term85, term85.getClass(), "done", false);
        setBooleanField(term85, term85.getClass(), "hasPerformedIteratorStep", false);
        setField(term85, term85.getClass(), "pointerIterator", null);
        term90 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        argTypes[1] = Array.newInstance(Class.forName("org.apache.commons.jxpath.ri.EvalContext"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term85));
        assertTrue(recursiveEquals(term1, term90));
    }

};


