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

public class Attributes_asList_66401004999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22175;
     Object term22189;
     Object term22186;

    public Attributes_asList_66401004999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22175 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term22175, term22175.getClass(), "attributes", null);
        term22189 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term22189, term22189.getClass(), "attributes", null);
        term22186 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setIntField(term22186, term22186.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asList", argTypes, term22175, args);
        assertTrue(recursiveEquals(term22175, term22189));
        assertTrue(recursiveEquals(retValue, term22186));
    }

};


