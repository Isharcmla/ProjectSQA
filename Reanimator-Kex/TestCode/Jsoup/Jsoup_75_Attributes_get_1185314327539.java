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

public class Attributes_get_1185314327539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14360882;

    public Attributes_get_1185314327539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14360882 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14356215 = (Object[]) newArray("java.lang.String", 15);
        setIntField(term14360882, term14360882.getClass(), "size", 23);
        setElement(term14356215, 1, " ");
        setElement(term14356215, 3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setElement(term14356215, 6, "");
        setElement(term14356215, 8, "\u0010                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        setField(term14360882, term14360882.getClass(), "keys", term14356215);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\u0010                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ";
        try {
            callMethod(klass, "get", argTypes, term14360882, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


