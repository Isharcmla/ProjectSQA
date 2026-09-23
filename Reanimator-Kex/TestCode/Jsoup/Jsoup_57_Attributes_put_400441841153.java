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

public class Attributes_put_400441841153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3030586;
     Object term3030716;
     Object term3030730;
     Object term3030735;

    public Attributes_put_400441841153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term3030646 = new LinkedHashMap();
        term3030586 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3030586, term3030586.getClass(), "attributes", term3030646);
        term3030716 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        LinkedHashMap term3030731 = new LinkedHashMap();
        term3030730 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3030730, term3030730.getClass(), "attributes", term3030731);
        term3030735 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term3030735, term3030735.getClass(), "key", null);
        setField(term3030735, term3030735.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attribute");
        Object[] args = new Object[1];
        args[0] = term3030716;
        callMethod(klass, "put", argTypes, term3030586, args);
        assertTrue(recursiveEquals(term3030586, term3030730));
        assertTrue(recursiveEquals(term3030716, term3030735));
    }

};


