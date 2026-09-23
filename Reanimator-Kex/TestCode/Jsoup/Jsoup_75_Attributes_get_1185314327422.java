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

public class Attributes_get_1185314327422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7539040;
     Object term8614286;

    public Attributes_get_1185314327422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7539040 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7537688 = (Object[]) newArray("java.lang.String", 11);
        setIntField(term7539040, term7539040.getClass(), "size", 6);
        setElement(term7537688, 1, " ");
        setElement(term7537688, 5, "");
        setElement(term7537688, 6, "");
        setElement(term7537688, 7, "");
        setElement(term7537688, 8, "");
        setElement(term7537688, 9, "");
        setElement(term7537688, 10, "");
        setField(term7539040, term7539040.getClass(), "keys", term7537688);
        term8614286 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8614344 = (Object[]) newArray("java.lang.String", 11);
        setIntField(term8614286, term8614286.getClass(), "size", 6);
        setElement(term8614344, 1, " ");
        setElement(term8614344, 5, "");
        setElement(term8614344, 6, "");
        setElement(term8614344, 7, "");
        setElement(term8614344, 8, "");
        setElement(term8614344, 9, "");
        setElement(term8614344, 10, "");
        setField(term8614286, term8614286.getClass(), "keys", term8614344);
        setField(term8614286, term8614286.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                ";
        Object retValue = callMethod(klass, "get", argTypes, term7539040, args);
        assertTrue(recursiveEquals(term7539040, term8614286));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


