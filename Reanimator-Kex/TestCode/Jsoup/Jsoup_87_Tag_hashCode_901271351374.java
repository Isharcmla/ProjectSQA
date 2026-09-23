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

public class Tag_hashCode_901271351374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32303;
     Object term32529;

    public Tag_hashCode_901271351374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32303 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term32303, term32303.getClass(), "tagName", "");
        setBooleanField(term32303, term32303.getClass(), "isBlock", true);
        setBooleanField(term32303, term32303.getClass(), "formatAsBlock", false);
        setBooleanField(term32303, term32303.getClass(), "canContainInline", true);
        setBooleanField(term32303, term32303.getClass(), "empty", true);
        setBooleanField(term32303, term32303.getClass(), "selfClosing", true);
        setBooleanField(term32303, term32303.getClass(), "preserveWhitespace", false);
        setBooleanField(term32303, term32303.getClass(), "formList", true);
        term32529 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term32529, term32529.getClass(), "tagName", "");
        setBooleanField(term32529, term32529.getClass(), "isBlock", true);
        setBooleanField(term32529, term32529.getClass(), "formatAsBlock", false);
        setBooleanField(term32529, term32529.getClass(), "canContainInline", true);
        setBooleanField(term32529, term32529.getClass(), "empty", true);
        setBooleanField(term32529, term32529.getClass(), "selfClosing", true);
        setBooleanField(term32529, term32529.getClass(), "preserveWhitespace", false);
        setBooleanField(term32529, term32529.getClass(), "formList", true);
        setBooleanField(term32529, term32529.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term32303, args);
        assertTrue(recursiveEquals(term32303, term32529));
        assertTrue(recursiveEquals(retValue, 1772392829));
    }

};


