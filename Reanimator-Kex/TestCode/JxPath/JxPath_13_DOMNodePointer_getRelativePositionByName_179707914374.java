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

public class DOMNodePointer_getRelativePositionByName_179707914374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2673;

    public DOMNodePointer_getRelativePositionByName_179707914374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2674 = new HashMap();
        HashMap term2711 = new HashMap();
        HashMap term2716 = new HashMap();
        HashMap term2722 = new HashMap();
        HashMap term2727 = new HashMap();
        HashMap term2733 = new HashMap();
        HashMap term2738 = new HashMap();
        term2673 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2705 = newInstance(Class.forName("java.lang.Object"));
        Object term2706 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2707 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2708 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2709 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2673, term2673.getClass(), "node", null);
        setField(term2673, term2673.getClass(), "namespaces", term2674);
        setField(term2673, term2673.getClass(), "defaultNamespace", "tPlsykYBqO");
        setField(term2673, term2673.getClass(), "id", "bLPjGVBhlX");
        setIntField(term2673, term2673.getClass(), "index", 590364439);
        setBooleanField(term2673, term2673.getClass(), "attribute", false);
        setField(term2673, term2673.getClass(), "rootNode", term2705);
        setField(term2709, term2709.getClass(), "parent", null);
        setField(term2709, term2709.getClass(), "namespaceMap", null);
        setField(term2709, term2709.getClass(), "reverseMap", null);
        setField(term2709, term2709.getClass(), "pointer", null);
        setBooleanField(term2709, term2709.getClass(), "sealed", false);
        setField(term2708, term2708.getClass(), "parent", term2709);
        setField(term2708, term2708.getClass(), "namespaceMap", term2711);
        setField(term2708, term2708.getClass(), "reverseMap", term2716);
        setField(term2708, term2708.getClass(), "pointer", null);
        setBooleanField(term2708, term2708.getClass(), "sealed", false);
        setField(term2707, term2707.getClass(), "parent", term2708);
        setField(term2707, term2707.getClass(), "namespaceMap", term2722);
        setField(term2707, term2707.getClass(), "reverseMap", term2727);
        setField(term2707, term2707.getClass(), "pointer", null);
        setBooleanField(term2707, term2707.getClass(), "sealed", false);
        setField(term2706, term2706.getClass(), "parent", term2707);
        setField(term2706, term2706.getClass(), "namespaceMap", term2733);
        setField(term2706, term2706.getClass(), "reverseMap", term2738);
        setField(term2706, term2706.getClass(), "pointer", null);
        setBooleanField(term2706, term2706.getClass(), "sealed", false);
        setField(term2673, term2673.getClass(), "namespaceResolver", term2706);
        setField(term2673, term2673.getClass(), "parent", null);
        setField(term2673, term2673.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionByName", argTypes, term2673, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


