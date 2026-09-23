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

public class Tag_hashCode_901271351112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8531;
     Object term9044;

    public Tag_hashCode_901271351112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8531 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8531, term8531.getClass(), "tagName", "");
        setBooleanField(term8531, term8531.getClass(), "isBlock", true);
        setBooleanField(term8531, term8531.getClass(), "formatAsBlock", false);
        setBooleanField(term8531, term8531.getClass(), "canContainBlock", true);
        setBooleanField(term8531, term8531.getClass(), "canContainInline", true);
        setBooleanField(term8531, term8531.getClass(), "empty", true);
        term9044 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9044, term9044.getClass(), "tagName", "");
        setBooleanField(term9044, term9044.getClass(), "isBlock", true);
        setBooleanField(term9044, term9044.getClass(), "formatAsBlock", false);
        setBooleanField(term9044, term9044.getClass(), "canContainBlock", true);
        setBooleanField(term9044, term9044.getClass(), "canContainInline", true);
        setBooleanField(term9044, term9044.getClass(), "empty", true);
        setBooleanField(term9044, term9044.getClass(), "selfClosing", false);
        setBooleanField(term9044, term9044.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term8531, args);
        assertTrue(recursiveEquals(term8531, term9044));
        assertTrue(recursiveEquals(retValue, 888457954));
    }

};


