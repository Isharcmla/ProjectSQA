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

public class UnionContext_setPosition_605725285140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40869;

    public UnionContext_setPosition_605725285140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40869 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term40729 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term40969 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.ParentContext"));
        Object term41097 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext"));
        setBooleanField(term40869, term40869.getClass(), "prepared", false);
        setField(term40869, term40869.getClass(), "nodeSet", null);
        setIntField(term40969, term40969.getClass(), "position", 0);
        setBooleanField(term40969, term40969.getClass(), "setStarted", false);
        setBooleanField(term40969, term40969.getClass(), "startedSetIteration", true);
        setField(term40969, term40969.getClass(), "parentContext", term41097);
        setElement(term40729, 0, term40969);
        setField(term40869, term40869.getClass(), "contexts", term40729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term40869, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


