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

public class JDOMNodePointer_compareChildNodePointers_98093308554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term848;

    public JDOMNodePointer_compareChildNodePointers_98093308554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term867 = new HashMap();
        HashMap term872 = new HashMap();
        HashMap term878 = new HashMap();
        HashMap term883 = new HashMap();
        HashMap term889 = new HashMap();
        HashMap term894 = new HashMap();
        HashMap term906 = new HashMap();
        HashMap term912 = new HashMap();
        HashMap term917 = new HashMap();
        HashMap term923 = new HashMap();
        HashMap term928 = new HashMap();
        term848 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term849 = newInstance(Class.forName("java.lang.Object"));
        Object term862 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term863 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term864 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term865 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term902 = newInstance(Class.forName("java.lang.Object"));
        Object term903 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term904 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term905 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term848, term848.getClass(), "node", term849);
        setField(term848, term848.getClass(), "id", "LQFpaHEwXR");
        setField(term865, term865.getClass(), "parent", null);
        setField(term865, term865.getClass(), "namespaceMap", null);
        setField(term865, term865.getClass(), "reverseMap", null);
        setField(term865, term865.getClass(), "pointer", null);
        setBooleanField(term865, term865.getClass(), "sealed", false);
        setField(term864, term864.getClass(), "parent", term865);
        setField(term864, term864.getClass(), "namespaceMap", term867);
        setField(term864, term864.getClass(), "reverseMap", term872);
        setField(term864, term864.getClass(), "pointer", null);
        setBooleanField(term864, term864.getClass(), "sealed", false);
        setField(term863, term863.getClass(), "parent", term864);
        setField(term863, term863.getClass(), "namespaceMap", term878);
        setField(term863, term863.getClass(), "reverseMap", term883);
        setField(term863, term863.getClass(), "pointer", null);
        setBooleanField(term863, term863.getClass(), "sealed", false);
        setField(term862, term862.getClass(), "parent", term863);
        setField(term862, term862.getClass(), "namespaceMap", term889);
        setField(term862, term862.getClass(), "reverseMap", term894);
        setField(term862, term862.getClass(), "pointer", null);
        setBooleanField(term862, term862.getClass(), "sealed", false);
        setField(term848, term848.getClass(), "localNamespaceResolver", term862);
        setIntField(term848, term848.getClass(), "index", -2038273078);
        setBooleanField(term848, term848.getClass(), "attribute", false);
        setField(term848, term848.getClass(), "rootNode", term902);
        setField(term905, term905.getClass(), "parent", null);
        setField(term905, term905.getClass(), "namespaceMap", term906);
        setField(term905, term905.getClass(), "reverseMap", null);
        setField(term905, term905.getClass(), "pointer", null);
        setBooleanField(term905, term905.getClass(), "sealed", false);
        setField(term904, term904.getClass(), "parent", term905);
        setField(term904, term904.getClass(), "namespaceMap", term912);
        setField(term904, term904.getClass(), "reverseMap", term917);
        setField(term904, term904.getClass(), "pointer", null);
        setBooleanField(term904, term904.getClass(), "sealed", false);
        setField(term903, term903.getClass(), "parent", term904);
        setField(term903, term903.getClass(), "namespaceMap", term923);
        setField(term903, term903.getClass(), "reverseMap", term928);
        setField(term903, term903.getClass(), "pointer", null);
        setBooleanField(term903, term903.getClass(), "sealed", false);
        setField(term848, term848.getClass(), "namespaceResolver", term903);
        setField(term848, term848.getClass(), "parent", null);
        setField(term848, term848.getClass(), "locale", null);
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
            callMethod(klass, "compareChildNodePointers", argTypes, term848, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


