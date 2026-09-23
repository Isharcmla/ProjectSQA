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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;

public class Attributes_get_1185314327531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14343582;
     Object term14344720;

    public Attributes_get_1185314327531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14343582 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14340616 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term14343582, term14343582.getClass(), "size", 15);
        setElement(term14340616, 3, "");
        setElement(term14340616, 4, "");
        setField(term14343582, term14343582.getClass(), "keys", term14340616);
        term14344720 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14344721 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term14344720, term14344720.getClass(), "size", 15);
        setElement(term14344721, 3, "");
        setElement(term14344721, 4, "");
        setField(term14344720, term14344720.getClass(), "keys", term14344721);
        setField(term14344720, term14344720.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "   \u0002                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ";
        Object retValue = callMethod(klass, "get", argTypes, term14343582, args);
        assertTrue(recursiveEquals(term14343582, term14344720));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


