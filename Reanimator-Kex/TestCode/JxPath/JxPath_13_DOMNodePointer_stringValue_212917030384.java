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

public class DOMNodePointer_stringValue_212917030384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3333;

    public DOMNodePointer_stringValue_212917030384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3334 = new HashMap();
        HashMap term3371 = new HashMap();
        HashMap term3376 = new HashMap();
        HashMap term3382 = new HashMap();
        HashMap term3387 = new HashMap();
        HashMap term3393 = new HashMap();
        HashMap term3398 = new HashMap();
        term3333 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3365 = newInstance(Class.forName("java.lang.Object"));
        Object term3366 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3367 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3368 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3369 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3333, term3333.getClass(), "node", null);
        setField(term3333, term3333.getClass(), "namespaces", term3334);
        setField(term3333, term3333.getClass(), "defaultNamespace", "bWWfajKbEX");
        setField(term3333, term3333.getClass(), "id", "cAPeiZHKGJ");
        setIntField(term3333, term3333.getClass(), "index", -226514366);
        setBooleanField(term3333, term3333.getClass(), "attribute", true);
        setField(term3333, term3333.getClass(), "rootNode", term3365);
        setField(term3369, term3369.getClass(), "parent", null);
        setField(term3369, term3369.getClass(), "namespaceMap", null);
        setField(term3369, term3369.getClass(), "reverseMap", null);
        setField(term3369, term3369.getClass(), "pointer", null);
        setBooleanField(term3369, term3369.getClass(), "sealed", false);
        setField(term3368, term3368.getClass(), "parent", term3369);
        setField(term3368, term3368.getClass(), "namespaceMap", term3371);
        setField(term3368, term3368.getClass(), "reverseMap", term3376);
        setField(term3368, term3368.getClass(), "pointer", null);
        setBooleanField(term3368, term3368.getClass(), "sealed", false);
        setField(term3367, term3367.getClass(), "parent", term3368);
        setField(term3367, term3367.getClass(), "namespaceMap", term3382);
        setField(term3367, term3367.getClass(), "reverseMap", term3387);
        setField(term3367, term3367.getClass(), "pointer", null);
        setBooleanField(term3367, term3367.getClass(), "sealed", false);
        setField(term3366, term3366.getClass(), "parent", term3367);
        setField(term3366, term3366.getClass(), "namespaceMap", term3393);
        setField(term3366, term3366.getClass(), "reverseMap", term3398);
        setField(term3366, term3366.getClass(), "pointer", null);
        setBooleanField(term3366, term3366.getClass(), "sealed", false);
        setField(term3333, term3333.getClass(), "namespaceResolver", term3366);
        setField(term3333, term3333.getClass(), "parent", null);
        setField(term3333, term3333.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "stringValue", argTypes, term3333, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


