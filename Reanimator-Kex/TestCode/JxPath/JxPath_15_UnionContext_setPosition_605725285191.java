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
import java.util.ArrayList;

public class UnionContext_setPosition_605725285191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98064;
     Object term98555;

    public UnionContext_setPosition_605725285191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term98454 = new ArrayList();
        term98064 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term97905 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term98170 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term98272 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        Object term98402 = newInstance(Class.forName("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet"));
        setBooleanField(term98064, term98064.getClass(), "prepared", false);
        setField(term98064, term98064.getClass(), "nodeSet", null);
        setBooleanField(term98170, term98170.getClass(), "setStarted", false);
        setField(term98170, term98170.getClass(), "iterator", null);
        setIntField(term98170, term98170.getClass(), "position", 1073741824);
        setBooleanField(term98170, term98170.getClass(), "startedSetIteration", false);
        setBooleanField(term98272, term98272.getClass(), "startedSet", false);
        setIntField(term98272, term98272.getClass(), "position", 0);
        setField(term98402, term98402.getClass(), "pointers", term98454);
        setField(term98272, term98272.getClass(), "nodeSet", term98402);
        setField(term98170, term98170.getClass(), "parentContext", term98272);
        setElement(term97905, 0, term98170);
        setField(term98064, term98064.getClass(), "contexts", term97905);
        term98555 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term98556 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term98557 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term98558 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        Object term98559 = newInstance(Class.forName("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet"));
        setField(term98557, term98557.getClass(), "nodeTest", null);
        setBooleanField(term98557, term98557.getClass(), "setStarted", false);
        setField(term98557, term98557.getClass(), "iterator", null);
        setField(term98557, term98557.getClass(), "currentNodePointer", null);
        setBooleanField(term98558, term98558.getClass(), "startedSet", true);
        setField(term98559, term98559.getClass(), "values", null);
        setField(term98559, term98559.getClass(), "pointers", null);
        setField(term98558, term98558.getClass(), "nodeSet", term98559);
        setField(term98558, term98558.getClass(), "parentContext", null);
        setField(term98558, term98558.getClass(), "rootContext", null);
        setIntField(term98558, term98558.getClass(), "position", 1);
        setBooleanField(term98558, term98558.getClass(), "startedSetIteration", false);
        setBooleanField(term98558, term98558.getClass(), "done", false);
        setBooleanField(term98558, term98558.getClass(), "hasPerformedIteratorStep", false);
        setField(term98558, term98558.getClass(), "pointerIterator", null);
        setField(term98557, term98557.getClass(), "parentContext", term98558);
        setField(term98557, term98557.getClass(), "rootContext", null);
        setIntField(term98557, term98557.getClass(), "position", 0);
        setBooleanField(term98557, term98557.getClass(), "startedSetIteration", true);
        setBooleanField(term98557, term98557.getClass(), "done", false);
        setBooleanField(term98557, term98557.getClass(), "hasPerformedIteratorStep", false);
        setField(term98557, term98557.getClass(), "pointerIterator", null);
        setElement(term98556, 0, term98557);
        setField(term98555, term98555.getClass(), "contexts", term98556);
        setBooleanField(term98555, term98555.getClass(), "prepared", true);
        setBooleanField(term98555, term98555.getClass(), "startedSet", false);
        setField(term98555, term98555.getClass(), "nodeSet", null);
        setField(term98555, term98555.getClass(), "parentContext", null);
        setField(term98555, term98555.getClass(), "rootContext", null);
        setIntField(term98555, term98555.getClass(), "position", 0);
        setBooleanField(term98555, term98555.getClass(), "startedSetIteration", false);
        setBooleanField(term98555, term98555.getClass(), "done", false);
        setBooleanField(term98555, term98555.getClass(), "hasPerformedIteratorStep", false);
        setField(term98555, term98555.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "setPosition", argTypes, term98064, args);
        assertTrue(recursiveEquals(term98064, term98555));
    }

};


