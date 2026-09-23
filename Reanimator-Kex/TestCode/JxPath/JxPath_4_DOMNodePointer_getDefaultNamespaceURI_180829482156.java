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
     Object term944;
     Object term6411;

    public DOMNodePointer_getDefaultNamespaceURI_180829482156() {
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
        setField(term980, term980.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term980, term980.getClass(), "sealed", false);
        setField(term979, term979.getClass(), "parent", term980);
        setField(term979, term979.getClass(), "namespaceMap", term982);
        setField(term979, term979.getClass(), "reverseMap", term987);
        setField(term979, term979.getClass(), "pointer", null);
        setField(term979, term979.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term979, term979.getClass(), "sealed", false);
        setField(term978, term978.getClass(), "parent", term979);
        setField(term978, term978.getClass(), "namespaceMap", term993);
        setField(term978, term978.getClass(), "reverseMap", term998);
        setField(term978, term978.getClass(), "pointer", null);
        setField(term978, term978.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term978, term978.getClass(), "sealed", false);
        setField(term977, term977.getClass(), "parent", term978);
        setField(term977, term977.getClass(), "namespaceMap", term1004);
        setField(term977, term977.getClass(), "reverseMap", term1009);
        setField(term977, term977.getClass(), "pointer", null);
        setField(term977, term977.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term977, term977.getClass(), "sealed", false);
        setField(term944, term944.getClass(), "namespaceResolver", term977);
        setField(term944, term944.getClass(), "parent", null);
        setField(term944, term944.getClass(), "locale", null);
        HashMap term6412 = new HashMap();
        HashMap term6422 = new HashMap();
        HashMap term6423 = new HashMap();
        HashMap term6424 = new HashMap();
        HashMap term6425 = new HashMap();
        HashMap term6426 = new HashMap();
        HashMap term6427 = new HashMap();
        term6411 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term6417 = newInstance(Class.forName("java.lang.Object"));
        Object term6418 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6419 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6420 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6421 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6411, term6411.getClass(), "node", null);
        setField(term6411, term6411.getClass(), "namespaces", term6412);
        setField(term6411, term6411.getClass(), "defaultNamespace", "BYqFIqCKAV");
        setField(term6411, term6411.getClass(), "id", "vrQLuWIDJX");
        setIntField(term6411, term6411.getClass(), "index", 1227103734);
        setBooleanField(term6411, term6411.getClass(), "attribute", true);
        setField(term6411, term6411.getClass(), "rootNode", term6417);
        setField(term6421, term6421.getClass(), "parent", null);
        setField(term6421, term6421.getClass(), "namespaceMap", null);
        setField(term6421, term6421.getClass(), "reverseMap", null);
        setField(term6421, term6421.getClass(), "pointer", null);
        setField(term6421, term6421.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6421, term6421.getClass(), "sealed", false);
        setField(term6420, term6420.getClass(), "parent", term6421);
        setField(term6420, term6420.getClass(), "namespaceMap", term6422);
        setField(term6420, term6420.getClass(), "reverseMap", term6423);
        setField(term6420, term6420.getClass(), "pointer", null);
        setField(term6420, term6420.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6420, term6420.getClass(), "sealed", false);
        setField(term6419, term6419.getClass(), "parent", term6420);
        setField(term6419, term6419.getClass(), "namespaceMap", term6424);
        setField(term6419, term6419.getClass(), "reverseMap", term6425);
        setField(term6419, term6419.getClass(), "pointer", null);
        setField(term6419, term6419.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6419, term6419.getClass(), "sealed", false);
        setField(term6418, term6418.getClass(), "parent", term6419);
        setField(term6418, term6418.getClass(), "namespaceMap", term6426);
        setField(term6418, term6418.getClass(), "reverseMap", term6427);
        setField(term6418, term6418.getClass(), "pointer", null);
        setField(term6418, term6418.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6418, term6418.getClass(), "sealed", false);
        setField(term6411, term6411.getClass(), "namespaceResolver", term6418);
        setField(term6411, term6411.getClass(), "parent", null);
        setField(term6411, term6411.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term944, args);
        assertTrue(recursiveEquals(term944, term6411));
        assertTrue(recursiveEquals(retValue, "BYqFIqCKAV"));
    }

};


