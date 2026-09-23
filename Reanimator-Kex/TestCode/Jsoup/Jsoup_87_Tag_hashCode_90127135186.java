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

public class Tag_hashCode_90127135186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5767;
     Object term5968;

    public Tag_hashCode_90127135186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5767 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5767, term5767.getClass(), "tagName", "");
        setBooleanField(term5767, term5767.getClass(), "isBlock", false);
        setBooleanField(term5767, term5767.getClass(), "formatAsBlock", false);
        setBooleanField(term5767, term5767.getClass(), "canContainInline", true);
        setBooleanField(term5767, term5767.getClass(), "empty", false);
        setBooleanField(term5767, term5767.getClass(), "selfClosing", false);
        setBooleanField(term5767, term5767.getClass(), "preserveWhitespace", true);
        term5968 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5968, term5968.getClass(), "tagName", "");
        setBooleanField(term5968, term5968.getClass(), "isBlock", false);
        setBooleanField(term5968, term5968.getClass(), "formatAsBlock", false);
        setBooleanField(term5968, term5968.getClass(), "canContainInline", true);
        setBooleanField(term5968, term5968.getClass(), "empty", false);
        setBooleanField(term5968, term5968.getClass(), "selfClosing", false);
        setBooleanField(term5968, term5968.getClass(), "preserveWhitespace", true);
        setBooleanField(term5968, term5968.getClass(), "formList", false);
        setBooleanField(term5968, term5968.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term5767, args);
        assertTrue(recursiveEquals(term5767, term5968));
        assertTrue(recursiveEquals(retValue, 28630112));
    }

};


