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

public class UnionContext_setPosition_605725285109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28532;

    public UnionContext_setPosition_605725285109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28532 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term28614 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        Object[] term28388 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 41);
        Object term28716 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        setBooleanField(term28532, term28532.getClass(), "prepared", false);
        setField(term28532, term28532.getClass(), "nodeSet", term28614);
        setBooleanField(term28716, term28716.getClass(), "startedSet", false);
        setIntField(term28716, term28716.getClass(), "position", -1);
        setElement(term28388, 0, term28716);
        setField(term28532, term28532.getClass(), "contexts", term28388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term28532, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


