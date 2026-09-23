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

public class UnionContext_setPosition_605725285187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96641;

    public UnionContext_setPosition_605725285187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96641 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term96489 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term96743 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        Object term96839 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.SelfContext"));
        setBooleanField(term96641, term96641.getClass(), "prepared", false);
        setField(term96641, term96641.getClass(), "nodeSet", null);
        setBooleanField(term96743, term96743.getClass(), "startedSet", false);
        setIntField(term96743, term96743.getClass(), "position", -1);
        setElement(term96489, 0, term96743);
        setElement(term96489, 1, term96839);
        setField(term96641, term96641.getClass(), "contexts", term96489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term96641, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


