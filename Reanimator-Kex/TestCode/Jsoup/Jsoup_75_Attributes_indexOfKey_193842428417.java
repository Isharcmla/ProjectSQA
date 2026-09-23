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

public class Attributes_indexOfKey_193842428417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7535936;
     Object term8502970;

    public Attributes_indexOfKey_193842428417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7535936 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7535234 = (Object[]) newArray("java.lang.String", 499);
        setIntField(term7535936, term7535936.getClass(), "size", 11);
        setField(term7535936, term7535936.getClass(), "keys", term7535234);
        term8502970 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8502971 = (Object[]) newArray("java.lang.String", 499);
        setIntField(term8502970, term8502970.getClass(), "size", 11);
        setField(term8502970, term8502970.getClass(), "keys", term8502971);
        setField(term8502970, term8502970.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "indexOfKey", argTypes, term7535936, args);
        assertTrue(recursiveEquals(term7535936, term8502970));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


