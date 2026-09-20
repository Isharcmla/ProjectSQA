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

public class DOMNodePointer_compareChildNodePointers_109868148185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3518;

    public DOMNodePointer_compareChildNodePointers_109868148185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3519 = new HashMap();
        HashMap term3556 = new HashMap();
        HashMap term3561 = new HashMap();
        HashMap term3567 = new HashMap();
        HashMap term3572 = new HashMap();
        HashMap term3578 = new HashMap();
        HashMap term3583 = new HashMap();
        term3518 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3550 = newInstance(Class.forName("java.lang.Object"));
        Object term3551 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3552 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3553 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3554 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3518, term3518.getClass(), "node", null);
        setField(term3518, term3518.getClass(), "namespaces", term3519);
        setField(term3518, term3518.getClass(), "defaultNamespace", "LvJFtLBaxj");
        setField(term3518, term3518.getClass(), "id", "PHvxnGHptP");
        setIntField(term3518, term3518.getClass(), "index", -1530420153);
        setBooleanField(term3518, term3518.getClass(), "attribute", true);
        setField(term3518, term3518.getClass(), "rootNode", term3550);
        setField(term3554, term3554.getClass(), "parent", null);
        setField(term3554, term3554.getClass(), "namespaceMap", null);
        setField(term3554, term3554.getClass(), "reverseMap", null);
        setField(term3554, term3554.getClass(), "pointer", null);
        setField(term3554, term3554.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3554, term3554.getClass(), "sealed", false);
        setField(term3553, term3553.getClass(), "parent", term3554);
        setField(term3553, term3553.getClass(), "namespaceMap", term3556);
        setField(term3553, term3553.getClass(), "reverseMap", term3561);
        setField(term3553, term3553.getClass(), "pointer", null);
        setField(term3553, term3553.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3553, term3553.getClass(), "sealed", false);
        setField(term3552, term3552.getClass(), "parent", term3553);
        setField(term3552, term3552.getClass(), "namespaceMap", term3567);
        setField(term3552, term3552.getClass(), "reverseMap", term3572);
        setField(term3552, term3552.getClass(), "pointer", null);
        setField(term3552, term3552.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3552, term3552.getClass(), "sealed", false);
        setField(term3551, term3551.getClass(), "parent", term3552);
        setField(term3551, term3551.getClass(), "namespaceMap", term3578);
        setField(term3551, term3551.getClass(), "reverseMap", term3583);
        setField(term3551, term3551.getClass(), "pointer", null);
        setField(term3551, term3551.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3551, term3551.getClass(), "sealed", false);
        setField(term3518, term3518.getClass(), "namespaceResolver", term3551);
        setField(term3518, term3518.getClass(), "parent", null);
        setField(term3518, term3518.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "compareChildNodePointers", argTypes, term3518, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
