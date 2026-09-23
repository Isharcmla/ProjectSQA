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

public class Attributes_clone_1156168700149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3029467;
     Object term3029651;
     Object term3029644;

    public Attributes_clone_1156168700149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term3029527 = new LinkedHashMap();
        term3029467 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3029467, term3029467.getClass(), "attributes", term3029527);
        LinkedHashMap term3029652 = new LinkedHashMap();
        term3029651 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3029651, term3029651.getClass(), "attributes", term3029652);
        LinkedHashMap term3029645 = new LinkedHashMap();
        term3029644 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3029644, term3029644.getClass(), "attributes", term3029645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term3029467, args);
        assertTrue(recursiveEquals(term3029467, term3029651));
        assertTrue(recursiveEquals(retValue, term3029644));
    }

};


