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

public class ParseSettings_normalizeAttributes_58794925445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7285;
     Object term7343;

    public ParseSettings_normalizeAttributes_58794925445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7285 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term7285, term7285.getClass(), "preserveAttributeCase", false);
        term7343 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7115 = (Object[]) newArray("java.lang.String", 5);
        setIntField(term7343, term7343.getClass(), "size", 6);
        setElement(term7115, 2, "");
        setField(term7343, term7343.getClass(), "keys", term7115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.ParseSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term7343;
        try {
            callMethod(klass, "normalizeAttributes", argTypes, term7285, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


