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

public class DOMNodePointer_getNamespaceURI_79575645157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1010;
     Object term6889;

    public DOMNodePointer_getNamespaceURI_79575645157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1011 = new HashMap();
        HashMap term1045 = new HashMap();
        HashMap term1050 = new HashMap();
        HashMap term1056 = new HashMap();
        HashMap term1061 = new HashMap();
        HashMap term1067 = new HashMap();
        HashMap term1072 = new HashMap();
        HashMap term1081 = new HashMap();
        HashMap term1086 = new HashMap();
        term1010 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1040 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1041 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1042 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1043 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1080 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1010, term1010.getClass(), "node", null);
        setField(term1010, term1010.getClass(), "namespaces", term1011);
        setField(term1010, term1010.getClass(), "defaultNamespace", "eZFUvlxvGV");
        setField(term1010, term1010.getClass(), "id", "BYqFIqCKAV");
        setField(term1043, term1043.getClass(), "parent", null);
        setField(term1043, term1043.getClass(), "namespaceMap", null);
        setField(term1043, term1043.getClass(), "reverseMap", null);
        setField(term1043, term1043.getClass(), "pointer", null);
        setBooleanField(term1043, term1043.getClass(), "sealed", false);
        setField(term1042, term1042.getClass(), "parent", term1043);
        setField(term1042, term1042.getClass(), "namespaceMap", term1045);
        setField(term1042, term1042.getClass(), "reverseMap", term1050);
        setField(term1042, term1042.getClass(), "pointer", null);
        setBooleanField(term1042, term1042.getClass(), "sealed", false);
        setField(term1041, term1041.getClass(), "parent", term1042);
        setField(term1041, term1041.getClass(), "namespaceMap", term1056);
        setField(term1041, term1041.getClass(), "reverseMap", term1061);
        setField(term1041, term1041.getClass(), "pointer", null);
        setBooleanField(term1041, term1041.getClass(), "sealed", false);
        setField(term1040, term1040.getClass(), "parent", term1041);
        setField(term1040, term1040.getClass(), "namespaceMap", term1067);
        setField(term1040, term1040.getClass(), "reverseMap", term1072);
        setField(term1040, term1040.getClass(), "pointer", null);
        setBooleanField(term1040, term1040.getClass(), "sealed", false);
        setField(term1010, term1010.getClass(), "localNamespaceResolver", term1040);
        setIntField(term1010, term1010.getClass(), "index", 1227103734);
        setBooleanField(term1010, term1010.getClass(), "attribute", true);
        setField(term1080, term1080.getClass(), "parent", null);
        setField(term1080, term1080.getClass(), "namespaceMap", term1081);
        setField(term1080, term1080.getClass(), "reverseMap", term1086);
        setField(term1080, term1080.getClass(), "pointer", null);
        setBooleanField(term1080, term1080.getClass(), "sealed", false);
        setField(term1010, term1010.getClass(), "namespaceResolver", term1080);
        setField(term1010, term1010.getClass(), "exceptionHandler", null);
        setField(term1010, term1010.getClass(), "rootNode", null);
        setField(term1010, term1010.getClass(), "parent", null);
        setField(term1010, term1010.getClass(), "locale", null);
        HashMap term6890 = new HashMap();
        HashMap term6903 = new HashMap();
        HashMap term6904 = new HashMap();
        HashMap term6905 = new HashMap();
        HashMap term6906 = new HashMap();
        HashMap term6907 = new HashMap();
        HashMap term6908 = new HashMap();
        HashMap term6910 = new HashMap();
        HashMap term6911 = new HashMap();
        term6889 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term6899 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6900 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6901 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6902 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6909 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6889, term6889.getClass(), "node", null);
        setField(term6889, term6889.getClass(), "namespaces", term6890);
        setField(term6889, term6889.getClass(), "defaultNamespace", "eZFUvlxvGV");
        setField(term6889, term6889.getClass(), "id", "BYqFIqCKAV");
        setField(term6902, term6902.getClass(), "parent", null);
        setField(term6902, term6902.getClass(), "namespaceMap", null);
        setField(term6902, term6902.getClass(), "reverseMap", null);
        setField(term6902, term6902.getClass(), "pointer", null);
        setBooleanField(term6902, term6902.getClass(), "sealed", false);
        setField(term6901, term6901.getClass(), "parent", term6902);
        setField(term6901, term6901.getClass(), "namespaceMap", term6903);
        setField(term6901, term6901.getClass(), "reverseMap", term6904);
        setField(term6901, term6901.getClass(), "pointer", null);
        setBooleanField(term6901, term6901.getClass(), "sealed", false);
        setField(term6900, term6900.getClass(), "parent", term6901);
        setField(term6900, term6900.getClass(), "namespaceMap", term6905);
        setField(term6900, term6900.getClass(), "reverseMap", term6906);
        setField(term6900, term6900.getClass(), "pointer", null);
        setBooleanField(term6900, term6900.getClass(), "sealed", false);
        setField(term6899, term6899.getClass(), "parent", term6900);
        setField(term6899, term6899.getClass(), "namespaceMap", term6907);
        setField(term6899, term6899.getClass(), "reverseMap", term6908);
        setField(term6899, term6899.getClass(), "pointer", null);
        setBooleanField(term6899, term6899.getClass(), "sealed", false);
        setField(term6889, term6889.getClass(), "localNamespaceResolver", term6899);
        setIntField(term6889, term6889.getClass(), "index", 1227103734);
        setBooleanField(term6889, term6889.getClass(), "attribute", true);
        setField(term6909, term6909.getClass(), "parent", null);
        setField(term6909, term6909.getClass(), "namespaceMap", term6910);
        setField(term6909, term6909.getClass(), "reverseMap", term6911);
        setField(term6909, term6909.getClass(), "pointer", null);
        setBooleanField(term6909, term6909.getClass(), "sealed", false);
        setField(term6889, term6889.getClass(), "namespaceResolver", term6909);
        setField(term6889, term6889.getClass(), "exceptionHandler", null);
        setField(term6889, term6889.getClass(), "rootNode", null);
        setField(term6889, term6889.getClass(), "parent", null);
        setField(term6889, term6889.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vrQLuWIDJX";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term1010, args);
        assertTrue(recursiveEquals(term1010, term6889));
        assertTrue(recursiveEquals(retValue, null));
    }

};


