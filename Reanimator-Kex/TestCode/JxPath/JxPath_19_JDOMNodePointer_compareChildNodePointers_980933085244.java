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

public class JDOMNodePointer_compareChildNodePointers_980933085244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48389;
     Object term48772;
     Object term48774;
     Object term48776;

    public JDOMNodePointer_compareChildNodePointers_980933085244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48389 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term48450 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer"));
        setField(term48389, term48389.getClass(), "node", term48450);
        term48772 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term48773 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer"));
        setField(term48773, term48773.getClass(), "attr", null);
        setIntField(term48773, term48773.getClass(), "index", 0);
        setBooleanField(term48773, term48773.getClass(), "attribute", false);
        setField(term48773, term48773.getClass(), "namespaceResolver", null);
        setField(term48773, term48773.getClass(), "rootNode", null);
        setField(term48773, term48773.getClass(), "parent", null);
        setField(term48773, term48773.getClass(), "locale", null);
        setField(term48772, term48772.getClass(), "node", term48773);
        setField(term48772, term48772.getClass(), "id", null);
        setField(term48772, term48772.getClass(), "localNamespaceResolver", null);
        setIntField(term48772, term48772.getClass(), "index", 0);
        setBooleanField(term48772, term48772.getClass(), "attribute", false);
        setField(term48772, term48772.getClass(), "namespaceResolver", null);
        setField(term48772, term48772.getClass(), "rootNode", null);
        setField(term48772, term48772.getClass(), "parent", null);
        setField(term48772, term48772.getClass(), "locale", null);
        term48774 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term48775 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer"));
        setField(term48775, term48775.getClass(), "attr", null);
        setIntField(term48775, term48775.getClass(), "index", 0);
        setBooleanField(term48775, term48775.getClass(), "attribute", false);
        setField(term48775, term48775.getClass(), "namespaceResolver", null);
        setField(term48775, term48775.getClass(), "rootNode", null);
        setField(term48775, term48775.getClass(), "parent", null);
        setField(term48775, term48775.getClass(), "locale", null);
        setField(term48774, term48774.getClass(), "node", term48775);
        setField(term48774, term48774.getClass(), "id", null);
        setField(term48774, term48774.getClass(), "localNamespaceResolver", null);
        setIntField(term48774, term48774.getClass(), "index", 0);
        setBooleanField(term48774, term48774.getClass(), "attribute", false);
        setField(term48774, term48774.getClass(), "namespaceResolver", null);
        setField(term48774, term48774.getClass(), "rootNode", null);
        setField(term48774, term48774.getClass(), "parent", null);
        setField(term48774, term48774.getClass(), "locale", null);
        term48776 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term48777 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer"));
        setField(term48777, term48777.getClass(), "attr", null);
        setIntField(term48777, term48777.getClass(), "index", 0);
        setBooleanField(term48777, term48777.getClass(), "attribute", false);
        setField(term48777, term48777.getClass(), "namespaceResolver", null);
        setField(term48777, term48777.getClass(), "rootNode", null);
        setField(term48777, term48777.getClass(), "parent", null);
        setField(term48777, term48777.getClass(), "locale", null);
        setField(term48776, term48776.getClass(), "node", term48777);
        setField(term48776, term48776.getClass(), "id", null);
        setField(term48776, term48776.getClass(), "localNamespaceResolver", null);
        setIntField(term48776, term48776.getClass(), "index", 0);
        setBooleanField(term48776, term48776.getClass(), "attribute", false);
        setField(term48776, term48776.getClass(), "namespaceResolver", null);
        setField(term48776, term48776.getClass(), "rootNode", null);
        setField(term48776, term48776.getClass(), "parent", null);
        setField(term48776, term48776.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        Object[] args = new Object[2];
        args[0] = term48389;
        args[1] = term48389;
        Object retValue = callMethod(klass, "compareChildNodePointers", argTypes, term48389, args);
        assertTrue(recursiveEquals(term48389, term48772));
        assertTrue(recursiveEquals(term48389, term48774));
        assertTrue(recursiveEquals(term48389, term48776));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


