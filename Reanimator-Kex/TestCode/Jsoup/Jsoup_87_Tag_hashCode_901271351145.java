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

public class Tag_hashCode_901271351145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13241;
     Object term13300;

    public Tag_hashCode_901271351145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13241 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term13241, term13241.getClass(), "tagName", "");
        setBooleanField(term13241, term13241.getClass(), "isBlock", false);
        setBooleanField(term13241, term13241.getClass(), "formatAsBlock", true);
        setBooleanField(term13241, term13241.getClass(), "canContainInline", false);
        setBooleanField(term13241, term13241.getClass(), "empty", true);
        setBooleanField(term13241, term13241.getClass(), "selfClosing", false);
        setBooleanField(term13241, term13241.getClass(), "preserveWhitespace", false);
        setBooleanField(term13241, term13241.getClass(), "formList", true);
        term13300 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term13300, term13300.getClass(), "tagName", "");
        setBooleanField(term13300, term13300.getClass(), "isBlock", false);
        setBooleanField(term13300, term13300.getClass(), "formatAsBlock", true);
        setBooleanField(term13300, term13300.getClass(), "canContainInline", false);
        setBooleanField(term13300, term13300.getClass(), "empty", true);
        setBooleanField(term13300, term13300.getClass(), "selfClosing", false);
        setBooleanField(term13300, term13300.getClass(), "preserveWhitespace", false);
        setBooleanField(term13300, term13300.getClass(), "formList", true);
        setBooleanField(term13300, term13300.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term13241, args);
        assertTrue(recursiveEquals(term13241, term13300));
        assertTrue(recursiveEquals(retValue, 888427233));
    }

};


