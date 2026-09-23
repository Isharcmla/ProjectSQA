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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ParseSettings_normalizeAttributes_58794925423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1970;
     Object term2028;

    public ParseSettings_normalizeAttributes_58794925423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1970 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term1970, term1970.getClass(), "preserveAttributeCase", false);
        term2028 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term2028, term2028.getClass(), "size", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.ParseSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term2028;
        try {
            callMethod(klass, "normalizeAttributes", argTypes, term1970, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


