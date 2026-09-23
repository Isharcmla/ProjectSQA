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

public class Tag_hashCode_901271351557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48030;
     Object term48112;

    public Tag_hashCode_901271351557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48030 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term48030, term48030.getClass(), "tagName", "");
        setBooleanField(term48030, term48030.getClass(), "isBlock", false);
        setBooleanField(term48030, term48030.getClass(), "formatAsBlock", true);
        setBooleanField(term48030, term48030.getClass(), "canContainInline", false);
        setBooleanField(term48030, term48030.getClass(), "empty", false);
        setBooleanField(term48030, term48030.getClass(), "selfClosing", false);
        setBooleanField(term48030, term48030.getClass(), "preserveWhitespace", true);
        setBooleanField(term48030, term48030.getClass(), "formList", true);
        setBooleanField(term48030, term48030.getClass(), "formSubmit", true);
        term48112 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term48112, term48112.getClass(), "tagName", "");
        setBooleanField(term48112, term48112.getClass(), "isBlock", false);
        setBooleanField(term48112, term48112.getClass(), "formatAsBlock", true);
        setBooleanField(term48112, term48112.getClass(), "canContainInline", false);
        setBooleanField(term48112, term48112.getClass(), "empty", false);
        setBooleanField(term48112, term48112.getClass(), "selfClosing", false);
        setBooleanField(term48112, term48112.getClass(), "preserveWhitespace", true);
        setBooleanField(term48112, term48112.getClass(), "formList", true);
        setBooleanField(term48112, term48112.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term48030, args);
        assertTrue(recursiveEquals(term48030, term48112));
        assertTrue(recursiveEquals(retValue, 887504674));
    }

};


