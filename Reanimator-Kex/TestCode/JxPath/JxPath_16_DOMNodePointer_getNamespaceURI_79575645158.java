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

public class DOMNodePointer_getNamespaceURI_79575645158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978;
     Object term6817;

    public DOMNodePointer_getNamespaceURI_79575645158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term979 = new HashMap();
        HashMap term1013 = new HashMap();
        HashMap term1018 = new HashMap();
        HashMap term1024 = new HashMap();
        HashMap term1029 = new HashMap();
        HashMap term1035 = new HashMap();
        HashMap term1040 = new HashMap();
        HashMap term1050 = new HashMap();
        term978 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1008 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1009 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1010 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1011 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1048 = newInstance(Class.forName("java.lang.Object"));
        Object term1049 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term978, term978.getClass(), "node", null);
        setField(term978, term978.getClass(), "namespaces", term979);
        setField(term978, term978.getClass(), "defaultNamespace", "eZFUvlxvGV");
        setField(term978, term978.getClass(), "id", "BYqFIqCKAV");
        setField(term1011, term1011.getClass(), "parent", null);
        setField(term1011, term1011.getClass(), "namespaceMap", null);
        setField(term1011, term1011.getClass(), "reverseMap", null);
        setField(term1011, term1011.getClass(), "pointer", null);
        setBooleanField(term1011, term1011.getClass(), "sealed", false);
        setField(term1010, term1010.getClass(), "parent", term1011);
        setField(term1010, term1010.getClass(), "namespaceMap", term1013);
        setField(term1010, term1010.getClass(), "reverseMap", term1018);
        setField(term1010, term1010.getClass(), "pointer", null);
        setBooleanField(term1010, term1010.getClass(), "sealed", false);
        setField(term1009, term1009.getClass(), "parent", term1010);
        setField(term1009, term1009.getClass(), "namespaceMap", term1024);
        setField(term1009, term1009.getClass(), "reverseMap", term1029);
        setField(term1009, term1009.getClass(), "pointer", null);
        setBooleanField(term1009, term1009.getClass(), "sealed", false);
        setField(term1008, term1008.getClass(), "parent", term1009);
        setField(term1008, term1008.getClass(), "namespaceMap", term1035);
        setField(term1008, term1008.getClass(), "reverseMap", term1040);
        setField(term1008, term1008.getClass(), "pointer", null);
        setBooleanField(term1008, term1008.getClass(), "sealed", false);
        setField(term978, term978.getClass(), "localNamespaceResolver", term1008);
        setIntField(term978, term978.getClass(), "index", 1227103734);
        setBooleanField(term978, term978.getClass(), "attribute", true);
        setField(term978, term978.getClass(), "rootNode", term1048);
        setField(term1049, term1049.getClass(), "parent", null);
        setField(term1049, term1049.getClass(), "namespaceMap", term1050);
        setField(term1049, term1049.getClass(), "reverseMap", null);
        setField(term1049, term1049.getClass(), "pointer", null);
        setBooleanField(term1049, term1049.getClass(), "sealed", false);
        setField(term978, term978.getClass(), "namespaceResolver", term1049);
        setField(term978, term978.getClass(), "parent", null);
        setField(term978, term978.getClass(), "locale", null);
        HashMap term6818 = new HashMap();
        HashMap term6831 = new HashMap();
        HashMap term6832 = new HashMap();
        HashMap term6833 = new HashMap();
        HashMap term6834 = new HashMap();
        HashMap term6835 = new HashMap();
        HashMap term6836 = new HashMap();
        HashMap term6839 = new HashMap();
        term6817 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term6827 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6828 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6829 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6830 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6837 = newInstance(Class.forName("java.lang.Object"));
        Object term6838 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6817, term6817.getClass(), "node", null);
        setField(term6817, term6817.getClass(), "namespaces", term6818);
        setField(term6817, term6817.getClass(), "defaultNamespace", "eZFUvlxvGV");
        setField(term6817, term6817.getClass(), "id", "BYqFIqCKAV");
        setField(term6830, term6830.getClass(), "parent", null);
        setField(term6830, term6830.getClass(), "namespaceMap", null);
        setField(term6830, term6830.getClass(), "reverseMap", null);
        setField(term6830, term6830.getClass(), "pointer", null);
        setBooleanField(term6830, term6830.getClass(), "sealed", false);
        setField(term6829, term6829.getClass(), "parent", term6830);
        setField(term6829, term6829.getClass(), "namespaceMap", term6831);
        setField(term6829, term6829.getClass(), "reverseMap", term6832);
        setField(term6829, term6829.getClass(), "pointer", null);
        setBooleanField(term6829, term6829.getClass(), "sealed", false);
        setField(term6828, term6828.getClass(), "parent", term6829);
        setField(term6828, term6828.getClass(), "namespaceMap", term6833);
        setField(term6828, term6828.getClass(), "reverseMap", term6834);
        setField(term6828, term6828.getClass(), "pointer", null);
        setBooleanField(term6828, term6828.getClass(), "sealed", false);
        setField(term6827, term6827.getClass(), "parent", term6828);
        setField(term6827, term6827.getClass(), "namespaceMap", term6835);
        setField(term6827, term6827.getClass(), "reverseMap", term6836);
        setField(term6827, term6827.getClass(), "pointer", null);
        setBooleanField(term6827, term6827.getClass(), "sealed", false);
        setField(term6817, term6817.getClass(), "localNamespaceResolver", term6827);
        setIntField(term6817, term6817.getClass(), "index", 1227103734);
        setBooleanField(term6817, term6817.getClass(), "attribute", true);
        setField(term6817, term6817.getClass(), "rootNode", term6837);
        setField(term6838, term6838.getClass(), "parent", null);
        setField(term6838, term6838.getClass(), "namespaceMap", term6839);
        setField(term6838, term6838.getClass(), "reverseMap", null);
        setField(term6838, term6838.getClass(), "pointer", null);
        setBooleanField(term6838, term6838.getClass(), "sealed", false);
        setField(term6817, term6817.getClass(), "namespaceResolver", term6838);
        setField(term6817, term6817.getClass(), "parent", null);
        setField(term6817, term6817.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vrQLuWIDJX";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term978, args);
        assertTrue(recursiveEquals(term978, term6817));
        assertTrue(recursiveEquals(retValue, null));
    }

};


