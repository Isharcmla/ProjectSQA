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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Integer;

public class JDOMNodePointer_createChild_174305012069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1494;
     Object term1549;
     Object term1586;

    public JDOMNodePointer_createChild_174305012069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1516 = new HashMap();
        HashMap term1521 = new HashMap();
        HashMap term1527 = new HashMap();
        HashMap term1532 = new HashMap();
        HashMap term1538 = new HashMap();
        HashMap term1543 = new HashMap();
        term1494 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1495 = newInstance(Class.forName("java.lang.Object"));
        Object term1510 = newInstance(Class.forName("java.lang.Object"));
        Object term1511 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1512 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1513 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1514 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1494, term1494.getClass(), "node", term1495);
        setField(term1494, term1494.getClass(), "id", "IoAlmYsBwc");
        setIntField(term1494, term1494.getClass(), "index", 1048535127);
        setBooleanField(term1494, term1494.getClass(), "attribute", true);
        setField(term1494, term1494.getClass(), "rootNode", term1510);
        setField(term1514, term1514.getClass(), "parent", null);
        setField(term1514, term1514.getClass(), "namespaceMap", null);
        setField(term1514, term1514.getClass(), "reverseMap", null);
        setField(term1514, term1514.getClass(), "pointer", null);
        setField(term1514, term1514.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1514, term1514.getClass(), "sealed", false);
        setField(term1513, term1513.getClass(), "parent", term1514);
        setField(term1513, term1513.getClass(), "namespaceMap", term1516);
        setField(term1513, term1513.getClass(), "reverseMap", term1521);
        setField(term1513, term1513.getClass(), "pointer", null);
        setField(term1513, term1513.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1513, term1513.getClass(), "sealed", false);
        setField(term1512, term1512.getClass(), "parent", term1513);
        setField(term1512, term1512.getClass(), "namespaceMap", term1527);
        setField(term1512, term1512.getClass(), "reverseMap", term1532);
        setField(term1512, term1512.getClass(), "pointer", null);
        setField(term1512, term1512.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1512, term1512.getClass(), "sealed", false);
        setField(term1511, term1511.getClass(), "parent", term1512);
        setField(term1511, term1511.getClass(), "namespaceMap", term1538);
        setField(term1511, term1511.getClass(), "reverseMap", term1543);
        setField(term1511, term1511.getClass(), "pointer", null);
        setField(term1511, term1511.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1511, term1511.getClass(), "sealed", false);
        setField(term1494, term1494.getClass(), "namespaceResolver", term1511);
        setField(term1494, term1494.getClass(), "parent", null);
        setField(term1494, term1494.getClass(), "locale", null);
        term1549 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term1549, term1549.getClass(), "prefix", "TEParAifyi");
        setField(term1549, term1549.getClass(), "name", "OWDIEULEFu");
        setField(term1549, term1549.getClass(), "qualifiedName", "dWRymuLBtr");
        term1586 = new Integer(-655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1549;
        args[2] = term1586;
        try {
            callMethod(klass, "createChild", argTypes, term1494, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


