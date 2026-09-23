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

public class Tag_hashCode_901271351161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14520;
     Object term14579;

    public Tag_hashCode_901271351161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14520 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14520, term14520.getClass(), "tagName", "");
        setBooleanField(term14520, term14520.getClass(), "isBlock", true);
        setBooleanField(term14520, term14520.getClass(), "formatAsBlock", false);
        setBooleanField(term14520, term14520.getClass(), "canContainInline", true);
        term14579 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14579, term14579.getClass(), "tagName", "");
        setBooleanField(term14579, term14579.getClass(), "isBlock", true);
        setBooleanField(term14579, term14579.getClass(), "formatAsBlock", false);
        setBooleanField(term14579, term14579.getClass(), "canContainInline", true);
        setBooleanField(term14579, term14579.getClass(), "empty", false);
        setBooleanField(term14579, term14579.getClass(), "selfClosing", false);
        setBooleanField(term14579, term14579.getClass(), "preserveWhitespace", false);
        setBooleanField(term14579, term14579.getClass(), "formList", false);
        setBooleanField(term14579, term14579.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term14520, args);
        assertTrue(recursiveEquals(term14520, term14579));
        assertTrue(recursiveEquals(retValue, 1771439486));
    }

};


