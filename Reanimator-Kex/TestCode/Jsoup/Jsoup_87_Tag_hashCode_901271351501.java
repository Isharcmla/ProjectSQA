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

public class Tag_hashCode_901271351501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43233;
     Object term43292;

    public Tag_hashCode_901271351501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43233 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term43233, term43233.getClass(), "tagName", "");
        setBooleanField(term43233, term43233.getClass(), "isBlock", true);
        setBooleanField(term43233, term43233.getClass(), "formatAsBlock", true);
        setBooleanField(term43233, term43233.getClass(), "canContainInline", false);
        setBooleanField(term43233, term43233.getClass(), "empty", true);
        setBooleanField(term43233, term43233.getClass(), "selfClosing", false);
        setBooleanField(term43233, term43233.getClass(), "preserveWhitespace", true);
        setBooleanField(term43233, term43233.getClass(), "formList", true);
        term43292 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term43292, term43292.getClass(), "tagName", "");
        setBooleanField(term43292, term43292.getClass(), "isBlock", true);
        setBooleanField(term43292, term43292.getClass(), "formatAsBlock", true);
        setBooleanField(term43292, term43292.getClass(), "canContainInline", false);
        setBooleanField(term43292, term43292.getClass(), "empty", true);
        setBooleanField(term43292, term43292.getClass(), "selfClosing", false);
        setBooleanField(term43292, term43292.getClass(), "preserveWhitespace", true);
        setBooleanField(term43292, term43292.getClass(), "formList", true);
        setBooleanField(term43292, term43292.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term43233, args);
        assertTrue(recursiveEquals(term43233, term43292));
        assertTrue(recursiveEquals(retValue, -1663728767));
    }

};


