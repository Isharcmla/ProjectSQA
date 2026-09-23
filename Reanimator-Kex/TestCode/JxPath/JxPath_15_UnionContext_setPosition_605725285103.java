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

public class UnionContext_setPosition_605725285103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26528;

    public UnionContext_setPosition_605725285103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26528 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term26344 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term26626 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term26353 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term26732 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.PredicateContext"));
        Object term26830 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term26912 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        setBooleanField(term26528, term26528.getClass(), "prepared", false);
        setField(term26528, term26528.getClass(), "nodeSet", null);
        setBooleanField(term26626, term26626.getClass(), "startedSet", false);
        setIntField(term26626, term26626.getClass(), "position", 0);
        setBooleanField(term26626, term26626.getClass(), "prepared", false);
        setField(term26626, term26626.getClass(), "nodeSet", null);
        setIntField(term26732, term26732.getClass(), "position", 0);
        setIntField(term26830, term26830.getClass(), "position", 0);
        setBooleanField(term26830, term26830.getClass(), "startedSet", false);
        setBooleanField(term26830, term26830.getClass(), "prepared", false);
        setField(term26830, term26830.getClass(), "nodeSet", term26912);
        setField(term26732, term26732.getClass(), "parentContext", term26830);
        setBooleanField(term26732, term26732.getClass(), "done", false);
        setElement(term26353, 0, term26732);
        setField(term26626, term26626.getClass(), "contexts", term26353);
        setElement(term26344, 0, term26626);
        setField(term26528, term26528.getClass(), "contexts", term26344);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term26528, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


