package org.jsoup.helper;

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
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import org.mockito.Mockito;

public class W3CDom_convert_169597090611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51580;
     Object term51634;
     Object term51475;

    public W3CDom_convert_169597090611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51580 = newInstance(Class.forName("org.jsoup.helper.W3CDom"));
        term51634 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term51634, term51634.getClass(), "location", "        ");
        term51475 = Mockito.mock(Class.forName("org.w3c.dom.Document"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.W3CDom");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document");
        argTypes[1] = Class.forName("org.w3c.dom.Document");
        Object[] args = new Object[2];
        args[0] = term51634;
        args[1] = term51475;
        try {
            callMethod(klass, "convert", argTypes, term51580, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


