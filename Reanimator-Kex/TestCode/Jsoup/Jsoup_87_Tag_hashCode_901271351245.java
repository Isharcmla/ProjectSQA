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

public class Tag_hashCode_901271351245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21648;
     Object term21730;

    public Tag_hashCode_901271351245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21648 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term21648, term21648.getClass(), "tagName", "");
        setBooleanField(term21648, term21648.getClass(), "isBlock", false);
        setBooleanField(term21648, term21648.getClass(), "formatAsBlock", false);
        setBooleanField(term21648, term21648.getClass(), "canContainInline", false);
        setBooleanField(term21648, term21648.getClass(), "empty", false);
        setBooleanField(term21648, term21648.getClass(), "selfClosing", false);
        setBooleanField(term21648, term21648.getClass(), "preserveWhitespace", true);
        setBooleanField(term21648, term21648.getClass(), "formList", true);
        term21730 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term21730, term21730.getClass(), "tagName", "");
        setBooleanField(term21730, term21730.getClass(), "isBlock", false);
        setBooleanField(term21730, term21730.getClass(), "formatAsBlock", false);
        setBooleanField(term21730, term21730.getClass(), "canContainInline", false);
        setBooleanField(term21730, term21730.getClass(), "empty", false);
        setBooleanField(term21730, term21730.getClass(), "selfClosing", false);
        setBooleanField(term21730, term21730.getClass(), "preserveWhitespace", true);
        setBooleanField(term21730, term21730.getClass(), "formList", true);
        setBooleanField(term21730, term21730.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term21648, args);
        assertTrue(recursiveEquals(term21648, term21730));
        assertTrue(recursiveEquals(retValue, 992));
    }

};


