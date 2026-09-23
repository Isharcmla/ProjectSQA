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

public class UnionContext_setPosition_60572528531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5608;

    public UnionContext_setPosition_60572528531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5608 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term5464 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term5706 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term5788 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        setBooleanField(term5608, term5608.getClass(), "prepared", false);
        setField(term5608, term5608.getClass(), "nodeSet", null);
        setBooleanField(term5706, term5706.getClass(), "startedSet", false);
        setIntField(term5706, term5706.getClass(), "position", 0);
        setBooleanField(term5706, term5706.getClass(), "prepared", false);
        setField(term5706, term5706.getClass(), "nodeSet", term5788);
        setElement(term5464, 0, term5706);
        setField(term5608, term5608.getClass(), "contexts", term5464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term5608, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


