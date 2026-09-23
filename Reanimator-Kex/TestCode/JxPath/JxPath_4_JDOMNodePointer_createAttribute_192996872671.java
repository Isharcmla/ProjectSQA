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
import org.apache.commons.jxpath.JXPathException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_createAttribute_192996872671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1763;
     Object term1818;

    public JDOMNodePointer_createAttribute_192996872671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1785 = new HashMap();
        HashMap term1790 = new HashMap();
        HashMap term1796 = new HashMap();
        HashMap term1801 = new HashMap();
        HashMap term1807 = new HashMap();
        HashMap term1812 = new HashMap();
        term1763 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1764 = newInstance(Class.forName("java.lang.Object"));
        Object term1779 = newInstance(Class.forName("java.lang.Object"));
        Object term1780 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1781 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1782 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1783 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1763, term1763.getClass(), "node", term1764);
        setField(term1763, term1763.getClass(), "id", "xrwlQZdwCp");
        setIntField(term1763, term1763.getClass(), "index", -117576464);
        setBooleanField(term1763, term1763.getClass(), "attribute", true);
        setField(term1763, term1763.getClass(), "rootNode", term1779);
        setField(term1783, term1783.getClass(), "parent", null);
        setField(term1783, term1783.getClass(), "namespaceMap", null);
        setField(term1783, term1783.getClass(), "reverseMap", null);
        setField(term1783, term1783.getClass(), "pointer", null);
        setField(term1783, term1783.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1783, term1783.getClass(), "sealed", false);
        setField(term1782, term1782.getClass(), "parent", term1783);
        setField(term1782, term1782.getClass(), "namespaceMap", term1785);
        setField(term1782, term1782.getClass(), "reverseMap", term1790);
        setField(term1782, term1782.getClass(), "pointer", null);
        setField(term1782, term1782.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1782, term1782.getClass(), "sealed", false);
        setField(term1781, term1781.getClass(), "parent", term1782);
        setField(term1781, term1781.getClass(), "namespaceMap", term1796);
        setField(term1781, term1781.getClass(), "reverseMap", term1801);
        setField(term1781, term1781.getClass(), "pointer", null);
        setField(term1781, term1781.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1781, term1781.getClass(), "sealed", false);
        setField(term1780, term1780.getClass(), "parent", term1781);
        setField(term1780, term1780.getClass(), "namespaceMap", term1807);
        setField(term1780, term1780.getClass(), "reverseMap", term1812);
        setField(term1780, term1780.getClass(), "pointer", null);
        setField(term1780, term1780.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1780, term1780.getClass(), "sealed", false);
        setField(term1763, term1763.getClass(), "namespaceResolver", term1780);
        setField(term1763, term1763.getClass(), "parent", null);
        setField(term1763, term1763.getClass(), "locale", null);
        term1818 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term1818, term1818.getClass(), "prefix", "IDCWpPLRkE");
        setField(term1818, term1818.getClass(), "name", "nyiiPDVjAc");
        setField(term1818, term1818.getClass(), "qualifiedName", "aKnKipADSo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1818;
        try {
            callMethod(klass, "createAttribute", argTypes, term1763, args);
            assertTrue(false);
        }
        catch (JXPathException e) {
        }

    }

};


