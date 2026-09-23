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

public class JDOMNodePointer_getImmediateNode_110421740458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1489;
     Object term6501;
     Object term6410;

    public JDOMNodePointer_getImmediateNode_110421740458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1508 = new HashMap();
        HashMap term1513 = new HashMap();
        HashMap term1519 = new HashMap();
        HashMap term1524 = new HashMap();
        HashMap term1530 = new HashMap();
        HashMap term1535 = new HashMap();
        HashMap term1546 = new HashMap();
        HashMap term1551 = new HashMap();
        HashMap term1557 = new HashMap();
        HashMap term1562 = new HashMap();
        HashMap term1568 = new HashMap();
        HashMap term1573 = new HashMap();
        term1489 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1490 = newInstance(Class.forName("java.lang.Object"));
        Object term1503 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1504 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1505 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1506 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1543 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1544 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1545 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1579 = newInstance(Class.forName("java.lang.Object"));
        setField(term1489, term1489.getClass(), "node", term1490);
        setField(term1489, term1489.getClass(), "id", "pCTimMblYc");
        setField(term1506, term1506.getClass(), "parent", null);
        setField(term1506, term1506.getClass(), "namespaceMap", null);
        setField(term1506, term1506.getClass(), "reverseMap", null);
        setField(term1506, term1506.getClass(), "pointer", null);
        setBooleanField(term1506, term1506.getClass(), "sealed", false);
        setField(term1505, term1505.getClass(), "parent", term1506);
        setField(term1505, term1505.getClass(), "namespaceMap", term1508);
        setField(term1505, term1505.getClass(), "reverseMap", term1513);
        setField(term1505, term1505.getClass(), "pointer", null);
        setBooleanField(term1505, term1505.getClass(), "sealed", false);
        setField(term1504, term1504.getClass(), "parent", term1505);
        setField(term1504, term1504.getClass(), "namespaceMap", term1519);
        setField(term1504, term1504.getClass(), "reverseMap", term1524);
        setField(term1504, term1504.getClass(), "pointer", null);
        setBooleanField(term1504, term1504.getClass(), "sealed", false);
        setField(term1503, term1503.getClass(), "parent", term1504);
        setField(term1503, term1503.getClass(), "namespaceMap", term1530);
        setField(term1503, term1503.getClass(), "reverseMap", term1535);
        setField(term1503, term1503.getClass(), "pointer", null);
        setBooleanField(term1503, term1503.getClass(), "sealed", false);
        setField(term1489, term1489.getClass(), "localNamespaceResolver", term1503);
        setIntField(term1489, term1489.getClass(), "index", -883034806);
        setBooleanField(term1489, term1489.getClass(), "attribute", false);
        setField(term1545, term1545.getClass(), "parent", null);
        setField(term1545, term1545.getClass(), "namespaceMap", term1546);
        setField(term1545, term1545.getClass(), "reverseMap", term1551);
        setField(term1545, term1545.getClass(), "pointer", null);
        setBooleanField(term1545, term1545.getClass(), "sealed", false);
        setField(term1544, term1544.getClass(), "parent", term1545);
        setField(term1544, term1544.getClass(), "namespaceMap", term1557);
        setField(term1544, term1544.getClass(), "reverseMap", term1562);
        setField(term1544, term1544.getClass(), "pointer", null);
        setBooleanField(term1544, term1544.getClass(), "sealed", false);
        setField(term1543, term1543.getClass(), "parent", term1544);
        setField(term1543, term1543.getClass(), "namespaceMap", term1568);
        setField(term1543, term1543.getClass(), "reverseMap", term1573);
        setField(term1543, term1543.getClass(), "pointer", null);
        setBooleanField(term1543, term1543.getClass(), "sealed", false);
        setField(term1489, term1489.getClass(), "namespaceResolver", term1543);
        setField(term1489, term1489.getClass(), "rootNode", term1579);
        setField(term1489, term1489.getClass(), "parent", null);
        setField(term1489, term1489.getClass(), "locale", null);
        HashMap term6509 = new HashMap();
        HashMap term6510 = new HashMap();
        HashMap term6511 = new HashMap();
        HashMap term6512 = new HashMap();
        HashMap term6513 = new HashMap();
        HashMap term6514 = new HashMap();
        HashMap term6518 = new HashMap();
        HashMap term6519 = new HashMap();
        HashMap term6520 = new HashMap();
        HashMap term6521 = new HashMap();
        HashMap term6522 = new HashMap();
        HashMap term6523 = new HashMap();
        term6501 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term6502 = newInstance(Class.forName("java.lang.Object"));
        Object term6505 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6506 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6507 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6508 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6515 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6516 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6517 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6524 = newInstance(Class.forName("java.lang.Object"));
        setField(term6501, term6501.getClass(), "node", term6502);
        setField(term6501, term6501.getClass(), "id", "pCTimMblYc");
        setField(term6508, term6508.getClass(), "parent", null);
        setField(term6508, term6508.getClass(), "namespaceMap", null);
        setField(term6508, term6508.getClass(), "reverseMap", null);
        setField(term6508, term6508.getClass(), "pointer", null);
        setBooleanField(term6508, term6508.getClass(), "sealed", false);
        setField(term6507, term6507.getClass(), "parent", term6508);
        setField(term6507, term6507.getClass(), "namespaceMap", term6509);
        setField(term6507, term6507.getClass(), "reverseMap", term6510);
        setField(term6507, term6507.getClass(), "pointer", null);
        setBooleanField(term6507, term6507.getClass(), "sealed", false);
        setField(term6506, term6506.getClass(), "parent", term6507);
        setField(term6506, term6506.getClass(), "namespaceMap", term6511);
        setField(term6506, term6506.getClass(), "reverseMap", term6512);
        setField(term6506, term6506.getClass(), "pointer", null);
        setBooleanField(term6506, term6506.getClass(), "sealed", false);
        setField(term6505, term6505.getClass(), "parent", term6506);
        setField(term6505, term6505.getClass(), "namespaceMap", term6513);
        setField(term6505, term6505.getClass(), "reverseMap", term6514);
        setField(term6505, term6505.getClass(), "pointer", null);
        setBooleanField(term6505, term6505.getClass(), "sealed", false);
        setField(term6501, term6501.getClass(), "localNamespaceResolver", term6505);
        setIntField(term6501, term6501.getClass(), "index", -883034806);
        setBooleanField(term6501, term6501.getClass(), "attribute", false);
        setField(term6517, term6517.getClass(), "parent", null);
        setField(term6517, term6517.getClass(), "namespaceMap", term6518);
        setField(term6517, term6517.getClass(), "reverseMap", term6519);
        setField(term6517, term6517.getClass(), "pointer", null);
        setBooleanField(term6517, term6517.getClass(), "sealed", false);
        setField(term6516, term6516.getClass(), "parent", term6517);
        setField(term6516, term6516.getClass(), "namespaceMap", term6520);
        setField(term6516, term6516.getClass(), "reverseMap", term6521);
        setField(term6516, term6516.getClass(), "pointer", null);
        setBooleanField(term6516, term6516.getClass(), "sealed", false);
        setField(term6515, term6515.getClass(), "parent", term6516);
        setField(term6515, term6515.getClass(), "namespaceMap", term6522);
        setField(term6515, term6515.getClass(), "reverseMap", term6523);
        setField(term6515, term6515.getClass(), "pointer", null);
        setBooleanField(term6515, term6515.getClass(), "sealed", false);
        setField(term6501, term6501.getClass(), "namespaceResolver", term6515);
        setField(term6501, term6501.getClass(), "rootNode", term6524);
        setField(term6501, term6501.getClass(), "parent", null);
        setField(term6501, term6501.getClass(), "locale", null);
        term6410 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImmediateNode", argTypes, term1489, args);
        assertTrue(recursiveEquals(term1489, term6501));
        assertTrue(recursiveEquals(retValue, term6410));
    }

};


