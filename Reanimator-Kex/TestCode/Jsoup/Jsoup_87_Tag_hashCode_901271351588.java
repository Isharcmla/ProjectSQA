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

public class Tag_hashCode_901271351588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50730;
     Object term50941;

    public Tag_hashCode_901271351588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50730 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term50730, term50730.getClass(), "tagName", "");
        setBooleanField(term50730, term50730.getClass(), "isBlock", true);
        setBooleanField(term50730, term50730.getClass(), "formatAsBlock", false);
        setBooleanField(term50730, term50730.getClass(), "canContainInline", true);
        setBooleanField(term50730, term50730.getClass(), "empty", true);
        setBooleanField(term50730, term50730.getClass(), "selfClosing", false);
        setBooleanField(term50730, term50730.getClass(), "preserveWhitespace", true);
        setBooleanField(term50730, term50730.getClass(), "formList", false);
        setBooleanField(term50730, term50730.getClass(), "formSubmit", true);
        term50941 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term50941, term50941.getClass(), "tagName", "");
        setBooleanField(term50941, term50941.getClass(), "isBlock", true);
        setBooleanField(term50941, term50941.getClass(), "formatAsBlock", false);
        setBooleanField(term50941, term50941.getClass(), "canContainInline", true);
        setBooleanField(term50941, term50941.getClass(), "empty", true);
        setBooleanField(term50941, term50941.getClass(), "selfClosing", false);
        setBooleanField(term50941, term50941.getClass(), "preserveWhitespace", true);
        setBooleanField(term50941, term50941.getClass(), "formList", false);
        setBooleanField(term50941, term50941.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term50730, args);
        assertTrue(recursiveEquals(term50730, term50941));
        assertTrue(recursiveEquals(retValue, 1772363969));
    }

};


