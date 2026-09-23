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

public class Tag_hashCode_901271351531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45836;
     Object term45895;

    public Tag_hashCode_901271351531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45836 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term45836, term45836.getClass(), "tagName", "");
        setBooleanField(term45836, term45836.getClass(), "isBlock", true);
        setBooleanField(term45836, term45836.getClass(), "formatAsBlock", false);
        setBooleanField(term45836, term45836.getClass(), "canContainInline", false);
        setBooleanField(term45836, term45836.getClass(), "empty", true);
        setBooleanField(term45836, term45836.getClass(), "selfClosing", true);
        setBooleanField(term45836, term45836.getClass(), "preserveWhitespace", false);
        setBooleanField(term45836, term45836.getClass(), "formList", true);
        term45895 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term45895, term45895.getClass(), "tagName", "");
        setBooleanField(term45895, term45895.getClass(), "isBlock", true);
        setBooleanField(term45895, term45895.getClass(), "formatAsBlock", false);
        setBooleanField(term45895, term45895.getClass(), "canContainInline", false);
        setBooleanField(term45895, term45895.getClass(), "empty", true);
        setBooleanField(term45895, term45895.getClass(), "selfClosing", true);
        setBooleanField(term45895, term45895.getClass(), "preserveWhitespace", false);
        setBooleanField(term45895, term45895.getClass(), "formList", true);
        setBooleanField(term45895, term45895.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term45836, args);
        assertTrue(recursiveEquals(term45836, term45895));
        assertTrue(recursiveEquals(retValue, 1743763678));
    }

};


