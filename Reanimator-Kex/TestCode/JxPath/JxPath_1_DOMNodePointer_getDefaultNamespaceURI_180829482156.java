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

public class DOMNodePointer_getDefaultNamespaceURI_180829482156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term922;
     Object term6314;

    public DOMNodePointer_getDefaultNamespaceURI_180829482156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term923 = new HashMap();
        HashMap term960 = new HashMap();
        HashMap term965 = new HashMap();
        HashMap term971 = new HashMap();
        HashMap term976 = new HashMap();
        HashMap term982 = new HashMap();
        HashMap term987 = new HashMap();
        term922 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term954 = newInstance(Class.forName("java.lang.Object"));
        Object term955 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term956 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term957 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term958 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term922, term922.getClass(), "node", null);
        setField(term922, term922.getClass(), "namespaces", term923);
        setField(term922, term922.getClass(), "defaultNamespace", "eZFUvlxvGV");
        setField(term922, term922.getClass(), "id", "BYqFIqCKAV");
        setIntField(term922, term922.getClass(), "index", 1227103734);
        setBooleanField(term922, term922.getClass(), "attribute", true);
        setField(term922, term922.getClass(), "rootNode", term954);
        setField(term958, term958.getClass(), "parent", null);
        setField(term958, term958.getClass(), "namespaceMap", null);
        setField(term958, term958.getClass(), "reverseMap", null);
        setField(term958, term958.getClass(), "pointer", null);
        setField(term958, term958.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term958, term958.getClass(), "sealed", false);
        setField(term957, term957.getClass(), "parent", term958);
        setField(term957, term957.getClass(), "namespaceMap", term960);
        setField(term957, term957.getClass(), "reverseMap", term965);
        setField(term957, term957.getClass(), "pointer", null);
        setField(term957, term957.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term957, term957.getClass(), "sealed", false);
        setField(term956, term956.getClass(), "parent", term957);
        setField(term956, term956.getClass(), "namespaceMap", term971);
        setField(term956, term956.getClass(), "reverseMap", term976);
        setField(term956, term956.getClass(), "pointer", null);
        setField(term956, term956.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term956, term956.getClass(), "sealed", false);
        setField(term955, term955.getClass(), "parent", term956);
        setField(term955, term955.getClass(), "namespaceMap", term982);
        setField(term955, term955.getClass(), "reverseMap", term987);
        setField(term955, term955.getClass(), "pointer", null);
        setField(term955, term955.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term955, term955.getClass(), "sealed", false);
        setField(term922, term922.getClass(), "namespaceResolver", term955);
        setField(term922, term922.getClass(), "parent", null);
        setField(term922, term922.getClass(), "locale", null);
        HashMap term6315 = new HashMap();
        HashMap term6325 = new HashMap();
        HashMap term6326 = new HashMap();
        HashMap term6327 = new HashMap();
        HashMap term6328 = new HashMap();
        HashMap term6329 = new HashMap();
        HashMap term6330 = new HashMap();
        term6314 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term6320 = newInstance(Class.forName("java.lang.Object"));
        Object term6321 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6322 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6323 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6324 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6314, term6314.getClass(), "node", null);
        setField(term6314, term6314.getClass(), "namespaces", term6315);
        setField(term6314, term6314.getClass(), "defaultNamespace", "eZFUvlxvGV");
        setField(term6314, term6314.getClass(), "id", "BYqFIqCKAV");
        setIntField(term6314, term6314.getClass(), "index", 1227103734);
        setBooleanField(term6314, term6314.getClass(), "attribute", true);
        setField(term6314, term6314.getClass(), "rootNode", term6320);
        setField(term6324, term6324.getClass(), "parent", null);
        setField(term6324, term6324.getClass(), "namespaceMap", null);
        setField(term6324, term6324.getClass(), "reverseMap", null);
        setField(term6324, term6324.getClass(), "pointer", null);
        setField(term6324, term6324.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6324, term6324.getClass(), "sealed", false);
        setField(term6323, term6323.getClass(), "parent", term6324);
        setField(term6323, term6323.getClass(), "namespaceMap", term6325);
        setField(term6323, term6323.getClass(), "reverseMap", term6326);
        setField(term6323, term6323.getClass(), "pointer", null);
        setField(term6323, term6323.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6323, term6323.getClass(), "sealed", false);
        setField(term6322, term6322.getClass(), "parent", term6323);
        setField(term6322, term6322.getClass(), "namespaceMap", term6327);
        setField(term6322, term6322.getClass(), "reverseMap", term6328);
        setField(term6322, term6322.getClass(), "pointer", null);
        setField(term6322, term6322.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6322, term6322.getClass(), "sealed", false);
        setField(term6321, term6321.getClass(), "parent", term6322);
        setField(term6321, term6321.getClass(), "namespaceMap", term6329);
        setField(term6321, term6321.getClass(), "reverseMap", term6330);
        setField(term6321, term6321.getClass(), "pointer", null);
        setField(term6321, term6321.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6321, term6321.getClass(), "sealed", false);
        setField(term6314, term6314.getClass(), "namespaceResolver", term6321);
        setField(term6314, term6314.getClass(), "parent", null);
        setField(term6314, term6314.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term922, args);
        assertTrue(recursiveEquals(term922, term6314));
        assertTrue(recursiveEquals(retValue, "eZFUvlxvGV"));
    }

};
