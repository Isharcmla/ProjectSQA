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

public class UnionContext_setPosition_60572528566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14365;

    public UnionContext_setPosition_60572528566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14365 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term14210 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term14471 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term14573 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        Object term14703 = newInstance(Class.forName("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet"));
        setBooleanField(term14365, term14365.getClass(), "prepared", false);
        setField(term14365, term14365.getClass(), "nodeSet", null);
        setBooleanField(term14471, term14471.getClass(), "setStarted", false);
        setField(term14471, term14471.getClass(), "iterator", null);
        setIntField(term14471, term14471.getClass(), "position", 1073741823);
        setBooleanField(term14471, term14471.getClass(), "startedSetIteration", false);
        setBooleanField(term14573, term14573.getClass(), "startedSet", false);
        setIntField(term14573, term14573.getClass(), "position", 0);
        setField(term14573, term14573.getClass(), "nodeSet", term14703);
        setField(term14471, term14471.getClass(), "parentContext", term14573);
        setElement(term14210, 0, term14471);
        setField(term14365, term14365.getClass(), "contexts", term14210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term14365, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


