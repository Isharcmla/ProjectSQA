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

public class Tag_hashCode_901271351499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43065;
     Object term43124;

    public Tag_hashCode_901271351499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43065 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term43065, term43065.getClass(), "tagName", "");
        setBooleanField(term43065, term43065.getClass(), "isBlock", false);
        setBooleanField(term43065, term43065.getClass(), "formatAsBlock", true);
        setBooleanField(term43065, term43065.getClass(), "canContainInline", true);
        setBooleanField(term43065, term43065.getClass(), "empty", false);
        setBooleanField(term43065, term43065.getClass(), "selfClosing", false);
        setBooleanField(term43065, term43065.getClass(), "preserveWhitespace", true);
        setBooleanField(term43065, term43065.getClass(), "formList", true);
        setBooleanField(term43065, term43065.getClass(), "formSubmit", true);
        term43124 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term43124, term43124.getClass(), "tagName", "");
        setBooleanField(term43124, term43124.getClass(), "isBlock", false);
        setBooleanField(term43124, term43124.getClass(), "formatAsBlock", true);
        setBooleanField(term43124, term43124.getClass(), "canContainInline", true);
        setBooleanField(term43124, term43124.getClass(), "empty", false);
        setBooleanField(term43124, term43124.getClass(), "selfClosing", false);
        setBooleanField(term43124, term43124.getClass(), "preserveWhitespace", true);
        setBooleanField(term43124, term43124.getClass(), "formList", true);
        setBooleanField(term43124, term43124.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term43065, args);
        assertTrue(recursiveEquals(term43065, term43124));
        assertTrue(recursiveEquals(retValue, 916133825));
    }

};


