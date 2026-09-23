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

public class Tag_hashCode_90127135155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3069;
     Object term3128;

    public Tag_hashCode_90127135155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3069 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3069, term3069.getClass(), "tagName", "");
        setBooleanField(term3069, term3069.getClass(), "isBlock", false);
        setBooleanField(term3069, term3069.getClass(), "formatAsBlock", false);
        setBooleanField(term3069, term3069.getClass(), "canContainInline", true);
        setBooleanField(term3069, term3069.getClass(), "empty", false);
        term3128 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3128, term3128.getClass(), "tagName", "");
        setBooleanField(term3128, term3128.getClass(), "isBlock", false);
        setBooleanField(term3128, term3128.getClass(), "formatAsBlock", false);
        setBooleanField(term3128, term3128.getClass(), "canContainInline", true);
        setBooleanField(term3128, term3128.getClass(), "empty", false);
        setBooleanField(term3128, term3128.getClass(), "selfClosing", false);
        setBooleanField(term3128, term3128.getClass(), "preserveWhitespace", false);
        setBooleanField(term3128, term3128.getClass(), "formList", false);
        setBooleanField(term3128, term3128.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term3069, args);
        assertTrue(recursiveEquals(term3069, term3128));
        assertTrue(recursiveEquals(retValue, 28629151));
    }

};


