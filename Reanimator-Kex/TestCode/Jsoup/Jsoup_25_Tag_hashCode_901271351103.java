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

public class Tag_hashCode_901271351103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7866;
     Object term7944;

    public Tag_hashCode_901271351103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7866 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7866, term7866.getClass(), "tagName", "");
        setBooleanField(term7866, term7866.getClass(), "isBlock", false);
        setBooleanField(term7866, term7866.getClass(), "formatAsBlock", false);
        setBooleanField(term7866, term7866.getClass(), "canContainBlock", true);
        term7944 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7944, term7944.getClass(), "tagName", "");
        setBooleanField(term7944, term7944.getClass(), "isBlock", false);
        setBooleanField(term7944, term7944.getClass(), "formatAsBlock", false);
        setBooleanField(term7944, term7944.getClass(), "canContainBlock", true);
        setBooleanField(term7944, term7944.getClass(), "canContainInline", false);
        setBooleanField(term7944, term7944.getClass(), "empty", false);
        setBooleanField(term7944, term7944.getClass(), "selfClosing", false);
        setBooleanField(term7944, term7944.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term7866, args);
        assertTrue(recursiveEquals(term7866, term7944));
        assertTrue(recursiveEquals(retValue, 923521));
    }

};


