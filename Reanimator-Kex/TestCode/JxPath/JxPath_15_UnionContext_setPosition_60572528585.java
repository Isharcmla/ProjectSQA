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

public class UnionContext_setPosition_60572528585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20844;

    public UnionContext_setPosition_60572528585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20844 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term20926 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        Object[] term20697 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term21028 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        Object term21136 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.DescendantContext"));
        setBooleanField(term20844, term20844.getClass(), "prepared", false);
        setField(term20844, term20844.getClass(), "nodeSet", term20926);
        setBooleanField(term21028, term21028.getClass(), "startedSet", true);
        setElement(term20697, 0, term21028);
        setElement(term20697, 1, term21136);
        setField(term20844, term20844.getClass(), "contexts", term20697);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term20844, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


