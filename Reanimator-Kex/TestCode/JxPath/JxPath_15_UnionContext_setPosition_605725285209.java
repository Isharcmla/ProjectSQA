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

public class UnionContext_setPosition_605725285209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119194;

    public UnionContext_setPosition_605725285209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119194 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term119001 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term119292 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term119011 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 0);
        Object term119390 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term119472 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        setBooleanField(term119194, term119194.getClass(), "prepared", false);
        setField(term119194, term119194.getClass(), "nodeSet", null);
        setBooleanField(term119292, term119292.getClass(), "startedSet", false);
        setIntField(term119292, term119292.getClass(), "position", -67108865);
        setBooleanField(term119292, term119292.getClass(), "prepared", false);
        setField(term119292, term119292.getClass(), "nodeSet", null);
        setField(term119292, term119292.getClass(), "contexts", term119011);
        setElement(term119001, 0, term119292);
        setBooleanField(term119390, term119390.getClass(), "startedSet", false);
        setIntField(term119390, term119390.getClass(), "position", 104898288);
        setBooleanField(term119390, term119390.getClass(), "prepared", true);
        setField(term119390, term119390.getClass(), "nodeSet", term119472);
        setElement(term119001, 1, term119390);
        setField(term119194, term119194.getClass(), "contexts", term119001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term119194, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


