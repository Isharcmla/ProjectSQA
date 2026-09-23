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

public class DOMAttributeIterator_getAttribute_539782597265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143707;
     Object term144281;
     Object term144355;
     Object term144512;
     Object term144517;
     Object term144522;

    public DOMAttributeIterator_getAttribute_539782597265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term143979 = new HashMap();
        ((HashMap) term143979).put("", "");
        term143707 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term143833 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        Object term143931 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term143931, term143931.getClass(), "namespaceMap", term143979);
        setField(term143833, term143833.getClass(), "namespaceResolver", term143931);
        setField(term143707, term143707.getClass(), "parent", term143833);
        term144281 = newInstance(Class.forName("org.apache.html.dom.HTMLBodyElementImpl"));
        term144355 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term144355, term144355.getClass(), "prefix", "");
        setField(term144355, term144355.getClass(), "name", "");
        HashMap term144515 = new HashMap();
        term144512 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term144513 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        Object term144514 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term144513, term144513.getClass(), "propertyName", null);
        setField(term144513, term144513.getClass(), "beanInfo", null);
        setField(term144513, term144513.getClass(), "propertyDescriptors", null);
        setField(term144513, term144513.getClass(), "propertyDescriptor", null);
        setField(term144513, term144513.getClass(), "names", null);
        setField(term144513, term144513.getClass(), "baseValue", null);
        setField(term144513, term144513.getClass(), "value", null);
        setIntField(term144513, term144513.getClass(), "propertyIndex", 0);
        setField(term144513, term144513.getClass(), "bean", null);
        setIntField(term144513, term144513.getClass(), "index", 0);
        setBooleanField(term144513, term144513.getClass(), "attribute", false);
        setField(term144513, term144513.getClass(), "rootNode", null);
        setField(term144514, term144514.getClass(), "parent", null);
        setField(term144514, term144514.getClass(), "namespaceMap", term144515);
        setField(term144514, term144514.getClass(), "reverseMap", null);
        setField(term144514, term144514.getClass(), "pointer", null);
        setBooleanField(term144514, term144514.getClass(), "sealed", false);
        setField(term144513, term144513.getClass(), "namespaceResolver", term144514);
        setField(term144513, term144513.getClass(), "parent", null);
        setField(term144513, term144513.getClass(), "locale", null);
        setField(term144512, term144512.getClass(), "parent", term144513);
        setField(term144512, term144512.getClass(), "name", null);
        setField(term144512, term144512.getClass(), "attributes", null);
        setIntField(term144512, term144512.getClass(), "position", 0);
        term144517 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term144517, term144517.getClass(), "prefix", "");
        setField(term144517, term144517.getClass(), "name", "");
        setField(term144517, term144517.getClass(), "qualifiedName", null);
        term144522 = newInstance(Class.forName("org.apache.html.dom.HTMLBodyElementImpl"));
        Object term144523 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        setField(term144522, term144522.getClass(), "name", null);
        setShortField(term144523, term144523.getClass(), "flags", (short) 0);
        setField(term144523, term144523.getClass(), "nodes", null);
        setField(term144523, term144523.getClass(), "ownerNode", term144522);
        setField(term144522, term144522.getClass(), "attributes", term144523);
        setField(term144522, term144522.getClass(), "ownerDocument", null);
        setField(term144522, term144522.getClass(), "firstChild", null);
        setField(term144522, term144522.getClass(), "fNodeListCache", null);
        setField(term144522, term144522.getClass(), "previousSibling", null);
        setField(term144522, term144522.getClass(), "nextSibling", null);
        setField(term144522, term144522.getClass(), "ownerNode", null);
        setShortField(term144522, term144522.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term144281;
        args[1] = term144355;
        Object retValue = callMethod(klass, "getAttribute", argTypes, term143707, args);
        assertTrue(recursiveEquals(term143707, term144512));
        assertTrue(recursiveEquals(term144281, term144517));
        assertTrue(recursiveEquals(term144355, term144522));
        assertTrue(recursiveEquals(retValue, null));
    }

};


