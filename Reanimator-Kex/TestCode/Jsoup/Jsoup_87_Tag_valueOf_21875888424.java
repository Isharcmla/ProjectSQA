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

public class Tag_valueOf_21875888424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term986;

    public Tag_valueOf_21875888424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term986 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term986, term986.getClass(), "tagName", "xxtlPwDYFs");
        setBooleanField(term986, term986.getClass(), "isBlock", false);
        setBooleanField(term986, term986.getClass(), "formatAsBlock", true);
        setBooleanField(term986, term986.getClass(), "canContainInline", true);
        setBooleanField(term986, term986.getClass(), "empty", false);
        setBooleanField(term986, term986.getClass(), "selfClosing", false);
        setBooleanField(term986, term986.getClass(), "preserveWhitespace", false);
        setBooleanField(term986, term986.getClass(), "formList", false);
        setBooleanField(term986, term986.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xxtlPwDYFs";
        Object retValue = callMethod(klass, "valueOf", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term986));
    }

};


