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

public class Tag_hashCode_901271351167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14977;
     Object term15036;

    public Tag_hashCode_901271351167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14977 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14977, term14977.getClass(), "tagName", "");
        setBooleanField(term14977, term14977.getClass(), "isBlock", false);
        setBooleanField(term14977, term14977.getClass(), "formatAsBlock", true);
        setBooleanField(term14977, term14977.getClass(), "canContainInline", false);
        setBooleanField(term14977, term14977.getClass(), "empty", true);
        setBooleanField(term14977, term14977.getClass(), "selfClosing", true);
        term15036 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term15036, term15036.getClass(), "tagName", "");
        setBooleanField(term15036, term15036.getClass(), "isBlock", false);
        setBooleanField(term15036, term15036.getClass(), "formatAsBlock", true);
        setBooleanField(term15036, term15036.getClass(), "canContainInline", false);
        setBooleanField(term15036, term15036.getClass(), "empty", true);
        setBooleanField(term15036, term15036.getClass(), "selfClosing", true);
        setBooleanField(term15036, term15036.getClass(), "preserveWhitespace", false);
        setBooleanField(term15036, term15036.getClass(), "formList", false);
        setBooleanField(term15036, term15036.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term14977, args);
        assertTrue(recursiveEquals(term14977, term15036));
        assertTrue(recursiveEquals(retValue, 888456993));
    }

};


