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

public class Tag_hashCode_901271351324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28105;
     Object term28308;

    public Tag_hashCode_901271351324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28105 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term28105, term28105.getClass(), "tagName", "");
        setBooleanField(term28105, term28105.getClass(), "isBlock", true);
        setBooleanField(term28105, term28105.getClass(), "formatAsBlock", false);
        setBooleanField(term28105, term28105.getClass(), "canContainInline", false);
        setBooleanField(term28105, term28105.getClass(), "empty", false);
        setBooleanField(term28105, term28105.getClass(), "selfClosing", false);
        setBooleanField(term28105, term28105.getClass(), "preserveWhitespace", true);
        setBooleanField(term28105, term28105.getClass(), "formList", true);
        term28308 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term28308, term28308.getClass(), "tagName", "");
        setBooleanField(term28308, term28308.getClass(), "isBlock", true);
        setBooleanField(term28308, term28308.getClass(), "formatAsBlock", false);
        setBooleanField(term28308, term28308.getClass(), "canContainInline", false);
        setBooleanField(term28308, term28308.getClass(), "empty", false);
        setBooleanField(term28308, term28308.getClass(), "selfClosing", false);
        setBooleanField(term28308, term28308.getClass(), "preserveWhitespace", true);
        setBooleanField(term28308, term28308.getClass(), "formList", true);
        setBooleanField(term28308, term28308.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term28105, args);
        assertTrue(recursiveEquals(term28105, term28308));
        assertTrue(recursiveEquals(retValue, 1742811327));
    }

};


