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
import java.util.ArrayList;

public class DOMAttributeIterator_init_7810902188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97751;
     Object term97911;
     Object term98620;
     Object term98629;
     Object term98632;

    public DOMAttributeIterator_init_7810902188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term97631 = new ArrayList();
        Object term97579 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setIntField(term97579, term97579.getClass(), "position", 0);
        setField(term97579, term97579.getClass(), "parent", null);
        setField(term97579, term97579.getClass(), "name", null);
        setField(term97579, term97579.getClass(), "attributes", term97631);
        term97751 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term97837 = newInstance(Class.forName("org.apache.html.dom.HTMLDListElementImpl"));
        setField(term97751, term97751.getClass(), "value", term97837);
        term97911 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term97911, term97911.getClass(), "name", "*");
        ArrayList term98627 = new ArrayList();
        term98620 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term98621 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term98622 = newInstance(Class.forName("org.apache.html.dom.HTMLDListElementImpl"));
        Object term98623 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        Object term98624 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term98621, term98621.getClass(), "name", null);
        setField(term98621, term98621.getClass(), "bean", null);
        setField(term98621, term98621.getClass(), "handler", null);
        setField(term98622, term98622.getClass(), "name", null);
        setShortField(term98623, term98623.getClass(), "flags", (short) 0);
        setField(term98623, term98623.getClass(), "nodes", null);
        setField(term98623, term98623.getClass(), "ownerNode", term98622);
        setField(term98622, term98622.getClass(), "attributes", term98623);
        setField(term98622, term98622.getClass(), "ownerDocument", null);
        setField(term98622, term98622.getClass(), "firstChild", null);
        setField(term98622, term98622.getClass(), "fNodeListCache", null);
        setField(term98622, term98622.getClass(), "previousSibling", null);
        setField(term98622, term98622.getClass(), "nextSibling", null);
        setField(term98622, term98622.getClass(), "ownerNode", null);
        setShortField(term98622, term98622.getClass(), "flags", (short) 0);
        setField(term98621, term98621.getClass(), "value", term98622);
        setIntField(term98621, term98621.getClass(), "index", 0);
        setBooleanField(term98621, term98621.getClass(), "attribute", false);
        setField(term98621, term98621.getClass(), "rootNode", null);
        setField(term98621, term98621.getClass(), "namespaceResolver", null);
        setField(term98621, term98621.getClass(), "parent", null);
        setField(term98621, term98621.getClass(), "locale", null);
        setField(term98620, term98620.getClass(), "parent", term98621);
        setField(term98624, term98624.getClass(), "prefix", null);
        setField(term98624, term98624.getClass(), "name", "*");
        setField(term98624, term98624.getClass(), "qualifiedName", null);
        setField(term98620, term98620.getClass(), "name", term98624);
        setField(term98620, term98620.getClass(), "attributes", term98627);
        setIntField(term98620, term98620.getClass(), "position", 0);
        term98629 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term98630 = newInstance(Class.forName("org.apache.html.dom.HTMLDListElementImpl"));
        Object term98631 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        setField(term98629, term98629.getClass(), "name", null);
        setField(term98629, term98629.getClass(), "bean", null);
        setField(term98629, term98629.getClass(), "handler", null);
        setField(term98630, term98630.getClass(), "name", null);
        setShortField(term98631, term98631.getClass(), "flags", (short) 0);
        setField(term98631, term98631.getClass(), "nodes", null);
        setField(term98631, term98631.getClass(), "ownerNode", term98630);
        setField(term98630, term98630.getClass(), "attributes", term98631);
        setField(term98630, term98630.getClass(), "ownerDocument", null);
        setField(term98630, term98630.getClass(), "firstChild", null);
        setField(term98630, term98630.getClass(), "fNodeListCache", null);
        setField(term98630, term98630.getClass(), "previousSibling", null);
        setField(term98630, term98630.getClass(), "nextSibling", null);
        setField(term98630, term98630.getClass(), "ownerNode", null);
        setShortField(term98630, term98630.getClass(), "flags", (short) 0);
        setField(term98629, term98629.getClass(), "value", term98630);
        setIntField(term98629, term98629.getClass(), "index", 0);
        setBooleanField(term98629, term98629.getClass(), "attribute", false);
        setField(term98629, term98629.getClass(), "rootNode", null);
        setField(term98629, term98629.getClass(), "namespaceResolver", null);
        setField(term98629, term98629.getClass(), "parent", null);
        setField(term98629, term98629.getClass(), "locale", null);
        term98632 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term98632, term98632.getClass(), "prefix", null);
        setField(term98632, term98632.getClass(), "name", "*");
        setField(term98632, term98632.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term97751;
        args[1] = term97911;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term98620));
        assertTrue(recursiveEquals(term97751, term98629));
        assertTrue(recursiveEquals(term97911, term98632));
    }

};


