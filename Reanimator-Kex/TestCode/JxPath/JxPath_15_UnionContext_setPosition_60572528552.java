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

public class UnionContext_setPosition_60572528552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11116;

    public UnionContext_setPosition_60572528552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11116 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term10976 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term11216 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.ParentContext"));
        Object term11314 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.ChildContext"));
        setBooleanField(term11116, term11116.getClass(), "prepared", false);
        setField(term11116, term11116.getClass(), "nodeSet", null);
        setIntField(term11216, term11216.getClass(), "position", 0);
        setBooleanField(term11216, term11216.getClass(), "setStarted", false);
        setBooleanField(term11216, term11216.getClass(), "startedSetIteration", false);
        setField(term11216, term11216.getClass(), "parentContext", term11314);
        setElement(term10976, 0, term11216);
        setField(term11116, term11116.getClass(), "contexts", term10976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term11116, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


