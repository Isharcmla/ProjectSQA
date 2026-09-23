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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_getAbstractFactory_6050402081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2525;

    public JDOMNodePointer_getAbstractFactory_6050402081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2547 = new HashMap();
        HashMap term2552 = new HashMap();
        HashMap term2558 = new HashMap();
        HashMap term2563 = new HashMap();
        HashMap term2569 = new HashMap();
        HashMap term2574 = new HashMap();
        term2525 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2526 = newInstance(Class.forName("java.lang.Object"));
        Object term2541 = newInstance(Class.forName("java.lang.Object"));
        Object term2542 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2543 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2544 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2545 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2525, term2525.getClass(), "node", term2526);
        setField(term2525, term2525.getClass(), "id", "UiUYnPrcCi");
        setIntField(term2525, term2525.getClass(), "index", -226514366);
        setBooleanField(term2525, term2525.getClass(), "attribute", true);
        setField(term2525, term2525.getClass(), "rootNode", term2541);
        setField(term2545, term2545.getClass(), "parent", null);
        setField(term2545, term2545.getClass(), "namespaceMap", null);
        setField(term2545, term2545.getClass(), "reverseMap", null);
        setField(term2545, term2545.getClass(), "pointer", null);
        setField(term2545, term2545.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2545, term2545.getClass(), "sealed", false);
        setField(term2544, term2544.getClass(), "parent", term2545);
        setField(term2544, term2544.getClass(), "namespaceMap", term2547);
        setField(term2544, term2544.getClass(), "reverseMap", term2552);
        setField(term2544, term2544.getClass(), "pointer", null);
        setField(term2544, term2544.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2544, term2544.getClass(), "sealed", false);
        setField(term2543, term2543.getClass(), "parent", term2544);
        setField(term2543, term2543.getClass(), "namespaceMap", term2558);
        setField(term2543, term2543.getClass(), "reverseMap", term2563);
        setField(term2543, term2543.getClass(), "pointer", null);
        setField(term2543, term2543.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2543, term2543.getClass(), "sealed", false);
        setField(term2542, term2542.getClass(), "parent", term2543);
        setField(term2542, term2542.getClass(), "namespaceMap", term2569);
        setField(term2542, term2542.getClass(), "reverseMap", term2574);
        setField(term2542, term2542.getClass(), "pointer", null);
        setField(term2542, term2542.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2542, term2542.getClass(), "sealed", false);
        setField(term2525, term2525.getClass(), "namespaceResolver", term2542);
        setField(term2525, term2525.getClass(), "parent", null);
        setField(term2525, term2525.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getAbstractFactory", argTypes, term2525, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


