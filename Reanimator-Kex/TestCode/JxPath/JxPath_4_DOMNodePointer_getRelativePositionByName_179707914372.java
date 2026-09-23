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

public class DOMNodePointer_getRelativePositionByName_179707914372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2651;

    public DOMNodePointer_getRelativePositionByName_179707914372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2652 = new HashMap();
        HashMap term2689 = new HashMap();
        HashMap term2694 = new HashMap();
        HashMap term2700 = new HashMap();
        HashMap term2705 = new HashMap();
        HashMap term2711 = new HashMap();
        HashMap term2716 = new HashMap();
        term2651 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2683 = newInstance(Class.forName("java.lang.Object"));
        Object term2684 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2685 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2686 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2687 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2651, term2651.getClass(), "node", null);
        setField(term2651, term2651.getClass(), "namespaces", term2652);
        setField(term2651, term2651.getClass(), "defaultNamespace", "TJmVBGfTML");
        setField(term2651, term2651.getClass(), "id", "tPlsykYBqO");
        setIntField(term2651, term2651.getClass(), "index", 590364439);
        setBooleanField(term2651, term2651.getClass(), "attribute", false);
        setField(term2651, term2651.getClass(), "rootNode", term2683);
        setField(term2687, term2687.getClass(), "parent", null);
        setField(term2687, term2687.getClass(), "namespaceMap", null);
        setField(term2687, term2687.getClass(), "reverseMap", null);
        setField(term2687, term2687.getClass(), "pointer", null);
        setField(term2687, term2687.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2687, term2687.getClass(), "sealed", false);
        setField(term2686, term2686.getClass(), "parent", term2687);
        setField(term2686, term2686.getClass(), "namespaceMap", term2689);
        setField(term2686, term2686.getClass(), "reverseMap", term2694);
        setField(term2686, term2686.getClass(), "pointer", null);
        setField(term2686, term2686.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2686, term2686.getClass(), "sealed", false);
        setField(term2685, term2685.getClass(), "parent", term2686);
        setField(term2685, term2685.getClass(), "namespaceMap", term2700);
        setField(term2685, term2685.getClass(), "reverseMap", term2705);
        setField(term2685, term2685.getClass(), "pointer", null);
        setField(term2685, term2685.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2685, term2685.getClass(), "sealed", false);
        setField(term2684, term2684.getClass(), "parent", term2685);
        setField(term2684, term2684.getClass(), "namespaceMap", term2711);
        setField(term2684, term2684.getClass(), "reverseMap", term2716);
        setField(term2684, term2684.getClass(), "pointer", null);
        setField(term2684, term2684.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2684, term2684.getClass(), "sealed", false);
        setField(term2651, term2651.getClass(), "namespaceResolver", term2684);
        setField(term2651, term2651.getClass(), "parent", null);
        setField(term2651, term2651.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionByName", argTypes, term2651, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


