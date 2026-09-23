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

public class Attributes_clone_1156168700105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2019614;
     Object term2019798;
     Object term2019791;

    public Attributes_clone_1156168700105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term2019674 = new LinkedHashMap();
        term2019614 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2019614, term2019614.getClass(), "attributes", term2019674);
        LinkedHashMap term2019799 = new LinkedHashMap();
        term2019798 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2019798, term2019798.getClass(), "attributes", term2019799);
        LinkedHashMap term2019792 = new LinkedHashMap();
        term2019791 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2019791, term2019791.getClass(), "attributes", term2019792);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term2019614, args);
        assertTrue(recursiveEquals(term2019614, term2019798));
        assertTrue(recursiveEquals(retValue, term2019791));
    }

};


