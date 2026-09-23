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

public class Attributes_remove_290363942545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14476267;

    public Attributes_remove_290363942545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14476267 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14472940 = (Object[]) newArray("java.lang.String", 28);
        setIntField(term14476267, term14476267.getClass(), "size", 14);
        setElement(term14472940, 1, "                                                 ");
        setElement(term14472940, 3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        setElement(term14472940, 6, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term14472940, 7, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        setElement(term14472940, 10, "          ");
        setElement(term14472940, 12, "                                                                                                          ");
        setElement(term14472940, 13, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term14472940, 14, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term14472940, 15, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term14472940, 16, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term14472940, 17, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term14472940, 18, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term14472940, 19, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term14472940, 20, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term14472940, 21, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term14472940, 22, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term14472940, 23, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term14472940, 24, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term14472940, 25, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term14472940, 26, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term14472940, 27, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setField(term14476267, term14476267.getClass(), "keys", term14472940);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                          ";
        try {
            callMethod(klass, "remove", argTypes, term14476267, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


