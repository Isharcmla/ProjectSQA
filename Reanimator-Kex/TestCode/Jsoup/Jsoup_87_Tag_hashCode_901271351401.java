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

public class Tag_hashCode_901271351401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34682;
     Object term35035;

    public Tag_hashCode_901271351401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34682 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term34682, term34682.getClass(), "tagName", "");
        setBooleanField(term34682, term34682.getClass(), "isBlock", false);
        setBooleanField(term34682, term34682.getClass(), "formatAsBlock", false);
        setBooleanField(term34682, term34682.getClass(), "canContainInline", true);
        setBooleanField(term34682, term34682.getClass(), "empty", false);
        setBooleanField(term34682, term34682.getClass(), "selfClosing", true);
        setBooleanField(term34682, term34682.getClass(), "preserveWhitespace", true);
        setBooleanField(term34682, term34682.getClass(), "formList", false);
        setBooleanField(term34682, term34682.getClass(), "formSubmit", true);
        term35035 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term35035, term35035.getClass(), "tagName", "");
        setBooleanField(term35035, term35035.getClass(), "isBlock", false);
        setBooleanField(term35035, term35035.getClass(), "formatAsBlock", false);
        setBooleanField(term35035, term35035.getClass(), "canContainInline", true);
        setBooleanField(term35035, term35035.getClass(), "empty", false);
        setBooleanField(term35035, term35035.getClass(), "selfClosing", true);
        setBooleanField(term35035, term35035.getClass(), "preserveWhitespace", true);
        setBooleanField(term35035, term35035.getClass(), "formList", false);
        setBooleanField(term35035, term35035.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term34682, args);
        assertTrue(recursiveEquals(term34682, term35035));
        assertTrue(recursiveEquals(retValue, 28659904));
    }

};


