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

public class Attributes_put_28062925373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3126760;
     Object term5322743;
     Object term5313056;

    public Attributes_put_28062925373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3126760 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3125740 = (Object[]) newArray("java.lang.String", 493);
        setIntField(term3126760, term3126760.getClass(), "size", 7);
        setElement(term3125740, 5, "");
        setField(term3126760, term3126760.getClass(), "keys", term3125740);
        term5322743 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5322744 = (Object[]) newArray("java.lang.String", 493);
        setIntField(term5322743, term5322743.getClass(), "size", 7);
        setElement(term5322744, 5, "");
        setField(term5322743, term5322743.getClass(), "keys", term5322744);
        setField(term5322743, term5322743.getClass(), "vals", null);
        term5313056 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5313059 = (Object[]) newArray("java.lang.String", 493);
        setIntField(term5313056, term5313056.getClass(), "size", 7);
        setElement(term5313059, 5, "");
        setField(term5313056, term5313056.getClass(), "keys", term5313059);
        setField(term5313056, term5313056.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = " ";
        args[1] = false;
        Object retValue = callMethod(klass, "put", argTypes, term3126760, args);
        assertTrue(recursiveEquals(term3126760, term5322743));
        assertTrue(recursiveEquals(retValue, term5313056));
    }

};


