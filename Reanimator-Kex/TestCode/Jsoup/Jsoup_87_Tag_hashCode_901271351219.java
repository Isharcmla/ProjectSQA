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

public class Tag_hashCode_901271351219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19497;
     Object term19579;

    public Tag_hashCode_901271351219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19497 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term19497, term19497.getClass(), "tagName", "");
        setBooleanField(term19497, term19497.getClass(), "isBlock", true);
        setBooleanField(term19497, term19497.getClass(), "formatAsBlock", false);
        setBooleanField(term19497, term19497.getClass(), "canContainInline", true);
        setBooleanField(term19497, term19497.getClass(), "empty", false);
        setBooleanField(term19497, term19497.getClass(), "selfClosing", false);
        setBooleanField(term19497, term19497.getClass(), "preserveWhitespace", false);
        setBooleanField(term19497, term19497.getClass(), "formList", true);
        setBooleanField(term19497, term19497.getClass(), "formSubmit", true);
        term19579 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term19579, term19579.getClass(), "tagName", "");
        setBooleanField(term19579, term19579.getClass(), "isBlock", true);
        setBooleanField(term19579, term19579.getClass(), "formatAsBlock", false);
        setBooleanField(term19579, term19579.getClass(), "canContainInline", true);
        setBooleanField(term19579, term19579.getClass(), "empty", false);
        setBooleanField(term19579, term19579.getClass(), "selfClosing", false);
        setBooleanField(term19579, term19579.getClass(), "preserveWhitespace", false);
        setBooleanField(term19579, term19579.getClass(), "formList", true);
        setBooleanField(term19579, term19579.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term19497, args);
        assertTrue(recursiveEquals(term19497, term19579));
        assertTrue(recursiveEquals(retValue, 1771439518));
    }

};


