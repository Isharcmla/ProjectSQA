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

public class DOMAttributeIterator_getAttribute_53978259740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7553;
     Object term7763;
     Object term7837;
     Object term8212;
     Object term8214;
     Object term8219;

    public DOMAttributeIterator_getAttribute_53978259740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7553 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term7679 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        setField(term7553, term7553.getClass(), "parent", term7679);
        term7763 = newInstance(Class.forName("org.apache.wml.dom.WMLSetvarElementImpl"));
        term7837 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term7837, term7837.getClass(), "prefix", "");
        setField(term7837, term7837.getClass(), "name", "");
        term8212 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term8213 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        setField(term8213, term8213.getClass(), "propertyName", null);
        setField(term8213, term8213.getClass(), "beanInfo", null);
        setField(term8213, term8213.getClass(), "propertyDescriptors", null);
        setField(term8213, term8213.getClass(), "propertyDescriptor", null);
        setField(term8213, term8213.getClass(), "names", null);
        setField(term8213, term8213.getClass(), "baseValue", null);
        setField(term8213, term8213.getClass(), "value", null);
        setIntField(term8213, term8213.getClass(), "propertyIndex", 0);
        setField(term8213, term8213.getClass(), "bean", null);
        setIntField(term8213, term8213.getClass(), "index", 0);
        setBooleanField(term8213, term8213.getClass(), "attribute", false);
        setField(term8213, term8213.getClass(), "rootNode", null);
        setField(term8213, term8213.getClass(), "namespaceResolver", null);
        setField(term8213, term8213.getClass(), "parent", null);
        setField(term8213, term8213.getClass(), "locale", null);
        setField(term8212, term8212.getClass(), "parent", term8213);
        setField(term8212, term8212.getClass(), "name", null);
        setField(term8212, term8212.getClass(), "attributes", null);
        setIntField(term8212, term8212.getClass(), "position", 0);
        term8214 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term8214, term8214.getClass(), "prefix", "");
        setField(term8214, term8214.getClass(), "name", "");
        setField(term8214, term8214.getClass(), "qualifiedName", null);
        term8219 = newInstance(Class.forName("org.apache.wml.dom.WMLSetvarElementImpl"));
        setField(term8219, term8219.getClass(), "name", null);
        setField(term8219, term8219.getClass(), "attributes", null);
        setField(term8219, term8219.getClass(), "ownerDocument", null);
        setField(term8219, term8219.getClass(), "firstChild", null);
        setField(term8219, term8219.getClass(), "fNodeListCache", null);
        setField(term8219, term8219.getClass(), "previousSibling", null);
        setField(term8219, term8219.getClass(), "nextSibling", null);
        setField(term8219, term8219.getClass(), "ownerNode", null);
        setShortField(term8219, term8219.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term7763;
        args[1] = term7837;
        Object retValue = callMethod(klass, "getAttribute", argTypes, term7553, args);
        assertTrue(recursiveEquals(term7553, term8212));
        assertTrue(recursiveEquals(term7763, term8214));
        assertTrue(recursiveEquals(term7837, term8219));
        assertTrue(recursiveEquals(retValue, null));
    }

};


