package org.apache.commons.jxpath.ri.model.jdom;

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
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.jdom.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_getValue_210627446258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1021;
     Object term4704;

    public JDOMNodePointer_getValue_210627446258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1043 = new HashMap();
        HashMap term1048 = new HashMap();
        HashMap term1054 = new HashMap();
        HashMap term1059 = new HashMap();
        HashMap term1065 = new HashMap();
        HashMap term1070 = new HashMap();
        term1021 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1022 = newInstance(Class.forName("java.lang.Object"));
        Object term1037 = newInstance(Class.forName("java.lang.Object"));
        Object term1038 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1039 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1040 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1041 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1021, term1021.getClass(), "node", term1022);
        setField(term1021, term1021.getClass(), "id", "pCTimMblYc");
        setIntField(term1021, term1021.getClass(), "index", -883034806);
        setBooleanField(term1021, term1021.getClass(), "attribute", false);
        setField(term1021, term1021.getClass(), "rootNode", term1037);
        setField(term1041, term1041.getClass(), "parent", null);
        setField(term1041, term1041.getClass(), "namespaceMap", null);
        setField(term1041, term1041.getClass(), "reverseMap", null);
        setField(term1041, term1041.getClass(), "pointer", null);
        setField(term1041, term1041.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1041, term1041.getClass(), "sealed", false);
        setField(term1040, term1040.getClass(), "parent", term1041);
        setField(term1040, term1040.getClass(), "namespaceMap", term1043);
        setField(term1040, term1040.getClass(), "reverseMap", term1048);
        setField(term1040, term1040.getClass(), "pointer", null);
        setField(term1040, term1040.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1040, term1040.getClass(), "sealed", false);
        setField(term1039, term1039.getClass(), "parent", term1040);
        setField(term1039, term1039.getClass(), "namespaceMap", term1054);
        setField(term1039, term1039.getClass(), "reverseMap", term1059);
        setField(term1039, term1039.getClass(), "pointer", null);
        setField(term1039, term1039.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1039, term1039.getClass(), "sealed", false);
        setField(term1038, term1038.getClass(), "parent", term1039);
        setField(term1038, term1038.getClass(), "namespaceMap", term1065);
        setField(term1038, term1038.getClass(), "reverseMap", term1070);
        setField(term1038, term1038.getClass(), "pointer", null);
        setField(term1038, term1038.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1038, term1038.getClass(), "sealed", false);
        setField(term1021, term1021.getClass(), "namespaceResolver", term1038);
        setField(term1021, term1021.getClass(), "parent", null);
        setField(term1021, term1021.getClass(), "locale", null);
        HashMap term4713 = new HashMap();
        HashMap term4714 = new HashMap();
        HashMap term4715 = new HashMap();
        HashMap term4716 = new HashMap();
        HashMap term4717 = new HashMap();
        HashMap term4718 = new HashMap();
        term4704 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term4705 = newInstance(Class.forName("java.lang.Object"));
        Object term4708 = newInstance(Class.forName("java.lang.Object"));
        Object term4709 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4710 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4711 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4712 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term4704, term4704.getClass(), "node", term4705);
        setField(term4704, term4704.getClass(), "id", "pCTimMblYc");
        setIntField(term4704, term4704.getClass(), "index", -883034806);
        setBooleanField(term4704, term4704.getClass(), "attribute", false);
        setField(term4704, term4704.getClass(), "rootNode", term4708);
        setField(term4712, term4712.getClass(), "parent", null);
        setField(term4712, term4712.getClass(), "namespaceMap", null);
        setField(term4712, term4712.getClass(), "reverseMap", null);
        setField(term4712, term4712.getClass(), "pointer", null);
        setField(term4712, term4712.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4712, term4712.getClass(), "sealed", false);
        setField(term4711, term4711.getClass(), "parent", term4712);
        setField(term4711, term4711.getClass(), "namespaceMap", term4713);
        setField(term4711, term4711.getClass(), "reverseMap", term4714);
        setField(term4711, term4711.getClass(), "pointer", null);
        setField(term4711, term4711.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4711, term4711.getClass(), "sealed", false);
        setField(term4710, term4710.getClass(), "parent", term4711);
        setField(term4710, term4710.getClass(), "namespaceMap", term4715);
        setField(term4710, term4710.getClass(), "reverseMap", term4716);
        setField(term4710, term4710.getClass(), "pointer", null);
        setField(term4710, term4710.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4710, term4710.getClass(), "sealed", false);
        setField(term4709, term4709.getClass(), "parent", term4710);
        setField(term4709, term4709.getClass(), "namespaceMap", term4717);
        setField(term4709, term4709.getClass(), "reverseMap", term4718);
        setField(term4709, term4709.getClass(), "pointer", null);
        setField(term4709, term4709.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4709, term4709.getClass(), "sealed", false);
        setField(term4704, term4704.getClass(), "namespaceResolver", term4709);
        setField(term4704, term4704.getClass(), "parent", null);
        setField(term4704, term4704.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term1021, args);
        assertTrue(recursiveEquals(term1021, term4704));
        assertTrue(recursiveEquals(retValue, null));
    }

};


