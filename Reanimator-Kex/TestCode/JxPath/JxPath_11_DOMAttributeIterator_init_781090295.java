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

public class DOMAttributeIterator_init_781090295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47036;
     Object term47192;
     Object term47288;
     Object term47297;
     Object term47300;

    public DOMAttributeIterator_init_781090295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term46920 = new ArrayList();
        Object term46868 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setIntField(term46868, term46868.getClass(), "position", 0);
        setField(term46868, term46868.getClass(), "parent", null);
        setField(term46868, term46868.getClass(), "name", null);
        setField(term46868, term46868.getClass(), "attributes", term46920);
        term47036 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term47118 = newInstance(Class.forName("org.apache.html.dom.HTMLPreElementImpl"));
        setField(term47036, term47036.getClass(), "node", term47118);
        term47192 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term47192, term47192.getClass(), "name", "*");
        ArrayList term47295 = new ArrayList();
        term47288 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term47289 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term47290 = newInstance(Class.forName("org.apache.html.dom.HTMLPreElementImpl"));
        Object term47291 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        Object term47292 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term47290, term47290.getClass(), "name", null);
        setShortField(term47291, term47291.getClass(), "flags", (short) 0);
        setField(term47291, term47291.getClass(), "nodes", null);
        setField(term47291, term47291.getClass(), "ownerNode", term47290);
        setField(term47290, term47290.getClass(), "attributes", term47291);
        setField(term47290, term47290.getClass(), "ownerDocument", null);
        setField(term47290, term47290.getClass(), "firstChild", null);
        setField(term47290, term47290.getClass(), "fNodeListCache", null);
        setField(term47290, term47290.getClass(), "previousSibling", null);
        setField(term47290, term47290.getClass(), "nextSibling", null);
        setField(term47290, term47290.getClass(), "ownerNode", null);
        setShortField(term47290, term47290.getClass(), "flags", (short) 0);
        setField(term47289, term47289.getClass(), "node", term47290);
        setField(term47289, term47289.getClass(), "id", null);
        setIntField(term47289, term47289.getClass(), "index", 0);
        setBooleanField(term47289, term47289.getClass(), "attribute", false);
        setField(term47289, term47289.getClass(), "rootNode", null);
        setField(term47289, term47289.getClass(), "namespaceResolver", null);
        setField(term47289, term47289.getClass(), "parent", null);
        setField(term47289, term47289.getClass(), "locale", null);
        setField(term47288, term47288.getClass(), "parent", term47289);
        setField(term47292, term47292.getClass(), "prefix", null);
        setField(term47292, term47292.getClass(), "name", "*");
        setField(term47292, term47292.getClass(), "qualifiedName", null);
        setField(term47288, term47288.getClass(), "name", term47292);
        setField(term47288, term47288.getClass(), "attributes", term47295);
        setIntField(term47288, term47288.getClass(), "position", 0);
        term47297 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term47298 = newInstance(Class.forName("org.apache.html.dom.HTMLPreElementImpl"));
        Object term47299 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        setField(term47298, term47298.getClass(), "name", null);
        setShortField(term47299, term47299.getClass(), "flags", (short) 0);
        setField(term47299, term47299.getClass(), "nodes", null);
        setField(term47299, term47299.getClass(), "ownerNode", term47298);
        setField(term47298, term47298.getClass(), "attributes", term47299);
        setField(term47298, term47298.getClass(), "ownerDocument", null);
        setField(term47298, term47298.getClass(), "firstChild", null);
        setField(term47298, term47298.getClass(), "fNodeListCache", null);
        setField(term47298, term47298.getClass(), "previousSibling", null);
        setField(term47298, term47298.getClass(), "nextSibling", null);
        setField(term47298, term47298.getClass(), "ownerNode", null);
        setShortField(term47298, term47298.getClass(), "flags", (short) 0);
        setField(term47297, term47297.getClass(), "node", term47298);
        setField(term47297, term47297.getClass(), "id", null);
        setIntField(term47297, term47297.getClass(), "index", 0);
        setBooleanField(term47297, term47297.getClass(), "attribute", false);
        setField(term47297, term47297.getClass(), "rootNode", null);
        setField(term47297, term47297.getClass(), "namespaceResolver", null);
        setField(term47297, term47297.getClass(), "parent", null);
        setField(term47297, term47297.getClass(), "locale", null);
        term47300 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term47300, term47300.getClass(), "prefix", null);
        setField(term47300, term47300.getClass(), "name", "*");
        setField(term47300, term47300.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term47036;
        args[1] = term47192;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term47288));
        assertTrue(recursiveEquals(term47036, term47297));
        assertTrue(recursiveEquals(term47192, term47300));
    }

};


