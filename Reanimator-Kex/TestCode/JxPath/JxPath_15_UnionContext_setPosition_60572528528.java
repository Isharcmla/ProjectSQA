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
import static org.apache.commons.jxpath.ri.axes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.axes.EqualityUtils.*;
import java.lang.Object;

public class UnionContext_setPosition_60572528528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4572;
     Object term5143;

    public UnionContext_setPosition_60572528528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4572 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term4654 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        Object[] term4450 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 0);
        setBooleanField(term4572, term4572.getClass(), "prepared", false);
        setField(term4572, term4572.getClass(), "nodeSet", term4654);
        setField(term4572, term4572.getClass(), "contexts", term4450);
        term5143 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term5144 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 0);
        Object term5145 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        setField(term5143, term5143.getClass(), "contexts", term5144);
        setBooleanField(term5143, term5143.getClass(), "prepared", true);
        setBooleanField(term5143, term5143.getClass(), "startedSet", false);
        setField(term5145, term5145.getClass(), "pointers", null);
        setField(term5145, term5145.getClass(), "readOnlyPointers", null);
        setField(term5145, term5145.getClass(), "nodes", null);
        setField(term5145, term5145.getClass(), "values", null);
        setField(term5143, term5143.getClass(), "nodeSet", term5145);
        setField(term5143, term5143.getClass(), "parentContext", null);
        setField(term5143, term5143.getClass(), "rootContext", null);
        setIntField(term5143, term5143.getClass(), "position", 0);
        setBooleanField(term5143, term5143.getClass(), "startedSetIteration", false);
        setBooleanField(term5143, term5143.getClass(), "done", false);
        setBooleanField(term5143, term5143.getClass(), "hasPerformedIteratorStep", false);
        setField(term5143, term5143.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "setPosition", argTypes, term4572, args);
        assertTrue(recursiveEquals(term4572, term5143));
    }

};


