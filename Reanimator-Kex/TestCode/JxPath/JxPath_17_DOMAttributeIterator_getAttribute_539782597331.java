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

public class DOMAttributeIterator_getAttribute_539782597331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5745337;
     Object term5745903;
     Object term5746051;
     Object term5746588;
     Object term5746593;
     Object term5746598;

    public DOMAttributeIterator_getAttribute_539782597331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5745599 = new HashMap();
        ((HashMap) term5745599).put("", "");
        term5745337 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term5745453 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term5745551 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5745551, term5745551.getClass(), "namespaceMap", term5745599);
        setField(term5745453, term5745453.getClass(), "namespaceResolver", term5745551);
        setField(term5745337, term5745337.getClass(), "parent", term5745453);
        term5745903 = newInstance(Class.forName("org.apache.html.dom.HTMLTitleElementImpl"));
        Object term5745977 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        setShortField(term5745903, term5745903.getClass(), "flags", (short) 0);
        setField(term5745903, term5745903.getClass(), "attributes", term5745977);
        term5746051 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term5746051, term5746051.getClass(), "prefix", "");
        setField(term5746051, term5746051.getClass(), "name", "en");
        HashMap term5746591 = new HashMap();
        term5746588 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term5746589 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term5746590 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5746589, term5746589.getClass(), "prefix", null);
        setField(term5746589, term5746589.getClass(), "namespaceURI", null);
        setIntField(term5746589, term5746589.getClass(), "index", 0);
        setBooleanField(term5746589, term5746589.getClass(), "attribute", false);
        setField(term5746589, term5746589.getClass(), "rootNode", null);
        setField(term5746590, term5746590.getClass(), "parent", null);
        setField(term5746590, term5746590.getClass(), "namespaceMap", term5746591);
        setField(term5746590, term5746590.getClass(), "reverseMap", null);
        setField(term5746590, term5746590.getClass(), "pointer", null);
        setBooleanField(term5746590, term5746590.getClass(), "sealed", false);
        setField(term5746589, term5746589.getClass(), "namespaceResolver", term5746590);
        setField(term5746589, term5746589.getClass(), "parent", null);
        setField(term5746589, term5746589.getClass(), "locale", null);
        setField(term5746588, term5746588.getClass(), "parent", term5746589);
        setField(term5746588, term5746588.getClass(), "name", null);
        setField(term5746588, term5746588.getClass(), "attributes", null);
        setIntField(term5746588, term5746588.getClass(), "position", 0);
        term5746593 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term5746593, term5746593.getClass(), "prefix", "");
        setField(term5746593, term5746593.getClass(), "name", "en");
        setField(term5746593, term5746593.getClass(), "qualifiedName", null);
        term5746598 = newInstance(Class.forName("org.apache.html.dom.HTMLTitleElementImpl"));
        Object term5746599 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        setField(term5746598, term5746598.getClass(), "name", null);
        setShortField(term5746599, term5746599.getClass(), "flags", (short) 0);
        setField(term5746599, term5746599.getClass(), "nodes", null);
        setField(term5746599, term5746599.getClass(), "ownerNode", null);
        setField(term5746598, term5746598.getClass(), "attributes", term5746599);
        setField(term5746598, term5746598.getClass(), "ownerDocument", null);
        setField(term5746598, term5746598.getClass(), "firstChild", null);
        setField(term5746598, term5746598.getClass(), "fNodeListCache", null);
        setField(term5746598, term5746598.getClass(), "previousSibling", null);
        setField(term5746598, term5746598.getClass(), "nextSibling", null);
        setField(term5746598, term5746598.getClass(), "ownerNode", null);
        setShortField(term5746598, term5746598.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term5745903;
        args[1] = term5746051;
        Object retValue = callMethod(klass, "getAttribute", argTypes, term5745337, args);
        assertTrue(recursiveEquals(term5745337, term5746588));
        assertTrue(recursiveEquals(term5745903, term5746593));
        assertTrue(recursiveEquals(term5746051, term5746598));
        assertTrue(recursiveEquals(retValue, null));
    }

};


