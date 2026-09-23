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

public class DOMAttributeIterator_getNodePointer_80905172433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5821;
     Object term6653;

    public DOMAttributeIterator_getNodePointer_80905172433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5873 = new ArrayList();
        term5821 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setIntField(term5821, term5821.getClass(), "position", 0);
        setField(term5821, term5821.getClass(), "attributes", term5873);
        ArrayList term6654 = new ArrayList();
        term6653 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setField(term6653, term6653.getClass(), "parent", null);
        setField(term6653, term6653.getClass(), "name", null);
        setField(term6653, term6653.getClass(), "attributes", term6654);
        setIntField(term6653, term6653.getClass(), "position", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNodePointer", argTypes, term5821, args);
        assertTrue(recursiveEquals(term5821, term6653));
        assertTrue(recursiveEquals(retValue, null));
    }

};


