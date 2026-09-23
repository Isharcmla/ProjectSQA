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

public class NullPropertyPointer_createChild_138236629138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889;
     Object term947;
     Object term972;

    public NullPropertyPointer_createChild_138236629138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term914 = new HashMap();
        HashMap term919 = new HashMap();
        HashMap term925 = new HashMap();
        HashMap term930 = new HashMap();
        HashMap term936 = new HashMap();
        HashMap term941 = new HashMap();
        term889 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term904 = newInstance(Class.forName("java.lang.Object"));
        Object term905 = newInstance(Class.forName("java.lang.Object"));
        Object term908 = newInstance(Class.forName("java.lang.Object"));
        Object term909 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term910 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term911 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term912 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term889, term889.getClass(), "propertyName", "LQFpaHEwXR");
        setBooleanField(term889, term889.getClass(), "byNameAttribute", false);
        setIntField(term889, term889.getClass(), "propertyIndex", 865208305);
        setField(term889, term889.getClass(), "bean", term904);
        setField(term889, term889.getClass(), "value", term905);
        setIntField(term889, term889.getClass(), "index", -1275173084);
        setBooleanField(term889, term889.getClass(), "attribute", false);
        setField(term889, term889.getClass(), "rootNode", term908);
        setField(term912, term912.getClass(), "parent", null);
        setField(term912, term912.getClass(), "namespaceMap", null);
        setField(term912, term912.getClass(), "reverseMap", null);
        setField(term912, term912.getClass(), "pointer", null);
        setField(term912, term912.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term912, term912.getClass(), "sealed", false);
        setField(term911, term911.getClass(), "parent", term912);
        setField(term911, term911.getClass(), "namespaceMap", term914);
        setField(term911, term911.getClass(), "reverseMap", term919);
        setField(term911, term911.getClass(), "pointer", null);
        setField(term911, term911.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term911, term911.getClass(), "sealed", false);
        setField(term910, term910.getClass(), "parent", term911);
        setField(term910, term910.getClass(), "namespaceMap", term925);
        setField(term910, term910.getClass(), "reverseMap", term930);
        setField(term910, term910.getClass(), "pointer", null);
        setField(term910, term910.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term910, term910.getClass(), "sealed", false);
        setField(term909, term909.getClass(), "parent", term910);
        setField(term909, term909.getClass(), "namespaceMap", term936);
        setField(term909, term909.getClass(), "reverseMap", term941);
        setField(term909, term909.getClass(), "pointer", null);
        setField(term909, term909.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term909, term909.getClass(), "sealed", false);
        setField(term889, term889.getClass(), "namespaceResolver", term909);
        setField(term889, term889.getClass(), "parent", null);
        setField(term889, term889.getClass(), "locale", null);
        term947 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term947, term947.getClass(), "prefix", "oVcInYnLWB");
        setField(term947, term947.getClass(), "name", "aJlieCFVtF");
        term972 = new Integer(-244121226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term947;
        args[2] = term972;
        try {
            callMethod(klass, "createChild", argTypes, term889, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


