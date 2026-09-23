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

public class Tag_isSelfClosing_150217477971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4234;
     Object term4246;

    public Tag_isSelfClosing_150217477971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4234 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term4234, term4234.getClass(), "empty", true);
        term4246 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4246, term4246.getClass(), "tagName", null);
        setBooleanField(term4246, term4246.getClass(), "isBlock", false);
        setBooleanField(term4246, term4246.getClass(), "formatAsBlock", false);
        setBooleanField(term4246, term4246.getClass(), "canContainInline", false);
        setBooleanField(term4246, term4246.getClass(), "empty", true);
        setBooleanField(term4246, term4246.getClass(), "selfClosing", false);
        setBooleanField(term4246, term4246.getClass(), "preserveWhitespace", false);
        setBooleanField(term4246, term4246.getClass(), "formList", false);
        setBooleanField(term4246, term4246.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isSelfClosing", argTypes, term4234, args);
        assertTrue(recursiveEquals(term4234, term4246));
        assertTrue(recursiveEquals(retValue, true));
    }

};


