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

public class UnionContext_setPosition_60572528553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11485;

    public UnionContext_setPosition_60572528553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11485 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term11322 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term11583 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term11331 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 9);
        Object term11689 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NamespaceContext"));
        Object term11797 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.DescendantContext"));
        setBooleanField(term11485, term11485.getClass(), "prepared", false);
        setField(term11485, term11485.getClass(), "nodeSet", null);
        setBooleanField(term11583, term11583.getClass(), "startedSet", false);
        setIntField(term11583, term11583.getClass(), "position", 0);
        setBooleanField(term11583, term11583.getClass(), "prepared", false);
        setField(term11583, term11583.getClass(), "nodeSet", null);
        setElement(term11331, 0, term11689);
        setElement(term11331, 1, term11583);
        setElement(term11331, 2, term11583);
        setElement(term11331, 3, term11583);
        setElement(term11331, 4, term11797);
        setElement(term11331, 5, term11583);
        setElement(term11331, 6, term11583);
        setElement(term11331, 7, term11583);
        setElement(term11331, 8, term11583);
        setField(term11583, term11583.getClass(), "contexts", term11331);
        setElement(term11322, 0, term11583);
        setField(term11485, term11485.getClass(), "contexts", term11322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term11485, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


