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

public class Tag_hashCode_901271351249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21967;
     Object term22049;

    public Tag_hashCode_901271351249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21967 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term21967, term21967.getClass(), "tagName", "");
        setBooleanField(term21967, term21967.getClass(), "isBlock", true);
        setBooleanField(term21967, term21967.getClass(), "formatAsBlock", true);
        setBooleanField(term21967, term21967.getClass(), "canContainInline", true);
        setBooleanField(term21967, term21967.getClass(), "empty", false);
        setBooleanField(term21967, term21967.getClass(), "selfClosing", true);
        term22049 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22049, term22049.getClass(), "tagName", "");
        setBooleanField(term22049, term22049.getClass(), "isBlock", true);
        setBooleanField(term22049, term22049.getClass(), "formatAsBlock", true);
        setBooleanField(term22049, term22049.getClass(), "canContainInline", true);
        setBooleanField(term22049, term22049.getClass(), "empty", false);
        setBooleanField(term22049, term22049.getClass(), "selfClosing", true);
        setBooleanField(term22049, term22049.getClass(), "preserveWhitespace", false);
        setBooleanField(term22049, term22049.getClass(), "formList", false);
        setBooleanField(term22049, term22049.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term21967, args);
        assertTrue(recursiveEquals(term21967, term22049));
        assertTrue(recursiveEquals(retValue, -1635994338));
    }

};


