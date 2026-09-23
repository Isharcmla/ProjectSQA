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

public class UnionContext_setPosition_60572528563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13810;

    public UnionContext_setPosition_60572528563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13810 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term13673 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term13910 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.ParentContext"));
        setBooleanField(term13810, term13810.getClass(), "prepared", false);
        setField(term13810, term13810.getClass(), "nodeSet", null);
        setIntField(term13910, term13910.getClass(), "position", 0);
        setBooleanField(term13910, term13910.getClass(), "setStarted", false);
        setBooleanField(term13910, term13910.getClass(), "startedSetIteration", true);
        setElement(term13673, 0, term13910);
        setField(term13810, term13810.getClass(), "contexts", term13673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term13810, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


