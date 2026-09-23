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

public class UnionContext_setPosition_60572528597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24719;

    public UnionContext_setPosition_60572528597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24719 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term24577 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term24825 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term24933 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.DescendantContext"));
        setBooleanField(term24719, term24719.getClass(), "prepared", false);
        setField(term24719, term24719.getClass(), "nodeSet", null);
        setBooleanField(term24825, term24825.getClass(), "setStarted", false);
        setField(term24825, term24825.getClass(), "iterator", null);
        setIntField(term24825, term24825.getClass(), "position", 0);
        setBooleanField(term24825, term24825.getClass(), "startedSetIteration", false);
        setField(term24825, term24825.getClass(), "parentContext", term24933);
        setElement(term24577, 0, term24825);
        setField(term24719, term24719.getClass(), "contexts", term24577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term24719, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


