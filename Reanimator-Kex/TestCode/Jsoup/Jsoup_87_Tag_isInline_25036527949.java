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

public class Tag_isInline_25036527949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2474;
     Object term2515;

    public Tag_isInline_25036527949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2474 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term2474, term2474.getClass(), "isBlock", true);
        term2515 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2515, term2515.getClass(), "tagName", null);
        setBooleanField(term2515, term2515.getClass(), "isBlock", true);
        setBooleanField(term2515, term2515.getClass(), "formatAsBlock", false);
        setBooleanField(term2515, term2515.getClass(), "canContainInline", false);
        setBooleanField(term2515, term2515.getClass(), "empty", false);
        setBooleanField(term2515, term2515.getClass(), "selfClosing", false);
        setBooleanField(term2515, term2515.getClass(), "preserveWhitespace", false);
        setBooleanField(term2515, term2515.getClass(), "formList", false);
        setBooleanField(term2515, term2515.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isInline", argTypes, term2474, args);
        assertTrue(recursiveEquals(term2474, term2515));
        assertTrue(recursiveEquals(retValue, false));
    }

};


