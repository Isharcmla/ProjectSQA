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

public class UnionContext_setPosition_605725285153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45037;

    public UnionContext_setPosition_605725285153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45037 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term45119 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        Object[] term44880 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term45221 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        Object term45329 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.DescendantContext"));
        setBooleanField(term45037, term45037.getClass(), "prepared", false);
        setField(term45037, term45037.getClass(), "nodeSet", term45119);
        setBooleanField(term45221, term45221.getClass(), "startedSet", false);
        setIntField(term45221, term45221.getClass(), "position", -1);
        setElement(term44880, 0, term45221);
        setElement(term44880, 1, term45329);
        setField(term45037, term45037.getClass(), "contexts", term44880);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term45037, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


