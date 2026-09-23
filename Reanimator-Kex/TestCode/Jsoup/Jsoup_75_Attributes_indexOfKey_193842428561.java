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

public class Attributes_indexOfKey_193842428561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14398742;
     Object term14399529;

    public Attributes_indexOfKey_193842428561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14398742 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14396413 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term14398742, term14398742.getClass(), "size", 10);
        setElement(term14396413, 2, "                                                                ");
        setElement(term14396413, 7, "                                                                                                                                                                                                                                                                ");
        setField(term14398742, term14398742.getClass(), "keys", term14396413);
        term14399529 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14399530 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term14399529, term14399529.getClass(), "size", 10);
        setElement(term14399530, 2, "                                                                ");
        setElement(term14399530, 7, "                                                                                                                                                                                                                                                                ");
        setField(term14399529, term14399529.getClass(), "keys", term14399530);
        setField(term14399529, term14399529.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "indexOfKey", argTypes, term14398742, args);
        assertTrue(recursiveEquals(term14398742, term14399529));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


