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

public class DOMNodePointer_equals_157064407277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3040;
     Object term3111;
     Object term11644;
     Object term11661;

    public DOMNodePointer_equals_157064407277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3041 = new HashMap();
        HashMap term3078 = new HashMap();
        HashMap term3083 = new HashMap();
        HashMap term3089 = new HashMap();
        HashMap term3094 = new HashMap();
        HashMap term3100 = new HashMap();
        HashMap term3105 = new HashMap();
        term3040 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3072 = newInstance(Class.forName("java.lang.Object"));
        Object term3073 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3074 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3075 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3076 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3040, term3040.getClass(), "node", null);
        setField(term3040, term3040.getClass(), "namespaces", term3041);
        setField(term3040, term3040.getClass(), "defaultNamespace", "HqBOwkVqjD");
        setField(term3040, term3040.getClass(), "id", "MAcUBcBckh");
        setIntField(term3040, term3040.getClass(), "index", -1179120542);
        setBooleanField(term3040, term3040.getClass(), "attribute", true);
        setField(term3040, term3040.getClass(), "rootNode", term3072);
        setField(term3076, term3076.getClass(), "parent", null);
        setField(term3076, term3076.getClass(), "namespaceMap", null);
        setField(term3076, term3076.getClass(), "reverseMap", null);
        setField(term3076, term3076.getClass(), "pointer", null);
        setField(term3076, term3076.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3076, term3076.getClass(), "sealed", false);
        setField(term3075, term3075.getClass(), "parent", term3076);
        setField(term3075, term3075.getClass(), "namespaceMap", term3078);
        setField(term3075, term3075.getClass(), "reverseMap", term3083);
        setField(term3075, term3075.getClass(), "pointer", null);
        setField(term3075, term3075.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3075, term3075.getClass(), "sealed", false);
        setField(term3074, term3074.getClass(), "parent", term3075);
        setField(term3074, term3074.getClass(), "namespaceMap", term3089);
        setField(term3074, term3074.getClass(), "reverseMap", term3094);
        setField(term3074, term3074.getClass(), "pointer", null);
        setField(term3074, term3074.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3074, term3074.getClass(), "sealed", false);
        setField(term3073, term3073.getClass(), "parent", term3074);
        setField(term3073, term3073.getClass(), "namespaceMap", term3100);
        setField(term3073, term3073.getClass(), "reverseMap", term3105);
        setField(term3073, term3073.getClass(), "pointer", null);
        setField(term3073, term3073.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3073, term3073.getClass(), "sealed", false);
        setField(term3040, term3040.getClass(), "namespaceResolver", term3073);
        setField(term3040, term3040.getClass(), "parent", null);
        setField(term3040, term3040.getClass(), "locale", null);
        term3111 = newInstance(Class.forName("java.lang.Object"));
        HashMap term11645 = new HashMap();
        HashMap term11655 = new HashMap();
        HashMap term11656 = new HashMap();
        HashMap term11657 = new HashMap();
        HashMap term11658 = new HashMap();
        HashMap term11659 = new HashMap();
        HashMap term11660 = new HashMap();
        term11644 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term11650 = newInstance(Class.forName("java.lang.Object"));
        Object term11651 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11652 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11653 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11654 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term11644, term11644.getClass(), "node", null);
        setField(term11644, term11644.getClass(), "namespaces", term11645);
        setField(term11644, term11644.getClass(), "defaultNamespace", "HqBOwkVqjD");
        setField(term11644, term11644.getClass(), "id", "MAcUBcBckh");
        setIntField(term11644, term11644.getClass(), "index", -1179120542);
        setBooleanField(term11644, term11644.getClass(), "attribute", true);
        setField(term11644, term11644.getClass(), "rootNode", term11650);
        setField(term11654, term11654.getClass(), "parent", null);
        setField(term11654, term11654.getClass(), "namespaceMap", null);
        setField(term11654, term11654.getClass(), "reverseMap", null);
        setField(term11654, term11654.getClass(), "pointer", null);
        setField(term11654, term11654.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term11654, term11654.getClass(), "sealed", false);
        setField(term11653, term11653.getClass(), "parent", term11654);
        setField(term11653, term11653.getClass(), "namespaceMap", term11655);
        setField(term11653, term11653.getClass(), "reverseMap", term11656);
        setField(term11653, term11653.getClass(), "pointer", null);
        setField(term11653, term11653.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term11653, term11653.getClass(), "sealed", false);
        setField(term11652, term11652.getClass(), "parent", term11653);
        setField(term11652, term11652.getClass(), "namespaceMap", term11657);
        setField(term11652, term11652.getClass(), "reverseMap", term11658);
        setField(term11652, term11652.getClass(), "pointer", null);
        setField(term11652, term11652.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term11652, term11652.getClass(), "sealed", false);
        setField(term11651, term11651.getClass(), "parent", term11652);
        setField(term11651, term11651.getClass(), "namespaceMap", term11659);
        setField(term11651, term11651.getClass(), "reverseMap", term11660);
        setField(term11651, term11651.getClass(), "pointer", null);
        setField(term11651, term11651.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term11651, term11651.getClass(), "sealed", false);
        setField(term11644, term11644.getClass(), "namespaceResolver", term11651);
        setField(term11644, term11644.getClass(), "parent", null);
        setField(term11644, term11644.getClass(), "locale", null);
        term11661 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3111;
        Object retValue = callMethod(klass, "equals", argTypes, term3040, args);
        assertTrue(recursiveEquals(term3040, term11644));
        assertTrue(recursiveEquals(term3111, term11661));
        assertTrue(recursiveEquals(retValue, false));
    }

};
