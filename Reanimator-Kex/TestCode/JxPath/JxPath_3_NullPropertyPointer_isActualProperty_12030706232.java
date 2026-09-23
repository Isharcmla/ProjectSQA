package org.apache.commons.jxpath.ri.model.beans;

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
import static org.apache.commons.jxpath.ri.model.beans.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.beans.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class NullPropertyPointer_isActualProperty_12030706232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term479;
     Object term2562;

    public NullPropertyPointer_isActualProperty_12030706232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term504 = new HashMap();
        HashMap term509 = new HashMap();
        HashMap term515 = new HashMap();
        HashMap term520 = new HashMap();
        HashMap term526 = new HashMap();
        HashMap term531 = new HashMap();
        term479 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term494 = newInstance(Class.forName("java.lang.Object"));
        Object term495 = newInstance(Class.forName("java.lang.Object"));
        Object term498 = newInstance(Class.forName("java.lang.Object"));
        Object term499 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term500 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term501 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term502 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term479, term479.getClass(), "propertyName", "MjGYSRKTNF");
        setBooleanField(term479, term479.getClass(), "byNameAttribute", false);
        setIntField(term479, term479.getClass(), "propertyIndex", 597278769);
        setField(term479, term479.getClass(), "bean", term494);
        setField(term479, term479.getClass(), "value", term495);
        setIntField(term479, term479.getClass(), "index", -1685132342);
        setBooleanField(term479, term479.getClass(), "attribute", false);
        setField(term479, term479.getClass(), "rootNode", term498);
        setField(term502, term502.getClass(), "parent", null);
        setField(term502, term502.getClass(), "namespaceMap", null);
        setField(term502, term502.getClass(), "reverseMap", null);
        setField(term502, term502.getClass(), "pointer", null);
        setField(term502, term502.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term502, term502.getClass(), "sealed", false);
        setField(term501, term501.getClass(), "parent", term502);
        setField(term501, term501.getClass(), "namespaceMap", term504);
        setField(term501, term501.getClass(), "reverseMap", term509);
        setField(term501, term501.getClass(), "pointer", null);
        setField(term501, term501.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term501, term501.getClass(), "sealed", false);
        setField(term500, term500.getClass(), "parent", term501);
        setField(term500, term500.getClass(), "namespaceMap", term515);
        setField(term500, term500.getClass(), "reverseMap", term520);
        setField(term500, term500.getClass(), "pointer", null);
        setField(term500, term500.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term500, term500.getClass(), "sealed", false);
        setField(term499, term499.getClass(), "parent", term500);
        setField(term499, term499.getClass(), "namespaceMap", term526);
        setField(term499, term499.getClass(), "reverseMap", term531);
        setField(term499, term499.getClass(), "pointer", null);
        setField(term499, term499.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term499, term499.getClass(), "sealed", false);
        setField(term479, term479.getClass(), "namespaceResolver", term499);
        setField(term479, term479.getClass(), "parent", null);
        setField(term479, term479.getClass(), "locale", null);
        HashMap term2572 = new HashMap();
        HashMap term2573 = new HashMap();
        HashMap term2574 = new HashMap();
        HashMap term2575 = new HashMap();
        HashMap term2576 = new HashMap();
        HashMap term2577 = new HashMap();
        term2562 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term2565 = newInstance(Class.forName("java.lang.Object"));
        Object term2566 = newInstance(Class.forName("java.lang.Object"));
        Object term2567 = newInstance(Class.forName("java.lang.Object"));
        Object term2568 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2569 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2570 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2571 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2562, term2562.getClass(), "propertyName", "MjGYSRKTNF");
        setBooleanField(term2562, term2562.getClass(), "byNameAttribute", false);
        setIntField(term2562, term2562.getClass(), "propertyIndex", 597278769);
        setField(term2562, term2562.getClass(), "bean", term2565);
        setField(term2562, term2562.getClass(), "value", term2566);
        setIntField(term2562, term2562.getClass(), "index", -1685132342);
        setBooleanField(term2562, term2562.getClass(), "attribute", false);
        setField(term2562, term2562.getClass(), "rootNode", term2567);
        setField(term2571, term2571.getClass(), "parent", null);
        setField(term2571, term2571.getClass(), "namespaceMap", null);
        setField(term2571, term2571.getClass(), "reverseMap", null);
        setField(term2571, term2571.getClass(), "pointer", null);
        setField(term2571, term2571.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2571, term2571.getClass(), "sealed", false);
        setField(term2570, term2570.getClass(), "parent", term2571);
        setField(term2570, term2570.getClass(), "namespaceMap", term2572);
        setField(term2570, term2570.getClass(), "reverseMap", term2573);
        setField(term2570, term2570.getClass(), "pointer", null);
        setField(term2570, term2570.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2570, term2570.getClass(), "sealed", false);
        setField(term2569, term2569.getClass(), "parent", term2570);
        setField(term2569, term2569.getClass(), "namespaceMap", term2574);
        setField(term2569, term2569.getClass(), "reverseMap", term2575);
        setField(term2569, term2569.getClass(), "pointer", null);
        setField(term2569, term2569.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2569, term2569.getClass(), "sealed", false);
        setField(term2568, term2568.getClass(), "parent", term2569);
        setField(term2568, term2568.getClass(), "namespaceMap", term2576);
        setField(term2568, term2568.getClass(), "reverseMap", term2577);
        setField(term2568, term2568.getClass(), "pointer", null);
        setField(term2568, term2568.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2568, term2568.getClass(), "sealed", false);
        setField(term2562, term2562.getClass(), "namespaceResolver", term2568);
        setField(term2562, term2562.getClass(), "parent", null);
        setField(term2562, term2562.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isActualProperty", argTypes, term479, args);
        assertTrue(recursiveEquals(term479, term2562));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


