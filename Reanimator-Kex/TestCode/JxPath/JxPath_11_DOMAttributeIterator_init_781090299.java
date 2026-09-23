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

public class DOMAttributeIterator_init_781090299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51935;
     Object term52091;
     Object term52290;
     Object term52300;
     Object term52302;

    public DOMAttributeIterator_init_781090299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term51745 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term51819 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setIntField(term51745, term51745.getClass(), "position", 0);
        setField(term51745, term51745.getClass(), "parent", null);
        setField(term51745, term51745.getClass(), "name", term51819);
        setField(term51745, term51745.getClass(), "attributes", null);
        term51935 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term52017 = newInstance(Class.forName("org.apache.html.dom.HTMLPreElementImpl"));
        setField(term51935, term51935.getClass(), "node", term52017);
        term52091 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term52091, term52091.getClass(), "name", "          ");
        setField(term52091, term52091.getClass(), "prefix", "");
        ArrayList term52298 = new ArrayList();
        term52290 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term52291 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term52292 = newInstance(Class.forName("org.apache.html.dom.HTMLPreElementImpl"));
        Object term52293 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term52292, term52292.getClass(), "name", null);
        setField(term52292, term52292.getClass(), "attributes", null);
        setField(term52292, term52292.getClass(), "ownerDocument", null);
        setField(term52292, term52292.getClass(), "firstChild", null);
        setField(term52292, term52292.getClass(), "fNodeListCache", null);
        setField(term52292, term52292.getClass(), "previousSibling", null);
        setField(term52292, term52292.getClass(), "nextSibling", null);
        setField(term52292, term52292.getClass(), "ownerNode", null);
        setShortField(term52292, term52292.getClass(), "flags", (short) 0);
        setField(term52291, term52291.getClass(), "node", term52292);
        setField(term52291, term52291.getClass(), "id", null);
        setIntField(term52291, term52291.getClass(), "index", 0);
        setBooleanField(term52291, term52291.getClass(), "attribute", false);
        setField(term52291, term52291.getClass(), "rootNode", null);
        setField(term52291, term52291.getClass(), "namespaceResolver", null);
        setField(term52291, term52291.getClass(), "parent", null);
        setField(term52291, term52291.getClass(), "locale", null);
        setField(term52290, term52290.getClass(), "parent", term52291);
        setField(term52293, term52293.getClass(), "prefix", "");
        setField(term52293, term52293.getClass(), "name", "          ");
        setField(term52293, term52293.getClass(), "qualifiedName", null);
        setField(term52290, term52290.getClass(), "name", term52293);
        setField(term52290, term52290.getClass(), "attributes", term52298);
        setIntField(term52290, term52290.getClass(), "position", 0);
        term52300 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term52301 = newInstance(Class.forName("org.apache.html.dom.HTMLPreElementImpl"));
        setField(term52301, term52301.getClass(), "name", null);
        setField(term52301, term52301.getClass(), "attributes", null);
        setField(term52301, term52301.getClass(), "ownerDocument", null);
        setField(term52301, term52301.getClass(), "firstChild", null);
        setField(term52301, term52301.getClass(), "fNodeListCache", null);
        setField(term52301, term52301.getClass(), "previousSibling", null);
        setField(term52301, term52301.getClass(), "nextSibling", null);
        setField(term52301, term52301.getClass(), "ownerNode", null);
        setShortField(term52301, term52301.getClass(), "flags", (short) 0);
        setField(term52300, term52300.getClass(), "node", term52301);
        setField(term52300, term52300.getClass(), "id", null);
        setIntField(term52300, term52300.getClass(), "index", 0);
        setBooleanField(term52300, term52300.getClass(), "attribute", false);
        setField(term52300, term52300.getClass(), "rootNode", null);
        setField(term52300, term52300.getClass(), "namespaceResolver", null);
        setField(term52300, term52300.getClass(), "parent", null);
        setField(term52300, term52300.getClass(), "locale", null);
        term52302 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term52302, term52302.getClass(), "prefix", "");
        setField(term52302, term52302.getClass(), "name", "          ");
        setField(term52302, term52302.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term51935;
        args[1] = term52091;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term52290));
        assertTrue(recursiveEquals(term51935, term52300));
        assertTrue(recursiveEquals(term52091, term52302));
    }

};


