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
     Object term1126;
     Object term6677;

    public DOMNodePointer_getImmediateNode_97539716258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1127 = new HashMap();
        HashMap term1164 = new HashMap();
        HashMap term1169 = new HashMap();
        HashMap term1175 = new HashMap();
        HashMap term1180 = new HashMap();
        HashMap term1186 = new HashMap();
        HashMap term1191 = new HashMap();
        term1126 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1158 = newInstance(Class.forName("java.lang.Object"));
        Object term1159 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1160 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1161 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1162 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1126, term1126.getClass(), "node", null);
        setField(term1126, term1126.getClass(), "namespaces", term1127);
        setField(term1126, term1126.getClass(), "defaultNamespace", "IoAlmYsBwc");
        setField(term1126, term1126.getClass(), "id", "TEParAifyi");
        setIntField(term1126, term1126.getClass(), "index", 1725571209);
        setBooleanField(term1126, term1126.getClass(), "attribute", true);
        setField(term1126, term1126.getClass(), "rootNode", term1158);
        setField(term1162, term1162.getClass(), "parent", null);
        setField(term1162, term1162.getClass(), "namespaceMap", null);
        setField(term1162, term1162.getClass(), "reverseMap", null);
        setField(term1162, term1162.getClass(), "pointer", null);
        setField(term1162, term1162.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1162, term1162.getClass(), "sealed", false);
        setField(term1161, term1161.getClass(), "parent", term1162);
        setField(term1161, term1161.getClass(), "namespaceMap", term1164);
        setField(term1161, term1161.getClass(), "reverseMap", term1169);
        setField(term1161, term1161.getClass(), "pointer", null);
        setField(term1161, term1161.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1161, term1161.getClass(), "sealed", false);
        setField(term1160, term1160.getClass(), "parent", term1161);
        setField(term1160, term1160.getClass(), "namespaceMap", term1175);
        setField(term1160, term1160.getClass(), "reverseMap", term1180);
        setField(term1160, term1160.getClass(), "pointer", null);
        setField(term1160, term1160.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1160, term1160.getClass(), "sealed", false);
        setField(term1159, term1159.getClass(), "parent", term1160);
        setField(term1159, term1159.getClass(), "namespaceMap", term1186);
        setField(term1159, term1159.getClass(), "reverseMap", term1191);
        setField(term1159, term1159.getClass(), "pointer", null);
        setField(term1159, term1159.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1159, term1159.getClass(), "sealed", false);
        setField(term1126, term1126.getClass(), "namespaceResolver", term1159);
        setField(term1126, term1126.getClass(), "parent", null);
        setField(term1126, term1126.getClass(), "locale", null);
        HashMap term6678 = new HashMap();
        HashMap term6688 = new HashMap();
        HashMap term6689 = new HashMap();
        HashMap term6690 = new HashMap();
        HashMap term6691 = new HashMap();
        HashMap term6692 = new HashMap();
        HashMap term6693 = new HashMap();
        term6677 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term6683 = newInstance(Class.forName("java.lang.Object"));
        Object term6684 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6685 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6686 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6687 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6677, term6677.getClass(), "node", null);
        setField(term6677, term6677.getClass(), "namespaces", term6678);
        setField(term6677, term6677.getClass(), "defaultNamespace", "IoAlmYsBwc");
        setField(term6677, term6677.getClass(), "id", "TEParAifyi");
        setIntField(term6677, term6677.getClass(), "index", 1725571209);
        setBooleanField(term6677, term6677.getClass(), "attribute", true);
        setField(term6677, term6677.getClass(), "rootNode", term6683);
        setField(term6687, term6687.getClass(), "parent", null);
        setField(term6687, term6687.getClass(), "namespaceMap", null);
        setField(term6687, term6687.getClass(), "reverseMap", null);
        setField(term6687, term6687.getClass(), "pointer", null);
        setField(term6687, term6687.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6687, term6687.getClass(), "sealed", false);
        setField(term6686, term6686.getClass(), "parent", term6687);
        setField(term6686, term6686.getClass(), "namespaceMap", term6688);
        setField(term6686, term6686.getClass(), "reverseMap", term6689);
        setField(term6686, term6686.getClass(), "pointer", null);
        setField(term6686, term6686.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6686, term6686.getClass(), "sealed", false);
        setField(term6685, term6685.getClass(), "parent", term6686);
        setField(term6685, term6685.getClass(), "namespaceMap", term6690);
        setField(term6685, term6685.getClass(), "reverseMap", term6691);
        setField(term6685, term6685.getClass(), "pointer", null);
        setField(term6685, term6685.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6685, term6685.getClass(), "sealed", false);
        setField(term6684, term6684.getClass(), "parent", term6685);
        setField(term6684, term6684.getClass(), "namespaceMap", term6692);
        setField(term6684, term6684.getClass(), "reverseMap", term6693);
        setField(term6684, term6684.getClass(), "pointer", null);
        setField(term6684, term6684.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6684, term6684.getClass(), "sealed", false);
        setField(term6677, term6677.getClass(), "namespaceResolver", term6684);
        setField(term6677, term6677.getClass(), "parent", null);
        setField(term6677, term6677.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImmediateNode", argTypes, term1126, args);
        assertTrue(recursiveEquals(term1126, term6677));
        assertTrue(recursiveEquals(retValue, null));
    }

};


