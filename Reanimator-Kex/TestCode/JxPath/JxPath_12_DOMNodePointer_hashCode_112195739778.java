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

public class DOMNodePointer_hashCode_112195739778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3059;
     Object term11684;

    public DOMNodePointer_hashCode_112195739778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3060 = new HashMap();
        HashMap term3097 = new HashMap();
        HashMap term3102 = new HashMap();
        HashMap term3108 = new HashMap();
        HashMap term3113 = new HashMap();
        HashMap term3119 = new HashMap();
        HashMap term3124 = new HashMap();
        term3059 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3091 = newInstance(Class.forName("java.lang.Object"));
        Object term3092 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3093 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3094 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3095 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3059, term3059.getClass(), "node", null);
        setField(term3059, term3059.getClass(), "namespaces", term3060);
        setField(term3059, term3059.getClass(), "defaultNamespace", "vQVyKLdtaz");
        setField(term3059, term3059.getClass(), "id", "OWKQODBLzb");
        setIntField(term3059, term3059.getClass(), "index", -203030934);
        setBooleanField(term3059, term3059.getClass(), "attribute", true);
        setField(term3059, term3059.getClass(), "rootNode", term3091);
        setField(term3095, term3095.getClass(), "parent", null);
        setField(term3095, term3095.getClass(), "namespaceMap", null);
        setField(term3095, term3095.getClass(), "reverseMap", null);
        setField(term3095, term3095.getClass(), "pointer", null);
        setBooleanField(term3095, term3095.getClass(), "sealed", false);
        setField(term3094, term3094.getClass(), "parent", term3095);
        setField(term3094, term3094.getClass(), "namespaceMap", term3097);
        setField(term3094, term3094.getClass(), "reverseMap", term3102);
        setField(term3094, term3094.getClass(), "pointer", null);
        setBooleanField(term3094, term3094.getClass(), "sealed", false);
        setField(term3093, term3093.getClass(), "parent", term3094);
        setField(term3093, term3093.getClass(), "namespaceMap", term3108);
        setField(term3093, term3093.getClass(), "reverseMap", term3113);
        setField(term3093, term3093.getClass(), "pointer", null);
        setBooleanField(term3093, term3093.getClass(), "sealed", false);
        setField(term3092, term3092.getClass(), "parent", term3093);
        setField(term3092, term3092.getClass(), "namespaceMap", term3119);
        setField(term3092, term3092.getClass(), "reverseMap", term3124);
        setField(term3092, term3092.getClass(), "pointer", null);
        setBooleanField(term3092, term3092.getClass(), "sealed", false);
        setField(term3059, term3059.getClass(), "namespaceResolver", term3092);
        setField(term3059, term3059.getClass(), "parent", null);
        setField(term3059, term3059.getClass(), "locale", null);
        HashMap term11685 = new HashMap();
        HashMap term11695 = new HashMap();
        HashMap term11696 = new HashMap();
        HashMap term11697 = new HashMap();
        HashMap term11698 = new HashMap();
        HashMap term11699 = new HashMap();
        HashMap term11700 = new HashMap();
        term11684 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term11690 = newInstance(Class.forName("java.lang.Object"));
        Object term11691 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11692 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11693 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11694 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term11684, term11684.getClass(), "node", null);
        setField(term11684, term11684.getClass(), "namespaces", term11685);
        setField(term11684, term11684.getClass(), "defaultNamespace", "vQVyKLdtaz");
        setField(term11684, term11684.getClass(), "id", "OWKQODBLzb");
        setIntField(term11684, term11684.getClass(), "index", -203030934);
        setBooleanField(term11684, term11684.getClass(), "attribute", true);
        setField(term11684, term11684.getClass(), "rootNode", term11690);
        setField(term11694, term11694.getClass(), "parent", null);
        setField(term11694, term11694.getClass(), "namespaceMap", null);
        setField(term11694, term11694.getClass(), "reverseMap", null);
        setField(term11694, term11694.getClass(), "pointer", null);
        setBooleanField(term11694, term11694.getClass(), "sealed", false);
        setField(term11693, term11693.getClass(), "parent", term11694);
        setField(term11693, term11693.getClass(), "namespaceMap", term11695);
        setField(term11693, term11693.getClass(), "reverseMap", term11696);
        setField(term11693, term11693.getClass(), "pointer", null);
        setBooleanField(term11693, term11693.getClass(), "sealed", false);
        setField(term11692, term11692.getClass(), "parent", term11693);
        setField(term11692, term11692.getClass(), "namespaceMap", term11697);
        setField(term11692, term11692.getClass(), "reverseMap", term11698);
        setField(term11692, term11692.getClass(), "pointer", null);
        setBooleanField(term11692, term11692.getClass(), "sealed", false);
        setField(term11691, term11691.getClass(), "parent", term11692);
        setField(term11691, term11691.getClass(), "namespaceMap", term11699);
        setField(term11691, term11691.getClass(), "reverseMap", term11700);
        setField(term11691, term11691.getClass(), "pointer", null);
        setBooleanField(term11691, term11691.getClass(), "sealed", false);
        setField(term11684, term11684.getClass(), "namespaceResolver", term11691);
        setField(term11684, term11684.getClass(), "parent", null);
        setField(term11684, term11684.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term3059, args);
        assertTrue(recursiveEquals(term3059, term11684));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


