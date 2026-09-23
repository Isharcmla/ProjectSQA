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

public class ParseSettings_preserveTagCase_9839783385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term69;

    public ParseSettings_preserveTagCase_9839783385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term1, term1.getClass(), "preserveTagCase", false);
        setBooleanField(term1, term1.getClass(), "preserveAttributeCase", false);
        term69 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term69, term69.getClass(), "preserveTagCase", false);
        setBooleanField(term69, term69.getClass(), "preserveAttributeCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.ParseSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "preserveTagCase", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term69));
    }

};


