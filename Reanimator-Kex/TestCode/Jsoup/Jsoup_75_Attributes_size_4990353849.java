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

public class Attributes_size_4990353849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term581;
     Object term49462;

    public Attributes_size_4990353849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term581 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term583 = (Object[]) newArray("java.lang.String", 0);
        Object[] term584 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term581, term581.getClass(), "size", 1048535127);
        setField(term581, term581.getClass(), "keys", term583);
        setField(term581, term581.getClass(), "vals", term584);
        term49462 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term49463 = (Object[]) newArray("java.lang.String", 0);
        Object[] term49464 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term49462, term49462.getClass(), "size", 1048535127);
        setField(term49462, term49462.getClass(), "keys", term49463);
        setField(term49462, term49462.getClass(), "vals", term49464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "size", argTypes, term581, args);
        assertTrue(recursiveEquals(term581, term49462));
        assertTrue(recursiveEquals(retValue, 1048535127));
    }

};


