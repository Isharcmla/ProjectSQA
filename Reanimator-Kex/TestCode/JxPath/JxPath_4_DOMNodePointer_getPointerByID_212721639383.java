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

public class DOMNodePointer_getPointerByID_212721639383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3402;

    public DOMNodePointer_getPointerByID_212721639383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3403 = new HashMap();
        HashMap term3440 = new HashMap();
        HashMap term3445 = new HashMap();
        HashMap term3451 = new HashMap();
        HashMap term3456 = new HashMap();
        HashMap term3462 = new HashMap();
        HashMap term3467 = new HashMap();
        term3402 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3434 = newInstance(Class.forName("java.lang.Object"));
        Object term3435 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3436 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3437 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3438 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3402, term3402.getClass(), "node", null);
        setField(term3402, term3402.getClass(), "namespaces", term3403);
        setField(term3402, term3402.getClass(), "defaultNamespace", "cAPeiZHKGJ");
        setField(term3402, term3402.getClass(), "id", "LvJFtLBaxj");
        setIntField(term3402, term3402.getClass(), "index", 1193880199);
        setBooleanField(term3402, term3402.getClass(), "attribute", true);
        setField(term3402, term3402.getClass(), "rootNode", term3434);
        setField(term3438, term3438.getClass(), "parent", null);
        setField(term3438, term3438.getClass(), "namespaceMap", null);
        setField(term3438, term3438.getClass(), "reverseMap", null);
        setField(term3438, term3438.getClass(), "pointer", null);
        setField(term3438, term3438.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3438, term3438.getClass(), "sealed", false);
        setField(term3437, term3437.getClass(), "parent", term3438);
        setField(term3437, term3437.getClass(), "namespaceMap", term3440);
        setField(term3437, term3437.getClass(), "reverseMap", term3445);
        setField(term3437, term3437.getClass(), "pointer", null);
        setField(term3437, term3437.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3437, term3437.getClass(), "sealed", false);
        setField(term3436, term3436.getClass(), "parent", term3437);
        setField(term3436, term3436.getClass(), "namespaceMap", term3451);
        setField(term3436, term3436.getClass(), "reverseMap", term3456);
        setField(term3436, term3436.getClass(), "pointer", null);
        setField(term3436, term3436.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3436, term3436.getClass(), "sealed", false);
        setField(term3435, term3435.getClass(), "parent", term3436);
        setField(term3435, term3435.getClass(), "namespaceMap", term3462);
        setField(term3435, term3435.getClass(), "reverseMap", term3467);
        setField(term3435, term3435.getClass(), "pointer", null);
        setField(term3435, term3435.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3435, term3435.getClass(), "sealed", false);
        setField(term3402, term3402.getClass(), "namespaceResolver", term3435);
        setField(term3402, term3402.getClass(), "parent", null);
        setField(term3402, term3402.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "PHvxnGHptP";
        try {
            callMethod(klass, "getPointerByID", argTypes, term3402, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


