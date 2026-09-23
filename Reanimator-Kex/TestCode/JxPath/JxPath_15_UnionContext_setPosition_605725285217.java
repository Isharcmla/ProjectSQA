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

public class UnionContext_setPosition_605725285217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121765;

    public UnionContext_setPosition_605725285217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term122151 = new ArrayList();
        term121765 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term121584 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term121871 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term121969 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term122099 = newInstance(Class.forName("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet"));
        Object term122249 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.ChildContext"));
        setBooleanField(term121765, term121765.getClass(), "prepared", false);
        setField(term121765, term121765.getClass(), "nodeSet", null);
        setBooleanField(term121871, term121871.getClass(), "setStarted", false);
        setField(term121871, term121871.getClass(), "iterator", null);
        setIntField(term121871, term121871.getClass(), "position", 1073741823);
        setBooleanField(term121871, term121871.getClass(), "startedSetIteration", false);
        setBooleanField(term121969, term121969.getClass(), "startedSet", false);
        setIntField(term121969, term121969.getClass(), "position", 77025230);
        setField(term122099, term122099.getClass(), "pointers", term122151);
        setField(term121969, term121969.getClass(), "nodeSet", term122099);
        setField(term121871, term121871.getClass(), "parentContext", term121969);
        setElement(term121584, 0, term121871);
        setElement(term121584, 1, term122249);
        setField(term121765, term121765.getClass(), "contexts", term121584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term121765, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


