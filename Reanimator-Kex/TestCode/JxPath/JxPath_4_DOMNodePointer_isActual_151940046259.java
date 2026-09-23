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

public class DOMNodePointer_isActual_151940046259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1217;
     Object term6806;

    public DOMNodePointer_isActual_151940046259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1218 = new HashMap();
        HashMap term1255 = new HashMap();
        HashMap term1260 = new HashMap();
        HashMap term1266 = new HashMap();
        HashMap term1271 = new HashMap();
        HashMap term1277 = new HashMap();
        HashMap term1282 = new HashMap();
        term1217 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1249 = newInstance(Class.forName("java.lang.Object"));
        Object term1250 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1251 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1252 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1253 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1217, term1217.getClass(), "node", null);
        setField(term1217, term1217.getClass(), "namespaces", term1218);
        setField(term1217, term1217.getClass(), "defaultNamespace", "OWDIEULEFu");
        setField(term1217, term1217.getClass(), "id", "dWRymuLBtr");
        setIntField(term1217, term1217.getClass(), "index", -522618178);
        setBooleanField(term1217, term1217.getClass(), "attribute", false);
        setField(term1217, term1217.getClass(), "rootNode", term1249);
        setField(term1253, term1253.getClass(), "parent", null);
        setField(term1253, term1253.getClass(), "namespaceMap", null);
        setField(term1253, term1253.getClass(), "reverseMap", null);
        setField(term1253, term1253.getClass(), "pointer", null);
        setField(term1253, term1253.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1253, term1253.getClass(), "sealed", false);
        setField(term1252, term1252.getClass(), "parent", term1253);
        setField(term1252, term1252.getClass(), "namespaceMap", term1255);
        setField(term1252, term1252.getClass(), "reverseMap", term1260);
        setField(term1252, term1252.getClass(), "pointer", null);
        setField(term1252, term1252.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1252, term1252.getClass(), "sealed", false);
        setField(term1251, term1251.getClass(), "parent", term1252);
        setField(term1251, term1251.getClass(), "namespaceMap", term1266);
        setField(term1251, term1251.getClass(), "reverseMap", term1271);
        setField(term1251, term1251.getClass(), "pointer", null);
        setField(term1251, term1251.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1251, term1251.getClass(), "sealed", false);
        setField(term1250, term1250.getClass(), "parent", term1251);
        setField(term1250, term1250.getClass(), "namespaceMap", term1277);
        setField(term1250, term1250.getClass(), "reverseMap", term1282);
        setField(term1250, term1250.getClass(), "pointer", null);
        setField(term1250, term1250.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1250, term1250.getClass(), "sealed", false);
        setField(term1217, term1217.getClass(), "namespaceResolver", term1250);
        setField(term1217, term1217.getClass(), "parent", null);
        setField(term1217, term1217.getClass(), "locale", null);
        HashMap term6807 = new HashMap();
        HashMap term6817 = new HashMap();
        HashMap term6818 = new HashMap();
        HashMap term6819 = new HashMap();
        HashMap term6820 = new HashMap();
        HashMap term6821 = new HashMap();
        HashMap term6822 = new HashMap();
        term6806 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term6812 = newInstance(Class.forName("java.lang.Object"));
        Object term6813 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6814 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6815 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6816 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6806, term6806.getClass(), "node", null);
        setField(term6806, term6806.getClass(), "namespaces", term6807);
        setField(term6806, term6806.getClass(), "defaultNamespace", "OWDIEULEFu");
        setField(term6806, term6806.getClass(), "id", "dWRymuLBtr");
        setIntField(term6806, term6806.getClass(), "index", -522618178);
        setBooleanField(term6806, term6806.getClass(), "attribute", false);
        setField(term6806, term6806.getClass(), "rootNode", term6812);
        setField(term6816, term6816.getClass(), "parent", null);
        setField(term6816, term6816.getClass(), "namespaceMap", null);
        setField(term6816, term6816.getClass(), "reverseMap", null);
        setField(term6816, term6816.getClass(), "pointer", null);
        setField(term6816, term6816.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6816, term6816.getClass(), "sealed", false);
        setField(term6815, term6815.getClass(), "parent", term6816);
        setField(term6815, term6815.getClass(), "namespaceMap", term6817);
        setField(term6815, term6815.getClass(), "reverseMap", term6818);
        setField(term6815, term6815.getClass(), "pointer", null);
        setField(term6815, term6815.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6815, term6815.getClass(), "sealed", false);
        setField(term6814, term6814.getClass(), "parent", term6815);
        setField(term6814, term6814.getClass(), "namespaceMap", term6819);
        setField(term6814, term6814.getClass(), "reverseMap", term6820);
        setField(term6814, term6814.getClass(), "pointer", null);
        setField(term6814, term6814.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6814, term6814.getClass(), "sealed", false);
        setField(term6813, term6813.getClass(), "parent", term6814);
        setField(term6813, term6813.getClass(), "namespaceMap", term6821);
        setField(term6813, term6813.getClass(), "reverseMap", term6822);
        setField(term6813, term6813.getClass(), "pointer", null);
        setField(term6813, term6813.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6813, term6813.getClass(), "sealed", false);
        setField(term6806, term6806.getClass(), "namespaceResolver", term6813);
        setField(term6806, term6806.getClass(), "parent", null);
        setField(term6806, term6806.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isActual", argTypes, term1217, args);
        assertTrue(recursiveEquals(term1217, term6806));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


