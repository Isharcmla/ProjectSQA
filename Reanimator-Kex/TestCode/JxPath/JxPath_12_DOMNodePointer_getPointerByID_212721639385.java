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

public class DOMNodePointer_getPointerByID_212721639385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3424;

    public DOMNodePointer_getPointerByID_212721639385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3425 = new HashMap();
        HashMap term3462 = new HashMap();
        HashMap term3467 = new HashMap();
        HashMap term3473 = new HashMap();
        HashMap term3478 = new HashMap();
        HashMap term3484 = new HashMap();
        HashMap term3489 = new HashMap();
        term3424 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3456 = newInstance(Class.forName("java.lang.Object"));
        Object term3457 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3458 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3459 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3460 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3424, term3424.getClass(), "node", null);
        setField(term3424, term3424.getClass(), "namespaces", term3425);
        setField(term3424, term3424.getClass(), "defaultNamespace", "LvJFtLBaxj");
        setField(term3424, term3424.getClass(), "id", "PHvxnGHptP");
        setIntField(term3424, term3424.getClass(), "index", 1193880199);
        setBooleanField(term3424, term3424.getClass(), "attribute", true);
        setField(term3424, term3424.getClass(), "rootNode", term3456);
        setField(term3460, term3460.getClass(), "parent", null);
        setField(term3460, term3460.getClass(), "namespaceMap", null);
        setField(term3460, term3460.getClass(), "reverseMap", null);
        setField(term3460, term3460.getClass(), "pointer", null);
        setBooleanField(term3460, term3460.getClass(), "sealed", false);
        setField(term3459, term3459.getClass(), "parent", term3460);
        setField(term3459, term3459.getClass(), "namespaceMap", term3462);
        setField(term3459, term3459.getClass(), "reverseMap", term3467);
        setField(term3459, term3459.getClass(), "pointer", null);
        setBooleanField(term3459, term3459.getClass(), "sealed", false);
        setField(term3458, term3458.getClass(), "parent", term3459);
        setField(term3458, term3458.getClass(), "namespaceMap", term3473);
        setField(term3458, term3458.getClass(), "reverseMap", term3478);
        setField(term3458, term3458.getClass(), "pointer", null);
        setBooleanField(term3458, term3458.getClass(), "sealed", false);
        setField(term3457, term3457.getClass(), "parent", term3458);
        setField(term3457, term3457.getClass(), "namespaceMap", term3484);
        setField(term3457, term3457.getClass(), "reverseMap", term3489);
        setField(term3457, term3457.getClass(), "pointer", null);
        setBooleanField(term3457, term3457.getClass(), "sealed", false);
        setField(term3424, term3424.getClass(), "namespaceResolver", term3457);
        setField(term3424, term3424.getClass(), "parent", null);
        setField(term3424, term3424.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "TimdotUuNC";
        try {
            callMethod(klass, "getPointerByID", argTypes, term3424, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


