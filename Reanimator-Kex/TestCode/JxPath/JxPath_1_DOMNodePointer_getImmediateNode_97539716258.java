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

public class DOMNodePointer_getImmediateNode_97539716258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1104;
     Object term6580;

    public DOMNodePointer_getImmediateNode_97539716258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1105 = new HashMap();
        HashMap term1142 = new HashMap();
        HashMap term1147 = new HashMap();
        HashMap term1153 = new HashMap();
        HashMap term1158 = new HashMap();
        HashMap term1164 = new HashMap();
        HashMap term1169 = new HashMap();
        term1104 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1136 = newInstance(Class.forName("java.lang.Object"));
        Object term1137 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1138 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1139 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1140 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1104, term1104.getClass(), "node", null);
        setField(term1104, term1104.getClass(), "namespaces", term1105);
        setField(term1104, term1104.getClass(), "defaultNamespace", "OclPbYPkcH");
        setField(term1104, term1104.getClass(), "id", "IoAlmYsBwc");
        setIntField(term1104, term1104.getClass(), "index", 1725571209);
        setBooleanField(term1104, term1104.getClass(), "attribute", true);
        setField(term1104, term1104.getClass(), "rootNode", term1136);
        setField(term1140, term1140.getClass(), "parent", null);
        setField(term1140, term1140.getClass(), "namespaceMap", null);
        setField(term1140, term1140.getClass(), "reverseMap", null);
        setField(term1140, term1140.getClass(), "pointer", null);
        setField(term1140, term1140.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1140, term1140.getClass(), "sealed", false);
        setField(term1139, term1139.getClass(), "parent", term1140);
        setField(term1139, term1139.getClass(), "namespaceMap", term1142);
        setField(term1139, term1139.getClass(), "reverseMap", term1147);
        setField(term1139, term1139.getClass(), "pointer", null);
        setField(term1139, term1139.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1139, term1139.getClass(), "sealed", false);
        setField(term1138, term1138.getClass(), "parent", term1139);
        setField(term1138, term1138.getClass(), "namespaceMap", term1153);
        setField(term1138, term1138.getClass(), "reverseMap", term1158);
        setField(term1138, term1138.getClass(), "pointer", null);
        setField(term1138, term1138.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1138, term1138.getClass(), "sealed", false);
        setField(term1137, term1137.getClass(), "parent", term1138);
        setField(term1137, term1137.getClass(), "namespaceMap", term1164);
        setField(term1137, term1137.getClass(), "reverseMap", term1169);
        setField(term1137, term1137.getClass(), "pointer", null);
        setField(term1137, term1137.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1137, term1137.getClass(), "sealed", false);
        setField(term1104, term1104.getClass(), "namespaceResolver", term1137);
        setField(term1104, term1104.getClass(), "parent", null);
        setField(term1104, term1104.getClass(), "locale", null);
        HashMap term6581 = new HashMap();
        HashMap term6591 = new HashMap();
        HashMap term6592 = new HashMap();
        HashMap term6593 = new HashMap();
        HashMap term6594 = new HashMap();
        HashMap term6595 = new HashMap();
        HashMap term6596 = new HashMap();
        term6580 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term6586 = newInstance(Class.forName("java.lang.Object"));
        Object term6587 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6588 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6589 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6590 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6580, term6580.getClass(), "node", null);
        setField(term6580, term6580.getClass(), "namespaces", term6581);
        setField(term6580, term6580.getClass(), "defaultNamespace", "OclPbYPkcH");
        setField(term6580, term6580.getClass(), "id", "IoAlmYsBwc");
        setIntField(term6580, term6580.getClass(), "index", 1725571209);
        setBooleanField(term6580, term6580.getClass(), "attribute", true);
        setField(term6580, term6580.getClass(), "rootNode", term6586);
        setField(term6590, term6590.getClass(), "parent", null);
        setField(term6590, term6590.getClass(), "namespaceMap", null);
        setField(term6590, term6590.getClass(), "reverseMap", null);
        setField(term6590, term6590.getClass(), "pointer", null);
        setField(term6590, term6590.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6590, term6590.getClass(), "sealed", false);
        setField(term6589, term6589.getClass(), "parent", term6590);
        setField(term6589, term6589.getClass(), "namespaceMap", term6591);
        setField(term6589, term6589.getClass(), "reverseMap", term6592);
        setField(term6589, term6589.getClass(), "pointer", null);
        setField(term6589, term6589.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6589, term6589.getClass(), "sealed", false);
        setField(term6588, term6588.getClass(), "parent", term6589);
        setField(term6588, term6588.getClass(), "namespaceMap", term6593);
        setField(term6588, term6588.getClass(), "reverseMap", term6594);
        setField(term6588, term6588.getClass(), "pointer", null);
        setField(term6588, term6588.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6588, term6588.getClass(), "sealed", false);
        setField(term6587, term6587.getClass(), "parent", term6588);
        setField(term6587, term6587.getClass(), "namespaceMap", term6595);
        setField(term6587, term6587.getClass(), "reverseMap", term6596);
        setField(term6587, term6587.getClass(), "pointer", null);
        setField(term6587, term6587.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6587, term6587.getClass(), "sealed", false);
        setField(term6580, term6580.getClass(), "namespaceResolver", term6587);
        setField(term6580, term6580.getClass(), "parent", null);
        setField(term6580, term6580.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImmediateNode", argTypes, term1104, args);
        assertTrue(recursiveEquals(term1104, term6580));
        assertTrue(recursiveEquals(retValue, null));
    }

};
