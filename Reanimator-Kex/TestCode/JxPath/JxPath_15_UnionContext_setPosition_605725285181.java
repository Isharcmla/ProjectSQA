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

public class UnionContext_setPosition_605725285181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55366;
     Object term55647;

    public UnionContext_setPosition_605725285181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55366 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term55214 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term55472 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term55574 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        setBooleanField(term55366, term55366.getClass(), "prepared", false);
        setField(term55366, term55366.getClass(), "nodeSet", null);
        setBooleanField(term55472, term55472.getClass(), "setStarted", false);
        setField(term55472, term55472.getClass(), "iterator", null);
        setIntField(term55472, term55472.getClass(), "position", 1073741824);
        setBooleanField(term55472, term55472.getClass(), "startedSetIteration", false);
        setBooleanField(term55574, term55574.getClass(), "startedSet", false);
        setIntField(term55574, term55574.getClass(), "position", -1867956833);
        setField(term55472, term55472.getClass(), "parentContext", term55574);
        setElement(term55214, 0, term55472);
        setField(term55366, term55366.getClass(), "contexts", term55214);
        term55647 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term55648 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term55649 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term55650 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        setField(term55649, term55649.getClass(), "nodeTest", null);
        setBooleanField(term55649, term55649.getClass(), "setStarted", false);
        setField(term55649, term55649.getClass(), "iterator", null);
        setField(term55649, term55649.getClass(), "currentNodePointer", null);
        setBooleanField(term55650, term55650.getClass(), "startedSet", true);
        setField(term55650, term55650.getClass(), "nodeSet", null);
        setField(term55650, term55650.getClass(), "parentContext", null);
        setField(term55650, term55650.getClass(), "rootContext", null);
        setIntField(term55650, term55650.getClass(), "position", -1867956832);
        setBooleanField(term55650, term55650.getClass(), "startedSetIteration", false);
        setBooleanField(term55650, term55650.getClass(), "done", false);
        setBooleanField(term55650, term55650.getClass(), "hasPerformedIteratorStep", false);
        setField(term55650, term55650.getClass(), "pointerIterator", null);
        setField(term55649, term55649.getClass(), "parentContext", term55650);
        setField(term55649, term55649.getClass(), "rootContext", null);
        setIntField(term55649, term55649.getClass(), "position", 0);
        setBooleanField(term55649, term55649.getClass(), "startedSetIteration", true);
        setBooleanField(term55649, term55649.getClass(), "done", false);
        setBooleanField(term55649, term55649.getClass(), "hasPerformedIteratorStep", false);
        setField(term55649, term55649.getClass(), "pointerIterator", null);
        setElement(term55648, 0, term55649);
        setField(term55647, term55647.getClass(), "contexts", term55648);
        setBooleanField(term55647, term55647.getClass(), "prepared", true);
        setBooleanField(term55647, term55647.getClass(), "startedSet", false);
        setField(term55647, term55647.getClass(), "nodeSet", null);
        setField(term55647, term55647.getClass(), "parentContext", null);
        setField(term55647, term55647.getClass(), "rootContext", null);
        setIntField(term55647, term55647.getClass(), "position", 0);
        setBooleanField(term55647, term55647.getClass(), "startedSetIteration", false);
        setBooleanField(term55647, term55647.getClass(), "done", false);
        setBooleanField(term55647, term55647.getClass(), "hasPerformedIteratorStep", false);
        setField(term55647, term55647.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "setPosition", argTypes, term55366, args);
        assertTrue(recursiveEquals(term55366, term55647));
    }

};


