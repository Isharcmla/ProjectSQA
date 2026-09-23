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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_remove_41018104272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2711;

    public DOMNodePointer_remove_41018104272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2712 = new HashMap();
        HashMap term2746 = new HashMap();
        HashMap term2751 = new HashMap();
        HashMap term2757 = new HashMap();
        HashMap term2762 = new HashMap();
        HashMap term2768 = new HashMap();
        HashMap term2773 = new HashMap();
        HashMap term2782 = new HashMap();
        HashMap term2787 = new HashMap();
        term2711 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2741 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2742 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2743 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2744 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2781 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2711, term2711.getClass(), "node", null);
        setField(term2711, term2711.getClass(), "namespaces", term2712);
        setField(term2711, term2711.getClass(), "defaultNamespace", "eqJfYWRaEL");
        setField(term2711, term2711.getClass(), "id", "fhkbdRViHi");
        setField(term2744, term2744.getClass(), "parent", null);
        setField(term2744, term2744.getClass(), "namespaceMap", null);
        setField(term2744, term2744.getClass(), "reverseMap", null);
        setField(term2744, term2744.getClass(), "pointer", null);
        setBooleanField(term2744, term2744.getClass(), "sealed", false);
        setField(term2743, term2743.getClass(), "parent", term2744);
        setField(term2743, term2743.getClass(), "namespaceMap", term2746);
        setField(term2743, term2743.getClass(), "reverseMap", term2751);
        setField(term2743, term2743.getClass(), "pointer", null);
        setBooleanField(term2743, term2743.getClass(), "sealed", false);
        setField(term2742, term2742.getClass(), "parent", term2743);
        setField(term2742, term2742.getClass(), "namespaceMap", term2757);
        setField(term2742, term2742.getClass(), "reverseMap", term2762);
        setField(term2742, term2742.getClass(), "pointer", null);
        setBooleanField(term2742, term2742.getClass(), "sealed", false);
        setField(term2741, term2741.getClass(), "parent", term2742);
        setField(term2741, term2741.getClass(), "namespaceMap", term2768);
        setField(term2741, term2741.getClass(), "reverseMap", term2773);
        setField(term2741, term2741.getClass(), "pointer", null);
        setBooleanField(term2741, term2741.getClass(), "sealed", false);
        setField(term2711, term2711.getClass(), "localNamespaceResolver", term2741);
        setIntField(term2711, term2711.getClass(), "index", -1007160944);
        setBooleanField(term2711, term2711.getClass(), "attribute", true);
        setField(term2781, term2781.getClass(), "parent", null);
        setField(term2781, term2781.getClass(), "namespaceMap", term2782);
        setField(term2781, term2781.getClass(), "reverseMap", term2787);
        setField(term2781, term2781.getClass(), "pointer", null);
        setBooleanField(term2781, term2781.getClass(), "sealed", false);
        setField(term2711, term2711.getClass(), "namespaceResolver", term2781);
        setField(term2711, term2711.getClass(), "exceptionHandler", null);
        setField(term2711, term2711.getClass(), "rootNode", null);
        setField(term2711, term2711.getClass(), "parent", null);
        setField(term2711, term2711.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "remove", argTypes, term2711, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


