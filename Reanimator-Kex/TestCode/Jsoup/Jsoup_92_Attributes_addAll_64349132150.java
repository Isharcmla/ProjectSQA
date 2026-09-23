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
import java.lang.IllegalArgumentException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Attributes_addAll_64349132150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term585;
     Object term589;

    public Attributes_addAll_64349132150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term585 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term587 = (Object[]) newArray("java.lang.String", 0);
        Object[] term588 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term585, term585.getClass(), "size", -655067527);
        setField(term585, term585.getClass(), "keys", term587);
        setField(term585, term585.getClass(), "vals", term588);
        term589 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term591 = (Object[]) newArray("java.lang.String", 0);
        Object[] term592 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term589, term589.getClass(), "size", -6029667);
        setField(term589, term589.getClass(), "keys", term591);
        setField(term589, term589.getClass(), "vals", term592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term589;
        try {
            callMethod(klass, "addAll", argTypes, term585, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


