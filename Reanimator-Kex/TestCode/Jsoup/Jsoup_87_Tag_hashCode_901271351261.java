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

public class Tag_hashCode_901271351261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22970;
     Object term23052;

    public Tag_hashCode_901271351261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22970 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22970, term22970.getClass(), "tagName", "");
        setBooleanField(term22970, term22970.getClass(), "isBlock", true);
        setBooleanField(term22970, term22970.getClass(), "formatAsBlock", false);
        setBooleanField(term22970, term22970.getClass(), "canContainInline", false);
        setBooleanField(term22970, term22970.getClass(), "empty", true);
        setBooleanField(term22970, term22970.getClass(), "selfClosing", false);
        setBooleanField(term22970, term22970.getClass(), "preserveWhitespace", false);
        setBooleanField(term22970, term22970.getClass(), "formList", false);
        setBooleanField(term22970, term22970.getClass(), "formSubmit", true);
        term23052 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23052, term23052.getClass(), "tagName", "");
        setBooleanField(term23052, term23052.getClass(), "isBlock", true);
        setBooleanField(term23052, term23052.getClass(), "formatAsBlock", false);
        setBooleanField(term23052, term23052.getClass(), "canContainInline", false);
        setBooleanField(term23052, term23052.getClass(), "empty", true);
        setBooleanField(term23052, term23052.getClass(), "selfClosing", false);
        setBooleanField(term23052, term23052.getClass(), "preserveWhitespace", false);
        setBooleanField(term23052, term23052.getClass(), "formList", false);
        setBooleanField(term23052, term23052.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term22970, args);
        assertTrue(recursiveEquals(term22970, term23052));
        assertTrue(recursiveEquals(retValue, 1743733857));
    }

};


