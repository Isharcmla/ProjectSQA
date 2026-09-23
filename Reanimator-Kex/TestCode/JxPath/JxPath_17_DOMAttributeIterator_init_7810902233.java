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
import java.util.ArrayList;

public class DOMAttributeIterator_init_7810902233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125592;
     Object term126116;
     Object term126658;
     Object term126672;
     Object term126678;

    public DOMAttributeIterator_init_7810902233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term125472 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setIntField(term125472, term125472.getClass(), "position", 0);
        setField(term125472, term125472.getClass(), "parent", null);
        setField(term125472, term125472.getClass(), "name", null);
        setField(term125472, term125472.getClass(), "attributes", null);
        HashMap term125824 = new HashMap();
        ((HashMap) term125824).put("", "");
        term125592 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term125678 = newInstance(Class.forName("org.apache.html.dom.HTMLDListElementImpl"));
        Object term125776 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term125592, term125592.getClass(), "value", term125678);
        setField(term125776, term125776.getClass(), "namespaceMap", term125824);
        setField(term125592, term125592.getClass(), "namespaceResolver", term125776);
        term126116 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term126116, term126116.getClass(), "name", "");
        setField(term126116, term126116.getClass(), "prefix", "");
        HashMap term126663 = new HashMap();
        ArrayList term126670 = new ArrayList();
        term126658 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term126659 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term126660 = newInstance(Class.forName("org.apache.html.dom.HTMLDListElementImpl"));
        Object term126661 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        Object term126662 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term126665 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term126659, term126659.getClass(), "name", null);
        setField(term126659, term126659.getClass(), "bean", null);
        setField(term126659, term126659.getClass(), "handler", null);
        setField(term126660, term126660.getClass(), "name", null);
        setShortField(term126661, term126661.getClass(), "flags", (short) 0);
        setField(term126661, term126661.getClass(), "nodes", null);
        setField(term126661, term126661.getClass(), "ownerNode", term126660);
        setField(term126660, term126660.getClass(), "attributes", term126661);
        setField(term126660, term126660.getClass(), "ownerDocument", null);
        setField(term126660, term126660.getClass(), "firstChild", null);
        setField(term126660, term126660.getClass(), "fNodeListCache", null);
        setField(term126660, term126660.getClass(), "previousSibling", null);
        setField(term126660, term126660.getClass(), "nextSibling", null);
        setField(term126660, term126660.getClass(), "ownerNode", null);
        setShortField(term126660, term126660.getClass(), "flags", (short) 0);
        setField(term126659, term126659.getClass(), "value", term126660);
        setIntField(term126659, term126659.getClass(), "index", 0);
        setBooleanField(term126659, term126659.getClass(), "attribute", false);
        setField(term126659, term126659.getClass(), "rootNode", null);
        setField(term126662, term126662.getClass(), "parent", null);
        setField(term126662, term126662.getClass(), "namespaceMap", term126663);
        setField(term126662, term126662.getClass(), "reverseMap", null);
        setField(term126662, term126662.getClass(), "pointer", null);
        setBooleanField(term126662, term126662.getClass(), "sealed", false);
        setField(term126659, term126659.getClass(), "namespaceResolver", term126662);
        setField(term126659, term126659.getClass(), "parent", null);
        setField(term126659, term126659.getClass(), "locale", null);
        setField(term126658, term126658.getClass(), "parent", term126659);
        setField(term126665, term126665.getClass(), "prefix", "");
        setField(term126665, term126665.getClass(), "name", "");
        setField(term126665, term126665.getClass(), "qualifiedName", null);
        setField(term126658, term126658.getClass(), "name", term126665);
        setField(term126658, term126658.getClass(), "attributes", term126670);
        setIntField(term126658, term126658.getClass(), "position", 0);
        HashMap term126676 = new HashMap();
        term126672 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term126673 = newInstance(Class.forName("org.apache.html.dom.HTMLDListElementImpl"));
        Object term126674 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        Object term126675 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term126672, term126672.getClass(), "name", null);
        setField(term126672, term126672.getClass(), "bean", null);
        setField(term126672, term126672.getClass(), "handler", null);
        setField(term126673, term126673.getClass(), "name", null);
        setShortField(term126674, term126674.getClass(), "flags", (short) 0);
        setField(term126674, term126674.getClass(), "nodes", null);
        setField(term126674, term126674.getClass(), "ownerNode", term126673);
        setField(term126673, term126673.getClass(), "attributes", term126674);
        setField(term126673, term126673.getClass(), "ownerDocument", null);
        setField(term126673, term126673.getClass(), "firstChild", null);
        setField(term126673, term126673.getClass(), "fNodeListCache", null);
        setField(term126673, term126673.getClass(), "previousSibling", null);
        setField(term126673, term126673.getClass(), "nextSibling", null);
        setField(term126673, term126673.getClass(), "ownerNode", null);
        setShortField(term126673, term126673.getClass(), "flags", (short) 0);
        setField(term126672, term126672.getClass(), "value", term126673);
        setIntField(term126672, term126672.getClass(), "index", 0);
        setBooleanField(term126672, term126672.getClass(), "attribute", false);
        setField(term126672, term126672.getClass(), "rootNode", null);
        setField(term126675, term126675.getClass(), "parent", null);
        setField(term126675, term126675.getClass(), "namespaceMap", term126676);
        setField(term126675, term126675.getClass(), "reverseMap", null);
        setField(term126675, term126675.getClass(), "pointer", null);
        setBooleanField(term126675, term126675.getClass(), "sealed", false);
        setField(term126672, term126672.getClass(), "namespaceResolver", term126675);
        setField(term126672, term126672.getClass(), "parent", null);
        setField(term126672, term126672.getClass(), "locale", null);
        term126678 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term126678, term126678.getClass(), "prefix", "");
        setField(term126678, term126678.getClass(), "name", "");
        setField(term126678, term126678.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term125592;
        args[1] = term126116;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term126658));
        assertTrue(recursiveEquals(term125592, term126672));
        assertTrue(recursiveEquals(term126116, term126678));
    }

};


