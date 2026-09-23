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

public class UnionContext_setPosition_60572528558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13077;
     Object term13510;

    public UnionContext_setPosition_60572528558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13259 = new ArrayList();
        term13077 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term13207 = newInstance(Class.forName("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet"));
        setBooleanField(term13077, term13077.getClass(), "prepared", true);
        setIntField(term13077, term13077.getClass(), "position", 0);
        setField(term13207, term13207.getClass(), "pointers", null);
        setField(term13207, term13207.getClass(), "values", term13259);
        setField(term13077, term13077.getClass(), "nodeSet", term13207);
        ArrayList term13512 = new ArrayList();
        ArrayList term13515 = new ArrayList();
        term13510 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term13511 = newInstance(Class.forName("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet"));
        Object term13514 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term13510, term13510.getClass(), "contexts", null);
        setBooleanField(term13510, term13510.getClass(), "prepared", true);
        setBooleanField(term13510, term13510.getClass(), "startedSet", false);
        setField(term13511, term13511.getClass(), "values", term13512);
        setField(term13514, term13514.getClass(), "list", term13515);
        setField(term13514, term13514.getClass(), "c", term13515);
        setField(term13511, term13511.getClass(), "pointers", term13514);
        setField(term13510, term13510.getClass(), "nodeSet", term13511);
        setField(term13510, term13510.getClass(), "parentContext", null);
        setField(term13510, term13510.getClass(), "rootContext", null);
        setIntField(term13510, term13510.getClass(), "position", 1);
        setBooleanField(term13510, term13510.getClass(), "startedSetIteration", false);
        setBooleanField(term13510, term13510.getClass(), "done", false);
        setBooleanField(term13510, term13510.getClass(), "hasPerformedIteratorStep", false);
        setField(term13510, term13510.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        callMethod(klass, "setPosition", argTypes, term13077, args);
        assertTrue(recursiveEquals(term13077, term13510));
    }

};


