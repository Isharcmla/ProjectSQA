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

public class Tag_hashCode_901271351460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39813;
     Object term40045;

    public Tag_hashCode_901271351460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39813 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term39813, term39813.getClass(), "tagName", "");
        setBooleanField(term39813, term39813.getClass(), "isBlock", false);
        setBooleanField(term39813, term39813.getClass(), "formatAsBlock", true);
        setBooleanField(term39813, term39813.getClass(), "canContainInline", true);
        setBooleanField(term39813, term39813.getClass(), "empty", true);
        setBooleanField(term39813, term39813.getClass(), "selfClosing", false);
        setBooleanField(term39813, term39813.getClass(), "preserveWhitespace", false);
        setBooleanField(term39813, term39813.getClass(), "formList", true);
        term40045 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term40045, term40045.getClass(), "tagName", "");
        setBooleanField(term40045, term40045.getClass(), "isBlock", false);
        setBooleanField(term40045, term40045.getClass(), "formatAsBlock", true);
        setBooleanField(term40045, term40045.getClass(), "canContainInline", true);
        setBooleanField(term40045, term40045.getClass(), "empty", true);
        setBooleanField(term40045, term40045.getClass(), "selfClosing", false);
        setBooleanField(term40045, term40045.getClass(), "preserveWhitespace", false);
        setBooleanField(term40045, term40045.getClass(), "formList", true);
        setBooleanField(term40045, term40045.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term39813, args);
        assertTrue(recursiveEquals(term39813, term40045));
        assertTrue(recursiveEquals(retValue, 917056384));
    }

};


