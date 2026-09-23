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

public class Tag_hashCode_901271351339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29384;
     Object term29489;

    public Tag_hashCode_901271351339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29384 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term29384, term29384.getClass(), "tagName", "");
        setBooleanField(term29384, term29384.getClass(), "isBlock", true);
        setBooleanField(term29384, term29384.getClass(), "formatAsBlock", false);
        setBooleanField(term29384, term29384.getClass(), "canContainInline", true);
        setBooleanField(term29384, term29384.getClass(), "empty", false);
        setBooleanField(term29384, term29384.getClass(), "selfClosing", false);
        setBooleanField(term29384, term29384.getClass(), "preserveWhitespace", true);
        setBooleanField(term29384, term29384.getClass(), "formList", false);
        setBooleanField(term29384, term29384.getClass(), "formSubmit", true);
        term29489 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term29489, term29489.getClass(), "tagName", "");
        setBooleanField(term29489, term29489.getClass(), "isBlock", true);
        setBooleanField(term29489, term29489.getClass(), "formatAsBlock", false);
        setBooleanField(term29489, term29489.getClass(), "canContainInline", true);
        setBooleanField(term29489, term29489.getClass(), "empty", false);
        setBooleanField(term29489, term29489.getClass(), "selfClosing", false);
        setBooleanField(term29489, term29489.getClass(), "preserveWhitespace", true);
        setBooleanField(term29489, term29489.getClass(), "formList", false);
        setBooleanField(term29489, term29489.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term29384, args);
        assertTrue(recursiveEquals(term29384, term29489));
        assertTrue(recursiveEquals(retValue, 1771440448));
    }

};


