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

public class DOMAttributeIterator_init_781090292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23257;
     Object term23413;
     Object term43400;
     Object term43408;
     Object term43410;

    public DOMAttributeIterator_init_781090292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term23141 = new ArrayList();
        Object term22973 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term23089 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setIntField(term22973, term22973.getClass(), "position", 0);
        setField(term22973, term22973.getClass(), "parent", term23089);
        setField(term22973, term22973.getClass(), "name", null);
        setField(term22973, term22973.getClass(), "attributes", term23141);
        term23257 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term23339 = newInstance(Class.forName("org.apache.html.dom.HTMLPreElementImpl"));
        setField(term23257, term23257.getClass(), "node", term23339);
        term23413 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term23413, term23413.getClass(), "name", "");
        ArrayList term43406 = new ArrayList();
        term43400 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term43401 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term43402 = newInstance(Class.forName("org.apache.html.dom.HTMLPreElementImpl"));
        Object term43403 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term43402, term43402.getClass(), "name", null);
        setField(term43402, term43402.getClass(), "attributes", null);
        setField(term43402, term43402.getClass(), "ownerDocument", null);
        setField(term43402, term43402.getClass(), "firstChild", null);
        setField(term43402, term43402.getClass(), "fNodeListCache", null);
        setField(term43402, term43402.getClass(), "previousSibling", null);
        setField(term43402, term43402.getClass(), "nextSibling", null);
        setField(term43402, term43402.getClass(), "ownerNode", null);
        setShortField(term43402, term43402.getClass(), "flags", (short) 0);
        setField(term43401, term43401.getClass(), "node", term43402);
        setField(term43401, term43401.getClass(), "id", null);
        setIntField(term43401, term43401.getClass(), "index", 0);
        setBooleanField(term43401, term43401.getClass(), "attribute", false);
        setField(term43401, term43401.getClass(), "rootNode", null);
        setField(term43401, term43401.getClass(), "namespaceResolver", null);
        setField(term43401, term43401.getClass(), "parent", null);
        setField(term43401, term43401.getClass(), "locale", null);
        setField(term43400, term43400.getClass(), "parent", term43401);
        setField(term43403, term43403.getClass(), "prefix", null);
        setField(term43403, term43403.getClass(), "name", "");
        setField(term43403, term43403.getClass(), "qualifiedName", null);
        setField(term43400, term43400.getClass(), "name", term43403);
        setField(term43400, term43400.getClass(), "attributes", term43406);
        setIntField(term43400, term43400.getClass(), "position", 0);
        term43408 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term43409 = newInstance(Class.forName("org.apache.html.dom.HTMLPreElementImpl"));
        setField(term43409, term43409.getClass(), "name", null);
        setField(term43409, term43409.getClass(), "attributes", null);
        setField(term43409, term43409.getClass(), "ownerDocument", null);
        setField(term43409, term43409.getClass(), "firstChild", null);
        setField(term43409, term43409.getClass(), "fNodeListCache", null);
        setField(term43409, term43409.getClass(), "previousSibling", null);
        setField(term43409, term43409.getClass(), "nextSibling", null);
        setField(term43409, term43409.getClass(), "ownerNode", null);
        setShortField(term43409, term43409.getClass(), "flags", (short) 0);
        setField(term43408, term43408.getClass(), "node", term43409);
        setField(term43408, term43408.getClass(), "id", null);
        setIntField(term43408, term43408.getClass(), "index", 0);
        setBooleanField(term43408, term43408.getClass(), "attribute", false);
        setField(term43408, term43408.getClass(), "rootNode", null);
        setField(term43408, term43408.getClass(), "namespaceResolver", null);
        setField(term43408, term43408.getClass(), "parent", null);
        setField(term43408, term43408.getClass(), "locale", null);
        term43410 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term43410, term43410.getClass(), "prefix", null);
        setField(term43410, term43410.getClass(), "name", "");
        setField(term43410, term43410.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term23257;
        args[1] = term23413;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term43400));
        assertTrue(recursiveEquals(term23257, term43408));
        assertTrue(recursiveEquals(term23413, term43410));
    }

};


