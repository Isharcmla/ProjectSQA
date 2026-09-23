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
import java.lang.Object;

public class JDOMAttributeIterator_init_206761542850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12802;
     Object term13899;
     Object term13903;

    public JDOMAttributeIterator_init_206761542850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term12682 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term12682, term12682.getClass(), "position", 0);
        setField(term12682, term12682.getClass(), "parent", null);
        term12802 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term12900 = newInstance(Class.forName("org.apache.commons.jxpath.XMLDocumentContainer"));
        Object term12998 = newInstance(Class.forName("org.apache.commons.jxpath.XMLDocumentContainer"));
        setField(term12802, term12802.getClass(), "value", term12900);
        setIntField(term12802, term12802.getClass(), "index", 2147483647);
        setField(term12802, term12802.getClass(), "bean", term12998);
        term13899 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term13900 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term13901 = newInstance(Class.forName("org.apache.commons.jxpath.XMLDocumentContainer"));
        Object term13902 = newInstance(Class.forName("org.apache.commons.jxpath.XMLDocumentContainer"));
        setField(term13900, term13900.getClass(), "name", null);
        setField(term13901, term13901.getClass(), "delegate", null);
        setField(term13901, term13901.getClass(), "document", null);
        setField(term13901, term13901.getClass(), "xmlURL", null);
        setField(term13901, term13901.getClass(), "source", null);
        setField(term13900, term13900.getClass(), "bean", term13901);
        setField(term13900, term13900.getClass(), "handler", null);
        setField(term13902, term13902.getClass(), "delegate", null);
        setField(term13902, term13902.getClass(), "document", null);
        setField(term13902, term13902.getClass(), "xmlURL", null);
        setField(term13902, term13902.getClass(), "source", null);
        setField(term13900, term13900.getClass(), "value", term13902);
        setIntField(term13900, term13900.getClass(), "index", 2147483647);
        setBooleanField(term13900, term13900.getClass(), "attribute", false);
        setField(term13900, term13900.getClass(), "rootNode", null);
        setField(term13900, term13900.getClass(), "namespaceResolver", null);
        setField(term13900, term13900.getClass(), "parent", null);
        setField(term13900, term13900.getClass(), "locale", null);
        setField(term13899, term13899.getClass(), "parent", term13900);
        setField(term13899, term13899.getClass(), "attributes", null);
        setIntField(term13899, term13899.getClass(), "position", 0);
        term13903 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term13904 = newInstance(Class.forName("org.apache.commons.jxpath.XMLDocumentContainer"));
        Object term13905 = newInstance(Class.forName("org.apache.commons.jxpath.XMLDocumentContainer"));
        setField(term13903, term13903.getClass(), "name", null);
        setField(term13904, term13904.getClass(), "delegate", null);
        setField(term13904, term13904.getClass(), "document", null);
        setField(term13904, term13904.getClass(), "xmlURL", null);
        setField(term13904, term13904.getClass(), "source", null);
        setField(term13903, term13903.getClass(), "bean", term13904);
        setField(term13903, term13903.getClass(), "handler", null);
        setField(term13905, term13905.getClass(), "delegate", null);
        setField(term13905, term13905.getClass(), "document", null);
        setField(term13905, term13905.getClass(), "xmlURL", null);
        setField(term13905, term13905.getClass(), "source", null);
        setField(term13903, term13903.getClass(), "value", term13905);
        setIntField(term13903, term13903.getClass(), "index", 2147483647);
        setBooleanField(term13903, term13903.getClass(), "attribute", false);
        setField(term13903, term13903.getClass(), "rootNode", null);
        setField(term13903, term13903.getClass(), "namespaceResolver", null);
        setField(term13903, term13903.getClass(), "parent", null);
        setField(term13903, term13903.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term12802;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term13899));
        assertTrue(recursiveEquals(term12802, term13903));
    }

};


