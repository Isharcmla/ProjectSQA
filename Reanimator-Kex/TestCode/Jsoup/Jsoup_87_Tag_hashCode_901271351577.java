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

public class Tag_hashCode_901271351577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49838;
     Object term49920;

    public Tag_hashCode_901271351577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49838 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term49838, term49838.getClass(), "tagName", "");
        setBooleanField(term49838, term49838.getClass(), "isBlock", false);
        setBooleanField(term49838, term49838.getClass(), "formatAsBlock", true);
        setBooleanField(term49838, term49838.getClass(), "canContainInline", true);
        setBooleanField(term49838, term49838.getClass(), "empty", false);
        setBooleanField(term49838, term49838.getClass(), "selfClosing", true);
        setBooleanField(term49838, term49838.getClass(), "preserveWhitespace", false);
        setBooleanField(term49838, term49838.getClass(), "formList", true);
        setBooleanField(term49838, term49838.getClass(), "formSubmit", true);
        term49920 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term49920, term49920.getClass(), "tagName", "");
        setBooleanField(term49920, term49920.getClass(), "isBlock", false);
        setBooleanField(term49920, term49920.getClass(), "formatAsBlock", true);
        setBooleanField(term49920, term49920.getClass(), "canContainInline", true);
        setBooleanField(term49920, term49920.getClass(), "empty", false);
        setBooleanField(term49920, term49920.getClass(), "selfClosing", true);
        setBooleanField(term49920, term49920.getClass(), "preserveWhitespace", false);
        setBooleanField(term49920, term49920.getClass(), "formList", true);
        setBooleanField(term49920, term49920.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term49838, args);
        assertTrue(recursiveEquals(term49838, term49920));
        assertTrue(recursiveEquals(retValue, 916162655));
    }

};


