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

public class DOMNodePointer_getImmediateNode_97539716259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1349;
     Object term7320;

    public DOMNodePointer_getImmediateNode_97539716259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1350 = new HashMap();
        HashMap term1384 = new HashMap();
        HashMap term1389 = new HashMap();
        HashMap term1395 = new HashMap();
        HashMap term1400 = new HashMap();
        HashMap term1406 = new HashMap();
        HashMap term1411 = new HashMap();
        HashMap term1420 = new HashMap();
        HashMap term1425 = new HashMap();
        term1349 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1379 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1380 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1381 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1382 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1419 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1431 = newInstance(Class.forName("java.lang.Object"));
        setField(term1349, term1349.getClass(), "node", null);
        setField(term1349, term1349.getClass(), "namespaces", term1350);
        setField(term1349, term1349.getClass(), "defaultNamespace", "OWDIEULEFu");
        setField(term1349, term1349.getClass(), "id", "dWRymuLBtr");
        setField(term1382, term1382.getClass(), "parent", null);
        setField(term1382, term1382.getClass(), "namespaceMap", null);
        setField(term1382, term1382.getClass(), "reverseMap", null);
        setField(term1382, term1382.getClass(), "pointer", null);
        setBooleanField(term1382, term1382.getClass(), "sealed", false);
        setField(term1381, term1381.getClass(), "parent", term1382);
        setField(term1381, term1381.getClass(), "namespaceMap", term1384);
        setField(term1381, term1381.getClass(), "reverseMap", term1389);
        setField(term1381, term1381.getClass(), "pointer", null);
        setBooleanField(term1381, term1381.getClass(), "sealed", false);
        setField(term1380, term1380.getClass(), "parent", term1381);
        setField(term1380, term1380.getClass(), "namespaceMap", term1395);
        setField(term1380, term1380.getClass(), "reverseMap", term1400);
        setField(term1380, term1380.getClass(), "pointer", null);
        setBooleanField(term1380, term1380.getClass(), "sealed", false);
        setField(term1379, term1379.getClass(), "parent", term1380);
        setField(term1379, term1379.getClass(), "namespaceMap", term1406);
        setField(term1379, term1379.getClass(), "reverseMap", term1411);
        setField(term1379, term1379.getClass(), "pointer", null);
        setBooleanField(term1379, term1379.getClass(), "sealed", false);
        setField(term1349, term1349.getClass(), "localNamespaceResolver", term1379);
        setIntField(term1349, term1349.getClass(), "index", -522618178);
        setBooleanField(term1349, term1349.getClass(), "attribute", false);
        setField(term1419, term1419.getClass(), "parent", null);
        setField(term1419, term1419.getClass(), "namespaceMap", term1420);
        setField(term1419, term1419.getClass(), "reverseMap", term1425);
        setField(term1419, term1419.getClass(), "pointer", null);
        setBooleanField(term1419, term1419.getClass(), "sealed", false);
        setField(term1349, term1349.getClass(), "namespaceResolver", term1419);
        setField(term1349, term1349.getClass(), "rootNode", term1431);
        setField(term1349, term1349.getClass(), "parent", null);
        setField(term1349, term1349.getClass(), "locale", null);
        HashMap term7321 = new HashMap();
        HashMap term7330 = new HashMap();
        HashMap term7331 = new HashMap();
        HashMap term7332 = new HashMap();
        HashMap term7333 = new HashMap();
        HashMap term7334 = new HashMap();
        HashMap term7335 = new HashMap();
        HashMap term7337 = new HashMap();
        HashMap term7338 = new HashMap();
        term7320 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term7326 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7327 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7328 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7329 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7336 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7339 = newInstance(Class.forName("java.lang.Object"));
        setField(term7320, term7320.getClass(), "node", null);
        setField(term7320, term7320.getClass(), "namespaces", term7321);
        setField(term7320, term7320.getClass(), "defaultNamespace", "OWDIEULEFu");
        setField(term7320, term7320.getClass(), "id", "dWRymuLBtr");
        setField(term7329, term7329.getClass(), "parent", null);
        setField(term7329, term7329.getClass(), "namespaceMap", null);
        setField(term7329, term7329.getClass(), "reverseMap", null);
        setField(term7329, term7329.getClass(), "pointer", null);
        setBooleanField(term7329, term7329.getClass(), "sealed", false);
        setField(term7328, term7328.getClass(), "parent", term7329);
        setField(term7328, term7328.getClass(), "namespaceMap", term7330);
        setField(term7328, term7328.getClass(), "reverseMap", term7331);
        setField(term7328, term7328.getClass(), "pointer", null);
        setBooleanField(term7328, term7328.getClass(), "sealed", false);
        setField(term7327, term7327.getClass(), "parent", term7328);
        setField(term7327, term7327.getClass(), "namespaceMap", term7332);
        setField(term7327, term7327.getClass(), "reverseMap", term7333);
        setField(term7327, term7327.getClass(), "pointer", null);
        setBooleanField(term7327, term7327.getClass(), "sealed", false);
        setField(term7326, term7326.getClass(), "parent", term7327);
        setField(term7326, term7326.getClass(), "namespaceMap", term7334);
        setField(term7326, term7326.getClass(), "reverseMap", term7335);
        setField(term7326, term7326.getClass(), "pointer", null);
        setBooleanField(term7326, term7326.getClass(), "sealed", false);
        setField(term7320, term7320.getClass(), "localNamespaceResolver", term7326);
        setIntField(term7320, term7320.getClass(), "index", -522618178);
        setBooleanField(term7320, term7320.getClass(), "attribute", false);
        setField(term7336, term7336.getClass(), "parent", null);
        setField(term7336, term7336.getClass(), "namespaceMap", term7337);
        setField(term7336, term7336.getClass(), "reverseMap", term7338);
        setField(term7336, term7336.getClass(), "pointer", null);
        setBooleanField(term7336, term7336.getClass(), "sealed", false);
        setField(term7320, term7320.getClass(), "namespaceResolver", term7336);
        setField(term7320, term7320.getClass(), "rootNode", term7339);
        setField(term7320, term7320.getClass(), "parent", null);
        setField(term7320, term7320.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImmediateNode", argTypes, term1349, args);
        assertTrue(recursiveEquals(term1349, term7320));
        assertTrue(recursiveEquals(retValue, null));
    }

};


