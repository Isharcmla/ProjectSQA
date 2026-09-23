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

public class NullPropertyPointer_createPath_202517451237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term820;
     Object term878;

    public NullPropertyPointer_createPath_202517451237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term845 = new HashMap();
        HashMap term850 = new HashMap();
        HashMap term856 = new HashMap();
        HashMap term861 = new HashMap();
        HashMap term867 = new HashMap();
        HashMap term872 = new HashMap();
        term820 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term835 = newInstance(Class.forName("java.lang.Object"));
        Object term836 = newInstance(Class.forName("java.lang.Object"));
        Object term839 = newInstance(Class.forName("java.lang.Object"));
        Object term840 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term841 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term842 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term843 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term820, term820.getClass(), "propertyName", "MxlszYVzRf");
        setBooleanField(term820, term820.getClass(), "byNameAttribute", true);
        setIntField(term820, term820.getClass(), "propertyIndex", 1135664017);
        setField(term820, term820.getClass(), "bean", term835);
        setField(term820, term820.getClass(), "value", term836);
        setIntField(term820, term820.getClass(), "index", 590364439);
        setBooleanField(term820, term820.getClass(), "attribute", false);
        setField(term820, term820.getClass(), "rootNode", term839);
        setField(term843, term843.getClass(), "parent", null);
        setField(term843, term843.getClass(), "namespaceMap", null);
        setField(term843, term843.getClass(), "reverseMap", null);
        setField(term843, term843.getClass(), "pointer", null);
        setField(term843, term843.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term843, term843.getClass(), "sealed", false);
        setField(term842, term842.getClass(), "parent", term843);
        setField(term842, term842.getClass(), "namespaceMap", term845);
        setField(term842, term842.getClass(), "reverseMap", term850);
        setField(term842, term842.getClass(), "pointer", null);
        setField(term842, term842.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term842, term842.getClass(), "sealed", false);
        setField(term841, term841.getClass(), "parent", term842);
        setField(term841, term841.getClass(), "namespaceMap", term856);
        setField(term841, term841.getClass(), "reverseMap", term861);
        setField(term841, term841.getClass(), "pointer", null);
        setField(term841, term841.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term841, term841.getClass(), "sealed", false);
        setField(term840, term840.getClass(), "parent", term841);
        setField(term840, term840.getClass(), "namespaceMap", term867);
        setField(term840, term840.getClass(), "reverseMap", term872);
        setField(term840, term840.getClass(), "pointer", null);
        setField(term840, term840.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term840, term840.getClass(), "sealed", false);
        setField(term820, term820.getClass(), "namespaceResolver", term840);
        setField(term820, term820.getClass(), "parent", null);
        setField(term820, term820.getClass(), "locale", null);
        term878 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term878;
        try {
            callMethod(klass, "createPath", argTypes, term820, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


