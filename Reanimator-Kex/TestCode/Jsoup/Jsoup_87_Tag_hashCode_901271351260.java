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

public class Tag_hashCode_901271351260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22820;
     Object term23029;

    public Tag_hashCode_901271351260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22820 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22820, term22820.getClass(), "tagName", "");
        setBooleanField(term22820, term22820.getClass(), "isBlock", false);
        setBooleanField(term22820, term22820.getClass(), "formatAsBlock", false);
        setBooleanField(term22820, term22820.getClass(), "canContainInline", false);
        setBooleanField(term22820, term22820.getClass(), "empty", false);
        setBooleanField(term22820, term22820.getClass(), "selfClosing", true);
        setBooleanField(term22820, term22820.getClass(), "preserveWhitespace", true);
        term23029 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23029, term23029.getClass(), "tagName", "");
        setBooleanField(term23029, term23029.getClass(), "isBlock", false);
        setBooleanField(term23029, term23029.getClass(), "formatAsBlock", false);
        setBooleanField(term23029, term23029.getClass(), "canContainInline", false);
        setBooleanField(term23029, term23029.getClass(), "empty", false);
        setBooleanField(term23029, term23029.getClass(), "selfClosing", true);
        setBooleanField(term23029, term23029.getClass(), "preserveWhitespace", true);
        setBooleanField(term23029, term23029.getClass(), "formList", false);
        setBooleanField(term23029, term23029.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term22820, args);
        assertTrue(recursiveEquals(term22820, term23029));
        assertTrue(recursiveEquals(retValue, 30752));
    }

};


