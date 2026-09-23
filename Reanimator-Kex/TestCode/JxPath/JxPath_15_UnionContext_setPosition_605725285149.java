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

public class UnionContext_setPosition_605725285149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44128;

    public UnionContext_setPosition_605725285149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44128 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term43985 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term44226 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term44308 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        setBooleanField(term44128, term44128.getClass(), "prepared", false);
        setField(term44128, term44128.getClass(), "nodeSet", null);
        setBooleanField(term44226, term44226.getClass(), "startedSet", false);
        setIntField(term44226, term44226.getClass(), "position", 0);
        setField(term44226, term44226.getClass(), "nodeSet", term44308);
        setElement(term43985, 0, term44226);
        setField(term44128, term44128.getClass(), "contexts", term43985);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term44128, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


