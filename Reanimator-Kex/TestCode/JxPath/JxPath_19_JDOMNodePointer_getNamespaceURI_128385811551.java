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

public class JDOMNodePointer_getNamespaceURI_128385811551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term760;
     Object term5419;

    public JDOMNodePointer_getNamespaceURI_128385811551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term779 = new HashMap();
        HashMap term784 = new HashMap();
        HashMap term790 = new HashMap();
        HashMap term795 = new HashMap();
        HashMap term801 = new HashMap();
        HashMap term806 = new HashMap();
        HashMap term817 = new HashMap();
        HashMap term822 = new HashMap();
        HashMap term828 = new HashMap();
        HashMap term833 = new HashMap();
        HashMap term839 = new HashMap();
        HashMap term844 = new HashMap();
        term760 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term761 = newInstance(Class.forName("java.lang.Object"));
        Object term774 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term775 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term776 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term777 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term814 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term815 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term816 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term850 = newInstance(Class.forName("java.lang.Object"));
        setField(term760, term760.getClass(), "node", term761);
        setField(term760, term760.getClass(), "id", "uuaPigETmJ");
        setField(term777, term777.getClass(), "parent", null);
        setField(term777, term777.getClass(), "namespaceMap", null);
        setField(term777, term777.getClass(), "reverseMap", null);
        setField(term777, term777.getClass(), "pointer", null);
        setBooleanField(term777, term777.getClass(), "sealed", false);
        setField(term776, term776.getClass(), "parent", term777);
        setField(term776, term776.getClass(), "namespaceMap", term779);
        setField(term776, term776.getClass(), "reverseMap", term784);
        setField(term776, term776.getClass(), "pointer", null);
        setBooleanField(term776, term776.getClass(), "sealed", false);
        setField(term775, term775.getClass(), "parent", term776);
        setField(term775, term775.getClass(), "namespaceMap", term790);
        setField(term775, term775.getClass(), "reverseMap", term795);
        setField(term775, term775.getClass(), "pointer", null);
        setBooleanField(term775, term775.getClass(), "sealed", false);
        setField(term774, term774.getClass(), "parent", term775);
        setField(term774, term774.getClass(), "namespaceMap", term801);
        setField(term774, term774.getClass(), "reverseMap", term806);
        setField(term774, term774.getClass(), "pointer", null);
        setBooleanField(term774, term774.getClass(), "sealed", false);
        setField(term760, term760.getClass(), "localNamespaceResolver", term774);
        setIntField(term760, term760.getClass(), "index", -1955890973);
        setBooleanField(term760, term760.getClass(), "attribute", true);
        setField(term816, term816.getClass(), "parent", null);
        setField(term816, term816.getClass(), "namespaceMap", term817);
        setField(term816, term816.getClass(), "reverseMap", term822);
        setField(term816, term816.getClass(), "pointer", null);
        setBooleanField(term816, term816.getClass(), "sealed", false);
        setField(term815, term815.getClass(), "parent", term816);
        setField(term815, term815.getClass(), "namespaceMap", term828);
        setField(term815, term815.getClass(), "reverseMap", term833);
        setField(term815, term815.getClass(), "pointer", null);
        setBooleanField(term815, term815.getClass(), "sealed", false);
        setField(term814, term814.getClass(), "parent", term815);
        setField(term814, term814.getClass(), "namespaceMap", term839);
        setField(term814, term814.getClass(), "reverseMap", term844);
        setField(term814, term814.getClass(), "pointer", null);
        setBooleanField(term814, term814.getClass(), "sealed", false);
        setField(term760, term760.getClass(), "namespaceResolver", term814);
        setField(term760, term760.getClass(), "rootNode", term850);
        setField(term760, term760.getClass(), "parent", null);
        setField(term760, term760.getClass(), "locale", null);
        HashMap term5427 = new HashMap();
        HashMap term5428 = new HashMap();
        HashMap term5429 = new HashMap();
        HashMap term5430 = new HashMap();
        HashMap term5431 = new HashMap();
        HashMap term5432 = new HashMap();
        HashMap term5436 = new HashMap();
        HashMap term5437 = new HashMap();
        HashMap term5438 = new HashMap();
        HashMap term5439 = new HashMap();
        HashMap term5440 = new HashMap();
        HashMap term5441 = new HashMap();
        term5419 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term5420 = newInstance(Class.forName("java.lang.Object"));
        Object term5423 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5424 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5425 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5426 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5433 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5434 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5435 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5442 = newInstance(Class.forName("java.lang.Object"));
        setField(term5419, term5419.getClass(), "node", term5420);
        setField(term5419, term5419.getClass(), "id", "uuaPigETmJ");
        setField(term5426, term5426.getClass(), "parent", null);
        setField(term5426, term5426.getClass(), "namespaceMap", null);
        setField(term5426, term5426.getClass(), "reverseMap", null);
        setField(term5426, term5426.getClass(), "pointer", null);
        setBooleanField(term5426, term5426.getClass(), "sealed", false);
        setField(term5425, term5425.getClass(), "parent", term5426);
        setField(term5425, term5425.getClass(), "namespaceMap", term5427);
        setField(term5425, term5425.getClass(), "reverseMap", term5428);
        setField(term5425, term5425.getClass(), "pointer", null);
        setBooleanField(term5425, term5425.getClass(), "sealed", false);
        setField(term5424, term5424.getClass(), "parent", term5425);
        setField(term5424, term5424.getClass(), "namespaceMap", term5429);
        setField(term5424, term5424.getClass(), "reverseMap", term5430);
        setField(term5424, term5424.getClass(), "pointer", null);
        setBooleanField(term5424, term5424.getClass(), "sealed", false);
        setField(term5423, term5423.getClass(), "parent", term5424);
        setField(term5423, term5423.getClass(), "namespaceMap", term5431);
        setField(term5423, term5423.getClass(), "reverseMap", term5432);
        setField(term5423, term5423.getClass(), "pointer", null);
        setBooleanField(term5423, term5423.getClass(), "sealed", false);
        setField(term5419, term5419.getClass(), "localNamespaceResolver", term5423);
        setIntField(term5419, term5419.getClass(), "index", -1955890973);
        setBooleanField(term5419, term5419.getClass(), "attribute", true);
        setField(term5435, term5435.getClass(), "parent", null);
        setField(term5435, term5435.getClass(), "namespaceMap", term5436);
        setField(term5435, term5435.getClass(), "reverseMap", term5437);
        setField(term5435, term5435.getClass(), "pointer", null);
        setBooleanField(term5435, term5435.getClass(), "sealed", false);
        setField(term5434, term5434.getClass(), "parent", term5435);
        setField(term5434, term5434.getClass(), "namespaceMap", term5438);
        setField(term5434, term5434.getClass(), "reverseMap", term5439);
        setField(term5434, term5434.getClass(), "pointer", null);
        setBooleanField(term5434, term5434.getClass(), "sealed", false);
        setField(term5433, term5433.getClass(), "parent", term5434);
        setField(term5433, term5433.getClass(), "namespaceMap", term5440);
        setField(term5433, term5433.getClass(), "reverseMap", term5441);
        setField(term5433, term5433.getClass(), "pointer", null);
        setBooleanField(term5433, term5433.getClass(), "sealed", false);
        setField(term5419, term5419.getClass(), "namespaceResolver", term5433);
        setField(term5419, term5419.getClass(), "rootNode", term5442);
        setField(term5419, term5419.getClass(), "parent", null);
        setField(term5419, term5419.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MxlszYVzRf";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term760, args);
        assertTrue(recursiveEquals(term760, term5419));
        assertTrue(recursiveEquals(retValue, null));
    }

};


