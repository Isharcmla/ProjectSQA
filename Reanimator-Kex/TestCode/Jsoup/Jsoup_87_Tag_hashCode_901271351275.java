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

public class Tag_hashCode_901271351275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24139;
     Object term24221;

    public Tag_hashCode_901271351275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24139 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24139, term24139.getClass(), "tagName", "");
        setBooleanField(term24139, term24139.getClass(), "isBlock", true);
        setBooleanField(term24139, term24139.getClass(), "formatAsBlock", false);
        setBooleanField(term24139, term24139.getClass(), "canContainInline", true);
        setBooleanField(term24139, term24139.getClass(), "empty", true);
        setBooleanField(term24139, term24139.getClass(), "selfClosing", false);
        setBooleanField(term24139, term24139.getClass(), "preserveWhitespace", false);
        setBooleanField(term24139, term24139.getClass(), "formList", false);
        setBooleanField(term24139, term24139.getClass(), "formSubmit", true);
        term24221 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24221, term24221.getClass(), "tagName", "");
        setBooleanField(term24221, term24221.getClass(), "isBlock", true);
        setBooleanField(term24221, term24221.getClass(), "formatAsBlock", false);
        setBooleanField(term24221, term24221.getClass(), "canContainInline", true);
        setBooleanField(term24221, term24221.getClass(), "empty", true);
        setBooleanField(term24221, term24221.getClass(), "selfClosing", false);
        setBooleanField(term24221, term24221.getClass(), "preserveWhitespace", false);
        setBooleanField(term24221, term24221.getClass(), "formList", false);
        setBooleanField(term24221, term24221.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term24139, args);
        assertTrue(recursiveEquals(term24139, term24221));
        assertTrue(recursiveEquals(retValue, 1772363008));
    }

};


