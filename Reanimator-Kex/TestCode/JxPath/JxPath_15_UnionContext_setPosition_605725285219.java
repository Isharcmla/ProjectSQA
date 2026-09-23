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

public class UnionContext_setPosition_605725285219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123115;

    public UnionContext_setPosition_605725285219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123115 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term122923 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term123213 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term122933 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term123319 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.PredicateContext"));
        Object term123417 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term123521 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AncestorContext"));
        setBooleanField(term123115, term123115.getClass(), "prepared", false);
        setField(term123115, term123115.getClass(), "nodeSet", null);
        setBooleanField(term123213, term123213.getClass(), "startedSet", false);
        setIntField(term123213, term123213.getClass(), "position", -1);
        setBooleanField(term123213, term123213.getClass(), "prepared", false);
        setField(term123213, term123213.getClass(), "nodeSet", null);
        setIntField(term123319, term123319.getClass(), "position", -1);
        setIntField(term123417, term123417.getClass(), "position", -1);
        setBooleanField(term123417, term123417.getClass(), "startedSet", true);
        setField(term123319, term123319.getClass(), "parentContext", term123417);
        setBooleanField(term123319, term123319.getClass(), "done", false);
        setElement(term122933, 0, term123319);
        setField(term123213, term123213.getClass(), "contexts", term122933);
        setElement(term122923, 0, term123213);
        setElement(term122923, 1, term123521);
        setField(term123115, term123115.getClass(), "contexts", term122923);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term123115, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


