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

public class DOMAttributeIterator_getAttribute_539782597357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9577928;
     Object term9578494;
     Object term9578568;
     Object term9578723;
     Object term9578728;
     Object term9578733;

    public DOMAttributeIterator_getAttribute_539782597357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9578190 = new HashMap();
        ((HashMap) term9578190).put("", "");
        term9577928 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term9578044 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term9578142 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term9578142, term9578142.getClass(), "namespaceMap", term9578190);
        setField(term9578044, term9578044.getClass(), "namespaceResolver", term9578142);
        setField(term9577928, term9577928.getClass(), "parent", term9578044);
        term9578494 = newInstance(Class.forName("org.apache.html.dom.HTMLUListElementImpl"));
        term9578568 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term9578568, term9578568.getClass(), "prefix", "");
        setField(term9578568, term9578568.getClass(), "name", "");
        HashMap term9578726 = new HashMap();
        term9578723 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term9578724 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term9578725 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term9578724, term9578724.getClass(), "prefix", null);
        setField(term9578724, term9578724.getClass(), "namespaceURI", null);
        setIntField(term9578724, term9578724.getClass(), "index", 0);
        setBooleanField(term9578724, term9578724.getClass(), "attribute", false);
        setField(term9578724, term9578724.getClass(), "rootNode", null);
        setField(term9578725, term9578725.getClass(), "parent", null);
        setField(term9578725, term9578725.getClass(), "namespaceMap", term9578726);
        setField(term9578725, term9578725.getClass(), "reverseMap", null);
        setField(term9578725, term9578725.getClass(), "pointer", null);
        setBooleanField(term9578725, term9578725.getClass(), "sealed", false);
        setField(term9578724, term9578724.getClass(), "namespaceResolver", term9578725);
        setField(term9578724, term9578724.getClass(), "parent", null);
        setField(term9578724, term9578724.getClass(), "locale", null);
        setField(term9578723, term9578723.getClass(), "parent", term9578724);
        setField(term9578723, term9578723.getClass(), "name", null);
        setField(term9578723, term9578723.getClass(), "attributes", null);
        setIntField(term9578723, term9578723.getClass(), "position", 0);
        term9578728 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term9578728, term9578728.getClass(), "prefix", "");
        setField(term9578728, term9578728.getClass(), "name", "");
        setField(term9578728, term9578728.getClass(), "qualifiedName", null);
        term9578733 = newInstance(Class.forName("org.apache.html.dom.HTMLUListElementImpl"));
        Object term9578734 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        setField(term9578733, term9578733.getClass(), "name", null);
        setShortField(term9578734, term9578734.getClass(), "flags", (short) 0);
        setField(term9578734, term9578734.getClass(), "nodes", null);
        setField(term9578734, term9578734.getClass(), "ownerNode", term9578733);
        setField(term9578733, term9578733.getClass(), "attributes", term9578734);
        setField(term9578733, term9578733.getClass(), "ownerDocument", null);
        setField(term9578733, term9578733.getClass(), "firstChild", null);
        setField(term9578733, term9578733.getClass(), "fNodeListCache", null);
        setField(term9578733, term9578733.getClass(), "previousSibling", null);
        setField(term9578733, term9578733.getClass(), "nextSibling", null);
        setField(term9578733, term9578733.getClass(), "ownerNode", null);
        setShortField(term9578733, term9578733.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term9578494;
        args[1] = term9578568;
        Object retValue = callMethod(klass, "getAttribute", argTypes, term9577928, args);
        assertTrue(recursiveEquals(term9577928, term9578723));
        assertTrue(recursiveEquals(term9578494, term9578728));
        assertTrue(recursiveEquals(term9578568, term9578733));
        assertTrue(recursiveEquals(retValue, null));
    }

};


