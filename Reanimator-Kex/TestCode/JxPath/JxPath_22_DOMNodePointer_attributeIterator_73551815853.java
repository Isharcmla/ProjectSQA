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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_attributeIterator_73551815853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term513;
     Object term595;

    public DOMNodePointer_attributeIterator_73551815853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term514 = new HashMap();
        HashMap term548 = new HashMap();
        HashMap term553 = new HashMap();
        HashMap term559 = new HashMap();
        HashMap term564 = new HashMap();
        HashMap term570 = new HashMap();
        HashMap term575 = new HashMap();
        HashMap term584 = new HashMap();
        HashMap term589 = new HashMap();
        term513 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term543 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term544 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term545 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term546 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term583 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term513, term513.getClass(), "node", null);
        setField(term513, term513.getClass(), "namespaces", term514);
        setField(term513, term513.getClass(), "defaultNamespace", "uuaPigETmJ");
        setField(term513, term513.getClass(), "id", "MxlszYVzRf");
        setField(term546, term546.getClass(), "parent", null);
        setField(term546, term546.getClass(), "namespaceMap", null);
        setField(term546, term546.getClass(), "reverseMap", null);
        setField(term546, term546.getClass(), "pointer", null);
        setBooleanField(term546, term546.getClass(), "sealed", false);
        setField(term545, term545.getClass(), "parent", term546);
        setField(term545, term545.getClass(), "namespaceMap", term548);
        setField(term545, term545.getClass(), "reverseMap", term553);
        setField(term545, term545.getClass(), "pointer", null);
        setBooleanField(term545, term545.getClass(), "sealed", false);
        setField(term544, term544.getClass(), "parent", term545);
        setField(term544, term544.getClass(), "namespaceMap", term559);
        setField(term544, term544.getClass(), "reverseMap", term564);
        setField(term544, term544.getClass(), "pointer", null);
        setBooleanField(term544, term544.getClass(), "sealed", false);
        setField(term543, term543.getClass(), "parent", term544);
        setField(term543, term543.getClass(), "namespaceMap", term570);
        setField(term543, term543.getClass(), "reverseMap", term575);
        setField(term543, term543.getClass(), "pointer", null);
        setBooleanField(term543, term543.getClass(), "sealed", false);
        setField(term513, term513.getClass(), "localNamespaceResolver", term543);
        setIntField(term513, term513.getClass(), "index", -1922583790);
        setBooleanField(term513, term513.getClass(), "attribute", true);
        setField(term583, term583.getClass(), "parent", null);
        setField(term583, term583.getClass(), "namespaceMap", term584);
        setField(term583, term583.getClass(), "reverseMap", term589);
        setField(term583, term583.getClass(), "pointer", null);
        setBooleanField(term583, term583.getClass(), "sealed", false);
        setField(term513, term513.getClass(), "namespaceResolver", term583);
        setField(term513, term513.getClass(), "exceptionHandler", null);
        setField(term513, term513.getClass(), "rootNode", null);
        setField(term513, term513.getClass(), "parent", null);
        setField(term513, term513.getClass(), "locale", null);
        term595 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term595, term595.getClass(), "prefix", "LQFpaHEwXR");
        setField(term595, term595.getClass(), "name", "oVcInYnLWB");
        setField(term595, term595.getClass(), "qualifiedName", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[1];
        args[0] = term595;
        try {
            callMethod(klass, "attributeIterator", argTypes, term513, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


