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
import java.lang.ClassCastException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_setValue_211851725459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1086;
     Object term1141;

    public JDOMNodePointer_setValue_211851725459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1108 = new HashMap();
        HashMap term1113 = new HashMap();
        HashMap term1119 = new HashMap();
        HashMap term1124 = new HashMap();
        HashMap term1130 = new HashMap();
        HashMap term1135 = new HashMap();
        term1086 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1087 = newInstance(Class.forName("java.lang.Object"));
        Object term1102 = newInstance(Class.forName("java.lang.Object"));
        Object term1103 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1104 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1105 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1106 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1086, term1086.getClass(), "node", term1087);
        setField(term1086, term1086.getClass(), "id", "hNxWaHcfhY");
        setIntField(term1086, term1086.getClass(), "index", 1585847225);
        setBooleanField(term1086, term1086.getClass(), "attribute", false);
        setField(term1086, term1086.getClass(), "rootNode", term1102);
        setField(term1106, term1106.getClass(), "parent", null);
        setField(term1106, term1106.getClass(), "namespaceMap", null);
        setField(term1106, term1106.getClass(), "reverseMap", null);
        setField(term1106, term1106.getClass(), "pointer", null);
        setField(term1106, term1106.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1106, term1106.getClass(), "sealed", false);
        setField(term1105, term1105.getClass(), "parent", term1106);
        setField(term1105, term1105.getClass(), "namespaceMap", term1108);
        setField(term1105, term1105.getClass(), "reverseMap", term1113);
        setField(term1105, term1105.getClass(), "pointer", null);
        setField(term1105, term1105.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1105, term1105.getClass(), "sealed", false);
        setField(term1104, term1104.getClass(), "parent", term1105);
        setField(term1104, term1104.getClass(), "namespaceMap", term1119);
        setField(term1104, term1104.getClass(), "reverseMap", term1124);
        setField(term1104, term1104.getClass(), "pointer", null);
        setField(term1104, term1104.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1104, term1104.getClass(), "sealed", false);
        setField(term1103, term1103.getClass(), "parent", term1104);
        setField(term1103, term1103.getClass(), "namespaceMap", term1130);
        setField(term1103, term1103.getClass(), "reverseMap", term1135);
        setField(term1103, term1103.getClass(), "pointer", null);
        setField(term1103, term1103.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1103, term1103.getClass(), "sealed", false);
        setField(term1086, term1086.getClass(), "namespaceResolver", term1103);
        setField(term1086, term1086.getClass(), "parent", null);
        setField(term1086, term1086.getClass(), "locale", null);
        term1141 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1141;
        try {
            callMethod(klass, "setValue", argTypes, term1086, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


