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

public class UnionContext_setPosition_605725285164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49036;
     Object term49707;

    public UnionContext_setPosition_605725285164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49036 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term48856 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term49134 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term48865 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term49240 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.PredicateContext"));
        Object term49338 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setBooleanField(term49036, term49036.getClass(), "prepared", false);
        setField(term49036, term49036.getClass(), "nodeSet", null);
        setBooleanField(term49134, term49134.getClass(), "startedSet", false);
        setIntField(term49134, term49134.getClass(), "position", -1);
        setBooleanField(term49134, term49134.getClass(), "prepared", false);
        setField(term49134, term49134.getClass(), "nodeSet", null);
        setIntField(term49240, term49240.getClass(), "position", -1);
        setIntField(term49338, term49338.getClass(), "position", -1);
        setBooleanField(term49338, term49338.getClass(), "startedSet", true);
        setField(term49240, term49240.getClass(), "parentContext", term49338);
        setBooleanField(term49240, term49240.getClass(), "done", false);
        setElement(term48865, 0, term49240);
        setField(term49134, term49134.getClass(), "contexts", term48865);
        setElement(term48856, 0, term49134);
        setField(term49036, term49036.getClass(), "contexts", term48856);
        term49707 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term49708 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term49709 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term49710 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term49711 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.PredicateContext"));
        setField(term49711, term49711.getClass(), "expression", null);
        setBooleanField(term49711, term49711.getClass(), "done", false);
        setField(term49711, term49711.getClass(), "nameTestExpression", null);
        setField(term49711, term49711.getClass(), "dynamicPropertyPointer", null);
        setField(term49711, term49711.getClass(), "parentContext", null);
        setField(term49711, term49711.getClass(), "rootContext", null);
        setIntField(term49711, term49711.getClass(), "position", 0);
        setBooleanField(term49711, term49711.getClass(), "startedSetIteration", false);
        setBooleanField(term49711, term49711.getClass(), "hasPerformedIteratorStep", false);
        setField(term49711, term49711.getClass(), "pointerIterator", null);
        setElement(term49710, 0, term49711);
        setField(term49709, term49709.getClass(), "contexts", term49710);
        setBooleanField(term49709, term49709.getClass(), "prepared", true);
        setBooleanField(term49709, term49709.getClass(), "startedSet", true);
        setField(term49709, term49709.getClass(), "nodeSet", null);
        setField(term49709, term49709.getClass(), "parentContext", null);
        setField(term49709, term49709.getClass(), "rootContext", null);
        setIntField(term49709, term49709.getClass(), "position", 0);
        setBooleanField(term49709, term49709.getClass(), "startedSetIteration", false);
        setBooleanField(term49709, term49709.getClass(), "done", false);
        setBooleanField(term49709, term49709.getClass(), "hasPerformedIteratorStep", false);
        setField(term49709, term49709.getClass(), "pointerIterator", null);
        setElement(term49708, 0, term49709);
        setField(term49707, term49707.getClass(), "contexts", term49708);
        setBooleanField(term49707, term49707.getClass(), "prepared", true);
        setBooleanField(term49707, term49707.getClass(), "startedSet", false);
        setField(term49707, term49707.getClass(), "nodeSet", null);
        setField(term49707, term49707.getClass(), "parentContext", null);
        setField(term49707, term49707.getClass(), "rootContext", null);
        setIntField(term49707, term49707.getClass(), "position", 0);
        setBooleanField(term49707, term49707.getClass(), "startedSetIteration", false);
        setBooleanField(term49707, term49707.getClass(), "done", false);
        setBooleanField(term49707, term49707.getClass(), "hasPerformedIteratorStep", false);
        setField(term49707, term49707.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "setPosition", argTypes, term49036, args);
        assertTrue(recursiveEquals(term49036, term49707));
    }

};


