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

public class DOMNodePointer_asPath_175231522274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2721;
     Object term10928;

    public DOMNodePointer_asPath_175231522274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2722 = new HashMap();
        HashMap term2756 = new HashMap();
        HashMap term2761 = new HashMap();
        HashMap term2767 = new HashMap();
        HashMap term2772 = new HashMap();
        HashMap term2778 = new HashMap();
        HashMap term2783 = new HashMap();
        HashMap term2793 = new HashMap();
        term2721 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2751 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2752 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2753 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2754 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2791 = newInstance(Class.forName("java.lang.Object"));
        Object term2792 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2721, term2721.getClass(), "node", null);
        setField(term2721, term2721.getClass(), "namespaces", term2722);
        setField(term2721, term2721.getClass(), "defaultNamespace", "uWHnvSvaPl");
        setField(term2721, term2721.getClass(), "id", "kBdSllIBVz");
        setField(term2754, term2754.getClass(), "parent", null);
        setField(term2754, term2754.getClass(), "namespaceMap", null);
        setField(term2754, term2754.getClass(), "reverseMap", null);
        setField(term2754, term2754.getClass(), "pointer", null);
        setBooleanField(term2754, term2754.getClass(), "sealed", false);
        setField(term2753, term2753.getClass(), "parent", term2754);
        setField(term2753, term2753.getClass(), "namespaceMap", term2756);
        setField(term2753, term2753.getClass(), "reverseMap", term2761);
        setField(term2753, term2753.getClass(), "pointer", null);
        setBooleanField(term2753, term2753.getClass(), "sealed", false);
        setField(term2752, term2752.getClass(), "parent", term2753);
        setField(term2752, term2752.getClass(), "namespaceMap", term2767);
        setField(term2752, term2752.getClass(), "reverseMap", term2772);
        setField(term2752, term2752.getClass(), "pointer", null);
        setBooleanField(term2752, term2752.getClass(), "sealed", false);
        setField(term2751, term2751.getClass(), "parent", term2752);
        setField(term2751, term2751.getClass(), "namespaceMap", term2778);
        setField(term2751, term2751.getClass(), "reverseMap", term2783);
        setField(term2751, term2751.getClass(), "pointer", null);
        setBooleanField(term2751, term2751.getClass(), "sealed", false);
        setField(term2721, term2721.getClass(), "localNamespaceResolver", term2751);
        setIntField(term2721, term2721.getClass(), "index", 1135664017);
        setBooleanField(term2721, term2721.getClass(), "attribute", true);
        setField(term2721, term2721.getClass(), "rootNode", term2791);
        setField(term2792, term2792.getClass(), "parent", null);
        setField(term2792, term2792.getClass(), "namespaceMap", term2793);
        setField(term2792, term2792.getClass(), "reverseMap", null);
        setField(term2792, term2792.getClass(), "pointer", null);
        setBooleanField(term2792, term2792.getClass(), "sealed", false);
        setField(term2721, term2721.getClass(), "namespaceResolver", term2792);
        setField(term2721, term2721.getClass(), "parent", null);
        setField(term2721, term2721.getClass(), "locale", null);
        HashMap term10929 = new HashMap();
        HashMap term10938 = new HashMap();
        HashMap term10939 = new HashMap();
        HashMap term10940 = new HashMap();
        HashMap term10941 = new HashMap();
        HashMap term10942 = new HashMap();
        HashMap term10943 = new HashMap();
        HashMap term10946 = new HashMap();
        term10928 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term10934 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10935 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10936 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10937 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10944 = newInstance(Class.forName("java.lang.Object"));
        Object term10945 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term10928, term10928.getClass(), "node", null);
        setField(term10928, term10928.getClass(), "namespaces", term10929);
        setField(term10928, term10928.getClass(), "defaultNamespace", "uWHnvSvaPl");
        setField(term10928, term10928.getClass(), "id", "kBdSllIBVz");
        setField(term10937, term10937.getClass(), "parent", null);
        setField(term10937, term10937.getClass(), "namespaceMap", null);
        setField(term10937, term10937.getClass(), "reverseMap", null);
        setField(term10937, term10937.getClass(), "pointer", null);
        setBooleanField(term10937, term10937.getClass(), "sealed", false);
        setField(term10936, term10936.getClass(), "parent", term10937);
        setField(term10936, term10936.getClass(), "namespaceMap", term10938);
        setField(term10936, term10936.getClass(), "reverseMap", term10939);
        setField(term10936, term10936.getClass(), "pointer", null);
        setBooleanField(term10936, term10936.getClass(), "sealed", false);
        setField(term10935, term10935.getClass(), "parent", term10936);
        setField(term10935, term10935.getClass(), "namespaceMap", term10940);
        setField(term10935, term10935.getClass(), "reverseMap", term10941);
        setField(term10935, term10935.getClass(), "pointer", null);
        setBooleanField(term10935, term10935.getClass(), "sealed", false);
        setField(term10934, term10934.getClass(), "parent", term10935);
        setField(term10934, term10934.getClass(), "namespaceMap", term10942);
        setField(term10934, term10934.getClass(), "reverseMap", term10943);
        setField(term10934, term10934.getClass(), "pointer", null);
        setBooleanField(term10934, term10934.getClass(), "sealed", false);
        setField(term10928, term10928.getClass(), "localNamespaceResolver", term10934);
        setIntField(term10928, term10928.getClass(), "index", 1135664017);
        setBooleanField(term10928, term10928.getClass(), "attribute", true);
        setField(term10928, term10928.getClass(), "rootNode", term10944);
        setField(term10945, term10945.getClass(), "parent", null);
        setField(term10945, term10945.getClass(), "namespaceMap", term10946);
        setField(term10945, term10945.getClass(), "reverseMap", null);
        setField(term10945, term10945.getClass(), "pointer", null);
        setBooleanField(term10945, term10945.getClass(), "sealed", false);
        setField(term10928, term10928.getClass(), "namespaceResolver", term10945);
        setField(term10928, term10928.getClass(), "parent", null);
        setField(term10928, term10928.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term2721, args);
        assertTrue(recursiveEquals(term2721, term10928));
        assertTrue(recursiveEquals(retValue, "id(\'kBdSllIBVz\')"));
    }

};


