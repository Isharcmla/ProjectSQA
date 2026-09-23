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

public class Tag_hashCode_901271351458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39670;
     Object term39872;

    public Tag_hashCode_901271351458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39670 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term39670, term39670.getClass(), "tagName", "");
        setBooleanField(term39670, term39670.getClass(), "isBlock", true);
        setBooleanField(term39670, term39670.getClass(), "formatAsBlock", true);
        setBooleanField(term39670, term39670.getClass(), "canContainInline", true);
        setBooleanField(term39670, term39670.getClass(), "empty", false);
        setBooleanField(term39670, term39670.getClass(), "selfClosing", true);
        setBooleanField(term39670, term39670.getClass(), "preserveWhitespace", false);
        setBooleanField(term39670, term39670.getClass(), "formList", true);
        setBooleanField(term39670, term39670.getClass(), "formSubmit", true);
        term39872 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term39872, term39872.getClass(), "tagName", "");
        setBooleanField(term39872, term39872.getClass(), "isBlock", true);
        setBooleanField(term39872, term39872.getClass(), "formatAsBlock", true);
        setBooleanField(term39872, term39872.getClass(), "canContainInline", true);
        setBooleanField(term39872, term39872.getClass(), "empty", false);
        setBooleanField(term39872, term39872.getClass(), "selfClosing", true);
        setBooleanField(term39872, term39872.getClass(), "preserveWhitespace", false);
        setBooleanField(term39872, term39872.getClass(), "formList", true);
        setBooleanField(term39872, term39872.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term39670, args);
        assertTrue(recursiveEquals(term39670, term39872));
        assertTrue(recursiveEquals(retValue, -1635994306));
    }

};


