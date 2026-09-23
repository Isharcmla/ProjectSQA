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

public class ParseSettings_normalizeTag_9006362717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8;
     Object term104;

    public ParseSettings_normalizeTag_9006362717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term8, term8.getClass(), "preserveTagCase", true);
        setBooleanField(term8, term8.getClass(), "preserveAttributeCase", true);
        term104 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term104, term104.getClass(), "preserveTagCase", true);
        setBooleanField(term104, term104.getClass(), "preserveAttributeCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.ParseSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object retValue = callMethod(klass, "normalizeTag", argTypes, term8, args);
        assertTrue(recursiveEquals(term8, term104));
        assertTrue(recursiveEquals(retValue, "PAEBtnZtTD"));
    }

};


