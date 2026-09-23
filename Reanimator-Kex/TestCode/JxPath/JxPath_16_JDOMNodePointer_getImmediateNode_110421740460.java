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

public class JDOMNodePointer_getImmediateNode_110421740460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1424;
     Object term6519;
     Object term6433;

    public JDOMNodePointer_getImmediateNode_110421740460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1443 = new HashMap();
        HashMap term1448 = new HashMap();
        HashMap term1454 = new HashMap();
        HashMap term1459 = new HashMap();
        HashMap term1465 = new HashMap();
        HashMap term1470 = new HashMap();
        HashMap term1482 = new HashMap();
        HashMap term1488 = new HashMap();
        HashMap term1493 = new HashMap();
        HashMap term1499 = new HashMap();
        HashMap term1504 = new HashMap();
        term1424 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1425 = newInstance(Class.forName("java.lang.Object"));
        Object term1438 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1439 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1440 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1441 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1478 = newInstance(Class.forName("java.lang.Object"));
        Object term1479 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1480 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1481 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1424, term1424.getClass(), "node", term1425);
        setField(term1424, term1424.getClass(), "id", "pCTimMblYc");
        setField(term1441, term1441.getClass(), "parent", null);
        setField(term1441, term1441.getClass(), "namespaceMap", null);
        setField(term1441, term1441.getClass(), "reverseMap", null);
        setField(term1441, term1441.getClass(), "pointer", null);
        setBooleanField(term1441, term1441.getClass(), "sealed", false);
        setField(term1440, term1440.getClass(), "parent", term1441);
        setField(term1440, term1440.getClass(), "namespaceMap", term1443);
        setField(term1440, term1440.getClass(), "reverseMap", term1448);
        setField(term1440, term1440.getClass(), "pointer", null);
        setBooleanField(term1440, term1440.getClass(), "sealed", false);
        setField(term1439, term1439.getClass(), "parent", term1440);
        setField(term1439, term1439.getClass(), "namespaceMap", term1454);
        setField(term1439, term1439.getClass(), "reverseMap", term1459);
        setField(term1439, term1439.getClass(), "pointer", null);
        setBooleanField(term1439, term1439.getClass(), "sealed", false);
        setField(term1438, term1438.getClass(), "parent", term1439);
        setField(term1438, term1438.getClass(), "namespaceMap", term1465);
        setField(term1438, term1438.getClass(), "reverseMap", term1470);
        setField(term1438, term1438.getClass(), "pointer", null);
        setBooleanField(term1438, term1438.getClass(), "sealed", false);
        setField(term1424, term1424.getClass(), "localNamespaceResolver", term1438);
        setIntField(term1424, term1424.getClass(), "index", -883034806);
        setBooleanField(term1424, term1424.getClass(), "attribute", false);
        setField(term1424, term1424.getClass(), "rootNode", term1478);
        setField(term1481, term1481.getClass(), "parent", null);
        setField(term1481, term1481.getClass(), "namespaceMap", term1482);
        setField(term1481, term1481.getClass(), "reverseMap", null);
        setField(term1481, term1481.getClass(), "pointer", null);
        setBooleanField(term1481, term1481.getClass(), "sealed", false);
        setField(term1480, term1480.getClass(), "parent", term1481);
        setField(term1480, term1480.getClass(), "namespaceMap", term1488);
        setField(term1480, term1480.getClass(), "reverseMap", term1493);
        setField(term1480, term1480.getClass(), "pointer", null);
        setBooleanField(term1480, term1480.getClass(), "sealed", false);
        setField(term1479, term1479.getClass(), "parent", term1480);
        setField(term1479, term1479.getClass(), "namespaceMap", term1499);
        setField(term1479, term1479.getClass(), "reverseMap", term1504);
        setField(term1479, term1479.getClass(), "pointer", null);
        setBooleanField(term1479, term1479.getClass(), "sealed", false);
        setField(term1424, term1424.getClass(), "namespaceResolver", term1479);
        setField(term1424, term1424.getClass(), "parent", null);
        setField(term1424, term1424.getClass(), "locale", null);
        HashMap term6527 = new HashMap();
        HashMap term6528 = new HashMap();
        HashMap term6529 = new HashMap();
        HashMap term6530 = new HashMap();
        HashMap term6531 = new HashMap();
        HashMap term6532 = new HashMap();
        HashMap term6537 = new HashMap();
        HashMap term6538 = new HashMap();
        HashMap term6539 = new HashMap();
        HashMap term6540 = new HashMap();
        HashMap term6541 = new HashMap();
        term6519 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term6520 = newInstance(Class.forName("java.lang.Object"));
        Object term6523 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6524 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6525 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6526 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6533 = newInstance(Class.forName("java.lang.Object"));
        Object term6534 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6535 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6536 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6519, term6519.getClass(), "node", term6520);
        setField(term6519, term6519.getClass(), "id", "pCTimMblYc");
        setField(term6526, term6526.getClass(), "parent", null);
        setField(term6526, term6526.getClass(), "namespaceMap", null);
        setField(term6526, term6526.getClass(), "reverseMap", null);
        setField(term6526, term6526.getClass(), "pointer", null);
        setBooleanField(term6526, term6526.getClass(), "sealed", false);
        setField(term6525, term6525.getClass(), "parent", term6526);
        setField(term6525, term6525.getClass(), "namespaceMap", term6527);
        setField(term6525, term6525.getClass(), "reverseMap", term6528);
        setField(term6525, term6525.getClass(), "pointer", null);
        setBooleanField(term6525, term6525.getClass(), "sealed", false);
        setField(term6524, term6524.getClass(), "parent", term6525);
        setField(term6524, term6524.getClass(), "namespaceMap", term6529);
        setField(term6524, term6524.getClass(), "reverseMap", term6530);
        setField(term6524, term6524.getClass(), "pointer", null);
        setBooleanField(term6524, term6524.getClass(), "sealed", false);
        setField(term6523, term6523.getClass(), "parent", term6524);
        setField(term6523, term6523.getClass(), "namespaceMap", term6531);
        setField(term6523, term6523.getClass(), "reverseMap", term6532);
        setField(term6523, term6523.getClass(), "pointer", null);
        setBooleanField(term6523, term6523.getClass(), "sealed", false);
        setField(term6519, term6519.getClass(), "localNamespaceResolver", term6523);
        setIntField(term6519, term6519.getClass(), "index", -883034806);
        setBooleanField(term6519, term6519.getClass(), "attribute", false);
        setField(term6519, term6519.getClass(), "rootNode", term6533);
        setField(term6536, term6536.getClass(), "parent", null);
        setField(term6536, term6536.getClass(), "namespaceMap", term6537);
        setField(term6536, term6536.getClass(), "reverseMap", null);
        setField(term6536, term6536.getClass(), "pointer", null);
        setBooleanField(term6536, term6536.getClass(), "sealed", false);
        setField(term6535, term6535.getClass(), "parent", term6536);
        setField(term6535, term6535.getClass(), "namespaceMap", term6538);
        setField(term6535, term6535.getClass(), "reverseMap", term6539);
        setField(term6535, term6535.getClass(), "pointer", null);
        setBooleanField(term6535, term6535.getClass(), "sealed", false);
        setField(term6534, term6534.getClass(), "parent", term6535);
        setField(term6534, term6534.getClass(), "namespaceMap", term6540);
        setField(term6534, term6534.getClass(), "reverseMap", term6541);
        setField(term6534, term6534.getClass(), "pointer", null);
        setBooleanField(term6534, term6534.getClass(), "sealed", false);
        setField(term6519, term6519.getClass(), "namespaceResolver", term6534);
        setField(term6519, term6519.getClass(), "parent", null);
        setField(term6519, term6519.getClass(), "locale", null);
        term6433 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImmediateNode", argTypes, term1424, args);
        assertTrue(recursiveEquals(term1424, term6519));
        assertTrue(recursiveEquals(retValue, term6433));
    }

};


