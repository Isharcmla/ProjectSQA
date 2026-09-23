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

public class Attributes_addAll_643491321255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1213489;
     Object term1213547;

    public Attributes_addAll_643491321255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1213489 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term1213404 = (Object[]) newArray("java.lang.String", 242);
        setIntField(term1213489, term1213489.getClass(), "size", -1271758808);
        setField(term1213489, term1213489.getClass(), "keys", term1213404);
        term1213547 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term1213547, term1213547.getClass(), "size", 1677721601);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term1213547;
        try {
            callMethod(klass, "addAll", argTypes, term1213489, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


