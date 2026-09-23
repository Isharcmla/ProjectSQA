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

public class Tag_hashCode_901271351580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50029;
     Object term50240;

    public Tag_hashCode_901271351580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50029 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term50029, term50029.getClass(), "tagName", "");
        setBooleanField(term50029, term50029.getClass(), "isBlock", false);
        setBooleanField(term50029, term50029.getClass(), "formatAsBlock", true);
        setBooleanField(term50029, term50029.getClass(), "canContainInline", true);
        setBooleanField(term50029, term50029.getClass(), "empty", true);
        setBooleanField(term50029, term50029.getClass(), "selfClosing", true);
        setBooleanField(term50029, term50029.getClass(), "preserveWhitespace", true);
        setBooleanField(term50029, term50029.getClass(), "formList", true);
        term50240 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term50240, term50240.getClass(), "tagName", "");
        setBooleanField(term50240, term50240.getClass(), "isBlock", false);
        setBooleanField(term50240, term50240.getClass(), "formatAsBlock", true);
        setBooleanField(term50240, term50240.getClass(), "canContainInline", true);
        setBooleanField(term50240, term50240.getClass(), "empty", true);
        setBooleanField(term50240, term50240.getClass(), "selfClosing", true);
        setBooleanField(term50240, term50240.getClass(), "preserveWhitespace", true);
        setBooleanField(term50240, term50240.getClass(), "formList", true);
        setBooleanField(term50240, term50240.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term50029, args);
        assertTrue(recursiveEquals(term50029, term50240));
        assertTrue(recursiveEquals(retValue, 917087136));
    }

};


