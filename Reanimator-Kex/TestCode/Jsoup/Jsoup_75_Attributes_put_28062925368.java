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

public class Attributes_put_28062925368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3116705;
     Object term5096985;
     Object term5096847;

    public Attributes_put_28062925368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3116705 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3115352 = (Object[]) newArray("java.lang.String", 11);
        setIntField(term3116705, term3116705.getClass(), "size", 6);
        setElement(term3115352, 1, " ");
        setElement(term3115352, 5, "");
        setElement(term3115352, 6, "");
        setElement(term3115352, 7, "");
        setElement(term3115352, 8, "");
        setElement(term3115352, 9, "");
        setElement(term3115352, 10, "");
        setField(term3116705, term3116705.getClass(), "keys", term3115352);
        term5096985 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5096986 = (Object[]) newArray("java.lang.String", 11);
        setIntField(term5096985, term5096985.getClass(), "size", 6);
        setElement(term5096986, 1, " ");
        setElement(term5096986, 5, "");
        setElement(term5096986, 6, "");
        setElement(term5096986, 7, "");
        setElement(term5096986, 8, "");
        setElement(term5096986, 9, "");
        setElement(term5096986, 10, "");
        setField(term5096985, term5096985.getClass(), "keys", term5096986);
        setField(term5096985, term5096985.getClass(), "vals", null);
        term5096847 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5096849 = (Object[]) newArray("java.lang.String", 11);
        setIntField(term5096847, term5096847.getClass(), "size", 6);
        setElement(term5096849, 1, " ");
        setElement(term5096849, 5, "");
        setElement(term5096849, 6, "");
        setElement(term5096849, 7, "");
        setElement(term5096849, 8, "");
        setElement(term5096849, 9, "");
        setElement(term5096849, 10, "");
        setField(term5096847, term5096847.getClass(), "keys", term5096849);
        setField(term5096847, term5096847.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "                                ";
        args[1] = false;
        Object retValue = callMethod(klass, "put", argTypes, term3116705, args);
        assertTrue(recursiveEquals(term3116705, term5096985));
        assertTrue(recursiveEquals(retValue, term5096847));
    }

};


