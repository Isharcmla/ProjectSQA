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

public class Attributes_addAll_643491321494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11602726;
     Object term11602784;

    public Attributes_addAll_643491321494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11602726 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term11602642 = (Object[]) newArray("java.lang.String", 1);
        setIntField(term11602726, term11602726.getClass(), "size", 0);
        setField(term11602726, term11602726.getClass(), "keys", term11602642);
        term11602784 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term11602784, term11602784.getClass(), "size", 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term11602784;
        try {
            callMethod(klass, "addAll", argTypes, term11602726, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


