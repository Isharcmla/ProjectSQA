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
import java.util.LinkedHashMap;

public class Attributes_clone_115616870077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16580;
     Object term17280;
     Object term17273;

    public Attributes_clone_115616870077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term16640 = new LinkedHashMap();
        term16580 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term16580, term16580.getClass(), "attributes", term16640);
        LinkedHashMap term17281 = new LinkedHashMap();
        term17280 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term17280, term17280.getClass(), "attributes", term17281);
        LinkedHashMap term17274 = new LinkedHashMap();
        term17273 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term17273, term17273.getClass(), "attributes", term17274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term16580, args);
        assertTrue(recursiveEquals(term16580, term17280));
        assertTrue(recursiveEquals(retValue, term17273));
    }

};


