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

public class DOMNodePointer_getImmediateNode_97539716260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1338;
     Object term7363;

    public DOMNodePointer_getImmediateNode_97539716260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1339 = new HashMap();
        HashMap term1373 = new HashMap();
        HashMap term1378 = new HashMap();
        HashMap term1384 = new HashMap();
        HashMap term1389 = new HashMap();
        HashMap term1395 = new HashMap();
        HashMap term1400 = new HashMap();
        HashMap term1409 = new HashMap();
        HashMap term1414 = new HashMap();
        term1338 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1368 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1369 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1370 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1371 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1408 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1338, term1338.getClass(), "node", null);
        setField(term1338, term1338.getClass(), "namespaces", term1339);
        setField(term1338, term1338.getClass(), "defaultNamespace", "OWDIEULEFu");
        setField(term1338, term1338.getClass(), "id", "dWRymuLBtr");
        setField(term1371, term1371.getClass(), "parent", null);
        setField(term1371, term1371.getClass(), "namespaceMap", null);
        setField(term1371, term1371.getClass(), "reverseMap", null);
        setField(term1371, term1371.getClass(), "pointer", null);
        setBooleanField(term1371, term1371.getClass(), "sealed", false);
        setField(term1370, term1370.getClass(), "parent", term1371);
        setField(term1370, term1370.getClass(), "namespaceMap", term1373);
        setField(term1370, term1370.getClass(), "reverseMap", term1378);
        setField(term1370, term1370.getClass(), "pointer", null);
        setBooleanField(term1370, term1370.getClass(), "sealed", false);
        setField(term1369, term1369.getClass(), "parent", term1370);
        setField(term1369, term1369.getClass(), "namespaceMap", term1384);
        setField(term1369, term1369.getClass(), "reverseMap", term1389);
        setField(term1369, term1369.getClass(), "pointer", null);
        setBooleanField(term1369, term1369.getClass(), "sealed", false);
        setField(term1368, term1368.getClass(), "parent", term1369);
        setField(term1368, term1368.getClass(), "namespaceMap", term1395);
        setField(term1368, term1368.getClass(), "reverseMap", term1400);
        setField(term1368, term1368.getClass(), "pointer", null);
        setBooleanField(term1368, term1368.getClass(), "sealed", false);
        setField(term1338, term1338.getClass(), "localNamespaceResolver", term1368);
        setIntField(term1338, term1338.getClass(), "index", -522618178);
        setBooleanField(term1338, term1338.getClass(), "attribute", false);
        setField(term1408, term1408.getClass(), "parent", null);
        setField(term1408, term1408.getClass(), "namespaceMap", term1409);
        setField(term1408, term1408.getClass(), "reverseMap", term1414);
        setField(term1408, term1408.getClass(), "pointer", null);
        setBooleanField(term1408, term1408.getClass(), "sealed", false);
        setField(term1338, term1338.getClass(), "namespaceResolver", term1408);
        setField(term1338, term1338.getClass(), "exceptionHandler", null);
        setField(term1338, term1338.getClass(), "rootNode", null);
        setField(term1338, term1338.getClass(), "parent", null);
        setField(term1338, term1338.getClass(), "locale", null);
        HashMap term7364 = new HashMap();
        HashMap term7373 = new HashMap();
        HashMap term7374 = new HashMap();
        HashMap term7375 = new HashMap();
        HashMap term7376 = new HashMap();
        HashMap term7377 = new HashMap();
        HashMap term7378 = new HashMap();
        HashMap term7380 = new HashMap();
        HashMap term7381 = new HashMap();
        term7363 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term7369 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7370 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7371 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7372 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7379 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term7363, term7363.getClass(), "node", null);
        setField(term7363, term7363.getClass(), "namespaces", term7364);
        setField(term7363, term7363.getClass(), "defaultNamespace", "OWDIEULEFu");
        setField(term7363, term7363.getClass(), "id", "dWRymuLBtr");
        setField(term7372, term7372.getClass(), "parent", null);
        setField(term7372, term7372.getClass(), "namespaceMap", null);
        setField(term7372, term7372.getClass(), "reverseMap", null);
        setField(term7372, term7372.getClass(), "pointer", null);
        setBooleanField(term7372, term7372.getClass(), "sealed", false);
        setField(term7371, term7371.getClass(), "parent", term7372);
        setField(term7371, term7371.getClass(), "namespaceMap", term7373);
        setField(term7371, term7371.getClass(), "reverseMap", term7374);
        setField(term7371, term7371.getClass(), "pointer", null);
        setBooleanField(term7371, term7371.getClass(), "sealed", false);
        setField(term7370, term7370.getClass(), "parent", term7371);
        setField(term7370, term7370.getClass(), "namespaceMap", term7375);
        setField(term7370, term7370.getClass(), "reverseMap", term7376);
        setField(term7370, term7370.getClass(), "pointer", null);
        setBooleanField(term7370, term7370.getClass(), "sealed", false);
        setField(term7369, term7369.getClass(), "parent", term7370);
        setField(term7369, term7369.getClass(), "namespaceMap", term7377);
        setField(term7369, term7369.getClass(), "reverseMap", term7378);
        setField(term7369, term7369.getClass(), "pointer", null);
        setBooleanField(term7369, term7369.getClass(), "sealed", false);
        setField(term7363, term7363.getClass(), "localNamespaceResolver", term7369);
        setIntField(term7363, term7363.getClass(), "index", -522618178);
        setBooleanField(term7363, term7363.getClass(), "attribute", false);
        setField(term7379, term7379.getClass(), "parent", null);
        setField(term7379, term7379.getClass(), "namespaceMap", term7380);
        setField(term7379, term7379.getClass(), "reverseMap", term7381);
        setField(term7379, term7379.getClass(), "pointer", null);
        setBooleanField(term7379, term7379.getClass(), "sealed", false);
        setField(term7363, term7363.getClass(), "namespaceResolver", term7379);
        setField(term7363, term7363.getClass(), "exceptionHandler", null);
        setField(term7363, term7363.getClass(), "rootNode", null);
        setField(term7363, term7363.getClass(), "parent", null);
        setField(term7363, term7363.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImmediateNode", argTypes, term1338, args);
        assertTrue(recursiveEquals(term1338, term7363));
        assertTrue(recursiveEquals(retValue, null));
    }

};


