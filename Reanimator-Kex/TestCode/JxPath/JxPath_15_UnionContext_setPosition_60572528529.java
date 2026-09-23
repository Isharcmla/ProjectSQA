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

public class UnionContext_setPosition_60572528529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4817;

    public UnionContext_setPosition_60572528529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4817 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term4662 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term4915 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term4672 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term5021 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.PredicateContext"));
        Object term5125 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AncestorContext"));
        setBooleanField(term4817, term4817.getClass(), "prepared", false);
        setField(term4817, term4817.getClass(), "nodeSet", null);
        setBooleanField(term4915, term4915.getClass(), "startedSet", false);
        setIntField(term4915, term4915.getClass(), "position", 0);
        setBooleanField(term4915, term4915.getClass(), "prepared", false);
        setField(term4915, term4915.getClass(), "nodeSet", null);
        setElement(term4672, 0, term5021);
        setField(term4915, term4915.getClass(), "contexts", term4672);
        setElement(term4662, 0, term4915);
        setElement(term4662, 1, term5125);
        setField(term4817, term4817.getClass(), "contexts", term4662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term4817, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


