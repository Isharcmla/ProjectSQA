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

public class Tag_hashCode_901271351302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26305;
     Object term26515;

    public Tag_hashCode_901271351302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26305 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26305, term26305.getClass(), "tagName", "");
        setBooleanField(term26305, term26305.getClass(), "isBlock", false);
        setBooleanField(term26305, term26305.getClass(), "formatAsBlock", false);
        setBooleanField(term26305, term26305.getClass(), "canContainInline", false);
        setBooleanField(term26305, term26305.getClass(), "empty", true);
        setBooleanField(term26305, term26305.getClass(), "selfClosing", true);
        setBooleanField(term26305, term26305.getClass(), "preserveWhitespace", false);
        setBooleanField(term26305, term26305.getClass(), "formList", true);
        term26515 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26515, term26515.getClass(), "tagName", "");
        setBooleanField(term26515, term26515.getClass(), "isBlock", false);
        setBooleanField(term26515, term26515.getClass(), "formatAsBlock", false);
        setBooleanField(term26515, term26515.getClass(), "canContainInline", false);
        setBooleanField(term26515, term26515.getClass(), "empty", true);
        setBooleanField(term26515, term26515.getClass(), "selfClosing", true);
        setBooleanField(term26515, term26515.getClass(), "preserveWhitespace", false);
        setBooleanField(term26515, term26515.getClass(), "formList", true);
        setBooleanField(term26515, term26515.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term26305, args);
        assertTrue(recursiveEquals(term26305, term26515));
        assertTrue(recursiveEquals(retValue, 953343));
    }

};


