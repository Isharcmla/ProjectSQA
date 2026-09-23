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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.dom.EqualityUtils.*;
import java.lang.Object;

public class DOMNodePointer_init_50384583544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21;
     Object term3790;
     Object term3803;

    public DOMNodePointer_init_50384583544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21 = newInstance(Class.forName("java.util.Locale"));
        Object term22 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term22, term22.getClass(), "language", "ps");
        setField(term22, term22.getClass(), "script", "");
        setField(term22, term22.getClass(), "region", "");
        setField(term22, term22.getClass(), "variant", "");
        setIntField(term22, term22.getClass(), "hash", 106860317);
        setField(term21, term21.getClass(), "baseLocale", term22);
        setField(term21, term21.getClass(), "localeExtensions", null);
        setIntField(term21, term21.getClass(), "hashCodeValue", 106860317);
        setField(term21, term21.getClass(), "languageTag", null);
        term3790 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3793 = newInstance(Class.forName("java.util.Locale"));
        Object term3794 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term3790, term3790.getClass(), "node", null);
        setField(term3790, term3790.getClass(), "namespaces", null);
        setField(term3790, term3790.getClass(), "defaultNamespace", null);
        setField(term3790, term3790.getClass(), "id", "PAEBtnZtTD");
        setIntField(term3790, term3790.getClass(), "index", -2147483648);
        setBooleanField(term3790, term3790.getClass(), "attribute", false);
        setField(term3790, term3790.getClass(), "rootNode", null);
        setField(term3790, term3790.getClass(), "namespaceResolver", null);
        setField(term3790, term3790.getClass(), "parent", null);
        setField(term3794, term3794.getClass(), "language", "ps");
        setField(term3794, term3794.getClass(), "script", "");
        setField(term3794, term3794.getClass(), "region", "");
        setField(term3794, term3794.getClass(), "variant", "");
        setIntField(term3794, term3794.getClass(), "hash", 106860317);
        setField(term3793, term3793.getClass(), "baseLocale", term3794);
        setField(term3793, term3793.getClass(), "localeExtensions", null);
        setIntField(term3793, term3793.getClass(), "hashCodeValue", 106860317);
        setField(term3793, term3793.getClass(), "languageTag", null);
        setField(term3790, term3790.getClass(), "locale", term3793);
        term3803 = newInstance(Class.forName("java.util.Locale"));
        Object term3804 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term3804, term3804.getClass(), "language", "ps");
        setField(term3804, term3804.getClass(), "script", "");
        setField(term3804, term3804.getClass(), "region", "");
        setField(term3804, term3804.getClass(), "variant", "");
        setIntField(term3804, term3804.getClass(), "hash", 106860317);
        setField(term3803, term3803.getClass(), "baseLocale", term3804);
        setField(term3803, term3803.getClass(), "localeExtensions", null);
        setIntField(term3803, term3803.getClass(), "hashCodeValue", 106860317);
        setField(term3803, term3803.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("java.util.Locale");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term21;
        args[2] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3790));
        assertTrue(recursiveEquals(term21, null));
    }

};


