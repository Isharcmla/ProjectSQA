package org.apache.commons.jxpath.ri;

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
import static org.apache.commons.jxpath.ri.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class NamespaceResolver_registerNamespace_148840716512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51;
     Object term691;

    public NamespaceResolver_registerNamespace_148840716512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term57 = new HashMap();
        HashMap term62 = new HashMap();
        HashMap term68 = new HashMap();
        HashMap term73 = new HashMap();
        HashMap term79 = new HashMap();
        HashMap term84 = new HashMap();
        HashMap term90 = new HashMap();
        HashMap term95 = new HashMap();
        term51 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term52 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term53 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term54 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term55 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term55, term55.getClass(), "parent", null);
        setField(term55, term55.getClass(), "namespaceMap", null);
        setField(term55, term55.getClass(), "reverseMap", null);
        setField(term55, term55.getClass(), "pointer", null);
        setBooleanField(term55, term55.getClass(), "sealed", false);
        setField(term54, term54.getClass(), "parent", term55);
        setField(term54, term54.getClass(), "namespaceMap", term57);
        setField(term54, term54.getClass(), "reverseMap", term62);
        setField(term54, term54.getClass(), "pointer", null);
        setBooleanField(term54, term54.getClass(), "sealed", false);
        setField(term53, term53.getClass(), "parent", term54);
        setField(term53, term53.getClass(), "namespaceMap", term68);
        setField(term53, term53.getClass(), "reverseMap", term73);
        setField(term53, term53.getClass(), "pointer", null);
        setBooleanField(term53, term53.getClass(), "sealed", false);
        setField(term52, term52.getClass(), "parent", term53);
        setField(term52, term52.getClass(), "namespaceMap", term79);
        setField(term52, term52.getClass(), "reverseMap", term84);
        setField(term52, term52.getClass(), "pointer", null);
        setBooleanField(term52, term52.getClass(), "sealed", false);
        setField(term51, term51.getClass(), "parent", term52);
        setField(term51, term51.getClass(), "namespaceMap", term90);
        setField(term51, term51.getClass(), "reverseMap", term95);
        setField(term51, term51.getClass(), "pointer", null);
        setBooleanField(term51, term51.getClass(), "sealed", false);
        HashMap term696 = new HashMap();
        HashMap term697 = new HashMap();
        HashMap term698 = new HashMap();
        HashMap term699 = new HashMap();
        HashMap term700 = new HashMap();
        HashMap term701 = new HashMap();
        HashMap term702 = new HashMap();
        term691 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term692 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term693 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term694 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term695 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term695, term695.getClass(), "parent", null);
        setField(term695, term695.getClass(), "namespaceMap", null);
        setField(term695, term695.getClass(), "reverseMap", null);
        setField(term695, term695.getClass(), "pointer", null);
        setBooleanField(term695, term695.getClass(), "sealed", false);
        setField(term694, term694.getClass(), "parent", term695);
        setField(term694, term694.getClass(), "namespaceMap", term696);
        setField(term694, term694.getClass(), "reverseMap", term697);
        setField(term694, term694.getClass(), "pointer", null);
        setBooleanField(term694, term694.getClass(), "sealed", false);
        setField(term693, term693.getClass(), "parent", term694);
        setField(term693, term693.getClass(), "namespaceMap", term698);
        setField(term693, term693.getClass(), "reverseMap", term699);
        setField(term693, term693.getClass(), "pointer", null);
        setBooleanField(term693, term693.getClass(), "sealed", false);
        setField(term692, term692.getClass(), "parent", term693);
        setField(term692, term692.getClass(), "namespaceMap", term700);
        setField(term692, term692.getClass(), "reverseMap", term701);
        setField(term692, term692.getClass(), "pointer", null);
        setBooleanField(term692, term692.getClass(), "sealed", false);
        setField(term691, term691.getClass(), "parent", term692);
        setField(term691, term691.getClass(), "namespaceMap", term702);
        setField(term691, term691.getClass(), "reverseMap", null);
        setField(term691, term691.getClass(), "pointer", null);
        setBooleanField(term691, term691.getClass(), "sealed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "PAEBtnZtTD";
        args[1] = "sjlJAEtRrb";
        callMethod(klass, "registerNamespace", argTypes, term51, args);
        assertTrue(recursiveEquals(term51, term691));
    }

};


