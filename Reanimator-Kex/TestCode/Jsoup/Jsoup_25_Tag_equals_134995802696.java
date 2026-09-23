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

public class Tag_equals_134995802696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7262;
     Object term7308;
     Object term7477;
     Object term7478;

    public Tag_equals_134995802696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7262 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term7262, term7262.getClass(), "canContainBlock", false);
        setBooleanField(term7262, term7262.getClass(), "canContainInline", false);
        setBooleanField(term7262, term7262.getClass(), "empty", true);
        term7308 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term7308, term7308.getClass(), "canContainBlock", false);
        setBooleanField(term7308, term7308.getClass(), "canContainInline", false);
        setBooleanField(term7308, term7308.getClass(), "empty", false);
        term7477 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7477, term7477.getClass(), "tagName", null);
        setBooleanField(term7477, term7477.getClass(), "isBlock", false);
        setBooleanField(term7477, term7477.getClass(), "formatAsBlock", false);
        setBooleanField(term7477, term7477.getClass(), "canContainBlock", false);
        setBooleanField(term7477, term7477.getClass(), "canContainInline", false);
        setBooleanField(term7477, term7477.getClass(), "empty", true);
        setBooleanField(term7477, term7477.getClass(), "selfClosing", false);
        setBooleanField(term7477, term7477.getClass(), "preserveWhitespace", false);
        term7478 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7478, term7478.getClass(), "tagName", null);
        setBooleanField(term7478, term7478.getClass(), "isBlock", false);
        setBooleanField(term7478, term7478.getClass(), "formatAsBlock", false);
        setBooleanField(term7478, term7478.getClass(), "canContainBlock", false);
        setBooleanField(term7478, term7478.getClass(), "canContainInline", false);
        setBooleanField(term7478, term7478.getClass(), "empty", false);
        setBooleanField(term7478, term7478.getClass(), "selfClosing", false);
        setBooleanField(term7478, term7478.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7308;
        Object retValue = callMethod(klass, "equals", argTypes, term7262, args);
        assertTrue(recursiveEquals(term7262, term7477));
        assertTrue(recursiveEquals(term7308, term7478));
        assertTrue(recursiveEquals(retValue, false));
    }

};


