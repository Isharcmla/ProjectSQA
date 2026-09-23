package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Attributes_put_28062925559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14511563;

    public Attributes_put_28062925559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14511563 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14510282 = (Object[]) newArray("java.lang.String", 11);
        setIntField(term14511563, term14511563.getClass(), "size", 4);
        setElement(term14510282, 3, "  ");
        setElement(term14510282, 4, "  ");
        setElement(term14510282, 5, "  ");
        setElement(term14510282, 6, "  ");
        setElement(term14510282, 7, "  ");
        setElement(term14510282, 8, "  ");
        setElement(term14510282, 9, "  ");
        setElement(term14510282, 10, "  ");
        setField(term14511563, term14511563.getClass(), "keys", term14510282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "  ";
        args[1] = false;
        try {
            callMethod(klass, "put", argTypes, term14511563, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


