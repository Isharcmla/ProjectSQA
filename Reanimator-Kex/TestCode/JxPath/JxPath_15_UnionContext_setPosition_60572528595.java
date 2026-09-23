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

public class UnionContext_setPosition_60572528595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23774;

    public UnionContext_setPosition_60572528595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23774 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term23856 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        Object[] term23642 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 12);
        Object term23984 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext"));
        setBooleanField(term23774, term23774.getClass(), "prepared", false);
        setField(term23774, term23774.getClass(), "nodeSet", term23856);
        setElement(term23642, 0, term23984);
        setField(term23774, term23774.getClass(), "contexts", term23642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term23774, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


