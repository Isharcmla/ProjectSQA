package org.apache.commons.jxpath.ri.model.jdom;

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
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.jdom.EqualityUtils.*;
import java.util.ArrayList;

public class JDOMAttributeIterator_getNodePointer_141048924225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3190;
     Object term4423;

    public JDOMAttributeIterator_getNodePointer_141048924225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3242 = new ArrayList();
        term3190 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term3190, term3190.getClass(), "position", 0);
        setField(term3190, term3190.getClass(), "attributes", term3242);
        ArrayList term4424 = new ArrayList();
        term4423 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setField(term4423, term4423.getClass(), "parent", null);
        setField(term4423, term4423.getClass(), "attributes", term4424);
        setIntField(term4423, term4423.getClass(), "position", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNodePointer", argTypes, term3190, args);
        assertTrue(recursiveEquals(term3190, term4423));
        assertTrue(recursiveEquals(retValue, null));
    }

};


