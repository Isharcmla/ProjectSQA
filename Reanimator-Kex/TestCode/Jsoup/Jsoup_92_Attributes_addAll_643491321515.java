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

public class Attributes_addAll_643491321515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12101417;
     Object term12101477;

    public Attributes_addAll_643491321515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12101417 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term12101255 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term12101417, term12101417.getClass(), "size", -2063594126);
        setField(term12101417, term12101417.getClass(), "keys", term12101255);
        term12101477 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term12101268 = (Object[]) newArray("java.lang.String", 492);
        setIntField(term12101477, term12101477.getClass(), "size", 201681170);
        setField(term12101477, term12101477.getClass(), "keys", term12101268);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term12101477;
        try {
            callMethod(klass, "addAll", argTypes, term12101417, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


