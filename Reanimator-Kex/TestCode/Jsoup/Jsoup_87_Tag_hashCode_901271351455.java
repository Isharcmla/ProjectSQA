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

public class Tag_hashCode_901271351455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39471;
     Object term39553;

    public Tag_hashCode_901271351455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39471 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term39471, term39471.getClass(), "tagName", "");
        setBooleanField(term39471, term39471.getClass(), "isBlock", false);
        setBooleanField(term39471, term39471.getClass(), "formatAsBlock", true);
        setBooleanField(term39471, term39471.getClass(), "canContainInline", true);
        setBooleanField(term39471, term39471.getClass(), "empty", false);
        setBooleanField(term39471, term39471.getClass(), "selfClosing", true);
        setBooleanField(term39471, term39471.getClass(), "preserveWhitespace", true);
        setBooleanField(term39471, term39471.getClass(), "formList", true);
        setBooleanField(term39471, term39471.getClass(), "formSubmit", true);
        term39553 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term39553, term39553.getClass(), "tagName", "");
        setBooleanField(term39553, term39553.getClass(), "isBlock", false);
        setBooleanField(term39553, term39553.getClass(), "formatAsBlock", true);
        setBooleanField(term39553, term39553.getClass(), "canContainInline", true);
        setBooleanField(term39553, term39553.getClass(), "empty", false);
        setBooleanField(term39553, term39553.getClass(), "selfClosing", true);
        setBooleanField(term39553, term39553.getClass(), "preserveWhitespace", true);
        setBooleanField(term39553, term39553.getClass(), "formList", true);
        setBooleanField(term39553, term39553.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term39471, args);
        assertTrue(recursiveEquals(term39471, term39553));
        assertTrue(recursiveEquals(retValue, 916163616));
    }

};


