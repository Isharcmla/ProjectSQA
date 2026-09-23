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

public class Tag_hashCode_901271351397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34487;
     Object term34569;

    public Tag_hashCode_901271351397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34487 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term34487, term34487.getClass(), "tagName", "");
        setBooleanField(term34487, term34487.getClass(), "isBlock", true);
        setBooleanField(term34487, term34487.getClass(), "formatAsBlock", true);
        setBooleanField(term34487, term34487.getClass(), "canContainInline", true);
        setBooleanField(term34487, term34487.getClass(), "empty", false);
        setBooleanField(term34487, term34487.getClass(), "selfClosing", false);
        setBooleanField(term34487, term34487.getClass(), "preserveWhitespace", true);
        setBooleanField(term34487, term34487.getClass(), "formList", false);
        setBooleanField(term34487, term34487.getClass(), "formSubmit", true);
        term34569 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term34569, term34569.getClass(), "tagName", "");
        setBooleanField(term34569, term34569.getClass(), "isBlock", true);
        setBooleanField(term34569, term34569.getClass(), "formatAsBlock", true);
        setBooleanField(term34569, term34569.getClass(), "canContainInline", true);
        setBooleanField(term34569, term34569.getClass(), "empty", false);
        setBooleanField(term34569, term34569.getClass(), "selfClosing", false);
        setBooleanField(term34569, term34569.getClass(), "preserveWhitespace", true);
        setBooleanField(term34569, term34569.getClass(), "formList", false);
        setBooleanField(term34569, term34569.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term34487, args);
        assertTrue(recursiveEquals(term34487, term34569));
        assertTrue(recursiveEquals(retValue, -1636023167));
    }

};


