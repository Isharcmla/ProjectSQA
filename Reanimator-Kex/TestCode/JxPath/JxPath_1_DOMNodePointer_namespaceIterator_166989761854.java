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

public class DOMNodePointer_namespaceIterator_166989761854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term718;

    public DOMNodePointer_namespaceIterator_166989761854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term719 = new HashMap();
        HashMap term756 = new HashMap();
        HashMap term761 = new HashMap();
        HashMap term767 = new HashMap();
        HashMap term772 = new HashMap();
        HashMap term778 = new HashMap();
        HashMap term783 = new HashMap();
        term718 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term750 = newInstance(Class.forName("java.lang.Object"));
        Object term751 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term752 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term753 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term754 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term718, term718.getClass(), "node", null);
        setField(term718, term718.getClass(), "namespaces", term719);
        setField(term718, term718.getClass(), "defaultNamespace", "HyxfbSQYBe");
        setField(term718, term718.getClass(), "id", "pCTimMblYc");
        setIntField(term718, term718.getClass(), "index", -1955890973);
        setBooleanField(term718, term718.getClass(), "attribute", true);
        setField(term718, term718.getClass(), "rootNode", term750);
        setField(term754, term754.getClass(), "parent", null);
        setField(term754, term754.getClass(), "namespaceMap", null);
        setField(term754, term754.getClass(), "reverseMap", null);
        setField(term754, term754.getClass(), "pointer", null);
        setField(term754, term754.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term754, term754.getClass(), "sealed", false);
        setField(term753, term753.getClass(), "parent", term754);
        setField(term753, term753.getClass(), "namespaceMap", term756);
        setField(term753, term753.getClass(), "reverseMap", term761);
        setField(term753, term753.getClass(), "pointer", null);
        setField(term753, term753.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term753, term753.getClass(), "sealed", false);
        setField(term752, term752.getClass(), "parent", term753);
        setField(term752, term752.getClass(), "namespaceMap", term767);
        setField(term752, term752.getClass(), "reverseMap", term772);
        setField(term752, term752.getClass(), "pointer", null);
        setField(term752, term752.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term752, term752.getClass(), "sealed", false);
        setField(term751, term751.getClass(), "parent", term752);
        setField(term751, term751.getClass(), "namespaceMap", term778);
        setField(term751, term751.getClass(), "reverseMap", term783);
        setField(term751, term751.getClass(), "pointer", null);
        setField(term751, term751.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term751, term751.getClass(), "sealed", false);
        setField(term718, term718.getClass(), "namespaceResolver", term751);
        setField(term718, term718.getClass(), "parent", null);
        setField(term718, term718.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "namespaceIterator", argTypes, term718, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
