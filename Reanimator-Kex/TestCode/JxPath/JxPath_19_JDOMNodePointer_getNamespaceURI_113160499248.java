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
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.jdom.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_getNamespaceURI_113160499248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term557;
     Object term5129;

    public JDOMNodePointer_getNamespaceURI_113160499248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term576 = new HashMap();
        HashMap term581 = new HashMap();
        HashMap term587 = new HashMap();
        HashMap term592 = new HashMap();
        HashMap term598 = new HashMap();
        HashMap term603 = new HashMap();
        HashMap term614 = new HashMap();
        HashMap term619 = new HashMap();
        HashMap term625 = new HashMap();
        HashMap term630 = new HashMap();
        HashMap term636 = new HashMap();
        HashMap term641 = new HashMap();
        term557 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term558 = newInstance(Class.forName("java.lang.Object"));
        Object term571 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term572 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term573 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term574 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term611 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term612 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term613 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term647 = newInstance(Class.forName("java.lang.Object"));
        setField(term557, term557.getClass(), "node", term558);
        setField(term557, term557.getClass(), "id", "RMFIsYGgne");
        setField(term574, term574.getClass(), "parent", null);
        setField(term574, term574.getClass(), "namespaceMap", null);
        setField(term574, term574.getClass(), "reverseMap", null);
        setField(term574, term574.getClass(), "pointer", null);
        setBooleanField(term574, term574.getClass(), "sealed", false);
        setField(term573, term573.getClass(), "parent", term574);
        setField(term573, term573.getClass(), "namespaceMap", term576);
        setField(term573, term573.getClass(), "reverseMap", term581);
        setField(term573, term573.getClass(), "pointer", null);
        setBooleanField(term573, term573.getClass(), "sealed", false);
        setField(term572, term572.getClass(), "parent", term573);
        setField(term572, term572.getClass(), "namespaceMap", term587);
        setField(term572, term572.getClass(), "reverseMap", term592);
        setField(term572, term572.getClass(), "pointer", null);
        setBooleanField(term572, term572.getClass(), "sealed", false);
        setField(term571, term571.getClass(), "parent", term572);
        setField(term571, term571.getClass(), "namespaceMap", term598);
        setField(term571, term571.getClass(), "reverseMap", term603);
        setField(term571, term571.getClass(), "pointer", null);
        setBooleanField(term571, term571.getClass(), "sealed", false);
        setField(term557, term557.getClass(), "localNamespaceResolver", term571);
        setIntField(term557, term557.getClass(), "index", -1922583790);
        setBooleanField(term557, term557.getClass(), "attribute", true);
        setField(term613, term613.getClass(), "parent", null);
        setField(term613, term613.getClass(), "namespaceMap", term614);
        setField(term613, term613.getClass(), "reverseMap", term619);
        setField(term613, term613.getClass(), "pointer", null);
        setBooleanField(term613, term613.getClass(), "sealed", false);
        setField(term612, term612.getClass(), "parent", term613);
        setField(term612, term612.getClass(), "namespaceMap", term625);
        setField(term612, term612.getClass(), "reverseMap", term630);
        setField(term612, term612.getClass(), "pointer", null);
        setBooleanField(term612, term612.getClass(), "sealed", false);
        setField(term611, term611.getClass(), "parent", term612);
        setField(term611, term611.getClass(), "namespaceMap", term636);
        setField(term611, term611.getClass(), "reverseMap", term641);
        setField(term611, term611.getClass(), "pointer", null);
        setBooleanField(term611, term611.getClass(), "sealed", false);
        setField(term557, term557.getClass(), "namespaceResolver", term611);
        setField(term557, term557.getClass(), "rootNode", term647);
        setField(term557, term557.getClass(), "parent", null);
        setField(term557, term557.getClass(), "locale", null);
        HashMap term5137 = new HashMap();
        HashMap term5138 = new HashMap();
        HashMap term5139 = new HashMap();
        HashMap term5140 = new HashMap();
        HashMap term5141 = new HashMap();
        HashMap term5142 = new HashMap();
        HashMap term5146 = new HashMap();
        HashMap term5147 = new HashMap();
        HashMap term5148 = new HashMap();
        HashMap term5149 = new HashMap();
        HashMap term5150 = new HashMap();
        HashMap term5151 = new HashMap();
        term5129 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term5130 = newInstance(Class.forName("java.lang.Object"));
        Object term5133 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5134 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5135 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5136 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5143 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5144 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5145 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5152 = newInstance(Class.forName("java.lang.Object"));
        setField(term5129, term5129.getClass(), "node", term5130);
        setField(term5129, term5129.getClass(), "id", "RMFIsYGgne");
        setField(term5136, term5136.getClass(), "parent", null);
        setField(term5136, term5136.getClass(), "namespaceMap", null);
        setField(term5136, term5136.getClass(), "reverseMap", null);
        setField(term5136, term5136.getClass(), "pointer", null);
        setBooleanField(term5136, term5136.getClass(), "sealed", false);
        setField(term5135, term5135.getClass(), "parent", term5136);
        setField(term5135, term5135.getClass(), "namespaceMap", term5137);
        setField(term5135, term5135.getClass(), "reverseMap", term5138);
        setField(term5135, term5135.getClass(), "pointer", null);
        setBooleanField(term5135, term5135.getClass(), "sealed", false);
        setField(term5134, term5134.getClass(), "parent", term5135);
        setField(term5134, term5134.getClass(), "namespaceMap", term5139);
        setField(term5134, term5134.getClass(), "reverseMap", term5140);
        setField(term5134, term5134.getClass(), "pointer", null);
        setBooleanField(term5134, term5134.getClass(), "sealed", false);
        setField(term5133, term5133.getClass(), "parent", term5134);
        setField(term5133, term5133.getClass(), "namespaceMap", term5141);
        setField(term5133, term5133.getClass(), "reverseMap", term5142);
        setField(term5133, term5133.getClass(), "pointer", null);
        setBooleanField(term5133, term5133.getClass(), "sealed", false);
        setField(term5129, term5129.getClass(), "localNamespaceResolver", term5133);
        setIntField(term5129, term5129.getClass(), "index", -1922583790);
        setBooleanField(term5129, term5129.getClass(), "attribute", true);
        setField(term5145, term5145.getClass(), "parent", null);
        setField(term5145, term5145.getClass(), "namespaceMap", term5146);
        setField(term5145, term5145.getClass(), "reverseMap", term5147);
        setField(term5145, term5145.getClass(), "pointer", null);
        setBooleanField(term5145, term5145.getClass(), "sealed", false);
        setField(term5144, term5144.getClass(), "parent", term5145);
        setField(term5144, term5144.getClass(), "namespaceMap", term5148);
        setField(term5144, term5144.getClass(), "reverseMap", term5149);
        setField(term5144, term5144.getClass(), "pointer", null);
        setBooleanField(term5144, term5144.getClass(), "sealed", false);
        setField(term5143, term5143.getClass(), "parent", term5144);
        setField(term5143, term5143.getClass(), "namespaceMap", term5150);
        setField(term5143, term5143.getClass(), "reverseMap", term5151);
        setField(term5143, term5143.getClass(), "pointer", null);
        setBooleanField(term5143, term5143.getClass(), "sealed", false);
        setField(term5129, term5129.getClass(), "namespaceResolver", term5143);
        setField(term5129, term5129.getClass(), "rootNode", term5152);
        setField(term5129, term5129.getClass(), "parent", null);
        setField(term5129, term5129.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term557, args);
        assertTrue(recursiveEquals(term557, term5129));
        assertTrue(recursiveEquals(retValue, null));
    }

};


