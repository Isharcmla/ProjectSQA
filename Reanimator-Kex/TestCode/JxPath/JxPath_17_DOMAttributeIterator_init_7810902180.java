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

public class DOMAttributeIterator_init_7810902180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94063;
     Object term94223;
     Object term95028;
     Object term95036;
     Object term95038;

    public DOMAttributeIterator_init_7810902180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term93943 = new ArrayList();
        Object term93817 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term93891 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setIntField(term93817, term93817.getClass(), "position", 0);
        setField(term93817, term93817.getClass(), "parent", null);
        setField(term93817, term93817.getClass(), "name", term93891);
        setField(term93817, term93817.getClass(), "attributes", term93943);
        term94063 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term94149 = newInstance(Class.forName("org.apache.html.dom.HTMLDListElementImpl"));
        setField(term94063, term94063.getClass(), "value", term94149);
        term94223 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term94223, term94223.getClass(), "name", "");
        ArrayList term95034 = new ArrayList();
        term95028 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term95029 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term95030 = newInstance(Class.forName("org.apache.html.dom.HTMLDListElementImpl"));
        Object term95031 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term95029, term95029.getClass(), "name", null);
        setField(term95029, term95029.getClass(), "bean", null);
        setField(term95029, term95029.getClass(), "handler", null);
        setField(term95030, term95030.getClass(), "name", null);
        setField(term95030, term95030.getClass(), "attributes", null);
        setField(term95030, term95030.getClass(), "ownerDocument", null);
        setField(term95030, term95030.getClass(), "firstChild", null);
        setField(term95030, term95030.getClass(), "fNodeListCache", null);
        setField(term95030, term95030.getClass(), "previousSibling", null);
        setField(term95030, term95030.getClass(), "nextSibling", null);
        setField(term95030, term95030.getClass(), "ownerNode", null);
        setShortField(term95030, term95030.getClass(), "flags", (short) 0);
        setField(term95029, term95029.getClass(), "value", term95030);
        setIntField(term95029, term95029.getClass(), "index", 0);
        setBooleanField(term95029, term95029.getClass(), "attribute", false);
        setField(term95029, term95029.getClass(), "rootNode", null);
        setField(term95029, term95029.getClass(), "namespaceResolver", null);
        setField(term95029, term95029.getClass(), "parent", null);
        setField(term95029, term95029.getClass(), "locale", null);
        setField(term95028, term95028.getClass(), "parent", term95029);
        setField(term95031, term95031.getClass(), "prefix", null);
        setField(term95031, term95031.getClass(), "name", "");
        setField(term95031, term95031.getClass(), "qualifiedName", null);
        setField(term95028, term95028.getClass(), "name", term95031);
        setField(term95028, term95028.getClass(), "attributes", term95034);
        setIntField(term95028, term95028.getClass(), "position", 0);
        term95036 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term95037 = newInstance(Class.forName("org.apache.html.dom.HTMLDListElementImpl"));
        setField(term95036, term95036.getClass(), "name", null);
        setField(term95036, term95036.getClass(), "bean", null);
        setField(term95036, term95036.getClass(), "handler", null);
        setField(term95037, term95037.getClass(), "name", null);
        setField(term95037, term95037.getClass(), "attributes", null);
        setField(term95037, term95037.getClass(), "ownerDocument", null);
        setField(term95037, term95037.getClass(), "firstChild", null);
        setField(term95037, term95037.getClass(), "fNodeListCache", null);
        setField(term95037, term95037.getClass(), "previousSibling", null);
        setField(term95037, term95037.getClass(), "nextSibling", null);
        setField(term95037, term95037.getClass(), "ownerNode", null);
        setShortField(term95037, term95037.getClass(), "flags", (short) 0);
        setField(term95036, term95036.getClass(), "value", term95037);
        setIntField(term95036, term95036.getClass(), "index", 0);
        setBooleanField(term95036, term95036.getClass(), "attribute", false);
        setField(term95036, term95036.getClass(), "rootNode", null);
        setField(term95036, term95036.getClass(), "namespaceResolver", null);
        setField(term95036, term95036.getClass(), "parent", null);
        setField(term95036, term95036.getClass(), "locale", null);
        term95038 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term95038, term95038.getClass(), "prefix", null);
        setField(term95038, term95038.getClass(), "name", "");
        setField(term95038, term95038.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term94063;
        args[1] = term94223;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term95028));
        assertTrue(recursiveEquals(term94063, term95036));
        assertTrue(recursiveEquals(term94223, term95038));
    }

};


