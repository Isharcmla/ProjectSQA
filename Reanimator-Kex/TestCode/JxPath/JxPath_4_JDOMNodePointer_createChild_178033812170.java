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

public class JDOMNodePointer_createChild_178033812170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1628;
     Object term1683;
     Object term1720;
     Object term1722;

    public JDOMNodePointer_createChild_178033812170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1650 = new HashMap();
        HashMap term1655 = new HashMap();
        HashMap term1661 = new HashMap();
        HashMap term1666 = new HashMap();
        HashMap term1672 = new HashMap();
        HashMap term1677 = new HashMap();
        term1628 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1629 = newInstance(Class.forName("java.lang.Object"));
        Object term1644 = newInstance(Class.forName("java.lang.Object"));
        Object term1645 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1646 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1647 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1648 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1628, term1628.getClass(), "node", term1629);
        setField(term1628, term1628.getClass(), "id", "AijpHYOFuy");
        setIntField(term1628, term1628.getClass(), "index", -6029667);
        setBooleanField(term1628, term1628.getClass(), "attribute", true);
        setField(term1628, term1628.getClass(), "rootNode", term1644);
        setField(term1648, term1648.getClass(), "parent", null);
        setField(term1648, term1648.getClass(), "namespaceMap", null);
        setField(term1648, term1648.getClass(), "reverseMap", null);
        setField(term1648, term1648.getClass(), "pointer", null);
        setField(term1648, term1648.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1648, term1648.getClass(), "sealed", false);
        setField(term1647, term1647.getClass(), "parent", term1648);
        setField(term1647, term1647.getClass(), "namespaceMap", term1650);
        setField(term1647, term1647.getClass(), "reverseMap", term1655);
        setField(term1647, term1647.getClass(), "pointer", null);
        setField(term1647, term1647.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1647, term1647.getClass(), "sealed", false);
        setField(term1646, term1646.getClass(), "parent", term1647);
        setField(term1646, term1646.getClass(), "namespaceMap", term1661);
        setField(term1646, term1646.getClass(), "reverseMap", term1666);
        setField(term1646, term1646.getClass(), "pointer", null);
        setField(term1646, term1646.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1646, term1646.getClass(), "sealed", false);
        setField(term1645, term1645.getClass(), "parent", term1646);
        setField(term1645, term1645.getClass(), "namespaceMap", term1672);
        setField(term1645, term1645.getClass(), "reverseMap", term1677);
        setField(term1645, term1645.getClass(), "pointer", null);
        setField(term1645, term1645.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1645, term1645.getClass(), "sealed", false);
        setField(term1628, term1628.getClass(), "namespaceResolver", term1645);
        setField(term1628, term1628.getClass(), "parent", null);
        setField(term1628, term1628.getClass(), "locale", null);
        term1683 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term1683, term1683.getClass(), "prefix", "SbAoxhfrkn");
        setField(term1683, term1683.getClass(), "name", "kuTXqwMtDB");
        setField(term1683, term1683.getClass(), "qualifiedName", "Ghbwtircqb");
        term1720 = new Integer(-2068769794);
        term1722 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.Object");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term1683;
        args[2] = term1720;
        args[3] = term1722;
        try {
            callMethod(klass, "createChild", argTypes, term1628, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


