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

public class UnionContext_setPosition_60572528581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19741;

    public UnionContext_setPosition_60572528581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19741 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term19585 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term19839 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term19594 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 0);
        setBooleanField(term19741, term19741.getClass(), "prepared", false);
        setField(term19741, term19741.getClass(), "nodeSet", null);
        setBooleanField(term19839, term19839.getClass(), "startedSet", false);
        setIntField(term19839, term19839.getClass(), "position", 0);
        setBooleanField(term19839, term19839.getClass(), "prepared", false);
        setField(term19839, term19839.getClass(), "nodeSet", null);
        setField(term19839, term19839.getClass(), "contexts", term19594);
        setElement(term19585, 0, term19839);
        setField(term19741, term19741.getClass(), "contexts", term19585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term19741, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


