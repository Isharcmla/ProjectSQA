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
import java.util.ArrayList;

public class Attributes_asList_66401004935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571;
     Object term1663;
     Object term1650;

    public Attributes_asList_66401004935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term572 = new LinkedHashMap();
        term571 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term571, term571.getClass(), "attributes", term572);
        LinkedHashMap term1664 = new LinkedHashMap();
        term1663 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1663, term1663.getClass(), "attributes", term1664);
        ArrayList term1651 = new ArrayList();
        term1650 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term1650, term1650.getClass(), "list", term1651);
        setField(term1650, term1650.getClass(), "c", term1651);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asList", argTypes, term571, args);
        assertTrue(recursiveEquals(term571, term1663));
        assertTrue(recursiveEquals(retValue, term1650));
    }

};


