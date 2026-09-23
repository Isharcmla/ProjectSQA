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
import java.lang.Object;
import java.util.ArrayList;

public class DOMAttributeIterator_getPosition_31365111412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398;
     Object term2055;

    public DOMAttributeIterator_getPosition_31365111412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term436 = new ArrayList();
        term398 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term399 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term398, term398.getClass(), "parent", null);
        setField(term399, term399.getClass(), "prefix", "tbcdzjIfER");
        setField(term399, term399.getClass(), "name", "HyxfbSQYBe");
        setField(term399, term399.getClass(), "qualifiedName", "pCTimMblYc");
        setField(term398, term398.getClass(), "name", term399);
        setField(term398, term398.getClass(), "attributes", term436);
        setIntField(term398, term398.getClass(), "position", 391863371);
        ArrayList term2063 = new ArrayList();
        term2055 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term2056 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2055, term2055.getClass(), "parent", null);
        setField(term2056, term2056.getClass(), "prefix", "tbcdzjIfER");
        setField(term2056, term2056.getClass(), "name", "HyxfbSQYBe");
        setField(term2056, term2056.getClass(), "qualifiedName", "pCTimMblYc");
        setField(term2055, term2055.getClass(), "name", term2056);
        setField(term2055, term2055.getClass(), "attributes", term2063);
        setIntField(term2055, term2055.getClass(), "position", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPosition", argTypes, term398, args);
        assertTrue(recursiveEquals(term398, term2055));
        assertTrue(recursiveEquals(retValue, 391863371));
    }

};


