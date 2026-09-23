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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ParseSettings_normalizeAttributes_58794925435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5565;
     Object term5623;

    public ParseSettings_normalizeAttributes_58794925435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5565 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term5565, term5565.getClass(), "preserveAttributeCase", false);
        term5623 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5470 = (Object[]) newArray("java.lang.String", 1);
        setIntField(term5623, term5623.getClass(), "size", 2);
        setField(term5623, term5623.getClass(), "keys", term5470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.ParseSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term5623;
        try {
            callMethod(klass, "normalizeAttributes", argTypes, term5565, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


