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

public class UnionContext_setPosition_605725285168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50198;

    public UnionContext_setPosition_605725285168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50198 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term50039 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term50296 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term50394 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term50476 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        setBooleanField(term50198, term50198.getClass(), "prepared", false);
        setField(term50198, term50198.getClass(), "nodeSet", null);
        setBooleanField(term50296, term50296.getClass(), "startedSet", true);
        setElement(term50039, 0, term50296);
        setBooleanField(term50394, term50394.getClass(), "startedSet", false);
        setIntField(term50394, term50394.getClass(), "position", 0);
        setBooleanField(term50394, term50394.getClass(), "prepared", true);
        setField(term50394, term50394.getClass(), "nodeSet", term50476);
        setElement(term50039, 1, term50394);
        setField(term50198, term50198.getClass(), "contexts", term50039);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term50198, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


