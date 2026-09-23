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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.axes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UnionContext_setPosition_60572528580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19237;

    public UnionContext_setPosition_60572528580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19237 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term19085 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term19343 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term19471 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext"));
        Object term19577 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.PredicateContext"));
        setBooleanField(term19237, term19237.getClass(), "prepared", false);
        setField(term19237, term19237.getClass(), "nodeSet", null);
        setBooleanField(term19343, term19343.getClass(), "setStarted", false);
        setField(term19343, term19343.getClass(), "iterator", null);
        setIntField(term19343, term19343.getClass(), "position", 0);
        setBooleanField(term19343, term19343.getClass(), "startedSetIteration", false);
        setField(term19343, term19343.getClass(), "parentContext", term19471);
        setElement(term19085, 0, term19343);
        setElement(term19085, 1, term19577);
        setField(term19237, term19237.getClass(), "contexts", term19085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term19237, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


