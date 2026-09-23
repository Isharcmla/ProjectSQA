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

public class Tag_isInline_25036527947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2973;
     Object term3267;

    public Tag_isInline_25036527947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2973 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term2973, term2973.getClass(), "isBlock", false);
        term3267 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3267, term3267.getClass(), "tagName", null);
        setBooleanField(term3267, term3267.getClass(), "isBlock", false);
        setBooleanField(term3267, term3267.getClass(), "formatAsBlock", false);
        setBooleanField(term3267, term3267.getClass(), "canContainBlock", false);
        setBooleanField(term3267, term3267.getClass(), "canContainInline", false);
        setBooleanField(term3267, term3267.getClass(), "empty", false);
        setBooleanField(term3267, term3267.getClass(), "selfClosing", false);
        setBooleanField(term3267, term3267.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isInline", argTypes, term2973, args);
        assertTrue(recursiveEquals(term2973, term3267));
        assertTrue(recursiveEquals(retValue, true));
    }

};


