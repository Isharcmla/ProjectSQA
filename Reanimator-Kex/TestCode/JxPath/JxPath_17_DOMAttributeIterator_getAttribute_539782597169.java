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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DOMAttributeIterator_getAttribute_539782597169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88597;
     Object term89081;

    public DOMAttributeIterator_getAttribute_539782597169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88597 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term88723 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        Object term88865 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term89007 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        setField(term88723, term88723.getClass(), "namespaceResolver", null);
        setField(term88865, term88865.getClass(), "namespaceResolver", null);
        setField(term88865, term88865.getClass(), "parent", term89007);
        setField(term88723, term88723.getClass(), "parent", term88865);
        setField(term88597, term88597.getClass(), "parent", term88723);
        term89081 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term89081, term89081.getClass(), "prefix", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term89081;
        try {
            callMethod(klass, "getAttribute", argTypes, term88597, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


