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

public class Attributes_removeIgnoreCase_122620802446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term503;
     Object term49065;

    public Attributes_removeIgnoreCase_122620802446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term503 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term505 = (Object[]) newArray("java.lang.String", 0);
        Object[] term506 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term503, term503.getClass(), "size", -1685132342);
        setField(term503, term503.getClass(), "keys", term505);
        setField(term503, term503.getClass(), "vals", term506);
        term49065 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term49066 = (Object[]) newArray("java.lang.String", 0);
        Object[] term49067 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term49065, term49065.getClass(), "size", -1685132342);
        setField(term49065, term49065.getClass(), "keys", term49066);
        setField(term49065, term49065.getClass(), "vals", term49067);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hNxWaHcfhY";
        callMethod(klass, "removeIgnoreCase", argTypes, term503, args);
        assertTrue(recursiveEquals(term503, term49065));
    }

};


