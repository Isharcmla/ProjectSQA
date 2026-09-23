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

public class DOMNodePointer_hashCode_112195739779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3425;

    public DOMNodePointer_hashCode_112195739779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3426 = new HashMap();
        HashMap term3460 = new HashMap();
        HashMap term3465 = new HashMap();
        HashMap term3471 = new HashMap();
        HashMap term3476 = new HashMap();
        HashMap term3482 = new HashMap();
        HashMap term3487 = new HashMap();
        HashMap term3496 = new HashMap();
        HashMap term3501 = new HashMap();
        term3425 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3455 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3456 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3457 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3458 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3495 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3425, term3425.getClass(), "node", null);
        setField(term3425, term3425.getClass(), "namespaces", term3426);
        setField(term3425, term3425.getClass(), "defaultNamespace", "vQVyKLdtaz");
        setField(term3425, term3425.getClass(), "id", "OWKQODBLzb");
        setField(term3458, term3458.getClass(), "parent", null);
        setField(term3458, term3458.getClass(), "namespaceMap", null);
        setField(term3458, term3458.getClass(), "reverseMap", null);
        setField(term3458, term3458.getClass(), "pointer", null);
        setBooleanField(term3458, term3458.getClass(), "sealed", false);
        setField(term3457, term3457.getClass(), "parent", term3458);
        setField(term3457, term3457.getClass(), "namespaceMap", term3460);
        setField(term3457, term3457.getClass(), "reverseMap", term3465);
        setField(term3457, term3457.getClass(), "pointer", null);
        setBooleanField(term3457, term3457.getClass(), "sealed", false);
        setField(term3456, term3456.getClass(), "parent", term3457);
        setField(term3456, term3456.getClass(), "namespaceMap", term3471);
        setField(term3456, term3456.getClass(), "reverseMap", term3476);
        setField(term3456, term3456.getClass(), "pointer", null);
        setBooleanField(term3456, term3456.getClass(), "sealed", false);
        setField(term3455, term3455.getClass(), "parent", term3456);
        setField(term3455, term3455.getClass(), "namespaceMap", term3482);
        setField(term3455, term3455.getClass(), "reverseMap", term3487);
        setField(term3455, term3455.getClass(), "pointer", null);
        setBooleanField(term3455, term3455.getClass(), "sealed", false);
        setField(term3425, term3425.getClass(), "localNamespaceResolver", term3455);
        setIntField(term3425, term3425.getClass(), "index", -1179120542);
        setBooleanField(term3425, term3425.getClass(), "attribute", true);
        setField(term3495, term3495.getClass(), "parent", null);
        setField(term3495, term3495.getClass(), "namespaceMap", term3496);
        setField(term3495, term3495.getClass(), "reverseMap", term3501);
        setField(term3495, term3495.getClass(), "pointer", null);
        setBooleanField(term3495, term3495.getClass(), "sealed", false);
        setField(term3425, term3425.getClass(), "namespaceResolver", term3495);
        setField(term3425, term3425.getClass(), "exceptionHandler", null);
        setField(term3425, term3425.getClass(), "rootNode", null);
        setField(term3425, term3425.getClass(), "parent", null);
        setField(term3425, term3425.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term3425, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


