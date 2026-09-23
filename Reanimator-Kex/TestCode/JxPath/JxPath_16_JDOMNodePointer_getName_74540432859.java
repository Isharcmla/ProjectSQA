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

public class JDOMNodePointer_getName_74540432859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1328;
     Object term6390;
     Object term6303;

    public JDOMNodePointer_getName_74540432859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1347 = new HashMap();
        HashMap term1352 = new HashMap();
        HashMap term1358 = new HashMap();
        HashMap term1363 = new HashMap();
        HashMap term1369 = new HashMap();
        HashMap term1374 = new HashMap();
        HashMap term1386 = new HashMap();
        HashMap term1392 = new HashMap();
        HashMap term1397 = new HashMap();
        HashMap term1403 = new HashMap();
        HashMap term1408 = new HashMap();
        term1328 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1329 = newInstance(Class.forName("java.lang.Object"));
        Object term1342 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1343 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1344 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1345 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1382 = newInstance(Class.forName("java.lang.Object"));
        Object term1383 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1384 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1385 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1328, term1328.getClass(), "node", term1329);
        setField(term1328, term1328.getClass(), "id", "HyxfbSQYBe");
        setField(term1345, term1345.getClass(), "parent", null);
        setField(term1345, term1345.getClass(), "namespaceMap", null);
        setField(term1345, term1345.getClass(), "reverseMap", null);
        setField(term1345, term1345.getClass(), "pointer", null);
        setBooleanField(term1345, term1345.getClass(), "sealed", false);
        setField(term1344, term1344.getClass(), "parent", term1345);
        setField(term1344, term1344.getClass(), "namespaceMap", term1347);
        setField(term1344, term1344.getClass(), "reverseMap", term1352);
        setField(term1344, term1344.getClass(), "pointer", null);
        setBooleanField(term1344, term1344.getClass(), "sealed", false);
        setField(term1343, term1343.getClass(), "parent", term1344);
        setField(term1343, term1343.getClass(), "namespaceMap", term1358);
        setField(term1343, term1343.getClass(), "reverseMap", term1363);
        setField(term1343, term1343.getClass(), "pointer", null);
        setBooleanField(term1343, term1343.getClass(), "sealed", false);
        setField(term1342, term1342.getClass(), "parent", term1343);
        setField(term1342, term1342.getClass(), "namespaceMap", term1369);
        setField(term1342, term1342.getClass(), "reverseMap", term1374);
        setField(term1342, term1342.getClass(), "pointer", null);
        setBooleanField(term1342, term1342.getClass(), "sealed", false);
        setField(term1328, term1328.getClass(), "localNamespaceResolver", term1342);
        setIntField(term1328, term1328.getClass(), "index", 1134449235);
        setBooleanField(term1328, term1328.getClass(), "attribute", true);
        setField(term1328, term1328.getClass(), "rootNode", term1382);
        setField(term1385, term1385.getClass(), "parent", null);
        setField(term1385, term1385.getClass(), "namespaceMap", term1386);
        setField(term1385, term1385.getClass(), "reverseMap", null);
        setField(term1385, term1385.getClass(), "pointer", null);
        setBooleanField(term1385, term1385.getClass(), "sealed", false);
        setField(term1384, term1384.getClass(), "parent", term1385);
        setField(term1384, term1384.getClass(), "namespaceMap", term1392);
        setField(term1384, term1384.getClass(), "reverseMap", term1397);
        setField(term1384, term1384.getClass(), "pointer", null);
        setBooleanField(term1384, term1384.getClass(), "sealed", false);
        setField(term1383, term1383.getClass(), "parent", term1384);
        setField(term1383, term1383.getClass(), "namespaceMap", term1403);
        setField(term1383, term1383.getClass(), "reverseMap", term1408);
        setField(term1383, term1383.getClass(), "pointer", null);
        setBooleanField(term1383, term1383.getClass(), "sealed", false);
        setField(term1328, term1328.getClass(), "namespaceResolver", term1383);
        setField(term1328, term1328.getClass(), "parent", null);
        setField(term1328, term1328.getClass(), "locale", null);
        HashMap term6398 = new HashMap();
        HashMap term6399 = new HashMap();
        HashMap term6400 = new HashMap();
        HashMap term6401 = new HashMap();
        HashMap term6402 = new HashMap();
        HashMap term6403 = new HashMap();
        HashMap term6408 = new HashMap();
        HashMap term6409 = new HashMap();
        HashMap term6410 = new HashMap();
        HashMap term6411 = new HashMap();
        HashMap term6412 = new HashMap();
        term6390 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term6391 = newInstance(Class.forName("java.lang.Object"));
        Object term6394 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6395 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6396 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6397 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6404 = newInstance(Class.forName("java.lang.Object"));
        Object term6405 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6406 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6407 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6390, term6390.getClass(), "node", term6391);
        setField(term6390, term6390.getClass(), "id", "HyxfbSQYBe");
        setField(term6397, term6397.getClass(), "parent", null);
        setField(term6397, term6397.getClass(), "namespaceMap", null);
        setField(term6397, term6397.getClass(), "reverseMap", null);
        setField(term6397, term6397.getClass(), "pointer", null);
        setBooleanField(term6397, term6397.getClass(), "sealed", false);
        setField(term6396, term6396.getClass(), "parent", term6397);
        setField(term6396, term6396.getClass(), "namespaceMap", term6398);
        setField(term6396, term6396.getClass(), "reverseMap", term6399);
        setField(term6396, term6396.getClass(), "pointer", null);
        setBooleanField(term6396, term6396.getClass(), "sealed", false);
        setField(term6395, term6395.getClass(), "parent", term6396);
        setField(term6395, term6395.getClass(), "namespaceMap", term6400);
        setField(term6395, term6395.getClass(), "reverseMap", term6401);
        setField(term6395, term6395.getClass(), "pointer", null);
        setBooleanField(term6395, term6395.getClass(), "sealed", false);
        setField(term6394, term6394.getClass(), "parent", term6395);
        setField(term6394, term6394.getClass(), "namespaceMap", term6402);
        setField(term6394, term6394.getClass(), "reverseMap", term6403);
        setField(term6394, term6394.getClass(), "pointer", null);
        setBooleanField(term6394, term6394.getClass(), "sealed", false);
        setField(term6390, term6390.getClass(), "localNamespaceResolver", term6394);
        setIntField(term6390, term6390.getClass(), "index", 1134449235);
        setBooleanField(term6390, term6390.getClass(), "attribute", true);
        setField(term6390, term6390.getClass(), "rootNode", term6404);
        setField(term6407, term6407.getClass(), "parent", null);
        setField(term6407, term6407.getClass(), "namespaceMap", term6408);
        setField(term6407, term6407.getClass(), "reverseMap", null);
        setField(term6407, term6407.getClass(), "pointer", null);
        setBooleanField(term6407, term6407.getClass(), "sealed", false);
        setField(term6406, term6406.getClass(), "parent", term6407);
        setField(term6406, term6406.getClass(), "namespaceMap", term6409);
        setField(term6406, term6406.getClass(), "reverseMap", term6410);
        setField(term6406, term6406.getClass(), "pointer", null);
        setBooleanField(term6406, term6406.getClass(), "sealed", false);
        setField(term6405, term6405.getClass(), "parent", term6406);
        setField(term6405, term6405.getClass(), "namespaceMap", term6411);
        setField(term6405, term6405.getClass(), "reverseMap", term6412);
        setField(term6405, term6405.getClass(), "pointer", null);
        setBooleanField(term6405, term6405.getClass(), "sealed", false);
        setField(term6390, term6390.getClass(), "namespaceResolver", term6405);
        setField(term6390, term6390.getClass(), "parent", null);
        setField(term6390, term6390.getClass(), "locale", null);
        term6303 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term6303, term6303.getClass(), "prefix", null);
        setField(term6303, term6303.getClass(), "name", null);
        setField(term6303, term6303.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getName", argTypes, term1328, args);
        assertTrue(recursiveEquals(term1328, term6390));
        assertTrue(recursiveEquals(retValue, term6303));
    }

};


