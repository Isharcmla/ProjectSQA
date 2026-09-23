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

public class Attributes_hashCode_115439342041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term998;
     Object term3224;

    public Attributes_hashCode_115439342041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term999 = new LinkedHashMap();
        term998 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term998, term998.getClass(), "attributes", term999);
        LinkedHashMap term3225 = new LinkedHashMap();
        term3224 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3224, term3224.getClass(), "attributes", term3225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term998, args);
        assertTrue(recursiveEquals(term998, term3224));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


