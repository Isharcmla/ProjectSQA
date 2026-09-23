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

public class DOMAttributeIterator_getAttribute_539782597341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5751257;
     Object term5751833;
     Object term5751981;
     Object term5752145;
     Object term5752150;
     Object term5752155;

    public DOMAttributeIterator_getAttribute_539782597341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5751529 = new HashMap();
        ((HashMap) term5751529).put("", "");
        term5751257 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term5751383 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        Object term5751481 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5751481, term5751481.getClass(), "namespaceMap", term5751529);
        setField(term5751383, term5751383.getClass(), "namespaceResolver", term5751481);
        setField(term5751257, term5751257.getClass(), "parent", term5751383);
        term5751833 = newInstance(Class.forName("org.apache.html.dom.HTMLLabelElementImpl"));
        Object term5751907 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        setShortField(term5751833, term5751833.getClass(), "flags", (short) 0);
        setField(term5751833, term5751833.getClass(), "attributes", term5751907);
        term5751981 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term5751981, term5751981.getClass(), "prefix", "");
        setField(term5751981, term5751981.getClass(), "name", "en");
        HashMap term5752148 = new HashMap();
        term5752145 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term5752146 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        Object term5752147 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5752146, term5752146.getClass(), "propertyName", null);
        setField(term5752146, term5752146.getClass(), "beanInfo", null);
        setField(term5752146, term5752146.getClass(), "propertyDescriptors", null);
        setField(term5752146, term5752146.getClass(), "propertyDescriptor", null);
        setField(term5752146, term5752146.getClass(), "names", null);
        setField(term5752146, term5752146.getClass(), "baseValue", null);
        setField(term5752146, term5752146.getClass(), "value", null);
        setIntField(term5752146, term5752146.getClass(), "propertyIndex", 0);
        setField(term5752146, term5752146.getClass(), "bean", null);
        setIntField(term5752146, term5752146.getClass(), "index", 0);
        setBooleanField(term5752146, term5752146.getClass(), "attribute", false);
        setField(term5752146, term5752146.getClass(), "rootNode", null);
        setField(term5752147, term5752147.getClass(), "parent", null);
        setField(term5752147, term5752147.getClass(), "namespaceMap", term5752148);
        setField(term5752147, term5752147.getClass(), "reverseMap", null);
        setField(term5752147, term5752147.getClass(), "pointer", null);
        setBooleanField(term5752147, term5752147.getClass(), "sealed", false);
        setField(term5752146, term5752146.getClass(), "namespaceResolver", term5752147);
        setField(term5752146, term5752146.getClass(), "parent", null);
        setField(term5752146, term5752146.getClass(), "locale", null);
        setField(term5752145, term5752145.getClass(), "parent", term5752146);
        setField(term5752145, term5752145.getClass(), "name", null);
        setField(term5752145, term5752145.getClass(), "attributes", null);
        setIntField(term5752145, term5752145.getClass(), "position", 0);
        term5752150 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term5752150, term5752150.getClass(), "prefix", "");
        setField(term5752150, term5752150.getClass(), "name", "en");
        setField(term5752150, term5752150.getClass(), "qualifiedName", null);
        term5752155 = newInstance(Class.forName("org.apache.html.dom.HTMLLabelElementImpl"));
        Object term5752156 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        setField(term5752155, term5752155.getClass(), "name", null);
        setShortField(term5752156, term5752156.getClass(), "flags", (short) 0);
        setField(term5752156, term5752156.getClass(), "nodes", null);
        setField(term5752156, term5752156.getClass(), "ownerNode", null);
        setField(term5752155, term5752155.getClass(), "attributes", term5752156);
        setField(term5752155, term5752155.getClass(), "ownerDocument", null);
        setField(term5752155, term5752155.getClass(), "firstChild", null);
        setField(term5752155, term5752155.getClass(), "fNodeListCache", null);
        setField(term5752155, term5752155.getClass(), "previousSibling", null);
        setField(term5752155, term5752155.getClass(), "nextSibling", null);
        setField(term5752155, term5752155.getClass(), "ownerNode", null);
        setShortField(term5752155, term5752155.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term5751833;
        args[1] = term5751981;
        Object retValue = callMethod(klass, "getAttribute", argTypes, term5751257, args);
        assertTrue(recursiveEquals(term5751257, term5752145));
        assertTrue(recursiveEquals(term5751833, term5752150));
        assertTrue(recursiveEquals(term5751981, term5752155));
        assertTrue(recursiveEquals(retValue, null));
    }

};


