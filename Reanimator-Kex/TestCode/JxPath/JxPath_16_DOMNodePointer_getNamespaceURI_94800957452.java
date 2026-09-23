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

public class DOMNodePointer_getNamespaceURI_94800957452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299;

    public DOMNodePointer_getNamespaceURI_94800957452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term300 = new HashMap();
        HashMap term334 = new HashMap();
        HashMap term339 = new HashMap();
        HashMap term345 = new HashMap();
        HashMap term350 = new HashMap();
        HashMap term356 = new HashMap();
        HashMap term361 = new HashMap();
        HashMap term371 = new HashMap();
        term299 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term329 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term330 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term331 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term332 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term369 = newInstance(Class.forName("java.lang.Object"));
        Object term370 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term299, term299.getClass(), "node", null);
        setField(term299, term299.getClass(), "namespaces", term300);
        setField(term299, term299.getClass(), "defaultNamespace", "MjGYSRKTNF");
        setField(term299, term299.getClass(), "id", "hRNSzYYIrc");
        setField(term332, term332.getClass(), "parent", null);
        setField(term332, term332.getClass(), "namespaceMap", null);
        setField(term332, term332.getClass(), "reverseMap", null);
        setField(term332, term332.getClass(), "pointer", null);
        setBooleanField(term332, term332.getClass(), "sealed", false);
        setField(term331, term331.getClass(), "parent", term332);
        setField(term331, term331.getClass(), "namespaceMap", term334);
        setField(term331, term331.getClass(), "reverseMap", term339);
        setField(term331, term331.getClass(), "pointer", null);
        setBooleanField(term331, term331.getClass(), "sealed", false);
        setField(term330, term330.getClass(), "parent", term331);
        setField(term330, term330.getClass(), "namespaceMap", term345);
        setField(term330, term330.getClass(), "reverseMap", term350);
        setField(term330, term330.getClass(), "pointer", null);
        setBooleanField(term330, term330.getClass(), "sealed", false);
        setField(term329, term329.getClass(), "parent", term330);
        setField(term329, term329.getClass(), "namespaceMap", term356);
        setField(term329, term329.getClass(), "reverseMap", term361);
        setField(term329, term329.getClass(), "pointer", null);
        setBooleanField(term329, term329.getClass(), "sealed", false);
        setField(term299, term299.getClass(), "localNamespaceResolver", term329);
        setIntField(term299, term299.getClass(), "index", 1484323161);
        setBooleanField(term299, term299.getClass(), "attribute", false);
        setField(term299, term299.getClass(), "rootNode", term369);
        setField(term370, term370.getClass(), "parent", null);
        setField(term370, term370.getClass(), "namespaceMap", term371);
        setField(term370, term370.getClass(), "reverseMap", null);
        setField(term370, term370.getClass(), "pointer", null);
        setBooleanField(term370, term370.getClass(), "sealed", false);
        setField(term299, term299.getClass(), "namespaceResolver", term370);
        setField(term299, term299.getClass(), "parent", null);
        setField(term299, term299.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNamespaceURI", argTypes, term299, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


