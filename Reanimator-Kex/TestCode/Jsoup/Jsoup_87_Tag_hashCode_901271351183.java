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

public class Tag_hashCode_901271351183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16322;
     Object term16381;

    public Tag_hashCode_901271351183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16322 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16322, term16322.getClass(), "tagName", "");
        setBooleanField(term16322, term16322.getClass(), "isBlock", true);
        setBooleanField(term16322, term16322.getClass(), "formatAsBlock", false);
        setBooleanField(term16322, term16322.getClass(), "canContainInline", true);
        setBooleanField(term16322, term16322.getClass(), "empty", true);
        term16381 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16381, term16381.getClass(), "tagName", "");
        setBooleanField(term16381, term16381.getClass(), "isBlock", true);
        setBooleanField(term16381, term16381.getClass(), "formatAsBlock", false);
        setBooleanField(term16381, term16381.getClass(), "canContainInline", true);
        setBooleanField(term16381, term16381.getClass(), "empty", true);
        setBooleanField(term16381, term16381.getClass(), "selfClosing", false);
        setBooleanField(term16381, term16381.getClass(), "preserveWhitespace", false);
        setBooleanField(term16381, term16381.getClass(), "formList", false);
        setBooleanField(term16381, term16381.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term16322, args);
        assertTrue(recursiveEquals(term16322, term16381));
        assertTrue(recursiveEquals(retValue, 1772363007));
    }

};


