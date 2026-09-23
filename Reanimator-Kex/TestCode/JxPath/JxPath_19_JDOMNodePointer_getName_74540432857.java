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

public class JDOMNodePointer_getName_74540432857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1388;
     Object term6386;
     Object term6294;

    public JDOMNodePointer_getName_74540432857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1407 = new HashMap();
        HashMap term1412 = new HashMap();
        HashMap term1418 = new HashMap();
        HashMap term1423 = new HashMap();
        HashMap term1429 = new HashMap();
        HashMap term1434 = new HashMap();
        HashMap term1445 = new HashMap();
        HashMap term1450 = new HashMap();
        HashMap term1456 = new HashMap();
        HashMap term1461 = new HashMap();
        HashMap term1467 = new HashMap();
        HashMap term1472 = new HashMap();
        term1388 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1389 = newInstance(Class.forName("java.lang.Object"));
        Object term1402 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1403 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1404 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1405 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1442 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1443 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1444 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1478 = newInstance(Class.forName("java.lang.Object"));
        setField(term1388, term1388.getClass(), "node", term1389);
        setField(term1388, term1388.getClass(), "id", "HyxfbSQYBe");
        setField(term1405, term1405.getClass(), "parent", null);
        setField(term1405, term1405.getClass(), "namespaceMap", null);
        setField(term1405, term1405.getClass(), "reverseMap", null);
        setField(term1405, term1405.getClass(), "pointer", null);
        setBooleanField(term1405, term1405.getClass(), "sealed", false);
        setField(term1404, term1404.getClass(), "parent", term1405);
        setField(term1404, term1404.getClass(), "namespaceMap", term1407);
        setField(term1404, term1404.getClass(), "reverseMap", term1412);
        setField(term1404, term1404.getClass(), "pointer", null);
        setBooleanField(term1404, term1404.getClass(), "sealed", false);
        setField(term1403, term1403.getClass(), "parent", term1404);
        setField(term1403, term1403.getClass(), "namespaceMap", term1418);
        setField(term1403, term1403.getClass(), "reverseMap", term1423);
        setField(term1403, term1403.getClass(), "pointer", null);
        setBooleanField(term1403, term1403.getClass(), "sealed", false);
        setField(term1402, term1402.getClass(), "parent", term1403);
        setField(term1402, term1402.getClass(), "namespaceMap", term1429);
        setField(term1402, term1402.getClass(), "reverseMap", term1434);
        setField(term1402, term1402.getClass(), "pointer", null);
        setBooleanField(term1402, term1402.getClass(), "sealed", false);
        setField(term1388, term1388.getClass(), "localNamespaceResolver", term1402);
        setIntField(term1388, term1388.getClass(), "index", 1134449235);
        setBooleanField(term1388, term1388.getClass(), "attribute", true);
        setField(term1444, term1444.getClass(), "parent", null);
        setField(term1444, term1444.getClass(), "namespaceMap", term1445);
        setField(term1444, term1444.getClass(), "reverseMap", term1450);
        setField(term1444, term1444.getClass(), "pointer", null);
        setBooleanField(term1444, term1444.getClass(), "sealed", false);
        setField(term1443, term1443.getClass(), "parent", term1444);
        setField(term1443, term1443.getClass(), "namespaceMap", term1456);
        setField(term1443, term1443.getClass(), "reverseMap", term1461);
        setField(term1443, term1443.getClass(), "pointer", null);
        setBooleanField(term1443, term1443.getClass(), "sealed", false);
        setField(term1442, term1442.getClass(), "parent", term1443);
        setField(term1442, term1442.getClass(), "namespaceMap", term1467);
        setField(term1442, term1442.getClass(), "reverseMap", term1472);
        setField(term1442, term1442.getClass(), "pointer", null);
        setBooleanField(term1442, term1442.getClass(), "sealed", false);
        setField(term1388, term1388.getClass(), "namespaceResolver", term1442);
        setField(term1388, term1388.getClass(), "rootNode", term1478);
        setField(term1388, term1388.getClass(), "parent", null);
        setField(term1388, term1388.getClass(), "locale", null);
        HashMap term6394 = new HashMap();
        HashMap term6395 = new HashMap();
        HashMap term6396 = new HashMap();
        HashMap term6397 = new HashMap();
        HashMap term6398 = new HashMap();
        HashMap term6399 = new HashMap();
        HashMap term6403 = new HashMap();
        HashMap term6404 = new HashMap();
        HashMap term6405 = new HashMap();
        HashMap term6406 = new HashMap();
        HashMap term6407 = new HashMap();
        HashMap term6408 = new HashMap();
        term6386 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term6387 = newInstance(Class.forName("java.lang.Object"));
        Object term6390 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6391 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6392 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6393 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6400 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6401 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6402 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6409 = newInstance(Class.forName("java.lang.Object"));
        setField(term6386, term6386.getClass(), "node", term6387);
        setField(term6386, term6386.getClass(), "id", "HyxfbSQYBe");
        setField(term6393, term6393.getClass(), "parent", null);
        setField(term6393, term6393.getClass(), "namespaceMap", null);
        setField(term6393, term6393.getClass(), "reverseMap", null);
        setField(term6393, term6393.getClass(), "pointer", null);
        setBooleanField(term6393, term6393.getClass(), "sealed", false);
        setField(term6392, term6392.getClass(), "parent", term6393);
        setField(term6392, term6392.getClass(), "namespaceMap", term6394);
        setField(term6392, term6392.getClass(), "reverseMap", term6395);
        setField(term6392, term6392.getClass(), "pointer", null);
        setBooleanField(term6392, term6392.getClass(), "sealed", false);
        setField(term6391, term6391.getClass(), "parent", term6392);
        setField(term6391, term6391.getClass(), "namespaceMap", term6396);
        setField(term6391, term6391.getClass(), "reverseMap", term6397);
        setField(term6391, term6391.getClass(), "pointer", null);
        setBooleanField(term6391, term6391.getClass(), "sealed", false);
        setField(term6390, term6390.getClass(), "parent", term6391);
        setField(term6390, term6390.getClass(), "namespaceMap", term6398);
        setField(term6390, term6390.getClass(), "reverseMap", term6399);
        setField(term6390, term6390.getClass(), "pointer", null);
        setBooleanField(term6390, term6390.getClass(), "sealed", false);
        setField(term6386, term6386.getClass(), "localNamespaceResolver", term6390);
        setIntField(term6386, term6386.getClass(), "index", 1134449235);
        setBooleanField(term6386, term6386.getClass(), "attribute", true);
        setField(term6402, term6402.getClass(), "parent", null);
        setField(term6402, term6402.getClass(), "namespaceMap", term6403);
        setField(term6402, term6402.getClass(), "reverseMap", term6404);
        setField(term6402, term6402.getClass(), "pointer", null);
        setBooleanField(term6402, term6402.getClass(), "sealed", false);
        setField(term6401, term6401.getClass(), "parent", term6402);
        setField(term6401, term6401.getClass(), "namespaceMap", term6405);
        setField(term6401, term6401.getClass(), "reverseMap", term6406);
        setField(term6401, term6401.getClass(), "pointer", null);
        setBooleanField(term6401, term6401.getClass(), "sealed", false);
        setField(term6400, term6400.getClass(), "parent", term6401);
        setField(term6400, term6400.getClass(), "namespaceMap", term6407);
        setField(term6400, term6400.getClass(), "reverseMap", term6408);
        setField(term6400, term6400.getClass(), "pointer", null);
        setBooleanField(term6400, term6400.getClass(), "sealed", false);
        setField(term6386, term6386.getClass(), "namespaceResolver", term6400);
        setField(term6386, term6386.getClass(), "rootNode", term6409);
        setField(term6386, term6386.getClass(), "parent", null);
        setField(term6386, term6386.getClass(), "locale", null);
        term6294 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term6294, term6294.getClass(), "prefix", null);
        setField(term6294, term6294.getClass(), "name", null);
        setField(term6294, term6294.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getName", argTypes, term1388, args);
        assertTrue(recursiveEquals(term1388, term6386));
        assertTrue(recursiveEquals(retValue, term6294));
    }

};


