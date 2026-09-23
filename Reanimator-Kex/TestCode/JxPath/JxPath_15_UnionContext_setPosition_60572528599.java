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

public class UnionContext_setPosition_60572528599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25390;

    public UnionContext_setPosition_60572528599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25390 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term25472 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        Object[] term25243 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term25574 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        Object term25680 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.PredicateContext"));
        setBooleanField(term25390, term25390.getClass(), "prepared", false);
        setField(term25390, term25390.getClass(), "nodeSet", term25472);
        setBooleanField(term25574, term25574.getClass(), "startedSet", true);
        setElement(term25243, 0, term25574);
        setElement(term25243, 1, term25680);
        setField(term25390, term25390.getClass(), "contexts", term25243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term25390, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


