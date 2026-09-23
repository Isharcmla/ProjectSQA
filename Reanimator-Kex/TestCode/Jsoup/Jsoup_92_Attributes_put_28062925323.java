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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;

public class Attributes_put_28062925323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5280502;
     Object term5305680;
     Object term5305646;

    public Attributes_put_28062925323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5280502 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5276664 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term5280502, term5280502.getClass(), "size", 8);
        setElement(term5276664, 2, " ");
        setElement(term5276664, 4, "                    ");
        setElement(term5276664, 6, "  ");
        setField(term5280502, term5280502.getClass(), "keys", term5276664);
        term5305680 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5305681 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term5305680, term5305680.getClass(), "size", 8);
        setElement(term5305681, 2, " ");
        setElement(term5305681, 4, "                    ");
        setElement(term5305681, 6, "  ");
        setField(term5305680, term5305680.getClass(), "keys", term5305681);
        setField(term5305680, term5305680.getClass(), "vals", null);
        term5305646 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5305648 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term5305646, term5305646.getClass(), "size", 8);
        setElement(term5305648, 2, " ");
        setElement(term5305648, 4, "                    ");
        setElement(term5305648, 6, "  ");
        setField(term5305646, term5305646.getClass(), "keys", term5305648);
        setField(term5305646, term5305646.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "                                                 ";
        args[1] = false;
        Object retValue = callMethod(klass, "put", argTypes, term5280502, args);
        assertTrue(recursiveEquals(term5280502, term5305680));
        assertTrue(recursiveEquals(retValue, term5305646));
    }

};


