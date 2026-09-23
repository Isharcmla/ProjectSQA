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

public class DOMAttributeIterator_init_7810902103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53547;
     Object term53703;
     Object term53799;
     Object term53808;
     Object term53811;

    public DOMAttributeIterator_init_7810902103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term53251 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term53357 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointer"));
        Object term53431 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setIntField(term53251, term53251.getClass(), "position", 0);
        setField(term53251, term53251.getClass(), "parent", term53357);
        setField(term53251, term53251.getClass(), "name", term53431);
        setField(term53251, term53251.getClass(), "attributes", null);
        term53547 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term53629 = newInstance(Class.forName("org.apache.html.dom.HTMLPreElementImpl"));
        setShortField(term53629, term53629.getClass(), "flags", (short) 0);
        setField(term53629, term53629.getClass(), "attributes", null);
        setField(term53547, term53547.getClass(), "node", term53629);
        term53703 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term53703, term53703.getClass(), "name", "*");
        ArrayList term53806 = new ArrayList();
        term53799 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term53800 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term53801 = newInstance(Class.forName("org.apache.html.dom.HTMLPreElementImpl"));
        Object term53802 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        Object term53803 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term53801, term53801.getClass(), "name", null);
        setShortField(term53802, term53802.getClass(), "flags", (short) 0);
        setField(term53802, term53802.getClass(), "nodes", null);
        setField(term53802, term53802.getClass(), "ownerNode", term53801);
        setField(term53801, term53801.getClass(), "attributes", term53802);
        setField(term53801, term53801.getClass(), "ownerDocument", null);
        setField(term53801, term53801.getClass(), "firstChild", null);
        setField(term53801, term53801.getClass(), "fNodeListCache", null);
        setField(term53801, term53801.getClass(), "previousSibling", null);
        setField(term53801, term53801.getClass(), "nextSibling", null);
        setField(term53801, term53801.getClass(), "ownerNode", null);
        setShortField(term53801, term53801.getClass(), "flags", (short) 0);
        setField(term53800, term53800.getClass(), "node", term53801);
        setField(term53800, term53800.getClass(), "id", null);
        setIntField(term53800, term53800.getClass(), "index", 0);
        setBooleanField(term53800, term53800.getClass(), "attribute", false);
        setField(term53800, term53800.getClass(), "rootNode", null);
        setField(term53800, term53800.getClass(), "namespaceResolver", null);
        setField(term53800, term53800.getClass(), "parent", null);
        setField(term53800, term53800.getClass(), "locale", null);
        setField(term53799, term53799.getClass(), "parent", term53800);
        setField(term53803, term53803.getClass(), "prefix", null);
        setField(term53803, term53803.getClass(), "name", "*");
        setField(term53803, term53803.getClass(), "qualifiedName", null);
        setField(term53799, term53799.getClass(), "name", term53803);
        setField(term53799, term53799.getClass(), "attributes", term53806);
        setIntField(term53799, term53799.getClass(), "position", 0);
        term53808 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term53809 = newInstance(Class.forName("org.apache.html.dom.HTMLPreElementImpl"));
        Object term53810 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        setField(term53809, term53809.getClass(), "name", null);
        setShortField(term53810, term53810.getClass(), "flags", (short) 0);
        setField(term53810, term53810.getClass(), "nodes", null);
        setField(term53810, term53810.getClass(), "ownerNode", term53809);
        setField(term53809, term53809.getClass(), "attributes", term53810);
        setField(term53809, term53809.getClass(), "ownerDocument", null);
        setField(term53809, term53809.getClass(), "firstChild", null);
        setField(term53809, term53809.getClass(), "fNodeListCache", null);
        setField(term53809, term53809.getClass(), "previousSibling", null);
        setField(term53809, term53809.getClass(), "nextSibling", null);
        setField(term53809, term53809.getClass(), "ownerNode", null);
        setShortField(term53809, term53809.getClass(), "flags", (short) 0);
        setField(term53808, term53808.getClass(), "node", term53809);
        setField(term53808, term53808.getClass(), "id", null);
        setIntField(term53808, term53808.getClass(), "index", 0);
        setBooleanField(term53808, term53808.getClass(), "attribute", false);
        setField(term53808, term53808.getClass(), "rootNode", null);
        setField(term53808, term53808.getClass(), "namespaceResolver", null);
        setField(term53808, term53808.getClass(), "parent", null);
        setField(term53808, term53808.getClass(), "locale", null);
        term53811 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term53811, term53811.getClass(), "prefix", null);
        setField(term53811, term53811.getClass(), "name", "*");
        setField(term53811, term53811.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term53547;
        args[1] = term53703;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term53799));
        assertTrue(recursiveEquals(term53547, term53808));
        assertTrue(recursiveEquals(term53703, term53811));
    }

};


