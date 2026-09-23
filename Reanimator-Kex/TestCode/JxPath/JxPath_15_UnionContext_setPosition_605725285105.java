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

public class UnionContext_setPosition_605725285105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27493;

    public UnionContext_setPosition_605725285105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27493 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term27347 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term27591 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term27673 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        Object term27779 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.PredicateContext"));
        setBooleanField(term27493, term27493.getClass(), "prepared", false);
        setField(term27493, term27493.getClass(), "nodeSet", null);
        setBooleanField(term27591, term27591.getClass(), "startedSet", false);
        setIntField(term27591, term27591.getClass(), "position", 0);
        setBooleanField(term27591, term27591.getClass(), "prepared", true);
        setField(term27591, term27591.getClass(), "nodeSet", term27673);
        setElement(term27347, 0, term27591);
        setElement(term27347, 1, term27779);
        setField(term27493, term27493.getClass(), "contexts", term27347);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term27493, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


