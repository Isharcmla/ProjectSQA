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

public class DOMAttributeIterator_getAttribute_539782597254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136891;
     Object term137457;
     Object term137531;
     Object term138476;
     Object term138481;
     Object term138486;

    public DOMAttributeIterator_getAttribute_539782597254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term137153 = new HashMap();
        ((HashMap) term137153).put("", "");
        term136891 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term137007 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term137105 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term137105, term137105.getClass(), "namespaceMap", term137153);
        setField(term137007, term137007.getClass(), "namespaceResolver", term137105);
        setField(term136891, term136891.getClass(), "parent", term137007);
        term137457 = newInstance(Class.forName("org.apache.html.dom.HTMLTitleElementImpl"));
        term137531 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term137531, term137531.getClass(), "prefix", "");
        setField(term137531, term137531.getClass(), "name", "");
        HashMap term138479 = new HashMap();
        term138476 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term138477 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term138478 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term138477, term138477.getClass(), "prefix", null);
        setField(term138477, term138477.getClass(), "namespaceURI", null);
        setIntField(term138477, term138477.getClass(), "index", 0);
        setBooleanField(term138477, term138477.getClass(), "attribute", false);
        setField(term138477, term138477.getClass(), "rootNode", null);
        setField(term138478, term138478.getClass(), "parent", null);
        setField(term138478, term138478.getClass(), "namespaceMap", term138479);
        setField(term138478, term138478.getClass(), "reverseMap", null);
        setField(term138478, term138478.getClass(), "pointer", null);
        setBooleanField(term138478, term138478.getClass(), "sealed", false);
        setField(term138477, term138477.getClass(), "namespaceResolver", term138478);
        setField(term138477, term138477.getClass(), "parent", null);
        setField(term138477, term138477.getClass(), "locale", null);
        setField(term138476, term138476.getClass(), "parent", term138477);
        setField(term138476, term138476.getClass(), "name", null);
        setField(term138476, term138476.getClass(), "attributes", null);
        setIntField(term138476, term138476.getClass(), "position", 0);
        term138481 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term138481, term138481.getClass(), "prefix", "");
        setField(term138481, term138481.getClass(), "name", "");
        setField(term138481, term138481.getClass(), "qualifiedName", null);
        term138486 = newInstance(Class.forName("org.apache.html.dom.HTMLTitleElementImpl"));
        Object term138487 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        setField(term138486, term138486.getClass(), "name", null);
        setShortField(term138487, term138487.getClass(), "flags", (short) 0);
        setField(term138487, term138487.getClass(), "nodes", null);
        setField(term138487, term138487.getClass(), "ownerNode", term138486);
        setField(term138486, term138486.getClass(), "attributes", term138487);
        setField(term138486, term138486.getClass(), "ownerDocument", null);
        setField(term138486, term138486.getClass(), "firstChild", null);
        setField(term138486, term138486.getClass(), "fNodeListCache", null);
        setField(term138486, term138486.getClass(), "previousSibling", null);
        setField(term138486, term138486.getClass(), "nextSibling", null);
        setField(term138486, term138486.getClass(), "ownerNode", null);
        setShortField(term138486, term138486.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term137457;
        args[1] = term137531;
        Object retValue = callMethod(klass, "getAttribute", argTypes, term136891, args);
        assertTrue(recursiveEquals(term136891, term138476));
        assertTrue(recursiveEquals(term137457, term138481));
        assertTrue(recursiveEquals(term137531, term138486));
        assertTrue(recursiveEquals(retValue, null));
    }

};


