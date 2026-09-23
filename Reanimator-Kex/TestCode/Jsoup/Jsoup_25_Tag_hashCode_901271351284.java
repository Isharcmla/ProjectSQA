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

public class Tag_hashCode_901271351284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22535;
     Object term22735;

    public Tag_hashCode_901271351284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22535 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22535, term22535.getClass(), "tagName", "");
        setBooleanField(term22535, term22535.getClass(), "isBlock", true);
        setBooleanField(term22535, term22535.getClass(), "formatAsBlock", true);
        setBooleanField(term22535, term22535.getClass(), "canContainBlock", false);
        setBooleanField(term22535, term22535.getClass(), "canContainInline", true);
        setBooleanField(term22535, term22535.getClass(), "empty", true);
        setBooleanField(term22535, term22535.getClass(), "selfClosing", true);
        setBooleanField(term22535, term22535.getClass(), "preserveWhitespace", true);
        term22735 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22735, term22735.getClass(), "tagName", "");
        setBooleanField(term22735, term22735.getClass(), "isBlock", true);
        setBooleanField(term22735, term22735.getClass(), "formatAsBlock", true);
        setBooleanField(term22735, term22735.getClass(), "canContainBlock", false);
        setBooleanField(term22735, term22735.getClass(), "canContainInline", true);
        setBooleanField(term22735, term22735.getClass(), "empty", true);
        setBooleanField(term22735, term22735.getClass(), "selfClosing", true);
        setBooleanField(term22735, term22735.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term22535, args);
        assertTrue(recursiveEquals(term22535, term22735));
        assertTrue(recursiveEquals(retValue, 916163616));
    }

};


