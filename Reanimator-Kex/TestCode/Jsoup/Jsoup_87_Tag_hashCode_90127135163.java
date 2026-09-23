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

public class Tag_hashCode_90127135163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3688;
     Object term3770;

    public Tag_hashCode_90127135163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3688 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3688, term3688.getClass(), "tagName", "");
        setBooleanField(term3688, term3688.getClass(), "isBlock", false);
        setBooleanField(term3688, term3688.getClass(), "formatAsBlock", false);
        setBooleanField(term3688, term3688.getClass(), "canContainInline", true);
        setBooleanField(term3688, term3688.getClass(), "empty", true);
        setBooleanField(term3688, term3688.getClass(), "selfClosing", false);
        setBooleanField(term3688, term3688.getClass(), "preserveWhitespace", true);
        term3770 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3770, term3770.getClass(), "tagName", "");
        setBooleanField(term3770, term3770.getClass(), "isBlock", false);
        setBooleanField(term3770, term3770.getClass(), "formatAsBlock", false);
        setBooleanField(term3770, term3770.getClass(), "canContainInline", true);
        setBooleanField(term3770, term3770.getClass(), "empty", true);
        setBooleanField(term3770, term3770.getClass(), "selfClosing", false);
        setBooleanField(term3770, term3770.getClass(), "preserveWhitespace", true);
        setBooleanField(term3770, term3770.getClass(), "formList", false);
        setBooleanField(term3770, term3770.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term3688, args);
        assertTrue(recursiveEquals(term3688, term3770));
        assertTrue(recursiveEquals(retValue, 29553633));
    }

};


