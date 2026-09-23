package org.apache.commons.jxpath.ri.model.jdom;

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
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.jdom.EqualityUtils.*;
import java.lang.Object;

public class JDOMNodePointer_equals_508970494239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46989;
     Object term47221;
     Object term47604;
     Object term47606;

    public JDOMNodePointer_equals_508970494239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46989 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term47105 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term46989, term46989.getClass(), "node", term47105);
        term47221 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term47337 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term47221, term47221.getClass(), "node", term47337);
        term47604 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term47605 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term47605, term47605.getClass(), "node", null);
        setField(term47605, term47605.getClass(), "id", null);
        setField(term47605, term47605.getClass(), "localNamespaceResolver", null);
        setIntField(term47605, term47605.getClass(), "index", 0);
        setBooleanField(term47605, term47605.getClass(), "attribute", false);
        setField(term47605, term47605.getClass(), "namespaceResolver", null);
        setField(term47605, term47605.getClass(), "rootNode", null);
        setField(term47605, term47605.getClass(), "parent", null);
        setField(term47605, term47605.getClass(), "locale", null);
        setField(term47604, term47604.getClass(), "node", term47605);
        setField(term47604, term47604.getClass(), "id", null);
        setField(term47604, term47604.getClass(), "localNamespaceResolver", null);
        setIntField(term47604, term47604.getClass(), "index", 0);
        setBooleanField(term47604, term47604.getClass(), "attribute", false);
        setField(term47604, term47604.getClass(), "namespaceResolver", null);
        setField(term47604, term47604.getClass(), "rootNode", null);
        setField(term47604, term47604.getClass(), "parent", null);
        setField(term47604, term47604.getClass(), "locale", null);
        term47606 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term47607 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term47607, term47607.getClass(), "node", null);
        setField(term47607, term47607.getClass(), "id", null);
        setField(term47607, term47607.getClass(), "localNamespaceResolver", null);
        setIntField(term47607, term47607.getClass(), "index", 0);
        setBooleanField(term47607, term47607.getClass(), "attribute", false);
        setField(term47607, term47607.getClass(), "namespaceResolver", null);
        setField(term47607, term47607.getClass(), "rootNode", null);
        setField(term47607, term47607.getClass(), "parent", null);
        setField(term47607, term47607.getClass(), "locale", null);
        setField(term47606, term47606.getClass(), "node", term47607);
        setField(term47606, term47606.getClass(), "id", null);
        setField(term47606, term47606.getClass(), "localNamespaceResolver", null);
        setIntField(term47606, term47606.getClass(), "index", 0);
        setBooleanField(term47606, term47606.getClass(), "attribute", false);
        setField(term47606, term47606.getClass(), "namespaceResolver", null);
        setField(term47606, term47606.getClass(), "rootNode", null);
        setField(term47606, term47606.getClass(), "parent", null);
        setField(term47606, term47606.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term47221;
        Object retValue = callMethod(klass, "equals", argTypes, term46989, args);
        assertTrue(recursiveEquals(term46989, term47604));
        assertTrue(recursiveEquals(term47221, term47606));
        assertTrue(recursiveEquals(retValue, false));
    }

};


