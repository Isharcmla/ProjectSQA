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

public class NullPropertyPointer_getPropertyCount_84388171544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1436;
     Object term4736;

    public NullPropertyPointer_getPropertyCount_84388171544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1461 = new HashMap();
        HashMap term1466 = new HashMap();
        HashMap term1472 = new HashMap();
        HashMap term1477 = new HashMap();
        HashMap term1483 = new HashMap();
        HashMap term1488 = new HashMap();
        term1436 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term1451 = newInstance(Class.forName("java.lang.Object"));
        Object term1452 = newInstance(Class.forName("java.lang.Object"));
        Object term1455 = newInstance(Class.forName("java.lang.Object"));
        Object term1456 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1457 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1458 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1459 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1436, term1436.getClass(), "propertyName", "vrQLuWIDJX");
        setBooleanField(term1436, term1436.getClass(), "byNameAttribute", true);
        setIntField(term1436, term1436.getClass(), "propertyIndex", 767834723);
        setField(term1436, term1436.getClass(), "bean", term1451);
        setField(term1436, term1436.getClass(), "value", term1452);
        setIntField(term1436, term1436.getClass(), "index", -602026508);
        setBooleanField(term1436, term1436.getClass(), "attribute", false);
        setField(term1436, term1436.getClass(), "rootNode", term1455);
        setField(term1459, term1459.getClass(), "parent", null);
        setField(term1459, term1459.getClass(), "namespaceMap", null);
        setField(term1459, term1459.getClass(), "reverseMap", null);
        setField(term1459, term1459.getClass(), "pointer", null);
        setField(term1459, term1459.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1459, term1459.getClass(), "sealed", false);
        setField(term1458, term1458.getClass(), "parent", term1459);
        setField(term1458, term1458.getClass(), "namespaceMap", term1461);
        setField(term1458, term1458.getClass(), "reverseMap", term1466);
        setField(term1458, term1458.getClass(), "pointer", null);
        setField(term1458, term1458.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1458, term1458.getClass(), "sealed", false);
        setField(term1457, term1457.getClass(), "parent", term1458);
        setField(term1457, term1457.getClass(), "namespaceMap", term1472);
        setField(term1457, term1457.getClass(), "reverseMap", term1477);
        setField(term1457, term1457.getClass(), "pointer", null);
        setField(term1457, term1457.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1457, term1457.getClass(), "sealed", false);
        setField(term1456, term1456.getClass(), "parent", term1457);
        setField(term1456, term1456.getClass(), "namespaceMap", term1483);
        setField(term1456, term1456.getClass(), "reverseMap", term1488);
        setField(term1456, term1456.getClass(), "pointer", null);
        setField(term1456, term1456.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1456, term1456.getClass(), "sealed", false);
        setField(term1436, term1436.getClass(), "namespaceResolver", term1456);
        setField(term1436, term1436.getClass(), "parent", null);
        setField(term1436, term1436.getClass(), "locale", null);
        HashMap term4746 = new HashMap();
        HashMap term4747 = new HashMap();
        HashMap term4748 = new HashMap();
        HashMap term4749 = new HashMap();
        HashMap term4750 = new HashMap();
        HashMap term4751 = new HashMap();
        term4736 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term4739 = newInstance(Class.forName("java.lang.Object"));
        Object term4740 = newInstance(Class.forName("java.lang.Object"));
        Object term4741 = newInstance(Class.forName("java.lang.Object"));
        Object term4742 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4743 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4744 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4745 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term4736, term4736.getClass(), "propertyName", "vrQLuWIDJX");
        setBooleanField(term4736, term4736.getClass(), "byNameAttribute", true);
        setIntField(term4736, term4736.getClass(), "propertyIndex", 767834723);
        setField(term4736, term4736.getClass(), "bean", term4739);
        setField(term4736, term4736.getClass(), "value", term4740);
        setIntField(term4736, term4736.getClass(), "index", -602026508);
        setBooleanField(term4736, term4736.getClass(), "attribute", false);
        setField(term4736, term4736.getClass(), "rootNode", term4741);
        setField(term4745, term4745.getClass(), "parent", null);
        setField(term4745, term4745.getClass(), "namespaceMap", null);
        setField(term4745, term4745.getClass(), "reverseMap", null);
        setField(term4745, term4745.getClass(), "pointer", null);
        setField(term4745, term4745.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4745, term4745.getClass(), "sealed", false);
        setField(term4744, term4744.getClass(), "parent", term4745);
        setField(term4744, term4744.getClass(), "namespaceMap", term4746);
        setField(term4744, term4744.getClass(), "reverseMap", term4747);
        setField(term4744, term4744.getClass(), "pointer", null);
        setField(term4744, term4744.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4744, term4744.getClass(), "sealed", false);
        setField(term4743, term4743.getClass(), "parent", term4744);
        setField(term4743, term4743.getClass(), "namespaceMap", term4748);
        setField(term4743, term4743.getClass(), "reverseMap", term4749);
        setField(term4743, term4743.getClass(), "pointer", null);
        setField(term4743, term4743.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4743, term4743.getClass(), "sealed", false);
        setField(term4742, term4742.getClass(), "parent", term4743);
        setField(term4742, term4742.getClass(), "namespaceMap", term4750);
        setField(term4742, term4742.getClass(), "reverseMap", term4751);
        setField(term4742, term4742.getClass(), "pointer", null);
        setField(term4742, term4742.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4742, term4742.getClass(), "sealed", false);
        setField(term4736, term4736.getClass(), "namespaceResolver", term4742);
        setField(term4736, term4736.getClass(), "parent", null);
        setField(term4736, term4736.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPropertyCount", argTypes, term1436, args);
        assertTrue(recursiveEquals(term1436, term4736));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


