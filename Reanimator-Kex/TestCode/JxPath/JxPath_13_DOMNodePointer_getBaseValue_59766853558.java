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

public class DOMNodePointer_getBaseValue_59766853558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1035;
     Object term6571;

    public DOMNodePointer_getBaseValue_59766853558() {
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
        setBooleanField(term1071, term1071.getClass(), "sealed", false);
        setField(term1070, term1070.getClass(), "parent", term1071);
        setField(term1070, term1070.getClass(), "namespaceMap", term1073);
        setField(term1070, term1070.getClass(), "reverseMap", term1078);
        setField(term1070, term1070.getClass(), "pointer", null);
        setBooleanField(term1070, term1070.getClass(), "sealed", false);
        setField(term1069, term1069.getClass(), "parent", term1070);
        setField(term1069, term1069.getClass(), "namespaceMap", term1084);
        setField(term1069, term1069.getClass(), "reverseMap", term1089);
        setField(term1069, term1069.getClass(), "pointer", null);
        setBooleanField(term1069, term1069.getClass(), "sealed", false);
        setField(term1068, term1068.getClass(), "parent", term1069);
        setField(term1068, term1068.getClass(), "namespaceMap", term1095);
        setField(term1068, term1068.getClass(), "reverseMap", term1100);
        setField(term1068, term1068.getClass(), "pointer", null);
        setBooleanField(term1068, term1068.getClass(), "sealed", false);
        setField(term1035, term1035.getClass(), "namespaceResolver", term1068);
        setField(term1035, term1035.getClass(), "parent", null);
        setField(term1035, term1035.getClass(), "locale", null);
        HashMap term6572 = new HashMap();
        HashMap term6582 = new HashMap();
        HashMap term6583 = new HashMap();
        HashMap term6584 = new HashMap();
        HashMap term6585 = new HashMap();
        HashMap term6586 = new HashMap();
        HashMap term6587 = new HashMap();
        term6571 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term6577 = newInstance(Class.forName("java.lang.Object"));
        Object term6578 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6579 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6580 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6581 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6571, term6571.getClass(), "node", null);
        setField(term6571, term6571.getClass(), "namespaces", term6572);
        setField(term6571, term6571.getClass(), "defaultNamespace", "flxyYxBRtu");
        setField(term6571, term6571.getClass(), "id", "OclPbYPkcH");
        setIntField(term6571, term6571.getClass(), "index", -1339778481);
        setBooleanField(term6571, term6571.getClass(), "attribute", false);
        setField(term6571, term6571.getClass(), "rootNode", term6577);
        setField(term6581, term6581.getClass(), "parent", null);
        setField(term6581, term6581.getClass(), "namespaceMap", null);
        setField(term6581, term6581.getClass(), "reverseMap", null);
        setField(term6581, term6581.getClass(), "pointer", null);
        setBooleanField(term6581, term6581.getClass(), "sealed", false);
        setField(term6580, term6580.getClass(), "parent", term6581);
        setField(term6580, term6580.getClass(), "namespaceMap", term6582);
        setField(term6580, term6580.getClass(), "reverseMap", term6583);
        setField(term6580, term6580.getClass(), "pointer", null);
        setBooleanField(term6580, term6580.getClass(), "sealed", false);
        setField(term6579, term6579.getClass(), "parent", term6580);
        setField(term6579, term6579.getClass(), "namespaceMap", term6584);
        setField(term6579, term6579.getClass(), "reverseMap", term6585);
        setField(term6579, term6579.getClass(), "pointer", null);
        setBooleanField(term6579, term6579.getClass(), "sealed", false);
        setField(term6578, term6578.getClass(), "parent", term6579);
        setField(term6578, term6578.getClass(), "namespaceMap", term6586);
        setField(term6578, term6578.getClass(), "reverseMap", term6587);
        setField(term6578, term6578.getClass(), "pointer", null);
        setBooleanField(term6578, term6578.getClass(), "sealed", false);
        setField(term6571, term6571.getClass(), "namespaceResolver", term6578);
        setField(term6571, term6571.getClass(), "parent", null);
        setField(term6571, term6571.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getBaseValue", argTypes, term1035, args);
        assertTrue(recursiveEquals(term1035, term6571));
        assertTrue(recursiveEquals(retValue, null));
    }

};


