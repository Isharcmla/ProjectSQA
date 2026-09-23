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

public class DOMAttributeIterator_getAttribute_53978259761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14168;
     Object term14494;

    public DOMAttributeIterator_getAttribute_53978259761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14168 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term14294 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        Object term14420 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer"));
        setField(term14294, term14294.getClass(), "namespaceResolver", null);
        setField(term14294, term14294.getClass(), "parent", term14420);
        setField(term14168, term14168.getClass(), "parent", term14294);
        term14494 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term14494, term14494.getClass(), "prefix", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term14494;
        try {
            callMethod(klass, "getAttribute", argTypes, term14168, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


