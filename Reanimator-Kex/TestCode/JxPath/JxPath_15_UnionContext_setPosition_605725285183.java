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
import java.lang.ClassCastException;
import static org.apache.commons.jxpath.ri.axes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class UnionContext_setPosition_605725285183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55825;

    public UnionContext_setPosition_605725285183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term56211 = new ArrayList();
        term55825 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term55658 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term55931 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term56029 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term56159 = newInstance(Class.forName("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet"));
        setBooleanField(term55825, term55825.getClass(), "prepared", false);
        setField(term55825, term55825.getClass(), "nodeSet", null);
        setBooleanField(term55931, term55931.getClass(), "setStarted", false);
        setField(term55931, term55931.getClass(), "iterator", null);
        setIntField(term55931, term55931.getClass(), "position", 134217728);
        setBooleanField(term55931, term55931.getClass(), "startedSetIteration", false);
        setBooleanField(term56029, term56029.getClass(), "startedSet", false);
        setIntField(term56029, term56029.getClass(), "position", 0);
        setField(term56159, term56159.getClass(), "pointers", null);
        setField(term56159, term56159.getClass(), "values", term56211);
        setField(term56029, term56029.getClass(), "nodeSet", term56159);
        setField(term55931, term55931.getClass(), "parentContext", term56029);
        setElement(term55658, 0, term55931);
        setField(term55825, term55825.getClass(), "contexts", term55658);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term55825, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


