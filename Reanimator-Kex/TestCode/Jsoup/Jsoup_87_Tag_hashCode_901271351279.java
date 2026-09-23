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

public class Tag_hashCode_901271351279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24334;
     Object term24681;

    public Tag_hashCode_901271351279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24334 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24334, term24334.getClass(), "tagName", "");
        setBooleanField(term24334, term24334.getClass(), "isBlock", false);
        setBooleanField(term24334, term24334.getClass(), "formatAsBlock", true);
        setBooleanField(term24334, term24334.getClass(), "canContainInline", true);
        setBooleanField(term24334, term24334.getClass(), "empty", false);
        setBooleanField(term24334, term24334.getClass(), "selfClosing", false);
        setBooleanField(term24334, term24334.getClass(), "preserveWhitespace", false);
        setBooleanField(term24334, term24334.getClass(), "formList", false);
        setBooleanField(term24334, term24334.getClass(), "formSubmit", true);
        term24681 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24681, term24681.getClass(), "tagName", "");
        setBooleanField(term24681, term24681.getClass(), "isBlock", false);
        setBooleanField(term24681, term24681.getClass(), "formatAsBlock", true);
        setBooleanField(term24681, term24681.getClass(), "canContainInline", true);
        setBooleanField(term24681, term24681.getClass(), "empty", false);
        setBooleanField(term24681, term24681.getClass(), "selfClosing", false);
        setBooleanField(term24681, term24681.getClass(), "preserveWhitespace", false);
        setBooleanField(term24681, term24681.getClass(), "formList", false);
        setBooleanField(term24681, term24681.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term24334, args);
        assertTrue(recursiveEquals(term24334, term24681));
        assertTrue(recursiveEquals(retValue, 916132833));
    }

};


