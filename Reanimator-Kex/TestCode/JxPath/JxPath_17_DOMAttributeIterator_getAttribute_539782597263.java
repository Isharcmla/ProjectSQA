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

public class DOMAttributeIterator_getAttribute_539782597263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142452;
     Object term143138;
     Object term143212;
     Object term143398;
     Object term143404;
     Object term143409;

    public DOMAttributeIterator_getAttribute_539782597263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term142830 = new HashMap();
        ((HashMap) term142830).put("", "");
        term142452 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term142568 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term142684 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term142782 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term142568, term142568.getClass(), "namespaceResolver", null);
        setField(term142782, term142782.getClass(), "namespaceMap", term142830);
        setField(term142684, term142684.getClass(), "namespaceResolver", term142782);
        setField(term142568, term142568.getClass(), "parent", term142684);
        setField(term142452, term142452.getClass(), "parent", term142568);
        term143138 = newInstance(Class.forName("org.apache.html.dom.HTMLHeadingElementImpl"));
        term143212 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term143212, term143212.getClass(), "prefix", "");
        setField(term143212, term143212.getClass(), "name", "");
        HashMap term143401 = new HashMap();
        term143398 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term143399 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term143400 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term143403 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        setField(term143399, term143399.getClass(), "prefix", null);
        setField(term143399, term143399.getClass(), "namespaceURI", null);
        setIntField(term143399, term143399.getClass(), "index", 0);
        setBooleanField(term143399, term143399.getClass(), "attribute", false);
        setField(term143399, term143399.getClass(), "rootNode", null);
        setField(term143400, term143400.getClass(), "parent", null);
        setField(term143400, term143400.getClass(), "namespaceMap", term143401);
        setField(term143400, term143400.getClass(), "reverseMap", null);
        setField(term143400, term143400.getClass(), "pointer", null);
        setBooleanField(term143400, term143400.getClass(), "sealed", false);
        setField(term143399, term143399.getClass(), "namespaceResolver", term143400);
        setField(term143403, term143403.getClass(), "prefix", null);
        setField(term143403, term143403.getClass(), "namespaceURI", null);
        setIntField(term143403, term143403.getClass(), "index", 0);
        setBooleanField(term143403, term143403.getClass(), "attribute", false);
        setField(term143403, term143403.getClass(), "rootNode", null);
        setField(term143403, term143403.getClass(), "namespaceResolver", term143400);
        setField(term143403, term143403.getClass(), "parent", null);
        setField(term143403, term143403.getClass(), "locale", null);
        setField(term143399, term143399.getClass(), "parent", term143403);
        setField(term143399, term143399.getClass(), "locale", null);
        setField(term143398, term143398.getClass(), "parent", term143399);
        setField(term143398, term143398.getClass(), "name", null);
        setField(term143398, term143398.getClass(), "attributes", null);
        setIntField(term143398, term143398.getClass(), "position", 0);
        term143404 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term143404, term143404.getClass(), "prefix", "");
        setField(term143404, term143404.getClass(), "name", "");
        setField(term143404, term143404.getClass(), "qualifiedName", null);
        term143409 = newInstance(Class.forName("org.apache.html.dom.HTMLHeadingElementImpl"));
        Object term143410 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        setField(term143409, term143409.getClass(), "name", null);
        setShortField(term143410, term143410.getClass(), "flags", (short) 0);
        setField(term143410, term143410.getClass(), "nodes", null);
        setField(term143410, term143410.getClass(), "ownerNode", term143409);
        setField(term143409, term143409.getClass(), "attributes", term143410);
        setField(term143409, term143409.getClass(), "ownerDocument", null);
        setField(term143409, term143409.getClass(), "firstChild", null);
        setField(term143409, term143409.getClass(), "fNodeListCache", null);
        setField(term143409, term143409.getClass(), "previousSibling", null);
        setField(term143409, term143409.getClass(), "nextSibling", null);
        setField(term143409, term143409.getClass(), "ownerNode", null);
        setShortField(term143409, term143409.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term143138;
        args[1] = term143212;
        Object retValue = callMethod(klass, "getAttribute", argTypes, term142452, args);
        assertTrue(recursiveEquals(term142452, term143398));
        assertTrue(recursiveEquals(term143138, term143404));
        assertTrue(recursiveEquals(term143212, term143409));
        assertTrue(recursiveEquals(retValue, null));
    }

};


