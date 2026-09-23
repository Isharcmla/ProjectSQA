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

public class Tag_hashCode_901271351237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20989;
     Object term21071;

    public Tag_hashCode_901271351237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20989 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20989, term20989.getClass(), "tagName", "");
        setBooleanField(term20989, term20989.getClass(), "isBlock", true);
        setBooleanField(term20989, term20989.getClass(), "formatAsBlock", true);
        setBooleanField(term20989, term20989.getClass(), "canContainInline", false);
        setBooleanField(term20989, term20989.getClass(), "empty", false);
        setBooleanField(term20989, term20989.getClass(), "selfClosing", true);
        setBooleanField(term20989, term20989.getClass(), "preserveWhitespace", false);
        setBooleanField(term20989, term20989.getClass(), "formList", true);
        term21071 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term21071, term21071.getClass(), "tagName", "");
        setBooleanField(term21071, term21071.getClass(), "isBlock", true);
        setBooleanField(term21071, term21071.getClass(), "formatAsBlock", true);
        setBooleanField(term21071, term21071.getClass(), "canContainInline", false);
        setBooleanField(term21071, term21071.getClass(), "empty", false);
        setBooleanField(term21071, term21071.getClass(), "selfClosing", true);
        setBooleanField(term21071, term21071.getClass(), "preserveWhitespace", false);
        setBooleanField(term21071, term21071.getClass(), "formList", true);
        setBooleanField(term21071, term21071.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term20989, args);
        assertTrue(recursiveEquals(term20989, term21071));
        assertTrue(recursiveEquals(retValue, -1664623458));
    }

};


