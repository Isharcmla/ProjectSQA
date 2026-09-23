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

public class JDOMNodePointer_getName_74540432856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term891;
     Object term4519;
     Object term4463;

    public JDOMNodePointer_getName_74540432856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term913 = new HashMap();
        HashMap term918 = new HashMap();
        HashMap term924 = new HashMap();
        HashMap term929 = new HashMap();
        HashMap term935 = new HashMap();
        HashMap term940 = new HashMap();
        term891 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term892 = newInstance(Class.forName("java.lang.Object"));
        Object term907 = newInstance(Class.forName("java.lang.Object"));
        Object term908 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term909 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term910 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term911 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term891, term891.getClass(), "node", term892);
        setField(term891, term891.getClass(), "id", "tbcdzjIfER");
        setIntField(term891, term891.getClass(), "index", -522618178);
        setBooleanField(term891, term891.getClass(), "attribute", false);
        setField(term891, term891.getClass(), "rootNode", term907);
        setField(term911, term911.getClass(), "parent", null);
        setField(term911, term911.getClass(), "namespaceMap", null);
        setField(term911, term911.getClass(), "reverseMap", null);
        setField(term911, term911.getClass(), "pointer", null);
        setField(term911, term911.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term911, term911.getClass(), "sealed", false);
        setField(term910, term910.getClass(), "parent", term911);
        setField(term910, term910.getClass(), "namespaceMap", term913);
        setField(term910, term910.getClass(), "reverseMap", term918);
        setField(term910, term910.getClass(), "pointer", null);
        setField(term910, term910.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term910, term910.getClass(), "sealed", false);
        setField(term909, term909.getClass(), "parent", term910);
        setField(term909, term909.getClass(), "namespaceMap", term924);
        setField(term909, term909.getClass(), "reverseMap", term929);
        setField(term909, term909.getClass(), "pointer", null);
        setField(term909, term909.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term909, term909.getClass(), "sealed", false);
        setField(term908, term908.getClass(), "parent", term909);
        setField(term908, term908.getClass(), "namespaceMap", term935);
        setField(term908, term908.getClass(), "reverseMap", term940);
        setField(term908, term908.getClass(), "pointer", null);
        setField(term908, term908.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term908, term908.getClass(), "sealed", false);
        setField(term891, term891.getClass(), "namespaceResolver", term908);
        setField(term891, term891.getClass(), "parent", null);
        setField(term891, term891.getClass(), "locale", null);
        HashMap term4528 = new HashMap();
        HashMap term4529 = new HashMap();
        HashMap term4530 = new HashMap();
        HashMap term4531 = new HashMap();
        HashMap term4532 = new HashMap();
        HashMap term4533 = new HashMap();
        term4519 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term4520 = newInstance(Class.forName("java.lang.Object"));
        Object term4523 = newInstance(Class.forName("java.lang.Object"));
        Object term4524 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4525 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4526 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4527 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term4519, term4519.getClass(), "node", term4520);
        setField(term4519, term4519.getClass(), "id", "tbcdzjIfER");
        setIntField(term4519, term4519.getClass(), "index", -522618178);
        setBooleanField(term4519, term4519.getClass(), "attribute", false);
        setField(term4519, term4519.getClass(), "rootNode", term4523);
        setField(term4527, term4527.getClass(), "parent", null);
        setField(term4527, term4527.getClass(), "namespaceMap", null);
        setField(term4527, term4527.getClass(), "reverseMap", null);
        setField(term4527, term4527.getClass(), "pointer", null);
        setField(term4527, term4527.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4527, term4527.getClass(), "sealed", false);
        setField(term4526, term4526.getClass(), "parent", term4527);
        setField(term4526, term4526.getClass(), "namespaceMap", term4528);
        setField(term4526, term4526.getClass(), "reverseMap", term4529);
        setField(term4526, term4526.getClass(), "pointer", null);
        setField(term4526, term4526.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4526, term4526.getClass(), "sealed", false);
        setField(term4525, term4525.getClass(), "parent", term4526);
        setField(term4525, term4525.getClass(), "namespaceMap", term4530);
        setField(term4525, term4525.getClass(), "reverseMap", term4531);
        setField(term4525, term4525.getClass(), "pointer", null);
        setField(term4525, term4525.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4525, term4525.getClass(), "sealed", false);
        setField(term4524, term4524.getClass(), "parent", term4525);
        setField(term4524, term4524.getClass(), "namespaceMap", term4532);
        setField(term4524, term4524.getClass(), "reverseMap", term4533);
        setField(term4524, term4524.getClass(), "pointer", null);
        setField(term4524, term4524.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4524, term4524.getClass(), "sealed", false);
        setField(term4519, term4519.getClass(), "namespaceResolver", term4524);
        setField(term4519, term4519.getClass(), "parent", null);
        setField(term4519, term4519.getClass(), "locale", null);
        term4463 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term4463, term4463.getClass(), "prefix", null);
        setField(term4463, term4463.getClass(), "name", null);
        setField(term4463, term4463.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getName", argTypes, term891, args);
        assertTrue(recursiveEquals(term891, term4519));
        assertTrue(recursiveEquals(retValue, term4463));
    }

};


