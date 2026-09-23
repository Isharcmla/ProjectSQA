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

public class UnionContext_setPosition_605725285145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42472;

    public UnionContext_setPosition_605725285145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42472 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term42284 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term42570 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term42293 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term42676 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.PredicateContext"));
        Object term42774 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term42872 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.ChildContext"));
        Object term42972 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.ParentContext"));
        setBooleanField(term42472, term42472.getClass(), "prepared", false);
        setField(term42472, term42472.getClass(), "nodeSet", null);
        setBooleanField(term42570, term42570.getClass(), "startedSet", false);
        setIntField(term42570, term42570.getClass(), "position", 0);
        setBooleanField(term42570, term42570.getClass(), "prepared", false);
        setField(term42570, term42570.getClass(), "nodeSet", null);
        setIntField(term42676, term42676.getClass(), "position", 0);
        setIntField(term42774, term42774.getClass(), "position", 0);
        setBooleanField(term42774, term42774.getClass(), "startedSet", true);
        setField(term42676, term42676.getClass(), "parentContext", term42774);
        setBooleanField(term42676, term42676.getClass(), "done", false);
        setElement(term42293, 0, term42676);
        setIntField(term42872, term42872.getClass(), "position", 0);
        setField(term42872, term42872.getClass(), "iterator", null);
        setBooleanField(term42872, term42872.getClass(), "startedSetIteration", false);
        setField(term42872, term42872.getClass(), "parentContext", term42972);
        setElement(term42293, 1, term42872);
        setField(term42570, term42570.getClass(), "contexts", term42293);
        setElement(term42284, 0, term42570);
        setField(term42472, term42472.getClass(), "contexts", term42284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term42472, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


