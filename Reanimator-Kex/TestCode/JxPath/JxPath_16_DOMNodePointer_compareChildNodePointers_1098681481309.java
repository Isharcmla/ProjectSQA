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

public class DOMNodePointer_compareChildNodePointers_1098681481309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82500;
     Object term82626;
     Object term82635;
     Object term82636;
     Object term82637;

    public DOMNodePointer_compareChildNodePointers_1098681481309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82500 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term82500, term82500.getClass(), "node", null);
        term82626 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer"));
        term82635 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term82635, term82635.getClass(), "node", null);
        setField(term82635, term82635.getClass(), "namespaces", null);
        setField(term82635, term82635.getClass(), "defaultNamespace", null);
        setField(term82635, term82635.getClass(), "id", null);
        setField(term82635, term82635.getClass(), "localNamespaceResolver", null);
        setIntField(term82635, term82635.getClass(), "index", 0);
        setBooleanField(term82635, term82635.getClass(), "attribute", false);
        setField(term82635, term82635.getClass(), "rootNode", null);
        setField(term82635, term82635.getClass(), "namespaceResolver", null);
        setField(term82635, term82635.getClass(), "parent", null);
        setField(term82635, term82635.getClass(), "locale", null);
        term82636 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term82636, term82636.getClass(), "node", null);
        setField(term82636, term82636.getClass(), "namespaces", null);
        setField(term82636, term82636.getClass(), "defaultNamespace", null);
        setField(term82636, term82636.getClass(), "id", null);
        setField(term82636, term82636.getClass(), "localNamespaceResolver", null);
        setIntField(term82636, term82636.getClass(), "index", 0);
        setBooleanField(term82636, term82636.getClass(), "attribute", false);
        setField(term82636, term82636.getClass(), "rootNode", null);
        setField(term82636, term82636.getClass(), "namespaceResolver", null);
        setField(term82636, term82636.getClass(), "parent", null);
        setField(term82636, term82636.getClass(), "locale", null);
        term82637 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer"));
        setField(term82637, term82637.getClass(), "prefix", null);
        setField(term82637, term82637.getClass(), "namespaceURI", null);
        setIntField(term82637, term82637.getClass(), "index", 0);
        setBooleanField(term82637, term82637.getClass(), "attribute", false);
        setField(term82637, term82637.getClass(), "rootNode", null);
        setField(term82637, term82637.getClass(), "namespaceResolver", null);
        setField(term82637, term82637.getClass(), "parent", null);
        setField(term82637, term82637.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        Object[] args = new Object[2];
        args[0] = term82500;
        args[1] = term82626;
        Object retValue = callMethod(klass, "compareChildNodePointers", argTypes, term82500, args);
        assertTrue(recursiveEquals(term82500, term82635));
        assertTrue(recursiveEquals(term82500, term82636));
        assertTrue(recursiveEquals(term82626, term82637));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


