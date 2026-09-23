package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;

public class Tag_equals_1349958026115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10692;
     Object term10776;
     Object term10826;
     Object term10829;

    public Tag_equals_1349958026115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10692 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10692, term10692.getClass(), "tagName", "");
        setBooleanField(term10692, term10692.getClass(), "canContainInline", true);
        setBooleanField(term10692, term10692.getClass(), "empty", true);
        setBooleanField(term10692, term10692.getClass(), "formatAsBlock", true);
        setBooleanField(term10692, term10692.getClass(), "isBlock", true);
        term10776 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10776, term10776.getClass(), "tagName", "");
        setBooleanField(term10776, term10776.getClass(), "canContainInline", true);
        setBooleanField(term10776, term10776.getClass(), "empty", true);
        setBooleanField(term10776, term10776.getClass(), "formatAsBlock", true);
        setBooleanField(term10776, term10776.getClass(), "isBlock", false);
        term10826 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10826, term10826.getClass(), "tagName", "");
        setBooleanField(term10826, term10826.getClass(), "isBlock", true);
        setBooleanField(term10826, term10826.getClass(), "formatAsBlock", true);
        setBooleanField(term10826, term10826.getClass(), "canContainInline", true);
        setBooleanField(term10826, term10826.getClass(), "empty", true);
        setBooleanField(term10826, term10826.getClass(), "selfClosing", false);
        setBooleanField(term10826, term10826.getClass(), "preserveWhitespace", false);
        setBooleanField(term10826, term10826.getClass(), "formList", false);
        setBooleanField(term10826, term10826.getClass(), "formSubmit", false);
        term10829 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10829, term10829.getClass(), "tagName", "");
        setBooleanField(term10829, term10829.getClass(), "isBlock", false);
        setBooleanField(term10829, term10829.getClass(), "formatAsBlock", true);
        setBooleanField(term10829, term10829.getClass(), "canContainInline", true);
        setBooleanField(term10829, term10829.getClass(), "empty", true);
        setBooleanField(term10829, term10829.getClass(), "selfClosing", false);
        setBooleanField(term10829, term10829.getClass(), "preserveWhitespace", false);
        setBooleanField(term10829, term10829.getClass(), "formList", false);
        setBooleanField(term10829, term10829.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term10776;
        Object retValue = callMethod(klass, "equals", argTypes, term10692, args);
        assertTrue(recursiveEquals(term10692, term10826));
        assertTrue(recursiveEquals(term10776, term10829));
        assertTrue(recursiveEquals(retValue, false));
    }

};


