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
     Object term1035;
     Object term6549;

    public DOMNodePointer_getBaseValue_59766853557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1036 = new HashMap();
        HashMap term1073 = new HashMap();
        HashMap term1078 = new HashMap();
        HashMap term1084 = new HashMap();
        HashMap term1089 = new HashMap();
        HashMap term1095 = new HashMap();
        HashMap term1100 = new HashMap();
        term1035 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1067 = newInstance(Class.forName("java.lang.Object"));
        Object term1068 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1069 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1070 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1071 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1035, term1035.getClass(), "node", null);
        setField(term1035, term1035.getClass(), "namespaces", term1036);
        setField(term1035, term1035.getClass(), "defaultNamespace", "flxyYxBRtu");
        setField(term1035, term1035.getClass(), "id", "OclPbYPkcH");
        setIntField(term1035, term1035.getClass(), "index", -1339778481);
        setBooleanField(term1035, term1035.getClass(), "attribute", false);
        setField(term1035, term1035.getClass(), "rootNode", term1067);
        setField(term1071, term1071.getClass(), "parent", null);
        setField(term1071, term1071.getClass(), "namespaceMap", null);
        setField(term1071, term1071.getClass(), "reverseMap", null);
        setField(term1071, term1071.getClass(), "pointer", null);
        setField(term1071, term1071.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1071, term1071.getClass(), "sealed", false);
        setField(term1070, term1070.getClass(), "parent", term1071);
        setField(term1070, term1070.getClass(), "namespaceMap", term1073);
        setField(term1070, term1070.getClass(), "reverseMap", term1078);
        setField(term1070, term1070.getClass(), "pointer", null);
        setField(term1070, term1070.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1070, term1070.getClass(), "sealed", false);
        setField(term1069, term1069.getClass(), "parent", term1070);
        setField(term1069, term1069.getClass(), "namespaceMap", term1084);
        setField(term1069, term1069.getClass(), "reverseMap", term1089);
        setField(term1069, term1069.getClass(), "pointer", null);
        setField(term1069, term1069.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1069, term1069.getClass(), "sealed", false);
        setField(term1068, term1068.getClass(), "parent", term1069);
        setField(term1068, term1068.getClass(), "namespaceMap", term1095);
        setField(term1068, term1068.getClass(), "reverseMap", term1100);
        setField(term1068, term1068.getClass(), "pointer", null);
        setField(term1068, term1068.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1068, term1068.getClass(), "sealed", false);
        setField(term1035, term1035.getClass(), "namespaceResolver", term1068);
        setField(term1035, term1035.getClass(), "parent", null);
        setField(term1035, term1035.getClass(), "locale", null);
        HashMap term6550 = new HashMap();
        HashMap term6560 = new HashMap();
        HashMap term6561 = new HashMap();
        HashMap term6562 = new HashMap();
        HashMap term6563 = new HashMap();
        HashMap term6564 = new HashMap();
        HashMap term6565 = new HashMap();
        term6549 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term6555 = newInstance(Class.forName("java.lang.Object"));
        Object term6556 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6557 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6558 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6559 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6549, term6549.getClass(), "node", null);
        setField(term6549, term6549.getClass(), "namespaces", term6550);
        setField(term6549, term6549.getClass(), "defaultNamespace", "flxyYxBRtu");
        setField(term6549, term6549.getClass(), "id", "OclPbYPkcH");
        setIntField(term6549, term6549.getClass(), "index", -1339778481);
        setBooleanField(term6549, term6549.getClass(), "attribute", false);
        setField(term6549, term6549.getClass(), "rootNode", term6555);
        setField(term6559, term6559.getClass(), "parent", null);
        setField(term6559, term6559.getClass(), "namespaceMap", null);
        setField(term6559, term6559.getClass(), "reverseMap", null);
        setField(term6559, term6559.getClass(), "pointer", null);
        setField(term6559, term6559.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6559, term6559.getClass(), "sealed", false);
        setField(term6558, term6558.getClass(), "parent", term6559);
        setField(term6558, term6558.getClass(), "namespaceMap", term6560);
        setField(term6558, term6558.getClass(), "reverseMap", term6561);
        setField(term6558, term6558.getClass(), "pointer", null);
        setField(term6558, term6558.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6558, term6558.getClass(), "sealed", false);
        setField(term6557, term6557.getClass(), "parent", term6558);
        setField(term6557, term6557.getClass(), "namespaceMap", term6562);
        setField(term6557, term6557.getClass(), "reverseMap", term6563);
        setField(term6557, term6557.getClass(), "pointer", null);
        setField(term6557, term6557.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6557, term6557.getClass(), "sealed", false);
        setField(term6556, term6556.getClass(), "parent", term6557);
        setField(term6556, term6556.getClass(), "namespaceMap", term6564);
        setField(term6556, term6556.getClass(), "reverseMap", term6565);
        setField(term6556, term6556.getClass(), "pointer", null);
        setField(term6556, term6556.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6556, term6556.getClass(), "sealed", false);
        setField(term6549, term6549.getClass(), "namespaceResolver", term6556);
        setField(term6549, term6549.getClass(), "parent", null);
        setField(term6549, term6549.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getBaseValue", argTypes, term1035, args);
        assertTrue(recursiveEquals(term1035, term6549));
        assertTrue(recursiveEquals(retValue, null));
    }

};


