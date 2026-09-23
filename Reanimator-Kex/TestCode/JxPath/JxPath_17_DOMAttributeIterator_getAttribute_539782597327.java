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

public class DOMAttributeIterator_getAttribute_539782597327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5744002;
     Object term5744530;
     Object term5744604;
     Object term5744763;
     Object term5744768;
     Object term5744773;

    public DOMAttributeIterator_getAttribute_539782597327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5744264 = new HashMap();
        ((HashMap) term5744264).put("", "");
        ((HashMap) term5744264).put((Object)null, (Object)null);
        ((HashMap) term5744264).put((Object)null, (Object)null);
        ((HashMap) term5744264).put((Object)null, (Object)null);
        ((HashMap) term5744264).put((Object)null, (Object)null);
        ((HashMap) term5744264).put((Object)null, (Object)null);
        ((HashMap) term5744264).put((Object)null, (Object)null);
        ((HashMap) term5744264).put((Object)null, (Object)null);
        term5744002 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term5744118 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term5744216 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5744216, term5744216.getClass(), "namespaceMap", term5744264);
        setField(term5744118, term5744118.getClass(), "namespaceResolver", term5744216);
        setField(term5744002, term5744002.getClass(), "parent", term5744118);
        term5744530 = newInstance(Class.forName("org.apache.html.dom.HTMLTitleElementImpl"));
        setShortField(term5744530, term5744530.getClass(), "flags", (short) 0);
        setField(term5744530, term5744530.getClass(), "attributes", null);
        term5744604 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term5744604, term5744604.getClass(), "prefix", "");
        setField(term5744604, term5744604.getClass(), "name", "");
        HashMap term5744766 = new HashMap();
        term5744763 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term5744764 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term5744765 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5744764, term5744764.getClass(), "prefix", null);
        setField(term5744764, term5744764.getClass(), "namespaceURI", null);
        setIntField(term5744764, term5744764.getClass(), "index", 0);
        setBooleanField(term5744764, term5744764.getClass(), "attribute", false);
        setField(term5744764, term5744764.getClass(), "rootNode", null);
        setField(term5744765, term5744765.getClass(), "parent", null);
        setField(term5744765, term5744765.getClass(), "namespaceMap", term5744766);
        setField(term5744765, term5744765.getClass(), "reverseMap", null);
        setField(term5744765, term5744765.getClass(), "pointer", null);
        setBooleanField(term5744765, term5744765.getClass(), "sealed", false);
        setField(term5744764, term5744764.getClass(), "namespaceResolver", term5744765);
        setField(term5744764, term5744764.getClass(), "parent", null);
        setField(term5744764, term5744764.getClass(), "locale", null);
        setField(term5744763, term5744763.getClass(), "parent", term5744764);
        setField(term5744763, term5744763.getClass(), "name", null);
        setField(term5744763, term5744763.getClass(), "attributes", null);
        setIntField(term5744763, term5744763.getClass(), "position", 0);
        term5744768 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term5744768, term5744768.getClass(), "prefix", "");
        setField(term5744768, term5744768.getClass(), "name", "");
        setField(term5744768, term5744768.getClass(), "qualifiedName", null);
        term5744773 = newInstance(Class.forName("org.apache.html.dom.HTMLTitleElementImpl"));
        Object term5744774 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        setField(term5744773, term5744773.getClass(), "name", null);
        setShortField(term5744774, term5744774.getClass(), "flags", (short) 0);
        setField(term5744774, term5744774.getClass(), "nodes", null);
        setField(term5744774, term5744774.getClass(), "ownerNode", term5744773);
        setField(term5744773, term5744773.getClass(), "attributes", term5744774);
        setField(term5744773, term5744773.getClass(), "ownerDocument", null);
        setField(term5744773, term5744773.getClass(), "firstChild", null);
        setField(term5744773, term5744773.getClass(), "fNodeListCache", null);
        setField(term5744773, term5744773.getClass(), "previousSibling", null);
        setField(term5744773, term5744773.getClass(), "nextSibling", null);
        setField(term5744773, term5744773.getClass(), "ownerNode", null);
        setShortField(term5744773, term5744773.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term5744530;
        args[1] = term5744604;
        Object retValue = callMethod(klass, "getAttribute", argTypes, term5744002, args);
        assertTrue(recursiveEquals(term5744002, term5744763));
        assertTrue(recursiveEquals(term5744530, term5744768));
        assertTrue(recursiveEquals(term5744604, term5744773));
        assertTrue(recursiveEquals(retValue, null));
    }

};


