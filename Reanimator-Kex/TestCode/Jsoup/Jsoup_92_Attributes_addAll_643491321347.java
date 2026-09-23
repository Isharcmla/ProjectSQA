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
import java.lang.OutOfMemoryError;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Attributes_addAll_643491321347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5572177;
     Object term5572235;

    public Attributes_addAll_643491321347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5572177 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5572089 = (Object[]) newArray("java.lang.String", 490);
        setIntField(term5572177, term5572177.getClass(), "size", -265);
        setField(term5572177, term5572177.getClass(), "keys", term5572089);
        term5572235 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term5572235, term5572235.getClass(), "size", 2147483400);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term5572235;
        try {
            callMethod(klass, "addAll", argTypes, term5572177, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


