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

public class NullPropertyPointer_isLeaf_123227108730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343;
     Object term2312;

    public NullPropertyPointer_isLeaf_123227108730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term368 = new HashMap();
        HashMap term373 = new HashMap();
        HashMap term379 = new HashMap();
        HashMap term384 = new HashMap();
        HashMap term390 = new HashMap();
        HashMap term395 = new HashMap();
        term343 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term358 = newInstance(Class.forName("java.lang.Object"));
        Object term359 = newInstance(Class.forName("java.lang.Object"));
        Object term362 = newInstance(Class.forName("java.lang.Object"));
        Object term363 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term364 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term365 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term366 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term343, term343.getClass(), "propertyName", "EGtDIRbSSb");
        setBooleanField(term343, term343.getClass(), "byNameAttribute", false);
        setIntField(term343, term343.getClass(), "propertyIndex", -522618178);
        setField(term343, term343.getClass(), "bean", term358);
        setField(term343, term343.getClass(), "value", term359);
        setIntField(term343, term343.getClass(), "index", 1134449235);
        setBooleanField(term343, term343.getClass(), "attribute", true);
        setField(term343, term343.getClass(), "rootNode", term362);
        setField(term366, term366.getClass(), "parent", null);
        setField(term366, term366.getClass(), "namespaceMap", null);
        setField(term366, term366.getClass(), "reverseMap", null);
        setField(term366, term366.getClass(), "pointer", null);
        setField(term366, term366.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term366, term366.getClass(), "sealed", false);
        setField(term365, term365.getClass(), "parent", term366);
        setField(term365, term365.getClass(), "namespaceMap", term368);
        setField(term365, term365.getClass(), "reverseMap", term373);
        setField(term365, term365.getClass(), "pointer", null);
        setField(term365, term365.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term365, term365.getClass(), "sealed", false);
        setField(term364, term364.getClass(), "parent", term365);
        setField(term364, term364.getClass(), "namespaceMap", term379);
        setField(term364, term364.getClass(), "reverseMap", term384);
        setField(term364, term364.getClass(), "pointer", null);
        setField(term364, term364.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term364, term364.getClass(), "sealed", false);
        setField(term363, term363.getClass(), "parent", term364);
        setField(term363, term363.getClass(), "namespaceMap", term390);
        setField(term363, term363.getClass(), "reverseMap", term395);
        setField(term363, term363.getClass(), "pointer", null);
        setField(term363, term363.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term363, term363.getClass(), "sealed", false);
        setField(term343, term343.getClass(), "namespaceResolver", term363);
        setField(term343, term343.getClass(), "parent", null);
        setField(term343, term343.getClass(), "locale", null);
        HashMap term2322 = new HashMap();
        HashMap term2323 = new HashMap();
        HashMap term2324 = new HashMap();
        HashMap term2325 = new HashMap();
        HashMap term2326 = new HashMap();
        HashMap term2327 = new HashMap();
        term2312 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term2315 = newInstance(Class.forName("java.lang.Object"));
        Object term2316 = newInstance(Class.forName("java.lang.Object"));
        Object term2317 = newInstance(Class.forName("java.lang.Object"));
        Object term2318 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2319 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2320 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2321 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2312, term2312.getClass(), "propertyName", "EGtDIRbSSb");
        setBooleanField(term2312, term2312.getClass(), "byNameAttribute", false);
        setIntField(term2312, term2312.getClass(), "propertyIndex", -522618178);
        setField(term2312, term2312.getClass(), "bean", term2315);
        setField(term2312, term2312.getClass(), "value", term2316);
        setIntField(term2312, term2312.getClass(), "index", 1134449235);
        setBooleanField(term2312, term2312.getClass(), "attribute", true);
        setField(term2312, term2312.getClass(), "rootNode", term2317);
        setField(term2321, term2321.getClass(), "parent", null);
        setField(term2321, term2321.getClass(), "namespaceMap", null);
        setField(term2321, term2321.getClass(), "reverseMap", null);
        setField(term2321, term2321.getClass(), "pointer", null);
        setField(term2321, term2321.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2321, term2321.getClass(), "sealed", false);
        setField(term2320, term2320.getClass(), "parent", term2321);
        setField(term2320, term2320.getClass(), "namespaceMap", term2322);
        setField(term2320, term2320.getClass(), "reverseMap", term2323);
        setField(term2320, term2320.getClass(), "pointer", null);
        setField(term2320, term2320.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2320, term2320.getClass(), "sealed", false);
        setField(term2319, term2319.getClass(), "parent", term2320);
        setField(term2319, term2319.getClass(), "namespaceMap", term2324);
        setField(term2319, term2319.getClass(), "reverseMap", term2325);
        setField(term2319, term2319.getClass(), "pointer", null);
        setField(term2319, term2319.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2319, term2319.getClass(), "sealed", false);
        setField(term2318, term2318.getClass(), "parent", term2319);
        setField(term2318, term2318.getClass(), "namespaceMap", term2326);
        setField(term2318, term2318.getClass(), "reverseMap", term2327);
        setField(term2318, term2318.getClass(), "pointer", null);
        setField(term2318, term2318.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2318, term2318.getClass(), "sealed", false);
        setField(term2312, term2312.getClass(), "namespaceResolver", term2318);
        setField(term2312, term2312.getClass(), "parent", null);
        setField(term2312, term2312.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isLeaf", argTypes, term343, args);
        assertTrue(recursiveEquals(term343, term2312));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


