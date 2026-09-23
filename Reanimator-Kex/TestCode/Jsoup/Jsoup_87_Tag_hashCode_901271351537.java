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

public class Tag_hashCode_901271351537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46340;
     Object term46399;

    public Tag_hashCode_901271351537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46340 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term46340, term46340.getClass(), "tagName", "");
        setBooleanField(term46340, term46340.getClass(), "isBlock", true);
        setBooleanField(term46340, term46340.getClass(), "formatAsBlock", true);
        setBooleanField(term46340, term46340.getClass(), "canContainInline", true);
        setBooleanField(term46340, term46340.getClass(), "empty", true);
        setBooleanField(term46340, term46340.getClass(), "selfClosing", false);
        setBooleanField(term46340, term46340.getClass(), "preserveWhitespace", true);
        setBooleanField(term46340, term46340.getClass(), "formList", true);
        term46399 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term46399, term46399.getClass(), "tagName", "");
        setBooleanField(term46399, term46399.getClass(), "isBlock", true);
        setBooleanField(term46399, term46399.getClass(), "formatAsBlock", true);
        setBooleanField(term46399, term46399.getClass(), "canContainInline", true);
        setBooleanField(term46399, term46399.getClass(), "empty", true);
        setBooleanField(term46399, term46399.getClass(), "selfClosing", false);
        setBooleanField(term46399, term46399.getClass(), "preserveWhitespace", true);
        setBooleanField(term46399, term46399.getClass(), "formList", true);
        setBooleanField(term46399, term46399.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term46340, args);
        assertTrue(recursiveEquals(term46340, term46399));
        assertTrue(recursiveEquals(retValue, -1635099616));
    }

};


