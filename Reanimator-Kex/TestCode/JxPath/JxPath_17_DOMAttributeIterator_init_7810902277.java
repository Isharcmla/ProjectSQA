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
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;

public class DOMAttributeIterator_init_7810902277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151165;
     Object term151701;
     Object term151940;
     Object term151954;
     Object term151960;

    public DOMAttributeIterator_init_7810902277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term151045 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setIntField(term151045, term151045.getClass(), "position", 0);
        setField(term151045, term151045.getClass(), "parent", null);
        setField(term151045, term151045.getClass(), "name", null);
        setField(term151045, term151045.getClass(), "attributes", null);
        HashMap term151397 = new HashMap();
        ((HashMap) term151397).put((Object)null, (Object)null);
        ((HashMap) term151397).put((Object)null, (Object)null);
        ((HashMap) term151397).put((Object)null, (Object)null);
        ((HashMap) term151397).put((Object)null, (Object)null);
        ((HashMap) term151397).put((Object)null, (Object)null);
        ((HashMap) term151397).put((Object)null, (Object)null);
        ((HashMap) term151397).put((Object)null, (Object)null);
        ((HashMap) term151397).put((Object)null, (Object)null);
        ((HashMap) term151397).put((Object)null, (Object)null);
        ((HashMap) term151397).put((Object)null, (Object)null);
        ((HashMap) term151397).put((Object)null, (Object)null);
        ((HashMap) term151397).put((Object)null, (Object)null);
        ((HashMap) term151397).put((Object)null, (Object)null);
        ((HashMap) term151397).put((Object)null, (Object)null);
        ((HashMap) term151397).put((Object)null, (Object)null);
        ((HashMap) term151397).put((Object)null, (Object)null);
        ((HashMap) term151397).put((Object)null, (Object)null);
        ((HashMap) term151397).put((Object)null, (Object)null);
        term151165 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term151251 = newInstance(Class.forName("org.apache.html.dom.HTMLDListElementImpl"));
        Object term151349 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term151627 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer"));
        setField(term151165, term151165.getClass(), "value", term151251);
        setField(term151349, term151349.getClass(), "namespaceMap", term151397);
        setField(term151349, term151349.getClass(), "parent", null);
        setField(term151349, term151349.getClass(), "pointer", term151627);
        setField(term151165, term151165.getClass(), "namespaceResolver", term151349);
        term151701 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term151701, term151701.getClass(), "name", "     ");
        setField(term151701, term151701.getClass(), "prefix", "");
        HashMap term151944 = new HashMap();
        ArrayList term151952 = new ArrayList();
        term151940 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term151941 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term151942 = newInstance(Class.forName("org.apache.html.dom.HTMLDListElementImpl"));
        Object term151943 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term151946 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer"));
        Object term151947 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term151941, term151941.getClass(), "name", null);
        setField(term151941, term151941.getClass(), "bean", null);
        setField(term151941, term151941.getClass(), "handler", null);
        setField(term151942, term151942.getClass(), "name", null);
        setField(term151942, term151942.getClass(), "attributes", null);
        setField(term151942, term151942.getClass(), "ownerDocument", null);
        setField(term151942, term151942.getClass(), "firstChild", null);
        setField(term151942, term151942.getClass(), "fNodeListCache", null);
        setField(term151942, term151942.getClass(), "previousSibling", null);
        setField(term151942, term151942.getClass(), "nextSibling", null);
        setField(term151942, term151942.getClass(), "ownerNode", null);
        setShortField(term151942, term151942.getClass(), "flags", (short) 0);
        setField(term151941, term151941.getClass(), "value", term151942);
        setIntField(term151941, term151941.getClass(), "index", 0);
        setBooleanField(term151941, term151941.getClass(), "attribute", false);
        setField(term151941, term151941.getClass(), "rootNode", null);
        setField(term151943, term151943.getClass(), "parent", null);
        setField(term151943, term151943.getClass(), "namespaceMap", term151944);
        setField(term151943, term151943.getClass(), "reverseMap", null);
        setField(term151946, term151946.getClass(), "prefix", null);
        setField(term151946, term151946.getClass(), "namespaceURI", null);
        setIntField(term151946, term151946.getClass(), "index", 0);
        setBooleanField(term151946, term151946.getClass(), "attribute", false);
        setField(term151946, term151946.getClass(), "rootNode", null);
        setField(term151946, term151946.getClass(), "namespaceResolver", null);
        setField(term151946, term151946.getClass(), "parent", null);
        setField(term151946, term151946.getClass(), "locale", null);
        setField(term151943, term151943.getClass(), "pointer", term151946);
        setBooleanField(term151943, term151943.getClass(), "sealed", false);
        setField(term151941, term151941.getClass(), "namespaceResolver", term151943);
        setField(term151941, term151941.getClass(), "parent", null);
        setField(term151941, term151941.getClass(), "locale", null);
        setField(term151940, term151940.getClass(), "parent", term151941);
        setField(term151947, term151947.getClass(), "prefix", "");
        setField(term151947, term151947.getClass(), "name", "     ");
        setField(term151947, term151947.getClass(), "qualifiedName", null);
        setField(term151940, term151940.getClass(), "name", term151947);
        setField(term151940, term151940.getClass(), "attributes", term151952);
        setIntField(term151940, term151940.getClass(), "position", 0);
        HashMap term151957 = new HashMap();
        term151954 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term151955 = newInstance(Class.forName("org.apache.html.dom.HTMLDListElementImpl"));
        Object term151956 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term151959 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer"));
        setField(term151954, term151954.getClass(), "name", null);
        setField(term151954, term151954.getClass(), "bean", null);
        setField(term151954, term151954.getClass(), "handler", null);
        setField(term151955, term151955.getClass(), "name", null);
        setField(term151955, term151955.getClass(), "attributes", null);
        setField(term151955, term151955.getClass(), "ownerDocument", null);
        setField(term151955, term151955.getClass(), "firstChild", null);
        setField(term151955, term151955.getClass(), "fNodeListCache", null);
        setField(term151955, term151955.getClass(), "previousSibling", null);
        setField(term151955, term151955.getClass(), "nextSibling", null);
        setField(term151955, term151955.getClass(), "ownerNode", null);
        setShortField(term151955, term151955.getClass(), "flags", (short) 0);
        setField(term151954, term151954.getClass(), "value", term151955);
        setIntField(term151954, term151954.getClass(), "index", 0);
        setBooleanField(term151954, term151954.getClass(), "attribute", false);
        setField(term151954, term151954.getClass(), "rootNode", null);
        setField(term151956, term151956.getClass(), "parent", null);
        setField(term151956, term151956.getClass(), "namespaceMap", term151957);
        setField(term151956, term151956.getClass(), "reverseMap", null);
        setField(term151959, term151959.getClass(), "prefix", null);
        setField(term151959, term151959.getClass(), "namespaceURI", null);
        setIntField(term151959, term151959.getClass(), "index", 0);
        setBooleanField(term151959, term151959.getClass(), "attribute", false);
        setField(term151959, term151959.getClass(), "rootNode", null);
        setField(term151959, term151959.getClass(), "namespaceResolver", null);
        setField(term151959, term151959.getClass(), "parent", null);
        setField(term151959, term151959.getClass(), "locale", null);
        setField(term151956, term151956.getClass(), "pointer", term151959);
        setBooleanField(term151956, term151956.getClass(), "sealed", false);
        setField(term151954, term151954.getClass(), "namespaceResolver", term151956);
        setField(term151954, term151954.getClass(), "parent", null);
        setField(term151954, term151954.getClass(), "locale", null);
        term151960 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term151960, term151960.getClass(), "prefix", "");
        setField(term151960, term151960.getClass(), "name", "     ");
        setField(term151960, term151960.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term151165;
        args[1] = term151701;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term151940));
        assertTrue(recursiveEquals(term151165, term151954));
        assertTrue(recursiveEquals(term151701, term151960));
    }

};


