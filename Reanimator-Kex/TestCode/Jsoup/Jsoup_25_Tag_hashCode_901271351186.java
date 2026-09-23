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

public class Tag_hashCode_901271351186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14652;
     Object term14715;

    public Tag_hashCode_901271351186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14652 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14652, term14652.getClass(), "tagName", "");
        setBooleanField(term14652, term14652.getClass(), "isBlock", true);
        setBooleanField(term14652, term14652.getClass(), "formatAsBlock", true);
        setBooleanField(term14652, term14652.getClass(), "canContainBlock", false);
        setBooleanField(term14652, term14652.getClass(), "canContainInline", false);
        setBooleanField(term14652, term14652.getClass(), "empty", true);
        setBooleanField(term14652, term14652.getClass(), "selfClosing", false);
        setBooleanField(term14652, term14652.getClass(), "preserveWhitespace", true);
        term14715 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14715, term14715.getClass(), "tagName", "");
        setBooleanField(term14715, term14715.getClass(), "isBlock", true);
        setBooleanField(term14715, term14715.getClass(), "formatAsBlock", true);
        setBooleanField(term14715, term14715.getClass(), "canContainBlock", false);
        setBooleanField(term14715, term14715.getClass(), "canContainInline", false);
        setBooleanField(term14715, term14715.getClass(), "empty", true);
        setBooleanField(term14715, term14715.getClass(), "selfClosing", false);
        setBooleanField(term14715, term14715.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term14652, args);
        assertTrue(recursiveEquals(term14652, term14715));
        assertTrue(recursiveEquals(retValue, 916133794));
    }

};


