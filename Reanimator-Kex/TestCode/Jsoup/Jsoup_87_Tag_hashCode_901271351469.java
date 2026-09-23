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

public class Tag_hashCode_901271351469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40679;
     Object term40761;

    public Tag_hashCode_901271351469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40679 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term40679, term40679.getClass(), "tagName", "");
        setBooleanField(term40679, term40679.getClass(), "isBlock", true);
        setBooleanField(term40679, term40679.getClass(), "formatAsBlock", true);
        setBooleanField(term40679, term40679.getClass(), "canContainInline", true);
        setBooleanField(term40679, term40679.getClass(), "empty", false);
        setBooleanField(term40679, term40679.getClass(), "selfClosing", true);
        setBooleanField(term40679, term40679.getClass(), "preserveWhitespace", true);
        setBooleanField(term40679, term40679.getClass(), "formList", true);
        term40761 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term40761, term40761.getClass(), "tagName", "");
        setBooleanField(term40761, term40761.getClass(), "isBlock", true);
        setBooleanField(term40761, term40761.getClass(), "formatAsBlock", true);
        setBooleanField(term40761, term40761.getClass(), "canContainInline", true);
        setBooleanField(term40761, term40761.getClass(), "empty", false);
        setBooleanField(term40761, term40761.getClass(), "selfClosing", true);
        setBooleanField(term40761, term40761.getClass(), "preserveWhitespace", true);
        setBooleanField(term40761, term40761.getClass(), "formList", true);
        setBooleanField(term40761, term40761.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term40679, args);
        assertTrue(recursiveEquals(term40679, term40761));
        assertTrue(recursiveEquals(retValue, -1635993346));
    }

};


