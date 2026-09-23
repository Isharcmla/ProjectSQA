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

public class Tag_isKnownTag_58165808332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318;
     Object term1385;

    public Tag_isKnownTag_58165808332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term318 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term318, term318.getClass(), "tagName", "uuaPigETmJ");
        setBooleanField(term318, term318.getClass(), "isBlock", true);
        setBooleanField(term318, term318.getClass(), "formatAsBlock", true);
        setBooleanField(term318, term318.getClass(), "canContainInline", true);
        setBooleanField(term318, term318.getClass(), "empty", false);
        setBooleanField(term318, term318.getClass(), "selfClosing", false);
        setBooleanField(term318, term318.getClass(), "preserveWhitespace", false);
        setBooleanField(term318, term318.getClass(), "formList", false);
        setBooleanField(term318, term318.getClass(), "formSubmit", false);
        term1385 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1385, term1385.getClass(), "tagName", "uuaPigETmJ");
        setBooleanField(term1385, term1385.getClass(), "isBlock", true);
        setBooleanField(term1385, term1385.getClass(), "formatAsBlock", true);
        setBooleanField(term1385, term1385.getClass(), "canContainInline", true);
        setBooleanField(term1385, term1385.getClass(), "empty", false);
        setBooleanField(term1385, term1385.getClass(), "selfClosing", false);
        setBooleanField(term1385, term1385.getClass(), "preserveWhitespace", false);
        setBooleanField(term1385, term1385.getClass(), "formList", false);
        setBooleanField(term1385, term1385.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isKnownTag", argTypes, term318, args);
        assertTrue(recursiveEquals(term318, term1385));
    }

};


