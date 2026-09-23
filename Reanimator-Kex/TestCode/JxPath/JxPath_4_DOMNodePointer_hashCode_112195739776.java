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

public class DOMNodePointer_hashCode_112195739776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3037;
     Object term11607;

    public DOMNodePointer_hashCode_112195739776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3038 = new HashMap();
        HashMap term3075 = new HashMap();
        HashMap term3080 = new HashMap();
        HashMap term3086 = new HashMap();
        HashMap term3091 = new HashMap();
        HashMap term3097 = new HashMap();
        HashMap term3102 = new HashMap();
        term3037 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3069 = newInstance(Class.forName("java.lang.Object"));
        Object term3070 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3071 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3072 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3073 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3037, term3037.getClass(), "node", null);
        setField(term3037, term3037.getClass(), "namespaces", term3038);
        setField(term3037, term3037.getClass(), "defaultNamespace", "oVgzLbrsFr");
        setField(term3037, term3037.getClass(), "id", "vQVyKLdtaz");
        setIntField(term3037, term3037.getClass(), "index", -203030934);
        setBooleanField(term3037, term3037.getClass(), "attribute", true);
        setField(term3037, term3037.getClass(), "rootNode", term3069);
        setField(term3073, term3073.getClass(), "parent", null);
        setField(term3073, term3073.getClass(), "namespaceMap", null);
        setField(term3073, term3073.getClass(), "reverseMap", null);
        setField(term3073, term3073.getClass(), "pointer", null);
        setField(term3073, term3073.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3073, term3073.getClass(), "sealed", false);
        setField(term3072, term3072.getClass(), "parent", term3073);
        setField(term3072, term3072.getClass(), "namespaceMap", term3075);
        setField(term3072, term3072.getClass(), "reverseMap", term3080);
        setField(term3072, term3072.getClass(), "pointer", null);
        setField(term3072, term3072.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3072, term3072.getClass(), "sealed", false);
        setField(term3071, term3071.getClass(), "parent", term3072);
        setField(term3071, term3071.getClass(), "namespaceMap", term3086);
        setField(term3071, term3071.getClass(), "reverseMap", term3091);
        setField(term3071, term3071.getClass(), "pointer", null);
        setField(term3071, term3071.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3071, term3071.getClass(), "sealed", false);
        setField(term3070, term3070.getClass(), "parent", term3071);
        setField(term3070, term3070.getClass(), "namespaceMap", term3097);
        setField(term3070, term3070.getClass(), "reverseMap", term3102);
        setField(term3070, term3070.getClass(), "pointer", null);
        setField(term3070, term3070.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3070, term3070.getClass(), "sealed", false);
        setField(term3037, term3037.getClass(), "namespaceResolver", term3070);
        setField(term3037, term3037.getClass(), "parent", null);
        setField(term3037, term3037.getClass(), "locale", null);
        HashMap term11608 = new HashMap();
        HashMap term11618 = new HashMap();
        HashMap term11619 = new HashMap();
        HashMap term11620 = new HashMap();
        HashMap term11621 = new HashMap();
        HashMap term11622 = new HashMap();
        HashMap term11623 = new HashMap();
        term11607 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term11613 = newInstance(Class.forName("java.lang.Object"));
        Object term11614 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11615 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11616 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11617 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term11607, term11607.getClass(), "node", null);
        setField(term11607, term11607.getClass(), "namespaces", term11608);
        setField(term11607, term11607.getClass(), "defaultNamespace", "oVgzLbrsFr");
        setField(term11607, term11607.getClass(), "id", "vQVyKLdtaz");
        setIntField(term11607, term11607.getClass(), "index", -203030934);
        setBooleanField(term11607, term11607.getClass(), "attribute", true);
        setField(term11607, term11607.getClass(), "rootNode", term11613);
        setField(term11617, term11617.getClass(), "parent", null);
        setField(term11617, term11617.getClass(), "namespaceMap", null);
        setField(term11617, term11617.getClass(), "reverseMap", null);
        setField(term11617, term11617.getClass(), "pointer", null);
        setField(term11617, term11617.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term11617, term11617.getClass(), "sealed", false);
        setField(term11616, term11616.getClass(), "parent", term11617);
        setField(term11616, term11616.getClass(), "namespaceMap", term11618);
        setField(term11616, term11616.getClass(), "reverseMap", term11619);
        setField(term11616, term11616.getClass(), "pointer", null);
        setField(term11616, term11616.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term11616, term11616.getClass(), "sealed", false);
        setField(term11615, term11615.getClass(), "parent", term11616);
        setField(term11615, term11615.getClass(), "namespaceMap", term11620);
        setField(term11615, term11615.getClass(), "reverseMap", term11621);
        setField(term11615, term11615.getClass(), "pointer", null);
        setField(term11615, term11615.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term11615, term11615.getClass(), "sealed", false);
        setField(term11614, term11614.getClass(), "parent", term11615);
        setField(term11614, term11614.getClass(), "namespaceMap", term11622);
        setField(term11614, term11614.getClass(), "reverseMap", term11623);
        setField(term11614, term11614.getClass(), "pointer", null);
        setField(term11614, term11614.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term11614, term11614.getClass(), "sealed", false);
        setField(term11607, term11607.getClass(), "namespaceResolver", term11614);
        setField(term11607, term11607.getClass(), "parent", null);
        setField(term11607, term11607.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term3037, args);
        assertTrue(recursiveEquals(term3037, term11607));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


