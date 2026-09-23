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

public class Tag_hashCode_901271351385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33172;
     Object term33519;

    public Tag_hashCode_901271351385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33172 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term33172, term33172.getClass(), "tagName", "");
        setBooleanField(term33172, term33172.getClass(), "isBlock", true);
        setBooleanField(term33172, term33172.getClass(), "formatAsBlock", true);
        setBooleanField(term33172, term33172.getClass(), "canContainInline", true);
        setBooleanField(term33172, term33172.getClass(), "empty", true);
        setBooleanField(term33172, term33172.getClass(), "selfClosing", true);
        term33519 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term33519, term33519.getClass(), "tagName", "");
        setBooleanField(term33519, term33519.getClass(), "isBlock", true);
        setBooleanField(term33519, term33519.getClass(), "formatAsBlock", true);
        setBooleanField(term33519, term33519.getClass(), "canContainInline", true);
        setBooleanField(term33519, term33519.getClass(), "empty", true);
        setBooleanField(term33519, term33519.getClass(), "selfClosing", true);
        setBooleanField(term33519, term33519.getClass(), "preserveWhitespace", false);
        setBooleanField(term33519, term33519.getClass(), "formList", false);
        setBooleanField(term33519, term33519.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term33172, args);
        assertTrue(recursiveEquals(term33172, term33519));
        assertTrue(recursiveEquals(retValue, -1635070817));
    }

};


