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

public class UnionContext_setPosition_605725285128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34467;

    public UnionContext_setPosition_605725285128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34467 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term34302 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term34565 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term34311 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term34671 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.PredicateContext"));
        Object term34777 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.PredicateContext"));
        Object term34883 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.PredicateContext"));
        setBooleanField(term34467, term34467.getClass(), "prepared", false);
        setField(term34467, term34467.getClass(), "nodeSet", null);
        setBooleanField(term34565, term34565.getClass(), "startedSet", false);
        setIntField(term34565, term34565.getClass(), "position", 0);
        setBooleanField(term34565, term34565.getClass(), "prepared", false);
        setField(term34565, term34565.getClass(), "nodeSet", null);
        setIntField(term34671, term34671.getClass(), "position", 0);
        setField(term34671, term34671.getClass(), "parentContext", term34777);
        setElement(term34311, 0, term34671);
        setElement(term34311, 1, term34883);
        setField(term34565, term34565.getClass(), "contexts", term34311);
        setElement(term34302, 0, term34565);
        setField(term34467, term34467.getClass(), "contexts", term34302);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term34467, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


