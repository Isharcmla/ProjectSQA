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
     Object term2610;
     Object term2622;
     Object term2632;

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
        term2610 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2611 = newInstance(Class.forName("java.lang.Object"));
        Object term2612 = newInstance(Class.forName("java.util.Locale"));
        Object term2613 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2610, term2610.getClass(), "node", term2611);
        setField(term2610, term2610.getClass(), "id", null);
        setIntField(term2610, term2610.getClass(), "index", -2147483648);
        setBooleanField(term2610, term2610.getClass(), "attribute", false);
        setField(term2610, term2610.getClass(), "rootNode", null);
        setField(term2610, term2610.getClass(), "namespaceResolver", null);
        setField(term2610, term2610.getClass(), "parent", null);
        setField(term2613, term2613.getClass(), "language", "pt");
        setField(term2613, term2613.getClass(), "script", "");
        setField(term2613, term2613.getClass(), "region", "MO");
        setField(term2613, term2613.getClass(), "variant", "");
        setIntField(term2613, term2613.getClass(), "hash", 106966554);
        setField(term2612, term2612.getClass(), "baseLocale", term2613);
        setField(term2612, term2612.getClass(), "localeExtensions", null);
        setIntField(term2612, term2612.getClass(), "hashCodeValue", 106966554);
        setField(term2612, term2612.getClass(), "languageTag", null);
        setField(term2610, term2610.getClass(), "locale", term2612);
        term2622 = newInstance(Class.forName("java.util.Locale"));
        Object term2623 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2623, term2623.getClass(), "language", "pt");
        setField(term2623, term2623.getClass(), "script", "");
        setField(term2623, term2623.getClass(), "region", "MO");
        setField(term2623, term2623.getClass(), "variant", "");
        setIntField(term2623, term2623.getClass(), "hash", 106966554);
        setField(term2622, term2622.getClass(), "baseLocale", term2623);
        setField(term2622, term2622.getClass(), "localeExtensions", null);
        setIntField(term2622, term2622.getClass(), "hashCodeValue", 106966554);
        setField(term2622, term2622.getClass(), "languageTag", null);
        term2632 = newInstance(Class.forName("java.lang.Object"));
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
        assertTrue(recursiveEquals(instance, term2610));
        assertTrue(recursiveEquals(term1, term2622));
        assertTrue(recursiveEquals(term2, term2632));
    }

};


