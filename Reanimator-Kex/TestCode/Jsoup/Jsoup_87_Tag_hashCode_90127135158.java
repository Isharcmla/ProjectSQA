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

public class Tag_hashCode_90127135158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3219;
     Object term3426;

    public Tag_hashCode_90127135158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3219 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3219, term3219.getClass(), "tagName", "");
        setBooleanField(term3219, term3219.getClass(), "isBlock", false);
        setBooleanField(term3219, term3219.getClass(), "formatAsBlock", false);
        setBooleanField(term3219, term3219.getClass(), "canContainInline", true);
        setBooleanField(term3219, term3219.getClass(), "empty", true);
        setBooleanField(term3219, term3219.getClass(), "selfClosing", true);
        term3426 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3426, term3426.getClass(), "tagName", "");
        setBooleanField(term3426, term3426.getClass(), "isBlock", false);
        setBooleanField(term3426, term3426.getClass(), "formatAsBlock", false);
        setBooleanField(term3426, term3426.getClass(), "canContainInline", true);
        setBooleanField(term3426, term3426.getClass(), "empty", true);
        setBooleanField(term3426, term3426.getClass(), "selfClosing", true);
        setBooleanField(term3426, term3426.getClass(), "preserveWhitespace", false);
        setBooleanField(term3426, term3426.getClass(), "formList", false);
        setBooleanField(term3426, term3426.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term3219, args);
        assertTrue(recursiveEquals(term3219, term3426));
        assertTrue(recursiveEquals(retValue, 29582463));
    }

};


