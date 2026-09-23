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

public class DOMNodePointer_getDefaultNamespaceURI_180829482157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term944;
     Object term6433;

    public DOMNodePointer_getDefaultNamespaceURI_180829482157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term945 = new HashMap();
        HashMap term982 = new HashMap();
        HashMap term987 = new HashMap();
        HashMap term993 = new HashMap();
        HashMap term998 = new HashMap();
        HashMap term1004 = new HashMap();
        HashMap term1009 = new HashMap();
        term944 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term976 = newInstance(Class.forName("java.lang.Object"));
        Object term977 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term978 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term979 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term980 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term944, term944.getClass(), "node", null);
        setField(term944, term944.getClass(), "namespaces", term945);
        setField(term944, term944.getClass(), "defaultNamespace", "BYqFIqCKAV");
        setField(term944, term944.getClass(), "id", "vrQLuWIDJX");
        setIntField(term944, term944.getClass(), "index", 1227103734);
        setBooleanField(term944, term944.getClass(), "attribute", true);
        setField(term944, term944.getClass(), "rootNode", term976);
        setField(term980, term980.getClass(), "parent", null);
        setField(term980, term980.getClass(), "namespaceMap", null);
        setField(term980, term980.getClass(), "reverseMap", null);
        setField(term980, term980.getClass(), "pointer", null);
        setBooleanField(term980, term980.getClass(), "sealed", false);
        setField(term979, term979.getClass(), "parent", term980);
        setField(term979, term979.getClass(), "namespaceMap", term982);
        setField(term979, term979.getClass(), "reverseMap", term987);
        setField(term979, term979.getClass(), "pointer", null);
        setBooleanField(term979, term979.getClass(), "sealed", false);
        setField(term978, term978.getClass(), "parent", term979);
        setField(term978, term978.getClass(), "namespaceMap", term993);
        setField(term978, term978.getClass(), "reverseMap", term998);
        setField(term978, term978.getClass(), "pointer", null);
        setBooleanField(term978, term978.getClass(), "sealed", false);
        setField(term977, term977.getClass(), "parent", term978);
        setField(term977, term977.getClass(), "namespaceMap", term1004);
        setField(term977, term977.getClass(), "reverseMap", term1009);
        setField(term977, term977.getClass(), "pointer", null);
        setBooleanField(term977, term977.getClass(), "sealed", false);
        setField(term944, term944.getClass(), "namespaceResolver", term977);
        setField(term944, term944.getClass(), "parent", null);
        setField(term944, term944.getClass(), "locale", null);
        HashMap term6434 = new HashMap();
        HashMap term6444 = new HashMap();
        HashMap term6445 = new HashMap();
        HashMap term6446 = new HashMap();
        HashMap term6447 = new HashMap();
        HashMap term6448 = new HashMap();
        HashMap term6449 = new HashMap();
        term6433 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term6439 = newInstance(Class.forName("java.lang.Object"));
        Object term6440 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6441 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6442 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6443 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6433, term6433.getClass(), "node", null);
        setField(term6433, term6433.getClass(), "namespaces", term6434);
        setField(term6433, term6433.getClass(), "defaultNamespace", "BYqFIqCKAV");
        setField(term6433, term6433.getClass(), "id", "vrQLuWIDJX");
        setIntField(term6433, term6433.getClass(), "index", 1227103734);
        setBooleanField(term6433, term6433.getClass(), "attribute", true);
        setField(term6433, term6433.getClass(), "rootNode", term6439);
        setField(term6443, term6443.getClass(), "parent", null);
        setField(term6443, term6443.getClass(), "namespaceMap", null);
        setField(term6443, term6443.getClass(), "reverseMap", null);
        setField(term6443, term6443.getClass(), "pointer", null);
        setBooleanField(term6443, term6443.getClass(), "sealed", false);
        setField(term6442, term6442.getClass(), "parent", term6443);
        setField(term6442, term6442.getClass(), "namespaceMap", term6444);
        setField(term6442, term6442.getClass(), "reverseMap", term6445);
        setField(term6442, term6442.getClass(), "pointer", null);
        setBooleanField(term6442, term6442.getClass(), "sealed", false);
        setField(term6441, term6441.getClass(), "parent", term6442);
        setField(term6441, term6441.getClass(), "namespaceMap", term6446);
        setField(term6441, term6441.getClass(), "reverseMap", term6447);
        setField(term6441, term6441.getClass(), "pointer", null);
        setBooleanField(term6441, term6441.getClass(), "sealed", false);
        setField(term6440, term6440.getClass(), "parent", term6441);
        setField(term6440, term6440.getClass(), "namespaceMap", term6448);
        setField(term6440, term6440.getClass(), "reverseMap", term6449);
        setField(term6440, term6440.getClass(), "pointer", null);
        setBooleanField(term6440, term6440.getClass(), "sealed", false);
        setField(term6433, term6433.getClass(), "namespaceResolver", term6440);
        setField(term6433, term6433.getClass(), "parent", null);
        setField(term6433, term6433.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term944, args);
        assertTrue(recursiveEquals(term944, term6433));
        assertTrue(recursiveEquals(retValue, "BYqFIqCKAV"));
    }

};


