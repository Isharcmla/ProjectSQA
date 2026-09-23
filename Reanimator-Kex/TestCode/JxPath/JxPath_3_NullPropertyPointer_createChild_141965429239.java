package org.apache.commons.jxpath.ri.model.beans;

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
import static org.apache.commons.jxpath.ri.model.beans.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Integer;

public class NullPropertyPointer_createChild_141965429239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1004;
     Object term1062;
     Object term1087;
     Object term1089;

    public NullPropertyPointer_createChild_141965429239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1029 = new HashMap();
        HashMap term1034 = new HashMap();
        HashMap term1040 = new HashMap();
        HashMap term1045 = new HashMap();
        HashMap term1051 = new HashMap();
        HashMap term1056 = new HashMap();
        term1004 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term1019 = newInstance(Class.forName("java.lang.Object"));
        Object term1020 = newInstance(Class.forName("java.lang.Object"));
        Object term1023 = newInstance(Class.forName("java.lang.Object"));
        Object term1024 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1025 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1026 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1027 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1004, term1004.getClass(), "propertyName", "ZiaGIbnzTs");
        setBooleanField(term1004, term1004.getClass(), "byNameAttribute", true);
        setIntField(term1004, term1004.getClass(), "propertyIndex", -203030934);
        setField(term1004, term1004.getClass(), "bean", term1019);
        setField(term1004, term1004.getClass(), "value", term1020);
        setIntField(term1004, term1004.getClass(), "index", -1179120542);
        setBooleanField(term1004, term1004.getClass(), "attribute", true);
        setField(term1004, term1004.getClass(), "rootNode", term1023);
        setField(term1027, term1027.getClass(), "parent", null);
        setField(term1027, term1027.getClass(), "namespaceMap", null);
        setField(term1027, term1027.getClass(), "reverseMap", null);
        setField(term1027, term1027.getClass(), "pointer", null);
        setField(term1027, term1027.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1027, term1027.getClass(), "sealed", false);
        setField(term1026, term1026.getClass(), "parent", term1027);
        setField(term1026, term1026.getClass(), "namespaceMap", term1029);
        setField(term1026, term1026.getClass(), "reverseMap", term1034);
        setField(term1026, term1026.getClass(), "pointer", null);
        setField(term1026, term1026.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1026, term1026.getClass(), "sealed", false);
        setField(term1025, term1025.getClass(), "parent", term1026);
        setField(term1025, term1025.getClass(), "namespaceMap", term1040);
        setField(term1025, term1025.getClass(), "reverseMap", term1045);
        setField(term1025, term1025.getClass(), "pointer", null);
        setField(term1025, term1025.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1025, term1025.getClass(), "sealed", false);
        setField(term1024, term1024.getClass(), "parent", term1025);
        setField(term1024, term1024.getClass(), "namespaceMap", term1051);
        setField(term1024, term1024.getClass(), "reverseMap", term1056);
        setField(term1024, term1024.getClass(), "pointer", null);
        setField(term1024, term1024.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1024, term1024.getClass(), "sealed", false);
        setField(term1004, term1004.getClass(), "namespaceResolver", term1024);
        setField(term1004, term1004.getClass(), "parent", null);
        setField(term1004, term1004.getClass(), "locale", null);
        term1062 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term1062, term1062.getClass(), "prefix", "tbcdzjIfER");
        setField(term1062, term1062.getClass(), "name", "HyxfbSQYBe");
        term1087 = new Integer(-73683645);
        term1089 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.Object");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term1062;
        args[2] = term1087;
        args[3] = term1089;
        try {
            callMethod(klass, "createChild", argTypes, term1004, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


