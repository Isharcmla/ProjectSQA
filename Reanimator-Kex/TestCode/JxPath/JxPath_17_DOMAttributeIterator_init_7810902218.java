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

public class DOMAttributeIterator_init_7810902218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114549;
     Object term114855;
     Object term116274;
     Object term116286;
     Object term116290;

    public DOMAttributeIterator_init_7810902218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term114287 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term114429 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        setIntField(term114287, term114287.getClass(), "position", 0);
        setField(term114287, term114287.getClass(), "parent", term114429);
        setField(term114287, term114287.getClass(), "name", null);
        setField(term114287, term114287.getClass(), "attributes", null);
        HashMap term114781 = new HashMap();
        term114549 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term114635 = newInstance(Class.forName("org.apache.html.dom.HTMLDListElementImpl"));
        Object term114733 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term114549, term114549.getClass(), "value", term114635);
        setField(term114733, term114733.getClass(), "namespaceMap", term114781);
        setField(term114549, term114549.getClass(), "namespaceResolver", term114733);
        term114855 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term114855, term114855.getClass(), "name", "            ");
        setField(term114855, term114855.getClass(), "prefix", "");
        HashMap term116278 = new HashMap();
        ArrayList term116284 = new ArrayList();
        term116274 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term116275 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term116276 = newInstance(Class.forName("org.apache.html.dom.HTMLDListElementImpl"));
        Object term116277 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term116279 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term116275, term116275.getClass(), "name", null);
        setField(term116275, term116275.getClass(), "bean", null);
        setField(term116275, term116275.getClass(), "handler", null);
        setField(term116276, term116276.getClass(), "name", null);
        setField(term116276, term116276.getClass(), "attributes", null);
        setField(term116276, term116276.getClass(), "ownerDocument", null);
        setField(term116276, term116276.getClass(), "firstChild", null);
        setField(term116276, term116276.getClass(), "fNodeListCache", null);
        setField(term116276, term116276.getClass(), "previousSibling", null);
        setField(term116276, term116276.getClass(), "nextSibling", null);
        setField(term116276, term116276.getClass(), "ownerNode", null);
        setShortField(term116276, term116276.getClass(), "flags", (short) 0);
        setField(term116275, term116275.getClass(), "value", term116276);
        setIntField(term116275, term116275.getClass(), "index", 0);
        setBooleanField(term116275, term116275.getClass(), "attribute", false);
        setField(term116275, term116275.getClass(), "rootNode", null);
        setField(term116277, term116277.getClass(), "parent", null);
        setField(term116277, term116277.getClass(), "namespaceMap", term116278);
        setField(term116277, term116277.getClass(), "reverseMap", null);
        setField(term116277, term116277.getClass(), "pointer", null);
        setBooleanField(term116277, term116277.getClass(), "sealed", false);
        setField(term116275, term116275.getClass(), "namespaceResolver", term116277);
        setField(term116275, term116275.getClass(), "parent", null);
        setField(term116275, term116275.getClass(), "locale", null);
        setField(term116274, term116274.getClass(), "parent", term116275);
        setField(term116279, term116279.getClass(), "prefix", "");
        setField(term116279, term116279.getClass(), "name", "            ");
        setField(term116279, term116279.getClass(), "qualifiedName", null);
        setField(term116274, term116274.getClass(), "name", term116279);
        setField(term116274, term116274.getClass(), "attributes", term116284);
        setIntField(term116274, term116274.getClass(), "position", 0);
        HashMap term116289 = new HashMap();
        term116286 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term116287 = newInstance(Class.forName("org.apache.html.dom.HTMLDListElementImpl"));
        Object term116288 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term116286, term116286.getClass(), "name", null);
        setField(term116286, term116286.getClass(), "bean", null);
        setField(term116286, term116286.getClass(), "handler", null);
        setField(term116287, term116287.getClass(), "name", null);
        setField(term116287, term116287.getClass(), "attributes", null);
        setField(term116287, term116287.getClass(), "ownerDocument", null);
        setField(term116287, term116287.getClass(), "firstChild", null);
        setField(term116287, term116287.getClass(), "fNodeListCache", null);
        setField(term116287, term116287.getClass(), "previousSibling", null);
        setField(term116287, term116287.getClass(), "nextSibling", null);
        setField(term116287, term116287.getClass(), "ownerNode", null);
        setShortField(term116287, term116287.getClass(), "flags", (short) 0);
        setField(term116286, term116286.getClass(), "value", term116287);
        setIntField(term116286, term116286.getClass(), "index", 0);
        setBooleanField(term116286, term116286.getClass(), "attribute", false);
        setField(term116286, term116286.getClass(), "rootNode", null);
        setField(term116288, term116288.getClass(), "parent", null);
        setField(term116288, term116288.getClass(), "namespaceMap", term116289);
        setField(term116288, term116288.getClass(), "reverseMap", null);
        setField(term116288, term116288.getClass(), "pointer", null);
        setBooleanField(term116288, term116288.getClass(), "sealed", false);
        setField(term116286, term116286.getClass(), "namespaceResolver", term116288);
        setField(term116286, term116286.getClass(), "parent", null);
        setField(term116286, term116286.getClass(), "locale", null);
        term116290 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term116290, term116290.getClass(), "prefix", "");
        setField(term116290, term116290.getClass(), "name", "            ");
        setField(term116290, term116290.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term114549;
        args[1] = term114855;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term116274));
        assertTrue(recursiveEquals(term114549, term116286));
        assertTrue(recursiveEquals(term114855, term116290));
    }

};


