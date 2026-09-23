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

public class Tag_hashCode_901271351135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12414;
     Object term12473;

    public Tag_hashCode_901271351135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12414 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term12414, term12414.getClass(), "tagName", "");
        setBooleanField(term12414, term12414.getClass(), "isBlock", false);
        setBooleanField(term12414, term12414.getClass(), "formatAsBlock", true);
        setBooleanField(term12414, term12414.getClass(), "canContainInline", false);
        setBooleanField(term12414, term12414.getClass(), "empty", false);
        setBooleanField(term12414, term12414.getClass(), "selfClosing", false);
        setBooleanField(term12414, term12414.getClass(), "preserveWhitespace", true);
        term12473 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term12473, term12473.getClass(), "tagName", "");
        setBooleanField(term12473, term12473.getClass(), "isBlock", false);
        setBooleanField(term12473, term12473.getClass(), "formatAsBlock", true);
        setBooleanField(term12473, term12473.getClass(), "canContainInline", false);
        setBooleanField(term12473, term12473.getClass(), "empty", false);
        setBooleanField(term12473, term12473.getClass(), "selfClosing", false);
        setBooleanField(term12473, term12473.getClass(), "preserveWhitespace", true);
        setBooleanField(term12473, term12473.getClass(), "formList", false);
        setBooleanField(term12473, term12473.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term12414, args);
        assertTrue(recursiveEquals(term12414, term12473));
        assertTrue(recursiveEquals(retValue, 887504642));
    }

};


