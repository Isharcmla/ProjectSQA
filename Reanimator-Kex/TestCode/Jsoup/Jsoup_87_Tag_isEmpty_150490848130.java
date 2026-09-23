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

public class Tag_isEmpty_150490848130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256;
     Object term1292;

    public Tag_isEmpty_150490848130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term256, term256.getClass(), "tagName", "RMFIsYGgne");
        setBooleanField(term256, term256.getClass(), "isBlock", false);
        setBooleanField(term256, term256.getClass(), "formatAsBlock", false);
        setBooleanField(term256, term256.getClass(), "canContainInline", true);
        setBooleanField(term256, term256.getClass(), "empty", false);
        setBooleanField(term256, term256.getClass(), "selfClosing", true);
        setBooleanField(term256, term256.getClass(), "preserveWhitespace", false);
        setBooleanField(term256, term256.getClass(), "formList", false);
        setBooleanField(term256, term256.getClass(), "formSubmit", true);
        term1292 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1292, term1292.getClass(), "tagName", "RMFIsYGgne");
        setBooleanField(term1292, term1292.getClass(), "isBlock", false);
        setBooleanField(term1292, term1292.getClass(), "formatAsBlock", false);
        setBooleanField(term1292, term1292.getClass(), "canContainInline", true);
        setBooleanField(term1292, term1292.getClass(), "empty", false);
        setBooleanField(term1292, term1292.getClass(), "selfClosing", true);
        setBooleanField(term1292, term1292.getClass(), "preserveWhitespace", false);
        setBooleanField(term1292, term1292.getClass(), "formList", false);
        setBooleanField(term1292, term1292.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEmpty", argTypes, term256, args);
        assertTrue(recursiveEquals(term256, term1292));
    }

};


