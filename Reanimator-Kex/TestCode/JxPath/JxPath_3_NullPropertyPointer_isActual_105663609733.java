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

public class NullPropertyPointer_isActual_105663609733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term547;
     Object term2658;

    public NullPropertyPointer_isActual_105663609733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term572 = new HashMap();
        HashMap term577 = new HashMap();
        HashMap term583 = new HashMap();
        HashMap term588 = new HashMap();
        HashMap term594 = new HashMap();
        HashMap term599 = new HashMap();
        term547 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term562 = newInstance(Class.forName("java.lang.Object"));
        Object term563 = newInstance(Class.forName("java.lang.Object"));
        Object term566 = newInstance(Class.forName("java.lang.Object"));
        Object term567 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term568 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term569 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term570 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term547, term547.getClass(), "propertyName", "hRNSzYYIrc");
        setBooleanField(term547, term547.getClass(), "byNameAttribute", true);
        setIntField(term547, term547.getClass(), "propertyIndex", -1456670397);
        setField(term547, term547.getClass(), "bean", term562);
        setField(term547, term547.getClass(), "value", term563);
        setIntField(term547, term547.getClass(), "index", 1622346318);
        setBooleanField(term547, term547.getClass(), "attribute", true);
        setField(term547, term547.getClass(), "rootNode", term566);
        setField(term570, term570.getClass(), "parent", null);
        setField(term570, term570.getClass(), "namespaceMap", null);
        setField(term570, term570.getClass(), "reverseMap", null);
        setField(term570, term570.getClass(), "pointer", null);
        setField(term570, term570.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term570, term570.getClass(), "sealed", false);
        setField(term569, term569.getClass(), "parent", term570);
        setField(term569, term569.getClass(), "namespaceMap", term572);
        setField(term569, term569.getClass(), "reverseMap", term577);
        setField(term569, term569.getClass(), "pointer", null);
        setField(term569, term569.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term569, term569.getClass(), "sealed", false);
        setField(term568, term568.getClass(), "parent", term569);
        setField(term568, term568.getClass(), "namespaceMap", term583);
        setField(term568, term568.getClass(), "reverseMap", term588);
        setField(term568, term568.getClass(), "pointer", null);
        setField(term568, term568.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term568, term568.getClass(), "sealed", false);
        setField(term567, term567.getClass(), "parent", term568);
        setField(term567, term567.getClass(), "namespaceMap", term594);
        setField(term567, term567.getClass(), "reverseMap", term599);
        setField(term567, term567.getClass(), "pointer", null);
        setField(term567, term567.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term567, term567.getClass(), "sealed", false);
        setField(term547, term547.getClass(), "namespaceResolver", term567);
        setField(term547, term547.getClass(), "parent", null);
        setField(term547, term547.getClass(), "locale", null);
        HashMap term2668 = new HashMap();
        HashMap term2669 = new HashMap();
        HashMap term2670 = new HashMap();
        HashMap term2671 = new HashMap();
        HashMap term2672 = new HashMap();
        HashMap term2673 = new HashMap();
        term2658 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term2661 = newInstance(Class.forName("java.lang.Object"));
        Object term2662 = newInstance(Class.forName("java.lang.Object"));
        Object term2663 = newInstance(Class.forName("java.lang.Object"));
        Object term2664 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2665 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2666 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2667 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2658, term2658.getClass(), "propertyName", "hRNSzYYIrc");
        setBooleanField(term2658, term2658.getClass(), "byNameAttribute", true);
        setIntField(term2658, term2658.getClass(), "propertyIndex", -1456670397);
        setField(term2658, term2658.getClass(), "bean", term2661);
        setField(term2658, term2658.getClass(), "value", term2662);
        setIntField(term2658, term2658.getClass(), "index", 1622346318);
        setBooleanField(term2658, term2658.getClass(), "attribute", true);
        setField(term2658, term2658.getClass(), "rootNode", term2663);
        setField(term2667, term2667.getClass(), "parent", null);
        setField(term2667, term2667.getClass(), "namespaceMap", null);
        setField(term2667, term2667.getClass(), "reverseMap", null);
        setField(term2667, term2667.getClass(), "pointer", null);
        setField(term2667, term2667.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2667, term2667.getClass(), "sealed", false);
        setField(term2666, term2666.getClass(), "parent", term2667);
        setField(term2666, term2666.getClass(), "namespaceMap", term2668);
        setField(term2666, term2666.getClass(), "reverseMap", term2669);
        setField(term2666, term2666.getClass(), "pointer", null);
        setField(term2666, term2666.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2666, term2666.getClass(), "sealed", false);
        setField(term2665, term2665.getClass(), "parent", term2666);
        setField(term2665, term2665.getClass(), "namespaceMap", term2670);
        setField(term2665, term2665.getClass(), "reverseMap", term2671);
        setField(term2665, term2665.getClass(), "pointer", null);
        setField(term2665, term2665.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2665, term2665.getClass(), "sealed", false);
        setField(term2664, term2664.getClass(), "parent", term2665);
        setField(term2664, term2664.getClass(), "namespaceMap", term2672);
        setField(term2664, term2664.getClass(), "reverseMap", term2673);
        setField(term2664, term2664.getClass(), "pointer", null);
        setField(term2664, term2664.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2664, term2664.getClass(), "sealed", false);
        setField(term2658, term2658.getClass(), "namespaceResolver", term2664);
        setField(term2658, term2658.getClass(), "parent", null);
        setField(term2658, term2658.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isActual", argTypes, term547, args);
        assertTrue(recursiveEquals(term547, term2658));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


