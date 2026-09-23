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

public class DOMAttributeIterator_getAttribute_539782597257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138766;
     Object term139342;
     Object term139416;
     Object term139881;
     Object term139886;
     Object term139891;

    public DOMAttributeIterator_getAttribute_539782597257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term139038 = new HashMap();
        ((HashMap) term139038).put("", "");
        term138766 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term138892 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        Object term138990 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term138990, term138990.getClass(), "namespaceMap", term139038);
        setField(term138892, term138892.getClass(), "namespaceResolver", term138990);
        setField(term138766, term138766.getClass(), "parent", term138892);
        term139342 = newInstance(Class.forName("org.apache.html.dom.HTMLLabelElementImpl"));
        term139416 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term139416, term139416.getClass(), "prefix", "");
        setField(term139416, term139416.getClass(), "name", "");
        HashMap term139884 = new HashMap();
        term139881 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term139882 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        Object term139883 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term139882, term139882.getClass(), "propertyName", null);
        setField(term139882, term139882.getClass(), "beanInfo", null);
        setField(term139882, term139882.getClass(), "propertyDescriptors", null);
        setField(term139882, term139882.getClass(), "propertyDescriptor", null);
        setField(term139882, term139882.getClass(), "names", null);
        setField(term139882, term139882.getClass(), "baseValue", null);
        setField(term139882, term139882.getClass(), "value", null);
        setIntField(term139882, term139882.getClass(), "propertyIndex", 0);
        setField(term139882, term139882.getClass(), "bean", null);
        setIntField(term139882, term139882.getClass(), "index", 0);
        setBooleanField(term139882, term139882.getClass(), "attribute", false);
        setField(term139882, term139882.getClass(), "rootNode", null);
        setField(term139883, term139883.getClass(), "parent", null);
        setField(term139883, term139883.getClass(), "namespaceMap", term139884);
        setField(term139883, term139883.getClass(), "reverseMap", null);
        setField(term139883, term139883.getClass(), "pointer", null);
        setBooleanField(term139883, term139883.getClass(), "sealed", false);
        setField(term139882, term139882.getClass(), "namespaceResolver", term139883);
        setField(term139882, term139882.getClass(), "parent", null);
        setField(term139882, term139882.getClass(), "locale", null);
        setField(term139881, term139881.getClass(), "parent", term139882);
        setField(term139881, term139881.getClass(), "name", null);
        setField(term139881, term139881.getClass(), "attributes", null);
        setIntField(term139881, term139881.getClass(), "position", 0);
        term139886 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term139886, term139886.getClass(), "prefix", "");
        setField(term139886, term139886.getClass(), "name", "");
        setField(term139886, term139886.getClass(), "qualifiedName", null);
        term139891 = newInstance(Class.forName("org.apache.html.dom.HTMLLabelElementImpl"));
        Object term139892 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        setField(term139891, term139891.getClass(), "name", null);
        setShortField(term139892, term139892.getClass(), "flags", (short) 0);
        setField(term139892, term139892.getClass(), "nodes", null);
        setField(term139892, term139892.getClass(), "ownerNode", term139891);
        setField(term139891, term139891.getClass(), "attributes", term139892);
        setField(term139891, term139891.getClass(), "ownerDocument", null);
        setField(term139891, term139891.getClass(), "firstChild", null);
        setField(term139891, term139891.getClass(), "fNodeListCache", null);
        setField(term139891, term139891.getClass(), "previousSibling", null);
        setField(term139891, term139891.getClass(), "nextSibling", null);
        setField(term139891, term139891.getClass(), "ownerNode", null);
        setShortField(term139891, term139891.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term139342;
        args[1] = term139416;
        Object retValue = callMethod(klass, "getAttribute", argTypes, term138766, args);
        assertTrue(recursiveEquals(term138766, term139881));
        assertTrue(recursiveEquals(term139342, term139886));
        assertTrue(recursiveEquals(term139416, term139891));
        assertTrue(recursiveEquals(retValue, null));
    }

};


