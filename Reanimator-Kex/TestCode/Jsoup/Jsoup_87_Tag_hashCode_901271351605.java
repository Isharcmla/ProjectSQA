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

public class Tag_hashCode_901271351605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52301;
     Object term52360;

    public Tag_hashCode_901271351605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52301 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term52301, term52301.getClass(), "tagName", "");
        setBooleanField(term52301, term52301.getClass(), "isBlock", true);
        setBooleanField(term52301, term52301.getClass(), "formatAsBlock", true);
        setBooleanField(term52301, term52301.getClass(), "canContainInline", true);
        setBooleanField(term52301, term52301.getClass(), "empty", true);
        setBooleanField(term52301, term52301.getClass(), "selfClosing", false);
        setBooleanField(term52301, term52301.getClass(), "preserveWhitespace", false);
        setBooleanField(term52301, term52301.getClass(), "formList", true);
        setBooleanField(term52301, term52301.getClass(), "formSubmit", true);
        term52360 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term52360, term52360.getClass(), "tagName", "");
        setBooleanField(term52360, term52360.getClass(), "isBlock", true);
        setBooleanField(term52360, term52360.getClass(), "formatAsBlock", true);
        setBooleanField(term52360, term52360.getClass(), "canContainInline", true);
        setBooleanField(term52360, term52360.getClass(), "empty", true);
        setBooleanField(term52360, term52360.getClass(), "selfClosing", false);
        setBooleanField(term52360, term52360.getClass(), "preserveWhitespace", false);
        setBooleanField(term52360, term52360.getClass(), "formList", true);
        setBooleanField(term52360, term52360.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term52301, args);
        assertTrue(recursiveEquals(term52301, term52360));
        assertTrue(recursiveEquals(retValue, -1635100576));
    }

};


