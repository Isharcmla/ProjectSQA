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

public class UnionContext_setPosition_605725285213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120626;

    public UnionContext_setPosition_605725285213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120626 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term120469 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term120724 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term120822 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setBooleanField(term120626, term120626.getClass(), "prepared", false);
        setField(term120626, term120626.getClass(), "nodeSet", null);
        setBooleanField(term120724, term120724.getClass(), "startedSet", true);
        setElement(term120469, 0, term120724);
        setBooleanField(term120822, term120822.getClass(), "startedSet", false);
        setIntField(term120822, term120822.getClass(), "position", 0);
        setBooleanField(term120822, term120822.getClass(), "prepared", false);
        setElement(term120469, 1, term120822);
        setField(term120626, term120626.getClass(), "contexts", term120469);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term120626, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


