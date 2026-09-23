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

public class Tag_hashCode_901271351253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22307;
     Object term22389;

    public Tag_hashCode_901271351253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22307 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22307, term22307.getClass(), "tagName", "");
        setBooleanField(term22307, term22307.getClass(), "isBlock", true);
        setBooleanField(term22307, term22307.getClass(), "formatAsBlock", false);
        setBooleanField(term22307, term22307.getClass(), "canContainInline", true);
        setBooleanField(term22307, term22307.getClass(), "empty", true);
        setBooleanField(term22307, term22307.getClass(), "selfClosing", false);
        setBooleanField(term22307, term22307.getClass(), "preserveWhitespace", false);
        setBooleanField(term22307, term22307.getClass(), "formList", true);
        term22389 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22389, term22389.getClass(), "tagName", "");
        setBooleanField(term22389, term22389.getClass(), "isBlock", true);
        setBooleanField(term22389, term22389.getClass(), "formatAsBlock", false);
        setBooleanField(term22389, term22389.getClass(), "canContainInline", true);
        setBooleanField(term22389, term22389.getClass(), "empty", true);
        setBooleanField(term22389, term22389.getClass(), "selfClosing", false);
        setBooleanField(term22389, term22389.getClass(), "preserveWhitespace", false);
        setBooleanField(term22389, term22389.getClass(), "formList", true);
        setBooleanField(term22389, term22389.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term22307, args);
        assertTrue(recursiveEquals(term22307, term22389));
        assertTrue(recursiveEquals(retValue, 1772363038));
    }

};


