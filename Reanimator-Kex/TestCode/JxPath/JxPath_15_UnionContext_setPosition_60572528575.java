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

public class UnionContext_setPosition_60572528575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17427;

    public UnionContext_setPosition_60572528575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17427 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term17509 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        Object[] term17291 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term17611 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        Object term17717 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setBooleanField(term17427, term17427.getClass(), "prepared", false);
        setField(term17427, term17427.getClass(), "nodeSet", term17509);
        setBooleanField(term17611, term17611.getClass(), "startedSet", true);
        setElement(term17291, 0, term17611);
        setElement(term17291, 1, term17717);
        setField(term17427, term17427.getClass(), "contexts", term17291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term17427, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


