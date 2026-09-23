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
     Object term3889;

    public DOMNodePointer_compareChildNodePointers_109868148185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3890 = new HashMap();
        HashMap term3924 = new HashMap();
        HashMap term3929 = new HashMap();
        HashMap term3935 = new HashMap();
        HashMap term3940 = new HashMap();
        HashMap term3946 = new HashMap();
        HashMap term3951 = new HashMap();
        HashMap term3960 = new HashMap();
        HashMap term3965 = new HashMap();
        term3889 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3919 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3920 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3921 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3922 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3959 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3971 = newInstance(Class.forName("java.lang.Object"));
        setField(term3889, term3889.getClass(), "node", null);
        setField(term3889, term3889.getClass(), "namespaces", term3890);
        setField(term3889, term3889.getClass(), "defaultNamespace", "PHvxnGHptP");
        setField(term3889, term3889.getClass(), "id", "TimdotUuNC");
        setField(term3922, term3922.getClass(), "parent", null);
        setField(term3922, term3922.getClass(), "namespaceMap", null);
        setField(term3922, term3922.getClass(), "reverseMap", null);
        setField(term3922, term3922.getClass(), "pointer", null);
        setBooleanField(term3922, term3922.getClass(), "sealed", false);
        setField(term3921, term3921.getClass(), "parent", term3922);
        setField(term3921, term3921.getClass(), "namespaceMap", term3924);
        setField(term3921, term3921.getClass(), "reverseMap", term3929);
        setField(term3921, term3921.getClass(), "pointer", null);
        setBooleanField(term3921, term3921.getClass(), "sealed", false);
        setField(term3920, term3920.getClass(), "parent", term3921);
        setField(term3920, term3920.getClass(), "namespaceMap", term3935);
        setField(term3920, term3920.getClass(), "reverseMap", term3940);
        setField(term3920, term3920.getClass(), "pointer", null);
        setBooleanField(term3920, term3920.getClass(), "sealed", false);
        setField(term3919, term3919.getClass(), "parent", term3920);
        setField(term3919, term3919.getClass(), "namespaceMap", term3946);
        setField(term3919, term3919.getClass(), "reverseMap", term3951);
        setField(term3919, term3919.getClass(), "pointer", null);
        setBooleanField(term3919, term3919.getClass(), "sealed", false);
        setField(term3889, term3889.getClass(), "localNamespaceResolver", term3919);
        setIntField(term3889, term3889.getClass(), "index", -1087774327);
        setBooleanField(term3889, term3889.getClass(), "attribute", false);
        setField(term3959, term3959.getClass(), "parent", null);
        setField(term3959, term3959.getClass(), "namespaceMap", term3960);
        setField(term3959, term3959.getClass(), "reverseMap", term3965);
        setField(term3959, term3959.getClass(), "pointer", null);
        setBooleanField(term3959, term3959.getClass(), "sealed", false);
        setField(term3889, term3889.getClass(), "namespaceResolver", term3959);
        setField(term3889, term3889.getClass(), "rootNode", term3971);
        setField(term3889, term3889.getClass(), "parent", null);
        setField(term3889, term3889.getClass(), "locale", null);
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
            callMethod(klass, "compareChildNodePointers", argTypes, term3889, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


