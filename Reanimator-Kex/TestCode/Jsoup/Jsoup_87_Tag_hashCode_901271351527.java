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

public class Tag_hashCode_901271351527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45471;
     Object term45553;

    public Tag_hashCode_901271351527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45471 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term45471, term45471.getClass(), "tagName", "");
        setBooleanField(term45471, term45471.getClass(), "isBlock", true);
        setBooleanField(term45471, term45471.getClass(), "formatAsBlock", false);
        setBooleanField(term45471, term45471.getClass(), "canContainInline", false);
        setBooleanField(term45471, term45471.getClass(), "empty", true);
        setBooleanField(term45471, term45471.getClass(), "selfClosing", false);
        setBooleanField(term45471, term45471.getClass(), "preserveWhitespace", false);
        setBooleanField(term45471, term45471.getClass(), "formList", true);
        setBooleanField(term45471, term45471.getClass(), "formSubmit", true);
        term45553 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term45553, term45553.getClass(), "tagName", "");
        setBooleanField(term45553, term45553.getClass(), "isBlock", true);
        setBooleanField(term45553, term45553.getClass(), "formatAsBlock", false);
        setBooleanField(term45553, term45553.getClass(), "canContainInline", false);
        setBooleanField(term45553, term45553.getClass(), "empty", true);
        setBooleanField(term45553, term45553.getClass(), "selfClosing", false);
        setBooleanField(term45553, term45553.getClass(), "preserveWhitespace", false);
        setBooleanField(term45553, term45553.getClass(), "formList", true);
        setBooleanField(term45553, term45553.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term45471, args);
        assertTrue(recursiveEquals(term45471, term45553));
        assertTrue(recursiveEquals(retValue, 1743733888));
    }

};


