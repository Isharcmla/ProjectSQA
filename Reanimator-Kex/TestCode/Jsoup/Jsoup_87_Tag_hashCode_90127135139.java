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

public class Tag_hashCode_90127135139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term527;
     Object term1712;

    public Tag_hashCode_90127135139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term527 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term527, term527.getClass(), "tagName", "HyxfbSQYBe");
        setBooleanField(term527, term527.getClass(), "isBlock", false);
        setBooleanField(term527, term527.getClass(), "formatAsBlock", false);
        setBooleanField(term527, term527.getClass(), "canContainInline", true);
        setBooleanField(term527, term527.getClass(), "empty", true);
        setBooleanField(term527, term527.getClass(), "selfClosing", false);
        setBooleanField(term527, term527.getClass(), "preserveWhitespace", false);
        setBooleanField(term527, term527.getClass(), "formList", false);
        setBooleanField(term527, term527.getClass(), "formSubmit", false);
        term1712 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1712, term1712.getClass(), "tagName", "HyxfbSQYBe");
        setBooleanField(term1712, term1712.getClass(), "isBlock", false);
        setBooleanField(term1712, term1712.getClass(), "formatAsBlock", false);
        setBooleanField(term1712, term1712.getClass(), "canContainInline", true);
        setBooleanField(term1712, term1712.getClass(), "empty", true);
        setBooleanField(term1712, term1712.getClass(), "selfClosing", false);
        setBooleanField(term1712, term1712.getClass(), "preserveWhitespace", false);
        setBooleanField(term1712, term1712.getClass(), "formList", false);
        setBooleanField(term1712, term1712.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term527, args);
        assertTrue(recursiveEquals(term527, term1712));
        assertTrue(recursiveEquals(retValue, 1827243515));
    }

};


