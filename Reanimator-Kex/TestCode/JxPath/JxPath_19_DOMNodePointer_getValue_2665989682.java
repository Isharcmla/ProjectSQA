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

public class DOMNodePointer_getValue_2665989682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3558;

    public DOMNodePointer_getValue_2665989682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3559 = new HashMap();
        HashMap term3593 = new HashMap();
        HashMap term3598 = new HashMap();
        HashMap term3604 = new HashMap();
        HashMap term3609 = new HashMap();
        HashMap term3615 = new HashMap();
        HashMap term3620 = new HashMap();
        HashMap term3629 = new HashMap();
        HashMap term3634 = new HashMap();
        term3558 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3588 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3589 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3590 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3591 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3628 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3640 = newInstance(Class.forName("java.lang.Object"));
        setField(term3558, term3558.getClass(), "node", null);
        setField(term3558, term3558.getClass(), "namespaces", term3559);
        setField(term3558, term3558.getClass(), "defaultNamespace", "wGmYcqUkgE");
        setField(term3558, term3558.getClass(), "id", "idgaQsnJpQ");
        setField(term3591, term3591.getClass(), "parent", null);
        setField(term3591, term3591.getClass(), "namespaceMap", null);
        setField(term3591, term3591.getClass(), "reverseMap", null);
        setField(term3591, term3591.getClass(), "pointer", null);
        setBooleanField(term3591, term3591.getClass(), "sealed", false);
        setField(term3590, term3590.getClass(), "parent", term3591);
        setField(term3590, term3590.getClass(), "namespaceMap", term3593);
        setField(term3590, term3590.getClass(), "reverseMap", term3598);
        setField(term3590, term3590.getClass(), "pointer", null);
        setBooleanField(term3590, term3590.getClass(), "sealed", false);
        setField(term3589, term3589.getClass(), "parent", term3590);
        setField(term3589, term3589.getClass(), "namespaceMap", term3604);
        setField(term3589, term3589.getClass(), "reverseMap", term3609);
        setField(term3589, term3589.getClass(), "pointer", null);
        setBooleanField(term3589, term3589.getClass(), "sealed", false);
        setField(term3588, term3588.getClass(), "parent", term3589);
        setField(term3588, term3588.getClass(), "namespaceMap", term3615);
        setField(term3588, term3588.getClass(), "reverseMap", term3620);
        setField(term3588, term3588.getClass(), "pointer", null);
        setBooleanField(term3588, term3588.getClass(), "sealed", false);
        setField(term3558, term3558.getClass(), "localNamespaceResolver", term3588);
        setIntField(term3558, term3558.getClass(), "index", -73683645);
        setBooleanField(term3558, term3558.getClass(), "attribute", true);
        setField(term3628, term3628.getClass(), "parent", null);
        setField(term3628, term3628.getClass(), "namespaceMap", term3629);
        setField(term3628, term3628.getClass(), "reverseMap", term3634);
        setField(term3628, term3628.getClass(), "pointer", null);
        setBooleanField(term3628, term3628.getClass(), "sealed", false);
        setField(term3558, term3558.getClass(), "namespaceResolver", term3628);
        setField(term3558, term3558.getClass(), "rootNode", term3640);
        setField(term3558, term3558.getClass(), "parent", null);
        setField(term3558, term3558.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getValue", argTypes, term3558, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


