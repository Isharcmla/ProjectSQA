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

public class Tag_hashCode_901271351540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46514;
     Object term46716;

    public Tag_hashCode_901271351540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46514 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term46514, term46514.getClass(), "tagName", "");
        setBooleanField(term46514, term46514.getClass(), "isBlock", true);
        setBooleanField(term46514, term46514.getClass(), "formatAsBlock", false);
        setBooleanField(term46514, term46514.getClass(), "canContainInline", true);
        setBooleanField(term46514, term46514.getClass(), "empty", false);
        setBooleanField(term46514, term46514.getClass(), "selfClosing", true);
        setBooleanField(term46514, term46514.getClass(), "preserveWhitespace", false);
        setBooleanField(term46514, term46514.getClass(), "formList", false);
        setBooleanField(term46514, term46514.getClass(), "formSubmit", true);
        term46716 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term46716, term46716.getClass(), "tagName", "");
        setBooleanField(term46716, term46716.getClass(), "isBlock", true);
        setBooleanField(term46716, term46716.getClass(), "formatAsBlock", false);
        setBooleanField(term46716, term46716.getClass(), "canContainInline", true);
        setBooleanField(term46716, term46716.getClass(), "empty", false);
        setBooleanField(term46716, term46716.getClass(), "selfClosing", true);
        setBooleanField(term46716, term46716.getClass(), "preserveWhitespace", false);
        setBooleanField(term46716, term46716.getClass(), "formList", false);
        setBooleanField(term46716, term46716.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term46514, args);
        assertTrue(recursiveEquals(term46514, term46716));
        assertTrue(recursiveEquals(retValue, 1771469278));
    }

};


