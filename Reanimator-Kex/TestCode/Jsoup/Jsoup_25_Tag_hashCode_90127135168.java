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

public class Tag_hashCode_90127135168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4820;
     Object term4931;

    public Tag_hashCode_90127135168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4820 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4820, term4820.getClass(), "tagName", "");
        setBooleanField(term4820, term4820.getClass(), "isBlock", true);
        setBooleanField(term4820, term4820.getClass(), "formatAsBlock", false);
        setBooleanField(term4820, term4820.getClass(), "canContainBlock", true);
        setBooleanField(term4820, term4820.getClass(), "canContainInline", false);
        setBooleanField(term4820, term4820.getClass(), "empty", false);
        setBooleanField(term4820, term4820.getClass(), "selfClosing", true);
        setBooleanField(term4820, term4820.getClass(), "preserveWhitespace", false);
        term4931 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4931, term4931.getClass(), "tagName", "");
        setBooleanField(term4931, term4931.getClass(), "isBlock", true);
        setBooleanField(term4931, term4931.getClass(), "formatAsBlock", false);
        setBooleanField(term4931, term4931.getClass(), "canContainBlock", true);
        setBooleanField(term4931, term4931.getClass(), "canContainInline", false);
        setBooleanField(term4931, term4931.getClass(), "empty", false);
        setBooleanField(term4931, term4931.getClass(), "selfClosing", true);
        setBooleanField(term4931, term4931.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term4820, args);
        assertTrue(recursiveEquals(term4820, term4931));
        assertTrue(recursiveEquals(retValue, 888427233));
    }

};


