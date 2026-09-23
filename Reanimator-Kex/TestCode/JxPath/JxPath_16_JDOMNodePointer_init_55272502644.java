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

public class JDOMNodePointer_init_55272502644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22;
     Object term23;
     Object term3843;
     Object term3857;
     Object term3867;

    public JDOMNodePointer_init_55272502644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22 = newInstance(Class.forName("java.lang.Object"));
        term23 = newInstance(Class.forName("java.util.Locale"));
        Object term24 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term24, term24.getClass(), "language", "ps");
        setField(term24, term24.getClass(), "script", "");
        setField(term24, term24.getClass(), "region", "");
        setField(term24, term24.getClass(), "variant", "");
        setIntField(term24, term24.getClass(), "hash", 106860317);
        setField(term23, term23.getClass(), "baseLocale", term24);
        setField(term23, term23.getClass(), "localeExtensions", null);
        setIntField(term23, term23.getClass(), "hashCodeValue", 106860317);
        setField(term23, term23.getClass(), "languageTag", null);
        term3843 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term3844 = newInstance(Class.forName("java.lang.Object"));
        Object term3847 = newInstance(Class.forName("java.util.Locale"));
        Object term3848 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term3843, term3843.getClass(), "node", term3844);
        setField(term3843, term3843.getClass(), "id", "PAEBtnZtTD");
        setField(term3843, term3843.getClass(), "localNamespaceResolver", null);
        setIntField(term3843, term3843.getClass(), "index", -2147483648);
        setBooleanField(term3843, term3843.getClass(), "attribute", false);
        setField(term3843, term3843.getClass(), "rootNode", null);
        setField(term3843, term3843.getClass(), "namespaceResolver", null);
        setField(term3843, term3843.getClass(), "parent", null);
        setField(term3848, term3848.getClass(), "language", "ps");
        setField(term3848, term3848.getClass(), "script", "");
        setField(term3848, term3848.getClass(), "region", "");
        setField(term3848, term3848.getClass(), "variant", "");
        setIntField(term3848, term3848.getClass(), "hash", 106860317);
        setField(term3847, term3847.getClass(), "baseLocale", term3848);
        setField(term3847, term3847.getClass(), "localeExtensions", null);
        setIntField(term3847, term3847.getClass(), "hashCodeValue", 106860317);
        setField(term3847, term3847.getClass(), "languageTag", null);
        setField(term3843, term3843.getClass(), "locale", term3847);
        term3857 = newInstance(Class.forName("java.util.Locale"));
        Object term3858 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term3858, term3858.getClass(), "language", "ps");
        setField(term3858, term3858.getClass(), "script", "");
        setField(term3858, term3858.getClass(), "region", "");
        setField(term3858, term3858.getClass(), "variant", "");
        setIntField(term3858, term3858.getClass(), "hash", 106860317);
        setField(term3857, term3857.getClass(), "baseLocale", term3858);
        setField(term3857, term3857.getClass(), "localeExtensions", null);
        setIntField(term3857, term3857.getClass(), "hashCodeValue", 106860317);
        setField(term3857, term3857.getClass(), "languageTag", null);
        term3867 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.util.Locale");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term22;
        args[1] = term23;
        args[2] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3843));
        assertTrue(recursiveEquals(term22, term3857));
        assertTrue(recursiveEquals(term23, term3867));
    }

};


