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

public class UnionContext_setPosition_60572528533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6208;

    public UnionContext_setPosition_60572528533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6208 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term6290 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        Object[] term6081 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 234);
        Object term6392 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.InitialContext"));
        setBooleanField(term6208, term6208.getClass(), "prepared", false);
        setField(term6208, term6208.getClass(), "nodeSet", term6290);
        setElement(term6081, 1, term6392);
        setField(term6208, term6208.getClass(), "contexts", term6081);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term6208, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


