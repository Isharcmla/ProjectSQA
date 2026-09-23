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
     Object term3958;

    public DOMNodePointer_compareChildNodePointers_109868148187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3959 = new HashMap();
        HashMap term3993 = new HashMap();
        HashMap term3998 = new HashMap();
        HashMap term4004 = new HashMap();
        HashMap term4009 = new HashMap();
        HashMap term4015 = new HashMap();
        HashMap term4020 = new HashMap();
        HashMap term4029 = new HashMap();
        HashMap term4034 = new HashMap();
        term3958 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3988 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3989 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3990 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3991 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4028 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3958, term3958.getClass(), "node", null);
        setField(term3958, term3958.getClass(), "namespaces", term3959);
        setField(term3958, term3958.getClass(), "defaultNamespace", "PkWMRdJcBb");
        setField(term3958, term3958.getClass(), "id", "jSpAteRute");
        setField(term3991, term3991.getClass(), "parent", null);
        setField(term3991, term3991.getClass(), "namespaceMap", null);
        setField(term3991, term3991.getClass(), "reverseMap", null);
        setField(term3991, term3991.getClass(), "pointer", null);
        setBooleanField(term3991, term3991.getClass(), "sealed", false);
        setField(term3990, term3990.getClass(), "parent", term3991);
        setField(term3990, term3990.getClass(), "namespaceMap", term3993);
        setField(term3990, term3990.getClass(), "reverseMap", term3998);
        setField(term3990, term3990.getClass(), "pointer", null);
        setBooleanField(term3990, term3990.getClass(), "sealed", false);
        setField(term3989, term3989.getClass(), "parent", term3990);
        setField(term3989, term3989.getClass(), "namespaceMap", term4004);
        setField(term3989, term3989.getClass(), "reverseMap", term4009);
        setField(term3989, term3989.getClass(), "pointer", null);
        setBooleanField(term3989, term3989.getClass(), "sealed", false);
        setField(term3988, term3988.getClass(), "parent", term3989);
        setField(term3988, term3988.getClass(), "namespaceMap", term4015);
        setField(term3988, term3988.getClass(), "reverseMap", term4020);
        setField(term3988, term3988.getClass(), "pointer", null);
        setBooleanField(term3988, term3988.getClass(), "sealed", false);
        setField(term3958, term3958.getClass(), "localNamespaceResolver", term3988);
        setIntField(term3958, term3958.getClass(), "index", -1530420153);
        setBooleanField(term3958, term3958.getClass(), "attribute", true);
        setField(term4028, term4028.getClass(), "parent", null);
        setField(term4028, term4028.getClass(), "namespaceMap", term4029);
        setField(term4028, term4028.getClass(), "reverseMap", term4034);
        setField(term4028, term4028.getClass(), "pointer", null);
        setBooleanField(term4028, term4028.getClass(), "sealed", false);
        setField(term3958, term3958.getClass(), "namespaceResolver", term4028);
        setField(term3958, term3958.getClass(), "exceptionHandler", null);
        setField(term3958, term3958.getClass(), "rootNode", null);
        setField(term3958, term3958.getClass(), "parent", null);
        setField(term3958, term3958.getClass(), "locale", null);
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
            callMethod(klass, "compareChildNodePointers", argTypes, term3958, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


