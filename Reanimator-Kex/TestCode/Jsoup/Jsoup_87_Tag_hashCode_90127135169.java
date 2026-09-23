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

public class Tag_hashCode_90127135169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4105;
     Object term4164;

    public Tag_hashCode_90127135169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4105 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4105, term4105.getClass(), "tagName", "");
        setBooleanField(term4105, term4105.getClass(), "isBlock", false);
        setBooleanField(term4105, term4105.getClass(), "formatAsBlock", false);
        setBooleanField(term4105, term4105.getClass(), "canContainInline", false);
        term4164 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4164, term4164.getClass(), "tagName", "");
        setBooleanField(term4164, term4164.getClass(), "isBlock", false);
        setBooleanField(term4164, term4164.getClass(), "formatAsBlock", false);
        setBooleanField(term4164, term4164.getClass(), "canContainInline", false);
        setBooleanField(term4164, term4164.getClass(), "empty", false);
        setBooleanField(term4164, term4164.getClass(), "selfClosing", false);
        setBooleanField(term4164, term4164.getClass(), "preserveWhitespace", false);
        setBooleanField(term4164, term4164.getClass(), "formList", false);
        setBooleanField(term4164, term4164.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term4105, args);
        assertTrue(recursiveEquals(term4105, term4164));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


