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

public class Tag_hashCode_901271351561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48380;
     Object term48462;

    public Tag_hashCode_901271351561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48380 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term48380, term48380.getClass(), "tagName", "");
        setBooleanField(term48380, term48380.getClass(), "isBlock", true);
        setBooleanField(term48380, term48380.getClass(), "formatAsBlock", false);
        setBooleanField(term48380, term48380.getClass(), "canContainInline", true);
        setBooleanField(term48380, term48380.getClass(), "empty", false);
        setBooleanField(term48380, term48380.getClass(), "selfClosing", true);
        setBooleanField(term48380, term48380.getClass(), "preserveWhitespace", true);
        setBooleanField(term48380, term48380.getClass(), "formList", false);
        setBooleanField(term48380, term48380.getClass(), "formSubmit", true);
        term48462 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term48462, term48462.getClass(), "tagName", "");
        setBooleanField(term48462, term48462.getClass(), "isBlock", true);
        setBooleanField(term48462, term48462.getClass(), "formatAsBlock", false);
        setBooleanField(term48462, term48462.getClass(), "canContainInline", true);
        setBooleanField(term48462, term48462.getClass(), "empty", false);
        setBooleanField(term48462, term48462.getClass(), "selfClosing", true);
        setBooleanField(term48462, term48462.getClass(), "preserveWhitespace", true);
        setBooleanField(term48462, term48462.getClass(), "formList", false);
        setBooleanField(term48462, term48462.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term48380, args);
        assertTrue(recursiveEquals(term48380, term48462));
        assertTrue(recursiveEquals(retValue, 1771470239));
    }

};


