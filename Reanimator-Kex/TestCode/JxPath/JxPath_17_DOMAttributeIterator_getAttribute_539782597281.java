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

public class DOMAttributeIterator_getAttribute_539782597281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153216;
     Object term153640;

    public DOMAttributeIterator_getAttribute_539782597281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153216 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term153342 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        Object term153468 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer"));
        Object term153566 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term153342, term153342.getClass(), "namespaceResolver", null);
        setField(term153468, term153468.getClass(), "namespaceResolver", term153566);
        setField(term153342, term153342.getClass(), "parent", term153468);
        setField(term153216, term153216.getClass(), "parent", term153342);
        term153640 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term153640, term153640.getClass(), "prefix", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term153640;
        try {
            callMethod(klass, "getAttribute", argTypes, term153216, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


