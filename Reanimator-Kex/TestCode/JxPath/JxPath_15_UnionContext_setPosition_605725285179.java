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

public class UnionContext_setPosition_605725285179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54841;
     Object term55203;

    public UnionContext_setPosition_605725285179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54841 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term54683 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term54939 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term55037 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setBooleanField(term54841, term54841.getClass(), "prepared", false);
        setField(term54841, term54841.getClass(), "nodeSet", null);
        setBooleanField(term54939, term54939.getClass(), "startedSet", true);
        setElement(term54683, 0, term54939);
        setBooleanField(term55037, term55037.getClass(), "startedSet", false);
        setIntField(term55037, term55037.getClass(), "position", -1);
        setBooleanField(term55037, term55037.getClass(), "prepared", true);
        setElement(term54683, 1, term55037);
        setField(term54841, term54841.getClass(), "contexts", term54683);
        term55203 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term55204 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term55205 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term55206 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(term55205, term55205.getClass(), "contexts", null);
        setBooleanField(term55205, term55205.getClass(), "prepared", false);
        setBooleanField(term55205, term55205.getClass(), "startedSet", true);
        setField(term55205, term55205.getClass(), "nodeSet", null);
        setField(term55205, term55205.getClass(), "parentContext", null);
        setField(term55205, term55205.getClass(), "rootContext", null);
        setIntField(term55205, term55205.getClass(), "position", 0);
        setBooleanField(term55205, term55205.getClass(), "startedSetIteration", false);
        setBooleanField(term55205, term55205.getClass(), "done", false);
        setBooleanField(term55205, term55205.getClass(), "hasPerformedIteratorStep", false);
        setField(term55205, term55205.getClass(), "pointerIterator", null);
        setElement(term55204, 0, term55205);
        setField(term55206, term55206.getClass(), "contexts", null);
        setBooleanField(term55206, term55206.getClass(), "prepared", true);
        setBooleanField(term55206, term55206.getClass(), "startedSet", true);
        setField(term55206, term55206.getClass(), "nodeSet", null);
        setField(term55206, term55206.getClass(), "parentContext", null);
        setField(term55206, term55206.getClass(), "rootContext", null);
        setIntField(term55206, term55206.getClass(), "position", 0);
        setBooleanField(term55206, term55206.getClass(), "startedSetIteration", false);
        setBooleanField(term55206, term55206.getClass(), "done", false);
        setBooleanField(term55206, term55206.getClass(), "hasPerformedIteratorStep", false);
        setField(term55206, term55206.getClass(), "pointerIterator", null);
        setElement(term55204, 1, term55206);
        setField(term55203, term55203.getClass(), "contexts", term55204);
        setBooleanField(term55203, term55203.getClass(), "prepared", true);
        setBooleanField(term55203, term55203.getClass(), "startedSet", false);
        setField(term55203, term55203.getClass(), "nodeSet", null);
        setField(term55203, term55203.getClass(), "parentContext", null);
        setField(term55203, term55203.getClass(), "rootContext", null);
        setIntField(term55203, term55203.getClass(), "position", 0);
        setBooleanField(term55203, term55203.getClass(), "startedSetIteration", false);
        setBooleanField(term55203, term55203.getClass(), "done", false);
        setBooleanField(term55203, term55203.getClass(), "hasPerformedIteratorStep", false);
        setField(term55203, term55203.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "setPosition", argTypes, term54841, args);
        assertTrue(recursiveEquals(term54841, term55203));
    }

};


