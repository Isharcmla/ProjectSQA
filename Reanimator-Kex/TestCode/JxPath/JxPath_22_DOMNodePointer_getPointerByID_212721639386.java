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

public class DOMNodePointer_getPointerByID_212721639386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3834;

    public DOMNodePointer_getPointerByID_212721639386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3835 = new HashMap();
        HashMap term3869 = new HashMap();
        HashMap term3874 = new HashMap();
        HashMap term3880 = new HashMap();
        HashMap term3885 = new HashMap();
        HashMap term3891 = new HashMap();
        HashMap term3896 = new HashMap();
        HashMap term3905 = new HashMap();
        HashMap term3910 = new HashMap();
        term3834 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3864 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3865 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3866 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3867 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3904 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3834, term3834.getClass(), "node", null);
        setField(term3834, term3834.getClass(), "namespaces", term3835);
        setField(term3834, term3834.getClass(), "defaultNamespace", "LvJFtLBaxj");
        setField(term3834, term3834.getClass(), "id", "PHvxnGHptP");
        setField(term3867, term3867.getClass(), "parent", null);
        setField(term3867, term3867.getClass(), "namespaceMap", null);
        setField(term3867, term3867.getClass(), "reverseMap", null);
        setField(term3867, term3867.getClass(), "pointer", null);
        setBooleanField(term3867, term3867.getClass(), "sealed", false);
        setField(term3866, term3866.getClass(), "parent", term3867);
        setField(term3866, term3866.getClass(), "namespaceMap", term3869);
        setField(term3866, term3866.getClass(), "reverseMap", term3874);
        setField(term3866, term3866.getClass(), "pointer", null);
        setBooleanField(term3866, term3866.getClass(), "sealed", false);
        setField(term3865, term3865.getClass(), "parent", term3866);
        setField(term3865, term3865.getClass(), "namespaceMap", term3880);
        setField(term3865, term3865.getClass(), "reverseMap", term3885);
        setField(term3865, term3865.getClass(), "pointer", null);
        setBooleanField(term3865, term3865.getClass(), "sealed", false);
        setField(term3864, term3864.getClass(), "parent", term3865);
        setField(term3864, term3864.getClass(), "namespaceMap", term3891);
        setField(term3864, term3864.getClass(), "reverseMap", term3896);
        setField(term3864, term3864.getClass(), "pointer", null);
        setBooleanField(term3864, term3864.getClass(), "sealed", false);
        setField(term3834, term3834.getClass(), "localNamespaceResolver", term3864);
        setIntField(term3834, term3834.getClass(), "index", -1087774327);
        setBooleanField(term3834, term3834.getClass(), "attribute", false);
        setField(term3904, term3904.getClass(), "parent", null);
        setField(term3904, term3904.getClass(), "namespaceMap", term3905);
        setField(term3904, term3904.getClass(), "reverseMap", term3910);
        setField(term3904, term3904.getClass(), "pointer", null);
        setBooleanField(term3904, term3904.getClass(), "sealed", false);
        setField(term3834, term3834.getClass(), "namespaceResolver", term3904);
        setField(term3834, term3834.getClass(), "exceptionHandler", null);
        setField(term3834, term3834.getClass(), "rootNode", null);
        setField(term3834, term3834.getClass(), "parent", null);
        setField(term3834, term3834.getClass(), "locale", null);
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
            callMethod(klass, "getPointerByID", argTypes, term3834, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


