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

public class JDOMNodePointer_escape_155441389774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2025;
     Object term8706;

    public JDOMNodePointer_escape_155441389774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2047 = new HashMap();
        HashMap term2052 = new HashMap();
        HashMap term2058 = new HashMap();
        HashMap term2063 = new HashMap();
        HashMap term2069 = new HashMap();
        HashMap term2074 = new HashMap();
        term2025 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2026 = newInstance(Class.forName("java.lang.Object"));
        Object term2041 = newInstance(Class.forName("java.lang.Object"));
        Object term2042 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2043 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2044 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2045 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2025, term2025.getClass(), "node", term2026);
        setField(term2025, term2025.getClass(), "id", "gGSMzuGICf");
        setIntField(term2025, term2025.getClass(), "index", 590364439);
        setBooleanField(term2025, term2025.getClass(), "attribute", false);
        setField(term2025, term2025.getClass(), "rootNode", term2041);
        setField(term2045, term2045.getClass(), "parent", null);
        setField(term2045, term2045.getClass(), "namespaceMap", null);
        setField(term2045, term2045.getClass(), "reverseMap", null);
        setField(term2045, term2045.getClass(), "pointer", null);
        setField(term2045, term2045.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2045, term2045.getClass(), "sealed", false);
        setField(term2044, term2044.getClass(), "parent", term2045);
        setField(term2044, term2044.getClass(), "namespaceMap", term2047);
        setField(term2044, term2044.getClass(), "reverseMap", term2052);
        setField(term2044, term2044.getClass(), "pointer", null);
        setField(term2044, term2044.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2044, term2044.getClass(), "sealed", false);
        setField(term2043, term2043.getClass(), "parent", term2044);
        setField(term2043, term2043.getClass(), "namespaceMap", term2058);
        setField(term2043, term2043.getClass(), "reverseMap", term2063);
        setField(term2043, term2043.getClass(), "pointer", null);
        setField(term2043, term2043.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2043, term2043.getClass(), "sealed", false);
        setField(term2042, term2042.getClass(), "parent", term2043);
        setField(term2042, term2042.getClass(), "namespaceMap", term2069);
        setField(term2042, term2042.getClass(), "reverseMap", term2074);
        setField(term2042, term2042.getClass(), "pointer", null);
        setField(term2042, term2042.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2042, term2042.getClass(), "sealed", false);
        setField(term2025, term2025.getClass(), "namespaceResolver", term2042);
        setField(term2025, term2025.getClass(), "parent", null);
        setField(term2025, term2025.getClass(), "locale", null);
        HashMap term8715 = new HashMap();
        HashMap term8716 = new HashMap();
        HashMap term8717 = new HashMap();
        HashMap term8718 = new HashMap();
        HashMap term8719 = new HashMap();
        HashMap term8720 = new HashMap();
        term8706 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term8707 = newInstance(Class.forName("java.lang.Object"));
        Object term8710 = newInstance(Class.forName("java.lang.Object"));
        Object term8711 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8712 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8713 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8714 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term8706, term8706.getClass(), "node", term8707);
        setField(term8706, term8706.getClass(), "id", "gGSMzuGICf");
        setIntField(term8706, term8706.getClass(), "index", 590364439);
        setBooleanField(term8706, term8706.getClass(), "attribute", false);
        setField(term8706, term8706.getClass(), "rootNode", term8710);
        setField(term8714, term8714.getClass(), "parent", null);
        setField(term8714, term8714.getClass(), "namespaceMap", null);
        setField(term8714, term8714.getClass(), "reverseMap", null);
        setField(term8714, term8714.getClass(), "pointer", null);
        setField(term8714, term8714.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term8714, term8714.getClass(), "sealed", false);
        setField(term8713, term8713.getClass(), "parent", term8714);
        setField(term8713, term8713.getClass(), "namespaceMap", term8715);
        setField(term8713, term8713.getClass(), "reverseMap", term8716);
        setField(term8713, term8713.getClass(), "pointer", null);
        setField(term8713, term8713.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term8713, term8713.getClass(), "sealed", false);
        setField(term8712, term8712.getClass(), "parent", term8713);
        setField(term8712, term8712.getClass(), "namespaceMap", term8717);
        setField(term8712, term8712.getClass(), "reverseMap", term8718);
        setField(term8712, term8712.getClass(), "pointer", null);
        setField(term8712, term8712.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term8712, term8712.getClass(), "sealed", false);
        setField(term8711, term8711.getClass(), "parent", term8712);
        setField(term8711, term8711.getClass(), "namespaceMap", term8719);
        setField(term8711, term8711.getClass(), "reverseMap", term8720);
        setField(term8711, term8711.getClass(), "pointer", null);
        setField(term8711, term8711.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term8711, term8711.getClass(), "sealed", false);
        setField(term8706, term8706.getClass(), "namespaceResolver", term8711);
        setField(term8706, term8706.getClass(), "parent", null);
        setField(term8706, term8706.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hxCBltsObl";
        Object retValue = callMethod(klass, "escape", argTypes, term2025, args);
        assertTrue(recursiveEquals(term2025, term8706));
        assertTrue(recursiveEquals(retValue, "hxCBltsObl"));
    }

};


