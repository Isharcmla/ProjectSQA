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
     Object term1452;
     Object term7464;

    public DOMNodePointer_isActual_151940046260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1453 = new HashMap();
        HashMap term1487 = new HashMap();
        HashMap term1492 = new HashMap();
        HashMap term1498 = new HashMap();
        HashMap term1503 = new HashMap();
        HashMap term1509 = new HashMap();
        HashMap term1514 = new HashMap();
        HashMap term1523 = new HashMap();
        HashMap term1528 = new HashMap();
        term1452 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1482 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1483 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1484 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1485 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1522 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1534 = newInstance(Class.forName("java.lang.Object"));
        setField(term1452, term1452.getClass(), "node", null);
        setField(term1452, term1452.getClass(), "namespaces", term1453);
        setField(term1452, term1452.getClass(), "defaultNamespace", "AijpHYOFuy");
        setField(term1452, term1452.getClass(), "id", "SbAoxhfrkn");
        setField(term1485, term1485.getClass(), "parent", null);
        setField(term1485, term1485.getClass(), "namespaceMap", null);
        setField(term1485, term1485.getClass(), "reverseMap", null);
        setField(term1485, term1485.getClass(), "pointer", null);
        setBooleanField(term1485, term1485.getClass(), "sealed", false);
        setField(term1484, term1484.getClass(), "parent", term1485);
        setField(term1484, term1484.getClass(), "namespaceMap", term1487);
        setField(term1484, term1484.getClass(), "reverseMap", term1492);
        setField(term1484, term1484.getClass(), "pointer", null);
        setBooleanField(term1484, term1484.getClass(), "sealed", false);
        setField(term1483, term1483.getClass(), "parent", term1484);
        setField(term1483, term1483.getClass(), "namespaceMap", term1498);
        setField(term1483, term1483.getClass(), "reverseMap", term1503);
        setField(term1483, term1483.getClass(), "pointer", null);
        setBooleanField(term1483, term1483.getClass(), "sealed", false);
        setField(term1482, term1482.getClass(), "parent", term1483);
        setField(term1482, term1482.getClass(), "namespaceMap", term1509);
        setField(term1482, term1482.getClass(), "reverseMap", term1514);
        setField(term1482, term1482.getClass(), "pointer", null);
        setBooleanField(term1482, term1482.getClass(), "sealed", false);
        setField(term1452, term1452.getClass(), "localNamespaceResolver", term1482);
        setIntField(term1452, term1452.getClass(), "index", 1134449235);
        setBooleanField(term1452, term1452.getClass(), "attribute", true);
        setField(term1522, term1522.getClass(), "parent", null);
        setField(term1522, term1522.getClass(), "namespaceMap", term1523);
        setField(term1522, term1522.getClass(), "reverseMap", term1528);
        setField(term1522, term1522.getClass(), "pointer", null);
        setBooleanField(term1522, term1522.getClass(), "sealed", false);
        setField(term1452, term1452.getClass(), "namespaceResolver", term1522);
        setField(term1452, term1452.getClass(), "rootNode", term1534);
        setField(term1452, term1452.getClass(), "parent", null);
        setField(term1452, term1452.getClass(), "locale", null);
        HashMap term7465 = new HashMap();
        HashMap term7474 = new HashMap();
        HashMap term7475 = new HashMap();
        HashMap term7476 = new HashMap();
        HashMap term7477 = new HashMap();
        HashMap term7478 = new HashMap();
        HashMap term7479 = new HashMap();
        HashMap term7481 = new HashMap();
        HashMap term7482 = new HashMap();
        term7464 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term7470 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7471 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7472 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7473 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7480 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7483 = newInstance(Class.forName("java.lang.Object"));
        setField(term7464, term7464.getClass(), "node", null);
        setField(term7464, term7464.getClass(), "namespaces", term7465);
        setField(term7464, term7464.getClass(), "defaultNamespace", "AijpHYOFuy");
        setField(term7464, term7464.getClass(), "id", "SbAoxhfrkn");
        setField(term7473, term7473.getClass(), "parent", null);
        setField(term7473, term7473.getClass(), "namespaceMap", null);
        setField(term7473, term7473.getClass(), "reverseMap", null);
        setField(term7473, term7473.getClass(), "pointer", null);
        setBooleanField(term7473, term7473.getClass(), "sealed", false);
        setField(term7472, term7472.getClass(), "parent", term7473);
        setField(term7472, term7472.getClass(), "namespaceMap", term7474);
        setField(term7472, term7472.getClass(), "reverseMap", term7475);
        setField(term7472, term7472.getClass(), "pointer", null);
        setBooleanField(term7472, term7472.getClass(), "sealed", false);
        setField(term7471, term7471.getClass(), "parent", term7472);
        setField(term7471, term7471.getClass(), "namespaceMap", term7476);
        setField(term7471, term7471.getClass(), "reverseMap", term7477);
        setField(term7471, term7471.getClass(), "pointer", null);
        setBooleanField(term7471, term7471.getClass(), "sealed", false);
        setField(term7470, term7470.getClass(), "parent", term7471);
        setField(term7470, term7470.getClass(), "namespaceMap", term7478);
        setField(term7470, term7470.getClass(), "reverseMap", term7479);
        setField(term7470, term7470.getClass(), "pointer", null);
        setBooleanField(term7470, term7470.getClass(), "sealed", false);
        setField(term7464, term7464.getClass(), "localNamespaceResolver", term7470);
        setIntField(term7464, term7464.getClass(), "index", 1134449235);
        setBooleanField(term7464, term7464.getClass(), "attribute", true);
        setField(term7480, term7480.getClass(), "parent", null);
        setField(term7480, term7480.getClass(), "namespaceMap", term7481);
        setField(term7480, term7480.getClass(), "reverseMap", term7482);
        setField(term7480, term7480.getClass(), "pointer", null);
        setBooleanField(term7480, term7480.getClass(), "sealed", false);
        setField(term7464, term7464.getClass(), "namespaceResolver", term7480);
        setField(term7464, term7464.getClass(), "rootNode", term7483);
        setField(term7464, term7464.getClass(), "parent", null);
        setField(term7464, term7464.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isActual", argTypes, term1452, args);
        assertTrue(recursiveEquals(term1452, term7464));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


