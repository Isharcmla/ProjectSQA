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

public class Tag_hashCode_901271351603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52102;
     Object term52184;

    public Tag_hashCode_901271351603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52102 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term52102, term52102.getClass(), "tagName", "");
        setBooleanField(term52102, term52102.getClass(), "isBlock", false);
        setBooleanField(term52102, term52102.getClass(), "formatAsBlock", true);
        setBooleanField(term52102, term52102.getClass(), "canContainInline", true);
        setBooleanField(term52102, term52102.getClass(), "empty", true);
        setBooleanField(term52102, term52102.getClass(), "selfClosing", true);
        setBooleanField(term52102, term52102.getClass(), "preserveWhitespace", true);
        setBooleanField(term52102, term52102.getClass(), "formList", true);
        setBooleanField(term52102, term52102.getClass(), "formSubmit", true);
        term52184 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term52184, term52184.getClass(), "tagName", "");
        setBooleanField(term52184, term52184.getClass(), "isBlock", false);
        setBooleanField(term52184, term52184.getClass(), "formatAsBlock", true);
        setBooleanField(term52184, term52184.getClass(), "canContainInline", true);
        setBooleanField(term52184, term52184.getClass(), "empty", true);
        setBooleanField(term52184, term52184.getClass(), "selfClosing", true);
        setBooleanField(term52184, term52184.getClass(), "preserveWhitespace", true);
        setBooleanField(term52184, term52184.getClass(), "formList", true);
        setBooleanField(term52184, term52184.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term52102, args);
        assertTrue(recursiveEquals(term52102, term52184));
        assertTrue(recursiveEquals(retValue, 917087137));
    }

};


