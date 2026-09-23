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

public class DOMAttributeIterator_init_7810902291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2034950;
     Object term2035108;
     Object term2035525;
     Object term2035534;
     Object term2035537;

    public DOMAttributeIterator_init_7810902291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2034830 = new ArrayList();
        Object term2034704 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term2034778 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setIntField(term2034704, term2034704.getClass(), "position", 0);
        setField(term2034704, term2034704.getClass(), "parent", null);
        setField(term2034704, term2034704.getClass(), "name", term2034778);
        setField(term2034704, term2034704.getClass(), "attributes", term2034830);
        term2034950 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term2035034 = newInstance(Class.forName("org.apache.wml.dom.WMLSetvarElementImpl"));
        setField(term2034950, term2034950.getClass(), "value", term2035034);
        term2035108 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2035108, term2035108.getClass(), "name", "*");
        ArrayList term2035532 = new ArrayList();
        term2035525 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term2035526 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term2035527 = newInstance(Class.forName("org.apache.wml.dom.WMLSetvarElementImpl"));
        Object term2035528 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        Object term2035529 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2035526, term2035526.getClass(), "name", null);
        setField(term2035526, term2035526.getClass(), "bean", null);
        setField(term2035526, term2035526.getClass(), "handler", null);
        setField(term2035527, term2035527.getClass(), "name", null);
        setShortField(term2035528, term2035528.getClass(), "flags", (short) 0);
        setField(term2035528, term2035528.getClass(), "nodes", null);
        setField(term2035528, term2035528.getClass(), "ownerNode", term2035527);
        setField(term2035527, term2035527.getClass(), "attributes", term2035528);
        setField(term2035527, term2035527.getClass(), "ownerDocument", null);
        setField(term2035527, term2035527.getClass(), "firstChild", null);
        setField(term2035527, term2035527.getClass(), "fNodeListCache", null);
        setField(term2035527, term2035527.getClass(), "previousSibling", null);
        setField(term2035527, term2035527.getClass(), "nextSibling", null);
        setField(term2035527, term2035527.getClass(), "ownerNode", null);
        setShortField(term2035527, term2035527.getClass(), "flags", (short) 0);
        setField(term2035526, term2035526.getClass(), "value", term2035527);
        setIntField(term2035526, term2035526.getClass(), "index", 0);
        setBooleanField(term2035526, term2035526.getClass(), "attribute", false);
        setField(term2035526, term2035526.getClass(), "rootNode", null);
        setField(term2035526, term2035526.getClass(), "namespaceResolver", null);
        setField(term2035526, term2035526.getClass(), "parent", null);
        setField(term2035526, term2035526.getClass(), "locale", null);
        setField(term2035525, term2035525.getClass(), "parent", term2035526);
        setField(term2035529, term2035529.getClass(), "prefix", null);
        setField(term2035529, term2035529.getClass(), "name", "*");
        setField(term2035529, term2035529.getClass(), "qualifiedName", null);
        setField(term2035525, term2035525.getClass(), "name", term2035529);
        setField(term2035525, term2035525.getClass(), "attributes", term2035532);
        setIntField(term2035525, term2035525.getClass(), "position", 0);
        term2035534 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term2035535 = newInstance(Class.forName("org.apache.wml.dom.WMLSetvarElementImpl"));
        Object term2035536 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        setField(term2035534, term2035534.getClass(), "name", null);
        setField(term2035534, term2035534.getClass(), "bean", null);
        setField(term2035534, term2035534.getClass(), "handler", null);
        setField(term2035535, term2035535.getClass(), "name", null);
        setShortField(term2035536, term2035536.getClass(), "flags", (short) 0);
        setField(term2035536, term2035536.getClass(), "nodes", null);
        setField(term2035536, term2035536.getClass(), "ownerNode", term2035535);
        setField(term2035535, term2035535.getClass(), "attributes", term2035536);
        setField(term2035535, term2035535.getClass(), "ownerDocument", null);
        setField(term2035535, term2035535.getClass(), "firstChild", null);
        setField(term2035535, term2035535.getClass(), "fNodeListCache", null);
        setField(term2035535, term2035535.getClass(), "previousSibling", null);
        setField(term2035535, term2035535.getClass(), "nextSibling", null);
        setField(term2035535, term2035535.getClass(), "ownerNode", null);
        setShortField(term2035535, term2035535.getClass(), "flags", (short) 0);
        setField(term2035534, term2035534.getClass(), "value", term2035535);
        setIntField(term2035534, term2035534.getClass(), "index", 0);
        setBooleanField(term2035534, term2035534.getClass(), "attribute", false);
        setField(term2035534, term2035534.getClass(), "rootNode", null);
        setField(term2035534, term2035534.getClass(), "namespaceResolver", null);
        setField(term2035534, term2035534.getClass(), "parent", null);
        setField(term2035534, term2035534.getClass(), "locale", null);
        term2035537 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2035537, term2035537.getClass(), "prefix", null);
        setField(term2035537, term2035537.getClass(), "name", "*");
        setField(term2035537, term2035537.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term2034950;
        args[1] = term2035108;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2035525));
        assertTrue(recursiveEquals(term2034950, term2035534));
        assertTrue(recursiveEquals(term2035108, term2035537));
    }

};


