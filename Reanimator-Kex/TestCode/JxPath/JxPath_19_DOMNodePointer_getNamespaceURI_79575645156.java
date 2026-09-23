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

public class DOMNodePointer_getNamespaceURI_79575645156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1018;
     Object term6840;

    public DOMNodePointer_getNamespaceURI_79575645156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1019 = new HashMap();
        HashMap term1053 = new HashMap();
        HashMap term1058 = new HashMap();
        HashMap term1064 = new HashMap();
        HashMap term1069 = new HashMap();
        HashMap term1075 = new HashMap();
        HashMap term1080 = new HashMap();
        HashMap term1089 = new HashMap();
        HashMap term1094 = new HashMap();
        term1018 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1048 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1049 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1050 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1051 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1088 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1100 = newInstance(Class.forName("java.lang.Object"));
        setField(term1018, term1018.getClass(), "node", null);
        setField(term1018, term1018.getClass(), "namespaces", term1019);
        setField(term1018, term1018.getClass(), "defaultNamespace", "eZFUvlxvGV");
        setField(term1018, term1018.getClass(), "id", "BYqFIqCKAV");
        setField(term1051, term1051.getClass(), "parent", null);
        setField(term1051, term1051.getClass(), "namespaceMap", null);
        setField(term1051, term1051.getClass(), "reverseMap", null);
        setField(term1051, term1051.getClass(), "pointer", null);
        setBooleanField(term1051, term1051.getClass(), "sealed", false);
        setField(term1050, term1050.getClass(), "parent", term1051);
        setField(term1050, term1050.getClass(), "namespaceMap", term1053);
        setField(term1050, term1050.getClass(), "reverseMap", term1058);
        setField(term1050, term1050.getClass(), "pointer", null);
        setBooleanField(term1050, term1050.getClass(), "sealed", false);
        setField(term1049, term1049.getClass(), "parent", term1050);
        setField(term1049, term1049.getClass(), "namespaceMap", term1064);
        setField(term1049, term1049.getClass(), "reverseMap", term1069);
        setField(term1049, term1049.getClass(), "pointer", null);
        setBooleanField(term1049, term1049.getClass(), "sealed", false);
        setField(term1048, term1048.getClass(), "parent", term1049);
        setField(term1048, term1048.getClass(), "namespaceMap", term1075);
        setField(term1048, term1048.getClass(), "reverseMap", term1080);
        setField(term1048, term1048.getClass(), "pointer", null);
        setBooleanField(term1048, term1048.getClass(), "sealed", false);
        setField(term1018, term1018.getClass(), "localNamespaceResolver", term1048);
        setIntField(term1018, term1018.getClass(), "index", 1227103734);
        setBooleanField(term1018, term1018.getClass(), "attribute", true);
        setField(term1088, term1088.getClass(), "parent", null);
        setField(term1088, term1088.getClass(), "namespaceMap", term1089);
        setField(term1088, term1088.getClass(), "reverseMap", term1094);
        setField(term1088, term1088.getClass(), "pointer", null);
        setBooleanField(term1088, term1088.getClass(), "sealed", false);
        setField(term1018, term1018.getClass(), "namespaceResolver", term1088);
        setField(term1018, term1018.getClass(), "rootNode", term1100);
        setField(term1018, term1018.getClass(), "parent", null);
        setField(term1018, term1018.getClass(), "locale", null);
        HashMap term6841 = new HashMap();
        HashMap term6854 = new HashMap();
        HashMap term6855 = new HashMap();
        HashMap term6856 = new HashMap();
        HashMap term6857 = new HashMap();
        HashMap term6858 = new HashMap();
        HashMap term6859 = new HashMap();
        HashMap term6861 = new HashMap();
        HashMap term6862 = new HashMap();
        term6840 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term6850 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6851 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6852 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6853 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6860 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6863 = newInstance(Class.forName("java.lang.Object"));
        setField(term6840, term6840.getClass(), "node", null);
        setField(term6840, term6840.getClass(), "namespaces", term6841);
        setField(term6840, term6840.getClass(), "defaultNamespace", "eZFUvlxvGV");
        setField(term6840, term6840.getClass(), "id", "BYqFIqCKAV");
        setField(term6853, term6853.getClass(), "parent", null);
        setField(term6853, term6853.getClass(), "namespaceMap", null);
        setField(term6853, term6853.getClass(), "reverseMap", null);
        setField(term6853, term6853.getClass(), "pointer", null);
        setBooleanField(term6853, term6853.getClass(), "sealed", false);
        setField(term6852, term6852.getClass(), "parent", term6853);
        setField(term6852, term6852.getClass(), "namespaceMap", term6854);
        setField(term6852, term6852.getClass(), "reverseMap", term6855);
        setField(term6852, term6852.getClass(), "pointer", null);
        setBooleanField(term6852, term6852.getClass(), "sealed", false);
        setField(term6851, term6851.getClass(), "parent", term6852);
        setField(term6851, term6851.getClass(), "namespaceMap", term6856);
        setField(term6851, term6851.getClass(), "reverseMap", term6857);
        setField(term6851, term6851.getClass(), "pointer", null);
        setBooleanField(term6851, term6851.getClass(), "sealed", false);
        setField(term6850, term6850.getClass(), "parent", term6851);
        setField(term6850, term6850.getClass(), "namespaceMap", term6858);
        setField(term6850, term6850.getClass(), "reverseMap", term6859);
        setField(term6850, term6850.getClass(), "pointer", null);
        setBooleanField(term6850, term6850.getClass(), "sealed", false);
        setField(term6840, term6840.getClass(), "localNamespaceResolver", term6850);
        setIntField(term6840, term6840.getClass(), "index", 1227103734);
        setBooleanField(term6840, term6840.getClass(), "attribute", true);
        setField(term6860, term6860.getClass(), "parent", null);
        setField(term6860, term6860.getClass(), "namespaceMap", term6861);
        setField(term6860, term6860.getClass(), "reverseMap", term6862);
        setField(term6860, term6860.getClass(), "pointer", null);
        setBooleanField(term6860, term6860.getClass(), "sealed", false);
        setField(term6840, term6840.getClass(), "namespaceResolver", term6860);
        setField(term6840, term6840.getClass(), "rootNode", term6863);
        setField(term6840, term6840.getClass(), "parent", null);
        setField(term6840, term6840.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vrQLuWIDJX";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term1018, args);
        assertTrue(recursiveEquals(term1018, term6840));
        assertTrue(recursiveEquals(retValue, null));
    }

};


