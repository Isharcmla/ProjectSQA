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
import org.apache.commons.jxpath.JXPathException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_createAttribute_192996872673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2688;
     Object term2779;

    public JDOMNodePointer_createAttribute_192996872673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2707 = new HashMap();
        HashMap term2712 = new HashMap();
        HashMap term2718 = new HashMap();
        HashMap term2723 = new HashMap();
        HashMap term2729 = new HashMap();
        HashMap term2734 = new HashMap();
        HashMap term2745 = new HashMap();
        HashMap term2750 = new HashMap();
        HashMap term2756 = new HashMap();
        HashMap term2761 = new HashMap();
        HashMap term2767 = new HashMap();
        HashMap term2772 = new HashMap();
        term2688 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2689 = newInstance(Class.forName("java.lang.Object"));
        Object term2702 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2703 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2704 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2705 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2742 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2743 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2744 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2778 = newInstance(Class.forName("java.lang.Object"));
        setField(term2688, term2688.getClass(), "node", term2689);
        setField(term2688, term2688.getClass(), "id", "wSQxaModmm");
        setField(term2705, term2705.getClass(), "parent", null);
        setField(term2705, term2705.getClass(), "namespaceMap", null);
        setField(term2705, term2705.getClass(), "reverseMap", null);
        setField(term2705, term2705.getClass(), "pointer", null);
        setBooleanField(term2705, term2705.getClass(), "sealed", false);
        setField(term2704, term2704.getClass(), "parent", term2705);
        setField(term2704, term2704.getClass(), "namespaceMap", term2707);
        setField(term2704, term2704.getClass(), "reverseMap", term2712);
        setField(term2704, term2704.getClass(), "pointer", null);
        setBooleanField(term2704, term2704.getClass(), "sealed", false);
        setField(term2703, term2703.getClass(), "parent", term2704);
        setField(term2703, term2703.getClass(), "namespaceMap", term2718);
        setField(term2703, term2703.getClass(), "reverseMap", term2723);
        setField(term2703, term2703.getClass(), "pointer", null);
        setBooleanField(term2703, term2703.getClass(), "sealed", false);
        setField(term2702, term2702.getClass(), "parent", term2703);
        setField(term2702, term2702.getClass(), "namespaceMap", term2729);
        setField(term2702, term2702.getClass(), "reverseMap", term2734);
        setField(term2702, term2702.getClass(), "pointer", null);
        setBooleanField(term2702, term2702.getClass(), "sealed", false);
        setField(term2688, term2688.getClass(), "localNamespaceResolver", term2702);
        setIntField(term2688, term2688.getClass(), "index", -1007160944);
        setBooleanField(term2688, term2688.getClass(), "attribute", true);
        setField(term2744, term2744.getClass(), "parent", null);
        setField(term2744, term2744.getClass(), "namespaceMap", term2745);
        setField(term2744, term2744.getClass(), "reverseMap", term2750);
        setField(term2744, term2744.getClass(), "pointer", null);
        setBooleanField(term2744, term2744.getClass(), "sealed", false);
        setField(term2743, term2743.getClass(), "parent", term2744);
        setField(term2743, term2743.getClass(), "namespaceMap", term2756);
        setField(term2743, term2743.getClass(), "reverseMap", term2761);
        setField(term2743, term2743.getClass(), "pointer", null);
        setBooleanField(term2743, term2743.getClass(), "sealed", false);
        setField(term2742, term2742.getClass(), "parent", term2743);
        setField(term2742, term2742.getClass(), "namespaceMap", term2767);
        setField(term2742, term2742.getClass(), "reverseMap", term2772);
        setField(term2742, term2742.getClass(), "pointer", null);
        setBooleanField(term2742, term2742.getClass(), "sealed", false);
        setField(term2688, term2688.getClass(), "namespaceResolver", term2742);
        setField(term2688, term2688.getClass(), "rootNode", term2778);
        setField(term2688, term2688.getClass(), "parent", null);
        setField(term2688, term2688.getClass(), "locale", null);
        term2779 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2779, term2779.getClass(), "prefix", "UlajhuVLaP");
        setField(term2779, term2779.getClass(), "name", "gGSMzuGICf");
        setField(term2779, term2779.getClass(), "qualifiedName", "hxCBltsObl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2779;
        try {
            callMethod(klass, "createAttribute", argTypes, term2688, args);
            assertTrue(false);
        }
        catch (JXPathException e) {
        }

    }

};


