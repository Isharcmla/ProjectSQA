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

public class DOMNodePointer_isActual_151940046261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1440;
     Object term7505;

    public DOMNodePointer_isActual_151940046261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1441 = new HashMap();
        HashMap term1475 = new HashMap();
        HashMap term1480 = new HashMap();
        HashMap term1486 = new HashMap();
        HashMap term1491 = new HashMap();
        HashMap term1497 = new HashMap();
        HashMap term1502 = new HashMap();
        HashMap term1511 = new HashMap();
        HashMap term1516 = new HashMap();
        term1440 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1470 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1471 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1472 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1473 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1510 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1440, term1440.getClass(), "node", null);
        setField(term1440, term1440.getClass(), "namespaces", term1441);
        setField(term1440, term1440.getClass(), "defaultNamespace", "AijpHYOFuy");
        setField(term1440, term1440.getClass(), "id", "SbAoxhfrkn");
        setField(term1473, term1473.getClass(), "parent", null);
        setField(term1473, term1473.getClass(), "namespaceMap", null);
        setField(term1473, term1473.getClass(), "reverseMap", null);
        setField(term1473, term1473.getClass(), "pointer", null);
        setBooleanField(term1473, term1473.getClass(), "sealed", false);
        setField(term1472, term1472.getClass(), "parent", term1473);
        setField(term1472, term1472.getClass(), "namespaceMap", term1475);
        setField(term1472, term1472.getClass(), "reverseMap", term1480);
        setField(term1472, term1472.getClass(), "pointer", null);
        setBooleanField(term1472, term1472.getClass(), "sealed", false);
        setField(term1471, term1471.getClass(), "parent", term1472);
        setField(term1471, term1471.getClass(), "namespaceMap", term1486);
        setField(term1471, term1471.getClass(), "reverseMap", term1491);
        setField(term1471, term1471.getClass(), "pointer", null);
        setBooleanField(term1471, term1471.getClass(), "sealed", false);
        setField(term1470, term1470.getClass(), "parent", term1471);
        setField(term1470, term1470.getClass(), "namespaceMap", term1497);
        setField(term1470, term1470.getClass(), "reverseMap", term1502);
        setField(term1470, term1470.getClass(), "pointer", null);
        setBooleanField(term1470, term1470.getClass(), "sealed", false);
        setField(term1440, term1440.getClass(), "localNamespaceResolver", term1470);
        setIntField(term1440, term1440.getClass(), "index", 1134449235);
        setBooleanField(term1440, term1440.getClass(), "attribute", true);
        setField(term1510, term1510.getClass(), "parent", null);
        setField(term1510, term1510.getClass(), "namespaceMap", term1511);
        setField(term1510, term1510.getClass(), "reverseMap", term1516);
        setField(term1510, term1510.getClass(), "pointer", null);
        setBooleanField(term1510, term1510.getClass(), "sealed", false);
        setField(term1440, term1440.getClass(), "namespaceResolver", term1510);
        setField(term1440, term1440.getClass(), "exceptionHandler", null);
        setField(term1440, term1440.getClass(), "rootNode", null);
        setField(term1440, term1440.getClass(), "parent", null);
        setField(term1440, term1440.getClass(), "locale", null);
        HashMap term7506 = new HashMap();
        HashMap term7515 = new HashMap();
        HashMap term7516 = new HashMap();
        HashMap term7517 = new HashMap();
        HashMap term7518 = new HashMap();
        HashMap term7519 = new HashMap();
        HashMap term7520 = new HashMap();
        HashMap term7522 = new HashMap();
        HashMap term7523 = new HashMap();
        term7505 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term7511 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7512 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7513 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7514 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7521 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term7505, term7505.getClass(), "node", null);
        setField(term7505, term7505.getClass(), "namespaces", term7506);
        setField(term7505, term7505.getClass(), "defaultNamespace", "AijpHYOFuy");
        setField(term7505, term7505.getClass(), "id", "SbAoxhfrkn");
        setField(term7514, term7514.getClass(), "parent", null);
        setField(term7514, term7514.getClass(), "namespaceMap", null);
        setField(term7514, term7514.getClass(), "reverseMap", null);
        setField(term7514, term7514.getClass(), "pointer", null);
        setBooleanField(term7514, term7514.getClass(), "sealed", false);
        setField(term7513, term7513.getClass(), "parent", term7514);
        setField(term7513, term7513.getClass(), "namespaceMap", term7515);
        setField(term7513, term7513.getClass(), "reverseMap", term7516);
        setField(term7513, term7513.getClass(), "pointer", null);
        setBooleanField(term7513, term7513.getClass(), "sealed", false);
        setField(term7512, term7512.getClass(), "parent", term7513);
        setField(term7512, term7512.getClass(), "namespaceMap", term7517);
        setField(term7512, term7512.getClass(), "reverseMap", term7518);
        setField(term7512, term7512.getClass(), "pointer", null);
        setBooleanField(term7512, term7512.getClass(), "sealed", false);
        setField(term7511, term7511.getClass(), "parent", term7512);
        setField(term7511, term7511.getClass(), "namespaceMap", term7519);
        setField(term7511, term7511.getClass(), "reverseMap", term7520);
        setField(term7511, term7511.getClass(), "pointer", null);
        setBooleanField(term7511, term7511.getClass(), "sealed", false);
        setField(term7505, term7505.getClass(), "localNamespaceResolver", term7511);
        setIntField(term7505, term7505.getClass(), "index", 1134449235);
        setBooleanField(term7505, term7505.getClass(), "attribute", true);
        setField(term7521, term7521.getClass(), "parent", null);
        setField(term7521, term7521.getClass(), "namespaceMap", term7522);
        setField(term7521, term7521.getClass(), "reverseMap", term7523);
        setField(term7521, term7521.getClass(), "pointer", null);
        setBooleanField(term7521, term7521.getClass(), "sealed", false);
        setField(term7505, term7505.getClass(), "namespaceResolver", term7521);
        setField(term7505, term7505.getClass(), "exceptionHandler", null);
        setField(term7505, term7505.getClass(), "rootNode", null);
        setField(term7505, term7505.getClass(), "parent", null);
        setField(term7505, term7505.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isActual", argTypes, term1440, args);
        assertTrue(recursiveEquals(term1440, term7505));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


