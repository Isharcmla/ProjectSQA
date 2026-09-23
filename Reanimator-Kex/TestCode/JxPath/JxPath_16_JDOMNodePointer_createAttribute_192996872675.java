package org.apache.commons.jxpath.ri.model.jdom;

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
import org.apache.commons.jxpath.JXPathException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_createAttribute_192996872675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2578;
     Object term2664;

    public JDOMNodePointer_createAttribute_192996872675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2597 = new HashMap();
        HashMap term2602 = new HashMap();
        HashMap term2608 = new HashMap();
        HashMap term2613 = new HashMap();
        HashMap term2619 = new HashMap();
        HashMap term2624 = new HashMap();
        HashMap term2636 = new HashMap();
        HashMap term2642 = new HashMap();
        HashMap term2647 = new HashMap();
        HashMap term2653 = new HashMap();
        HashMap term2658 = new HashMap();
        term2578 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2579 = newInstance(Class.forName("java.lang.Object"));
        Object term2592 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2593 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2594 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2595 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2632 = newInstance(Class.forName("java.lang.Object"));
        Object term2633 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2634 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2635 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2578, term2578.getClass(), "node", term2579);
        setField(term2578, term2578.getClass(), "id", "wSQxaModmm");
        setField(term2595, term2595.getClass(), "parent", null);
        setField(term2595, term2595.getClass(), "namespaceMap", null);
        setField(term2595, term2595.getClass(), "reverseMap", null);
        setField(term2595, term2595.getClass(), "pointer", null);
        setBooleanField(term2595, term2595.getClass(), "sealed", false);
        setField(term2594, term2594.getClass(), "parent", term2595);
        setField(term2594, term2594.getClass(), "namespaceMap", term2597);
        setField(term2594, term2594.getClass(), "reverseMap", term2602);
        setField(term2594, term2594.getClass(), "pointer", null);
        setBooleanField(term2594, term2594.getClass(), "sealed", false);
        setField(term2593, term2593.getClass(), "parent", term2594);
        setField(term2593, term2593.getClass(), "namespaceMap", term2608);
        setField(term2593, term2593.getClass(), "reverseMap", term2613);
        setField(term2593, term2593.getClass(), "pointer", null);
        setBooleanField(term2593, term2593.getClass(), "sealed", false);
        setField(term2592, term2592.getClass(), "parent", term2593);
        setField(term2592, term2592.getClass(), "namespaceMap", term2619);
        setField(term2592, term2592.getClass(), "reverseMap", term2624);
        setField(term2592, term2592.getClass(), "pointer", null);
        setBooleanField(term2592, term2592.getClass(), "sealed", false);
        setField(term2578, term2578.getClass(), "localNamespaceResolver", term2592);
        setIntField(term2578, term2578.getClass(), "index", -1007160944);
        setBooleanField(term2578, term2578.getClass(), "attribute", true);
        setField(term2578, term2578.getClass(), "rootNode", term2632);
        setField(term2635, term2635.getClass(), "parent", null);
        setField(term2635, term2635.getClass(), "namespaceMap", term2636);
        setField(term2635, term2635.getClass(), "reverseMap", null);
        setField(term2635, term2635.getClass(), "pointer", null);
        setBooleanField(term2635, term2635.getClass(), "sealed", false);
        setField(term2634, term2634.getClass(), "parent", term2635);
        setField(term2634, term2634.getClass(), "namespaceMap", term2642);
        setField(term2634, term2634.getClass(), "reverseMap", term2647);
        setField(term2634, term2634.getClass(), "pointer", null);
        setBooleanField(term2634, term2634.getClass(), "sealed", false);
        setField(term2633, term2633.getClass(), "parent", term2634);
        setField(term2633, term2633.getClass(), "namespaceMap", term2653);
        setField(term2633, term2633.getClass(), "reverseMap", term2658);
        setField(term2633, term2633.getClass(), "pointer", null);
        setBooleanField(term2633, term2633.getClass(), "sealed", false);
        setField(term2578, term2578.getClass(), "namespaceResolver", term2633);
        setField(term2578, term2578.getClass(), "parent", null);
        setField(term2578, term2578.getClass(), "locale", null);
        term2664 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2664, term2664.getClass(), "prefix", "UlajhuVLaP");
        setField(term2664, term2664.getClass(), "name", "gGSMzuGICf");
        setField(term2664, term2664.getClass(), "qualifiedName", "hxCBltsObl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2664;
        try {
            callMethod(klass, "createAttribute", argTypes, term2578, args);
            assertTrue(false);
        }
        catch (JXPathException e) {
        }

    }

};


