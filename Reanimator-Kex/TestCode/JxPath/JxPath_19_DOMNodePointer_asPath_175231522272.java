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

public class DOMNodePointer_asPath_175231522272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2836;
     Object term11015;

    public DOMNodePointer_asPath_175231522272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2837 = new HashMap();
        HashMap term2871 = new HashMap();
        HashMap term2876 = new HashMap();
        HashMap term2882 = new HashMap();
        HashMap term2887 = new HashMap();
        HashMap term2893 = new HashMap();
        HashMap term2898 = new HashMap();
        HashMap term2907 = new HashMap();
        HashMap term2912 = new HashMap();
        term2836 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2866 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2867 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2868 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2869 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2906 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2918 = newInstance(Class.forName("java.lang.Object"));
        setField(term2836, term2836.getClass(), "node", null);
        setField(term2836, term2836.getClass(), "namespaces", term2837);
        setField(term2836, term2836.getClass(), "defaultNamespace", "uWHnvSvaPl");
        setField(term2836, term2836.getClass(), "id", "kBdSllIBVz");
        setField(term2869, term2869.getClass(), "parent", null);
        setField(term2869, term2869.getClass(), "namespaceMap", null);
        setField(term2869, term2869.getClass(), "reverseMap", null);
        setField(term2869, term2869.getClass(), "pointer", null);
        setBooleanField(term2869, term2869.getClass(), "sealed", false);
        setField(term2868, term2868.getClass(), "parent", term2869);
        setField(term2868, term2868.getClass(), "namespaceMap", term2871);
        setField(term2868, term2868.getClass(), "reverseMap", term2876);
        setField(term2868, term2868.getClass(), "pointer", null);
        setBooleanField(term2868, term2868.getClass(), "sealed", false);
        setField(term2867, term2867.getClass(), "parent", term2868);
        setField(term2867, term2867.getClass(), "namespaceMap", term2882);
        setField(term2867, term2867.getClass(), "reverseMap", term2887);
        setField(term2867, term2867.getClass(), "pointer", null);
        setBooleanField(term2867, term2867.getClass(), "sealed", false);
        setField(term2866, term2866.getClass(), "parent", term2867);
        setField(term2866, term2866.getClass(), "namespaceMap", term2893);
        setField(term2866, term2866.getClass(), "reverseMap", term2898);
        setField(term2866, term2866.getClass(), "pointer", null);
        setBooleanField(term2866, term2866.getClass(), "sealed", false);
        setField(term2836, term2836.getClass(), "localNamespaceResolver", term2866);
        setIntField(term2836, term2836.getClass(), "index", 1135664017);
        setBooleanField(term2836, term2836.getClass(), "attribute", true);
        setField(term2906, term2906.getClass(), "parent", null);
        setField(term2906, term2906.getClass(), "namespaceMap", term2907);
        setField(term2906, term2906.getClass(), "reverseMap", term2912);
        setField(term2906, term2906.getClass(), "pointer", null);
        setBooleanField(term2906, term2906.getClass(), "sealed", false);
        setField(term2836, term2836.getClass(), "namespaceResolver", term2906);
        setField(term2836, term2836.getClass(), "rootNode", term2918);
        setField(term2836, term2836.getClass(), "parent", null);
        setField(term2836, term2836.getClass(), "locale", null);
        HashMap term11016 = new HashMap();
        HashMap term11025 = new HashMap();
        HashMap term11026 = new HashMap();
        HashMap term11027 = new HashMap();
        HashMap term11028 = new HashMap();
        HashMap term11029 = new HashMap();
        HashMap term11030 = new HashMap();
        HashMap term11032 = new HashMap();
        HashMap term11033 = new HashMap();
        term11015 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term11021 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11022 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11023 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11024 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11031 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11034 = newInstance(Class.forName("java.lang.Object"));
        setField(term11015, term11015.getClass(), "node", null);
        setField(term11015, term11015.getClass(), "namespaces", term11016);
        setField(term11015, term11015.getClass(), "defaultNamespace", "uWHnvSvaPl");
        setField(term11015, term11015.getClass(), "id", "kBdSllIBVz");
        setField(term11024, term11024.getClass(), "parent", null);
        setField(term11024, term11024.getClass(), "namespaceMap", null);
        setField(term11024, term11024.getClass(), "reverseMap", null);
        setField(term11024, term11024.getClass(), "pointer", null);
        setBooleanField(term11024, term11024.getClass(), "sealed", false);
        setField(term11023, term11023.getClass(), "parent", term11024);
        setField(term11023, term11023.getClass(), "namespaceMap", term11025);
        setField(term11023, term11023.getClass(), "reverseMap", term11026);
        setField(term11023, term11023.getClass(), "pointer", null);
        setBooleanField(term11023, term11023.getClass(), "sealed", false);
        setField(term11022, term11022.getClass(), "parent", term11023);
        setField(term11022, term11022.getClass(), "namespaceMap", term11027);
        setField(term11022, term11022.getClass(), "reverseMap", term11028);
        setField(term11022, term11022.getClass(), "pointer", null);
        setBooleanField(term11022, term11022.getClass(), "sealed", false);
        setField(term11021, term11021.getClass(), "parent", term11022);
        setField(term11021, term11021.getClass(), "namespaceMap", term11029);
        setField(term11021, term11021.getClass(), "reverseMap", term11030);
        setField(term11021, term11021.getClass(), "pointer", null);
        setBooleanField(term11021, term11021.getClass(), "sealed", false);
        setField(term11015, term11015.getClass(), "localNamespaceResolver", term11021);
        setIntField(term11015, term11015.getClass(), "index", 1135664017);
        setBooleanField(term11015, term11015.getClass(), "attribute", true);
        setField(term11031, term11031.getClass(), "parent", null);
        setField(term11031, term11031.getClass(), "namespaceMap", term11032);
        setField(term11031, term11031.getClass(), "reverseMap", term11033);
        setField(term11031, term11031.getClass(), "pointer", null);
        setBooleanField(term11031, term11031.getClass(), "sealed", false);
        setField(term11015, term11015.getClass(), "namespaceResolver", term11031);
        setField(term11015, term11015.getClass(), "rootNode", term11034);
        setField(term11015, term11015.getClass(), "parent", null);
        setField(term11015, term11015.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term2836, args);
        assertTrue(recursiveEquals(term2836, term11015));
        assertTrue(recursiveEquals(retValue, "id(\'kBdSllIBVz\')"));
    }

};


