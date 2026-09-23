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

public class UnionContext_setPosition_605725285203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113693;

    public UnionContext_setPosition_605725285203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113693 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term113523 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 3);
        Object term113791 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term113889 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term113987 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.ChildContext"));
        setBooleanField(term113693, term113693.getClass(), "prepared", false);
        setField(term113693, term113693.getClass(), "nodeSet", null);
        setBooleanField(term113791, term113791.getClass(), "startedSet", true);
        setElement(term113523, 0, term113791);
        setBooleanField(term113889, term113889.getClass(), "startedSet", false);
        setIntField(term113889, term113889.getClass(), "position", -1);
        setBooleanField(term113889, term113889.getClass(), "prepared", true);
        setElement(term113523, 1, term113889);
        setElement(term113523, 2, term113987);
        setField(term113693, term113693.getClass(), "contexts", term113523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term113693, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


