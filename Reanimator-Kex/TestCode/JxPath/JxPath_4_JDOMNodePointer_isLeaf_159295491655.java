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

public class JDOMNodePointer_isLeaf_159295491655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term826;
     Object term4424;

    public JDOMNodePointer_isLeaf_159295491655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term848 = new HashMap();
        HashMap term853 = new HashMap();
        HashMap term859 = new HashMap();
        HashMap term864 = new HashMap();
        HashMap term870 = new HashMap();
        HashMap term875 = new HashMap();
        term826 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term827 = newInstance(Class.forName("java.lang.Object"));
        Object term842 = newInstance(Class.forName("java.lang.Object"));
        Object term843 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term844 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term845 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term846 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term826, term826.getClass(), "node", term827);
        setField(term826, term826.getClass(), "id", "ZiaGIbnzTs");
        setIntField(term826, term826.getClass(), "index", 1725571209);
        setBooleanField(term826, term826.getClass(), "attribute", true);
        setField(term826, term826.getClass(), "rootNode", term842);
        setField(term846, term846.getClass(), "parent", null);
        setField(term846, term846.getClass(), "namespaceMap", null);
        setField(term846, term846.getClass(), "reverseMap", null);
        setField(term846, term846.getClass(), "pointer", null);
        setField(term846, term846.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term846, term846.getClass(), "sealed", false);
        setField(term845, term845.getClass(), "parent", term846);
        setField(term845, term845.getClass(), "namespaceMap", term848);
        setField(term845, term845.getClass(), "reverseMap", term853);
        setField(term845, term845.getClass(), "pointer", null);
        setField(term845, term845.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term845, term845.getClass(), "sealed", false);
        setField(term844, term844.getClass(), "parent", term845);
        setField(term844, term844.getClass(), "namespaceMap", term859);
        setField(term844, term844.getClass(), "reverseMap", term864);
        setField(term844, term844.getClass(), "pointer", null);
        setField(term844, term844.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term844, term844.getClass(), "sealed", false);
        setField(term843, term843.getClass(), "parent", term844);
        setField(term843, term843.getClass(), "namespaceMap", term870);
        setField(term843, term843.getClass(), "reverseMap", term875);
        setField(term843, term843.getClass(), "pointer", null);
        setField(term843, term843.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term843, term843.getClass(), "sealed", false);
        setField(term826, term826.getClass(), "namespaceResolver", term843);
        setField(term826, term826.getClass(), "parent", null);
        setField(term826, term826.getClass(), "locale", null);
        HashMap term4433 = new HashMap();
        HashMap term4434 = new HashMap();
        HashMap term4435 = new HashMap();
        HashMap term4436 = new HashMap();
        HashMap term4437 = new HashMap();
        HashMap term4438 = new HashMap();
        term4424 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term4425 = newInstance(Class.forName("java.lang.Object"));
        Object term4428 = newInstance(Class.forName("java.lang.Object"));
        Object term4429 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4430 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4431 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4432 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term4424, term4424.getClass(), "node", term4425);
        setField(term4424, term4424.getClass(), "id", "ZiaGIbnzTs");
        setIntField(term4424, term4424.getClass(), "index", 1725571209);
        setBooleanField(term4424, term4424.getClass(), "attribute", true);
        setField(term4424, term4424.getClass(), "rootNode", term4428);
        setField(term4432, term4432.getClass(), "parent", null);
        setField(term4432, term4432.getClass(), "namespaceMap", null);
        setField(term4432, term4432.getClass(), "reverseMap", null);
        setField(term4432, term4432.getClass(), "pointer", null);
        setField(term4432, term4432.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4432, term4432.getClass(), "sealed", false);
        setField(term4431, term4431.getClass(), "parent", term4432);
        setField(term4431, term4431.getClass(), "namespaceMap", term4433);
        setField(term4431, term4431.getClass(), "reverseMap", term4434);
        setField(term4431, term4431.getClass(), "pointer", null);
        setField(term4431, term4431.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4431, term4431.getClass(), "sealed", false);
        setField(term4430, term4430.getClass(), "parent", term4431);
        setField(term4430, term4430.getClass(), "namespaceMap", term4435);
        setField(term4430, term4430.getClass(), "reverseMap", term4436);
        setField(term4430, term4430.getClass(), "pointer", null);
        setField(term4430, term4430.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4430, term4430.getClass(), "sealed", false);
        setField(term4429, term4429.getClass(), "parent", term4430);
        setField(term4429, term4429.getClass(), "namespaceMap", term4437);
        setField(term4429, term4429.getClass(), "reverseMap", term4438);
        setField(term4429, term4429.getClass(), "pointer", null);
        setField(term4429, term4429.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4429, term4429.getClass(), "sealed", false);
        setField(term4424, term4424.getClass(), "namespaceResolver", term4429);
        setField(term4424, term4424.getClass(), "parent", null);
        setField(term4424, term4424.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isLeaf", argTypes, term826, args);
        assertTrue(recursiveEquals(term826, term4424));
        assertTrue(recursiveEquals(retValue, true));
    }

};


