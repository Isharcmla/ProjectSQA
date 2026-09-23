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

public class NullPropertyPointer_setValue_181576621335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term683;
     Object term741;

    public NullPropertyPointer_setValue_181576621335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term708 = new HashMap();
        HashMap term713 = new HashMap();
        HashMap term719 = new HashMap();
        HashMap term724 = new HashMap();
        HashMap term730 = new HashMap();
        HashMap term735 = new HashMap();
        term683 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term698 = newInstance(Class.forName("java.lang.Object"));
        Object term699 = newInstance(Class.forName("java.lang.Object"));
        Object term702 = newInstance(Class.forName("java.lang.Object"));
        Object term703 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term704 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term705 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term706 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term683, term683.getClass(), "propertyName", "NRdvgJlhkX");
        setBooleanField(term683, term683.getClass(), "byNameAttribute", true);
        setIntField(term683, term683.getClass(), "propertyIndex", -6029667);
        setField(term683, term683.getClass(), "bean", term698);
        setField(term683, term683.getClass(), "value", term699);
        setIntField(term683, term683.getClass(), "index", -2068769794);
        setBooleanField(term683, term683.getClass(), "attribute", true);
        setField(term683, term683.getClass(), "rootNode", term702);
        setField(term706, term706.getClass(), "parent", null);
        setField(term706, term706.getClass(), "namespaceMap", null);
        setField(term706, term706.getClass(), "reverseMap", null);
        setField(term706, term706.getClass(), "pointer", null);
        setField(term706, term706.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term706, term706.getClass(), "sealed", false);
        setField(term705, term705.getClass(), "parent", term706);
        setField(term705, term705.getClass(), "namespaceMap", term708);
        setField(term705, term705.getClass(), "reverseMap", term713);
        setField(term705, term705.getClass(), "pointer", null);
        setField(term705, term705.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term705, term705.getClass(), "sealed", false);
        setField(term704, term704.getClass(), "parent", term705);
        setField(term704, term704.getClass(), "namespaceMap", term719);
        setField(term704, term704.getClass(), "reverseMap", term724);
        setField(term704, term704.getClass(), "pointer", null);
        setField(term704, term704.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term704, term704.getClass(), "sealed", false);
        setField(term703, term703.getClass(), "parent", term704);
        setField(term703, term703.getClass(), "namespaceMap", term730);
        setField(term703, term703.getClass(), "reverseMap", term735);
        setField(term703, term703.getClass(), "pointer", null);
        setField(term703, term703.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term703, term703.getClass(), "sealed", false);
        setField(term683, term683.getClass(), "namespaceResolver", term703);
        setField(term683, term683.getClass(), "parent", null);
        setField(term683, term683.getClass(), "locale", null);
        term741 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term741;
        try {
            callMethod(klass, "setValue", argTypes, term683, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


