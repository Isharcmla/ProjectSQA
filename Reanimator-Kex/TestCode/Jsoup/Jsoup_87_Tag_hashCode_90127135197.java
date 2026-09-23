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

public class Tag_hashCode_90127135197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6747;
     Object term6806;

    public Tag_hashCode_90127135197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6747 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6747, term6747.getClass(), "tagName", "");
        setBooleanField(term6747, term6747.getClass(), "isBlock", false);
        setBooleanField(term6747, term6747.getClass(), "formatAsBlock", false);
        setBooleanField(term6747, term6747.getClass(), "canContainInline", true);
        setBooleanField(term6747, term6747.getClass(), "empty", true);
        setBooleanField(term6747, term6747.getClass(), "selfClosing", false);
        setBooleanField(term6747, term6747.getClass(), "preserveWhitespace", false);
        setBooleanField(term6747, term6747.getClass(), "formList", true);
        setBooleanField(term6747, term6747.getClass(), "formSubmit", true);
        term6806 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6806, term6806.getClass(), "tagName", "");
        setBooleanField(term6806, term6806.getClass(), "isBlock", false);
        setBooleanField(term6806, term6806.getClass(), "formatAsBlock", false);
        setBooleanField(term6806, term6806.getClass(), "canContainInline", true);
        setBooleanField(term6806, term6806.getClass(), "empty", true);
        setBooleanField(term6806, term6806.getClass(), "selfClosing", false);
        setBooleanField(term6806, term6806.getClass(), "preserveWhitespace", false);
        setBooleanField(term6806, term6806.getClass(), "formList", true);
        setBooleanField(term6806, term6806.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term6747, args);
        assertTrue(recursiveEquals(term6747, term6806));
        assertTrue(recursiveEquals(retValue, 29552704));
    }

};


