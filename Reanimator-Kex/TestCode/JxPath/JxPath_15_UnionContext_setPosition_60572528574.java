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

public class UnionContext_setPosition_60572528574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16980;

    public UnionContext_setPosition_60572528574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16980 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term16814 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term17078 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term16823 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 16);
        Object term17184 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.PredicateContext"));
        Object term17282 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setBooleanField(term16980, term16980.getClass(), "prepared", false);
        setField(term16980, term16980.getClass(), "nodeSet", null);
        setBooleanField(term17078, term17078.getClass(), "startedSet", false);
        setIntField(term17078, term17078.getClass(), "position", 0);
        setBooleanField(term17078, term17078.getClass(), "prepared", false);
        setField(term17078, term17078.getClass(), "nodeSet", null);
        setIntField(term17184, term17184.getClass(), "position", 0);
        setField(term17184, term17184.getClass(), "parentContext", term17282);
        setElement(term16823, 0, term17184);
        setElement(term16823, 1, term17078);
        setElement(term16823, 2, term17078);
        setElement(term16823, 3, term17078);
        setElement(term16823, 4, term17078);
        setElement(term16823, 5, term17078);
        setElement(term16823, 6, term17078);
        setElement(term16823, 7, term17078);
        setElement(term16823, 8, term17078);
        setElement(term16823, 9, term17078);
        setElement(term16823, 10, term17078);
        setElement(term16823, 11, term17078);
        setElement(term16823, 12, term17078);
        setElement(term16823, 13, term17078);
        setElement(term16823, 14, term17078);
        setElement(term16823, 15, term17078);
        setField(term17078, term17078.getClass(), "contexts", term16823);
        setElement(term16814, 0, term17078);
        setField(term16980, term16980.getClass(), "contexts", term16814);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term16980, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


