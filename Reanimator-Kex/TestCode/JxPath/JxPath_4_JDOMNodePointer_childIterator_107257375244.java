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
import java.lang.Boolean;

public class JDOMNodePointer_childIterator_107257375244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62;
     Object term117;
     Object term2922;
     Object term2915;

    public JDOMNodePointer_childIterator_107257375244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term84 = new HashMap();
        HashMap term89 = new HashMap();
        HashMap term95 = new HashMap();
        HashMap term100 = new HashMap();
        HashMap term106 = new HashMap();
        HashMap term111 = new HashMap();
        term62 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term63 = newInstance(Class.forName("java.lang.Object"));
        Object term78 = newInstance(Class.forName("java.lang.Object"));
        Object term79 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term80 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term81 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term82 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term62, term62.getClass(), "node", term63);
        setField(term62, term62.getClass(), "id", "sjlJAEtRrb");
        setIntField(term62, term62.getClass(), "index", 568599855);
        setBooleanField(term62, term62.getClass(), "attribute", false);
        setField(term62, term62.getClass(), "rootNode", term78);
        setField(term82, term82.getClass(), "parent", null);
        setField(term82, term82.getClass(), "namespaceMap", null);
        setField(term82, term82.getClass(), "reverseMap", null);
        setField(term82, term82.getClass(), "pointer", null);
        setField(term82, term82.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term82, term82.getClass(), "sealed", false);
        setField(term81, term81.getClass(), "parent", term82);
        setField(term81, term81.getClass(), "namespaceMap", term84);
        setField(term81, term81.getClass(), "reverseMap", term89);
        setField(term81, term81.getClass(), "pointer", null);
        setField(term81, term81.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term81, term81.getClass(), "sealed", false);
        setField(term80, term80.getClass(), "parent", term81);
        setField(term80, term80.getClass(), "namespaceMap", term95);
        setField(term80, term80.getClass(), "reverseMap", term100);
        setField(term80, term80.getClass(), "pointer", null);
        setField(term80, term80.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term80, term80.getClass(), "sealed", false);
        setField(term79, term79.getClass(), "parent", term80);
        setField(term79, term79.getClass(), "namespaceMap", term106);
        setField(term79, term79.getClass(), "reverseMap", term111);
        setField(term79, term79.getClass(), "pointer", null);
        setField(term79, term79.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term79, term79.getClass(), "sealed", false);
        setField(term62, term62.getClass(), "namespaceResolver", term79);
        setField(term62, term62.getClass(), "parent", null);
        setField(term62, term62.getClass(), "locale", null);
        term117 = new Boolean(false);
        HashMap term2930 = new HashMap();
        HashMap term2931 = new HashMap();
        HashMap term2932 = new HashMap();
        HashMap term2933 = new HashMap();
        term2922 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2923 = newInstance(Class.forName("java.lang.Object"));
        Object term2926 = newInstance(Class.forName("java.lang.Object"));
        Object term2927 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2928 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2929 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2922, term2922.getClass(), "node", term2923);
        setField(term2922, term2922.getClass(), "id", "sjlJAEtRrb");
        setIntField(term2922, term2922.getClass(), "index", 568599855);
        setBooleanField(term2922, term2922.getClass(), "attribute", false);
        setField(term2922, term2922.getClass(), "rootNode", term2926);
        setField(term2929, term2929.getClass(), "parent", null);
        setField(term2929, term2929.getClass(), "namespaceMap", null);
        setField(term2929, term2929.getClass(), "reverseMap", null);
        setField(term2929, term2929.getClass(), "pointer", null);
        setField(term2929, term2929.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2929, term2929.getClass(), "sealed", false);
        setField(term2928, term2928.getClass(), "parent", term2929);
        setField(term2928, term2928.getClass(), "namespaceMap", term2930);
        setField(term2928, term2928.getClass(), "reverseMap", term2931);
        setField(term2928, term2928.getClass(), "pointer", null);
        setField(term2928, term2928.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2928, term2928.getClass(), "sealed", false);
        setField(term2927, term2927.getClass(), "parent", term2928);
        setField(term2927, term2927.getClass(), "namespaceMap", term2932);
        setField(term2927, term2927.getClass(), "reverseMap", term2933);
        setField(term2927, term2927.getClass(), "pointer", null);
        setField(term2927, term2927.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2927, term2927.getClass(), "sealed", false);
        setField(term2922, term2922.getClass(), "namespaceResolver", term2927);
        setField(term2922, term2922.getClass(), "parent", null);
        setField(term2922, term2922.getClass(), "locale", null);
        HashMap term2779 = new HashMap();
        HashMap term2784 = new HashMap();
        HashMap term2790 = new HashMap();
        HashMap term2795 = new HashMap();
        term2915 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator"));
        Object term2758 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2759 = newInstance(Class.forName("java.lang.Object"));
        Object term2774 = newInstance(Class.forName("java.lang.Object"));
        Object term2775 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2776 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2777 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2919 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term2758, term2758.getClass(), "node", term2759);
        setField(term2758, term2758.getClass(), "id", "sjlJAEtRrb");
        setIntField(term2758, term2758.getClass(), "index", 568599855);
        setBooleanField(term2758, term2758.getClass(), "attribute", false);
        setField(term2758, term2758.getClass(), "rootNode", term2774);
        setField(term2777, term2777.getClass(), "parent", null);
        setField(term2777, term2777.getClass(), "namespaceMap", null);
        setField(term2777, term2777.getClass(), "reverseMap", null);
        setField(term2777, term2777.getClass(), "pointer", null);
        setField(term2777, term2777.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2777, term2777.getClass(), "sealed", false);
        setField(term2776, term2776.getClass(), "parent", term2777);
        setField(term2776, term2776.getClass(), "namespaceMap", term2779);
        setField(term2776, term2776.getClass(), "reverseMap", term2784);
        setField(term2776, term2776.getClass(), "pointer", null);
        setField(term2776, term2776.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2776, term2776.getClass(), "sealed", false);
        setField(term2775, term2775.getClass(), "parent", term2776);
        setField(term2775, term2775.getClass(), "namespaceMap", term2790);
        setField(term2775, term2775.getClass(), "reverseMap", term2795);
        setField(term2775, term2775.getClass(), "pointer", null);
        setField(term2775, term2775.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2775, term2775.getClass(), "sealed", false);
        setField(term2758, term2758.getClass(), "namespaceResolver", term2775);
        setField(term2758, term2758.getClass(), "parent", null);
        setField(term2758, term2758.getClass(), "locale", null);
        setField(term2915, term2915.getClass(), "parent", term2758);
        setField(term2915, term2915.getClass(), "nodeTest", null);
        setBooleanField(term2915, term2915.getClass(), "reverse", false);
        setIntField(term2915, term2915.getClass(), "position", 0);
        setIntField(term2915, term2915.getClass(), "index", 0);
        setIntField(term2919, term2919.getClass(), "modCount", 0);
        setField(term2915, term2915.getClass(), "children", term2919);
        setField(term2915, term2915.getClass(), "child", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term117;
        args[2] = null;
        Object retValue = callMethod(klass, "childIterator", argTypes, term62, args);
        assertTrue(recursiveEquals(term62, term2922));
        assertTrue(recursiveEquals(term117, false));
        assertTrue(recursiveEquals(retValue, term2915));
    }

};


