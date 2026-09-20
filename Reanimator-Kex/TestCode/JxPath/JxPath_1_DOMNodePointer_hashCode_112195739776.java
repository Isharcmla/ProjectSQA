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
     Object term2949;
     Object term11512;

    public DOMNodePointer_hashCode_112195739776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2950 = new HashMap();
        HashMap term2987 = new HashMap();
        HashMap term2992 = new HashMap();
        HashMap term2998 = new HashMap();
        HashMap term3003 = new HashMap();
        HashMap term3009 = new HashMap();
        HashMap term3014 = new HashMap();
        term2949 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2981 = newInstance(Class.forName("java.lang.Object"));
        Object term2982 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2983 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2984 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2985 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2949, term2949.getClass(), "node", null);
        setField(term2949, term2949.getClass(), "namespaces", term2950);
        setField(term2949, term2949.getClass(), "defaultNamespace", "JUmudUmaaV");
        setField(term2949, term2949.getClass(), "id", "KoyGrUJeJW");
        setIntField(term2949, term2949.getClass(), "index", -203030934);
        setBooleanField(term2949, term2949.getClass(), "attribute", true);
        setField(term2949, term2949.getClass(), "rootNode", term2981);
        setField(term2985, term2985.getClass(), "parent", null);
        setField(term2985, term2985.getClass(), "namespaceMap", null);
        setField(term2985, term2985.getClass(), "reverseMap", null);
        setField(term2985, term2985.getClass(), "pointer", null);
        setField(term2985, term2985.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2985, term2985.getClass(), "sealed", false);
        setField(term2984, term2984.getClass(), "parent", term2985);
        setField(term2984, term2984.getClass(), "namespaceMap", term2987);
        setField(term2984, term2984.getClass(), "reverseMap", term2992);
        setField(term2984, term2984.getClass(), "pointer", null);
        setField(term2984, term2984.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2984, term2984.getClass(), "sealed", false);
        setField(term2983, term2983.getClass(), "parent", term2984);
        setField(term2983, term2983.getClass(), "namespaceMap", term2998);
        setField(term2983, term2983.getClass(), "reverseMap", term3003);
        setField(term2983, term2983.getClass(), "pointer", null);
        setField(term2983, term2983.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2983, term2983.getClass(), "sealed", false);
        setField(term2982, term2982.getClass(), "parent", term2983);
        setField(term2982, term2982.getClass(), "namespaceMap", term3009);
        setField(term2982, term2982.getClass(), "reverseMap", term3014);
        setField(term2982, term2982.getClass(), "pointer", null);
        setField(term2982, term2982.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2982, term2982.getClass(), "sealed", false);
        setField(term2949, term2949.getClass(), "namespaceResolver", term2982);
        setField(term2949, term2949.getClass(), "parent", null);
        setField(term2949, term2949.getClass(), "locale", null);
        HashMap term11513 = new HashMap();
        HashMap term11523 = new HashMap();
        HashMap term11524 = new HashMap();
        HashMap term11525 = new HashMap();
        HashMap term11526 = new HashMap();
        HashMap term11527 = new HashMap();
        HashMap term11528 = new HashMap();
        term11512 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term11518 = newInstance(Class.forName("java.lang.Object"));
        Object term11519 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11520 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11521 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11522 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term11512, term11512.getClass(), "node", null);
        setField(term11512, term11512.getClass(), "namespaces", term11513);
        setField(term11512, term11512.getClass(), "defaultNamespace", "JUmudUmaaV");
        setField(term11512, term11512.getClass(), "id", "KoyGrUJeJW");
        setIntField(term11512, term11512.getClass(), "index", -203030934);
        setBooleanField(term11512, term11512.getClass(), "attribute", true);
        setField(term11512, term11512.getClass(), "rootNode", term11518);
        setField(term11522, term11522.getClass(), "parent", null);
        setField(term11522, term11522.getClass(), "namespaceMap", null);
        setField(term11522, term11522.getClass(), "reverseMap", null);
        setField(term11522, term11522.getClass(), "pointer", null);
        setField(term11522, term11522.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term11522, term11522.getClass(), "sealed", false);
        setField(term11521, term11521.getClass(), "parent", term11522);
        setField(term11521, term11521.getClass(), "namespaceMap", term11523);
        setField(term11521, term11521.getClass(), "reverseMap", term11524);
        setField(term11521, term11521.getClass(), "pointer", null);
        setField(term11521, term11521.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term11521, term11521.getClass(), "sealed", false);
        setField(term11520, term11520.getClass(), "parent", term11521);
        setField(term11520, term11520.getClass(), "namespaceMap", term11525);
        setField(term11520, term11520.getClass(), "reverseMap", term11526);
        setField(term11520, term11520.getClass(), "pointer", null);
        setField(term11520, term11520.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term11520, term11520.getClass(), "sealed", false);
        setField(term11519, term11519.getClass(), "parent", term11520);
        setField(term11519, term11519.getClass(), "namespaceMap", term11527);
        setField(term11519, term11519.getClass(), "reverseMap", term11528);
        setField(term11519, term11519.getClass(), "pointer", null);
        setField(term11519, term11519.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term11519, term11519.getClass(), "sealed", false);
        setField(term11512, term11512.getClass(), "namespaceResolver", term11519);
        setField(term11512, term11512.getClass(), "parent", null);
        setField(term11512, term11512.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term2949, args);
        assertTrue(recursiveEquals(term2949, term11512));
        assertTrue(recursiveEquals(retValue, 0));
    }

};
