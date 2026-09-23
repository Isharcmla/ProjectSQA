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

public class JDOMNodePointer_init_55272502642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22;
     Object term23;
     Object term3762;
     Object term3776;
     Object term3786;

    public JDOMNodePointer_init_55272502642() {
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
        term3762 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term3763 = newInstance(Class.forName("java.lang.Object"));
        Object term3766 = newInstance(Class.forName("java.util.Locale"));
        Object term3767 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term3762, term3762.getClass(), "node", term3763);
        setField(term3762, term3762.getClass(), "id", "PAEBtnZtTD");
        setField(term3762, term3762.getClass(), "localNamespaceResolver", null);
        setIntField(term3762, term3762.getClass(), "index", -2147483648);
        setBooleanField(term3762, term3762.getClass(), "attribute", false);
        setField(term3762, term3762.getClass(), "namespaceResolver", null);
        setField(term3762, term3762.getClass(), "rootNode", null);
        setField(term3762, term3762.getClass(), "parent", null);
        setField(term3767, term3767.getClass(), "language", "ps");
        setField(term3767, term3767.getClass(), "script", "");
        setField(term3767, term3767.getClass(), "region", "");
        setField(term3767, term3767.getClass(), "variant", "");
        setIntField(term3767, term3767.getClass(), "hash", 106860317);
        setField(term3766, term3766.getClass(), "baseLocale", term3767);
        setField(term3766, term3766.getClass(), "localeExtensions", null);
        setIntField(term3766, term3766.getClass(), "hashCodeValue", 106860317);
        setField(term3766, term3766.getClass(), "languageTag", null);
        setField(term3762, term3762.getClass(), "locale", term3766);
        term3776 = newInstance(Class.forName("java.util.Locale"));
        Object term3777 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term3777, term3777.getClass(), "language", "ps");
        setField(term3777, term3777.getClass(), "script", "");
        setField(term3777, term3777.getClass(), "region", "");
        setField(term3777, term3777.getClass(), "variant", "");
        setIntField(term3777, term3777.getClass(), "hash", 106860317);
        setField(term3776, term3776.getClass(), "baseLocale", term3777);
        setField(term3776, term3776.getClass(), "localeExtensions", null);
        setIntField(term3776, term3776.getClass(), "hashCodeValue", 106860317);
        setField(term3776, term3776.getClass(), "languageTag", null);
        term3786 = newInstance(Class.forName("java.lang.Object"));
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
        assertTrue(recursiveEquals(instance, term3762));
        assertTrue(recursiveEquals(term22, term3776));
        assertTrue(recursiveEquals(term23, term3786));
    }

};


