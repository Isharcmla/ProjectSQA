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
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.jdom.EqualityUtils.*;
import java.lang.Object;

public class JDOMNodePointer_init_16071220541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term3685;
     Object term3697;
     Object term3707;

    public JDOMNodePointer_init_16071220541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.lang.Object"));
        term2 = newInstance(Class.forName("java.util.Locale"));
        Object term3 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term3, term3.getClass(), "language", "pt");
        setField(term3, term3.getClass(), "script", "");
        setField(term3, term3.getClass(), "region", "MO");
        setField(term3, term3.getClass(), "variant", "");
        setIntField(term3, term3.getClass(), "hash", 106966554);
        setField(term2, term2.getClass(), "baseLocale", term3);
        setField(term2, term2.getClass(), "localeExtensions", null);
        setIntField(term2, term2.getClass(), "hashCodeValue", 106966554);
        setField(term2, term2.getClass(), "languageTag", null);
        term3685 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term3686 = newInstance(Class.forName("java.lang.Object"));
        Object term3687 = newInstance(Class.forName("java.util.Locale"));
        Object term3688 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term3685, term3685.getClass(), "node", term3686);
        setField(term3685, term3685.getClass(), "id", null);
        setField(term3685, term3685.getClass(), "localNamespaceResolver", null);
        setIntField(term3685, term3685.getClass(), "index", -2147483648);
        setBooleanField(term3685, term3685.getClass(), "attribute", false);
        setField(term3685, term3685.getClass(), "namespaceResolver", null);
        setField(term3685, term3685.getClass(), "rootNode", null);
        setField(term3685, term3685.getClass(), "parent", null);
        setField(term3688, term3688.getClass(), "language", "pt");
        setField(term3688, term3688.getClass(), "script", "");
        setField(term3688, term3688.getClass(), "region", "MO");
        setField(term3688, term3688.getClass(), "variant", "");
        setIntField(term3688, term3688.getClass(), "hash", 106966554);
        setField(term3687, term3687.getClass(), "baseLocale", term3688);
        setField(term3687, term3687.getClass(), "localeExtensions", null);
        setIntField(term3687, term3687.getClass(), "hashCodeValue", 106966554);
        setField(term3687, term3687.getClass(), "languageTag", null);
        setField(term3685, term3685.getClass(), "locale", term3687);
        term3697 = newInstance(Class.forName("java.util.Locale"));
        Object term3698 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term3698, term3698.getClass(), "language", "pt");
        setField(term3698, term3698.getClass(), "script", "");
        setField(term3698, term3698.getClass(), "region", "MO");
        setField(term3698, term3698.getClass(), "variant", "");
        setIntField(term3698, term3698.getClass(), "hash", 106966554);
        setField(term3697, term3697.getClass(), "baseLocale", term3698);
        setField(term3697, term3697.getClass(), "localeExtensions", null);
        setIntField(term3697, term3697.getClass(), "hashCodeValue", 106966554);
        setField(term3697, term3697.getClass(), "languageTag", null);
        term3707 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term2;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3685));
        assertTrue(recursiveEquals(term1, term3697));
        assertTrue(recursiveEquals(term2, term3707));
    }

};


