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

public class DOMNodePointer_equals_157064407281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3429;
     Object term3507;
     Object term12497;
     Object term12516;

    public DOMNodePointer_equals_157064407281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3430 = new HashMap();
        HashMap term3464 = new HashMap();
        HashMap term3469 = new HashMap();
        HashMap term3475 = new HashMap();
        HashMap term3480 = new HashMap();
        HashMap term3486 = new HashMap();
        HashMap term3491 = new HashMap();
        HashMap term3501 = new HashMap();
        term3429 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3459 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3460 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3461 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3462 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3499 = newInstance(Class.forName("java.lang.Object"));
        Object term3500 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3429, term3429.getClass(), "node", null);
        setField(term3429, term3429.getClass(), "namespaces", term3430);
        setField(term3429, term3429.getClass(), "defaultNamespace", "idgaQsnJpQ");
        setField(term3429, term3429.getClass(), "id", "VgZnGoIFwQ");
        setField(term3462, term3462.getClass(), "parent", null);
        setField(term3462, term3462.getClass(), "namespaceMap", null);
        setField(term3462, term3462.getClass(), "reverseMap", null);
        setField(term3462, term3462.getClass(), "pointer", null);
        setBooleanField(term3462, term3462.getClass(), "sealed", false);
        setField(term3461, term3461.getClass(), "parent", term3462);
        setField(term3461, term3461.getClass(), "namespaceMap", term3464);
        setField(term3461, term3461.getClass(), "reverseMap", term3469);
        setField(term3461, term3461.getClass(), "pointer", null);
        setBooleanField(term3461, term3461.getClass(), "sealed", false);
        setField(term3460, term3460.getClass(), "parent", term3461);
        setField(term3460, term3460.getClass(), "namespaceMap", term3475);
        setField(term3460, term3460.getClass(), "reverseMap", term3480);
        setField(term3460, term3460.getClass(), "pointer", null);
        setBooleanField(term3460, term3460.getClass(), "sealed", false);
        setField(term3459, term3459.getClass(), "parent", term3460);
        setField(term3459, term3459.getClass(), "namespaceMap", term3486);
        setField(term3459, term3459.getClass(), "reverseMap", term3491);
        setField(term3459, term3459.getClass(), "pointer", null);
        setBooleanField(term3459, term3459.getClass(), "sealed", false);
        setField(term3429, term3429.getClass(), "localNamespaceResolver", term3459);
        setIntField(term3429, term3429.getClass(), "index", -73683645);
        setBooleanField(term3429, term3429.getClass(), "attribute", true);
        setField(term3429, term3429.getClass(), "rootNode", term3499);
        setField(term3500, term3500.getClass(), "parent", null);
        setField(term3500, term3500.getClass(), "namespaceMap", term3501);
        setField(term3500, term3500.getClass(), "reverseMap", null);
        setField(term3500, term3500.getClass(), "pointer", null);
        setBooleanField(term3500, term3500.getClass(), "sealed", false);
        setField(term3429, term3429.getClass(), "namespaceResolver", term3500);
        setField(term3429, term3429.getClass(), "parent", null);
        setField(term3429, term3429.getClass(), "locale", null);
        term3507 = newInstance(Class.forName("java.lang.Object"));
        HashMap term12498 = new HashMap();
        HashMap term12507 = new HashMap();
        HashMap term12508 = new HashMap();
        HashMap term12509 = new HashMap();
        HashMap term12510 = new HashMap();
        HashMap term12511 = new HashMap();
        HashMap term12512 = new HashMap();
        HashMap term12515 = new HashMap();
        term12497 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term12503 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12504 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12505 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12506 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12513 = newInstance(Class.forName("java.lang.Object"));
        Object term12514 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term12497, term12497.getClass(), "node", null);
        setField(term12497, term12497.getClass(), "namespaces", term12498);
        setField(term12497, term12497.getClass(), "defaultNamespace", "idgaQsnJpQ");
        setField(term12497, term12497.getClass(), "id", "VgZnGoIFwQ");
        setField(term12506, term12506.getClass(), "parent", null);
        setField(term12506, term12506.getClass(), "namespaceMap", null);
        setField(term12506, term12506.getClass(), "reverseMap", null);
        setField(term12506, term12506.getClass(), "pointer", null);
        setBooleanField(term12506, term12506.getClass(), "sealed", false);
        setField(term12505, term12505.getClass(), "parent", term12506);
        setField(term12505, term12505.getClass(), "namespaceMap", term12507);
        setField(term12505, term12505.getClass(), "reverseMap", term12508);
        setField(term12505, term12505.getClass(), "pointer", null);
        setBooleanField(term12505, term12505.getClass(), "sealed", false);
        setField(term12504, term12504.getClass(), "parent", term12505);
        setField(term12504, term12504.getClass(), "namespaceMap", term12509);
        setField(term12504, term12504.getClass(), "reverseMap", term12510);
        setField(term12504, term12504.getClass(), "pointer", null);
        setBooleanField(term12504, term12504.getClass(), "sealed", false);
        setField(term12503, term12503.getClass(), "parent", term12504);
        setField(term12503, term12503.getClass(), "namespaceMap", term12511);
        setField(term12503, term12503.getClass(), "reverseMap", term12512);
        setField(term12503, term12503.getClass(), "pointer", null);
        setBooleanField(term12503, term12503.getClass(), "sealed", false);
        setField(term12497, term12497.getClass(), "localNamespaceResolver", term12503);
        setIntField(term12497, term12497.getClass(), "index", -73683645);
        setBooleanField(term12497, term12497.getClass(), "attribute", true);
        setField(term12497, term12497.getClass(), "rootNode", term12513);
        setField(term12514, term12514.getClass(), "parent", null);
        setField(term12514, term12514.getClass(), "namespaceMap", term12515);
        setField(term12514, term12514.getClass(), "reverseMap", null);
        setField(term12514, term12514.getClass(), "pointer", null);
        setBooleanField(term12514, term12514.getClass(), "sealed", false);
        setField(term12497, term12497.getClass(), "namespaceResolver", term12514);
        setField(term12497, term12497.getClass(), "parent", null);
        setField(term12497, term12497.getClass(), "locale", null);
        term12516 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3507;
        Object retValue = callMethod(klass, "equals", argTypes, term3429, args);
        assertTrue(recursiveEquals(term3429, term12497));
        assertTrue(recursiveEquals(term3507, term12516));
        assertTrue(recursiveEquals(retValue, false));
    }

};


