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

public class UnionContext_setPosition_60572528588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21870;

    public UnionContext_setPosition_60572528588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21870 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term21729 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term21976 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term22084 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.DescendantContext"));
        setBooleanField(term21870, term21870.getClass(), "prepared", false);
        setField(term21870, term21870.getClass(), "nodeSet", null);
        setBooleanField(term21976, term21976.getClass(), "setStarted", false);
        setField(term21976, term21976.getClass(), "iterator", null);
        setIntField(term21976, term21976.getClass(), "position", 0);
        setBooleanField(term21976, term21976.getClass(), "startedSetIteration", false);
        setField(term21976, term21976.getClass(), "parentContext", term22084);
        setElement(term21729, 0, term21976);
        setField(term21870, term21870.getClass(), "contexts", term21729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term21870, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


