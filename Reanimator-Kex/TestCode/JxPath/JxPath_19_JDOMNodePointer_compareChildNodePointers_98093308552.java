package org.apache.commons.jxpath.ri.model.jdom;

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
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_compareChildNodePointers_98093308552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term883;

    public JDOMNodePointer_compareChildNodePointers_98093308552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term902 = new HashMap();
        HashMap term907 = new HashMap();
        HashMap term913 = new HashMap();
        HashMap term918 = new HashMap();
        HashMap term924 = new HashMap();
        HashMap term929 = new HashMap();
        HashMap term940 = new HashMap();
        HashMap term945 = new HashMap();
        HashMap term951 = new HashMap();
        HashMap term956 = new HashMap();
        HashMap term962 = new HashMap();
        HashMap term967 = new HashMap();
        term883 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term884 = newInstance(Class.forName("java.lang.Object"));
        Object term897 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term898 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term899 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term900 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term937 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term938 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term939 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term973 = newInstance(Class.forName("java.lang.Object"));
        setField(term883, term883.getClass(), "node", term884);
        setField(term883, term883.getClass(), "id", "LQFpaHEwXR");
        setField(term900, term900.getClass(), "parent", null);
        setField(term900, term900.getClass(), "namespaceMap", null);
        setField(term900, term900.getClass(), "reverseMap", null);
        setField(term900, term900.getClass(), "pointer", null);
        setBooleanField(term900, term900.getClass(), "sealed", false);
        setField(term899, term899.getClass(), "parent", term900);
        setField(term899, term899.getClass(), "namespaceMap", term902);
        setField(term899, term899.getClass(), "reverseMap", term907);
        setField(term899, term899.getClass(), "pointer", null);
        setBooleanField(term899, term899.getClass(), "sealed", false);
        setField(term898, term898.getClass(), "parent", term899);
        setField(term898, term898.getClass(), "namespaceMap", term913);
        setField(term898, term898.getClass(), "reverseMap", term918);
        setField(term898, term898.getClass(), "pointer", null);
        setBooleanField(term898, term898.getClass(), "sealed", false);
        setField(term897, term897.getClass(), "parent", term898);
        setField(term897, term897.getClass(), "namespaceMap", term924);
        setField(term897, term897.getClass(), "reverseMap", term929);
        setField(term897, term897.getClass(), "pointer", null);
        setBooleanField(term897, term897.getClass(), "sealed", false);
        setField(term883, term883.getClass(), "localNamespaceResolver", term897);
        setIntField(term883, term883.getClass(), "index", -2038273078);
        setBooleanField(term883, term883.getClass(), "attribute", false);
        setField(term939, term939.getClass(), "parent", null);
        setField(term939, term939.getClass(), "namespaceMap", term940);
        setField(term939, term939.getClass(), "reverseMap", term945);
        setField(term939, term939.getClass(), "pointer", null);
        setBooleanField(term939, term939.getClass(), "sealed", false);
        setField(term938, term938.getClass(), "parent", term939);
        setField(term938, term938.getClass(), "namespaceMap", term951);
        setField(term938, term938.getClass(), "reverseMap", term956);
        setField(term938, term938.getClass(), "pointer", null);
        setBooleanField(term938, term938.getClass(), "sealed", false);
        setField(term937, term937.getClass(), "parent", term938);
        setField(term937, term937.getClass(), "namespaceMap", term962);
        setField(term937, term937.getClass(), "reverseMap", term967);
        setField(term937, term937.getClass(), "pointer", null);
        setBooleanField(term937, term937.getClass(), "sealed", false);
        setField(term883, term883.getClass(), "namespaceResolver", term937);
        setField(term883, term883.getClass(), "rootNode", term973);
        setField(term883, term883.getClass(), "parent", null);
        setField(term883, term883.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "compareChildNodePointers", argTypes, term883, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


