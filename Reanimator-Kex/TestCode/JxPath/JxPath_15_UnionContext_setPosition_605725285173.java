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

public class UnionContext_setPosition_605725285173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52543;

    public UnionContext_setPosition_605725285173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52543 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term52390 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term52643 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.ParentContext"));
        Object term52741 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term52871 = newInstance(Class.forName("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet"));
        setBooleanField(term52543, term52543.getClass(), "prepared", false);
        setField(term52543, term52543.getClass(), "nodeSet", null);
        setIntField(term52643, term52643.getClass(), "position", 1073741824);
        setBooleanField(term52643, term52643.getClass(), "setStarted", false);
        setBooleanField(term52643, term52643.getClass(), "startedSetIteration", false);
        setBooleanField(term52741, term52741.getClass(), "startedSet", false);
        setIntField(term52741, term52741.getClass(), "position", 0);
        setField(term52741, term52741.getClass(), "nodeSet", term52871);
        setField(term52643, term52643.getClass(), "parentContext", term52741);
        setElement(term52390, 0, term52643);
        setField(term52543, term52543.getClass(), "contexts", term52390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term52543, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


