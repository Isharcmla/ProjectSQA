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

public class DOMNodePointer_getNamespaceResolver_346678163194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39446;
     Object term40883;
     Object term40857;

    public DOMNodePointer_getNamespaceResolver_346678163194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39446 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term39446, term39446.getClass(), "localNamespaceResolver", null);
        HashMap term40885 = new HashMap();
        term40883 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term40884 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term40883, term40883.getClass(), "node", null);
        setField(term40883, term40883.getClass(), "namespaces", null);
        setField(term40883, term40883.getClass(), "defaultNamespace", null);
        setField(term40883, term40883.getClass(), "id", null);
        setField(term40884, term40884.getClass(), "parent", null);
        setField(term40884, term40884.getClass(), "namespaceMap", term40885);
        setField(term40884, term40884.getClass(), "reverseMap", null);
        setField(term40884, term40884.getClass(), "pointer", term40883);
        setBooleanField(term40884, term40884.getClass(), "sealed", false);
        setField(term40883, term40883.getClass(), "localNamespaceResolver", term40884);
        setIntField(term40883, term40883.getClass(), "index", 0);
        setBooleanField(term40883, term40883.getClass(), "attribute", false);
        setField(term40883, term40883.getClass(), "rootNode", null);
        setField(term40883, term40883.getClass(), "namespaceResolver", null);
        setField(term40883, term40883.getClass(), "parent", null);
        setField(term40883, term40883.getClass(), "locale", null);
        HashMap term40858 = new HashMap();
        term40857 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term40856 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term40857, term40857.getClass(), "parent", null);
        setField(term40857, term40857.getClass(), "namespaceMap", term40858);
        setField(term40857, term40857.getClass(), "reverseMap", null);
        setField(term40856, term40856.getClass(), "node", null);
        setField(term40856, term40856.getClass(), "namespaces", null);
        setField(term40856, term40856.getClass(), "defaultNamespace", null);
        setField(term40856, term40856.getClass(), "id", null);
        setField(term40856, term40856.getClass(), "localNamespaceResolver", term40857);
        setIntField(term40856, term40856.getClass(), "index", 0);
        setBooleanField(term40856, term40856.getClass(), "attribute", false);
        setField(term40856, term40856.getClass(), "rootNode", null);
        setField(term40856, term40856.getClass(), "namespaceResolver", null);
        setField(term40856, term40856.getClass(), "parent", null);
        setField(term40856, term40856.getClass(), "locale", null);
        setField(term40857, term40857.getClass(), "pointer", term40856);
        setBooleanField(term40857, term40857.getClass(), "sealed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNamespaceResolver", argTypes, term39446, args);
        assertTrue(recursiveEquals(term39446, term40883));
        assertTrue(recursiveEquals(retValue, term40857));
    }

};


