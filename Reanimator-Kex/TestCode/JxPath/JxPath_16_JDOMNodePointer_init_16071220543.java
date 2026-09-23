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

public class JDOMNodePointer_init_16071220543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term3766;
     Object term3778;
     Object term3788;

    public JDOMNodePointer_init_16071220543() {
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
        term3766 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term3767 = newInstance(Class.forName("java.lang.Object"));
        Object term3768 = newInstance(Class.forName("java.util.Locale"));
        Object term3769 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term3766, term3766.getClass(), "node", term3767);
        setField(term3766, term3766.getClass(), "id", null);
        setField(term3766, term3766.getClass(), "localNamespaceResolver", null);
        setIntField(term3766, term3766.getClass(), "index", -2147483648);
        setBooleanField(term3766, term3766.getClass(), "attribute", false);
        setField(term3766, term3766.getClass(), "rootNode", null);
        setField(term3766, term3766.getClass(), "namespaceResolver", null);
        setField(term3766, term3766.getClass(), "parent", null);
        setField(term3769, term3769.getClass(), "language", "pt");
        setField(term3769, term3769.getClass(), "script", "");
        setField(term3769, term3769.getClass(), "region", "MO");
        setField(term3769, term3769.getClass(), "variant", "");
        setIntField(term3769, term3769.getClass(), "hash", 106966554);
        setField(term3768, term3768.getClass(), "baseLocale", term3769);
        setField(term3768, term3768.getClass(), "localeExtensions", null);
        setIntField(term3768, term3768.getClass(), "hashCodeValue", 106966554);
        setField(term3768, term3768.getClass(), "languageTag", null);
        setField(term3766, term3766.getClass(), "locale", term3768);
        term3778 = newInstance(Class.forName("java.util.Locale"));
        Object term3779 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term3779, term3779.getClass(), "language", "pt");
        setField(term3779, term3779.getClass(), "script", "");
        setField(term3779, term3779.getClass(), "region", "MO");
        setField(term3779, term3779.getClass(), "variant", "");
        setIntField(term3779, term3779.getClass(), "hash", 106966554);
        setField(term3778, term3778.getClass(), "baseLocale", term3779);
        setField(term3778, term3778.getClass(), "localeExtensions", null);
        setIntField(term3778, term3778.getClass(), "hashCodeValue", 106966554);
        setField(term3778, term3778.getClass(), "languageTag", null);
        term3788 = newInstance(Class.forName("java.lang.Object"));
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
        assertTrue(recursiveEquals(instance, term3766));
        assertTrue(recursiveEquals(term1, term3778));
        assertTrue(recursiveEquals(term2, term3788));
    }

};


