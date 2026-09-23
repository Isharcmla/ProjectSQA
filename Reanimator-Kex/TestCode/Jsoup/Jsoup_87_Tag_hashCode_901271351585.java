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

public class Tag_hashCode_901271351585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50532;
     Object term50614;

    public Tag_hashCode_901271351585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50532 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term50532, term50532.getClass(), "tagName", "");
        setBooleanField(term50532, term50532.getClass(), "isBlock", true);
        setBooleanField(term50532, term50532.getClass(), "formatAsBlock", true);
        setBooleanField(term50532, term50532.getClass(), "canContainInline", true);
        setBooleanField(term50532, term50532.getClass(), "empty", true);
        setBooleanField(term50532, term50532.getClass(), "selfClosing", false);
        setBooleanField(term50532, term50532.getClass(), "preserveWhitespace", true);
        setBooleanField(term50532, term50532.getClass(), "formList", false);
        setBooleanField(term50532, term50532.getClass(), "formSubmit", true);
        term50614 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term50614, term50614.getClass(), "tagName", "");
        setBooleanField(term50614, term50614.getClass(), "isBlock", true);
        setBooleanField(term50614, term50614.getClass(), "formatAsBlock", true);
        setBooleanField(term50614, term50614.getClass(), "canContainInline", true);
        setBooleanField(term50614, term50614.getClass(), "empty", true);
        setBooleanField(term50614, term50614.getClass(), "selfClosing", false);
        setBooleanField(term50614, term50614.getClass(), "preserveWhitespace", true);
        setBooleanField(term50614, term50614.getClass(), "formList", false);
        setBooleanField(term50614, term50614.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term50532, args);
        assertTrue(recursiveEquals(term50532, term50614));
        assertTrue(recursiveEquals(retValue, -1635099646));
    }

};


