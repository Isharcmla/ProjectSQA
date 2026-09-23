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

public class DOMAttributeIterator_getAttribute_539782597371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9650412;
     Object term9651112;
     Object term9651260;
     Object term9651435;
     Object term9651441;
     Object term9651446;

    public DOMAttributeIterator_getAttribute_539782597371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9650808 = new HashMap();
        ((HashMap) term9650808).put("", "");
        term9650412 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term9650536 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullElementPointer"));
        Object term9650662 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term9650760 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term9650536, term9650536.getClass(), "namespaceResolver", null);
        setField(term9650760, term9650760.getClass(), "namespaceMap", term9650808);
        setField(term9650662, term9650662.getClass(), "namespaceResolver", term9650760);
        setField(term9650536, term9650536.getClass(), "parent", term9650662);
        setField(term9650412, term9650412.getClass(), "parent", term9650536);
        term9651112 = newInstance(Class.forName("org.apache.html.dom.HTMLTableElementImpl"));
        Object term9651186 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        setShortField(term9651112, term9651112.getClass(), "flags", (short) 0);
        setField(term9651112, term9651112.getClass(), "attributes", term9651186);
        term9651260 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term9651260, term9651260.getClass(), "prefix", "");
        setField(term9651260, term9651260.getClass(), "name", "");
        HashMap term9651438 = new HashMap();
        term9651435 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term9651436 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullElementPointer"));
        Object term9651437 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term9651440 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setField(term9651436, term9651436.getClass(), "collection", null);
        setField(term9651436, term9651436.getClass(), "valuePointer", null);
        setIntField(term9651436, term9651436.getClass(), "index", 0);
        setBooleanField(term9651436, term9651436.getClass(), "attribute", false);
        setField(term9651436, term9651436.getClass(), "rootNode", null);
        setField(term9651437, term9651437.getClass(), "parent", null);
        setField(term9651437, term9651437.getClass(), "namespaceMap", term9651438);
        setField(term9651437, term9651437.getClass(), "reverseMap", null);
        setField(term9651437, term9651437.getClass(), "pointer", null);
        setBooleanField(term9651437, term9651437.getClass(), "sealed", false);
        setField(term9651436, term9651436.getClass(), "namespaceResolver", term9651437);
        setField(term9651440, term9651440.getClass(), "attr", null);
        setIntField(term9651440, term9651440.getClass(), "index", 0);
        setBooleanField(term9651440, term9651440.getClass(), "attribute", false);
        setField(term9651440, term9651440.getClass(), "rootNode", null);
        setField(term9651440, term9651440.getClass(), "namespaceResolver", term9651437);
        setField(term9651440, term9651440.getClass(), "parent", null);
        setField(term9651440, term9651440.getClass(), "locale", null);
        setField(term9651436, term9651436.getClass(), "parent", term9651440);
        setField(term9651436, term9651436.getClass(), "locale", null);
        setField(term9651435, term9651435.getClass(), "parent", term9651436);
        setField(term9651435, term9651435.getClass(), "name", null);
        setField(term9651435, term9651435.getClass(), "attributes", null);
        setIntField(term9651435, term9651435.getClass(), "position", 0);
        term9651441 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term9651441, term9651441.getClass(), "prefix", "");
        setField(term9651441, term9651441.getClass(), "name", "");
        setField(term9651441, term9651441.getClass(), "qualifiedName", null);
        term9651446 = newInstance(Class.forName("org.apache.html.dom.HTMLTableElementImpl"));
        Object term9651447 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        setField(term9651446, term9651446.getClass(), "_rows", null);
        setField(term9651446, term9651446.getClass(), "_bodies", null);
        setField(term9651446, term9651446.getClass(), "name", null);
        setShortField(term9651447, term9651447.getClass(), "flags", (short) 0);
        setField(term9651447, term9651447.getClass(), "nodes", null);
        setField(term9651447, term9651447.getClass(), "ownerNode", null);
        setField(term9651446, term9651446.getClass(), "attributes", term9651447);
        setField(term9651446, term9651446.getClass(), "ownerDocument", null);
        setField(term9651446, term9651446.getClass(), "firstChild", null);
        setField(term9651446, term9651446.getClass(), "fNodeListCache", null);
        setField(term9651446, term9651446.getClass(), "previousSibling", null);
        setField(term9651446, term9651446.getClass(), "nextSibling", null);
        setField(term9651446, term9651446.getClass(), "ownerNode", null);
        setShortField(term9651446, term9651446.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term9651112;
        args[1] = term9651260;
        Object retValue = callMethod(klass, "getAttribute", argTypes, term9650412, args);
        assertTrue(recursiveEquals(term9650412, term9651435));
        assertTrue(recursiveEquals(term9651112, term9651441));
        assertTrue(recursiveEquals(term9651260, term9651446));
        assertTrue(recursiveEquals(retValue, null));
    }

};


