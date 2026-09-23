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

public class Tag_hashCode_901271351215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19164;
     Object term19246;

    public Tag_hashCode_901271351215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19164 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term19164, term19164.getClass(), "tagName", "");
        setBooleanField(term19164, term19164.getClass(), "isBlock", true);
        setBooleanField(term19164, term19164.getClass(), "formatAsBlock", false);
        setBooleanField(term19164, term19164.getClass(), "canContainInline", true);
        setBooleanField(term19164, term19164.getClass(), "empty", false);
        setBooleanField(term19164, term19164.getClass(), "selfClosing", false);
        setBooleanField(term19164, term19164.getClass(), "preserveWhitespace", true);
        term19246 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term19246, term19246.getClass(), "tagName", "");
        setBooleanField(term19246, term19246.getClass(), "isBlock", true);
        setBooleanField(term19246, term19246.getClass(), "formatAsBlock", false);
        setBooleanField(term19246, term19246.getClass(), "canContainInline", true);
        setBooleanField(term19246, term19246.getClass(), "empty", false);
        setBooleanField(term19246, term19246.getClass(), "selfClosing", false);
        setBooleanField(term19246, term19246.getClass(), "preserveWhitespace", true);
        setBooleanField(term19246, term19246.getClass(), "formList", false);
        setBooleanField(term19246, term19246.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term19164, args);
        assertTrue(recursiveEquals(term19164, term19246));
        assertTrue(recursiveEquals(retValue, 1771440447));
    }

};


