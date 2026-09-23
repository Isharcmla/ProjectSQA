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

public class DOMNodePointer_compareChildNodePointers_109868148187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3628;

    public DOMNodePointer_compareChildNodePointers_109868148187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3629 = new HashMap();
        HashMap term3666 = new HashMap();
        HashMap term3671 = new HashMap();
        HashMap term3677 = new HashMap();
        HashMap term3682 = new HashMap();
        HashMap term3688 = new HashMap();
        HashMap term3693 = new HashMap();
        term3628 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3660 = newInstance(Class.forName("java.lang.Object"));
        Object term3661 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3662 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3663 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3664 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3628, term3628.getClass(), "node", null);
        setField(term3628, term3628.getClass(), "namespaces", term3629);
        setField(term3628, term3628.getClass(), "defaultNamespace", "swZVeJAxjt");
        setField(term3628, term3628.getClass(), "id", "xOcJIiQQDu");
        setIntField(term3628, term3628.getClass(), "index", -1530420153);
        setBooleanField(term3628, term3628.getClass(), "attribute", true);
        setField(term3628, term3628.getClass(), "rootNode", term3660);
        setField(term3664, term3664.getClass(), "parent", null);
        setField(term3664, term3664.getClass(), "namespaceMap", null);
        setField(term3664, term3664.getClass(), "reverseMap", null);
        setField(term3664, term3664.getClass(), "pointer", null);
        setBooleanField(term3664, term3664.getClass(), "sealed", false);
        setField(term3663, term3663.getClass(), "parent", term3664);
        setField(term3663, term3663.getClass(), "namespaceMap", term3666);
        setField(term3663, term3663.getClass(), "reverseMap", term3671);
        setField(term3663, term3663.getClass(), "pointer", null);
        setBooleanField(term3663, term3663.getClass(), "sealed", false);
        setField(term3662, term3662.getClass(), "parent", term3663);
        setField(term3662, term3662.getClass(), "namespaceMap", term3677);
        setField(term3662, term3662.getClass(), "reverseMap", term3682);
        setField(term3662, term3662.getClass(), "pointer", null);
        setBooleanField(term3662, term3662.getClass(), "sealed", false);
        setField(term3661, term3661.getClass(), "parent", term3662);
        setField(term3661, term3661.getClass(), "namespaceMap", term3688);
        setField(term3661, term3661.getClass(), "reverseMap", term3693);
        setField(term3661, term3661.getClass(), "pointer", null);
        setBooleanField(term3661, term3661.getClass(), "sealed", false);
        setField(term3628, term3628.getClass(), "namespaceResolver", term3661);
        setField(term3628, term3628.getClass(), "parent", null);
        setField(term3628, term3628.getClass(), "locale", null);
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
            callMethod(klass, "compareChildNodePointers", argTypes, term3628, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


