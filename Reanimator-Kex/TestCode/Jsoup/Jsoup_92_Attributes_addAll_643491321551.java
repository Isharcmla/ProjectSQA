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

public class Attributes_addAll_643491321551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14504368;
     Object term14504426;

    public Attributes_addAll_643491321551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14504368 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14504267 = (Object[]) newArray("java.lang.String", 0);
        Object[] term14504270 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term14504368, term14504368.getClass(), "size", -1012924416);
        setField(term14504368, term14504368.getClass(), "keys", term14504267);
        setField(term14504368, term14504368.getClass(), "vals", term14504270);
        term14504426 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term14504426, term14504426.getClass(), "size", 1012924420);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term14504426;
        try {
            callMethod(klass, "addAll", argTypes, term14504368, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


