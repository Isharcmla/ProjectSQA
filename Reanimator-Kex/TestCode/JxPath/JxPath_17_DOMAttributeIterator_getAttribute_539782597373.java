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
import java.util.HashMap;

public class DOMAttributeIterator_getAttribute_539782597373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9651748;
     Object term9652322;
     Object term9652470;
     Object term9652634;
     Object term9652639;
     Object term9652644;

    public DOMAttributeIterator_getAttribute_539782597373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9652020 = new HashMap();
        ((HashMap) term9652020).put("", "");
        term9651748 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term9651874 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        Object term9651972 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term9651972, term9651972.getClass(), "namespaceMap", term9652020);
        setField(term9651874, term9651874.getClass(), "namespaceResolver", term9651972);
        setField(term9651748, term9651748.getClass(), "parent", term9651874);
        term9652322 = newInstance(Class.forName("org.apache.html.dom.HTMLBodyElementImpl"));
        Object term9652396 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        setShortField(term9652322, term9652322.getClass(), "flags", (short) 0);
        setField(term9652322, term9652322.getClass(), "attributes", term9652396);
        term9652470 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term9652470, term9652470.getClass(), "prefix", "");
        setField(term9652470, term9652470.getClass(), "name", "en");
        HashMap term9652637 = new HashMap();
        term9652634 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term9652635 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        Object term9652636 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term9652635, term9652635.getClass(), "propertyName", null);
        setField(term9652635, term9652635.getClass(), "beanInfo", null);
        setField(term9652635, term9652635.getClass(), "propertyDescriptors", null);
        setField(term9652635, term9652635.getClass(), "propertyDescriptor", null);
        setField(term9652635, term9652635.getClass(), "names", null);
        setField(term9652635, term9652635.getClass(), "baseValue", null);
        setField(term9652635, term9652635.getClass(), "value", null);
        setIntField(term9652635, term9652635.getClass(), "propertyIndex", 0);
        setField(term9652635, term9652635.getClass(), "bean", null);
        setIntField(term9652635, term9652635.getClass(), "index", 0);
        setBooleanField(term9652635, term9652635.getClass(), "attribute", false);
        setField(term9652635, term9652635.getClass(), "rootNode", null);
        setField(term9652636, term9652636.getClass(), "parent", null);
        setField(term9652636, term9652636.getClass(), "namespaceMap", term9652637);
        setField(term9652636, term9652636.getClass(), "reverseMap", null);
        setField(term9652636, term9652636.getClass(), "pointer", null);
        setBooleanField(term9652636, term9652636.getClass(), "sealed", false);
        setField(term9652635, term9652635.getClass(), "namespaceResolver", term9652636);
        setField(term9652635, term9652635.getClass(), "parent", null);
        setField(term9652635, term9652635.getClass(), "locale", null);
        setField(term9652634, term9652634.getClass(), "parent", term9652635);
        setField(term9652634, term9652634.getClass(), "name", null);
        setField(term9652634, term9652634.getClass(), "attributes", null);
        setIntField(term9652634, term9652634.getClass(), "position", 0);
        term9652639 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term9652639, term9652639.getClass(), "prefix", "");
        setField(term9652639, term9652639.getClass(), "name", "en");
        setField(term9652639, term9652639.getClass(), "qualifiedName", null);
        term9652644 = newInstance(Class.forName("org.apache.html.dom.HTMLBodyElementImpl"));
        Object term9652645 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        setField(term9652644, term9652644.getClass(), "name", null);
        setShortField(term9652645, term9652645.getClass(), "flags", (short) 0);
        setField(term9652645, term9652645.getClass(), "nodes", null);
        setField(term9652645, term9652645.getClass(), "ownerNode", null);
        setField(term9652644, term9652644.getClass(), "attributes", term9652645);
        setField(term9652644, term9652644.getClass(), "ownerDocument", null);
        setField(term9652644, term9652644.getClass(), "firstChild", null);
        setField(term9652644, term9652644.getClass(), "fNodeListCache", null);
        setField(term9652644, term9652644.getClass(), "previousSibling", null);
        setField(term9652644, term9652644.getClass(), "nextSibling", null);
        setField(term9652644, term9652644.getClass(), "ownerNode", null);
        setShortField(term9652644, term9652644.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term9652322;
        args[1] = term9652470;
        Object retValue = callMethod(klass, "getAttribute", argTypes, term9651748, args);
        assertTrue(recursiveEquals(term9651748, term9652634));
        assertTrue(recursiveEquals(term9652322, term9652639));
        assertTrue(recursiveEquals(term9652470, term9652644));
        assertTrue(recursiveEquals(retValue, null));
    }

};


