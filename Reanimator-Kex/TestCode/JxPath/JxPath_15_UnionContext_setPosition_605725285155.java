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

public class UnionContext_setPosition_605725285155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45823;

    public UnionContext_setPosition_605725285155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45823 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term45645 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term45921 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term45655 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term46027 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.PredicateContext"));
        Object term46125 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term46223 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setBooleanField(term45823, term45823.getClass(), "prepared", false);
        setField(term45823, term45823.getClass(), "nodeSet", null);
        setBooleanField(term45921, term45921.getClass(), "startedSet", false);
        setIntField(term45921, term45921.getClass(), "position", 0);
        setBooleanField(term45921, term45921.getClass(), "prepared", false);
        setField(term45921, term45921.getClass(), "nodeSet", null);
        setIntField(term46027, term46027.getClass(), "position", 0);
        setIntField(term46125, term46125.getClass(), "position", 0);
        setBooleanField(term46125, term46125.getClass(), "startedSet", true);
        setField(term46027, term46027.getClass(), "parentContext", term46125);
        setBooleanField(term46027, term46027.getClass(), "done", false);
        setElement(term45655, 0, term46027);
        setField(term45921, term45921.getClass(), "contexts", term45655);
        setElement(term45645, 0, term45921);
        setElement(term45645, 1, term46223);
        setField(term45823, term45823.getClass(), "contexts", term45645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term45823, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


