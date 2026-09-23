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

public class Attributes_get_1185314327467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8799520;
     Object term9294712;

    public Attributes_get_1185314327467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8799520 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8797191 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term8799520, term8799520.getClass(), "size", 10);
        setElement(term8797191, 2, "                                                                ");
        setElement(term8797191, 7, "                                                                                                                                                                                                                                                                ");
        setField(term8799520, term8799520.getClass(), "keys", term8797191);
        term9294712 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term9294714 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term9294712, term9294712.getClass(), "size", 10);
        setElement(term9294714, 2, "                                                                ");
        setElement(term9294714, 7, "                                                                                                                                                                                                                                                                ");
        setField(term9294712, term9294712.getClass(), "keys", term9294714);
        setField(term9294712, term9294712.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "get", argTypes, term8799520, args);
        assertTrue(recursiveEquals(term8799520, term9294712));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


