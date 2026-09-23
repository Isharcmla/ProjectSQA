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

public class UnionContext_setPosition_605725285112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29170;

    public UnionContext_setPosition_605725285112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29170 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term29014 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term29268 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term29364 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.SelfContext"));
        setBooleanField(term29170, term29170.getClass(), "prepared", false);
        setField(term29170, term29170.getClass(), "nodeSet", null);
        setBooleanField(term29268, term29268.getClass(), "startedSet", false);
        setIntField(term29268, term29268.getClass(), "position", -1);
        setBooleanField(term29268, term29268.getClass(), "prepared", true);
        setElement(term29014, 0, term29268);
        setElement(term29014, 1, term29364);
        setField(term29170, term29170.getClass(), "contexts", term29014);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term29170, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


