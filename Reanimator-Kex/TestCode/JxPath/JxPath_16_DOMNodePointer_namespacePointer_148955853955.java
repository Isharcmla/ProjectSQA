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

public class DOMNodePointer_namespacePointer_148955853955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term662;
     Object term5922;
     Object term5829;

    public DOMNodePointer_namespacePointer_148955853955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term663 = new HashMap();
        HashMap term697 = new HashMap();
        HashMap term702 = new HashMap();
        HashMap term708 = new HashMap();
        HashMap term713 = new HashMap();
        HashMap term719 = new HashMap();
        HashMap term724 = new HashMap();
        HashMap term734 = new HashMap();
        term662 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term692 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term693 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term694 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term695 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term732 = newInstance(Class.forName("java.lang.Object"));
        Object term733 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term662, term662.getClass(), "node", null);
        setField(term662, term662.getClass(), "namespaces", term663);
        setField(term662, term662.getClass(), "defaultNamespace", "ZiaGIbnzTs");
        setField(term662, term662.getClass(), "id", "tbcdzjIfER");
        setField(term695, term695.getClass(), "parent", null);
        setField(term695, term695.getClass(), "namespaceMap", null);
        setField(term695, term695.getClass(), "reverseMap", null);
        setField(term695, term695.getClass(), "pointer", null);
        setBooleanField(term695, term695.getClass(), "sealed", false);
        setField(term694, term694.getClass(), "parent", term695);
        setField(term694, term694.getClass(), "namespaceMap", term697);
        setField(term694, term694.getClass(), "reverseMap", term702);
        setField(term694, term694.getClass(), "pointer", null);
        setBooleanField(term694, term694.getClass(), "sealed", false);
        setField(term693, term693.getClass(), "parent", term694);
        setField(term693, term693.getClass(), "namespaceMap", term708);
        setField(term693, term693.getClass(), "reverseMap", term713);
        setField(term693, term693.getClass(), "pointer", null);
        setBooleanField(term693, term693.getClass(), "sealed", false);
        setField(term692, term692.getClass(), "parent", term693);
        setField(term692, term692.getClass(), "namespaceMap", term719);
        setField(term692, term692.getClass(), "reverseMap", term724);
        setField(term692, term692.getClass(), "pointer", null);
        setBooleanField(term692, term692.getClass(), "sealed", false);
        setField(term662, term662.getClass(), "localNamespaceResolver", term692);
        setIntField(term662, term662.getClass(), "index", -616727354);
        setBooleanField(term662, term662.getClass(), "attribute", true);
        setField(term662, term662.getClass(), "rootNode", term732);
        setField(term733, term733.getClass(), "parent", null);
        setField(term733, term733.getClass(), "namespaceMap", term734);
        setField(term733, term733.getClass(), "reverseMap", null);
        setField(term733, term733.getClass(), "pointer", null);
        setBooleanField(term733, term733.getClass(), "sealed", false);
        setField(term662, term662.getClass(), "namespaceResolver", term733);
        setField(term662, term662.getClass(), "parent", null);
        setField(term662, term662.getClass(), "locale", null);
        HashMap term5923 = new HashMap();
        HashMap term5931 = new HashMap();
        HashMap term5932 = new HashMap();
        HashMap term5933 = new HashMap();
        HashMap term5934 = new HashMap();
        HashMap term5937 = new HashMap();
        term5922 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term5928 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5929 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5930 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5935 = newInstance(Class.forName("java.lang.Object"));
        Object term5936 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5922, term5922.getClass(), "node", null);
        setField(term5922, term5922.getClass(), "namespaces", term5923);
        setField(term5922, term5922.getClass(), "defaultNamespace", "ZiaGIbnzTs");
        setField(term5922, term5922.getClass(), "id", "tbcdzjIfER");
        setField(term5930, term5930.getClass(), "parent", null);
        setField(term5930, term5930.getClass(), "namespaceMap", null);
        setField(term5930, term5930.getClass(), "reverseMap", null);
        setField(term5930, term5930.getClass(), "pointer", null);
        setBooleanField(term5930, term5930.getClass(), "sealed", false);
        setField(term5929, term5929.getClass(), "parent", term5930);
        setField(term5929, term5929.getClass(), "namespaceMap", term5931);
        setField(term5929, term5929.getClass(), "reverseMap", term5932);
        setField(term5929, term5929.getClass(), "pointer", null);
        setBooleanField(term5929, term5929.getClass(), "sealed", false);
        setField(term5928, term5928.getClass(), "parent", term5929);
        setField(term5928, term5928.getClass(), "namespaceMap", term5933);
        setField(term5928, term5928.getClass(), "reverseMap", term5934);
        setField(term5928, term5928.getClass(), "pointer", null);
        setBooleanField(term5928, term5928.getClass(), "sealed", false);
        setField(term5922, term5922.getClass(), "localNamespaceResolver", term5928);
        setIntField(term5922, term5922.getClass(), "index", -616727354);
        setBooleanField(term5922, term5922.getClass(), "attribute", true);
        setField(term5922, term5922.getClass(), "rootNode", term5935);
        setField(term5936, term5936.getClass(), "parent", null);
        setField(term5936, term5936.getClass(), "namespaceMap", term5937);
        setField(term5936, term5936.getClass(), "reverseMap", null);
        setField(term5936, term5936.getClass(), "pointer", null);
        setBooleanField(term5936, term5936.getClass(), "sealed", false);
        setField(term5922, term5922.getClass(), "namespaceResolver", term5936);
        setField(term5922, term5922.getClass(), "parent", null);
        setField(term5922, term5922.getClass(), "locale", null);
        HashMap term5845 = new HashMap();
        HashMap term5878 = new HashMap();
        HashMap term5883 = new HashMap();
        HashMap term5889 = new HashMap();
        HashMap term5894 = new HashMap();
        HashMap term5904 = new HashMap();
        term5829 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term5844 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term5874 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5875 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5876 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5902 = newInstance(Class.forName("java.lang.Object"));
        Object term5903 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5829, term5829.getClass(), "prefix", "HyxfbSQYBe");
        setField(term5829, term5829.getClass(), "namespaceURI", null);
        setIntField(term5829, term5829.getClass(), "index", -2147483648);
        setBooleanField(term5829, term5829.getClass(), "attribute", false);
        setField(term5829, term5829.getClass(), "rootNode", null);
        setField(term5829, term5829.getClass(), "namespaceResolver", null);
        setField(term5844, term5844.getClass(), "node", null);
        setField(term5844, term5844.getClass(), "namespaces", term5845);
        setField(term5844, term5844.getClass(), "defaultNamespace", "ZiaGIbnzTs");
        setField(term5844, term5844.getClass(), "id", "tbcdzjIfER");
        setField(term5876, term5876.getClass(), "parent", null);
        setField(term5876, term5876.getClass(), "namespaceMap", null);
        setField(term5876, term5876.getClass(), "reverseMap", null);
        setField(term5876, term5876.getClass(), "pointer", null);
        setBooleanField(term5876, term5876.getClass(), "sealed", false);
        setField(term5875, term5875.getClass(), "parent", term5876);
        setField(term5875, term5875.getClass(), "namespaceMap", term5878);
        setField(term5875, term5875.getClass(), "reverseMap", term5883);
        setField(term5875, term5875.getClass(), "pointer", null);
        setBooleanField(term5875, term5875.getClass(), "sealed", false);
        setField(term5874, term5874.getClass(), "parent", term5875);
        setField(term5874, term5874.getClass(), "namespaceMap", term5889);
        setField(term5874, term5874.getClass(), "reverseMap", term5894);
        setField(term5874, term5874.getClass(), "pointer", null);
        setBooleanField(term5874, term5874.getClass(), "sealed", false);
        setField(term5844, term5844.getClass(), "localNamespaceResolver", term5874);
        setIntField(term5844, term5844.getClass(), "index", -616727354);
        setBooleanField(term5844, term5844.getClass(), "attribute", true);
        setField(term5844, term5844.getClass(), "rootNode", term5902);
        setField(term5903, term5903.getClass(), "parent", null);
        setField(term5903, term5903.getClass(), "namespaceMap", term5904);
        setField(term5903, term5903.getClass(), "reverseMap", null);
        setField(term5903, term5903.getClass(), "pointer", null);
        setBooleanField(term5903, term5903.getClass(), "sealed", false);
        setField(term5844, term5844.getClass(), "namespaceResolver", term5903);
        setField(term5844, term5844.getClass(), "parent", null);
        setField(term5844, term5844.getClass(), "locale", null);
        setField(term5829, term5829.getClass(), "parent", term5844);
        setField(term5829, term5829.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        Object retValue = callMethod(klass, "namespacePointer", argTypes, term662, args);
        assertTrue(recursiveEquals(term662, term5922));
        assertTrue(recursiveEquals(retValue, term5829));
    }

};


