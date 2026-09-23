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

public class Tag_hashCode_901271351191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16939;
     Object term16998;

    public Tag_hashCode_901271351191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16939 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16939, term16939.getClass(), "tagName", "");
        setBooleanField(term16939, term16939.getClass(), "isBlock", true);
        setBooleanField(term16939, term16939.getClass(), "formatAsBlock", true);
        setBooleanField(term16939, term16939.getClass(), "canContainInline", true);
        term16998 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16998, term16998.getClass(), "tagName", "");
        setBooleanField(term16998, term16998.getClass(), "isBlock", true);
        setBooleanField(term16998, term16998.getClass(), "formatAsBlock", true);
        setBooleanField(term16998, term16998.getClass(), "canContainInline", true);
        setBooleanField(term16998, term16998.getClass(), "empty", false);
        setBooleanField(term16998, term16998.getClass(), "selfClosing", false);
        setBooleanField(term16998, term16998.getClass(), "preserveWhitespace", false);
        setBooleanField(term16998, term16998.getClass(), "formList", false);
        setBooleanField(term16998, term16998.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term16939, args);
        assertTrue(recursiveEquals(term16939, term16998));
        assertTrue(recursiveEquals(retValue, -1636024129));
    }

};


