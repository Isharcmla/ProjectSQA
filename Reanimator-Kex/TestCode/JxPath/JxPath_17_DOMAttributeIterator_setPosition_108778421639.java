package org.apache.commons.jxpath.ri.model.dom;

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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.dom.EqualityUtils.*;
import java.util.ArrayList;

public class DOMAttributeIterator_setPosition_108778421639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7009;
     Object term7931;

    public DOMAttributeIterator_setPosition_108778421639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7061 = new ArrayList();
        term7009 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setIntField(term7009, term7009.getClass(), "position", 0);
        setField(term7009, term7009.getClass(), "attributes", term7061);
        ArrayList term7932 = new ArrayList();
        term7931 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setField(term7931, term7931.getClass(), "parent", null);
        setField(term7931, term7931.getClass(), "name", null);
        setField(term7931, term7931.getClass(), "attributes", term7932);
        setIntField(term7931, term7931.getClass(), "position", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        Object retValue = callMethod(klass, "setPosition", argTypes, term7009, args);
        assertTrue(recursiveEquals(term7009, term7931));
        assertTrue(recursiveEquals(retValue, false));
    }

};


