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

public class Tag_hashCode_901271351572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49345;
     Object term49555;

    public Tag_hashCode_901271351572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49345 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term49345, term49345.getClass(), "tagName", "");
        setBooleanField(term49345, term49345.getClass(), "isBlock", true);
        setBooleanField(term49345, term49345.getClass(), "formatAsBlock", true);
        setBooleanField(term49345, term49345.getClass(), "canContainInline", true);
        setBooleanField(term49345, term49345.getClass(), "empty", true);
        setBooleanField(term49345, term49345.getClass(), "selfClosing", false);
        setBooleanField(term49345, term49345.getClass(), "preserveWhitespace", true);
        setBooleanField(term49345, term49345.getClass(), "formList", true);
        setBooleanField(term49345, term49345.getClass(), "formSubmit", true);
        term49555 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term49555, term49555.getClass(), "tagName", "");
        setBooleanField(term49555, term49555.getClass(), "isBlock", true);
        setBooleanField(term49555, term49555.getClass(), "formatAsBlock", true);
        setBooleanField(term49555, term49555.getClass(), "canContainInline", true);
        setBooleanField(term49555, term49555.getClass(), "empty", true);
        setBooleanField(term49555, term49555.getClass(), "selfClosing", false);
        setBooleanField(term49555, term49555.getClass(), "preserveWhitespace", true);
        setBooleanField(term49555, term49555.getClass(), "formList", true);
        setBooleanField(term49555, term49555.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term49345, args);
        assertTrue(recursiveEquals(term49345, term49555));
        assertTrue(recursiveEquals(retValue, -1635099615));
    }

};


