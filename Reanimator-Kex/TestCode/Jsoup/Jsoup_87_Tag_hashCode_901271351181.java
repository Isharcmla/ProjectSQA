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

public class Tag_hashCode_901271351181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16177;
     Object term16236;

    public Tag_hashCode_901271351181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16177 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16177, term16177.getClass(), "tagName", "");
        setBooleanField(term16177, term16177.getClass(), "isBlock", false);
        setBooleanField(term16177, term16177.getClass(), "formatAsBlock", true);
        setBooleanField(term16177, term16177.getClass(), "canContainInline", false);
        setBooleanField(term16177, term16177.getClass(), "empty", true);
        setBooleanField(term16177, term16177.getClass(), "selfClosing", false);
        setBooleanField(term16177, term16177.getClass(), "preserveWhitespace", true);
        setBooleanField(term16177, term16177.getClass(), "formList", true);
        term16236 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16236, term16236.getClass(), "tagName", "");
        setBooleanField(term16236, term16236.getClass(), "isBlock", false);
        setBooleanField(term16236, term16236.getClass(), "formatAsBlock", true);
        setBooleanField(term16236, term16236.getClass(), "canContainInline", false);
        setBooleanField(term16236, term16236.getClass(), "empty", true);
        setBooleanField(term16236, term16236.getClass(), "selfClosing", false);
        setBooleanField(term16236, term16236.getClass(), "preserveWhitespace", true);
        setBooleanField(term16236, term16236.getClass(), "formList", true);
        setBooleanField(term16236, term16236.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term16177, args);
        assertTrue(recursiveEquals(term16177, term16236));
        assertTrue(recursiveEquals(retValue, 888428194));
    }

};


