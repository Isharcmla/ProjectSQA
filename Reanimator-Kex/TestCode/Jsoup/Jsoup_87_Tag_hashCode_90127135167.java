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

public class Tag_hashCode_90127135167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3940;
     Object term4022;

    public Tag_hashCode_90127135167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3940 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3940, term3940.getClass(), "tagName", "");
        setBooleanField(term3940, term3940.getClass(), "isBlock", false);
        setBooleanField(term3940, term3940.getClass(), "formatAsBlock", true);
        term4022 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4022, term4022.getClass(), "tagName", "");
        setBooleanField(term4022, term4022.getClass(), "isBlock", false);
        setBooleanField(term4022, term4022.getClass(), "formatAsBlock", true);
        setBooleanField(term4022, term4022.getClass(), "canContainInline", false);
        setBooleanField(term4022, term4022.getClass(), "empty", false);
        setBooleanField(term4022, term4022.getClass(), "selfClosing", false);
        setBooleanField(term4022, term4022.getClass(), "preserveWhitespace", false);
        setBooleanField(term4022, term4022.getClass(), "formList", false);
        setBooleanField(term4022, term4022.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term3940, args);
        assertTrue(recursiveEquals(term3940, term4022));
        assertTrue(recursiveEquals(retValue, 887503681));
    }

};


