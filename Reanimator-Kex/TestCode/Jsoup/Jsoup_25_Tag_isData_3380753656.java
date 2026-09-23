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

public class Tag_isData_3380753656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3742;
     Object term3761;

    public Tag_isData_3380753656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3742 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term3742, term3742.getClass(), "canContainInline", false);
        term3761 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3761, term3761.getClass(), "tagName", null);
        setBooleanField(term3761, term3761.getClass(), "isBlock", false);
        setBooleanField(term3761, term3761.getClass(), "formatAsBlock", false);
        setBooleanField(term3761, term3761.getClass(), "canContainBlock", false);
        setBooleanField(term3761, term3761.getClass(), "canContainInline", false);
        setBooleanField(term3761, term3761.getClass(), "empty", false);
        setBooleanField(term3761, term3761.getClass(), "selfClosing", false);
        setBooleanField(term3761, term3761.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isData", argTypes, term3742, args);
        assertTrue(recursiveEquals(term3742, term3761));
        assertTrue(recursiveEquals(retValue, true));
    }

};


