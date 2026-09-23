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

public class DOMAttributeIterator_getAttribute_539782597337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5748864;
     Object term5749548;
     Object term5749622;
     Object term5749800;
     Object term5749806;
     Object term5749811;

    public DOMAttributeIterator_getAttribute_539782597337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5749242 = new HashMap();
        ((HashMap) term5749242).put("", "");
        term5748864 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term5748980 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term5749096 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term5749194 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5748980, term5748980.getClass(), "namespaceResolver", null);
        setField(term5749194, term5749194.getClass(), "namespaceMap", term5749242);
        setField(term5749096, term5749096.getClass(), "namespaceResolver", term5749194);
        setField(term5748980, term5748980.getClass(), "parent", term5749096);
        setField(term5748864, term5748864.getClass(), "parent", term5748980);
        term5749548 = newInstance(Class.forName("org.apache.html.dom.HTMLAnchorElementImpl"));
        term5749622 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term5749622, term5749622.getClass(), "prefix", "");
        setField(term5749622, term5749622.getClass(), "name", "");
        HashMap term5749803 = new HashMap();
        term5749800 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term5749801 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term5749802 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5749805 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        setField(term5749801, term5749801.getClass(), "prefix", null);
        setField(term5749801, term5749801.getClass(), "namespaceURI", null);
        setIntField(term5749801, term5749801.getClass(), "index", 0);
        setBooleanField(term5749801, term5749801.getClass(), "attribute", false);
        setField(term5749801, term5749801.getClass(), "rootNode", null);
        setField(term5749802, term5749802.getClass(), "parent", null);
        setField(term5749802, term5749802.getClass(), "namespaceMap", term5749803);
        setField(term5749802, term5749802.getClass(), "reverseMap", null);
        setField(term5749802, term5749802.getClass(), "pointer", null);
        setBooleanField(term5749802, term5749802.getClass(), "sealed", false);
        setField(term5749801, term5749801.getClass(), "namespaceResolver", term5749802);
        setField(term5749805, term5749805.getClass(), "prefix", null);
        setField(term5749805, term5749805.getClass(), "namespaceURI", null);
        setIntField(term5749805, term5749805.getClass(), "index", 0);
        setBooleanField(term5749805, term5749805.getClass(), "attribute", false);
        setField(term5749805, term5749805.getClass(), "rootNode", null);
        setField(term5749805, term5749805.getClass(), "namespaceResolver", term5749802);
        setField(term5749805, term5749805.getClass(), "parent", null);
        setField(term5749805, term5749805.getClass(), "locale", null);
        setField(term5749801, term5749801.getClass(), "parent", term5749805);
        setField(term5749801, term5749801.getClass(), "locale", null);
        setField(term5749800, term5749800.getClass(), "parent", term5749801);
        setField(term5749800, term5749800.getClass(), "name", null);
        setField(term5749800, term5749800.getClass(), "attributes", null);
        setIntField(term5749800, term5749800.getClass(), "position", 0);
        term5749806 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term5749806, term5749806.getClass(), "prefix", "");
        setField(term5749806, term5749806.getClass(), "name", "");
        setField(term5749806, term5749806.getClass(), "qualifiedName", null);
        term5749811 = newInstance(Class.forName("org.apache.html.dom.HTMLAnchorElementImpl"));
        Object term5749812 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        setField(term5749811, term5749811.getClass(), "name", null);
        setShortField(term5749812, term5749812.getClass(), "flags", (short) 0);
        setField(term5749812, term5749812.getClass(), "nodes", null);
        setField(term5749812, term5749812.getClass(), "ownerNode", term5749811);
        setField(term5749811, term5749811.getClass(), "attributes", term5749812);
        setField(term5749811, term5749811.getClass(), "ownerDocument", null);
        setField(term5749811, term5749811.getClass(), "firstChild", null);
        setField(term5749811, term5749811.getClass(), "fNodeListCache", null);
        setField(term5749811, term5749811.getClass(), "previousSibling", null);
        setField(term5749811, term5749811.getClass(), "nextSibling", null);
        setField(term5749811, term5749811.getClass(), "ownerNode", null);
        setShortField(term5749811, term5749811.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term5749548;
        args[1] = term5749622;
        Object retValue = callMethod(klass, "getAttribute", argTypes, term5748864, args);
        assertTrue(recursiveEquals(term5748864, term5749800));
        assertTrue(recursiveEquals(term5749548, term5749806));
        assertTrue(recursiveEquals(term5749622, term5749811));
        assertTrue(recursiveEquals(retValue, null));
    }

};


