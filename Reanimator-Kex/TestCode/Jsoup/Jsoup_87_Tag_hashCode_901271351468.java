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

public class Tag_hashCode_901271351468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40533;
     Object term40738;

    public Tag_hashCode_901271351468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40533 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term40533, term40533.getClass(), "tagName", "");
        setBooleanField(term40533, term40533.getClass(), "isBlock", true);
        setBooleanField(term40533, term40533.getClass(), "formatAsBlock", false);
        setBooleanField(term40533, term40533.getClass(), "canContainInline", true);
        setBooleanField(term40533, term40533.getClass(), "empty", true);
        setBooleanField(term40533, term40533.getClass(), "selfClosing", true);
        setBooleanField(term40533, term40533.getClass(), "preserveWhitespace", true);
        setBooleanField(term40533, term40533.getClass(), "formList", false);
        setBooleanField(term40533, term40533.getClass(), "formSubmit", true);
        term40738 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term40738, term40738.getClass(), "tagName", "");
        setBooleanField(term40738, term40738.getClass(), "isBlock", true);
        setBooleanField(term40738, term40738.getClass(), "formatAsBlock", false);
        setBooleanField(term40738, term40738.getClass(), "canContainInline", true);
        setBooleanField(term40738, term40738.getClass(), "empty", true);
        setBooleanField(term40738, term40738.getClass(), "selfClosing", true);
        setBooleanField(term40738, term40738.getClass(), "preserveWhitespace", true);
        setBooleanField(term40738, term40738.getClass(), "formList", false);
        setBooleanField(term40738, term40738.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term40533, args);
        assertTrue(recursiveEquals(term40533, term40738));
        assertTrue(recursiveEquals(retValue, 1772393760));
    }

};


