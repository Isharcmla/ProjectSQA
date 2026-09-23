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

public class UnionContext_setPosition_60572528577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18514;

    public UnionContext_setPosition_60572528577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18514 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term18596 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        Object[] term18369 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term18698 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        Object term18780 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        setBooleanField(term18514, term18514.getClass(), "prepared", false);
        setField(term18514, term18514.getClass(), "nodeSet", term18596);
        setBooleanField(term18698, term18698.getClass(), "startedSet", false);
        setIntField(term18698, term18698.getClass(), "position", 0);
        setField(term18698, term18698.getClass(), "nodeSet", term18780);
        setElement(term18369, 0, term18698);
        setField(term18514, term18514.getClass(), "contexts", term18369);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term18514, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


