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

public class Attributes_getIgnoreCase_24560085180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476500;
     Object term530510;

    public Attributes_getIgnoreCase_24560085180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term476500 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term476429 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term476500, term476500.getClass(), "size", 1);
        setField(term476500, term476500.getClass(), "keys", term476429);
        term530510 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term530511 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term530510, term530510.getClass(), "size", 1);
        setField(term530510, term530510.getClass(), "keys", term530511);
        setField(term530510, term530510.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getIgnoreCase", argTypes, term476500, args);
        assertTrue(recursiveEquals(term476500, term530510));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


