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

public class DOMNodePointer_isActual_151940046262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1392;
     Object term7417;

    public DOMNodePointer_isActual_151940046262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1393 = new HashMap();
        HashMap term1427 = new HashMap();
        HashMap term1432 = new HashMap();
        HashMap term1438 = new HashMap();
        HashMap term1443 = new HashMap();
        HashMap term1449 = new HashMap();
        HashMap term1454 = new HashMap();
        HashMap term1464 = new HashMap();
        term1392 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1422 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1423 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1424 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1425 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1462 = newInstance(Class.forName("java.lang.Object"));
        Object term1463 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1392, term1392.getClass(), "node", null);
        setField(term1392, term1392.getClass(), "namespaces", term1393);
        setField(term1392, term1392.getClass(), "defaultNamespace", "AijpHYOFuy");
        setField(term1392, term1392.getClass(), "id", "SbAoxhfrkn");
        setField(term1425, term1425.getClass(), "parent", null);
        setField(term1425, term1425.getClass(), "namespaceMap", null);
        setField(term1425, term1425.getClass(), "reverseMap", null);
        setField(term1425, term1425.getClass(), "pointer", null);
        setBooleanField(term1425, term1425.getClass(), "sealed", false);
        setField(term1424, term1424.getClass(), "parent", term1425);
        setField(term1424, term1424.getClass(), "namespaceMap", term1427);
        setField(term1424, term1424.getClass(), "reverseMap", term1432);
        setField(term1424, term1424.getClass(), "pointer", null);
        setBooleanField(term1424, term1424.getClass(), "sealed", false);
        setField(term1423, term1423.getClass(), "parent", term1424);
        setField(term1423, term1423.getClass(), "namespaceMap", term1438);
        setField(term1423, term1423.getClass(), "reverseMap", term1443);
        setField(term1423, term1423.getClass(), "pointer", null);
        setBooleanField(term1423, term1423.getClass(), "sealed", false);
        setField(term1422, term1422.getClass(), "parent", term1423);
        setField(term1422, term1422.getClass(), "namespaceMap", term1449);
        setField(term1422, term1422.getClass(), "reverseMap", term1454);
        setField(term1422, term1422.getClass(), "pointer", null);
        setBooleanField(term1422, term1422.getClass(), "sealed", false);
        setField(term1392, term1392.getClass(), "localNamespaceResolver", term1422);
        setIntField(term1392, term1392.getClass(), "index", 1134449235);
        setBooleanField(term1392, term1392.getClass(), "attribute", true);
        setField(term1392, term1392.getClass(), "rootNode", term1462);
        setField(term1463, term1463.getClass(), "parent", null);
        setField(term1463, term1463.getClass(), "namespaceMap", term1464);
        setField(term1463, term1463.getClass(), "reverseMap", null);
        setField(term1463, term1463.getClass(), "pointer", null);
        setBooleanField(term1463, term1463.getClass(), "sealed", false);
        setField(term1392, term1392.getClass(), "namespaceResolver", term1463);
        setField(term1392, term1392.getClass(), "parent", null);
        setField(term1392, term1392.getClass(), "locale", null);
        HashMap term7418 = new HashMap();
        HashMap term7427 = new HashMap();
        HashMap term7428 = new HashMap();
        HashMap term7429 = new HashMap();
        HashMap term7430 = new HashMap();
        HashMap term7431 = new HashMap();
        HashMap term7432 = new HashMap();
        HashMap term7435 = new HashMap();
        term7417 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term7423 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7424 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7425 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7426 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7433 = newInstance(Class.forName("java.lang.Object"));
        Object term7434 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term7417, term7417.getClass(), "node", null);
        setField(term7417, term7417.getClass(), "namespaces", term7418);
        setField(term7417, term7417.getClass(), "defaultNamespace", "AijpHYOFuy");
        setField(term7417, term7417.getClass(), "id", "SbAoxhfrkn");
        setField(term7426, term7426.getClass(), "parent", null);
        setField(term7426, term7426.getClass(), "namespaceMap", null);
        setField(term7426, term7426.getClass(), "reverseMap", null);
        setField(term7426, term7426.getClass(), "pointer", null);
        setBooleanField(term7426, term7426.getClass(), "sealed", false);
        setField(term7425, term7425.getClass(), "parent", term7426);
        setField(term7425, term7425.getClass(), "namespaceMap", term7427);
        setField(term7425, term7425.getClass(), "reverseMap", term7428);
        setField(term7425, term7425.getClass(), "pointer", null);
        setBooleanField(term7425, term7425.getClass(), "sealed", false);
        setField(term7424, term7424.getClass(), "parent", term7425);
        setField(term7424, term7424.getClass(), "namespaceMap", term7429);
        setField(term7424, term7424.getClass(), "reverseMap", term7430);
        setField(term7424, term7424.getClass(), "pointer", null);
        setBooleanField(term7424, term7424.getClass(), "sealed", false);
        setField(term7423, term7423.getClass(), "parent", term7424);
        setField(term7423, term7423.getClass(), "namespaceMap", term7431);
        setField(term7423, term7423.getClass(), "reverseMap", term7432);
        setField(term7423, term7423.getClass(), "pointer", null);
        setBooleanField(term7423, term7423.getClass(), "sealed", false);
        setField(term7417, term7417.getClass(), "localNamespaceResolver", term7423);
        setIntField(term7417, term7417.getClass(), "index", 1134449235);
        setBooleanField(term7417, term7417.getClass(), "attribute", true);
        setField(term7417, term7417.getClass(), "rootNode", term7433);
        setField(term7434, term7434.getClass(), "parent", null);
        setField(term7434, term7434.getClass(), "namespaceMap", term7435);
        setField(term7434, term7434.getClass(), "reverseMap", null);
        setField(term7434, term7434.getClass(), "pointer", null);
        setBooleanField(term7434, term7434.getClass(), "sealed", false);
        setField(term7417, term7417.getClass(), "namespaceResolver", term7434);
        setField(term7417, term7417.getClass(), "parent", null);
        setField(term7417, term7417.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isActual", argTypes, term1392, args);
        assertTrue(recursiveEquals(term1392, term7417));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


