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

public class DOMAttributeIterator_getAttribute_539782597325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5742611;
     Object term5743109;

    public DOMAttributeIterator_getAttribute_539782597325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5742611 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term5742737 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        Object term5742879 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term5742995 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term5743035 = newInstance(Class.forName("org.jdom.Document"));
        setField(term5742737, term5742737.getClass(), "namespaceResolver", null);
        setField(term5742879, term5742879.getClass(), "namespaceResolver", null);
        setField(term5742995, term5742995.getClass(), "localNamespaceResolver", null);
        setField(term5742995, term5742995.getClass(), "namespaceResolver", null);
        setField(term5742995, term5742995.getClass(), "parent", null);
        setField(term5742995, term5742995.getClass(), "node", term5743035);
        setField(term5742879, term5742879.getClass(), "parent", term5742995);
        setField(term5742737, term5742737.getClass(), "parent", term5742879);
        setField(term5742611, term5742611.getClass(), "parent", term5742737);
        term5743109 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term5743109, term5743109.getClass(), "prefix", "                                         ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term5743109;
        try {
            callMethod(klass, "getAttribute", argTypes, term5742611, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


