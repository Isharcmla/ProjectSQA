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

public class Attributes_put_180316978555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14393398;

    public Attributes_put_180316978555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14393398 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14392192 = (Object[]) newArray("java.lang.String", 15);
        setIntField(term14393398, term14393398.getClass(), "size", 11);
        setElement(term14392192, 7, "");
        setElement(term14392192, 8, "");
        setElement(term14392192, 9, "");
        setElement(term14392192, 10, "");
        setElement(term14392192, 11, "");
        setElement(term14392192, 12, "");
        setElement(term14392192, 13, "");
        setElement(term14392192, 14, "");
        setField(term14393398, term14393398.getClass(), "keys", term14392192);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = null;
        try {
            callMethod(klass, "put", argTypes, term14393398, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


