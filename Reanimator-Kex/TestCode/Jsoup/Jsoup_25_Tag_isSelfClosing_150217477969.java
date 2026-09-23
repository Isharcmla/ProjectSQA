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

public class Tag_isSelfClosing_150217477969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4912;
     Object term4944;

    public Tag_isSelfClosing_150217477969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4912 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term4912, term4912.getClass(), "empty", true);
        term4944 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4944, term4944.getClass(), "tagName", null);
        setBooleanField(term4944, term4944.getClass(), "isBlock", false);
        setBooleanField(term4944, term4944.getClass(), "formatAsBlock", false);
        setBooleanField(term4944, term4944.getClass(), "canContainBlock", false);
        setBooleanField(term4944, term4944.getClass(), "canContainInline", false);
        setBooleanField(term4944, term4944.getClass(), "empty", true);
        setBooleanField(term4944, term4944.getClass(), "selfClosing", false);
        setBooleanField(term4944, term4944.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isSelfClosing", argTypes, term4912, args);
        assertTrue(recursiveEquals(term4912, term4944));
        assertTrue(recursiveEquals(retValue, true));
    }

};


