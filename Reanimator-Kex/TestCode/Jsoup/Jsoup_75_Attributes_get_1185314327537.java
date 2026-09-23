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

public class Attributes_get_1185314327537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14355707;

    public Attributes_get_1185314327537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14355707 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14354501 = (Object[]) newArray("java.lang.String", 15);
        setIntField(term14355707, term14355707.getClass(), "size", 11);
        setElement(term14354501, 7, "");
        setElement(term14354501, 8, "");
        setElement(term14354501, 9, "");
        setElement(term14354501, 10, "");
        setElement(term14354501, 11, "");
        setElement(term14354501, 12, "");
        setElement(term14354501, 13, "");
        setElement(term14354501, 14, "");
        setField(term14355707, term14355707.getClass(), "keys", term14354501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "get", argTypes, term14355707, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


