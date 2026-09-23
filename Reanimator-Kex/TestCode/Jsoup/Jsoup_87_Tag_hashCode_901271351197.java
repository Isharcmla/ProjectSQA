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

public class Tag_hashCode_901271351197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17520;
     Object term17579;

    public Tag_hashCode_901271351197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17520 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17520, term17520.getClass(), "tagName", "");
        setBooleanField(term17520, term17520.getClass(), "isBlock", false);
        setBooleanField(term17520, term17520.getClass(), "formatAsBlock", false);
        setBooleanField(term17520, term17520.getClass(), "canContainInline", false);
        setBooleanField(term17520, term17520.getClass(), "empty", true);
        setBooleanField(term17520, term17520.getClass(), "selfClosing", true);
        term17579 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17579, term17579.getClass(), "tagName", "");
        setBooleanField(term17579, term17579.getClass(), "isBlock", false);
        setBooleanField(term17579, term17579.getClass(), "formatAsBlock", false);
        setBooleanField(term17579, term17579.getClass(), "canContainInline", false);
        setBooleanField(term17579, term17579.getClass(), "empty", true);
        setBooleanField(term17579, term17579.getClass(), "selfClosing", true);
        setBooleanField(term17579, term17579.getClass(), "preserveWhitespace", false);
        setBooleanField(term17579, term17579.getClass(), "formList", false);
        setBooleanField(term17579, term17579.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term17520, args);
        assertTrue(recursiveEquals(term17520, term17579));
        assertTrue(recursiveEquals(retValue, 953312));
    }

};


