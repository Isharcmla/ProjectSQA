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
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_equals_157064407280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3527;
     Object term3609;
     Object term12814;
     Object term12833;

    public DOMNodePointer_equals_157064407280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3528 = new HashMap();
        HashMap term3562 = new HashMap();
        HashMap term3567 = new HashMap();
        HashMap term3573 = new HashMap();
        HashMap term3578 = new HashMap();
        HashMap term3584 = new HashMap();
        HashMap term3589 = new HashMap();
        HashMap term3598 = new HashMap();
        HashMap term3603 = new HashMap();
        term3527 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3557 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3558 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3559 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3560 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3597 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3527, term3527.getClass(), "node", null);
        setField(term3527, term3527.getClass(), "namespaces", term3528);
        setField(term3527, term3527.getClass(), "defaultNamespace", "wGmYcqUkgE");
        setField(term3527, term3527.getClass(), "id", "idgaQsnJpQ");
        setField(term3560, term3560.getClass(), "parent", null);
        setField(term3560, term3560.getClass(), "namespaceMap", null);
        setField(term3560, term3560.getClass(), "reverseMap", null);
        setField(term3560, term3560.getClass(), "pointer", null);
        setBooleanField(term3560, term3560.getClass(), "sealed", false);
        setField(term3559, term3559.getClass(), "parent", term3560);
        setField(term3559, term3559.getClass(), "namespaceMap", term3562);
        setField(term3559, term3559.getClass(), "reverseMap", term3567);
        setField(term3559, term3559.getClass(), "pointer", null);
        setBooleanField(term3559, term3559.getClass(), "sealed", false);
        setField(term3558, term3558.getClass(), "parent", term3559);
        setField(term3558, term3558.getClass(), "namespaceMap", term3573);
        setField(term3558, term3558.getClass(), "reverseMap", term3578);
        setField(term3558, term3558.getClass(), "pointer", null);
        setBooleanField(term3558, term3558.getClass(), "sealed", false);
        setField(term3557, term3557.getClass(), "parent", term3558);
        setField(term3557, term3557.getClass(), "namespaceMap", term3584);
        setField(term3557, term3557.getClass(), "reverseMap", term3589);
        setField(term3557, term3557.getClass(), "pointer", null);
        setBooleanField(term3557, term3557.getClass(), "sealed", false);
        setField(term3527, term3527.getClass(), "localNamespaceResolver", term3557);
        setIntField(term3527, term3527.getClass(), "index", -73683645);
        setBooleanField(term3527, term3527.getClass(), "attribute", true);
        setField(term3597, term3597.getClass(), "parent", null);
        setField(term3597, term3597.getClass(), "namespaceMap", term3598);
        setField(term3597, term3597.getClass(), "reverseMap", term3603);
        setField(term3597, term3597.getClass(), "pointer", null);
        setBooleanField(term3597, term3597.getClass(), "sealed", false);
        setField(term3527, term3527.getClass(), "namespaceResolver", term3597);
        setField(term3527, term3527.getClass(), "exceptionHandler", null);
        setField(term3527, term3527.getClass(), "rootNode", null);
        setField(term3527, term3527.getClass(), "parent", null);
        setField(term3527, term3527.getClass(), "locale", null);
        term3609 = newInstance(Class.forName("java.lang.Object"));
        HashMap term12815 = new HashMap();
        HashMap term12824 = new HashMap();
        HashMap term12825 = new HashMap();
        HashMap term12826 = new HashMap();
        HashMap term12827 = new HashMap();
        HashMap term12828 = new HashMap();
        HashMap term12829 = new HashMap();
        HashMap term12831 = new HashMap();
        HashMap term12832 = new HashMap();
        term12814 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term12820 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12821 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12822 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12823 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12830 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term12814, term12814.getClass(), "node", null);
        setField(term12814, term12814.getClass(), "namespaces", term12815);
        setField(term12814, term12814.getClass(), "defaultNamespace", "wGmYcqUkgE");
        setField(term12814, term12814.getClass(), "id", "idgaQsnJpQ");
        setField(term12823, term12823.getClass(), "parent", null);
        setField(term12823, term12823.getClass(), "namespaceMap", null);
        setField(term12823, term12823.getClass(), "reverseMap", null);
        setField(term12823, term12823.getClass(), "pointer", null);
        setBooleanField(term12823, term12823.getClass(), "sealed", false);
        setField(term12822, term12822.getClass(), "parent", term12823);
        setField(term12822, term12822.getClass(), "namespaceMap", term12824);
        setField(term12822, term12822.getClass(), "reverseMap", term12825);
        setField(term12822, term12822.getClass(), "pointer", null);
        setBooleanField(term12822, term12822.getClass(), "sealed", false);
        setField(term12821, term12821.getClass(), "parent", term12822);
        setField(term12821, term12821.getClass(), "namespaceMap", term12826);
        setField(term12821, term12821.getClass(), "reverseMap", term12827);
        setField(term12821, term12821.getClass(), "pointer", null);
        setBooleanField(term12821, term12821.getClass(), "sealed", false);
        setField(term12820, term12820.getClass(), "parent", term12821);
        setField(term12820, term12820.getClass(), "namespaceMap", term12828);
        setField(term12820, term12820.getClass(), "reverseMap", term12829);
        setField(term12820, term12820.getClass(), "pointer", null);
        setBooleanField(term12820, term12820.getClass(), "sealed", false);
        setField(term12814, term12814.getClass(), "localNamespaceResolver", term12820);
        setIntField(term12814, term12814.getClass(), "index", -73683645);
        setBooleanField(term12814, term12814.getClass(), "attribute", true);
        setField(term12830, term12830.getClass(), "parent", null);
        setField(term12830, term12830.getClass(), "namespaceMap", term12831);
        setField(term12830, term12830.getClass(), "reverseMap", term12832);
        setField(term12830, term12830.getClass(), "pointer", null);
        setBooleanField(term12830, term12830.getClass(), "sealed", false);
        setField(term12814, term12814.getClass(), "namespaceResolver", term12830);
        setField(term12814, term12814.getClass(), "exceptionHandler", null);
        setField(term12814, term12814.getClass(), "rootNode", null);
        setField(term12814, term12814.getClass(), "parent", null);
        setField(term12814, term12814.getClass(), "locale", null);
        term12833 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3609;
        Object retValue = callMethod(klass, "equals", argTypes, term3527, args);
        assertTrue(recursiveEquals(term3527, term12814));
        assertTrue(recursiveEquals(term3609, term12833));
        assertTrue(recursiveEquals(retValue, false));
    }

};


