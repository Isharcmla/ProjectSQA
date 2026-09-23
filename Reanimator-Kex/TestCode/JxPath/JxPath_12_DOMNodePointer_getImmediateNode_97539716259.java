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

public class DOMNodePointer_getImmediateNode_97539716259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1126;
     Object term6699;

    public DOMNodePointer_getImmediateNode_97539716259() {
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
        setBooleanField(term1162, term1162.getClass(), "sealed", false);
        setField(term1161, term1161.getClass(), "parent", term1162);
        setField(term1161, term1161.getClass(), "namespaceMap", term1164);
        setField(term1161, term1161.getClass(), "reverseMap", term1169);
        setField(term1161, term1161.getClass(), "pointer", null);
        setBooleanField(term1161, term1161.getClass(), "sealed", false);
        setField(term1160, term1160.getClass(), "parent", term1161);
        setField(term1160, term1160.getClass(), "namespaceMap", term1175);
        setField(term1160, term1160.getClass(), "reverseMap", term1180);
        setField(term1160, term1160.getClass(), "pointer", null);
        setBooleanField(term1160, term1160.getClass(), "sealed", false);
        setField(term1159, term1159.getClass(), "parent", term1160);
        setField(term1159, term1159.getClass(), "namespaceMap", term1186);
        setField(term1159, term1159.getClass(), "reverseMap", term1191);
        setField(term1159, term1159.getClass(), "pointer", null);
        setBooleanField(term1159, term1159.getClass(), "sealed", false);
        setField(term1126, term1126.getClass(), "namespaceResolver", term1159);
        setField(term1126, term1126.getClass(), "parent", null);
        setField(term1126, term1126.getClass(), "locale", null);
        HashMap term6700 = new HashMap();
        HashMap term6710 = new HashMap();
        HashMap term6711 = new HashMap();
        HashMap term6712 = new HashMap();
        HashMap term6713 = new HashMap();
        HashMap term6714 = new HashMap();
        HashMap term6715 = new HashMap();
        term6699 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term6705 = newInstance(Class.forName("java.lang.Object"));
        Object term6706 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6707 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6708 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6709 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6699, term6699.getClass(), "node", null);
        setField(term6699, term6699.getClass(), "namespaces", term6700);
        setField(term6699, term6699.getClass(), "defaultNamespace", "IoAlmYsBwc");
        setField(term6699, term6699.getClass(), "id", "TEParAifyi");
        setIntField(term6699, term6699.getClass(), "index", 1725571209);
        setBooleanField(term6699, term6699.getClass(), "attribute", true);
        setField(term6699, term6699.getClass(), "rootNode", term6705);
        setField(term6709, term6709.getClass(), "parent", null);
        setField(term6709, term6709.getClass(), "namespaceMap", null);
        setField(term6709, term6709.getClass(), "reverseMap", null);
        setField(term6709, term6709.getClass(), "pointer", null);
        setBooleanField(term6709, term6709.getClass(), "sealed", false);
        setField(term6708, term6708.getClass(), "parent", term6709);
        setField(term6708, term6708.getClass(), "namespaceMap", term6710);
        setField(term6708, term6708.getClass(), "reverseMap", term6711);
        setField(term6708, term6708.getClass(), "pointer", null);
        setBooleanField(term6708, term6708.getClass(), "sealed", false);
        setField(term6707, term6707.getClass(), "parent", term6708);
        setField(term6707, term6707.getClass(), "namespaceMap", term6712);
        setField(term6707, term6707.getClass(), "reverseMap", term6713);
        setField(term6707, term6707.getClass(), "pointer", null);
        setBooleanField(term6707, term6707.getClass(), "sealed", false);
        setField(term6706, term6706.getClass(), "parent", term6707);
        setField(term6706, term6706.getClass(), "namespaceMap", term6714);
        setField(term6706, term6706.getClass(), "reverseMap", term6715);
        setField(term6706, term6706.getClass(), "pointer", null);
        setBooleanField(term6706, term6706.getClass(), "sealed", false);
        setField(term6699, term6699.getClass(), "namespaceResolver", term6706);
        setField(term6699, term6699.getClass(), "parent", null);
        setField(term6699, term6699.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImmediateNode", argTypes, term1126, args);
        assertTrue(recursiveEquals(term1126, term6699));
        assertTrue(recursiveEquals(retValue, null));
    }

};


