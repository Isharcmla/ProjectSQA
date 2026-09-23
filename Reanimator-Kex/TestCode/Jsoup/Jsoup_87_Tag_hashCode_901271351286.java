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

public class Tag_hashCode_901271351286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24986;
     Object term25195;

    public Tag_hashCode_901271351286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24986 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24986, term24986.getClass(), "tagName", "");
        setBooleanField(term24986, term24986.getClass(), "isBlock", true);
        setBooleanField(term24986, term24986.getClass(), "formatAsBlock", true);
        setBooleanField(term24986, term24986.getClass(), "canContainInline", false);
        setBooleanField(term24986, term24986.getClass(), "empty", false);
        setBooleanField(term24986, term24986.getClass(), "selfClosing", true);
        setBooleanField(term24986, term24986.getClass(), "preserveWhitespace", true);
        term25195 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25195, term25195.getClass(), "tagName", "");
        setBooleanField(term25195, term25195.getClass(), "isBlock", true);
        setBooleanField(term25195, term25195.getClass(), "formatAsBlock", true);
        setBooleanField(term25195, term25195.getClass(), "canContainInline", false);
        setBooleanField(term25195, term25195.getClass(), "empty", false);
        setBooleanField(term25195, term25195.getClass(), "selfClosing", true);
        setBooleanField(term25195, term25195.getClass(), "preserveWhitespace", true);
        setBooleanField(term25195, term25195.getClass(), "formList", false);
        setBooleanField(term25195, term25195.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term24986, args);
        assertTrue(recursiveEquals(term24986, term25195));
        assertTrue(recursiveEquals(retValue, -1664622528));
    }

};


