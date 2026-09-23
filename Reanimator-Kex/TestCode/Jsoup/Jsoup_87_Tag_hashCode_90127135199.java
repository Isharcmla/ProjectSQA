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

public class Tag_hashCode_90127135199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6912;
     Object term6971;

    public Tag_hashCode_90127135199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6912 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6912, term6912.getClass(), "tagName", "");
        setBooleanField(term6912, term6912.getClass(), "isBlock", false);
        setBooleanField(term6912, term6912.getClass(), "formatAsBlock", false);
        setBooleanField(term6912, term6912.getClass(), "canContainInline", true);
        setBooleanField(term6912, term6912.getClass(), "empty", true);
        setBooleanField(term6912, term6912.getClass(), "selfClosing", false);
        setBooleanField(term6912, term6912.getClass(), "preserveWhitespace", true);
        setBooleanField(term6912, term6912.getClass(), "formList", true);
        term6971 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6971, term6971.getClass(), "tagName", "");
        setBooleanField(term6971, term6971.getClass(), "isBlock", false);
        setBooleanField(term6971, term6971.getClass(), "formatAsBlock", false);
        setBooleanField(term6971, term6971.getClass(), "canContainInline", true);
        setBooleanField(term6971, term6971.getClass(), "empty", true);
        setBooleanField(term6971, term6971.getClass(), "selfClosing", false);
        setBooleanField(term6971, term6971.getClass(), "preserveWhitespace", true);
        setBooleanField(term6971, term6971.getClass(), "formList", true);
        setBooleanField(term6971, term6971.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term6912, args);
        assertTrue(recursiveEquals(term6912, term6971));
        assertTrue(recursiveEquals(retValue, 29553664));
    }

};


