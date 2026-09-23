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

public class DOMAttributeIterator_getAttribute_539782597367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9648042;
     Object term9648606;
     Object term9648680;
     Object term9648835;
     Object term9648840;
     Object term9648845;

    public DOMAttributeIterator_getAttribute_539782597367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9648304 = new HashMap();
        ((HashMap) term9648304).put("", "");
        term9648042 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term9648158 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term9648256 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term9648256, term9648256.getClass(), "namespaceMap", term9648304);
        setField(term9648158, term9648158.getClass(), "namespaceResolver", term9648256);
        setField(term9648042, term9648042.getClass(), "parent", term9648158);
        term9648606 = newInstance(Class.forName("org.apache.html.dom.HTMLAreaElementImpl"));
        term9648680 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term9648680, term9648680.getClass(), "prefix", "");
        setField(term9648680, term9648680.getClass(), "name", "");
        HashMap term9648838 = new HashMap();
        term9648835 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term9648836 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term9648837 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term9648836, term9648836.getClass(), "prefix", null);
        setField(term9648836, term9648836.getClass(), "namespaceURI", null);
        setIntField(term9648836, term9648836.getClass(), "index", 0);
        setBooleanField(term9648836, term9648836.getClass(), "attribute", false);
        setField(term9648836, term9648836.getClass(), "rootNode", null);
        setField(term9648837, term9648837.getClass(), "parent", null);
        setField(term9648837, term9648837.getClass(), "namespaceMap", term9648838);
        setField(term9648837, term9648837.getClass(), "reverseMap", null);
        setField(term9648837, term9648837.getClass(), "pointer", null);
        setBooleanField(term9648837, term9648837.getClass(), "sealed", false);
        setField(term9648836, term9648836.getClass(), "namespaceResolver", term9648837);
        setField(term9648836, term9648836.getClass(), "parent", null);
        setField(term9648836, term9648836.getClass(), "locale", null);
        setField(term9648835, term9648835.getClass(), "parent", term9648836);
        setField(term9648835, term9648835.getClass(), "name", null);
        setField(term9648835, term9648835.getClass(), "attributes", null);
        setIntField(term9648835, term9648835.getClass(), "position", 0);
        term9648840 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term9648840, term9648840.getClass(), "prefix", "");
        setField(term9648840, term9648840.getClass(), "name", "");
        setField(term9648840, term9648840.getClass(), "qualifiedName", null);
        term9648845 = newInstance(Class.forName("org.apache.html.dom.HTMLAreaElementImpl"));
        Object term9648846 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        setField(term9648845, term9648845.getClass(), "name", null);
        setShortField(term9648846, term9648846.getClass(), "flags", (short) 0);
        setField(term9648846, term9648846.getClass(), "nodes", null);
        setField(term9648846, term9648846.getClass(), "ownerNode", term9648845);
        setField(term9648845, term9648845.getClass(), "attributes", term9648846);
        setField(term9648845, term9648845.getClass(), "ownerDocument", null);
        setField(term9648845, term9648845.getClass(), "firstChild", null);
        setField(term9648845, term9648845.getClass(), "fNodeListCache", null);
        setField(term9648845, term9648845.getClass(), "previousSibling", null);
        setField(term9648845, term9648845.getClass(), "nextSibling", null);
        setField(term9648845, term9648845.getClass(), "ownerNode", null);
        setShortField(term9648845, term9648845.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term9648606;
        args[1] = term9648680;
        Object retValue = callMethod(klass, "getAttribute", argTypes, term9648042, args);
        assertTrue(recursiveEquals(term9648042, term9648835));
        assertTrue(recursiveEquals(term9648606, term9648840));
        assertTrue(recursiveEquals(term9648680, term9648845));
        assertTrue(recursiveEquals(retValue, null));
    }

};


