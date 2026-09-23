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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_getNamespaceURI_94800957450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309;

    public DOMNodePointer_getNamespaceURI_94800957450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term310 = new HashMap();
        HashMap term344 = new HashMap();
        HashMap term349 = new HashMap();
        HashMap term355 = new HashMap();
        HashMap term360 = new HashMap();
        HashMap term366 = new HashMap();
        HashMap term371 = new HashMap();
        HashMap term380 = new HashMap();
        HashMap term385 = new HashMap();
        term309 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term339 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term340 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term341 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term342 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term379 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term391 = newInstance(Class.forName("java.lang.Object"));
        setField(term309, term309.getClass(), "node", null);
        setField(term309, term309.getClass(), "namespaces", term310);
        setField(term309, term309.getClass(), "defaultNamespace", "MjGYSRKTNF");
        setField(term309, term309.getClass(), "id", "hRNSzYYIrc");
        setField(term342, term342.getClass(), "parent", null);
        setField(term342, term342.getClass(), "namespaceMap", null);
        setField(term342, term342.getClass(), "reverseMap", null);
        setField(term342, term342.getClass(), "pointer", null);
        setBooleanField(term342, term342.getClass(), "sealed", false);
        setField(term341, term341.getClass(), "parent", term342);
        setField(term341, term341.getClass(), "namespaceMap", term344);
        setField(term341, term341.getClass(), "reverseMap", term349);
        setField(term341, term341.getClass(), "pointer", null);
        setBooleanField(term341, term341.getClass(), "sealed", false);
        setField(term340, term340.getClass(), "parent", term341);
        setField(term340, term340.getClass(), "namespaceMap", term355);
        setField(term340, term340.getClass(), "reverseMap", term360);
        setField(term340, term340.getClass(), "pointer", null);
        setBooleanField(term340, term340.getClass(), "sealed", false);
        setField(term339, term339.getClass(), "parent", term340);
        setField(term339, term339.getClass(), "namespaceMap", term366);
        setField(term339, term339.getClass(), "reverseMap", term371);
        setField(term339, term339.getClass(), "pointer", null);
        setBooleanField(term339, term339.getClass(), "sealed", false);
        setField(term309, term309.getClass(), "localNamespaceResolver", term339);
        setIntField(term309, term309.getClass(), "index", 1484323161);
        setBooleanField(term309, term309.getClass(), "attribute", false);
        setField(term379, term379.getClass(), "parent", null);
        setField(term379, term379.getClass(), "namespaceMap", term380);
        setField(term379, term379.getClass(), "reverseMap", term385);
        setField(term379, term379.getClass(), "pointer", null);
        setBooleanField(term379, term379.getClass(), "sealed", false);
        setField(term309, term309.getClass(), "namespaceResolver", term379);
        setField(term309, term309.getClass(), "rootNode", term391);
        setField(term309, term309.getClass(), "parent", null);
        setField(term309, term309.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNamespaceURI", argTypes, term309, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


