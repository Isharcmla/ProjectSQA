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
import static org.apache.commons.jxpath.ri.axes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.axes.EqualityUtils.*;
import java.lang.Object;

public class UnionContext_setPosition_605725285201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113240;
     Object term113511;

    public UnionContext_setPosition_605725285201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113240 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term113050 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term113338 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term113060 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 0);
        Object term113436 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setBooleanField(term113240, term113240.getClass(), "prepared", false);
        setField(term113240, term113240.getClass(), "nodeSet", null);
        setBooleanField(term113338, term113338.getClass(), "startedSet", false);
        setIntField(term113338, term113338.getClass(), "position", -2147483648);
        setBooleanField(term113338, term113338.getClass(), "prepared", false);
        setField(term113338, term113338.getClass(), "nodeSet", null);
        setField(term113338, term113338.getClass(), "contexts", term113060);
        setElement(term113050, 0, term113338);
        setBooleanField(term113436, term113436.getClass(), "startedSet", false);
        setIntField(term113436, term113436.getClass(), "position", -2147483648);
        setBooleanField(term113436, term113436.getClass(), "prepared", true);
        setElement(term113050, 1, term113436);
        setField(term113240, term113240.getClass(), "contexts", term113050);
        term113511 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term113512 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term113513 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term113514 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 0);
        Object term113515 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(term113513, term113513.getClass(), "contexts", term113514);
        setBooleanField(term113513, term113513.getClass(), "prepared", true);
        setBooleanField(term113513, term113513.getClass(), "startedSet", true);
        setField(term113513, term113513.getClass(), "nodeSet", null);
        setField(term113513, term113513.getClass(), "parentContext", null);
        setField(term113513, term113513.getClass(), "rootContext", null);
        setIntField(term113513, term113513.getClass(), "position", -2147483647);
        setBooleanField(term113513, term113513.getClass(), "startedSetIteration", false);
        setBooleanField(term113513, term113513.getClass(), "done", false);
        setBooleanField(term113513, term113513.getClass(), "hasPerformedIteratorStep", false);
        setField(term113513, term113513.getClass(), "pointerIterator", null);
        setElement(term113512, 0, term113513);
        setField(term113515, term113515.getClass(), "contexts", null);
        setBooleanField(term113515, term113515.getClass(), "prepared", true);
        setBooleanField(term113515, term113515.getClass(), "startedSet", true);
        setField(term113515, term113515.getClass(), "nodeSet", null);
        setField(term113515, term113515.getClass(), "parentContext", null);
        setField(term113515, term113515.getClass(), "rootContext", null);
        setIntField(term113515, term113515.getClass(), "position", -2147483647);
        setBooleanField(term113515, term113515.getClass(), "startedSetIteration", false);
        setBooleanField(term113515, term113515.getClass(), "done", false);
        setBooleanField(term113515, term113515.getClass(), "hasPerformedIteratorStep", false);
        setField(term113515, term113515.getClass(), "pointerIterator", null);
        setElement(term113512, 1, term113515);
        setField(term113511, term113511.getClass(), "contexts", term113512);
        setBooleanField(term113511, term113511.getClass(), "prepared", true);
        setBooleanField(term113511, term113511.getClass(), "startedSet", false);
        setField(term113511, term113511.getClass(), "nodeSet", null);
        setField(term113511, term113511.getClass(), "parentContext", null);
        setField(term113511, term113511.getClass(), "rootContext", null);
        setIntField(term113511, term113511.getClass(), "position", 0);
        setBooleanField(term113511, term113511.getClass(), "startedSetIteration", false);
        setBooleanField(term113511, term113511.getClass(), "done", false);
        setBooleanField(term113511, term113511.getClass(), "hasPerformedIteratorStep", false);
        setField(term113511, term113511.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "setPosition", argTypes, term113240, args);
        assertTrue(recursiveEquals(term113240, term113511));
    }

};


