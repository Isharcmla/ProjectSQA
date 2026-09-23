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
     Object term2687;
     Object term2701;
     Object term2711;

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
        term2687 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2688 = newInstance(Class.forName("java.lang.Object"));
        Object term2691 = newInstance(Class.forName("java.util.Locale"));
        Object term2692 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2687, term2687.getClass(), "node", term2688);
        setField(term2687, term2687.getClass(), "id", "PAEBtnZtTD");
        setIntField(term2687, term2687.getClass(), "index", -2147483648);
        setBooleanField(term2687, term2687.getClass(), "attribute", false);
        setField(term2687, term2687.getClass(), "rootNode", null);
        setField(term2687, term2687.getClass(), "namespaceResolver", null);
        setField(term2687, term2687.getClass(), "parent", null);
        setField(term2692, term2692.getClass(), "language", "ps");
        setField(term2692, term2692.getClass(), "script", "");
        setField(term2692, term2692.getClass(), "region", "");
        setField(term2692, term2692.getClass(), "variant", "");
        setIntField(term2692, term2692.getClass(), "hash", 106860317);
        setField(term2691, term2691.getClass(), "baseLocale", term2692);
        setField(term2691, term2691.getClass(), "localeExtensions", null);
        setIntField(term2691, term2691.getClass(), "hashCodeValue", 106860317);
        setField(term2691, term2691.getClass(), "languageTag", null);
        setField(term2687, term2687.getClass(), "locale", term2691);
        term2701 = newInstance(Class.forName("java.util.Locale"));
        Object term2702 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2702, term2702.getClass(), "language", "ps");
        setField(term2702, term2702.getClass(), "script", "");
        setField(term2702, term2702.getClass(), "region", "");
        setField(term2702, term2702.getClass(), "variant", "");
        setIntField(term2702, term2702.getClass(), "hash", 106860317);
        setField(term2701, term2701.getClass(), "baseLocale", term2702);
        setField(term2701, term2701.getClass(), "localeExtensions", null);
        setIntField(term2701, term2701.getClass(), "hashCodeValue", 106860317);
        setField(term2701, term2701.getClass(), "languageTag", null);
        term2711 = newInstance(Class.forName("java.lang.Object"));
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
        assertTrue(recursiveEquals(instance, term2687));
        assertTrue(recursiveEquals(term22, term2701));
        assertTrue(recursiveEquals(term23, term2711));
    }

};


