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

public class DOMNodePointer_isActual_151940046260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1217;
     Object term6828;

    public DOMNodePointer_isActual_151940046260() {
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
        setBooleanField(term1253, term1253.getClass(), "sealed", false);
        setField(term1252, term1252.getClass(), "parent", term1253);
        setField(term1252, term1252.getClass(), "namespaceMap", term1255);
        setField(term1252, term1252.getClass(), "reverseMap", term1260);
        setField(term1252, term1252.getClass(), "pointer", null);
        setBooleanField(term1252, term1252.getClass(), "sealed", false);
        setField(term1251, term1251.getClass(), "parent", term1252);
        setField(term1251, term1251.getClass(), "namespaceMap", term1266);
        setField(term1251, term1251.getClass(), "reverseMap", term1271);
        setField(term1251, term1251.getClass(), "pointer", null);
        setBooleanField(term1251, term1251.getClass(), "sealed", false);
        setField(term1250, term1250.getClass(), "parent", term1251);
        setField(term1250, term1250.getClass(), "namespaceMap", term1277);
        setField(term1250, term1250.getClass(), "reverseMap", term1282);
        setField(term1250, term1250.getClass(), "pointer", null);
        setBooleanField(term1250, term1250.getClass(), "sealed", false);
        setField(term1217, term1217.getClass(), "namespaceResolver", term1250);
        setField(term1217, term1217.getClass(), "parent", null);
        setField(term1217, term1217.getClass(), "locale", null);
        HashMap term6829 = new HashMap();
        HashMap term6839 = new HashMap();
        HashMap term6840 = new HashMap();
        HashMap term6841 = new HashMap();
        HashMap term6842 = new HashMap();
        HashMap term6843 = new HashMap();
        HashMap term6844 = new HashMap();
        term6828 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term6834 = newInstance(Class.forName("java.lang.Object"));
        Object term6835 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6836 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6837 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6838 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6828, term6828.getClass(), "node", null);
        setField(term6828, term6828.getClass(), "namespaces", term6829);
        setField(term6828, term6828.getClass(), "defaultNamespace", "OWDIEULEFu");
        setField(term6828, term6828.getClass(), "id", "dWRymuLBtr");
        setIntField(term6828, term6828.getClass(), "index", -522618178);
        setBooleanField(term6828, term6828.getClass(), "attribute", false);
        setField(term6828, term6828.getClass(), "rootNode", term6834);
        setField(term6838, term6838.getClass(), "parent", null);
        setField(term6838, term6838.getClass(), "namespaceMap", null);
        setField(term6838, term6838.getClass(), "reverseMap", null);
        setField(term6838, term6838.getClass(), "pointer", null);
        setBooleanField(term6838, term6838.getClass(), "sealed", false);
        setField(term6837, term6837.getClass(), "parent", term6838);
        setField(term6837, term6837.getClass(), "namespaceMap", term6839);
        setField(term6837, term6837.getClass(), "reverseMap", term6840);
        setField(term6837, term6837.getClass(), "pointer", null);
        setBooleanField(term6837, term6837.getClass(), "sealed", false);
        setField(term6836, term6836.getClass(), "parent", term6837);
        setField(term6836, term6836.getClass(), "namespaceMap", term6841);
        setField(term6836, term6836.getClass(), "reverseMap", term6842);
        setField(term6836, term6836.getClass(), "pointer", null);
        setBooleanField(term6836, term6836.getClass(), "sealed", false);
        setField(term6835, term6835.getClass(), "parent", term6836);
        setField(term6835, term6835.getClass(), "namespaceMap", term6843);
        setField(term6835, term6835.getClass(), "reverseMap", term6844);
        setField(term6835, term6835.getClass(), "pointer", null);
        setBooleanField(term6835, term6835.getClass(), "sealed", false);
        setField(term6828, term6828.getClass(), "namespaceResolver", term6835);
        setField(term6828, term6828.getClass(), "parent", null);
        setField(term6828, term6828.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isActual", argTypes, term1217, args);
        assertTrue(recursiveEquals(term1217, term6828));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


