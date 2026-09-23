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

public class UnionContext_setPosition_605725285221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124065;

    public UnionContext_setPosition_605725285221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124065 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term123892 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term124163 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term124245 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        Object[] term123903 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term124341 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.SelfContext"));
        Object term124439 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term124535 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.SelfContext"));
        setBooleanField(term124065, term124065.getClass(), "prepared", false);
        setField(term124065, term124065.getClass(), "nodeSet", null);
        setBooleanField(term124163, term124163.getClass(), "startedSet", false);
        setIntField(term124163, term124163.getClass(), "position", 0);
        setBooleanField(term124163, term124163.getClass(), "prepared", false);
        setField(term124163, term124163.getClass(), "nodeSet", term124245);
        setIntField(term124341, term124341.getClass(), "position", 0);
        setBooleanField(term124341, term124341.getClass(), "startedSet", true);
        setBooleanField(term124341, term124341.getClass(), "startedSetIteration", false);
        setBooleanField(term124439, term124439.getClass(), "startedSet", true);
        setField(term124341, term124341.getClass(), "parentContext", term124439);
        setElement(term123903, 0, term124341);
        setField(term124163, term124163.getClass(), "contexts", term123903);
        setElement(term123892, 0, term124163);
        setElement(term123892, 1, term124535);
        setField(term124065, term124065.getClass(), "contexts", term123892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term124065, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


