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

public class Tag_hashCode_901271351411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35707;
     Object term35766;

    public Tag_hashCode_901271351411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35707 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term35707, term35707.getClass(), "tagName", "");
        setBooleanField(term35707, term35707.getClass(), "isBlock", true);
        setBooleanField(term35707, term35707.getClass(), "formatAsBlock", false);
        setBooleanField(term35707, term35707.getClass(), "canContainInline", true);
        setBooleanField(term35707, term35707.getClass(), "empty", false);
        setBooleanField(term35707, term35707.getClass(), "selfClosing", false);
        setBooleanField(term35707, term35707.getClass(), "preserveWhitespace", true);
        setBooleanField(term35707, term35707.getClass(), "formList", true);
        setBooleanField(term35707, term35707.getClass(), "formSubmit", true);
        term35766 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term35766, term35766.getClass(), "tagName", "");
        setBooleanField(term35766, term35766.getClass(), "isBlock", true);
        setBooleanField(term35766, term35766.getClass(), "formatAsBlock", false);
        setBooleanField(term35766, term35766.getClass(), "canContainInline", true);
        setBooleanField(term35766, term35766.getClass(), "empty", false);
        setBooleanField(term35766, term35766.getClass(), "selfClosing", false);
        setBooleanField(term35766, term35766.getClass(), "preserveWhitespace", true);
        setBooleanField(term35766, term35766.getClass(), "formList", true);
        setBooleanField(term35766, term35766.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term35707, args);
        assertTrue(recursiveEquals(term35707, term35766));
        assertTrue(recursiveEquals(retValue, 1771440479));
    }

};


