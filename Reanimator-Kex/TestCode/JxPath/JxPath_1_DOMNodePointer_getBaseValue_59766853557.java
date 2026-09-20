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

public class DOMNodePointer_getBaseValue_59766853557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1013;
     Object term6452;

    public DOMNodePointer_getBaseValue_59766853557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1014 = new HashMap();
        HashMap term1051 = new HashMap();
        HashMap term1056 = new HashMap();
        HashMap term1062 = new HashMap();
        HashMap term1067 = new HashMap();
        HashMap term1073 = new HashMap();
        HashMap term1078 = new HashMap();
        term1013 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1045 = newInstance(Class.forName("java.lang.Object"));
        Object term1046 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1047 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1048 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1049 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1013, term1013.getClass(), "node", null);
        setField(term1013, term1013.getClass(), "namespaces", term1014);
        setField(term1013, term1013.getClass(), "defaultNamespace", "vrQLuWIDJX");
        setField(term1013, term1013.getClass(), "id", "flxyYxBRtu");
        setIntField(term1013, term1013.getClass(), "index", -1339778481);
        setBooleanField(term1013, term1013.getClass(), "attribute", false);
        setField(term1013, term1013.getClass(), "rootNode", term1045);
        setField(term1049, term1049.getClass(), "parent", null);
        setField(term1049, term1049.getClass(), "namespaceMap", null);
        setField(term1049, term1049.getClass(), "reverseMap", null);
        setField(term1049, term1049.getClass(), "pointer", null);
        setField(term1049, term1049.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1049, term1049.getClass(), "sealed", false);
        setField(term1048, term1048.getClass(), "parent", term1049);
        setField(term1048, term1048.getClass(), "namespaceMap", term1051);
        setField(term1048, term1048.getClass(), "reverseMap", term1056);
        setField(term1048, term1048.getClass(), "pointer", null);
        setField(term1048, term1048.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1048, term1048.getClass(), "sealed", false);
        setField(term1047, term1047.getClass(), "parent", term1048);
        setField(term1047, term1047.getClass(), "namespaceMap", term1062);
        setField(term1047, term1047.getClass(), "reverseMap", term1067);
        setField(term1047, term1047.getClass(), "pointer", null);
        setField(term1047, term1047.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1047, term1047.getClass(), "sealed", false);
        setField(term1046, term1046.getClass(), "parent", term1047);
        setField(term1046, term1046.getClass(), "namespaceMap", term1073);
        setField(term1046, term1046.getClass(), "reverseMap", term1078);
        setField(term1046, term1046.getClass(), "pointer", null);
        setField(term1046, term1046.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1046, term1046.getClass(), "sealed", false);
        setField(term1013, term1013.getClass(), "namespaceResolver", term1046);
        setField(term1013, term1013.getClass(), "parent", null);
        setField(term1013, term1013.getClass(), "locale", null);
        HashMap term6453 = new HashMap();
        HashMap term6463 = new HashMap();
        HashMap term6464 = new HashMap();
        HashMap term6465 = new HashMap();
        HashMap term6466 = new HashMap();
        HashMap term6467 = new HashMap();
        HashMap term6468 = new HashMap();
        term6452 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term6458 = newInstance(Class.forName("java.lang.Object"));
        Object term6459 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6460 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6461 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6462 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6452, term6452.getClass(), "node", null);
        setField(term6452, term6452.getClass(), "namespaces", term6453);
        setField(term6452, term6452.getClass(), "defaultNamespace", "vrQLuWIDJX");
        setField(term6452, term6452.getClass(), "id", "flxyYxBRtu");
        setIntField(term6452, term6452.getClass(), "index", -1339778481);
        setBooleanField(term6452, term6452.getClass(), "attribute", false);
        setField(term6452, term6452.getClass(), "rootNode", term6458);
        setField(term6462, term6462.getClass(), "parent", null);
        setField(term6462, term6462.getClass(), "namespaceMap", null);
        setField(term6462, term6462.getClass(), "reverseMap", null);
        setField(term6462, term6462.getClass(), "pointer", null);
        setField(term6462, term6462.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6462, term6462.getClass(), "sealed", false);
        setField(term6461, term6461.getClass(), "parent", term6462);
        setField(term6461, term6461.getClass(), "namespaceMap", term6463);
        setField(term6461, term6461.getClass(), "reverseMap", term6464);
        setField(term6461, term6461.getClass(), "pointer", null);
        setField(term6461, term6461.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6461, term6461.getClass(), "sealed", false);
        setField(term6460, term6460.getClass(), "parent", term6461);
        setField(term6460, term6460.getClass(), "namespaceMap", term6465);
        setField(term6460, term6460.getClass(), "reverseMap", term6466);
        setField(term6460, term6460.getClass(), "pointer", null);
        setField(term6460, term6460.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6460, term6460.getClass(), "sealed", false);
        setField(term6459, term6459.getClass(), "parent", term6460);
        setField(term6459, term6459.getClass(), "namespaceMap", term6467);
        setField(term6459, term6459.getClass(), "reverseMap", term6468);
        setField(term6459, term6459.getClass(), "pointer", null);
        setField(term6459, term6459.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6459, term6459.getClass(), "sealed", false);
        setField(term6452, term6452.getClass(), "namespaceResolver", term6459);
        setField(term6452, term6452.getClass(), "parent", null);
        setField(term6452, term6452.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getBaseValue", argTypes, term1013, args);
        assertTrue(recursiveEquals(term1013, term6452));
        assertTrue(recursiveEquals(retValue, null));
    }

};
