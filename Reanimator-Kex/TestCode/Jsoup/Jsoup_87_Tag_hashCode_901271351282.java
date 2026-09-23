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

public class Tag_hashCode_901271351282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24622;
     Object term24862;

    public Tag_hashCode_901271351282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24622 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24622, term24622.getClass(), "tagName", "");
        setBooleanField(term24622, term24622.getClass(), "isBlock", true);
        setBooleanField(term24622, term24622.getClass(), "formatAsBlock", true);
        setBooleanField(term24622, term24622.getClass(), "canContainInline", false);
        setBooleanField(term24622, term24622.getClass(), "empty", false);
        setBooleanField(term24622, term24622.getClass(), "selfClosing", false);
        setBooleanField(term24622, term24622.getClass(), "preserveWhitespace", false);
        setBooleanField(term24622, term24622.getClass(), "formList", true);
        setBooleanField(term24622, term24622.getClass(), "formSubmit", true);
        term24862 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24862, term24862.getClass(), "tagName", "");
        setBooleanField(term24862, term24862.getClass(), "isBlock", true);
        setBooleanField(term24862, term24862.getClass(), "formatAsBlock", true);
        setBooleanField(term24862, term24862.getClass(), "canContainInline", false);
        setBooleanField(term24862, term24862.getClass(), "empty", false);
        setBooleanField(term24862, term24862.getClass(), "selfClosing", false);
        setBooleanField(term24862, term24862.getClass(), "preserveWhitespace", false);
        setBooleanField(term24862, term24862.getClass(), "formList", true);
        setBooleanField(term24862, term24862.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term24622, args);
        assertTrue(recursiveEquals(term24622, term24862));
        assertTrue(recursiveEquals(retValue, -1664653248));
    }

};


