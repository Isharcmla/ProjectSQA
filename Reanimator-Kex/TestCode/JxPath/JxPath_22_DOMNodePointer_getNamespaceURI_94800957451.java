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

public class DOMNodePointer_getNamespaceURI_94800957451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307;

    public DOMNodePointer_getNamespaceURI_94800957451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term308 = new HashMap();
        HashMap term342 = new HashMap();
        HashMap term347 = new HashMap();
        HashMap term353 = new HashMap();
        HashMap term358 = new HashMap();
        HashMap term364 = new HashMap();
        HashMap term369 = new HashMap();
        HashMap term378 = new HashMap();
        HashMap term383 = new HashMap();
        term307 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term337 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term338 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term339 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term340 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term377 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term307, term307.getClass(), "node", null);
        setField(term307, term307.getClass(), "namespaces", term308);
        setField(term307, term307.getClass(), "defaultNamespace", "MjGYSRKTNF");
        setField(term307, term307.getClass(), "id", "hRNSzYYIrc");
        setField(term340, term340.getClass(), "parent", null);
        setField(term340, term340.getClass(), "namespaceMap", null);
        setField(term340, term340.getClass(), "reverseMap", null);
        setField(term340, term340.getClass(), "pointer", null);
        setBooleanField(term340, term340.getClass(), "sealed", false);
        setField(term339, term339.getClass(), "parent", term340);
        setField(term339, term339.getClass(), "namespaceMap", term342);
        setField(term339, term339.getClass(), "reverseMap", term347);
        setField(term339, term339.getClass(), "pointer", null);
        setBooleanField(term339, term339.getClass(), "sealed", false);
        setField(term338, term338.getClass(), "parent", term339);
        setField(term338, term338.getClass(), "namespaceMap", term353);
        setField(term338, term338.getClass(), "reverseMap", term358);
        setField(term338, term338.getClass(), "pointer", null);
        setBooleanField(term338, term338.getClass(), "sealed", false);
        setField(term337, term337.getClass(), "parent", term338);
        setField(term337, term337.getClass(), "namespaceMap", term364);
        setField(term337, term337.getClass(), "reverseMap", term369);
        setField(term337, term337.getClass(), "pointer", null);
        setBooleanField(term337, term337.getClass(), "sealed", false);
        setField(term307, term307.getClass(), "localNamespaceResolver", term337);
        setIntField(term307, term307.getClass(), "index", 1484323161);
        setBooleanField(term307, term307.getClass(), "attribute", false);
        setField(term377, term377.getClass(), "parent", null);
        setField(term377, term377.getClass(), "namespaceMap", term378);
        setField(term377, term377.getClass(), "reverseMap", term383);
        setField(term377, term377.getClass(), "pointer", null);
        setBooleanField(term377, term377.getClass(), "sealed", false);
        setField(term307, term307.getClass(), "namespaceResolver", term377);
        setField(term307, term307.getClass(), "exceptionHandler", null);
        setField(term307, term307.getClass(), "rootNode", null);
        setField(term307, term307.getClass(), "parent", null);
        setField(term307, term307.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNamespaceURI", argTypes, term307, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


