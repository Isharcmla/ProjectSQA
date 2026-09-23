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

public class Attributes_get_1185314327584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15626816;

    public Attributes_get_1185314327584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15626816 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term15623489 = (Object[]) newArray("java.lang.String", 28);
        setIntField(term15626816, term15626816.getClass(), "size", 14);
        setElement(term15623489, 1, "                                                 ");
        setElement(term15623489, 3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        setElement(term15623489, 6, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term15623489, 7, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        setElement(term15623489, 10, "          ");
        setElement(term15623489, 12, "                                                                                                          ");
        setElement(term15623489, 13, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term15623489, 14, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term15623489, 15, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term15623489, 16, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term15623489, 17, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term15623489, 18, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term15623489, 19, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term15623489, 20, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term15623489, 21, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term15623489, 22, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term15623489, 23, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term15623489, 24, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term15623489, 25, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term15623489, 26, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term15623489, 27, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setField(term15626816, term15626816.getClass(), "keys", term15623489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                          ";
        try {
            callMethod(klass, "get", argTypes, term15626816, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


