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

public class Tag_hashCode_901271351461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39986;
     Object term40068;

    public Tag_hashCode_901271351461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39986 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term39986, term39986.getClass(), "tagName", "");
        setBooleanField(term39986, term39986.getClass(), "isBlock", false);
        setBooleanField(term39986, term39986.getClass(), "formatAsBlock", true);
        setBooleanField(term39986, term39986.getClass(), "canContainInline", true);
        setBooleanField(term39986, term39986.getClass(), "empty", true);
        setBooleanField(term39986, term39986.getClass(), "selfClosing", false);
        setBooleanField(term39986, term39986.getClass(), "preserveWhitespace", false);
        setBooleanField(term39986, term39986.getClass(), "formList", false);
        setBooleanField(term39986, term39986.getClass(), "formSubmit", true);
        term40068 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term40068, term40068.getClass(), "tagName", "");
        setBooleanField(term40068, term40068.getClass(), "isBlock", false);
        setBooleanField(term40068, term40068.getClass(), "formatAsBlock", true);
        setBooleanField(term40068, term40068.getClass(), "canContainInline", true);
        setBooleanField(term40068, term40068.getClass(), "empty", true);
        setBooleanField(term40068, term40068.getClass(), "selfClosing", false);
        setBooleanField(term40068, term40068.getClass(), "preserveWhitespace", false);
        setBooleanField(term40068, term40068.getClass(), "formList", false);
        setBooleanField(term40068, term40068.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term39986, args);
        assertTrue(recursiveEquals(term39986, term40068));
        assertTrue(recursiveEquals(retValue, 917056354));
    }

};


